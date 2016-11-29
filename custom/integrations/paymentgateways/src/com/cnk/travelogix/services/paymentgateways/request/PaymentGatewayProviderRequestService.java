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
package com.cnk.travelogix.services.paymentgateways.request;

import java.io.IOException;
import java.util.Map;

import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.integrations.payment.request.beans.PaymentUserSelectedData;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;




/**
 *
 */
public class PaymentGatewayProviderRequestService extends PaymentGatewayService
{
	private PaymentRequestFormGeneratorService paymentRequestFormGeneratorService;
	private static final Logger LOG = Logger.getLogger(PaymentGatewayProviderRequestService.class);

	private Map<String, String> paymentGatewayProviderRequestTemplateMap;


	/**
	 * @return the paymentGatewayProviderTemplateMap
	 */
	public Map<String, String> getPaymentGatewayProviderRequestTemplateMap()
	{
		return paymentGatewayProviderRequestTemplateMap;
	}



	public void setPaymentGatewayProviderRequestTemplateMap(final Map<String, String> paymentGatewayProviderRequestTemplateMap)
	{
		this.paymentGatewayProviderRequestTemplateMap = paymentGatewayProviderRequestTemplateMap;
	}


	/**
	 * @return the paymentFormGeneratorService
	 */



	public Map<String, Map<String, FormAttribute>> getPaymentGatewayFormUnprocessedMap(final String id) throws IOException
	{

		final Document document = getJsoupDocumentWithPaymentProviderId(getPaymentGatewayProviderRequestTemplateMap().get(id));

		if (document.hasText())
		{

			return getPaymentRequestFormGeneratorService().getSubmitFormForPaymentProviderUnprocessedMap(document, id);
		}

		LOG.debug("Document empty !");

		return null;
	}

	public String getPaymentSubmitForm(final Map<String, Map<String, FormAttribute>> unProccessedMap) throws IOException
	{

		return getPaymentRequestFormGeneratorService().getSubmitFormForPaymentProviderForm(unProccessedMap);

	}


	/**
	 * @return the paymentRequestFormGeneratorService
	 */
	public PaymentRequestFormGeneratorService getPaymentRequestFormGeneratorService()
	{
		return paymentRequestFormGeneratorService;
	}



	/**
	 * @param paymentRequestFormGeneratorService
	 *           the paymentRequestFormGeneratorService to set
	 */
	public void setPaymentRequestFormGeneratorService(final PaymentRequestFormGeneratorService paymentRequestFormGeneratorService)
	{
		this.paymentRequestFormGeneratorService = paymentRequestFormGeneratorService;
	}

	public Map<String, Map<String, FormAttribute>> getUserSelectedValuesUpdatedPaymentFormMap(
			final Map<String, Map<String, FormAttribute>> unProccessedMap, final PaymentUserSelectedData paymentUserSelectedData)
			throws IOException
	{

		return getPaymentRequestFormGeneratorService().updateUserSelectionValuesIntoMap(unProccessedMap, paymentUserSelectedData);

	}

}
