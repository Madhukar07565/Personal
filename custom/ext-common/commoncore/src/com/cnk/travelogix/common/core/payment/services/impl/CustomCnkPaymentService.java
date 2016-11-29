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
package com.cnk.travelogix.common.core.payment.services.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.acceleratorservices.config.SiteConfigService;
import de.hybris.platform.acceleratorservices.model.payment.CCPaySubValidationModel;
import de.hybris.platform.acceleratorservices.payment.dao.CreditCardPaymentSubscriptionDao;
import de.hybris.platform.acceleratorservices.payment.data.CreateSubscriptionRequest;
import de.hybris.platform.acceleratorservices.payment.data.CreateSubscriptionResult;
import de.hybris.platform.acceleratorservices.payment.data.CustomerInfoData;
import de.hybris.platform.acceleratorservices.payment.data.OrderInfoData;
import de.hybris.platform.acceleratorservices.payment.data.PaymentData;
import de.hybris.platform.acceleratorservices.payment.data.PaymentErrorField;
import de.hybris.platform.acceleratorservices.payment.data.PaymentInfoData;
import de.hybris.platform.acceleratorservices.payment.data.PaymentSubscriptionResultItem;
import de.hybris.platform.acceleratorservices.payment.data.SubscriptionInfoData;
import de.hybris.platform.acceleratorservices.payment.enums.DecisionsEnum;
import de.hybris.platform.acceleratorservices.payment.strategies.ClientReferenceLookupStrategy;
import de.hybris.platform.acceleratorservices.payment.strategies.CreateSubscriptionRequestStrategy;
import de.hybris.platform.acceleratorservices.payment.strategies.CreateSubscriptionResultValidationStrategy;
import de.hybris.platform.acceleratorservices.payment.strategies.FraudCallbackStrategy;
import de.hybris.platform.acceleratorservices.payment.strategies.PaymentResponseInterpretationStrategy;
import de.hybris.platform.acceleratorservices.payment.strategies.SignatureValidationStrategy;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.payment.CreditCardPaymentInfoModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.order.CartService;
import de.hybris.platform.payment.dto.TransactionStatus;
import de.hybris.platform.payment.enums.PaymentTransactionType;
import de.hybris.platform.payment.model.PaymentTransactionEntryModel;
import de.hybris.platform.payment.model.PaymentTransactionModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.servicelayer.user.UserService;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.fest.util.Collections;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.enums.PaymentModes;
import com.cnk.travelogix.common.core.model.CodPaymentInfoModel;
import com.cnk.travelogix.common.core.payment.data.CodPaymentInfoData;
import com.cnk.travelogix.common.core.payment.data.PaymentServiceResponse;
import com.cnk.travelogix.common.core.payment.data.PaymentSummary;
import com.cnk.travelogix.common.core.payment.data.PaymentTransactionData;
import com.cnk.travelogix.common.core.payment.ezg.PaymentProvider;
import com.cnk.travelogix.common.core.payment.services.CnkPaymentService;
import com.cnk.travelogix.common.core.payment.strategies.CnkPaymentFormActionUrlStrategy;
import com.cnk.travelogix.common.core.payment.strategies.CnkPaymentInfoCreateStrategy;
import com.cnk.travelogix.common.core.payment.strategies.CnkPaymentPlanCreateStrategy;
import com.cnk.travelogix.common.core.payment.strategies.CnkPaymentPlanUpdateStrategy;
import com.cnk.travelogix.common.core.payment.strategies.CnkPaymentTransactionStrategy;
import com.cnk.travelogix.integrations.payment.response.beans.PaymentServiceResponseData;


public class CustomCnkPaymentService implements CnkPaymentService
{

	private static final Logger LOG = Logger.getLogger(CustomCnkPaymentService.class);
	private static final String SUBSCRIPTION_SIGNATURE_DATA_CANNOT_BE_NULL_MSG = "SubscriptionSignatureData cannot be null";
	private static final String SUBSCRIPTION_INFO_DATA_CANNOT_BE_NULL_MSG = "SubscriptionInfoData cannot be null";
	private static final String SIGNATURE_DATA_CANNOT_BE_NULL_MSG = "SignatureData cannot be null";
	private static final String PAYMENT_INFO_DATA_CANNOT_BE_NULL_MSG = "PaymentInfoData cannot be null";
	private static final String ORDER_INFO_DATA_CANNOT_BE_NULL_MSG = "OrderInfoData cannot be null";
	private static final String CUSTOMER_INFO_DATA_CANNOT_BE_NULL_MSG = "CustomerInfoData cannot be null";
	private static final String AUTH_REPLY_DATA_CANNOT_BE_NULL_MSG = "AuthReplyData cannot be null";
	private static final String DECISION_CANNOT_BE_NULL_MSG = "Decision cannot be null";
	private static final String CREATE_SUBSCRIPTION_RESULT_CANNOT_BE_NULL_MSG = "CreateSubscriptionResult cannot be null";

	private SessionService sessionService;
	private CartService cartService;
	private ModelService modelService;
	private UserService userService;
	private CreditCardPaymentSubscriptionDao creditCardPaymentSubscriptionDao;

	private SiteConfigService siteConfigService;

	private PaymentResponseInterpretationStrategy paymentResponseInterpretation;
	private PaymentResponseInterpretationStrategy hopPaymentResponseInterpretation;
	private CnkPaymentFormActionUrlStrategy paymentFormActionUrlStrategy;
	private CnkPaymentPlanCreateStrategy paymentPlanCreateStrategy;
	private CnkPaymentPlanUpdateStrategy paymentPlanUpdateStrategy;
	private Converter<CreateSubscriptionRequest, PaymentData> paymentDataConverter;
	private CommonI18NService commonI18NService;
	private CreateSubscriptionRequestStrategy createSubscriptionRequestStrategy;
	private CreateSubscriptionResultValidationStrategy createSubscriptionResultValidationStrategy;
	private SignatureValidationStrategy signatureValidationStrategy;
	private CnkPaymentInfoCreateStrategy cnkPaymentInfoCreateStrategy;
	private CnkPaymentTransactionStrategy paymentTransactionStrategy;
	private FraudCallbackStrategy fraudCallbackStrategy;
	private ClientReferenceLookupStrategy clientReferenceLookupStrategy;
	private Map<String, PaymentProvider> paymentProviderMap;

	@Override
	public PaymentData beginHopCreatePaymentSubscription(final String siteName, final String responseUrl,
			final String merchantCallbackUrl, final CustomerModel customer, final CreditCardPaymentInfoModel cardInfo,
			final AddressModel paymentAddress)
	{
		final String requestUrl = getPaymentFormActionUrlStrategy().getHopRequestUrl("");
		Assert.notNull(requestUrl, "The HopRequestUrl cannot be null");
		final CreateSubscriptionRequest request = getCreateSubscriptionRequestStrategy().createSubscriptionRequest(siteName,
				requestUrl, responseUrl, merchantCallbackUrl, customer, cardInfo, paymentAddress);
		PaymentData data = getPaymentDataConverter().convert(request);
		if (data == null)
		{
			data = new PaymentData();
			data.setParameters(new HashMap<String, String>());
		}
		return data;
	}

	@Override
	public PaymentData beginSopCreatePaymentSubscription(final String siteName, final String responseUrl,
			final String merchantCallbackUrl, final CustomerModel customer, final CreditCardPaymentInfoModel cardInfo,
			final AddressModel paymentAddress)
	{
		final String requestUrl = getPaymentFormActionUrlStrategy()
				.getSopRequestUrl(getClientReferenceLookupStrategy().lookupClientReferenceId());

		Assert.notNull(requestUrl, "The SopRequestUrl cannot be null");

		final CreateSubscriptionRequest request = getCreateSubscriptionRequestStrategy().createSubscriptionRequest(siteName,
				requestUrl, responseUrl, merchantCallbackUrl, customer, cardInfo, paymentAddress);

		PaymentData data = getPaymentDataConverter().convert(request);
		if (data == null)
		{
			data = new PaymentData();
			data.setParameters(new HashMap<>());
		}

		return data;
	}

	@Override
	public PaymentSubscriptionResultItem completeHopCreatePaymentSubscription(final CustomerModel customerModel,
			final boolean saveInAccount, final Map<String, String> parameters)
	{
		final Map<String, PaymentErrorField> errors = new HashMap<>();
		final CreateSubscriptionResult response = getHopPaymentResponseInterpretation().interpretResponse(parameters, null, errors);

		validateParameterNotNull(response, CREATE_SUBSCRIPTION_RESULT_CANNOT_BE_NULL_MSG);
		Assert.notNull(response.getDecision(), DECISION_CANNOT_BE_NULL_MSG);
		Assert.notNull(response.getAuthReplyData(), AUTH_REPLY_DATA_CANNOT_BE_NULL_MSG);
		Assert.notNull(response.getCustomerInfoData(), CUSTOMER_INFO_DATA_CANNOT_BE_NULL_MSG);
		Assert.notNull(response.getOrderInfoData(), ORDER_INFO_DATA_CANNOT_BE_NULL_MSG);
		Assert.notNull(response.getPaymentInfoData(), PAYMENT_INFO_DATA_CANNOT_BE_NULL_MSG);
		Assert.notNull(response.getSignatureData(), SIGNATURE_DATA_CANNOT_BE_NULL_MSG);
		Assert.notNull(response.getSubscriptionInfoData(), SUBSCRIPTION_INFO_DATA_CANNOT_BE_NULL_MSG);
		Assert.notNull(response.getSubscriptionSignatureData(), SUBSCRIPTION_SIGNATURE_DATA_CANNOT_BE_NULL_MSG);

		final PaymentSubscriptionResultItem paymentSubscriptionResult = new PaymentSubscriptionResultItem();
		paymentSubscriptionResult.setSuccess(DecisionsEnum.ACCEPT.name().equalsIgnoreCase(response.getDecision()));
		paymentSubscriptionResult.setDecision(String.valueOf(response.getDecision()));
		paymentSubscriptionResult.setResultCode(String.valueOf(response.getReasonCode()));

		if (DecisionsEnum.ACCEPT.name().equalsIgnoreCase(response.getDecision()))
		{
			// Validate signature
			if (getSignatureValidationStrategy().validateSignature(response.getSubscriptionInfoData()))
			{
				getPaymentTransactionStrategy().savePaymentTransactionEntry(customerModel, response.getRequestId(),
						response.getOrderInfoData());
				final CreditCardPaymentInfoModel cardPaymentInfoModel = getCnkPaymentInfoCreateStrategy().saveSubscription(
						customerModel, response.getCustomerInfoData(), response.getSubscriptionInfoData(),
						response.getPaymentInfoData(), saveInAccount);
				paymentSubscriptionResult.setStoredCard(cardPaymentInfoModel);

				// Check if the subscription has already been validated
				final CCPaySubValidationModel subscriptionValidation = getCreditCardPaymentSubscriptionDao()
						.findSubscriptionValidationBySubscription(cardPaymentInfoModel.getSubscriptionId());
				if (subscriptionValidation != null)
				{
					cardPaymentInfoModel.setSubscriptionValidated(true);
					getModelService().save(cardPaymentInfoModel);
					getModelService().remove(subscriptionValidation);
				}
			}
			else
			{
				LOG.error("Cannot create subscription. Subscription signature does not match.");
			}
		}
		else
		{
			LOG.error(
					"Cannot create subscription. Decision: " + response.getDecision() + " - Reason Code: " + response.getReasonCode());
			paymentSubscriptionResult.setErrors(errors);
		}
		return paymentSubscriptionResult;
	}

	@Override
	public PaymentSubscriptionResultItem completeSopCreatePaymentSubscription(final CustomerModel customerModel,
			final boolean saveInAccount, final Map<String, String> parameters)
	{
		final PaymentSubscriptionResultItem paymentSubscriptionResult = new PaymentSubscriptionResultItem();
		final Map<String, PaymentErrorField> errors = new HashMap<String, PaymentErrorField>();
		paymentSubscriptionResult.setErrors(errors);

		final CreateSubscriptionResult response = getPaymentResponseInterpretation().interpretResponse(parameters,
				getClientReferenceLookupStrategy().lookupClientReferenceId(), errors);

		validateParameterNotNull(response, CREATE_SUBSCRIPTION_RESULT_CANNOT_BE_NULL_MSG);
		validateParameterNotNull(response.getDecision(), DECISION_CANNOT_BE_NULL_MSG);

		if (!getCreateSubscriptionResultValidationStrategy().validateCreateSubscriptionResult(errors, response).isEmpty())
		{
			return paymentSubscriptionResult;
		}

		paymentSubscriptionResult.setSuccess(DecisionsEnum.ACCEPT.name().equalsIgnoreCase(response.getDecision()));
		paymentSubscriptionResult.setDecision(String.valueOf(response.getDecision()));
		paymentSubscriptionResult.setResultCode(String.valueOf(response.getReasonCode()));

		if (DecisionsEnum.ACCEPT.name().equalsIgnoreCase(response.getDecision()))
		{
			// in case of ACCEPT we should have all these fields filled out
			Assert.notNull(response.getAuthReplyData(), AUTH_REPLY_DATA_CANNOT_BE_NULL_MSG);
			Assert.notNull(response.getCustomerInfoData(), CUSTOMER_INFO_DATA_CANNOT_BE_NULL_MSG);
			Assert.notNull(response.getOrderInfoData(), ORDER_INFO_DATA_CANNOT_BE_NULL_MSG);
			Assert.notNull(response.getPaymentInfoData(), PAYMENT_INFO_DATA_CANNOT_BE_NULL_MSG);
			Assert.notNull(response.getSignatureData(), SIGNATURE_DATA_CANNOT_BE_NULL_MSG);
			Assert.notNull(response.getSubscriptionInfoData(), SUBSCRIPTION_INFO_DATA_CANNOT_BE_NULL_MSG);
			Assert.notNull(response.getSubscriptionSignatureData(), SUBSCRIPTION_SIGNATURE_DATA_CANNOT_BE_NULL_MSG);

			// Validate signature
			if (getSignatureValidationStrategy().validateSignature(response.getSubscriptionInfoData()))
			{
				getPaymentTransactionStrategy().savePaymentTransactionEntry(customerModel, response.getRequestId(),
						response.getOrderInfoData());
				final CreditCardPaymentInfoModel cardPaymentInfoModel = getCnkPaymentInfoCreateStrategy().saveSubscription(
						customerModel, response.getCustomerInfoData(), response.getSubscriptionInfoData(),
						response.getPaymentInfoData(), saveInAccount);
				paymentSubscriptionResult.setStoredCard(cardPaymentInfoModel);

				// Check if the subscription has already been validated
				final CCPaySubValidationModel subscriptionValidation = getCreditCardPaymentSubscriptionDao()
						.findSubscriptionValidationBySubscription(cardPaymentInfoModel.getSubscriptionId());
				if (subscriptionValidation != null)
				{
					cardPaymentInfoModel.setSubscriptionValidated(true);
					getModelService().save(cardPaymentInfoModel);
					getModelService().remove(subscriptionValidation);
				}
			}
			else
			{
				LOG.error("Cannot create subscription. Subscription signature does not match.");
			}
		}
		else
		{
			LOG.error(
					"Cannot create subscription. Decision: " + response.getDecision() + " - Reason Code: " + response.getReasonCode());
		}
		return paymentSubscriptionResult;
	}

	@Override
	public void handleCreateSubscriptionCallback(final Map<String, String> parameters)
	{
		parameters.put("VerifyTransactionSignature()", "true");
		final Map<String, PaymentErrorField> errors = new HashMap<>();
		final CreateSubscriptionResult response = getPaymentResponseInterpretation().interpretResponse(parameters,
				getClientReferenceLookupStrategy().lookupClientReferenceId(), errors);

		if (errors.isEmpty())
		{
			validateParameterNotNull(response, CREATE_SUBSCRIPTION_RESULT_CANNOT_BE_NULL_MSG);
			Assert.notNull(response.getDecision(), DECISION_CANNOT_BE_NULL_MSG);
			Assert.notNull(response.getAuthReplyData(), AUTH_REPLY_DATA_CANNOT_BE_NULL_MSG);
			Assert.notNull(response.getCustomerInfoData(), CUSTOMER_INFO_DATA_CANNOT_BE_NULL_MSG);
			Assert.notNull(response.getOrderInfoData(), ORDER_INFO_DATA_CANNOT_BE_NULL_MSG);
			Assert.notNull(response.getPaymentInfoData(), PAYMENT_INFO_DATA_CANNOT_BE_NULL_MSG);
			Assert.notNull(response.getSignatureData(), SIGNATURE_DATA_CANNOT_BE_NULL_MSG);
			Assert.notNull(response.getSubscriptionInfoData(), SUBSCRIPTION_INFO_DATA_CANNOT_BE_NULL_MSG);
			Assert.notNull(response.getSubscriptionSignatureData(), SUBSCRIPTION_SIGNATURE_DATA_CANNOT_BE_NULL_MSG);

			if (DecisionsEnum.ACCEPT.name().equalsIgnoreCase(response.getDecision()))
			{
				if (getSignatureValidationStrategy().validateSignature(response.getSubscriptionInfoData()))
				{
					markPaymentValidated(response);
				}
				else
				{
					LOG.error(String.format(
							"Cannot create subscription. Subscription signature does not match SubscriptionSignedValue=%s SubscriptionIDPublicSignature=%s",
							response.getSubscriptionInfoData().getSubscriptionSignedValue(),
							response.getSubscriptionInfoData().getSubscriptionIDPublicSignature()));
				}
			}
		}
	}

	protected void markPaymentValidated(final CreateSubscriptionResult response)
	{
		// Look to see if there is already a CreditCardPaymentInfoModel with that SubscriptionID
		final String subscriptionID = response.getSubscriptionInfoData().getSubscriptionID();
		final CreditCardPaymentInfoModel paymentInfo = getCreditCardPaymentSubscriptionDao()
				.findCreditCartPaymentBySubscription(subscriptionID);
		if (paymentInfo != null)
		{
			// Mark the CreditCardPaymentInfoModel as validated
			paymentInfo.setSubscriptionValidated(true);
			getModelService().save(paymentInfo);
		}
		else
		{
			// No CreditCardPaymentInfoModel exists yet, create a CCPaySubValidationModel to store the validated subscription ID
			final CCPaySubValidationModel subscriptionInfo = getModelService().create(CCPaySubValidationModel.class);
			subscriptionInfo.setSubscriptionId(subscriptionID);
			getModelService().save(subscriptionInfo);
		}
	}

	@Override
	public void handleFraudUpdateCallback(final Map<String, String> parameters)
	{
		getFraudCallbackStrategy().handleFraudCallback(parameters);
	}

	/**
	 * This method add new PaymentTransactionEntry of type REVIEW_DECISION to the order. It also send event to allow
	 * submitorder proccess to end waitForReviewDecision action.
	 *
	 * @param reviewDecisionEntry
	 *           - payment transaction entry of REVIEW_DECISION type
	 * @param guid
	 *           - {@link de.hybris.platform.core.model.order.AbstractOrderModel#GUID} to which PaymentTransaction will
	 *           be added
	 */
	@Override
	public void setPaymentTransactionReviewResult(final PaymentTransactionEntryModel reviewDecisionEntry, final String guid)
	{
		getPaymentTransactionStrategy().setPaymentTransactionReviewResult(reviewDecisionEntry, guid);
	}


	protected UserService getUserService()
	{
		return userService;
	}

	@Required
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	protected ModelService getModelService()
	{
		return modelService;
	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	protected CartService getCartService()
	{
		return cartService;
	}

	@Required
	public void setCartService(final CartService cartService)
	{
		this.cartService = cartService;
	}

	public CreditCardPaymentSubscriptionDao getCreditCardPaymentSubscriptionDao()
	{
		return creditCardPaymentSubscriptionDao;
	}

	@Required
	public void setCreditCardPaymentSubscriptionDao(final CreditCardPaymentSubscriptionDao creditCardPaymentSubscriptionDao)
	{
		this.creditCardPaymentSubscriptionDao = creditCardPaymentSubscriptionDao;
	}

	protected CnkPaymentFormActionUrlStrategy getPaymentFormActionUrlStrategy()
	{
		return paymentFormActionUrlStrategy;
	}

	@Required
	public void setPaymentFormActionUrlStrategy(final CnkPaymentFormActionUrlStrategy paymentFormActionUrlStrategy)
	{
		this.paymentFormActionUrlStrategy = paymentFormActionUrlStrategy;
	}

	protected PaymentResponseInterpretationStrategy getPaymentResponseInterpretation()
	{
		return paymentResponseInterpretation;
	}

	@Required
	public void setPaymentResponseInterpretation(final PaymentResponseInterpretationStrategy paymentResponseInterpretation)
	{
		this.paymentResponseInterpretation = paymentResponseInterpretation;
	}

	protected PaymentResponseInterpretationStrategy getHopPaymentResponseInterpretation()
	{
		return hopPaymentResponseInterpretation;
	}

	@Required
	public void setHopPaymentResponseInterpretation(final PaymentResponseInterpretationStrategy paymentResponseInterpretation)
	{
		this.hopPaymentResponseInterpretation = paymentResponseInterpretation;
	}

	protected Converter<CreateSubscriptionRequest, PaymentData> getPaymentDataConverter()
	{
		return paymentDataConverter;
	}

	@Required
	public void setPaymentDataConverter(final Converter<CreateSubscriptionRequest, PaymentData> paymentDataConverter)
	{
		this.paymentDataConverter = paymentDataConverter;
	}

	protected SiteConfigService getSiteConfigService()
	{
		return siteConfigService;
	}

	@Required
	public void setSiteConfigService(final SiteConfigService siteConfigService)
	{
		this.siteConfigService = siteConfigService;
	}

	protected CommonI18NService getCommonI18NService()
	{
		return commonI18NService;
	}

	@Required
	public void setCommonI18NService(final CommonI18NService commonI18NService)
	{
		this.commonI18NService = commonI18NService;
	}

	protected CreateSubscriptionRequestStrategy getCreateSubscriptionRequestStrategy()
	{
		return createSubscriptionRequestStrategy;
	}

	@Required
	public void setCreateSubscriptionRequestStrategy(final CreateSubscriptionRequestStrategy createSubscriptionRequestStrategy)
	{
		this.createSubscriptionRequestStrategy = createSubscriptionRequestStrategy;
	}

	protected CreateSubscriptionResultValidationStrategy getCreateSubscriptionResultValidationStrategy()
	{
		return createSubscriptionResultValidationStrategy;
	}

	@Required
	public void setCreateSubscriptionResultValidationStrategy(
			final CreateSubscriptionResultValidationStrategy createSubscriptionResultValidationStrategy)
	{
		this.createSubscriptionResultValidationStrategy = createSubscriptionResultValidationStrategy;
	}

	protected SignatureValidationStrategy getSignatureValidationStrategy()
	{
		return signatureValidationStrategy;
	}

	@Required
	public void setSignatureValidationStrategy(final SignatureValidationStrategy signatureValidationStrategy)
	{
		this.signatureValidationStrategy = signatureValidationStrategy;
	}


	protected FraudCallbackStrategy getFraudCallbackStrategy()
	{
		return fraudCallbackStrategy;
	}

	@Required
	public void setFraudCallbackStrategy(final FraudCallbackStrategy fraudCallbackStrategy)
	{
		this.fraudCallbackStrategy = fraudCallbackStrategy;
	}

	protected ClientReferenceLookupStrategy getClientReferenceLookupStrategy()
	{
		return clientReferenceLookupStrategy;
	}

	@Required
	public void setClientReferenceLookupStrategy(final ClientReferenceLookupStrategy clientReferenceLookupStrategy)
	{
		this.clientReferenceLookupStrategy = clientReferenceLookupStrategy;
	}


	/**
	 * @return the sessionService
	 */
	public SessionService getSessionService()
	{
		return sessionService;
	}

	/**
	 * @param sessionService
	 *           the sessionService to set
	 */
	@Required
	public void setSessionService(final SessionService sessionService)
	{
		this.sessionService = sessionService;
	}

	/**
	 * get payment provider by card type, e.g. amex, visa etc.
	 *
	 * @param cardType
	 * @return optimal provider for specific card
	 */
	@Override
	public PaymentProvider getOptimalPaymentProvider(final String cardType)
	{
		PaymentProvider provider = null;
		if ("amex".equals(cardType))
		{
			provider = paymentProviderMap.get("amex");
		}
		else
		{
			provider = paymentProviderMap.get("firstdata");
		}
		return provider;
	}

	/**
	 * @return the paymentProviderMap
	 */
	public Map<String, PaymentProvider> getPaymentProviderMap()
	{
		return paymentProviderMap;
	}

	/**
	 * @param paymentProviderMap
	 *           the paymentProviderMap to set
	 */
	public void setPaymentProviderMap(final Map<String, PaymentProvider> paymentProviderMap)
	{
		this.paymentProviderMap = paymentProviderMap;
	}

	/**
	 * @return the paymentTransactionStrategy
	 */
	public CnkPaymentTransactionStrategy getPaymentTransactionStrategy()
	{
		return paymentTransactionStrategy;
	}

	/**
	 * @param paymentTransactionStrategy
	 *           the paymentTransactionStrategy to set
	 */
	public void setPaymentTransactionStrategy(final CnkPaymentTransactionStrategy paymentTransactionStrategy)
	{
		this.paymentTransactionStrategy = paymentTransactionStrategy;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.core.payment.services.CnkPaymentService#completeHopCapture(de.hybris.platform.core.model
	 * .user.CustomerModel, boolean, java.util.Map)
	 */
	@Override
	public PaymentSubscriptionResultItem completeHopCapture(final CustomerModel customerModel, final boolean saveInAccount,
			final Map<String, String> parameters)
	{
		final String provider = parameters.get("provider");
		final PaymentProvider paymentProvider = getPaymentProviderMap().get(provider);

		final PaymentServiceResponse paymentServerResponse = paymentProvider.interpretPaymentResponse(parameters);

		final Map<String, PaymentErrorField> errors = new HashMap<>();
		final PaymentSubscriptionResultItem paymentSubscriptionResult = new PaymentSubscriptionResultItem();
		paymentSubscriptionResult.setSuccess(paymentServerResponse.isSuccess());
		paymentSubscriptionResult.setDecision(String.valueOf(paymentServerResponse.getDecision()));
		//		paymentSubscriptionResult.setResultCode(String.valueOf(paymentServerResponse.getResultCode()));

		if (DecisionsEnum.ACCEPT.name().equalsIgnoreCase(paymentServerResponse.getDecision()))
		{
			//			getPaymentTransactionStrategy().savePaymentTransactionEntry(customerModel, response.getRequestId(),
			//					response.getOrderInfoData());
			final OrderInfoData orderInfoData = new OrderInfoData();
			orderInfoData.setOrderPageRequestToken("setOrderPageRequestToken");
			final PaymentTransactionData txnData = new PaymentTransactionData();
			txnData.setAmount(Double.valueOf(paymentServerResponse.getAmount()).doubleValue());
			txnData.setType(PaymentTransactionType.CAPTURE);
			txnData.setPaymentProvider(paymentServerResponse.getGatewayId());
			txnData.setModeOfPayment(paymentServerResponse.getPaymentMode());

			final CustomerInfoData customerInfoData = null;
			final SubscriptionInfoData subscriptionInfoData = new SubscriptionInfoData();
			final PaymentInfoData paymentInfoData = new PaymentInfoData();
			paymentInfoData.setCardAccountHolderName(paymentServerResponse.getCardHolder());
			paymentInfoData.setCardAccountNumber(paymentServerResponse.getCardNumber());
			paymentInfoData.setCardCardType(paymentServerResponse.getCardType());

			final String expiryMonth = paymentServerResponse.getCardExpiryMonth();
			if (StringUtils.isNotEmpty(expiryMonth))
			{
				paymentInfoData.setCardExpirationMonth(Integer.valueOf(expiryMonth));
			}
			final String expiryYear = paymentServerResponse.getCardExpiryYear();
			if (StringUtils.isNotEmpty(expiryYear))
			{
				paymentInfoData.setCardExpirationYear(Integer.valueOf(expiryYear));
			}

			final CreditCardPaymentInfoModel cardPaymentInfoModel = getCnkPaymentInfoCreateStrategy().saveSubscription(customerModel,
					customerInfoData, subscriptionInfoData, paymentInfoData, saveInAccount);
			final CartModel cart = getCartService().getSessionCart();
			final PaymentTransactionEntryModel entry = getPaymentTransactionStrategy().savePaymentTransactionEntry(customerModel,
					cart, cardPaymentInfoModel, txnData);
			updatePaymentPlan(cart, entry.getPaymentTransaction());
		}
		else
		{
			LOG.error("Cannot create subscription. Decision: " + paymentServerResponse.getDecision() + " - Reason Code: ");
			paymentSubscriptionResult.setErrors(errors);
		}
		return paymentSubscriptionResult;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.core.payment.services.CnkPaymentService#getPaymentSummary(de.hybris.platform.core.model.
	 * order.CartModel)
	 */
	@Override
	public PaymentSummary getPaymentSummary(final CartModel cart)
	{

		return null;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.core.payment.services.CnkPaymentService#completeEzeePayment(java.lang.String)
	 */
	@Override
	public BigDecimal completeEzeePayment(final CustomerModel customerModel, final String amountToPay)
	{
		//	YTODO
		// 1 get ezee balance from customer account
		// 2 try to compare and delete amountToPay from the ezee balance
		// 3 try to update the ezee balance with where condition timestamp

		// 4 return remain balance

		final PaymentTransactionData txnData = new PaymentTransactionData();
		txnData.setAmount(Double.valueOf(Optional.ofNullable(amountToPay).orElse("0")).doubleValue());
		txnData.setType(PaymentTransactionType.CAPTURE);


		final CustomerInfoData customerInfoData = null;
		final PaymentInfoData paymentInfoData = new PaymentInfoData();
		PaymentInfoModel paymentInfoModel = null;
		paymentInfoModel = getCnkPaymentInfoCreateStrategy().saveEzeePaymentInfo(customerModel, customerInfoData, paymentInfoData,
				false);
		final CartModel cart = getCartService().getSessionCart();
		final PaymentTransactionEntryModel entry = getPaymentTransactionStrategy().savePaymentTransactionEntry(customerModel, cart,
				paymentInfoModel, txnData);

		entry.getPaymentTransaction().setInfo(paymentInfoModel);
		entry.getPaymentTransaction().setOrder(getCartService().getSessionCart());
		getModelService().save(entry.getPaymentTransaction());
		return sumOfPayment(getCartService().getSessionCart().getPaymentTransactions());
	}

	private BigDecimal sumOfPayment(final List<PaymentTransactionModel> transactions)
	{
		final BigDecimal paidAmount = BigDecimal.ZERO;
		if (Collections.isEmpty(transactions))
		{
			return paidAmount;
		}
		final Function<PaymentTransactionModel, BigDecimal> totalMapper = trans -> {
			final Optional<PaymentTransactionEntryModel> option = trans.getEntries().stream().filter(entry -> {
				if (Arrays.asList(TransactionStatus.ACCEPTED.name()).contains(entry.getTransactionStatus()) && Arrays
						.asList(PaymentTransactionType.AUTHORIZATION, PaymentTransactionType.CAPTURE).contains(entry.getType()))
				{
					return true;
				}
				return false;
			}).findFirst();
			return option.isPresent() ? option.get().getAmount() : BigDecimal.ZERO;
		};
		return transactions.stream().map(totalMapper).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.core.payment.services.CnkPaymentService#completeHopPayment(de.hybris.platform.core.model
	 * .user.CustomerModel, com.cnk.travelogix.common.core.payment.data.PaymentServiceResponse)
	 */
	@Override
	public BigDecimal completeHopPayment(final CustomerModel customerModel,
			final PaymentServiceResponseData paymentServiceResponse)
	{

		final PaymentTransactionData txnData = new PaymentTransactionData();
		txnData.setAmount(Double.valueOf(Optional.ofNullable(paymentServiceResponse.getAmount()).orElse("0")).doubleValue());
		txnData.setType(PaymentTransactionType.CAPTURE);
		txnData.setPaymentProvider(paymentServiceResponse.getGatewayId());
		final PaymentInfoData paymentInfoData = new PaymentInfoData();
		paymentInfoData.setCardAccountHolderName(paymentServiceResponse.getCardHolder());
		paymentInfoData.setCardAccountNumber(paymentServiceResponse.getCardNumber());
		paymentInfoData.setCardCardType(paymentServiceResponse.getCardType());

		Optional.ofNullable(paymentServiceResponse.getCardExpiryMonth())
				.ifPresent(value -> paymentInfoData.setCardExpirationMonth(Integer.valueOf(value)));
		Optional.ofNullable(paymentServiceResponse.getCardExpiryYear())
				.ifPresent(value -> paymentInfoData.setCardExpirationYear(Integer.valueOf(value)));
		final PaymentInfoModel paymentInfoModel = getCnkPaymentInfoCreateStrategy().saveHopPaymentInfo(customerModel,
				paymentServiceResponse, paymentInfoData, false);
		final CartModel cart = getCartService().getSessionCart();
		final PaymentTransactionEntryModel entry = getPaymentTransactionStrategy().savePaymentTransactionEntry(customerModel, cart,
				paymentInfoModel, txnData);
		updatePaymentPlan(cart, entry.getPaymentTransaction());
		LOG.debug("complete hop payment, new payment transaction entry is created, code ["
				+ Optional.ofNullable(entry).orElse(new PaymentTransactionEntryModel()).getCode() + "]");

		return sumOfPayment(getCartService().getSessionCart().getPaymentTransactions());
	}

	/**
	 * @return the cnkPaymentInfoCreateStrategy
	 */
	public CnkPaymentInfoCreateStrategy getCnkPaymentInfoCreateStrategy()
	{
		return cnkPaymentInfoCreateStrategy;
	}

	/**
	 * @param cnkPaymentInfoCreateStrategy
	 *           the cnkPaymentInfoCreateStrategy to set
	 */
	public void setCnkPaymentInfoCreateStrategy(final CnkPaymentInfoCreateStrategy cnkPaymentInfoCreateStrategy)
	{
		this.cnkPaymentInfoCreateStrategy = cnkPaymentInfoCreateStrategy;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.core.payment.services.CnkPaymentService#completeCodPayment(de.hybris.platform.core.model
	 * .user.CustomerModel, com.cnk.travelogix.common.core.payment.data.CodPaymentInfoData)
	 */
	@Override
	public void completeCodPayment(final CustomerModel customerModel, final CodPaymentInfoData cod, final CartModel cart)
	{
		final CodPaymentInfoModel paymentInfoModel = getCnkPaymentInfoCreateStrategy().createCodPaymentInfo(customerModel, cod);
		final PaymentTransactionData txnData = new PaymentTransactionData();
		txnData.setAmount(cart.getTotalPrice().doubleValue());
		txnData.setType(PaymentTransactionType.CAPTURE);
		txnData.setModeOfPayment(PaymentModes.COD.getCode());
		final PaymentTransactionEntryModel entry = getPaymentTransactionStrategy().savePaymentTransactionEntry(customerModel, cart,
				paymentInfoModel, txnData);
		updatePaymentPlan(cart, entry.getPaymentTransaction());
		LOG.debug("complete cod payment, new payment transaction entry is created, code ["
				+ Optional.ofNullable(entry).orElse(new PaymentTransactionEntryModel()).getCode() + "]");
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.core.payment.services.CnkPaymentService#updatePaymentPlan(de.hybris.platform.core.model.
	 * order.CartModel)
	 */
	@Override
	public void updatePaymentPlan(final CartModel cart, final PaymentTransactionModel paymentTransactionModel)
	{
		getPaymentPlanUpdateStrategy().updatePaymentPlan(cart, paymentTransactionModel);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.core.payment.services.CnkPaymentService#generatePlan(de.hybris.platform.core.model.order
	 * .AbstractOrderModel)
	 */
	@Override
	public void generatePaymentPlan(final AbstractOrderModel order)
	{
		getPaymentPlanCreateStrategy().createPaymentPlan(order);
	}


	/**
	 * @return the paymentPlanCreateStrategy
	 */
	public CnkPaymentPlanCreateStrategy getPaymentPlanCreateStrategy()
	{
		return paymentPlanCreateStrategy;
	}

	/**
	 * @param paymentPlanCreateStrategy
	 *           the paymentPlanCreateStrategy to set
	 */
	public void setPaymentPlanCreateStrategy(final CnkPaymentPlanCreateStrategy paymentPlanCreateStrategy)
	{
		this.paymentPlanCreateStrategy = paymentPlanCreateStrategy;
	}

	/**
	 * @return the paymentPlanUpdateStrategy
	 */
	public CnkPaymentPlanUpdateStrategy getPaymentPlanUpdateStrategy()
	{
		return paymentPlanUpdateStrategy;
	}

	/**
	 * @param paymentPlanUpdateStrategy
	 *           the paymentPlanUpdateStrategy to set
	 */
	public void setPaymentPlanUpdateStrategy(final CnkPaymentPlanUpdateStrategy paymentPlanUpdateStrategy)
	{
		this.paymentPlanUpdateStrategy = paymentPlanUpdateStrategy;
	}
}
