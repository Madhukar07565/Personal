/**
 *
 */
package com.cnk.travelogix.b2c.storefront.controllers.pages;


import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.security.AutoLoginStrategy;
import de.hybris.platform.core.GenericSearchConstants.LOG;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnk.travelogix.service.GoogleUserService;


/**
 * GoogleAuthenticationController class is to login in to hybris site using the gmail user details
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/googleoauth2callback")
public class GoogleAuthenticationController extends AbstractPageController
{
	private static final Logger LOG = Logger.getLogger(GoogleAuthenticationController.class);

	public static final String REDIRECT_PREFIX = "redirect:";

	@Resource(name = "googleAutoLoginStrategy")
	AutoLoginStrategy googleAutoLoginStrategy;

	@Resource
	HttpSessionRequestCache accHttpSessionRequestCache;

	@Resource
	private GoogleUserService googlePlusUserService;

	/**
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String getRequest(final HttpServletRequest request, final HttpServletResponse response)
	{
		final String token = request.getParameter("token");
		if (token == null)
		{
			LOG.info("Invalid Token !!!");
			return "redirect:/login";
		}
		googleAutoLoginStrategy.login("Google", token, request, response);

		return REDIRECT_PREFIX + getSuccessRedirect(request, response);
	}

	protected String getSuccessRedirect(final HttpServletRequest request, final HttpServletResponse response)
	{
		if (accHttpSessionRequestCache.getRequest(request, response) != null)
		{
			return accHttpSessionRequestCache.getRequest(request, response).getRedirectUrl();
		}
		return "/";
	}
}

