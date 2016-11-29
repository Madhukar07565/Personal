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
package com.cnk.travelogix.b2c.storefront.controllers.pages.checkout.steps.ezg;


import de.hybris.platform.acceleratorfacades.payment.data.PaymentSubscriptionResultData;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;
import de.hybris.platform.acceleratorstorefrontcommons.checkout.steps.validation.ValidationResults;
import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.acceleratorstorefrontcommons.forms.PlaceOrderForm;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import com.cnk.travelogix.b2c.storefront.controllers.ControllerConstants;
import com.cnk.travelogix.integrations.payment.response.beans.PaymentServiceResponseData;


@Controller
@RequestMapping(value = "/checkout/multi/payment/hop")
public class EzgHopPaymentResponseController extends EzgPaymentMethodCheckoutStepController
{
	private static final Logger LOGGER = Logger.getLogger(EzgHopPaymentResponseController.class);

	@RequestMapping(value = "/{provider}/response")
	@RequireHardLogIn
	public String doHandleHopResponse(final HttpServletRequest request, final Model model,
			@PathVariable("provider") final String provider)
	{
		try
		{
			final Map<String, String> resultMap = getRequestParameterMap(request);
			resultMap.put("provider", provider);
			//			final PaymentSubscriptionResultData paymentSubscriptionResultData = getPaymentFacade()
			//					.completeHopCreateSubscription(resultMap, true);
			if (provider.equals("integration"))
			{
				final PaymentServiceResponseData response = new PaymentServiceResponseData();
				response.setAmount("4000");
				response.setCardExpiryMonth("11");
				response.setCardExpiryYear("18");
				response.setCardHolder("Chris Integration");
				response.setCardNumber("************1111");
				response.setCardType("visa");
				response.setCurrency("INR");
				response.setDecision("ACCEPT");
				response.setGatewayId("firstdata");
				response.setMessage("SUCCESS");
				response.setPaymentMode("creditcard");
				response.setReceiptNo("123456789");
				response.setSuccess(true);
				return getPaymentFacade().completeHopPayment(response);
			}
			final PaymentSubscriptionResultData paymentSubscriptionResultData = getPaymentFacade().completeHopCapture(resultMap,
					false);
			//			if (paymentSubscriptionResultData.isSuccess() && paymentSubscriptionResultData.getStoredCard() != null
			//					&& StringUtils.isNotBlank(paymentSubscriptionResultData.getStoredCard().getSubscriptionId()))
			//			{
			//				final CCPaymentInfoData newPaymentSubscription = paymentSubscriptionResultData.getStoredCard();
			//
			//				if (getUserFacade().getCCPaymentInfos(true).size() <= 1)
			//				{
			//					getUserFacade().setDefaultPaymentInfo(newPaymentSubscription);
			//				}
			//				getCheckoutFacade().setPaymentDetails(newPaymentSubscription.getId());
			//			}
			//			else
			//			{
			//				// HOP ERROR!
			//				LOGGER.error("Failed to create subscription.  Please check the log files for more information");
			//				return REDIRECT_URL_ERROR + "/?decision=" + paymentSubscriptionResultData.getDecision() + "&reasonCode="
			//						+ paymentSubscriptionResultData.getResultCode();
			//			}
			if (paymentSubscriptionResultData.isSuccess())
			{
				final PlaceOrderForm placeOrderForm = new PlaceOrderForm();
				final RedirectAttributes redirectModel = new RedirectAttributesModelMap();
				redirectModel.addFlashAttribute("isAuthorized", Boolean.TRUE);
				return placeOrder(placeOrderForm, model, request, redirectModel);
			}
			else
			{
				throw new RuntimeException("payment failed!");
			}
		}
		catch (final Exception e)
		{
			GlobalMessages.addErrorMessage(model, "checkout.multi.hostedOrderPageError.globalError");
			LOGGER.error("Exception occurs when handling the HOP response,", e);
			return REDIRECT_URL_ADD_PAYMENT_METHOD;
		}
	}

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String doHostedOrderPageError(@RequestParam(required = true) final String decision,
			@RequestParam(required = true) final String reasonCode, final Model model, final RedirectAttributes redirectAttributes)
			throws CMSItemNotFoundException
	{
		String redirectUrl = REDIRECT_URL_ADD_PAYMENT_METHOD;
		final ValidationResults validationResults = getCheckoutStep().validate(redirectAttributes);
		if (getCheckoutStep().checkIfValidationErrors(validationResults))
		{
			redirectUrl = getCheckoutStep().onValidation(validationResults);
		}
		model.addAttribute("decision", decision);
		model.addAttribute("reasonCode", reasonCode);
		model.addAttribute("redirectUrl", redirectUrl.replace(REDIRECT_PREFIX, ""));
		model.addAttribute(WebConstants.BREADCRUMBS_KEY,
				getResourceBreadcrumbBuilder().getBreadcrumbs("checkout.multi.hostedOrderPageError.breadcrumb"));
		storeCmsPageInModel(model, getContentPageForLabelOrId(MULTI_CHECKOUT_SUMMARY_CMS_PAGE_LABEL));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(MULTI_CHECKOUT_SUMMARY_CMS_PAGE_LABEL));
		setCheckoutStepLinksForModel(model, getCheckoutStep());

		GlobalMessages.addErrorMessage(model, "checkout.multi.hostedOrderPageError.globalError");

		return ControllerConstants.Views.Pages.MultiStepCheckout.HostedOrderPageErrorPage;
	}

}
