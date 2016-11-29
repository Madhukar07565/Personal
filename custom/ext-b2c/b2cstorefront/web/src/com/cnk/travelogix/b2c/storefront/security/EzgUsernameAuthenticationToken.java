/**
 *
 */
package com.cnk.travelogix.b2c.storefront.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;


/**
 * @author i322561
 *
 */
public class EzgUsernameAuthenticationToken extends UsernamePasswordAuthenticationToken
{
	private final Object principal;

	/**
	 * @param principal
	 */
	public EzgUsernameAuthenticationToken(final Object principal)
	{
		super(null, null);
		this.principal = principal;
		setAuthenticated(false);
	}

	/**
	 * @return the principal
	 */
	@Override
	public Object getPrincipal()
	{
		return this.principal;
	}

}
