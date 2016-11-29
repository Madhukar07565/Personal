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
package com.cnk.travelogix.services.paymentgateways.response;

import java.io.IOException;
import java.util.Map;

import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;

import com.cnk.travelogix.integrations.payment.response.beans.PaymentServiceResponseData;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;




/**
 *
 */
public class PaymentGatewayProviderResponseService extends PaymentGatewayService
{

	private static final Logger LOG = Logger.getLogger(PaymentGatewayProviderResponseService.class);
	private Map<String, String> paymentGatewayProviderResponseTemplateMap;
	private PaymentResponseDataGeneratorService paymentResponseDataGeneratorService;



	/**
	 * @return the paymentResponseDataGeneratorService
	 */
	public PaymentResponseDataGeneratorService getPaymentResponseDataGeneratorService()
	{
		return paymentResponseDataGeneratorService;
	}

	/**
	 * @param paymentResponseDataGeneratorService
	 *           the paymentResponseDataGeneratorService to set
	 */
	public void setPaymentResponseDataGeneratorService(
			final PaymentResponseDataGeneratorService paymentResponseDataGeneratorService)
	{
		this.paymentResponseDataGeneratorService = paymentResponseDataGeneratorService;
	}

	/**
	 * @return the paymentGatewayProviderResponseTemplateMap
	 */
	public Map<String, String> getPaymentGatewayProviderResponseTemplateMap()
	{
		return paymentGatewayProviderResponseTemplateMap;
	}

	/**
	 * @param paymentGatewayProviderResponseTemplateMap
	 *           the paymentGatewayProviderResponseTemplateMap to set
	 */
	public void setPaymentGatewayProviderResponseTemplateMap(final Map<String, String> paymentGatewayProviderResponseTemplateMap)
	{
		this.paymentGatewayProviderResponseTemplateMap = paymentGatewayProviderResponseTemplateMap;
	}

	/**
	 * @param responseParams
	 * @param paymentProviderName
	 * @return
	 * @throws IOException
	 */
	public PaymentServiceResponseData getPaymentTransactionDatat(final Map<String, String> responseParams,
			final String paymentProviderID) throws IOException
	{
		final Document document = getJsoupDocumentWithPaymentProviderId(
				getPaymentGatewayProviderResponseTemplateMap().get(paymentProviderID));

		if (document.hasText())
		{

			return getPaymentResponseDataGeneratorService().getPaymentTransactionData(document, paymentProviderID, responseParams);
		}

		LOG.debug("Document empty !");

		return null;
	}

}
