/**
 *
 */
package com.cnk.travelogix.operationsstorefront.security;

import de.hybris.platform.acceleratorservices.uiexperience.UiExperienceService;
import de.hybris.platform.acceleratorstorefrontcommons.security.BruteForceAttackCounter;
import de.hybris.platform.acceleratorstorefrontcommons.security.StorefrontAuthenticationSuccessHandler;
import de.hybris.platform.commerceservices.enums.UiExperienceLevel;
import de.hybris.platform.core.Constants;
import de.hybris.platform.servicelayer.session.SessionService;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;

import com.cnk.travelogix.operations.facades.EmployeeFacade;

    

/**
 * @author C5244544
 *
 */
public class OperationsStorefrontAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler
{
	private EmployeeFacade employeeFacade;
	private UiExperienceService uiExperienceService;
	private SessionService sessionService;
	private BruteForceAttackCounter bruteForceAttackCounter;
	private Map<UiExperienceLevel, Boolean> forceDefaultTargetForUiExperienceLevel;
	private List<String> restrictedPages;
	private List<String> listRedirectUrlsForceDefaultTarget;
	private GrantedAuthority adminAuthority = new SimpleGrantedAuthority("ROLE_" + Constants.USER.ADMIN_USERGROUP.toUpperCase());


	private static final Logger LOG = Logger.getLogger(StorefrontAuthenticationSuccessHandler.class);

	@Override
	public void onAuthenticationSuccess(final HttpServletRequest request, final HttpServletResponse response,
			final Authentication authentication) throws IOException, ServletException
	{
		//if redirected from some specific url, need to remove the cachedRequest to force use defaultTargetUrl
		final RequestCache requestCache = new HttpSessionRequestCache();
		final SavedRequest savedRequest = requestCache.getRequest(request, response);

		if (savedRequest != null)
		{
			for (final String redirectUrlForceDefaultTarget : getListRedirectUrlsForceDefaultTarget())
			{
				if (savedRequest.getRedirectUrl().contains(redirectUrlForceDefaultTarget))
				{
					requestCache.removeRequest(request, response);
					break;
				}
			}
		}

		getEmployeeFacade().loginSuccess();

		// Check if the user is in role admingroup
		if (!isAdminAuthority(authentication))
		{
			getBruteForceAttackCounter().resetUserCounter(getEmployeeFacade().getCurrentEmployeeUid());
			super.onAuthenticationSuccess(request, response, authentication);
		}
		else
		{
			LOG.warn("Invalidating session for user in the " + Constants.USER.ADMIN_USERGROUP + " group");
			invalidateSession(request, response);
		}
	}


	protected void invalidateSession(final HttpServletRequest request, final HttpServletResponse response) throws IOException
	{
		SecurityContextHolder.getContext().setAuthentication(null);
		request.getSession().invalidate();
		response.sendRedirect(request.getContextPath());
	}

	protected boolean isAdminAuthority(final Authentication authentication)
	{
		return CollectionUtils.isNotEmpty(authentication.getAuthorities())
				&& authentication.getAuthorities().contains(adminAuthority);
	}

	protected List<String> getRestrictedPages()
	{
		return restrictedPages;
	}

	public void setRestrictedPages(final List<String> restrictedPages)
	{
		this.restrictedPages = restrictedPages;
	}

	protected SessionService getSessionService()
	{
		return sessionService;
	}

	@Required
	public void setSessionService(final SessionService sessionService)
	{
		this.sessionService = sessionService;
	}

	protected EmployeeFacade getEmployeeFacade()
	{
		return employeeFacade;
	}

	@Required
	public void setEmployeeFacade(final EmployeeFacade employeeFacade)
	{
		this.employeeFacade = employeeFacade;
	}

	/*
	 * @see org.springframework.security.web.authentication.AbstractAuthenticationTargetUrlRequestHandler#
	 * isAlwaysUseDefaultTargetUrl()
	 */
	@Override
	protected boolean isAlwaysUseDefaultTargetUrl()
	{
		final UiExperienceLevel uiExperienceLevel = getUiExperienceService().getUiExperienceLevel();
		if (getForceDefaultTargetForUiExperienceLevel().containsKey(uiExperienceLevel))
		{
			return Boolean.TRUE.equals(getForceDefaultTargetForUiExperienceLevel().get(uiExperienceLevel));
		}
		else
		{
			return false;
		}
	}

	@Override
	protected String determineTargetUrl(final HttpServletRequest request, final HttpServletResponse response)
	{
		String targetUrl = super.determineTargetUrl(request, response);
		if (CollectionUtils.isNotEmpty(getRestrictedPages()))
		{
			for (final String restrictedPage : getRestrictedPages())
			{
				// When logging in from a restricted page, return user to default target url.
				if (targetUrl.contains(restrictedPage))
				{
					targetUrl = super.getDefaultTargetUrl();
				}
			}
		}
		return targetUrl;
	}

	protected Map<UiExperienceLevel, Boolean> getForceDefaultTargetForUiExperienceLevel()
	{
		return forceDefaultTargetForUiExperienceLevel;
	}

	@Required
	public void setForceDefaultTargetForUiExperienceLevel(
			final Map<UiExperienceLevel, Boolean> forceDefaultTargetForUiExperienceLevel)
	{
		this.forceDefaultTargetForUiExperienceLevel = forceDefaultTargetForUiExperienceLevel;
	}

	protected BruteForceAttackCounter getBruteForceAttackCounter()
	{
		return bruteForceAttackCounter;
	}

	@Required
	public void setBruteForceAttackCounter(final BruteForceAttackCounter bruteForceAttackCounter)
	{
		this.bruteForceAttackCounter = bruteForceAttackCounter;
	}

	protected UiExperienceService getUiExperienceService()
	{
		return uiExperienceService;
	}

	@Required
	public void setUiExperienceService(final UiExperienceService uiExperienceService)
	{
		this.uiExperienceService = uiExperienceService;
	}

	protected List<String> getListRedirectUrlsForceDefaultTarget()
	{
		return listRedirectUrlsForceDefaultTarget;
	}

	@Required
	public void setListRedirectUrlsForceDefaultTarget(final List<String> listRedirectUrlsForceDefaultTarget)
	{
		this.listRedirectUrlsForceDefaultTarget = listRedirectUrlsForceDefaultTarget;
	}

	/**
	 * @param adminGroup
	 *           the adminGroup to set
	 */
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
}