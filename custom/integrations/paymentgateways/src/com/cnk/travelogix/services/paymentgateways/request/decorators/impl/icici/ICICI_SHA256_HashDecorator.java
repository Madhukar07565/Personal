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
package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.icici;

import java.security.MessageDigest;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;



/**
 *
 */
public class ICICI_SHA256_HashDecorator extends PaymentGatewayRequestFormDecorator
{
	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	private static Logger LOG = Logger.getLogger(ICICI_SHA256_HashDecorator.class);
	private static String FORMAT_DATE_KEY = "fmtDate";
	private static String STOREID_KEY = "storeId";
	private static String CHARGE_KEY = "charge";
	private static String CURRENCY_KEY = "icici_currency_code";

	public ICICI_SHA256_HashDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public ICICI_SHA256_HashDecorator()
	{
		super();
	}


	private String fmtDate;
	private String storeId;
	private String sharedSecret;
	private String charge;
	private String currency;

	@Value("#{configurationService.configuration.getProperty('paymentgateway.icici.hash.secert.key')}")
	private String SECRET_KEY;
	private static final String SHA256 = "SHA256";

	@Override
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
	{

		final String dateNow = valueMap.get("txndatetime").getValue().toString();


		this.fmtDate = dateNow;
		this.storeId = valueMap.get("storename").getValue();
		this.charge = valueMap.get("chargetotal").getValue();
		this.currency = valueMap.get("currency").getValue();
		this.sharedSecret = SECRET_KEY;

		final String generatedHash = createHash();

		if (!StringUtils.isEmpty(generatedHash))
		{
			setThisValueInSession(FORMAT_DATE_KEY, this.fmtDate);
			setThisValueInSession(STOREID_KEY, this.storeId);
			setThisValueInSession(CHARGE_KEY, this.charge);
			setThisValueInSession(CURRENCY_KEY, this.currency);

			updateFormAttributeFlags(formAttribute, generatedHash);
		}

		return formAttribute;
	}



	private String createHash()
	{
		final String stringToHash = this.storeId + this.fmtDate + this.charge + this.currency + this.sharedSecret;
		return calculateHashFromHex(new StringBuilder(stringToHash));
	}

	private String calculateHashFromHex(final StringBuilder Builder)
	{
		final String algorithm = SHA256;

		MessageDigest messageDigest = null;
		try
		{
			messageDigest = MessageDigest.getInstance(algorithm);
		}
		catch (final Exception e)
		{
			LOG.debug(e);
			throw new IllegalArgumentException("Algorithm '" + algorithm + "' not supported");
		}
		final StringBuilder result = new StringBuilder();
		final StringBuilder sb = new StringBuilder();
		final byte[] bytes = Builder.toString().getBytes();

		final int byteLen = bytes.length;
		for (int i = 0; i < byteLen; i++)
		{
			final byte b = bytes[i];
			sb.append(Character.forDigit((b & 0xF0) >> 4, 16));
			sb.append(Character.forDigit(b & 0xF, 16));
		}
		final StringBuilder locBuilder = new StringBuilder(sb.toString());
		messageDigest.update(locBuilder.toString().getBytes());
		final byte[] message = messageDigest.digest();
		final int messageLen = message.length;
		for (int j = 0; j < messageLen; j++)
		{
			final byte b = message[j];
			String apps = Integer.toHexString(b & 0xFF);
			if (apps.length() == 1)
			{
				apps = "0" + apps;
			}
			result.append(apps);
		}
		return result.toString();
	}

	public String getCharge()
	{
		return this.charge;
	}

	public String getSharedSecret()
	{
		return this.sharedSecret;
	}

	public String getStoreId()
	{
		return this.storeId;
	}

	public String getFormattedSysDate()
	{
		return this.fmtDate;
	}

}
