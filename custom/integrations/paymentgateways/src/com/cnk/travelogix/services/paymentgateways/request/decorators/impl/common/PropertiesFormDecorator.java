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
package com.cnk.travelogix.services.paymentgateways.request.decorators.impl.common;

import de.hybris.platform.servicelayer.config.ConfigurationService;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;



/**
 *
 */
public class PropertiesFormDecorator extends PaymentGatewayRequestFormDecorator
{

	/**
	 * @param paymentGatewayProviderRequestForm
	 */
	public PropertiesFormDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public PropertiesFormDecorator()
	{
		super();
	}

	private ConfigurationService configurationService;

	/**
	 * @return the configurationService
	 */
	@Override
	public ConfigurationService getConfigurationService()
	{
		return configurationService;
	}

	/**
	 * @param configurationService
	 *           the configurationService to set
	 */
	public void setConfigurationService(final ConfigurationService configurationService)
	{
		this.configurationService = configurationService;
	}



	@Override
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
	{

		final String propertiesKey = formAttribute.getDefaultValue();
		final String propertiesKeyValue = getConfigurationService().getConfiguration().getString(propertiesKey).trim();

		if (!StringUtils.isEmpty(propertiesKeyValue))
		{
			updateFormAttributeFlags(formAttribute, propertiesKeyValue);
		}
		return formAttribute;
	}

}
