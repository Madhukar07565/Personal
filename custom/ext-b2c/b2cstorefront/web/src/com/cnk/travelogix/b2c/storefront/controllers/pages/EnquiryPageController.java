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

import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.ResourceBreadcrumbBuilder;
import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.impl.ContentPageBreadcrumbBuilder;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UrlPathHelper;

import com.cnk.travelogix.common.core.captcha.services.CaptchaService;
import com.cnk.travelogix.common.core.enquiry.services.EnquiryService;
import com.cnk.travelogix.common.core.enquiry.services.EnquiryService.EnquiryFlowState;
import com.cnk.travelogix.common.core.model.BaseEnquiryModel;
import com.cnk.travelogix.common.core.model.UserJourneyPhoneModel;
import com.cnk.travelogix.common.facades.product.util.CnkBeanUtil;
import com.cnk.travelogix.common.facades.userjourney.data.BaseEnquiryData;


/**
 * Error handler to show a CMS managed error page. This is the catch-all controller that handles all GET requests that
 * are not handled by other controllers.
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/enquiry")
public class EnquiryPageController extends AbstractPageController
{
	/**
	 *
	 */
	private static final String ENQUIRY_DATA_CLASS_TEMPLATE = "com.cnk.travelogix.common.facades.userjourney.data.Enquiry%sData";
	private static final String ENQUIRY_MODEL_CLASS_TEMPLATE = "com.cnk.travelogix.common.core.model.Enquiry%sModel";

	private static final Logger LOG = Logger.getLogger(EnquiryPageController.class);

	private static final String ERROR_CMS_PAGE = "notFound";

	private final UrlPathHelper urlPathHelper = new UrlPathHelper();

	@Resource(name = "simpleBreadcrumbBuilder")
	private ResourceBreadcrumbBuilder resourceBreadcrumbBuilder;

	@Resource(name = "contentPageBreadcrumbBuilder")
	private ContentPageBreadcrumbBuilder contentPageBreadcrumbBuilder;

	@Resource(name = "enquiryService")
	private EnquiryService enquiryService;

	@Resource(name = "captchaService")
	private CaptchaService captchaService;

	@RequestMapping(method =
	{ RequestMethod.GET, RequestMethod.POST }, value = "/exec/{service}", produces =
	{ MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> doService(@PathVariable("service") final String service, final HttpServletRequest request)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("doService(String, HttpServletRequest) - start"); //$NON-NLS-1$
		}

		// https://en.wikipedia.org/wiki/List_of_HTTP_status_codes
		try
		{
			final List<String> acceptableServiceTypes = Arrays.asList("email", "clickToCall", "chat");

			if (acceptableServiceTypes.contains(service))
			{
				this.createEnquiry(service, request);
				final ResponseEntity<String> returnResponseEntity = new ResponseEntity<>(HttpStatus.OK);
				if (LOG.isDebugEnabled())
				{
					LOG.debug("doService(String, HttpServletRequest) - end"); //$NON-NLS-1$
				}
				return returnResponseEntity;
			}
			else
			{
				LOG.error("doService(String, HttpServletRequest - unsupported service is submitted by front-end.");
				return new ResponseEntity<>(HttpStatus.FORBIDDEN);
			}
		}
		catch (final Exception e)
		{
			final String errorCode = UUID.randomUUID().toString();
			LOG.error("doService(String, HttpServletRequest) - error code: " + errorCode, e); //$NON-NLS-1$
			return new ResponseEntity<>(errorCode, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	private void createEnquiry(final String service, final HttpServletRequest request) throws Exception
	{
		final String capitalizedServiceChars = StringUtils.capitalize(service);
		final String dataClassName = String.format(ENQUIRY_DATA_CLASS_TEMPLATE, capitalizedServiceChars);
		final String modelClassName = String.format(ENQUIRY_MODEL_CLASS_TEMPLATE, capitalizedServiceChars);
		if (LOG.isDebugEnabled())
		{
			LOG.debug(String.format("The class [%s] will be loaded.", dataClassName));
		}
		final Class dataBeanType = Class.forName(dataClassName);
		final String enquiryJsonString = request.getParameter("data");
		final Object enquiryData = CnkBeanUtil.getBeanFromJson(enquiryJsonString, dataBeanType);
		final BaseEnquiryData baseEnquiryData = (BaseEnquiryData) enquiryData;
		final String gRecaptchaResponse = baseEnquiryData.getCaptcha();
		final boolean verify = captchaService.verify(gRecaptchaResponse, request.getServerName());
		if (!verify)
		{
			LOG.error("Captcha did not pass!");
			return;
		}
		final BaseEnquiryModel enquiryModel = (BaseEnquiryModel) Class.forName(modelClassName).newInstance();
		CnkBeanUtil.copyProperties(enquiryData, enquiryModel, UserJourneyPhoneModel.class);
		enquiryService.createEnquiry(enquiryModel, EnquiryFlowState.MT_OTHERS);
	}

}
