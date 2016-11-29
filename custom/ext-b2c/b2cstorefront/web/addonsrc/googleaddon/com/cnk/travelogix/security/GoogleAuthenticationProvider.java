/*** Eclipse Class Decompiler plugin, copyright (c) 2012 Chao Chen (cnfree2000@hotmail.com) ***/
package com.cnk.travelogix.security;

import de.hybris.platform.core.Constants;
import de.hybris.platform.core.Registry;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.jalo.JaloConnection;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.jalo.user.UserManager;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.spring.security.CoreUserDetails;

import java.util.Collections;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.dao.DataAccessException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.Assert;

import com.cnk.travelogix.service.GoogleUserService;
import com.cnk.travelogix.service.impl.GoogleAuthTemplate;
import com.google.api.services.oauth2.model.Userinfo;


/**
 * GoogleAuthenticationProvider class is to authenticate the token
 *
 */
public class GoogleAuthenticationProvider implements AuthenticationProvider, InitializingBean, MessageSourceAware
{
	protected MessageSourceAccessor messages = SpringSecurityMessageSource.getAccessor();

	private static final Logger LOG = Logger.getLogger(GoogleAuthenticationProvider.class);
	private static final String ROLE_ADMIN_GROUP = "ROLE_" + Constants.USER.ADMIN_USERGROUP.toUpperCase();
	private DefaultBruteForceAttackCounter bruteForceAttackCounter;
	private ModelService modelService;
	private GoogleUserService googleUserService;
	private GoogleAuthTemplate googleAuthTemplate;
	private UserDetailsService userDetailsService;
	private final GrantedAuthority adminAuthority = new SimpleGrantedAuthority(ROLE_ADMIN_GROUP);

	@Override
	public Authentication authenticate(final Authentication authentication) throws AuthenticationException
	{
		final Userinfo userinfo = getGoogleAuthTemplate().getUserInfo(authentication.getCredentials().toString());
		if (userinfo == null)
		{
			throw new BadCredentialsException(messages.getMessage("CoreAuthenticationProvider.badCredentials", "Invalid Token!!!"));
		}
		final String username = userinfo.getEmail();
		LOG.info("Email *****" + userinfo.getEmail());
		LOG.info("Name *****" + userinfo.getName());
		((GoogleAuthenticationToken) authentication).setPrincipal(userinfo.getEmail());
		try
		{
			final UserModel userModel = getGoogleUserService().getUserForUID(StringUtils.lowerCase(username));
			userModel.setLoginDisabled(true);
			getModelService().save(userModel);
		}
		catch (final UnknownIdentifierException e)
		{
			LOG.info("Unknown Indentifier" + e);
			getGoogleUserService().createCustomer(userinfo);
		}

		if ((Registry.hasCurrentTenant()) && (JaloConnection.getInstance().isSystemInitialized()))
		{
			UserDetails userDetails = null;
			try
			{
				userDetails = retrieveUser(username);
			}
			catch (final UsernameNotFoundException notFound)
			{
				throw new BadCredentialsException(
						this.messages.getMessage("CoreAuthenticationProvider.badCredentials", "Bad credentials"), notFound);
			}
			final User user = UserManager.getInstance().getUserByLogin(userDetails.getUsername());
			JaloSession.getCurrentSession().setUser(user);
			return createSuccessAuthentication(authentication, userDetails);
		}
		return createSuccessAuthentication(authentication, new CoreUserDetails("systemNotInitialized", "systemNotInitialized", true,
				false, true, true, Collections.emptyList(), null));
	}

	protected final UserDetails retrieveUser(final String username) throws AuthenticationException
	{
		UserDetails loadedUser;
		try
		{
			loadedUser = getUserDetailsService().loadUserByUsername(username);
		}
		catch (final DataAccessException repositoryProblem)
		{
			throw new AuthenticationServiceException(repositoryProblem.getMessage(), repositoryProblem);
		}
		if (loadedUser == null)
		{
			throw new AuthenticationServiceException("UserDetailsService returned null, which is an interface contract violation");
		}
		return loadedUser;
	}

	protected Authentication createSuccessAuthentication(final Authentication authentication, final UserDetails user)
	{
		final GoogleAuthenticationToken result = new GoogleAuthenticationToken(user.getUsername(), authentication.getCredentials(),
				user.getAuthorities());
		result.setDetails(authentication.getDetails());
		return result;
	}

	@Override
	public void setMessageSource(final MessageSource messageSource)
	{
		this.messages = new MessageSourceAccessor(messageSource);
	}

	@Override
	public boolean supports(final Class authentication)
	{
		return GoogleAuthenticationToken.class.isAssignableFrom(authentication);
	}



	/**
	 * @return the googleUserService
	 */
	public GoogleUserService getGoogleUserService()
	{
		return googleUserService;
	}

	/**
	 * @param googleUserService
	 *           the googleUserService to set
	 */
	public void setGoogleUserService(final GoogleUserService googleUserService)
	{
		this.googleUserService = googleUserService;
	}

	/**
	 * @return the bruteForceAttackCounter
	 */
	public DefaultBruteForceAttackCounter getBruteForceAttackCounter()
	{
		return bruteForceAttackCounter;
	}

	/**
	 * @param bruteForceAttackCounter
	 *           the bruteForceAttackCounter to set
	 */
	public void setBruteForceAttackCounter(final DefaultBruteForceAttackCounter bruteForceAttackCounter)
	{
		this.bruteForceAttackCounter = bruteForceAttackCounter;
	}

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * @return the googleAuthTemplate
	 */
	public GoogleAuthTemplate getGoogleAuthTemplate()
	{
		return googleAuthTemplate;
	}

	/**
	 * @param googleAuthTemplate
	 *           the googleAuthTemplate to set
	 */
	public void setGoogleAuthTemplate(final GoogleAuthTemplate googleAuthTemplate)
	{
		this.googleAuthTemplate = googleAuthTemplate;
	}

	/**
	 * @return the userDetailsService
	 */
	public UserDetailsService getUserDetailsService()
	{
		return userDetailsService;
	}

	/**
	 * @param userDetailsService
	 *           the userDetailsService to set
	 */

	public void setUserDetailsService(final UserDetailsService userDetailsService)
	{
		this.userDetailsService = userDetailsService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception
	{
		Assert.notNull(this.userDetailsService, "A UserDetailsService must be set");

	}

}