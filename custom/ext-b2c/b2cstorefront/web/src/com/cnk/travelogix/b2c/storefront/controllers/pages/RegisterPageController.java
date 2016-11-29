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
package com.cnk.travelogix.b2c.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractRegisterPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.util.Config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnk.travelogix.b2c.facades.customer.B2cCustomerFacade;
import com.cnk.travelogix.b2c.storefront.controllers.ControllerConstants;
import com.cnk.travelogix.b2c.storefront.forms.EzgRegisterForm;
import com.cnk.travelogix.b2c.storefront.security.impl.EzgAutoLoginStrategy;

import reactor.util.StringUtils;


/**
 * Register Controller for mobile. Handles login and register for the account flow.
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/register")
public class RegisterPageController extends AbstractRegisterPageController
{
	private static final Logger LOGGER = Logger.getLogger(RegisterPageController.class);

	private HttpSessionRequestCache httpSessionRequestCache;

	// CMS Pages
	private static final String SIGNUP_PAGE = "signupPage";

	@Resource(name = "ezgRegistrationValidator")
	private Validator ezgRegistrationValidator;
	@Resource(name = "customerFacade")
	private B2cCustomerFacade customerFacade;
	@Resource(name = "ezgAutoLoginStrategy")
	private EzgAutoLoginStrategy ezgAutoLoginStrategy;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractRegisterPageController#getCmsPage()
	 */
	@Override
	protected AbstractPageModel getCmsPage() throws CMSItemNotFoundException
	{
		return getContentPageForLabelOrId(SIGNUP_PAGE);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractRegisterPageController#
	 * getSuccessRedirect(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected String getSuccessRedirect(final HttpServletRequest request, final HttpServletResponse response)
	{
		if (httpSessionRequestCache.getRequest(request, response) != null)
		{
			return httpSessionRequestCache.getRequest(request, response).getRedirectUrl();
		}
		return "/my-account";
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractRegisterPageController#getView()
	 */
	@Override
	protected String getView()
	{
		return ControllerConstants.Views.Pages.Account.AccountRegisterPage;
	}


	@Resource(name = "httpSessionRequestCache")
	public void setHttpSessionRequestCache(final HttpSessionRequestCache accHttpSessionRequestCache)
	{
		this.httpSessionRequestCache = accHttpSessionRequestCache;
	}

	@RequestMapping(value = "/")
	public String doRegister(final Model model) throws CMSItemNotFoundException
	{
		return getDefaultRegistrationPage(model);
	}

	@RequestMapping(value = "/signup")
	@ResponseBody
	public Map<String, String> doRegister(final EzgRegisterForm form, final BindingResult bindingResult, final Model model,
			final HttpServletRequest request, final HttpServletResponse response, final RedirectAttributes redirectModel)
			throws CMSItemNotFoundException
	{
		final Map<String, String> result = new HashMap<String, String>();
		//validate if account has been registered first
		if (customerFacade.checkUserExist(form.getEmail().toLowerCase()))
		{
			result.put("emailExisted", "registration.error.account.exists.title");
			return result;
		}

		this.getEzgRegistrationValidator().validate(form, bindingResult);
		final List<FieldError> allErrors = bindingResult.getFieldErrors();
		if (allErrors != null && allErrors.size() != 0)
		{
			for (final FieldError error : allErrors)
			{
				result.put(error.getField(), error.getCode());
			}
			return result;
		}

		if (this.processRegisterUserRequest(form, request, response))
		{
			result.put("success", "1");
			result.put("sendVerLink", form.getEmail());
			if (customerFacade.getProfileAutoActivation())
			{
				result.put("autoActivation", "1");
				model.addAttribute("accountStatus", "1");
			}
			else
			{
				result.put("autoActivation", "0");
				model.addAttribute("accountStatus", "0");
			}

			return result;
		}

		return result;
	}

	@RequestMapping(value = "/activeAccount")
	public String activeRegisteredAccount(final Model model, final HttpServletRequest request, final HttpServletResponse response)
	{
		final String email = request.getParameter("email").toLowerCase();
		final String randomCode = request.getParameter("strVer");

		if (customerFacade.checkVerLinkExpire(email))
		{
			return addErrorMsg(model, "account.register.verification.linkExpire", request);
		}
		else if (customerFacade.getUserActivationStatus(email))
		{
			return addErrorMsg(model, "account.register.verification.alreadyActivated", request);
		}
		else
		{
			if (customerFacade.activateAccount(email, randomCode))
			{
				ezgAutoLoginStrategy.loginWithoutPwd(email, request, response);
				//if its first time login and profile update are not complete, redirect to edit his profile,
				//else redirect to dashboard page
				if (customerFacade.checkUserFirstLogin())
				{
					customerFacade.updateCustomerLastLoginTime();
					return "redirect:/my-account/dashboard_edit";
				}
				else
				{
					return "redirect:/";
				}

			}
			else
			{
				return addErrorMsg(model, "account.register.verification.inValid", request);
			}
		}

	}

	private String addErrorMsg(final Model model, final String msg, final HttpServletRequest request)
	{
		final String webRoot = Config.getParameter("website.ezeego1.https");
		model.addAttribute("errorCode", msg);
		model.addAttribute("homePageLink", webRoot + request.getContextPath());
		return "pages/ezg/account/accActivationError";
	}

	protected boolean processRegisterUserRequest(final EzgRegisterForm form, final HttpServletRequest request,
			final HttpServletResponse response) throws CMSItemNotFoundException
	{

		final RegisterData data = new RegisterData();
		data.setLogin(form.getEmail());
		data.setPassword(form.getPwd());
		data.setSubscribe(form.isSubscribe());

		try
		{
			customerFacade.register(request.getContextPath(), data);
			getAutoLoginStrategy().login(form.getEmail().toLowerCase(), form.getPwd(), request, response);
			customerFacade.updateCustomerLastLoginTime();
			return true;
		}
		catch (final DuplicateUidException e)
		{
			LOGGER.warn("registration failed: " + e);
			return false;
		}
	}

	@RequestMapping(value = "/reSendEmail")
	@ResponseBody
	public void reSendVerificationEmail(final HttpServletRequest request)
	{
		String email = request.getParameter("email");
		if (StringUtils.isEmpty(email))
		{
			email = customerFacade.getCurrentCustomer().getUid();
		}

		//customerFacade.sendActivationLinkEmail(request.getContextPath(), email, customerFacade.getRandomCode());
		customerFacade.sendActivationLinkEmail(email, customerFacade.getRandomCode());
	}

	/**
	 * @return the ezgRegistrationValidator
	 */
	public Validator getEzgRegistrationValidator()
	{
		return ezgRegistrationValidator;
	}

}
