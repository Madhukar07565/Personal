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
package com.cnk.travelogix.b2c.storefront.filters;

import de.hybris.platform.acceleratorstorefrontcommons.history.BrowseHistory;
import de.hybris.platform.acceleratorstorefrontcommons.history.BrowseHistoryEntry;
import de.hybris.platform.cms2.misc.CMSFilter;
import de.hybris.platform.commercefacades.storesession.StoreSessionFacade;
import de.hybris.platform.servicelayer.config.ConfigurationService;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.CookieGenerator;

import com.cnk.travelogix.client.config.core.login.model.LoginConfigModel;
import com.cnk.travelogix.client.masters.core.enums.AllowedThirdParties;
import com.cnk.travelogix.common.facades.account.CnKAccountFacade;


/**
 * Filter that initializes the session for the b2cstorefront. This is a spring configured filter that is executed by the
 * PlatformFilterChain.
 */
public class StorefrontFilter extends OncePerRequestFilter
{
	public static final String AJAX_REQUEST_HEADER_NAME = "X-Requested-With";
	public static final String ORIGINAL_REFERER = "originalReferer";
	public static final String ALLOW_REMEMBERME = "allowRememberMe";
	public static final String ALLOW_THIRD_PARTY = "allowThirdParty";
	public static final String ALLOWED_THIRD_PARTIES = "allowedThirdPatries";

	private StoreSessionFacade storeSessionFacade;
	private BrowseHistory browseHistory;
	private CookieGenerator cookieGenerator;

	@Resource
	private ConfigurationService configurationService;

	@Resource(name = "cnKAccountFacade")
	private CnKAccountFacade cnKAccountFacade;

	@Override
	public void doFilterInternal(final HttpServletRequest request, final HttpServletResponse response,
			final FilterChain filterChain) throws IOException, ServletException
	{
		final HttpSession session = request.getSession();
		final String queryString = request.getQueryString();

		if (isSessionNotInitialized(session, queryString))
		{
			initDefaults(request);

			markSessionInitialized(session);
		}

		final String url = configurationService.getConfiguration()
				.getString("com.cnk.travelogix.common.core.recaptcha.CaptchaPath");
		if (isCaptchaUrl(url, request))
		{
			request.setAttribute("captchaUrlFrontEnd",
					configurationService.getConfiguration().getString("com.cnk.travelogix.common.core.recaptcha.CaptchaUrlFrontEnd"));// for JSP usage
			request.setAttribute("captchaKeyFrontEnd",
					configurationService.getConfiguration().getString("com.cnk.travelogix.common.core.recaptcha.CaptchaSiteKey"));// for JSP usage
			request.setAttribute("captchaTheme",
					configurationService.getConfiguration().getString("com.cnk.travelogix.common.core.recaptcha.CaptchaTheme"));//light, dark
			request.setAttribute("captchaLanguage",
					configurationService.getConfiguration().getString("com.cnk.travelogix.common.core.recaptcha.CaptchaLanguage"));//
			request.setAttribute("captchaSize",
					configurationService.getConfiguration().getString("com.cnk.travelogix.common.core.recaptcha.CaptchaSize"));// normal, compact
		}

		// For secure requests ensure that the JSESSIONID cookie is visible to insecure requests
		if (isRequestSecure(request))
		{
			fixSecureHttpJSessionIdCookie(request, response);
		}

		if (isGetMethod(request))
		{
			if (StringUtils.isBlank(request.getHeader(AJAX_REQUEST_HEADER_NAME)))
			{
				final String requestURL = request.getRequestURL().toString();
				session.setAttribute(ORIGINAL_REFERER,
						StringUtils.isNotBlank(queryString) ? requestURL + "?" + queryString : requestURL);
			}

			getBrowseHistory().addBrowseHistoryEntry(new BrowseHistoryEntry(request.getRequestURI(), null));
		}

		//get login configuration
		final LoginConfigModel loginConfig = cnKAccountFacade.getLoginConfig();
		if (loginConfig != null)
		{
			session.setAttribute(ALLOW_REMEMBERME, loginConfig.getKeepUserSignInAllowed());
			session.setAttribute(ALLOW_THIRD_PARTY, loginConfig.getThirdPartyLoginAllowed());
			final Set<AllowedThirdParties> allowedThirdPatries = loginConfig.getAllowedThirdParties();
			String thirdPatries = "";
			for (final AllowedThirdParties thirdPatry : allowedThirdPatries)
			{
				thirdPatries = thirdPatries + thirdPatry.getCode() + "-";
			}
			session.setAttribute(ALLOWED_THIRD_PARTIES, thirdPatries);
		}

		filterChain.doFilter(request, response);
	}

	private boolean isCaptchaUrl(final String url, final HttpServletRequest request)
	{
		if (url.contains(request.getContextPath()))
		{
			return true;
		}
		return false;
	}

	protected boolean isGetMethod(final HttpServletRequest httpRequest)
	{
		return "GET".equalsIgnoreCase(httpRequest.getMethod());
	}

	protected boolean isRequestSecure(final HttpServletRequest httpRequest)
	{
		return httpRequest.isSecure();
	}

	protected boolean isSessionNotInitialized(final HttpSession session, final String queryString)
	{
		return session.isNew() || StringUtils.contains(queryString, CMSFilter.CLEAR_CMSSITE_PARAM)
				|| !isSessionInitialized(session);
	}

	@Required
	public void setStoreSessionFacade(final StoreSessionFacade storeSessionFacade)
	{
		this.storeSessionFacade = storeSessionFacade;
	}

	@Required
	public void setBrowseHistory(final BrowseHistory browseHistory)
	{
		this.browseHistory = browseHistory;
	}

	protected void initDefaults(final HttpServletRequest request)
	{
		getStoreSessionFacade().initializeSession(Collections.list(request.getLocales()));
	}

	protected StoreSessionFacade getStoreSessionFacade()
	{
		return storeSessionFacade;
	}

	protected BrowseHistory getBrowseHistory()
	{
		return browseHistory;
	}


	protected boolean isSessionInitialized(final HttpSession session)
	{
		return session.getAttribute(this.getClass().getName()) != null;
	}

	protected void markSessionInitialized(final HttpSession session)
	{
		session.setAttribute(this.getClass().getName(), "initialized");
	}

	protected void fixSecureHttpJSessionIdCookie(final HttpServletRequest httpServletRequest,
			final HttpServletResponse httpServletResponse)
	{
		final HttpSession session = httpServletRequest.getSession(false);
		if (session != null)
		{
			getCookieGenerator().addCookie(httpServletResponse, session.getId());
		}

	}


	protected CookieGenerator getCookieGenerator()
	{
		return cookieGenerator;
	}

	@Required
	public void setCookieGenerator(final CookieGenerator cookieGenerator)
	{
		this.cookieGenerator = cookieGenerator;
	}
}
