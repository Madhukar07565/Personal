/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.common.core.payment.ezg.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.common.core.payment.amex.dialect.VPC3PartyConnection;
import com.cnk.travelogix.common.core.payment.amex.dialect.VPCPaymentCodesHelper;
import com.cnk.travelogix.common.core.payment.amex.dialect.VPCPaymentConnection;
import com.cnk.travelogix.common.core.payment.data.PaymentServerSetting;
import com.cnk.travelogix.common.core.payment.data.PaymentServiceResponse;
import com.cnk.travelogix.common.core.payment.ezg.PaymentProvider;


/**
 *
 */
public class AmexPaymentProvider implements PaymentProvider
{

	@Override
	public Map<String, String> getPaymentFields(final String cartCode, final String amount, final String receiptResponseURL)
	{

		final Map<String, String> fields = new HashMap<>();
		final PaymentServerSetting serverSetting = getPaymentServerSetting();

		fields.put("vpc_Version", serverSetting.getPaymentServerVersion());
		fields.put("vpc_Merchant", serverSetting.getMearchantId());
		fields.put("vpc_AccessCode", serverSetting.getMearchantAccessCode());
		fields.put("vpc_Locale", serverSetting.getMearchantLocale());
		//
		//		fields.put("key", value);
		//		fields.put("key", value);

		// no need to send the vpc url,
		fields.put("vpc_Command", "pay");
		fields.put("vpc_ReturnURL", receiptResponseURL);
		fields.put("vpc_OrderInfo", cartCode);
		fields.put("vpc_MerchTxnRef", cartCode + "_" + System.currentTimeMillis());
		//		final String price = cart.getTotalPriceWithTax().getValue().toString();
		fields.put("vpc_Amount", "2000");

		final VPC3PartyConnection vpcconn = new VPC3PartyConnection();
		vpcconn.setSecureSecret(serverSetting.getMearchantSecureSecret());

		// Create MD5 secure hash and insert it into the hash map if it was created
		// created. Remember if secureSecret = "" it will not be created
		if (StringUtils.isNotEmpty(serverSetting.getMearchantSecureSecret()))
		{
			final String secureHash = vpcconn.hashAllFields(fields);
			fields.put("vpc_SecureHash", secureHash);
		}
		return fields;
	}



	// ************************** to be further implemented under this comment ************************/

	/**
	 * get from db
	 *
	 */

	@Override
	public PaymentServerSetting getPaymentServerSetting()
	{
		final PaymentServerSetting data = new PaymentServerSetting();
		data.setPaymentServerUrl("https://vpos.amxvpos.com/vpcpay");
		data.setPaymentServerVersion("1");
		data.setMearchantAccessCode("75515D02");
		data.setMearchantId("TEST9820705713");
		data.setMearchantLocale("en");
		data.setMearchantSecureSecret("C87A0612589652C86FB861410A9672A2");
		return data;
	}



	@Override
	public PaymentServiceResponse interpretPaymentResponse(final Map<String, String> fields)
	{
		final PaymentServiceResponse response = new PaymentServiceResponse();

		final PaymentServerSetting serverSetting = getPaymentServerSetting();
		// The Page does a display to a browser
		final VPC3PartyConnection vpc3conn = new VPC3PartyConnection();

		// This is secret for encoding the MD5 hash
		// This secret will vary from merchant to merchant
		final String secureSecret = serverSetting.getMearchantSecureSecret();
		vpc3conn.setSecureSecret(secureSecret);

		// remove the vpc_TxnResponseCode code from the response fields as we do not
		// want to include this field in the hash calculation
		final String vpc_Txn_Secure_Hash = VPCPaymentConnection.null2unknownDR(fields.remove("vpc_SecureHash"));
		boolean isValid = false;

		// defines if error message should be output
		final boolean errorExists = false;

		//compare hash result to validate the result message
		if (secureSecret != null && secureSecret.length() > 0
				&& (fields.get("vpc_TxnResponseCode") != null || fields.get("vpc_TxnResponseCode") != "No Value Returned"))
		{
			final String secureHash = vpc3conn.hashAllFields(fields);
			if (vpc_Txn_Secure_Hash.equalsIgnoreCase(secureHash))
			{
				isValid = true;
			}
		}

		response.setAmount(fields.get("vpc_Amount"));
		response.setDecision(fields.get("vpc_Message"));

		populateCardInfo(fields, response);

		final StringBuilder messageBuilder = new StringBuilder();
		String txnResponseCodeDesc = "";
		String cscResultCodeDesc = "";
		String avsResultCodeDesc = "";

		// establish the VPCPaymentCodesHelper to get the response code descriptions
		final VPCPaymentCodesHelper vpchelper = new VPCPaymentCodesHelper();
		final String txnResponseCode = fields.get("vpc_TxnResponseCode");
		if ("0".equals(txnResponseCode) && (isValid || StringUtils.isEmpty(secureSecret)))
		{
			response.setSuccess(true);
		}
		if (txnResponseCode != "No Value Returned")
		{
			txnResponseCodeDesc = vpchelper.getResponseDescription(txnResponseCode);
		}

		messageBuilder.append(txnResponseCodeDesc).append(";");

		final String cscResultCode = fields.get("vpc_CSCResultCode");
		if (cscResultCode != "No Value Returned")
		{
			cscResultCodeDesc = vpchelper.displayCSCResponse(cscResultCode);
		}
		messageBuilder.append(cscResultCodeDesc).append(";");
		final String avsResultCode = fields.get("vpc_AVSResultCode");
		if (avsResultCode != "No Value Returned")
		{
			avsResultCodeDesc = vpchelper.displayAVSResponse(avsResultCode);
		}
		messageBuilder.append(avsResultCodeDesc).append(";");
		String error = "";
		// Show this page as an error page if error condition
		if (txnResponseCode.equals("7") || txnResponseCode.equals("No Value Returned") || errorExists)
		{
			error = "Error ";
		}
		messageBuilder.append(error).append(";");
		response.setMessage(messageBuilder.toString());
		return response;
	}



	/**
	 * @param fields
	 * @param response
	 */
	@Override
	public void populateCardInfo(final Map<String, String> fields, final PaymentServiceResponse response)
	{
		if (StringUtils.equals("AE", fields.get("vpc_Card")))
		{
			//			response.setCardType(CreditCardType.AMEX.getCode());
		}
	}



	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.core.payment.ezg.PaymentProvider#getCode()
	 */
	@Override
	public String getCode()
	{
		return "amex";
	}

}
