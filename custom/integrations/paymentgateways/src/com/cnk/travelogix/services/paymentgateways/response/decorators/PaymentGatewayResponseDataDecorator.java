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
package com.cnk.travelogix.services.paymentgateways.response.decorators;

import de.hybris.platform.servicelayer.session.Session;
import de.hybris.platform.servicelayer.session.SessionService;

import java.util.Map;

import javax.annotation.Resource;

import com.cnk.travelogix.integrations.payment.response.beans.ResponseAttribute;






/**
 *
 */
public abstract class PaymentGatewayResponseDataDecorator implements PaymentGatewayResponseData
{
	@Resource(name = "sessionService")
	private SessionService sessionService;

	/**
	 * @return the sessionService
	 */
	public SessionService getSessionService()
	{
		return sessionService;
	}

	protected PaymentGatewayResponseData paymentGatewayProviderResponseData;

	protected void updateResponseAttrubute(final ResponseAttribute responseAttribute, final String value)
	{
		responseAttribute.setValue(value);
		updateResponseAttrubuteFlags(responseAttribute);
	}

	protected void updateResponseAttrubute(final ResponseAttribute responseAttribute, final boolean value)
	{
		responseAttribute.setValue(Boolean.toString(value));
		updateResponseAttrubuteFlags(responseAttribute);
	}

	private void updateResponseAttrubuteFlags(final ResponseAttribute responseAttribute)
	{
		responseAttribute.setValueReady(true);
		responseAttribute.setDefaultValueFlag(false);
		responseAttribute.setDecoratorRequired(false);
	}

	public PaymentGatewayResponseDataDecorator(final PaymentGatewayResponseData paymentGatewayProviderResponseData)
	{
		this.paymentGatewayProviderResponseData = paymentGatewayProviderResponseData;
	}

	public PaymentGatewayResponseDataDecorator()
	{
		super();
	}

	@Override
	public ResponseAttribute processResponseAttibuteValue(final ResponseAttribute responseAttribute,
			final Map<String, ResponseAttribute> valueMap) throws Exception
	{
		return paymentGatewayProviderResponseData.processResponseAttibuteValue(responseAttribute, valueMap);
	}

	public String getThisKeyValueFromSession(final String key, final boolean deleteFlag)
	{

		final Session session = getSessionService().getCurrentSession();

		if (session != null)
		{
			final String value = session.getAttribute(key);

			if (deleteFlag)
			{

				session.removeAttribute(key);
			}
			return value;
		}
		return "";
	}

}
