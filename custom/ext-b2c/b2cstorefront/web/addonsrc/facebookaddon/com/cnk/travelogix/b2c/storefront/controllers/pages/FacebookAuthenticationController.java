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

import com.cnk.travelogix.service.FacebookTokenGenerator;

/**
 * Facebook Authentication Controller class 
 * is to get the access token from facebook and login into the hybris system
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/facebookoauth2callback")
public class FacebookAuthenticationController extends AbstractPageController
{
	private static final Logger LOG = Logger.getLogger(FacebookAuthenticationController.class);
	public static final String REDIRECT_PREFIX = "redirect:";

	@Resource
	HttpSessionRequestCache accHttpSessionRequestCache;

	@Resource(name = "facebookAutoLoginStrategy")
	AutoLoginStrategy facebookAutoLoginStrategy;

	@Resource(name = "fbTokenGenerator")
	FacebookTokenGenerator fbTokenGenerator;

	/**
	 * @param request
	 * @param response
	 * @return 
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String getRequest(final HttpServletRequest request, final HttpServletResponse response)
	{
		final String code = request.getParameter("code");
		LOG.info("code........" + code);
		if (code == null)
		{
			LOG.info("Invalid Token !!!");
			return "redirect:/login";
		}
		final String accessToken = fbTokenGenerator.getAccessToken(code);
		LOG.info("****Access Token***"+accessToken);
		facebookAutoLoginStrategy.login("Google",accessToken,request,response);
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