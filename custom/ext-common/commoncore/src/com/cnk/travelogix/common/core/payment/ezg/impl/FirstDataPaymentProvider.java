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

import de.hybris.platform.acceleratorservices.payment.enums.DecisionsEnum;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.cnk.travelogix.common.core.payment.data.PaymentServerSetting;
import com.cnk.travelogix.common.core.payment.data.PaymentServiceResponse;
import com.cnk.travelogix.common.core.payment.ezg.PaymentProvider;
import com.cnk.travelogix.common.core.util.HashUtil;


/**
 * @author i323727
 *
 */
public class FirstDataPaymentProvider implements PaymentProvider
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.core.payment.ezg.PaymentProvider#getPaymentFields(de.hybris.platform.commercefacades.
	 * order.data.CartData, java.lang.String)
	 */
	@Override
	public Map<String, String> getPaymentFields(final String cartCode, final String amount, final String receiptResponseURL)
	{
		final Map<String, String> fields = new HashMap<>();
		final PaymentServerSetting serverSetting = getPaymentServerSetting();
		final String transactionKey = serverSetting.getMearchantSecureSecret();
		final String x_login = serverSetting.getMearchantId();
		final String x_fp_sequence = cartCode;
		final String x_fp_timestamp = String.valueOf(System.currentTimeMillis() / 1000);
		final String x_currency_code = "USD";
		final String x_amount = amount;

		final String data = x_login + "^" + x_fp_sequence + "^" + x_fp_timestamp + "^" + x_amount + "^" + x_currency_code;
		final String x_fp_hash = HashUtil.hmacMD5(data, transactionKey);

		fields.put("x_login", x_login);
		fields.put("x_amount", x_amount);
		fields.put("x_fp_sequence", x_fp_sequence);
		fields.put("x_fp_timestamp", x_fp_timestamp);
		fields.put("x_currency_code", x_currency_code);
		fields.put("x_show_form", "PAYMENT_FORM");
		fields.put("x_fp_hash", x_fp_hash);
		fields.put("x_receipt_link_url", receiptResponseURL);
		return fields;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.core.payment.ezg.PaymentProvider#getPaymentServerSetting()
	 */
	@Override
	public PaymentServerSetting getPaymentServerSetting()
	{
		final PaymentServerSetting data = new PaymentServerSetting();
		data.setPaymentServerUrl("https://demo.globalgatewaye4.firstdata.com/pay");
		//x_login, in first data portal page
		data.setMearchantId("HCO-EZEEG-247");
		//transaction key
		data.setMearchantSecureSecret("u1py7ARWz7XhaC8wKRem");
		data.setPaymentServerSecureSecret("_RpcTyhGRQJaScryweQK");

		return data;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.core.payment.ezg.PaymentProvider#interpretPaymentResponse(java.util.Map)
	 */
	@Override
	public PaymentServiceResponse interpretPaymentResponse(final Map<String, String> fields)
	{
		final PaymentServiceResponse response = new PaymentServiceResponse();
		final PaymentServerSetting serverSetting = getPaymentServerSetting();
		final DecimalFormat df = new DecimalFormat("0.00");
		final String x_MD5_Hash = fields.get("x_MD5_Hash");
		final String x_login = serverSetting.getMearchantId();
		final String x_trans_id = fields.get("x_trans_id");
		final String x_amount = fields.get("x_amount");
		final String data = serverSetting.getPaymentServerSecureSecret() + x_login + x_trans_id
				+ df.format(Double.valueOf(x_amount));
		final String hashValue = HashUtil.md5(data);
		if (hashValue.equals(x_MD5_Hash))
		{
			if (fields.get("x_response_code").equals("1"))
			{
				response.setSuccess(true);
				response.setDecision(DecisionsEnum.ACCEPT.name());
			}
			populateCardInfo(fields, response);
			response.setAmount(x_amount);
		}
		else
		{
			response.setMessage("hash value not valid");

		}
		return response;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.core.payment.ezg.PaymentProvider#populateCardType(java.util.Map,
	 * com.cnk.travelogix.common.core.payment.data.PaymentServiceResponse)
	 */
	@Override
	public void populateCardInfo(final Map<String, String> fields, final PaymentServiceResponse response)
	{
		if (StringUtils.equals(fields.get("TransactionCardType"), "AMERICAN EXPRESS"))
		{
			//			response.setCardType(CreditCardType.AMEX.getCode());
		}
		else if (StringUtils.equals(fields.get("TransactionCardType"), "VISA"))
		{
			//			response.setCardType(CreditCardType.VISA.getCode());
		}
		response.setCardNumber(fields.get("Card_Number"));
		response.setCardHolder(fields.get("CardHoldersName"));
		final String expiry = fields.get("Expiry_Date");
		if (StringUtils.isNotEmpty(expiry) && expiry.length() == 4)
		{
			response.setCardExpiryMonth(expiry.substring(0, 2));
			response.setCardExpiryYear(expiry.substring(2));
		}
		else
		{
			response.setCardExpiryYear(expiry);
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
		return "firstdata";
	}

}
