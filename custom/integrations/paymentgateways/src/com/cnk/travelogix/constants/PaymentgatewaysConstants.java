/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.cnk.travelogix.constants;

/**
 * Global class for all Paymentgateways constants. You can add global constants for your extension into this class.
 */
public final class PaymentgatewaysConstants
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
			public static final String PAYMENTGATEWAYNAME = "paymentGatewayName".intern();
			public static final String PAYMENTMODE = "paymentMode".intern();
		}

		public static class PaymentGatewayMapping
		{
			public static final String PAYMENTGATEWAYDETAILS = "paymentGatewayDetails".intern();
			public static final String PAYMENTGATEWAYNAME = "paymentGatewayName".intern();
			public static final String PAYMENTGATEWAYREQUESTTEMPLATEID = "paymentGatewayRequestTemplateID".intern();
			public static final String PAYMENTGATEWAYRESPONSETEMPLATEID = "paymentGatewayResponseTemplateID".intern();
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


	private PaymentgatewaysConstants()
	{
		//empty to avoid instantiating this constant class
	}

	// implement here constants used by this extension
}
