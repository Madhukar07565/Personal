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
package com.cnk.travelogix.services.paymentgateways.request.decorators;

import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.session.Session;
import de.hybris.platform.servicelayer.session.SessionService;

import java.util.Map;

import javax.annotation.Resource;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;






/**
 *
 */
public abstract class PaymentGatewayRequestFormDecorator implements PaymentGatewayRequestForm
{
	@Resource(name = "sessionService")
	private SessionService sessionService;

	@Resource(name = "configurationService")
	private ConfigurationService configurationService;

	/**
	 * @return the configurationService
	 */
	public ConfigurationService getConfigurationService()
	{
		return configurationService;
	}

	/**
	 * @return the sessionService
	 */
	public SessionService getSessionService()
	{
		return sessionService;
	}

	protected PaymentGatewayRequestForm paymentGatewayProviderRequestForm;

	protected void updateFormAttributeFlags(final FormAttribute formAttribute, final String value)
	{
		formAttribute.setValue(value);
		formAttribute.setValueReady(true);
		formAttribute.setDefaultValueFlag(false);
		formAttribute.setDecoratorRequired(false);

	}

	public PaymentGatewayRequestFormDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		this.paymentGatewayProviderRequestForm = paymentGatewayProviderRequestForm;
	}

	public PaymentGatewayRequestFormDecorator()
	{
		super();
	}

	@Override
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
			throws Exception
	{
		return paymentGatewayProviderRequestForm.processRequestAttibuteValue(formAttribute, valueMap);
	}

	public void setThisValueInSession(final String key, final String value)
	{

		final Session session = getSessionService().getCurrentSession();

		if (session != null)
		{
			session.setAttribute(key, value);
		}
	}

}
