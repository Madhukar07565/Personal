/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.cnk.travelogix.common.core.payment.strategies.impl;

import de.hybris.platform.acceleratorservices.config.SiteConfigService;
import de.hybris.platform.acceleratorservices.payment.constants.PaymentConstants;
import de.hybris.platform.acceleratorservices.urlresolver.SiteBaseUrlResolutionService;
import de.hybris.platform.site.BaseSiteService;

import java.net.URI;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.util.UriComponentsBuilder;

import com.cnk.travelogix.common.core.payment.data.PaymentServerSetting;
import com.cnk.travelogix.common.core.payment.ezg.impl.AmexPaymentProvider;
import com.cnk.travelogix.common.core.payment.strategies.CnkPaymentFormActionUrlStrategy;


public class CustomCnkPaymentFormActionUrlStrategy implements CnkPaymentFormActionUrlStrategy
{
	private BaseSiteService baseSiteService;
	private SiteBaseUrlResolutionService siteBaseUrlResolutionService;
	private SiteConfigService siteConfigService;

	protected BaseSiteService getBaseSiteService()
	{
		return baseSiteService;
	}

	@Required
	public void setBaseSiteService(final BaseSiteService baseSiteService)
	{
		this.baseSiteService = baseSiteService;
	}

	protected SiteBaseUrlResolutionService getSiteBaseUrlResolutionService()
	{
		return siteBaseUrlResolutionService;
	}

	@Required
	public void setSiteBaseUrlResolutionService(final SiteBaseUrlResolutionService siteBaseUrlResolutionService)
	{
		this.siteBaseUrlResolutionService = siteBaseUrlResolutionService;
	}

	protected SiteConfigService getSiteConfigService()
	{
		return siteConfigService;
	}

	@Required
	public void setSiteConfigService(final SiteConfigService siteConfigService)
	{
		this.siteConfigService = siteConfigService;
	}

	@Override
	public String getHopRequestUrl(final String cardType)
	{
		final String urlStr = getSiteConfigService().getProperty(PaymentConstants.PaymentProperties.HOP_POST_URL);
		final PaymentServerSetting setting = getPaymentServerSetting(cardType);
		final String requestUrl = setting.getPaymentServerUrl();
		if (StringUtils.isNotEmpty(requestUrl))
		{
			return requestUrl;
		}
		return String.valueOf(getAdjustRequestURI(urlStr));
	}

	/**
	 * @param card
	 * @return
	 */
	private PaymentServerSetting getPaymentServerSetting(final String card)
	{
		if ("Amex".equals(card))
		{
			return new AmexPaymentProvider().getPaymentServerSetting();
		}
		return new PaymentServerSetting();
	}

	@Override
	public String getSopRequestUrl(final String clientRef)
	{
		final String urlStr = getSiteConfigService().getProperty(PaymentConstants.PaymentProperties.SOP_POST_URL);
		if (StringUtils.isNotEmpty(urlStr))
		{
			return String.valueOf(getAdjustRequestURI(urlStr));
		}
		return null;
	}

	protected URI getAdjustRequestURI(final String urlStr)
	{
		if (urlStr.charAt(0) == '/')
		{
			// Relative path
			final String siteBaseUrl = getSiteBaseUrlResolutionService()
					.getWebsiteUrlForSite(getBaseSiteService().getCurrentBaseSite(), true, "/");

			// Push the site relative path into the URL
			return UriComponentsBuilder.fromHttpUrl(siteBaseUrl).replacePath(urlStr).build().toUri();
		}
		return URI.create(urlStr);
	}
}
