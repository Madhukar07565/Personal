package com.cnk.travelogix.fb.security;

import java.util.Collection;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;


/**
 *FacebookAuthenticationToken class
 */
public class FacebookAuthenticationToken extends AbstractAuthenticationToken
{
	private static final long serialVersionUID = 320L;
	private Object principal;
	private Object credentials;

	
	/**
	 * @param principal
	 * @param credentials
	 */
	public FacebookAuthenticationToken(final Object principal, final Object credentials)
	{
		super(null);
		this.principal = principal;
		this.credentials = credentials;
		setAuthenticated(false);
	}
   /**
    * @param principal
    * @param credentials
    * @param authorities
    */
	public FacebookAuthenticationToken(final Object principal, final Object credentials,
			final Collection<? extends GrantedAuthority> authorities)
	{
		super(authorities);
		this.principal = principal;
		this.credentials = credentials;
		super.setAuthenticated(true);
	}

	public Object getCredentials()
	{
		return this.credentials;
	}

	public Object getPrincipal()
	{
		return this.principal;
	}

	@Override
	public void setAuthenticated(final boolean isAuthenticated) throws IllegalArgumentException
	{
		if (isAuthenticated)
		{
			throw new IllegalArgumentException(
					"Once created you cannot set this token to authenticated. Create a new instance using the constructor which takes a GrantedAuthority list will mark this as authenticated.");
		}

		super.setAuthenticated(false);
	}

	@Override
	public void eraseCredentials()
	{
		super.eraseCredentials();
		this.credentials = null;
	}
	
	/**
	 * @param principal
	 *           the principal to set
	 */
	public void setPrincipal(final Object principal)
	{
		this.principal = principal;
	}

}
