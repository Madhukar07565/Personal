/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedPaymentgatewaysConstants
{
	public static final String EXTENSIONNAME = "paymentgateways";
	public static class TC
	{
		public static final String KEYVALUEMAP = "KeyValueMap".intern();
		public static final String PAYMENTGATEWAYDETAIL = "PaymentGatewayDetail".intern();
		public static final String PAYMENTGATEWAYMAPPING = "PaymentGatewayMapping".intern();
		public static final String PAYMENTSERVICERESPONSEDECISIONENUM = "PaymentServiceResponseDecisionEnum".intern();
		public static final String RMSFRAUDCHECKUPDATESTATUSENUM = "RMSFraudCheckUpdateStatusEnum".intern();
	}
	public static class Attributes
	{
		public static class KeyValueMap
		{
			public static final String KEY = "key".intern();
			public static final String PAYMENTGATEWAYNAME = "paymentGatewayName".intern();
			public static final String VALUE = "value".intern();
		}
		public static class PaymentGatewayDetail
		{
			public static final String CARDTYPE = "cardType".intern();
			public static final String CURRENCY = "currency".intern();
			public static final String PAYMENTGATEWAYMAPPING = "paymentGatewayMapping".intern();
			public static final String PAYMENTGATEWAYNAME = "paymentGatewayName".intern();
			public static final String PAYMENTMODE = "paymentMode".intern();
		}
		public static class PaymentGatewayMapping
		{
			public static final String PAYMENTGATEWAYDETAILLIST = "paymentGatewayDetailList".intern();
			public static final String PGNAME = "pgName".intern();
			public static final String PGREQTEMPID = "pgReqTempID".intern();
			public static final String PGRESTEMPID = "pgResTempID".intern();
		}
	}
	public static class Enumerations
	{
		public static class PaymentServiceResponseDecisionEnum
		{
			public static final String ACCEPT = "ACCEPT".intern();
			public static final String FRAUD = "FRAUD".intern();
			public static final String REVIEW = "REVIEW".intern();
			public static final String CANCELED = "CANCELED".intern();
		}
		public static class RMSFraudCheckUpdateStatusEnum
		{
			public static final String APPROVED = "Approved".intern();
			public static final String REVIEW = "Review".intern();
			public static final String REJECTED = "Rejected".intern();
			public static final String IGNORED = "Ignored".intern();
			public static final String FRAUD = "Fraud".intern();
			public static final String CHARGEBACK = "Chargeback".intern();
		}
	}
	public static class Relations
	{
		public static final String PAYMENTGATEWAYMAPPING2PAYMENTGATEWAYDETAIL = "PaymentGatewayMapping2PaymentGatewayDetail".intern();
	}
	
	protected GeneratedPaymentgatewaysConstants()
	{
		// private constructor
	}
	
	
}
