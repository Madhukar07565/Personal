/**
 *
 */
package com.cnk.travelogix.b2c.storefront.security;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.session.SessionService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.cnk.travelogix.b2c.facades.customer.B2cCustomerFacade;
import com.cnk.travelogix.common.core.util.JsonUtil;


/**
 * @author i322561
 *
 */
public class AjaxAuthenticationFilter extends UsernamePasswordAuthenticationFilter
{
	@Resource(name = "customerFacade")
	private B2cCustomerFacade customerFacade;
	@Resource(name = "sessionService")
	private SessionService sessionService;

	@Override
	protected void successfulAuthentication(final HttpServletRequest request, final HttpServletResponse response,
			final FilterChain chain, final Authentication authResult) throws IOException, ServletException
	{
		super.successfulAuthentication(request, response, null, authResult);
		if ("XMLHttpRequest".equals(request.getHeader("X-Requested-With")))
		{
			final Map<String, String> message = new HashMap<String, String>();
			message.put("success", "1");
			final String userName = ((CustomerModel) sessionService.getAttribute("user")).getName();
			message.put("userName", userName == null ? "" : userName);

			if (customerFacade.getUserActivationStatus(request.getParameter("j_username")))
			{
				if (customerFacade.checkUserFirstLogin())
				{
					message.put("firstLogin", "1");
				}
			}
			else
			{
				message.put("redirect2Settings", "1");
			}


			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(JsonUtil.toJson(message));
			response.getWriter().flush();
		}
	}

	@Override
	protected void unsuccessfulAuthentication(final HttpServletRequest request, final HttpServletResponse response,
			final AuthenticationException failed) throws IOException, ServletException
	{
		super.unsuccessfulAuthentication(request, response, failed);
		if ("XMLHttpRequest".equals(request.getHeader("X-Requested-With")))
		{
			final Map<String, String> message = new HashMap<String, String>();
			message.put("success", "0");
			if (failed instanceof BadCredentialsException)
			{
				message.put("badCredential", "1");
				message.put("userName", request.getParameter("j_username"));
			}
			else if (failed instanceof DisabledException)
			{

				customerFacade.sendAccountLockedInformingEmail(request.getParameter("j_username"));
				message.put("userName", request.getParameter("j_username"));
				message.put("userLocked", "1");
			}

			response.setContentType("json");
			response.getWriter().write(JsonUtil.toJson(message));
			response.getWriter().flush();
		}
	}
}
