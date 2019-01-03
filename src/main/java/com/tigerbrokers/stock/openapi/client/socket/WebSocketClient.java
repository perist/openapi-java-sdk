package com.tigerbrokers.stock.openapi.client.socket;

import com.tigerbrokers.stock.openapi.client.constant.ReqProtocolType;
import com.tigerbrokers.stock.openapi.client.struct.enums.QuoteSubject;
import com.tigerbrokers.stock.openapi.client.struct.enums.Subject;
import com.tigerbrokers.stock.openapi.client.util.ApiLogger;
import com.tigerbrokers.stock.openapi.client.util.StompMessageUtil;
import com.tigerbrokers.stock.openapi.client.util.StringUtils;
import com.tigerbrokers.stock.openapi.client.websocket.WebSocketHandshakerHandler;
import com.tigerbrokers.stock.openapi.client.websocket.WebSocketStompFrameDecoder;
import com.tigerbrokers.stock.openapi.client.websocket.WebSocketStompFrameEncoder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelPromise;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshakerFactory;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import io.netty.handler.codec.stomp.StompFrame;
import io.netty.handler.codec.stomp.StompHeaders;
import io.netty.handler.codec.stomp.StompSubframeAggregator;
import io.netty.handler.codec.stomp.StompSubframeDecoder;
import io.netty.handler.codec.stomp.StompSubframeEncoder;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.internal.ConcurrentSet;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description:
 * Created by lijiawen on 2018/05/16.
 */
public class WebSocketClient implements SubscribeAsyncApi {

  private String url;
  private ApiAuthentication authentication;
  private ApiComposeCallback apiComposeCallback;
  private Set<Subject> subscribeList = new CopyOnWriteArraySet<>();
  private Set<String> subscribeSymbols = new ConcurrentSet<>();

  private EventLoopGroup group = null;
  private Bootstrap bootstrap = null;
  private Channel channel = null;
  private ChannelFuture future = null;

  private boolean inited = false;
  private volatile ScheduledFuture<?> reconnectExecutorFuture = null;
  private static final ScheduledThreadPoolExecutor reconnectExecutorService = new ScheduledThreadPoolExecutor(2);

  private long lastConnectedTime = System.currentTimeMillis();
  private AtomicInteger reconnectCount = new AtomicInteger(0);
  private AtomicBoolean reconnectErrorLogFlag = new AtomicBoolean(false);

  private static final int CONNECT_TIMEOUT = 3000;
  private static final long SHUTDOWN_TIMEOUT = 1000 * 60 * 15;
  private static final int RECONNECT_WARNING_PERIOD = 1800;

  public WebSocketClient(String url, ApiAuthentication authentication, ApiComposeCallback apiComposeCallback) {
    this.url = url;
    this.authentication = authentication;
    this.apiComposeCallback = apiComposeCallback;
    init();
  }

  private void init() {
    InetSocketAddress address = getServerAddress();
    if (address == null) {
      throw new RuntimeException("get connect address error.");
    }
    group = new NioEventLoopGroup(1);
    bootstrap = new Bootstrap();


    final int port = address.getPort();
    bootstrap.group(group).option(ChannelOption.TCP_NODELAY, true)
        .channel(NioSocketChannel.class)
        .handler(new ChannelInitializer<SocketChannel>() {
          protected void initChannel(SocketChannel ch) throws SSLException {
            ChannelPipeline p = ch.pipeline();
            SslContext sslCtx =
                SslContextBuilder.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build();
            p.addLast(sslCtx.newHandler(ch.alloc(), address.getHostName(), address.getPort()));
            if (8885 == port){
              p.addLast("websocket_codec", new HttpClientCodec());
              p.addLast("websocket_aggregator", new HttpObjectAggregator(65535));
              p.addLast( "websocket-stomp-decoder", new WebSocketStompFrameDecoder() );
              p.addLast( "websocket-stomp-encoder", new WebSocketStompFrameEncoder() );
              p.addLast("stomp_aggregator", new StompSubframeAggregator(65535));
              //p.addLast("handshaker_handler", webSocketHandshakerHandler); add by doconnect()

            }else{
              final WebSocketHandler handler = new WebSocketHandler(authentication, apiComposeCallback);

              p.addLast("stompEncoder", new StompSubframeEncoder());
              p.addLast("stompDecoder", new StompSubframeDecoder());
              p.addLast("aggregator", new StompSubframeAggregator(65535));
              p.addLast("webSocketHandler", handler);
            }

          }
        });

    apiComposeCallback.client(this);
    inited = true;
  }

  public void connect() {
    try {
      if (isConnected()) {
        return;
      }
      initReconnectCommand();
      doConnect();
      if (!isConnected()) {
        throw new Exception("Failed connect to server.");
      }
      logger.info("Success connect to server, channel is: {}", channel);

      reconnectCount.set(0);
      reconnectErrorLogFlag.set(false);
    } catch (Throwable e) {
      logger.error("Failed connect to server, cause: ", e);
    }
  }

  private void doConnect() {
    try {
      long start = System.currentTimeMillis();
      if (!inited) {
        init();
      }
      InetSocketAddress address = getServerAddress();
      if (address == null) {
        throw new RuntimeException("get connect address error.");
      }

      future = bootstrap.connect(address).sync();
      boolean completed = future.awaitUninterruptibly(CONNECT_TIMEOUT, TimeUnit.MILLISECONDS);

      if (completed && future.isSuccess()) {
        Channel newChannel = future.channel();
        URI uri = null;
        try {
          uri = new URI(url);
          Channel oldChannel = this.channel;
          if (oldChannel != null) {
            logger.info("close old netty channel:{} , create new netty channel:{} ", oldChannel, newChannel);
            oldChannel.close();
          }
        } finally {
          this.channel = newChannel;
          if (address.getPort() == 8885){
            synchronized (this.channel){
              WebSocketHandshakerHandler webSocketHandshakerHandler = new WebSocketHandshakerHandler(authentication, apiComposeCallback, async, orderNoBarrier, orderIdPassport);
              HttpHeaders httpHeaders = new DefaultHttpHeaders();
              WebSocketClientHandshaker
                  handshaker = WebSocketClientHandshakerFactory.newHandshaker(uri, WebSocketVersion.V13, null, true, httpHeaders);
              webSocketHandshakerHandler.setHandshaker(handshaker);
              channel.pipeline().addLast("handshaker_handler", webSocketHandshakerHandler);
              webSocketHandshakerHandler.setHandshaker(handshaker);
              ChannelPromise channelFuture = (ChannelPromise)handshaker.handshake(this.channel);
              channelFuture.sync();
            }
          }
        }
      } else if (future.cause() != null) {
        throw new Exception("client failed to connect to server, error message is:" + future.cause().getMessage(),
            future.cause());
      } else {
        throw new Exception(
            "client failed to connect to server, client-side timeout: " + (System.currentTimeMillis() - start) + "ms ");
      }
    } catch (Exception e) {
      logger.error("client failed to connect to server: ", e);
    } finally {
      if (!isConnected()) {
        future.cancel(true);
      }
    }
  }

  private InetSocketAddress getServerAddress() {
    if (StringUtils.isEmpty(url)) {
      logger.error("url is empty.");
      return null;
    }
    URI uri;
    try {
      uri = new URI(url);
    } catch (URISyntaxException e) {
      logger.error("uri syntax exception:", e);
      return null;
    }
    return new InetSocketAddress(uri.getHost(), uri.getPort());
  }

  public void disconnect() {
    destroyConnectCommand();
    try {
      if (channel != null) {
        channel.close();
      }
    } catch (Throwable e) {
      logger.warn(e.getMessage(), e);
    }

    try {
      group.shutdownGracefully();
    } catch (Throwable t) {
      logger.warn(t.getMessage());
    } finally {
      inited = false;
    }
  }

  private synchronized void destroyConnectCommand() {
    try {
      if (reconnectExecutorFuture != null && !reconnectExecutorFuture.isDone()) {
        reconnectExecutorFuture.cancel(true);
        reconnectExecutorService.purge();
        reconnectExecutorService.shutdownNow();
      }
    } catch (Throwable e) {
      logger.warn(e.getMessage(), e);
    }
  }

  public boolean isConnected() {
    if (channel == null) {
      return false;
    }
    return channel.isActive();
  }

  private synchronized void initReconnectCommand() {
    if (reconnectExecutorFuture == null || reconnectExecutorFuture.isCancelled()) {
      Runnable reconnectCommand = () -> {
        try {
          if (!isConnected()) {
            connect();
          } else {
            lastConnectedTime = System.currentTimeMillis();
          }
        } catch (Throwable t) {
          if (System.currentTimeMillis() - lastConnectedTime > SHUTDOWN_TIMEOUT) {
            if (!reconnectErrorLogFlag.get()) {
              reconnectErrorLogFlag.set(true);
              logger.error("client reconnect to server error, lastConnectedTime:{}, currentTime:{}", lastConnectedTime,
                  System.currentTimeMillis(), t);
              return;
            }
          }
          if (reconnectCount.getAndIncrement() % RECONNECT_WARNING_PERIOD == 0) {
            logger.warn("client reconnect to server error, lastConnectedTime:{}, currentTime:{}", lastConnectedTime,
                System.currentTimeMillis(), t);
          }
        }
      };
      reconnectExecutorFuture =
          reconnectExecutorService.scheduleWithFixedDelay(reconnectCommand, 2 * 1000, 10 * 1000,
              TimeUnit.MILLISECONDS);
    }
  }

  @Override
  public String subscribe(Subject subject, List<String> focusKeys) {
    if (!isConnected()) {
      notConnect();
      return null;
    }
    StompFrame frame = StompMessageUtil.buildSubscribeMessage(subject, new HashSet<>(focusKeys));
    channel.writeAndFlush(frame);
    subscribeList.add(subject);

    return frame.headers().getAsString(StompHeaders.ID);
  }

  @Override
  public String subscribe(Subject subject) {
    if (!isConnected()) {
      notConnect();
      return null;
    }
    StompFrame frame = StompMessageUtil.buildSubscribeMessage(subject);
    channel.writeAndFlush(frame);
    subscribeList.add(subject);

    return frame.headers().getAsString(StompHeaders.ID);
  }

  @Override
  public String cancelSubscribe(Subject subject) {
    if (!isConnected()) {
      notConnect();
      return null;
    }
    StompFrame frame = StompMessageUtil.buildUnSubscribeMessage(subject);
    channel.writeAndFlush(frame);
    subscribeList.remove(subject);

    return frame.headers().getAsString(StompHeaders.ID);
  }

  @Override
  public String subscribeQuote(Set<String> symbols) {
    if (!isConnected()) {
      notConnect();
      return null;
    }
    StompFrame frame = StompMessageUtil.buildSubscribeMessage(symbols, QuoteSubject.Quote);
    channel.writeAndFlush(frame);
    subscribeSymbols.addAll(symbols);
    logger.info("send subscribe quote message, symbols:{}", symbols);

    return frame.headers().getAsString(StompHeaders.ID);
  }

  @Override
  public String subscribeQuote(Set<String> symbols, List<String> focusKeys) {
    if (!isConnected()) {
      notConnect();
      return null;
    }
    StompFrame frame = StompMessageUtil.buildSubscribeMessage(symbols, new HashSet<>(focusKeys));
    channel.writeAndFlush(frame);
    subscribeSymbols.addAll(symbols);
    logger.info("send subscribe quote message, symbols:{},focusKeys:{}", symbols, focusKeys);

    return frame.headers().getAsString(StompHeaders.ID);
  }

  @Override
  public String subscribeOption(Set<String> symbols) {
    if (!isConnected()) {
      notConnect();
      return null;
    }
    StompFrame frame = StompMessageUtil.buildSubscribeMessage(symbols, QuoteSubject.Option);
    channel.writeAndFlush(frame);
    subscribeSymbols.addAll(symbols);
    ApiLogger.info("send subscribe option message, symbols:{}", symbols);

    return frame.headers().getAsString(StompHeaders.ID);
  }

  @Override
  public String cancelSubscribeQuote(Set<String> symbols) {
    if (!isConnected()) {
      notConnect();
      return null;
    }
    StompFrame frame = StompMessageUtil.buildUnSubscribeMessage(symbols);
    channel.writeAndFlush(frame);
    subscribeSymbols.removeAll(symbols);
    logger.info("send cancel subscribe quote message, symbols:{}.", symbols);

    return frame.headers().getAsString(StompHeaders.ID);
  }

  @Override
  public String getSubscribedSymbols() {
    return sendMessage(ReqProtocolType.REQ_SUB_SYMBOLS, null);
  }

  private String sendMessage(int reqType, String message) {
    if (!isConnected()) {
      notConnect();
      return null;
    }
    logger.info("reqType:{},send message:{}", reqType, message);
    StompFrame frame = StompMessageUtil.buildSendMessage(reqType, message);
    channel.writeAndFlush(frame);

    return frame.headers().getAsString(StompHeaders.ID);
  }

  private void notConnect() {
    logger.info("connection is closed.");
  }
}
