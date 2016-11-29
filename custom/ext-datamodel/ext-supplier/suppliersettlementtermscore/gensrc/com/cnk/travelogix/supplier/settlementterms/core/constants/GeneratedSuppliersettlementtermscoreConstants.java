/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.settlementterms.core.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedSuppliersettlementtermscoreConstants
{
	public static final String EXTENSIONNAME = "suppliersettlementtermscore";
	public static class TC
	{
		public static final String ABSTRACTSUPPLIERSETTLEMENT = "AbstractSupplierSettlement".intern();
		public static final String ADVCOMMERCIALSETTLEMENTPAYABLE = "AdvCommercialSettlementPayable".intern();
		public static final String COMMERCIALSETTLEMENTRECEIVABLE = "CommercialSettlementReceivable".intern();
		public static final String COUNTRYCREDITLIMIT = "CountryCreditLimit".intern();
		public static final String CREDITCOMMSETTLEMENT = "CreditCommSettlement".intern();
		public static final String INTERESTCALCBASISTYPE = "InterestCalcBasisType".intern();
		public static final String NOCREDITDEPOSITCOMMSETTLEMENT = "NoCreditDepositCommSettlement".intern();
		public static final String NOCREDITPREPAYMENTCOMMSETTLEMENT = "NoCreditPrePaymentCommSettlement".intern();
		public static final String PAYABLEAMOUNTDETAIL = "PayableAmountDetail".intern();
		public static final String PAYMENTTYPE = "PaymentType".intern();
		public static final String PREPAYMENTTYPE = "PrePaymentType".intern();
		public static final String RAISEINDENTCRONJOB = "RaiseIndentCronJob".intern();
		public static final String RAISEINDENTTYPE = "RaiseIndentType".intern();
		public static final String SCHEDULETYPE = "ScheduleType".intern();
		public static final String SETTLEMENTONTYPE = "SettlementOnType".intern();
		public static final String SETTLEMENTPERIOD = "SettlementPeriod".intern();
		public static final String SETTLEMENTSCHEDULETYPE = "SettlementScheduleType".intern();
		public static final String SETTLEMENTTYPE = "SettlementType".intern();
		public static final String STDCOMMCOMMISIONABLESETTLEMENT = "StdCommCommisionableSettlement".intern();
		public static final String STDCOMMNONCOMISSIONABLESETTLEMENT = "StdCommNonComissionableSettlement".intern();
		public static final String SUPPLIERSETTLEMENT = "SupplierSettlement".intern();
		public static final String THRESHOLDTYPE = "ThresholdType".intern();
	}
	public static class Attributes
	{
		public static class BankAccountDetail
		{
			public static final String SUPPLIERSETTLEMENT = "supplierSettlement".intern();
		}
		public static class SupplierCredentials
		{
			public static final String CREDITCOMMSETTLEMENT = "creditCommSettlement".intern();
			public static final String NOCREDITDEPOSITCOMMISIONABLEDETAIL = "noCreditDepositcommisionableDetail".intern();
			public static final String NOCREDITPREPAYMENTCOMMSETTLEMENT = "noCreditPrePaymentCommSettlement".intern();
		}
		public static class Trigger
		{
			public static final String SETTLEMENTPERIODLIST = "settlementPeriodList".intern();
			public static final String SETTLEMENTSCHEDULE = "settlementSchedule".intern();
		}
	}
	public static class Enumerations
	{
		public static class InterestCalcBasisType
		{
			public static final String PER_DAY = "PER_DAY".intern();
			public static final String PER_WEEK = "PER_WEEK".intern();
			public static final String PER_MONTH = "PER_MONTH".intern();
		}
		public static class PaymentType
		{
			public static final String ADVANCE = "ADVANCE".intern();
			public static final String BALANCE = "BALANCE".intern();
		}
		public static class PrePaymentType
		{
			public static final String FULL = "FULL".intern();
			public static final String PARTIAL = "PARTIAL".intern();
		}
		public static class RaiseIndentType
		{
			public static final String FULL_AMOUNT = "FULL_AMOUNT".intern();
			public static final String UTLISED_AMOUNT = "UTLISED_AMOUNT".intern();
		}
		public static class ScheduleType
		{
			public static final String HOURLY = "HOURLY".intern();
			public static final String DAILY = "DAILY".intern();
			public static final String WEEKLY = "WEEKLY".intern();
			public static final String FORTNIGHTLY = "FORTNIGHTLY".intern();
			public static final String MONTHLY = "MONTHLY".intern();
			public static final String YEARLY = "YEARLY".intern();
			public static final String QUARTERLY = "QUARTERLY".intern();
			public static final String HALF_YEARLY = "HALF_YEARLY".intern();
			public static final String END_OF_VALIDITY = "END_OF_VALIDITY".intern();
		}
		public static class SettlementOnType
		{
			public static final String GROSS = "GROSS".intern();
			public static final String NET = "NET".intern();
		}
		public static class SettlementScheduleType
		{
			public static final String TRAVEL_DATE = "TRAVEL_DATE".intern();
			public static final String BOOKING_DATE = "BOOKING_DATE".intern();
			public static final String TRAVEL_INVOICE = "TRAVEL_INVOICE".intern();
		}
		public static class SettlementType
		{
			public static final String CREDIT = "CREDIT".intern();
			public static final String NO_CREDIT = "NO_CREDIT".intern();
		}
		public static class ThresholdType
		{
			public static final String AMOUNT = "AMOUNT".intern();
			public static final String PERCENTAGE = "PERCENTAGE".intern();
		}
	}
	public static class Relations
	{
		public static final String CREDITCOMMSETTLEMENT2COUNTRYCREDITLIMITRELS = "CreditCommSettlement2CountryCreditLimitRels".intern();
		public static final String CREDITCOMMSETTLEMENT2SUPPLIERCREDENTIALSRELS = "CreditCommSettlement2SupplierCredentialsRels".intern();
		public static final String NOCREDITDEPOSITCOMMSETTLEMENT2SUPPLIERCREDENTIALSRELS = "NoCreditDepositCommSettlement2SupplierCredentialsRels".intern();
		public static final String NOCREDITPREPAYMENTCOMMSETTLEMENT2PAYABLEAMOUNTDETAILRELS = "NoCreditPrePaymentCommSettlement2PayableAmountDetailRels".intern();
		public static final String NOCREDITPREPAYMENTCOMMSETTLEMENT2SUPPLIERCREDENTIALSRELS = "NoCreditPrePaymentCommSettlement2SupplierCredentialsRels".intern();
		public static final String STDCOMMCOMMISIONABLESETTLEMENT2CREDITCOMMSETTLEMENTRELS = "StdCommCommisionableSettlement2CreditCommSettlementRels".intern();
		public static final String STDCOMMCOMMISIONABLESETTLEMENT2NOCREDITDEPOSITCOMMSETTLEMENTRELS = "StdCommCommisionableSettlement2NoCreditDepositCommSettlementRels".intern();
		public static final String STDCOMMNONCOMISSIONABLESETTLEMENT2NOCREDITPREPAYMENTCOMMSETTLEMENTRELS = "StdCommNonComissionableSettlement2NoCreditPrePaymentCommSettlementRels".intern();
		public static final String SUPPLIERSETTLEMENT2ADVCOMMERCIALSETTLEMENTPAYABLERELS = "SupplierSettlement2AdvCommercialSettlementPayableRels".intern();
		public static final String SUPPLIERSETTLEMENT2BANKACCOUNTDETAILRELS = "SupplierSettlement2BankAccountDetailRels".intern();
		public static final String SUPPLIERSETTLEMENT2COMMERCIALSETTLEMENTRECEIVABLERELS = "SupplierSettlement2CommercialSettlementReceivableRels".intern();
		public static final String SUPPLIERSETTLEMENT2STDCOMMCOMMISIONABLESETTLEMENTRELS = "SupplierSettlement2StdCommCommisionableSettlementRels".intern();
		public static final String SUPPLIERSETTLEMENT2STDCOMMNONCOMISSIONABLESETTLEMENTRELS = "SupplierSettlement2StdCommNonComissionableSettlementRels".intern();
		public static final String TRIGGER2SETTLEMENTPERIODRELS = "Trigger2SettlementPeriodRels".intern();
	}
	
	protected GeneratedSuppliersettlementtermscoreConstants()
	{
		// private constructor
	}
	
	
}
