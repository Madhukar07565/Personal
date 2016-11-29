/**
 *
 */
package com.cnk.travelogix.b2c.storefront.security;

import de.hybris.platform.acceleratorstorefrontcommons.security.StorefrontAuthenticationSuccessHandler;
import de.hybris.platform.commercefacades.order.data.CartData;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;


/**
 * @author i323801
 *
 */
public class B2CStorefrontAuthenticationSuccessHandler extends StorefrontAuthenticationSuccessHandler
{
	private static final String MINICART_PROD_COUNT = "minicartProdCount";

	@Override
	public void onAuthenticationSuccess(final HttpServletRequest request, final HttpServletResponse response,
			final Authentication authentication) throws IOException, ServletException
	{
		super.onAuthenticationSuccess(request, response, authentication);
		final CartData cartdata = getCartFacade().getMiniCart();
		Integer count = 0;
		if (cartdata != null)
		{
			count = cartdata.getTotalUnitCount();
		}
		request.getSession().setAttribute(MINICART_PROD_COUNT, count);
	}

	@Override
	protected void handle(final HttpServletRequest request, final HttpServletResponse response,
			final Authentication authentication) throws IOException, ServletException
	{
		return;
	}

}
