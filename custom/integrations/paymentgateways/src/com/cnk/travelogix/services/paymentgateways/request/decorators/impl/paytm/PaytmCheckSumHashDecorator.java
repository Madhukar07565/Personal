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
package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.paytm;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;
import com.paytm.merchant.CheckSumServiceHelper;


/**
 *
 */
public class PaytmCheckSumHashDecorator extends PaymentGatewayRequestFormDecorator
{

	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public PaytmCheckSumHashDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public PaytmCheckSumHashDecorator()
	{
		super();
		// YTODO Auto-generated constructor stub
	}

	@Value("#{configurationService.configuration.getProperty('paymentgateway.paytm.hash.checksum.key')}")
	private String CHECKSUMKEY;

	@Override
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
			throws Exception

	{


		final TreeMap<String, String> paramMap = new TreeMap<>();

		final String[] parmaRequired = formAttribute.getDefaultValue().split(PaymentGatewayService.FIELD_SEPERATOR_COMMA);

		for (final String param : parmaRequired)
		{

			paramMap.put(param, valueMap.get(param).getValue());
		}


		final String checkSumHash = getCheckSum(CHECKSUMKEY, paramMap);
		if (!StringUtils.isEmpty(checkSumHash))
		{
			updateFormAttributeFlags(formAttribute, checkSumHash);

		}

		return formAttribute;
	}

	private String getCheckSum(final String key, final TreeMap paramMap) throws Exception
	{
		final CheckSumServiceHelper checksumHelper = CheckSumServiceHelper.getCheckSumServiceHelper();
		return checksumHelper.genrateCheckSum(key, paramMap);

	}

}
