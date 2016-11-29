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

import de.hybris.platform.acceleratorservices.urlresolver.SiteBaseUrlResolutionService;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.session.Session;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.site.BaseSiteService;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.integrations.payment.request.beans.FormAttribute;
import com.cnk.travelogix.services.paymentgateways.PaymentGatewayService;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestForm;
import com.cnk.travelogix.services.paymentgateways.request.decorators.PaymentGatewayRequestFormDecorator;



/**
 *
 */
public class SiteURLDecorator extends PaymentGatewayRequestFormDecorator
{
	/**
	 * @param paymentGatewayProviderRequestForm
	 */

	@Resource(name = "sessionService")
	private SessionService sessionService;

	public SiteURLDecorator(final PaymentGatewayRequestForm paymentGatewayProviderRequestForm)
	{
		super(paymentGatewayProviderRequestForm);
		// YTODO Auto-generated constructor stub
	}

	public SiteURLDecorator()
	{
		super();
	}

	private BaseSiteService baseSiteService;
	private SiteBaseUrlResolutionService siteBaseUrlResolutionService;
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


	/**
	 * @return the baseSiteService
	 */
	public BaseSiteService getBaseSiteService()
	{
		return baseSiteService;
	}

	/**
	 * @param baseSiteService
	 *           the baseSiteService to set
	 */
	public void setBaseSiteService(final BaseSiteService baseSiteService)
	{
		this.baseSiteService = baseSiteService;
	}

	/**
	 * @return the siteBaseUrlResolutionService
	 */
	public SiteBaseUrlResolutionService getSiteBaseUrlResolutionService()
	{
		return siteBaseUrlResolutionService;
	}

	/**
	 * @param siteBaseUrlResolutionService
	 *           the siteBaseUrlResolutionService to set
	 */
	public void setSiteBaseUrlResolutionService(final SiteBaseUrlResolutionService siteBaseUrlResolutionService)
	{
		this.siteBaseUrlResolutionService = siteBaseUrlResolutionService;
	}

	@Override
	public FormAttribute processRequestAttibuteValue(final FormAttribute formAttribute, final Map<String, FormAttribute> valueMap)
	{
		final String URLPattren = getBaseSiteURLFromSession() + PaymentGatewayService.RESPONSE_CONTROLLER_PATTREN
				+ formAttribute.getDefaultValue();

		if (StringUtils.isNotEmpty(URLPattren))
		{
			updateFormAttributeFlags(formAttribute, URLPattren);

		}

		return formAttribute;
	}

	private String getBaseSiteURLFromSession()
	{
		final Session session = sessionService.getCurrentSession();
		if (session != null)
		{
			return session.getAttribute(PaymentGatewayService.BASE_SITE_URL);
		}
		// YTODO Auto-generated method stub
		return PaymentGatewayService.PAYMENT_GATEWAY_EMPTY_STRING;
	}

}
