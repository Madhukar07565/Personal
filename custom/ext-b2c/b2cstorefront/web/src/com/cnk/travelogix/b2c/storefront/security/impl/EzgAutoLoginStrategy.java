/**
 *
 */
package com.cnk.travelogix.b2c.storefront.security.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

import com.cnk.travelogix.b2c.storefront.security.EzgUsernameAuthenticationToken;


/**
 * @author i322561
 *
 */
public class EzgAutoLoginStrategy extends DefaultAutoLoginStrategy
{
	private static final Logger LOG = Logger.getLogger(EzgAutoLoginStrategy.class);

	public void loginWithoutPwd(final String username, final HttpServletRequest request, final HttpServletResponse response)
	{
		final EzgUsernameAuthenticationToken token = new EzgUsernameAuthenticationToken(username);
		token.setDetails(new WebAuthenticationDetails(request));
		try
		{
			final Authentication authentication = getAuthenticationManager().authenticate(token);
			SecurityContextHolder.getContext().setAuthentication(authentication);
			getCustomerFacade().loginSuccess();
			getGuidCookieStrategy().setCookie(request, response);
			getRememberMeServices().loginSuccess(request, response, token);
		}
		catch (final Exception e)
		{
			SecurityContextHolder.getContext().setAuthentication(null);
			LOG.error("Failure during autoLogin", e);
		}
	}
}
