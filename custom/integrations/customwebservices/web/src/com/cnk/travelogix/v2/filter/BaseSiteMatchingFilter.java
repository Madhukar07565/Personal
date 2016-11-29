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
package com.cnk.travelogix.v2.filter;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.webservicescommons.util.YSanitizer;
import com.cnk.travelogix.exceptions.InvalidResourceException;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Required;

/**
 * Filter that resolves base site id from the requested url and activates it.
 */
public class BaseSiteMatchingFilter extends AbstractUrlMatchingFilter {
	private String regexp;
	private BaseSiteService baseSiteService;

	@Override
	protected void doFilterInternal(final HttpServletRequest request, final HttpServletResponse response,
			final FilterChain filterChain) throws ServletException, IOException {
		@SuppressWarnings("rawtypes")
		Enumeration headerNames = request.getHeaderNames();
		String value = null;
		while (headerNames.hasMoreElements()) {
			String key = (String) headerNames.nextElement();
			if (key.equalsIgnoreCase("custom")) {
				value = request.getHeader(key);
				break;
			}

		}
		if (value != null && value.equalsIgnoreCase("true")) {
			// No Basesite validation
		}
		
		else
		{
			final String baseSiteID = getValue(request, regexp);

			if (baseSiteID != null) {
				final BaseSiteModel requestedBaseSite = getBaseSiteService().getBaseSiteForUID(baseSiteID);
				if (requestedBaseSite != null) {
					final BaseSiteModel currentBaseSite = getBaseSiteService().getCurrentBaseSite();

					if (!requestedBaseSite.equals(currentBaseSite)) {
						getBaseSiteService().setCurrentBaseSite(requestedBaseSite, true);
					}
				} else {
					throw new InvalidResourceException(YSanitizer.sanitize(baseSiteID));
				}
			}
		}

		filterChain.doFilter(request, response);
	}

	protected String getRegexp() {
		return regexp;
	}

	@Required
	public void setRegexp(final String regexp) {
		this.regexp = regexp;
	}

	protected BaseSiteService getBaseSiteService() {
		return baseSiteService;
	}

	@Required
	public void setBaseSiteService(final BaseSiteService baseSiteService) {
		this.baseSiteService = baseSiteService;
	}
}
