
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
package com.cnk.travelogix.addon.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractCheckoutController;
import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.GuestRegisterValidator;
import de.hybris.platform.acceleratorstorefrontcommons.security.AutoLoginStrategy;
import de.hybris.platform.commercefacades.order.CheckoutFacade;
import de.hybris.platform.commercefacades.order.OrderFacade;
import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.servicelayer.exceptions.BusinessException;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cnk.travelogix.addon.controllers.PaymentgatewaysControllerConstants;
import com.cnk.travelogix.common.facades.payment.CnkPaymentFacade;
import com.cnk.travelogix.facades.PaymentGatwayMapperFacade;
import com.cnk.travelogix.fraud.client.FraudCheckRestClient;
import com.cnk.travelogix.fraud.service.FraudCheckService;
import com.cnk.travelogix.integrations.payment.request.beans.PaymentGatewayMappingData;
import com.cnk.travelogix.integrations.payment.response.beans.PaymentServiceResponseData;
import com.cnk.travelogix.services.paymentgateways.response.PaymentGatewayProviderResponseService;


/**
 * CheckoutController
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/checkout/multi/payment/payment-provider-response")
public class PaymentGatewaysResponseController extends AbstractCheckoutController
{
	private static final Logger LOG = Logger.getLogger(PaymentGatewaysResponseController.class);
	/**
	 * We use this suffix pattern because of an issue with Spring 3.1 where a Uri value is incorrectly extracted if it
	 * contains on or more '.' characters. Please see https://jira.springsource.org/browse/SPR-6164 for a discussion on
	 * the issue and future resolution.
	 */
	@Resource(name = "productFacade")
	private ProductFacade productFacade;

	@Resource(name = "orderFacade")
	private OrderFacade orderFacade;

	@Resource(name = "checkoutFacade")
	private CheckoutFacade checkoutFacade;

	@Resource(name = "cnkPaymentFacade")
	private CnkPaymentFacade paymentFacade;

	@Resource(name = "guestRegisterValidator")
	private GuestRegisterValidator guestRegisterValidator;

	@Resource(name = "autoLoginStrategy")
	private AutoLoginStrategy autoLoginStrategy;

	@Resource(name = "paymentGatewayProviderResponseService")
	private PaymentGatewayProviderResponseService paymentGatewayProviderResponseService;

	@Resource(name = "fraudCheckService")
	private FraudCheckService fraudCheckService;

	@Resource(name = "paymentGatwayMapperFacade")
	private PaymentGatwayMapperFacade paymentGatwayMapperFacade;


	@ExceptionHandler(ModelNotFoundException.class)
	public String handleModelNotFoundException(final ModelNotFoundException exception, final HttpServletRequest request)
	{
		request.setAttribute("message", exception.getMessage());
		return FORWARD_PREFIX + "/404";
	}


	@RequestMapping(value = "/response/{providername}", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public String PaymentGatewayResponseHandler(@PathVariable("providername") final String paymentProviderName,
			@RequestParam final Map<String, String> responseParams, final Model model) throws IOException
	{
		LOG.info("Inside PaymentGatewaySuccessHandler" + paymentProviderName);

		LOG.info("Actual response log from Payment Gateway");
		for (final Map.Entry<String, String> entry : responseParams.entrySet())
		{
			LOG.info(entry.getKey() + " - " + entry.getValue());
		}

		final PaymentGatewayMappingData paymentGatewayMappingData = paymentGatwayMapperFacade
				.getPaymentGatewayMappingForPGName(paymentProviderName);

		final PaymentServiceResponseData paymentTransactionData = paymentGatewayProviderResponseService
				.getPaymentTransactionDatat(responseParams, paymentGatewayMappingData.getPaymentGatewayResponseXMLTemplateID());

		try
		{
			if (paymentTransactionData.isSuccess())
			{
				final Map<String, String> fraudMap = fraudCheckService.hopFraudCheckStatusUpdate(paymentTransactionData.isSuccess());
				paymentTransactionData.setDecision(fraudMap.get(FraudCheckRestClient.RMS_RESPONSE_UPDATE_ISFRAUD_KEY));
			}

			paymentTransactionData.setGatewayId(paymentGatewayMappingData.getPaymentGatewayName().toUpperCase() + " "
					+ getPaymentGatewayId(paymentTransactionData).toUpperCase());

		}
		catch (final BusinessException e)
		{
			LOG.info(e);
		}

		LOG.info("Amount - " + paymentTransactionData.getAmount());
		LOG.info("Card Expiry Month- " + paymentTransactionData.getCardExpiryMonth());
		LOG.info("Card Expiry Year  - " + paymentTransactionData.getCardExpiryYear());
		LOG.info("Card Holder Name  - " + paymentTransactionData.getCardHolder());
		LOG.info("Card Number - " + paymentTransactionData.getCardNumber());
		LOG.info("Card Type - " + paymentTransactionData.getCardType());
		LOG.info("Currency - " + paymentTransactionData.getCurrency());
		LOG.info("Fraud Check Decision - " + paymentTransactionData.getDecision());
		LOG.info("Payment Gateway ID - " + paymentTransactionData.getGatewayId());
		LOG.info("Payment Message - " + paymentTransactionData.getMessage());
		LOG.info("Payment Mode - " + paymentTransactionData.getPaymentMode());
		LOG.info("Receipt NO - " + paymentTransactionData.getReceiptNo());
		LOG.info("Payment Status - " + paymentTransactionData.isSuccess());

		model.addAttribute("responseMap", responseParams);

		return paymentFacade.completeHopPayment(paymentTransactionData);
		//return PaymentgatewaysControllerConstants.PAYMENT_GATEWAYS_RESOPONSE_PAGE;
	}

	@RequestMapping(value = "/response/{providername}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String getPaymentGatewayResponseHandler(@PathVariable("providername") final String paymentProviderName,
			@RequestParam final Map<String, String> responseParams, final Model model) throws IOException
	{
		LOG.info("Inside PaymentGatewaySuccessHandler" + paymentProviderName);

		LOG.info("Actual response log from Payment Gateway");
		for (final Map.Entry<String, String> entry : responseParams.entrySet())
		{
			LOG.info(entry.getKey() + " - " + entry.getValue());
		}

		model.addAttribute("responseMap", responseParams);

		//return paymentFacade.completeHopPayment(paymentTransactionData);
		return PaymentgatewaysControllerConstants.PAYMENT_GATEWAYS_RESOPONSE_PAGE;
	}


	/**
	 * @return
	 */
	private String getPaymentGatewayId(final PaymentServiceResponseData paymentTransactionData)
	{
		return StringUtils.isNotBlank(paymentTransactionData.getGatewayId()) ? paymentTransactionData.getGatewayId() : "";
	}

}

