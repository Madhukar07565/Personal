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
package com.cnk.travelogix.b2c.storefront.security;

import de.hybris.platform.acceleratorstorefrontcommons.security.AbstractAcceleratorAuthenticationProvider;
import de.hybris.platform.core.Constants;
import de.hybris.platform.core.Registry;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.jalo.JaloConnection;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.user.LoginToken;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.jalo.user.UserManager;
import de.hybris.platform.oauthauthorizationserver.security.BruteForceAttackCounter;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.spring.security.CoreUserDetails;

import java.util.Collections;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsChecker;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.cnk.travelogix.client.config.core.login.model.LoginConfigModel;
import com.cnk.travelogix.client.masters.core.enums.LoginParameters;
import com.cnk.travelogix.common.facades.account.CnKAccountFacade;


/**
 * Derived authentication provider supporting additional authentication checks. See
 * {@link de.hybris.platform.spring.security.RejectUserPreAuthenticationChecks}.
 *
 * <ul>
 * <li>prevent login without password for users created via CSCockpit</li>
 * <li>prevent login as user in group admingroup</li>
 * </ul>
 *
 * any login as admin disables SearchRestrictions and therefore no page can be viewed correctly
 */
public class AcceleratorAuthenticationProvider extends AbstractAcceleratorAuthenticationProvider
{
	private static final Logger LOG = Logger.getLogger(AcceleratorAuthenticationProvider.class);

	private static final String ROLE_ADMIN_GROUP = "ROLE_" + Constants.USER.ADMIN_USERGROUP.toUpperCase();

	private GrantedAuthority adminAuthority = new SimpleGrantedAuthority(ROLE_ADMIN_GROUP);
	private BruteForceAttackCounter bruteForceAttackCounter;
	private final UserDetailsChecker postAuthenticationChecks = new DefaultPostAuthenticationChecks();

	private static final Pattern EMAIL_REGEX = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
	private static final Pattern MOBILE_REGEX = Pattern.compile("^[0-9]*$");

	@Resource(name = "cnKAccountFacade")
	private CnKAccountFacade cnKAccountFacade;

	/**
	 * @see de.hybris.platform.acceleratorstorefrontcommons.security.AbstractAcceleratorAuthenticationProvider#additionalAuthenticationChecks(org.springframework.security.core.userdetails.UserDetails,
	 *      org.springframework.security.authentication.AbstractAuthenticationToken)
	 */
	@Override
	protected void additionalAuthenticationChecks(final UserDetails details, final AbstractAuthenticationToken authentication)
			throws AuthenticationException
	{
		super.additionalAuthenticationChecks(details, authentication);

		// Check if the user is in role admingroup
		if (getAdminAuthority() != null && details.getAuthorities().contains(getAdminAuthority()))
		{
			throw new LockedException("Login attempt as " + Constants.USER.ADMIN_USERGROUP + " is rejected");
		}

		//TRAV-300: check user valid status
		if (!checkUserValidStatus(authentication.getName()))
		{
			throw new BadCredentialsException(messages.getMessage("CoreAuthenticationProvider.badCredentials", "Bad credentials"));
		}
	}

	private boolean checkUserValidStatus(final String userName)
	{
		boolean validUserStatus = true;
		final LoginConfigModel loginConfig = cnKAccountFacade.getLoginConfig();
		if (loginConfig != null)
		{
			final Set<LoginParameters> params = loginConfig.getLoginParameters();
			for (final LoginParameters param : params)
			{
				if ("EMAIL".equals(param.getCode().toUpperCase()))
				{
					final Matcher matcher = EMAIL_REGEX.matcher(userName);
					validUserStatus = matcher.matches();
				}
				else if ("PHONE_NO".equals(param.getCode().toUpperCase()))
				{
					final Matcher matcher = MOBILE_REGEX.matcher(userName);
					validUserStatus = matcher.matches();
				}
			}
		}

		return validUserStatus;
	}

	@Override
	public Authentication authenticate(final Authentication authentication) throws AuthenticationException
	{

		if (authentication instanceof EzgUsernameAuthenticationToken)
		{
			final String username = (authentication.getPrincipal() == null) ? "NONE_PROVIDED" : authentication.getName();
			this.checkAttack(authentication);

			final UserDetails loadedUser = this.getUserDetailsService().loadUserByUsername(username);
			return createSuccessAuthentication(authentication, loadedUser);
		}
		else
		{
			this.checkAttack(authentication);

			if (Registry.hasCurrentTenant() && JaloConnection.getInstance().isSystemInitialized())
			{
				final String username = (authentication.getPrincipal() == null) ? "NONE_PROVIDED" : authentication.getName();

				UserDetails userDetails = null;

				try
				{
					userDetails = retrieveUser(username);
				}
				catch (final UsernameNotFoundException notFound)
				{
					throw new BadCredentialsException(
							messages.getMessage("CoreAuthenticationProvider.badCredentials", "Bad credentials"), notFound);
				}

				getPreAuthenticationChecks().check(userDetails);

				final User user = UserManager.getInstance().getUserByLogin(userDetails.getUsername());
				// FORM based check
				final Object credential = authentication.getCredentials();

				if (credential instanceof String)
				{

					if (!user.checkPassword((String) credential))
					{

						throw new BadCredentialsException(
								messages.getMessage("CoreAuthenticationProvider.badCredentials", "Bad credentials"));
					}
				}
				else if (credential instanceof LoginToken)
				{

					if (!user.checkPassword((LoginToken) credential))
					{

						throw new BadCredentialsException(
								messages.getMessage("CoreAuthenticationProvider.badCredentials", "Bad credentials"));
					}
				}
				else
				{
					throw new BadCredentialsException(
							messages.getMessage("CoreAuthenticationProvider.badCredentials", "Bad credentials"));
				}

				additionalAuthenticationChecks(userDetails, (AbstractAuthenticationToken) authentication);
				postAuthenticationChecks.check(userDetails);

				// finally, set user in session
				JaloSession.getCurrentSession().setUser(user);
				return createSuccessAuthentication(authentication, userDetails);
			}
			else
			{
				return createSuccessAuthentication(//
						authentication, //
						new CoreUserDetails("systemNotInitialized", "systemNotInitialized", true, false, true, true,
								Collections.EMPTY_LIST, null));
			}
		}

	}

	private class DefaultPostAuthenticationChecks implements UserDetailsChecker
	{
		@Override
		public void check(final UserDetails user)
		{
			if (!user.isCredentialsNonExpired())
			{
				throw new CredentialsExpiredException(
						messages.getMessage("CoreAuthenticationProvider.credentialsExpired", "User credentials have expired"), user);
			}
		}
	}


	private void checkAttack(final Authentication authentication) throws AuthenticationException
	{
		final String username = (authentication.getPrincipal() == null) ? "NONE_PROVIDED" : authentication.getName();

		if (bruteForceAttackCounter.isAttack(username))
		{
			try
			{
				final UserModel userModel = getUserService().getUserForUID(StringUtils.lowerCase(username));
				userModel.setLoginDisabled(true);
				getModelService().save(userModel);
				bruteForceAttackCounter.resetUserCounter(userModel.getUid());
			}
			catch (final UnknownIdentifierException e)
			{
				LOG.warn("Brute force attack attempt for non existing user name " + username);
			}

			throw new LockedException(messages.getMessage("CoreAuthenticationProvider.Locked", "Account Locked"));

		}
	}

	public void setAdminGroup(final String adminGroup)
	{
		if (StringUtils.isBlank(adminGroup))
		{
			adminAuthority = null;
		}
		else
		{
			adminAuthority = new SimpleGrantedAuthority(adminGroup);
		}
	}

	protected GrantedAuthority getAdminAuthority()
	{
		return adminAuthority;
	}


	public void setBruteForceAttackCounter(final BruteForceAttackCounter bruteForceAttackCounter)
	{
		this.bruteForceAttackCounter = bruteForceAttackCounter;
	}
}
