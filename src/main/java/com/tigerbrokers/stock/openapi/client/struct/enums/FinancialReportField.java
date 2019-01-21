package com.tigerbrokers.stock.openapi.client.struct.enums;

/**
 * Description:
 * Created by lijiawen on 2019/01/18.
 */
public enum FinancialReportField {
  cashEquiv("cashEquiv", 1096, 0),
  stInvest("stInvest", 1069, 0),
  tradingAssets("tradingAssets", 1244, 0),
  cashStInvest("cashStInvest", 1002, 0),
  ar("ar", 1021, 0),
  otherReceiv("otherReceiv", 1206, 0),
  stNoteReceiv("stNoteReceiv", 1048, 0),
  totalReceiv("totalReceiv", 1001, 0),
  inventory("inventory", 1043, 0),
  prepaidExp("prepaidExp", 1212, 0),
  finDivLoansCurrent("finDivLoansCurrent", 1032, 0),
  finDivAssetsCurrent("finDivAssetsCurrent", 1029, 0),
  otherCa("otherCa", 1267, 0),
  loansForSale("loansForSale", 1185, 0),
  defTaxAssetsCurrent("defTaxAssetsCurrent", 1117, 0),
  restrictedCash("restrictedCash", 1104, 0),
  otherCaSuppl("otherCaSuppl", 1055, 0),
  totalCa("totalCa", 1008, 0),
  gppe("gppe", 1169, 0),
  ad("ad", 1075, 0),
  nppe("nppe", 1004, 0),
  ltInvest("ltInvest", 1054, 0),
  gw("gw", 1171, 0),
  otherIntan("otherIntan", 1040, 0),
  finDivLoansLt("finDivLoansLt", 1033, 0),
  finDivAssetsLt("finDivAssetsLt", 1034, 0),
  otherAssets("otherAssets", 1272, 0),
  software("software", 1243, 0),
  arLt("arLt", 1088, 0),
  loansReceivLt("loansReceivLt", 1050, 0),
  defTaxAssetsLt("defTaxAssetsLt", 1026, 0),
  defChargesLt("defChargesLt", 1025, 0),
  otherLtAssets("otherLtAssets", 1060, 0),
  totalAssets("totalAssets", 1007, 0),
  ap("ap", 1018, 0),
  ae("ae", 1016, 0),
  stDebt("stDebt", 1046, 0),
  currentPort("currentPort", 1279, 0),
  currentPortDebt("currentPortDebt", 1297, 0),
  currentPortLeases("currentPortLeases", 1090, 0),
  finDivDebtCurrent("finDivDebtCurrent", 1030, 0),
  finDivLiabCurrent("finDivLiabCurrent", 1031, 0),
  otherCl("otherCl", 1269, 0),
  incTaxPayCurrent("incTaxPayCurrent", 1094, 0),
  unearnRevCurrent("unearnRevCurrent", 1074, 0),
  defTaxLiabCurrent("defTaxLiabCurrent", 1119, 0),
  otherClSuppl("otherClSuppl", 1057, 0),
  totalCl("totalCl", 1009, 0),
  ltDebt("ltDebt", 1049, 0),
  capitalLeases("capitalLeases", 1183, 0),
  finDivDebtLt("finDivDebtLt", 1035, 0),
  finDivLiabLt("finDivLiabLt", 1036, 0),
  otherLiab("otherLiab", 1282, 0),
  unearnRevLt("unearnRevLt", 1256, 0),
  pension("pension", 1213, 0),
  defTaxLiabLt("defTaxLiabLt", 1027, 0),
  otherLiabLt("otherLiabLt", 1062, 0),
  totalLiab("totalLiab", 1276, 0),
  prefRedeem("prefRedeem", 1217, 0),
  prefNonRedeem("prefNonRedeem", 1216, 0),
  prefConvert("prefConvert", 1214, 0),
  prefOther("prefOther", 1065, 0),
  common("common", 1103, 0),
  prefEquity("prefEquity", 1005, 0),
  commonApic("commonApic", 1270, 0),
  apic("apic", 1084, 0),
  re("re", 1222, 0),
  treasuryOtherEquity("treasuryOtherEquity", 1281, 0),
  treasury("treasury", 1248, 0),
  otherEquity("otherEquity", 1028, 0),
  totalCommonEquity("totalCommonEquity", 1006, 0),
  minorityInterest("minorityInterest", 1052, 0),
  totalEquity("totalEquity", 1275, 0),
  totalLiabEquity("totalLiabEquity", 1013, 0),
  numEcsComp("numEcsComp", 25214, 0),
  totalOutstandingFilingDate("totalOutstandingFilingDate", 24153, 0),
  totalOutstandingBsDate("totalOutstandingBsDate", 24152, 0),
  bvShare("bvShare", 4020, 0),
  bvShareReported("bvShareReported", 3024, 0),
  tbv("tbv", 1310, 0),
  tbvShare("tbvShare", 4156, 0),
  tbvShareReported("tbvShareReported", 35387, 0),
  gwIntan("gwIntan", 35381, 0),
  totalDebt("totalDebt", 4173, 0),
  totalDebtCurrent("totalDebtCurrent", 25223, 0),
  totalDebtNonCurrent("totalDebtNonCurrent", 25224, 0),
  netDebt("netDebt", 4364, 0),
  minorityIntRedeemTot("minorityIntRedeemTot", 41570, 0),
  minorityInterestTotal("minorityInterestTotal", 1312, 0),
  cashShare("cashShare", 4381, 0),
  totalCap("totalCap", 4175, 0),
  workingCap("workingCap", 4165, 0),
  netWorkingCap("netWorkingCap", 1311, 0),
  liquidationValuePreferredConvert("liquidationValuePreferredConvert", 3104, 0),
  liquidationValuePreferredNonRedeem("liquidationValuePreferredNonRedeem", 3105, 0),
  liquidationValuePreferredRedeem("liquidationValuePreferredRedeem", 3106, 0),
  buildings("buildings", 3023, 0),
  land("land", 3098, 0),
  lifor("lifor", 3102, 0),
  machinery("machinery", 3114, 0),
  employeesUnderUnionContracts("employeesUnderUnionContracts", 35123, 0),
  partTime("partTime", 3166, 0),
  totalEmployees("totalEmployees", 4371, 0),
  equityMethod("equityMethod", 3063, 0),
  finishedInv("finishedInv", 3075, 0),
  fullTime("fullTime", 3085, 0),
  rawInv("rawInv", 3171, 0),
  wipInv("wipInv", 3219, 0),
  cip("cip", 3033, 0),
  debtEquivOperLease("debtEquivOperLease", 21671, 0),
  debtEquivNetPbo("debtEquivNetPbo", 21679, 0),
  costBorrowing("costBorrowing", 21681, 0),
  arUnbilled("arUnbilled", 45420, 0),
  perioddateBs("perioddateBs", 1302, 0),
  filingdateBs("filingdateBs", 1264, 0),
  totalRev("totalRev", 28, 0),
  rev("rev", 112, 0),
  otherRev("otherRev", 357, 0),
  finDivRev("finDivRev", 52, 0),
  insDivRev("insDivRev", 70, 0),
  gainAssetsRev("gainAssetsRev", 104, 0),
  gainInvestRev("gainInvestRev", 106, 0),
  intInvInc("intInvInc", 110, 0),
  otherRevSuppl("otherRevSuppl", 90, 0),
  costRev("costRev", 1, 0),
  cogs("cogs", 34, 0),
  finDivExp("finDivExp", 51, 0),
  insDivExp("insDivExp", 69, 0),
  finDivIntExp("finDivIntExp", 50, 0),
  gp("gp", 10, 0),
  sga("sga", 23, 0),
  sgaSuppl("sgaSuppl", 102, 0),
  exploreDrill("exploreDrill", 49, 0),
  provBadDebts("provBadDebts", 95, 0),
  stockBased("stockBased", 101, 0),
  preOpenCost("preOpenCost", 96, 0),
  rdExp("rdExp", 100, 0),
  da("da", 2, 0),
  daSuppl("daSuppl", 41, 0),
  gwIntanAmort("gwIntanAmort", 31, 0),
  impairOil("impairOil", 71, 0),
  otherOper("otherOper", 260, 0),
  totalOtherOper("totalOtherOper", 380, 0),
  totalOperExpen("totalOperExpen", 373, 0),
  operInc("operInc", 21, 0),
  interestExp("interestExp", 82, 0),
  interestInvestInc("interestInvestInc", 65, 0),
  interestIncome("interestIncome", 210, 0),
  investmentIncome("investmentIncome", 46197, 0),
  netInterestExp("netInterestExp", 368, 0),
  otherNonOperExp("otherNonOperExp", 371, 0),
  incEquity("incEquity", 47, 0),
  currencyGain("currencyGain", 38, 0),
  otherNonOperExpSuppl("otherNonOperExpSuppl", 85, 0),
  ebtExcl("ebtExcl", 4, 0),
  mergerRestructure("mergerRestructure", 363, 0),
  restructure("restructure", 98, 0),
  merger("merger", 80, 0),
  impairmentGw("impairmentGw", 209, 0),
  gainInvest("gainInvest", 62, 0),
  gainAssets("gainAssets", 56, 0),
  otherUnusual("otherUnusual", 374, 0),
  assetWritedown("assetWritedown", 32, 0),
  iprd("iprd", 72, 0),
  insSettle("insSettle", 73, 0),
  legalSettle("legalSettle", 77, 0),
  otherUnusualSuppl("otherUnusualSuppl", 87, 0),
  totalUnusual("totalUnusual", 19, 0),
  ebt("ebt", 139, 0),
  incTax("incTax", 75, 0),
  earningCo("earningCo", 7, 0),
  doDo("do", 40, 0),
  extraAccItems("extraAccItems", 42, 0),
  otherExpIncTaxUsPrivate("otherExpIncTaxUsPrivate", 0, 0),
  niCompany("niCompany", 41571, 0),
  minorityInterestIs("minorityInterestIs", 83, 0),
  ni("ni", 15, 0),
  prefDivOther("prefDivOther", 97, 0),
  niAvailIncl("niAvailIncl", 16, 0),
  niAvailExcl("niAvailExcl", 379, 0),
  basicEpsIncl("basicEpsIncl", 9, 0),
  basicEpsExcl("basicEpsExcl", 3064, 0),
  basicWeight("basicWeight", 3217, 0),
  dilutEpsIncl("dilutEpsIncl", 8, 0),
  dilutEpsExcl("dilutEpsExcl", 142, 0),
  dilutWeight("dilutWeight", 342, 0),
  epsNorm("epsNorm", 4379, 0),
  dilutEpsNorm("dilutEpsNorm", 4380, 0),
  divShare("divShare", 3058, 0),
  dpsGross("dpsGross", 45510, 0),
  dpsNet("dpsNet", 45512, 0),
  dpsSpecGross("dpsSpecGross", 46046, 0),
  dpsSpecNet("dpsSpecNet", 46047, 0),
  dpsCorpTax("dpsCorpTax", 45514, 0),
  dpsImputedAmt("dpsImputedAmt", 45987, 0),
  dpsImputedPct("dpsImputedPct", 45999, 0),
  dpsImputedCrdAmt("dpsImputedCrdAmt", 45993, 0),
  dpsSpecImputedAmt("dpsSpecImputedAmt", 46005, 0),
  dpsSpecImputedPct("dpsSpecImputedPct", 46009, 0),
  dpsSpecImputedCrdAmt("dpsSpecImputedCrdAmt", 46007, 0),
  payoutRatio("payoutRatio", 4377, 0),
  ebitda("ebitda", 4051, 0),
  ebita("ebita", 100689, 0),
  ebit("ebit", 400, 0),
  ebitdar("ebitdar", 21674, 0),
  ebitdaEqInc("ebitdaEqInc", 21677, 0),
  ebitaEqInc("ebitaEqInc", 21676, 0),
  ebitEqInc("ebitEqInc", 21675, 0),
  ebitdarEqInc("ebitdarEqInc", 24129, 0),
  ebitdaEqIncExclSbc("ebitdaEqIncExclSbc", 24131, 0),
  ebitaEqIncExclSbc("ebitaEqIncExclSbc", 24132, 0),
  ebitEqIncExclSbc("ebitEqIncExclSbc", 24130, 0),
  ebitdarEqIncExclSbc("ebitdarEqIncExclSbc", 24133, 0),
  ebitdaExclSbc("ebitdaExclSbc", 24135, 0),
  ebitaExclSbc("ebitaExclSbc", 24136, 0),
  ebitExclSbc("ebitExclSbc", 24134, 0),
  ebitdarExclSbc("ebitdarExclSbc", 24137, 0),
  ebitdaCapex("ebitdaCapex", 35379, 0),
  effectTaxRate("effectTaxRate", 4376, 0),
  niNorm("niNorm", 4378, 0),
  sameStore("sameStore", 3195, 0),
  totalRevAsReported("totalRevAsReported", 339, 0),
  provBadDebtsPatientServiceRev("provBadDebtsPatientServiceRev", 45911, 0),
  niSfas("niSfas", 3118, 0),
  advertising("advertising", 3013, 0),
  marketing("marketing", 20776, 0),
  salesMarketing("salesMarketing", 21561, 0),
  gaExp("gaExp", 21562, 0),
  rdExpFn("rdExpFn", 3168, 0),
  netRentalExpFn("netRentalExpFn", 3170, 0),
  minimumRental("minimumRental", 20769, 0),
  depreciationRentalAssets("depreciationRentalAssets", 42407, 0),
  totalRevShare("totalRevShare", 4382, 0),
  totalRevEmployee("totalRevEmployee", 4123, 0),
  dilutNi("dilutNi", 3522, 0),
  imputOperLeaseIntExp("imputOperLeaseIntExp", 21672, 0),
  imputOperLeaseDepr("imputOperLeaseDepr", 21673, 0),
  stockBasedCogs("stockBasedCogs", 22674, 0),
  stockBasedRd("stockBasedRd", 22678, 0),
  stockBasedSm("stockBasedSm", 22680, 0),
  stockBasedGa("stockBasedGa", 22675, 0),
  stockBasedSga("stockBasedSga", 22679, 0),
  stockBasedOther("stockBasedOther", 22676, 0),
  stockBasedAt("stockBasedAt", 22677, 0),
  stockBasedTotal("stockBasedTotal", 24034, 0),
  noncashPensionExp("noncashPensionExp", 21678, 0),
  distributableCash("distributableCash", 22984, 0),
  distributableCashStandardized("distributableCashStandardized", 38939, 0),
  distributableCashShare("distributableCashShare", 23317, 0),
  annuDistributionUnit("annuDistributionUnit", 23315, 0),
  distributableCashPayout("distributableCashPayout", 23316, 0),
  dic("dic", 133, 0),
  perioddateIs("perioddateIs", 407, 0),
  filingdateIs("filingdateIs", 349, 0),
  gaapIs("gaapIs", 21680, 1),
  filingCurrency("filingCurrency", 100716, 0),
  niCf("niCf", 2150, 0),
  daSupplCf("daSupplCf", 2171, 0),
  gwIntanAmortCf("gwIntanAmortCf", 2182, 0),
  oilImpair("oilImpair", 2031, 0),
  daCf("daCf", 2160, 0),
  otherAmort("otherAmort", 2014, 0),
  nonCashItems("nonCashItems", 2179, 0),
  minorityInterestCf("minorityInterestCf", 2107, 0),
  gainAssetsCf("gainAssetsCf", 2026, 0),
  gainInvestCf("gainInvestCf", 2090, 0),
  assetWritedownCf("assetWritedownCf", 2019, 0),
  loansCf("loansCf", 2033, 0),
  creditLossCf("creditLossCf", 2112, 0),
  incEquityCf("incEquityCf", 2086, 0),
  stockBasedCf("stockBasedCf", 2127, 0),
  taxBenefitOptions("taxBenefitOptions", 2135, 0),
  provBadDebtsCf("provBadDebtsCf", 2111, 0),
  doCf("doCf", 2081, 0),
  otherOperAct("otherOperAct", 2047, 0),
  changeNetOperAssets("changeNetOperAssets", 2010, 0),
  changeTradingAssets("changeTradingAssets", 2134, 0),
  changeAr("changeAr", 2018, 0),
  changeInventory("changeInventory", 2099, 0),
  changeAp("changeAp", 2017, 0),
  changeUnearnRev("changeUnearnRev", 2139, 0),
  changeIncTax("changeIncTax", 2101, 0),
  changeDefTax("changeDefTax", 2084, 0),
  changeOtherNetOperAssets("changeOtherNetOperAssets", 2045, 0),
  cashOper("cashOper", 2006, 0),
  capex("capex", 2021, 0),
  salePpeCf("salePpeCf", 2042, 0),
  cashAcquireCf("cashAcquireCf", 2057, 0),
  divestCf("divestCf", 2077, 0),
  otherInvestAct("otherInvestAct", 2177, 0),
  saleRealEstateCf("saleRealEstateCf", 2040, 0),
  saleIntanCf("saleIntanCf", 2029, 0),
  investSecurityCf("investSecurityCf", 2027, 0),
  investLoansCf("investLoansCf", 2032, 0),
  otherInvestActSuppl("otherInvestActSuppl", 2051, 0),
  cashInvest("cashInvest", 2005, 0),
  stDebtIssued("stDebtIssued", 2043, 0),
  ltDebtIssued("ltDebtIssued", 2034, 0),
  totalDebtIssued("totalDebtIssued", 2161, 0),
  stDebtRepaid("stDebtRepaid", 2044, 0),
  ltDebtRepaid("ltDebtRepaid", 2036, 0),
  totalDebtRepaid("totalDebtRepaid", 2166, 0),
  commonIssued("commonIssued", 2169, 0),
  commonRep("commonRep", 2164, 0),
  prefIssued("prefIssued", 2181, 0),
  prefRep("prefRep", 2172, 0),
  commonDivCf("commonDivCf", 2074, 0),
  prefDivCf("prefDivCf", 2116, 0),
  commonPrefDivCf("commonPrefDivCf", 2072, 0),
  totalDivPaidCf("totalDivPaidCf", 2022, 0),
  otherFinanceAct("otherFinanceAct", 2175, 0),
  specialDivCf("specialDivCf", 2041, 0),
  otherFinanceActSuppl("otherFinanceActSuppl", 2050, 0),
  cashFinan("cashFinan", 2004, 0),
  fx("fx", 2144, 0),
  miscAdjustCf("miscAdjustCf", 2149, 0),
  netChange("netChange", 2093, 0),
  cashInterest("cashInterest", 3028, 0),
  cashTaxes("cashTaxes", 3053, 0),
  leveredFcf("leveredFcf", 4422, 0),
  unleveredFcf("unleveredFcf", 4423, 0),
  cfShare("cfShare", 43923, 0),
  changeNetWorkingCapital("changeNetWorkingCapital", 4421, 0),
  netDebtIssued("netDebtIssued", 2003, 0),
  maintCapex("maintCapex", 22985, 0),
  depreciationRentalAssetsCf("depreciationRentalAssetsCf", 42409, 0),
  saleProceedsRentalAssets("saleProceedsRentalAssets", 42411, 0),
  perioddateCf("perioddateCf", 2207, 0),
  filingdateCf("filingdateCf", 2155, 0),
  assetTurns("assetTurns", 4177, 0),
  fixedAssetTurns("fixedAssetTurns", 4066, 0),
  arTurns("arTurns", 4001, 0),
  inventoryTurns("inventoryTurns", 4082, 0),
  currentRatio("currentRatio", 4030, 0),
  quickRatio("quickRatio", 4121, 0),
  daysSalesOut("daysSalesOut", 4042, 0),
  daysInventoryOut("daysInventoryOut", 4035, 0),
  daysPayableOut("daysPayableOut", 4183, 0),
  cashConversion("cashConversion", 4184, 0),
  totalRev1yrAnnGrowth("totalRev1yrAnnGrowth", 4194, 0),
  gp1yrAnnGrowth("gp1yrAnnGrowth", 4195, 0),
  ebitda1yrAnnGrowth("ebitda1yrAnnGrowth", 4196, 0),
  ebita1yrAnnGrowth("ebita1yrAnnGrowth", 4407, 0),
  ebit1yrAnnGrowth("ebit1yrAnnGrowth", 4197, 0),
  earningCo1yrAnnGrowth("earningCo1yrAnnGrowth", 4198, 0),
  ni1yrAnnGrowth("ni1yrAnnGrowth", 4199, 0),
  niNorm1yrAnnGrowth("niNorm1yrAnnGrowth", 4413, 0),
  eps1yrAnnGrowth("eps1yrAnnGrowth", 4200, 0),
  acctRecv1yrAnnGrowth("acctRecv1yrAnnGrowth", 4389, 0),
  inv1yrAnnGrowth("inv1yrAnnGrowth", 4395, 0),
  nppe1yrAnnGrowth("nppe1yrAnnGrowth", 4201, 0),
  commonEquity1yrAnnGrowth("commonEquity1yrAnnGrowth", 4202, 0),
  totalAssets1yrAnnGrowth("totalAssets1yrAnnGrowth", 4203, 0),
  tbv1yrAnnGrowth("tbv1yrAnnGrowth", 4401, 0),
  cfo1yrAnnGrowth("cfo1yrAnnGrowth", 4204, 0),
  capex1yrAnnGrowth("capex1yrAnnGrowth", 4205, 0),
  lfcf1yrAnnGrowth("lfcf1yrAnnGrowth", 4424, 0),
  ufcf1yrAnnGrowth("ufcf1yrAnnGrowth", 4430, 0),
  dps1yrAnnGrowth("dps1yrAnnGrowth", 4206, 0),
  totalRev2yrAnnCagr("totalRev2yrAnnCagr", 4207, 0),
  gp2yrAnnCagr("gp2yrAnnCagr", 4208, 0),
  ebitda2yrAnnCagr("ebitda2yrAnnCagr", 4209, 0),
  ebita2yrAnnCagr("ebita2yrAnnCagr", 4408, 0),
  ebit2yrAnnCagr("ebit2yrAnnCagr", 4210, 0),
  earningCo2yrAnnCagr("earningCo2yrAnnCagr", 4211, 0),
  ni2yrAnnCagr("ni2yrAnnCagr", 4212, 0),
  niNorm2yrAnnCagr("niNorm2yrAnnCagr", 4414, 0),
  eps2yrAnnCagr("eps2yrAnnCagr", 4213, 0),
  acctRecv2yrAnnCagr("acctRecv2yrAnnCagr", 4390, 0),
  inv2yrAnnCagr("inv2yrAnnCagr", 4396, 0),
  nppe2yrAnnCagr("nppe2yrAnnCagr", 4214, 0),
  commonEquity2yrAnnCagr("commonEquity2yrAnnCagr", 4215, 0),
  totalAssets2yrAnnCagr("totalAssets2yrAnnCagr", 4216, 0),
  tbv2yrAnnCagr("tbv2yrAnnCagr", 4402, 0),
  cfo2yrAnnCagr("cfo2yrAnnCagr", 4217, 0),
  capex2yrAnnCagr("capex2yrAnnCagr", 4218, 0),
  lfcf2yrAnnCagr("lfcf2yrAnnCagr", 4425, 0),
  ufcf2yrAnnCagr("ufcf2yrAnnCagr", 4431, 0),
  dps2yrAnnCagr("dps2yrAnnCagr", 4219, 0),
  totalRev3yrAnnCagr("totalRev3yrAnnCagr", 4220, 0),
  gp3yrAnnCagr("gp3yrAnnCagr", 4221, 0),
  ebitda3yrAnnCagr("ebitda3yrAnnCagr", 4222, 0),
  ebita3yrAnnCagr("ebita3yrAnnCagr", 4409, 0),
  ebit3yrAnnCagr("ebit3yrAnnCagr", 4223, 0),
  earningCo3yrAnnCagr("earningCo3yrAnnCagr", 4224, 0),
  ni3yrAnnCagr("ni3yrAnnCagr", 4225, 0),
  niNorm3yrAnnCagr("niNorm3yrAnnCagr", 4415, 0),
  eps3yrAnnCagr("eps3yrAnnCagr", 4226, 0),
  acctRecv3yrAnnCagr("acctRecv3yrAnnCagr", 4391, 0),
  inv3yrAnnCagr("inv3yrAnnCagr", 4397, 0),
  nppe3yrAnnCagr("nppe3yrAnnCagr", 4227, 0),
  commonEquity3yrAnnCagr("commonEquity3yrAnnCagr", 4228, 0),
  totalAssets3yrAnnCagr("totalAssets3yrAnnCagr", 4229, 0),
  tbv3yrAnnCagr("tbv3yrAnnCagr", 4403, 0),
  cfo3yrAnnCagr("cfo3yrAnnCagr", 4230, 0),
  capex3yrAnnCagr("capex3yrAnnCagr", 4231, 0),
  lfcf3yrAnnCagr("lfcf3yrAnnCagr", 4426, 0),
  ufcf3yrAnnCagr("ufcf3yrAnnCagr", 4432, 0),
  dps3yrAnnCagr("dps3yrAnnCagr", 4232, 0),
  totalRev5yrAnnCagr("totalRev5yrAnnCagr", 4233, 0),
  gp5yrAnnCagr("gp5yrAnnCagr", 4234, 0),
  ebitda5yrAnnCagr("ebitda5yrAnnCagr", 4235, 0),
  ebita5yrAnnCagr("ebita5yrAnnCagr", 4410, 0),
  ebit5yrAnnCagr("ebit5yrAnnCagr", 4236, 0),
  earningCo5yrAnnCagr("earningCo5yrAnnCagr", 4237, 0),
  ni5yrAnnCagr("ni5yrAnnCagr", 4238, 0),
  niNorm5yrAnnCagr("niNorm5yrAnnCagr", 4416, 0),
  eps5yrAnnCagr("eps5yrAnnCagr", 4239, 0),
  acctRecv5yrAnnCagr("acctRecv5yrAnnCagr", 4392, 0),
  inv5yrAnnCagr("inv5yrAnnCagr", 4398, 0),
  nppe5yrAnnCagr("nppe5yrAnnCagr", 4240, 0),
  commonEquity5yrAnnCagr("commonEquity5yrAnnCagr", 4241, 0),
  totalAssets5yrAnnCagr("totalAssets5yrAnnCagr", 4242, 0),
  tbv5yrAnnCagr("tbv5yrAnnCagr", 4404, 0),
  cfo5yrAnnCagr("cfo5yrAnnCagr", 4243, 0),
  capex5yrAnnCagr("capex5yrAnnCagr", 4244, 0),
  lfcf5yrAnnCagr("lfcf5yrAnnCagr", 4427, 0),
  ufcf5yrAnnCagr("ufcf5yrAnnCagr", 4433, 0),
  dps5yrAnnCagr("dps5yrAnnCagr", 4245, 0),
  totalRev7yrAnnCagr("totalRev7yrAnnCagr", 4246, 0),
  gp7yrAnnCagr("gp7yrAnnCagr", 4247, 0),
  ebitda7yrAnnCagr("ebitda7yrAnnCagr", 4248, 0),
  ebita7yrAnnCagr("ebita7yrAnnCagr", 4411, 0),
  ebit7yrAnnCagr("ebit7yrAnnCagr", 4249, 0),
  earningCo7yrAnnCagr("earningCo7yrAnnCagr", 4250, 0),
  ni7yrAnnCagr("ni7yrAnnCagr", 4251, 0),
  niNorm7yrAnnCagr("niNorm7yrAnnCagr", 4417, 0),
  eps7yrAnnCagr("eps7yrAnnCagr", 4252, 0),
  acctRecv7yrAnnCagr("acctRecv7yrAnnCagr", 4393, 0),
  inv7yrAnnCagr("inv7yrAnnCagr", 4399, 0),
  nppe7yrAnnCagr("nppe7yrAnnCagr", 4253, 0),
  commonEquity7yrAnnCagr("commonEquity7yrAnnCagr", 4254, 0),
  totalAssets7yrAnnCagr("totalAssets7yrAnnCagr", 4255, 0),
  tbv7yrAnnCagr("tbv7yrAnnCagr", 4405, 0),
  cfo7yrAnnCagr("cfo7yrAnnCagr", 4256, 0),
  capex7yrAnnCagr("capex7yrAnnCagr", 4257, 0),
  lfcf7yrAnnCagr("lfcf7yrAnnCagr", 4428, 0),
  ufcf7yrAnnCagr("ufcf7yrAnnCagr", 4434, 0),
  dps7yrAnnCagr("dps7yrAnnCagr", 4258, 0),
  totalRev10yrAnnCagr("totalRev10yrAnnCagr", 4259, 0),
  gp10yrAnnCagr("gp10yrAnnCagr", 4260, 0),
  ebitda10yrAnnCagr("ebitda10yrAnnCagr", 4261, 0),
  ebita10yrAnnCagr("ebita10yrAnnCagr", 4412, 0),
  ebit10yrAnnCagr("ebit10yrAnnCagr", 4262, 0),
  earningCo10yrAnnCagr("earningCo10yrAnnCagr", 4263, 0),
  ni10yrAnnCagr("ni10yrAnnCagr", 4264, 0),
  niNorm10yrAnnCagr("niNorm10yrAnnCagr", 4418, 0),
  eps10yrAnnCagr("eps10yrAnnCagr", 4265, 0),
  acctRecv10yrAnnCagr("acctRecv10yrAnnCagr", 4394, 0),
  inv10yrAnnCagr("inv10yrAnnCagr", 4400, 0),
  nppe10yrAnnCagr("nppe10yrAnnCagr", 4266, 0),
  commonEquity10yrAnnCagr("commonEquity10yrAnnCagr", 4267, 0),
  totalAssets10yrAnnCagr("totalAssets10yrAnnCagr", 4268, 0),
  tbv10yrAnnCagr("tbv10yrAnnCagr", 4406, 0),
  cfo10yrAnnCagr("cfo10yrAnnCagr", 4269, 0),
  capex10yrAnnCagr("capex10yrAnnCagr", 4270, 0),
  lfcf10yrAnnCagr("lfcf10yrAnnCagr", 4429, 0),
  ufcf10yrAnnCagr("ufcf10yrAnnCagr", 4435, 0),
  dps10yrAnnCagr("dps10yrAnnCagr", 4271, 0),
  cfoCurrentLiab("cfoCurrentLiab", 4185, 0),
  totalDebtEquity("totalDebtEquity", 4034, 0),
  totalDebtCapital("totalDebtCapital", 4186, 0),
  ltDebtEquity("ltDebtEquity", 4085, 0),
  ltDebtCapital("ltDebtCapital", 4187, 0),
  totalLiabTotalAssets("totalLiabTotalAssets", 4188, 0),
  ebitInt("ebitInt", 4189, 0),
  ebitdaInt("ebitdaInt", 4190, 0),
  ebitdaCapexInt("ebitdaCapexInt", 4191, 0),
  totalDebtEbitda("totalDebtEbitda", 4192, 0),
  netDebtEbitda("netDebtEbitda", 4193, 0),
  totalDebtEbitdaCapex("totalDebtEbitdaCapex", 23313, 0),
  netDebtEbitdaCapex("netDebtEbitdaCapex", 23314, 0),
  capexPctRev("capexPctRev", 35380, 0),
  zScore("zScore", 100123, 0),
  returnAssets("returnAssets", 4178, 0),
  returnCapital("returnCapital", 4363, 0),
  returnEquity("returnEquity", 4128, 0),
  returnCommonEquity("returnCommonEquity", 33320, 0),
  grossMargin("grossMargin", 4074, 0),
  ebitdaMargin("ebitdaMargin", 4047, 0),
  ebitaMargin("ebitaMargin", 4419, 0),
  ebitMargin("ebitMargin", 4053, 0),
  sgaMargin("sgaMargin", 4375, 0),
  earningCoMargin("earningCoMargin", 4181, 0),
  niMargin("niMargin", 4094, 0),
  niAvailExclMargin("niAvailExclMargin", 4182, 0),
  lfcfMargin("lfcfMargin", 4436, 0),
  ufcfMargin("ufcfMargin", 4437, 0),
  niNormMargin("niNormMargin", 4420, 0);

  private String field;
  private long dataItemId;
  private int type; // 0为数字类型  1为文字类型

  public static final int VALUE_TYPE = 0;
  public static final int TEXT_TYPE = 1;

  FinancialReportField(String field, long dataItemId, int type) {
    this.field = field;
    this.dataItemId = dataItemId;
    this.type = type;
  }

  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public long getDataItemId() {
    return dataItemId;
  }

  public void setDataItemId(long dataItemId) {
    this.dataItemId = dataItemId;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }
}