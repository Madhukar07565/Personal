package com.cnk.travelogix.fb.security;

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
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.Assert;

import com.cnk.travelogix.service.FacebookUserService;
import com.cnk.travelogix.service.impl.FacebookAuthTemplateImpl;
import com.cnk.travelogix.fb.userdata.FBUserInfo;

/**
 * FacebookAuthenticationProvider class is to authenticate the user
 *
 */
public class FacebookAuthenticationProvider implements AuthenticationProvider, InitializingBean, MessageSourceAware
{
	protected MessageSourceAccessor messages = SpringSecurityMessageSource.getAccessor();

	private static final Logger LOG = Logger.getLogger(FacebookAuthenticationProvider.class);
	private ModelService modelService;
	private FacebookUserService facebookUserService;
	private FacebookAuthTemplateImpl facebookAuthTemplate;
	private UserDetailsService userDetailsService;
	
	@Override
	public Authentication authenticate(final Authentication authentication) throws AuthenticationException
	{

		final FBUserInfo userinfo = getFacebookAuthTemplate().getUserInfo(authentication.getCredentials().toString());
		if (userinfo == null)
		{
			throw new BadCredentialsException(messages.getMessage("CoreAuthenticationProvider.badCredentials", "Invalid Token!!!"));
		}
		final String username = userinfo.getEmail();
		
		((FacebookAuthenticationToken) authentication).setPrincipal(userinfo.getEmail());
		try
		{
			final UserModel userModel = getFacebookUserService().getUserForUID(StringUtils.lowerCase(username));
			userModel.setLoginDisabled(true);
			getModelService().save(userModel);
		}
		catch (final UnknownIdentifierException e)
		{
			LOG.info("User Not Found Exception"+e);
			getFacebookUserService().createCustomer(userinfo);
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
		final FacebookAuthenticationToken result = new FacebookAuthenticationToken(user.getUsername(),
				authentication.getCredentials(), user.getAuthorities());
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
		return FacebookAuthenticationToken.class.isAssignableFrom(authentication);
				
	}


	public FacebookUserService getFacebookUserService()
	{
		return facebookUserService;
	}


	public void setFacebookUserService(final FacebookUserService facebookUserService)
	{
		this.facebookUserService = facebookUserService;
	}


	public FacebookAuthTemplateImpl getFacebookAuthTemplate()
	{
		return facebookAuthTemplate;
	}


	public void setFacebookAuthTemplate(final FacebookAuthTemplateImpl facebookAuthTemplate)
	{
		this.facebookAuthTemplate = facebookAuthTemplate;
	}


	public UserDetailsService getUserDetailsService()
	{
		return userDetailsService;
	}


	public void setUserDetailsService(final UserDetailsService userDetailsService)
	{
		this.userDetailsService = userDetailsService;
	}


	public ModelService getModelService()
	{
		return modelService;
	}


	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}


	@Override
	public void afterPropertiesSet() throws Exception
	{
		Assert.notNull(this.userDetailsService, "A UserDetailsService must be set");
	}



}
