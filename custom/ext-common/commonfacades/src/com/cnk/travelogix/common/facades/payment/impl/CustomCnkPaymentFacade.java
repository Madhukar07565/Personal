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
package com.cnk.travelogix.common.facades.payment.impl;

import de.hybris.platform.acceleratorfacades.order.AcceleratorCheckoutFacade;
import de.hybris.platform.acceleratorfacades.payment.data.PaymentSubscriptionResultData;
import de.hybris.platform.acceleratorservices.config.SiteConfigService;
import de.hybris.platform.acceleratorservices.payment.data.PaymentData;
import de.hybris.platform.acceleratorservices.payment.data.PaymentSubscriptionResultItem;
import de.hybris.platform.acceleratorservices.urlresolver.SiteBaseUrlResolutionService;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commerceservices.strategies.CheckoutCustomerStrategy;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.order.CartService;
import de.hybris.platform.order.InvalidCartException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.store.services.BaseStoreService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.common.core.enums.PaymentModes;
import com.cnk.travelogix.common.core.payment.data.AjaxResult;
import com.cnk.travelogix.common.core.payment.data.CodPaymentInfoData;
import com.cnk.travelogix.common.core.payment.data.MsfFee;
import com.cnk.travelogix.common.core.payment.data.PaymentFeeData;
import com.cnk.travelogix.common.core.payment.data.PaymentModeInfo;
import com.cnk.travelogix.common.core.payment.data.PaymentModeSetting;
import com.cnk.travelogix.common.core.payment.ezg.PaymentProvider;
import com.cnk.travelogix.common.core.payment.services.CnkPaymentService;
import com.cnk.travelogix.common.core.util.MathUtil;
import com.cnk.travelogix.common.facades.payment.CnkPaymentFacade;
import com.cnk.travelogix.integrations.payment.response.beans.PaymentServiceResponseData;


public class CustomCnkPaymentFacade implements CnkPaymentFacade
{

	private final static Logger LOG = Logger.getLogger(CustomCnkPaymentFacade.class);

	private BaseSiteService baseSiteService;
	private BaseStoreService baseStoreService;
	private SiteConfigService siteConfigService;
	private CartService cartService;

	private Converter<PaymentSubscriptionResultItem, PaymentSubscriptionResultData> paymentSubscriptionResultDataConverter;
	private CnkPaymentService paymentService;
	private SiteBaseUrlResolutionService siteBaseUrlResolutionService;
	private UserService userService;
	private CheckoutCustomerStrategy checkoutCustomerStrategy;

	private Populator<BaseStoreModel, PaymentModeSetting> paymentModeSettingPopulator;

	private SessionService sessionService;

	private AcceleratorCheckoutFacade checkoutFacade;

	//	private Map<String, PaymentProvider> paymentProviderMap;

	protected CheckoutCustomerStrategy getCheckoutCustomerStrategy()
	{
		return checkoutCustomerStrategy;
	}

	@Required
	public void setCheckoutCustomerStrategy(final CheckoutCustomerStrategy checkoutCustomerStrategy)
	{
		this.checkoutCustomerStrategy = checkoutCustomerStrategy;
	}

	protected BaseSiteService getBaseSiteService()
	{
		return baseSiteService;
	}

	@Required
	public void setBaseSiteService(final BaseSiteService baseSiteService)
	{
		this.baseSiteService = baseSiteService;
	}

	protected SiteBaseUrlResolutionService getSiteBaseUrlResolutionService()
	{
		return siteBaseUrlResolutionService;
	}

	@Required
	public void setSiteBaseUrlResolutionService(final SiteBaseUrlResolutionService siteBaseUrlResolutionService)
	{
		this.siteBaseUrlResolutionService = siteBaseUrlResolutionService;
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


	protected Converter<PaymentSubscriptionResultItem, PaymentSubscriptionResultData> getPaymentSubscriptionResultDataConverter()
	{
		return paymentSubscriptionResultDataConverter;
	}

	@Required
	public void setPaymentSubscriptionResultDataConverter(
			final Converter<PaymentSubscriptionResultItem, PaymentSubscriptionResultData> paymentSubscriptionResultDataConverter)
	{
		this.paymentSubscriptionResultDataConverter = paymentSubscriptionResultDataConverter;
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

	@Override
	public PaymentData beginHopCreateSubscription(final String responseUrl, final String merchantCallbackUrl)
	{
		final String fullResponseUrl = getFullResponseUrl(responseUrl, true);
		final String fullMerchantCallbackUrl = getFullResponseUrl(merchantCallbackUrl, true);
		final String siteName = getCurrentSiteName();

		final CustomerModel customerModel = getCurrentUserForCheckout();
		final AddressModel paymentAddress = getDefaultPaymentAddress(customerModel);

		return getPaymentService().beginHopCreatePaymentSubscription(siteName, fullResponseUrl, fullMerchantCallbackUrl,
				customerModel, null, paymentAddress);
	}

	@Override
	public PaymentData beginSopCreateSubscription(final String responseUrl, final String merchantCallbackUrl)
	{
		final String fullResponseUrl = getFullResponseUrl(responseUrl, true);
		final String fullMerchantCallbackUrl = getFullResponseUrl(merchantCallbackUrl, true);
		final String siteName = getCurrentSiteName();

		final CustomerModel customerModel = getCurrentUserForCheckout();
		final AddressModel paymentAddress = getDefaultPaymentAddress(customerModel);

		return getPaymentService().beginSopCreatePaymentSubscription(siteName, fullResponseUrl, fullMerchantCallbackUrl,
				customerModel, null, paymentAddress);
	}

	@Override
	public PaymentSubscriptionResultData completeHopCreateSubscription(final Map<String, String> parameters,
			final boolean saveInAccount)
	{

		final CustomerModel customerModel = getCurrentUserForCheckout();
		final PaymentSubscriptionResultItem paymentSubscriptionResultItem = getPaymentService()
				.completeHopCreatePaymentSubscription(customerModel, saveInAccount, parameters);

		if (paymentSubscriptionResultItem != null)
		{
			return getPaymentSubscriptionResultDataConverter().convert(paymentSubscriptionResultItem);
		}

		return null;
	}

	@Override
	public PaymentSubscriptionResultData completeSopCreateSubscription(final Map<String, String> parameters,
			final boolean saveInAccount)
	{
		final CustomerModel customerModel = getCurrentUserForCheckout();
		final PaymentSubscriptionResultItem paymentSubscriptionResultItem = getPaymentService()
				.completeSopCreatePaymentSubscription(customerModel, saveInAccount, parameters);

		if (paymentSubscriptionResultItem != null)
		{
			return getPaymentSubscriptionResultDataConverter().convert(paymentSubscriptionResultItem);
		}

		return null;
	}

	protected AddressModel getDefaultPaymentAddress(final CustomerModel customerModel)
	{
		return customerModel.getDefaultPaymentAddress();
	}

	/**
	 * @return the name of the current base site.
	 */
	protected String getCurrentSiteName()
	{
		final BaseSiteModel currentBaseSite = getBaseSiteService().getCurrentBaseSite();

		return currentBaseSite == null ? "" : currentBaseSite.getUid();
	}

	/**
	 * Resolves a given URL to a full URL including server and port, etc.
	 *
	 * @param responseUrl
	 *           - the URL to resolve
	 * @param isSecure
	 *           - flag to indicate whether the final URL should use a secure connection or not.
	 * @return a full URL including HTTP protocol, server, port, path etc.
	 */
	protected String getFullResponseUrl(final String responseUrl, final boolean isSecure)
	{
		final BaseSiteModel currentBaseSite = getBaseSiteService().getCurrentBaseSite();

		final String fullResponseUrl = getSiteBaseUrlResolutionService().getWebsiteUrlForSite(currentBaseSite, isSecure,
				responseUrl);

		return fullResponseUrl == null ? "" : fullResponseUrl;
	}

	protected CustomerModel getCurrentUserForCheckout()
	{
		return getCheckoutCustomerStrategy().getCurrentUserForCheckout();
	}

	/**
	 * @return the paymentService
	 */
	public CnkPaymentService getPaymentService()
	{
		return paymentService;
	}

	/**
	 * @param paymentService
	 *           the paymentService to set
	 */
	public void setPaymentService(final CnkPaymentService paymentService)
	{
		this.paymentService = paymentService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.facades.payment.CnkPaymentFacade#getPaymentModeSetting()
	 */
	@Override
	public PaymentModeSetting getPaymentModeSetting()
	{
		final PaymentModeSetting setting = new PaymentModeSetting();
		final BaseStoreModel currentBaseStore = getBaseStoreService().getCurrentBaseStore();
		paymentModeSettingPopulator.populate(currentBaseStore, setting);
		sessionService.setAttribute(cartService.getSessionCart().getCode() + "_PaymentModeSetting", setting);
		return setting;
	}

	/**
	 * @return the baseStoreService
	 */
	public BaseStoreService getBaseStoreService()
	{
		return baseStoreService;
	}

	/**
	 * @param baseStoreService
	 *           the baseStoreService to set
	 */
	@Required
	public void setBaseStoreService(final BaseStoreService baseStoreService)
	{
		this.baseStoreService = baseStoreService;
	}

	/**
	 * @return the paymentModeSettingPopulator
	 */
	public Populator<BaseStoreModel, PaymentModeSetting> getPaymentModeSettingPopulator()
	{
		return paymentModeSettingPopulator;
	}

	/**
	 * @param paymentModeSettingPopulator
	 *           the paymentModeSettingPopulator to set
	 */
	public void setPaymentModeSettingPopulator(final Populator<BaseStoreModel, PaymentModeSetting> paymentModeSettingPopulator)
	{
		this.paymentModeSettingPopulator = paymentModeSettingPopulator;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.facades.payment.CnkPaymentFacade#prepareHopOrderPageData(java.lang.String)
	 */
	@Override
	public PaymentData prepareHopOrderPageData(final String cartCode, final String cardType, final String amount,
			final String responseUrl)
	{
		final PaymentData hostedOrderPageData = new PaymentData();
		final PaymentProvider provider = paymentService.getOptimalPaymentProvider(cardType);
		hostedOrderPageData.setPostUrl(provider.getPaymentServerSetting().getPaymentServerUrl());
		final String partUrl = String.format(responseUrl, provider.getCode());
		hostedOrderPageData.setParameters(provider.getPaymentFields(cartCode, amount, getFullResponseUrl(partUrl, true)));
		return hostedOrderPageData;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.facades.payment.CnkPaymentFacade#completeHopCapture(java.util.Map, boolean)
	 */
	@Override
	public PaymentSubscriptionResultData completeHopCapture(final Map<String, String> parameters, final boolean saveInAccount)
	{
		final CustomerModel customerModel = getCurrentUserForCheckout();
		final PaymentSubscriptionResultItem paymentSubscriptionResultItem = getPaymentService().completeHopCapture(customerModel,
				saveInAccount, parameters);

		if (paymentSubscriptionResultItem != null)
		{
			return getPaymentSubscriptionResultDataConverter().convert(paymentSubscriptionResultItem);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.facades.payment.CnkPaymentFacade#completeEzeeCapture(java.lang.String)
	 */
	@Override
	public String completeEzeeCapture(final String amountToPay)
	{
		//		final String remainBalance = getPaymentService().completeEzeePayment(amountToPay);
		final CustomerModel customerModel = getCurrentUserForCheckout();
		final CartModel cart = cartService.getSessionCart();
		final BigDecimal amountPaid = getPaymentService().completeEzeePayment(customerModel, amountToPay);
		getPaymentService().getPaymentSummary(cart);
		return String.valueOf(cart.getTotalPrice().doubleValue() - amountPaid.doubleValue());
	}

	/**
	 * @return the cartService
	 */
	public CartService getCartService()
	{
		return cartService;
	}

	/**
	 * @param cartService
	 *           the cartService to set
	 */
	public void setCartService(final CartService cartService)
	{
		this.cartService = cartService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.facades.payment.CnkPaymentFacade#completeHopPayment(com.cnk.travelogix.common.core.
	 * payment.data.PaymentServiceResponse)
	 */
	@Override
	public String completeHopPayment(final PaymentServiceResponseData response)
	{
		final CustomerModel customerModel = getCurrentUserForCheckout();
		final BigDecimal amountPaid = getPaymentService().completeHopPayment(customerModel, response);
		if (Double.compare(amountPaid.doubleValue(), cartService.getSessionCart().getTotalPrice().doubleValue()) >= 0)
		{
			OrderData order = null;
			try
			{
				order = getCheckoutFacade().placeOrder();
			}
			catch (final InvalidCartException e)
			{
				LOG.error("place order error after payment succeed,", e);
				throw new RuntimeException(e);
			}
			return "redirect:/order/" + order.getCode();
		}
		return "redirect:/checkout/multi/payment";
	}

	//	/**
	//	 * @param amountPaid
	//	 *           <p>
	//	 *           initial pay: order down amount - paid amount - disaccount = 0
	//	 *           </p>
	//	 *           <p>
	//	 *           subsequent pay: balance amount is paid
	//	 *           </p>
	//	 * @return true if paid amount meet the down payment condition
	//	 */
	//	private boolean isOrderDownPaymentComplete(final BigDecimal amountPaid)
	//	{
	//		//		final BigDecimal paidAmount = BigDecimal.ZERO;
	//		//		if (!Collections.isEmpty(transactions))
	//		//		{
	//		//			try
	//		//			{
	//		//				transactions.forEach(trans -> {
	//		//					trans.getEntries().stream().filter(entry -> {
	//		//						if (Arrays.asList(TransactionStatus.ACCEPTED.name()).contains(entry.getTransactionStatus()) && Arrays
	//		//								.asList(PaymentTransactionType.AUTHORIZATION, PaymentTransactionType.CAPTURE).contains(entry.getType()))
	//		//						{
	//		//							paidAmount.add(entry.getAmount());
	//		//							return true;
	//		//						}
	//		//						return false;
	//		//					}).findFirst();
	//		//				});
	//		//			}
	//		//			catch (final Exception e)
	//		//			{
	//		//				LOG.error(e.getMessage(), e);
	//		//			}
	//		//
	//		//			for (final PaymentTransactionModel trans : transactions)
	//		//			{
	//		//				if (!Collections.isEmpty(trans.getEntries()))
	//		//				{
	//		//					for (final PaymentTransactionEntryModel entry : trans.getEntries())
	//		//					{
	//		//						if (Arrays.asList(TransactionStatus.ACCEPTED.name()).contains(entry.getTransactionStatus()) && Arrays
	//		//								.asList(PaymentTransactionType.AUTHORIZATION, PaymentTransactionType.CAPTURE).contains(entry.getType()))
	//		//						{
	//		//							paidAmount.add(entry.getAmount());
	//		//							break;
	//		//						}
	//		//
	//		//					}
	//		//				}
	//		//			}
	//		//		}
	//		final CartModel cart = cartService.getSessionCart();
	//		final int result = Double.compare(amountPaid.doubleValue(), cart.getTotalPrice().doubleValue());
	//		if (result == 0)
	//		{
	//			return true;
	//		}
	//		return false;
	//	}

	/**
	 * @return the checkoutFacade
	 */
	public AcceleratorCheckoutFacade getCheckoutFacade()
	{
		return checkoutFacade;
	}

	/**
	 * @param checkoutFacade
	 *           the checkoutFacade to set
	 */
	public void setCheckoutFacade(final AcceleratorCheckoutFacade checkoutFacade)
	{
		this.checkoutFacade = checkoutFacade;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.facades.payment.CnkPaymentFacade#completeCodPayment(com.cnk.travelogix.common.core.
	 * payment.data.CodPaymentInfoData)
	 */
	@Override
	public String completeCodPayment(final CodPaymentInfoData cod)
	{
		final CustomerModel customerModel = getCurrentUserForCheckout();
		final CartModel cart = cartService.getSessionCart();
		getPaymentService().completeCodPayment(customerModel, cod, cart);
		OrderData order = null;
		try
		{
			order = getCheckoutFacade().placeOrder();
		}
		catch (final InvalidCartException e)
		{
			throw new RuntimeException(e);
		}
		return "redirect:/order/" + order.getCode();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.facades.payment.CnkPaymentFacade#generatePaymentPlan()
	 */
	@Override
	public void generatePaymentPlan()
	{
		getPaymentService().generatePaymentPlan(cartService.getSessionCart());
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
	public void setSessionService(final SessionService sessionService)
	{
		this.sessionService = sessionService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.facades.payment.CnkPaymentFacade#calculatePaymentFee(com.cnk.travelogix.common.core.
	 * payment.data.AjaxResult, java.lang.String, java.lang.String, java.lang.Double)
	 */
	@Override
	public void calculatePaymentFee(final PaymentModeSetting setting, final AjaxResult result, final String paymentMode,
			final String cardType, final Double amount)
	{
		final List<PaymentModeInfo> list = new ArrayList<>();
		if (StringUtils.equals(paymentMode, PaymentModes.CREDITCARD.getCode()))
		{
			list.addAll(Optional.ofNullable(setting.getSupportedCreditCardPaymentModes()).orElse(new ArrayList<>()));
		}
		else if (StringUtils.equals(paymentMode, PaymentModes.DEBITCARD.getCode()))
		{
			list.addAll(Optional.ofNullable(setting.getSupportedDebitCardPaymentModes()).orElse(new ArrayList<>()));
		}
		else if (StringUtils.equals(paymentMode, PaymentModes.EMI.getCode()))
		{
			list.addAll(Optional.ofNullable(setting.getSupportedEmiCardPaymentModes()).orElse(new ArrayList<>()));
		}
		else if (StringUtils.equals(paymentMode, PaymentModes.NETBANKING.getCode()))
		{
			list.addAll(Optional.ofNullable(setting.getSupportedNetBankingPaymentModes()).orElse(new ArrayList<>()));
		}
		else
		{
			throw new RuntimeException("unknow paymentmode:" + paymentMode);
		}

		final PaymentFeeData feeData = new PaymentFeeData();
		for (final PaymentModeInfo pm : list)
		{
			if (StringUtils.equals(pm.getCardType(), cardType))
			{
				final MsfFee pgafee = pm.getPgAcquirerFee();
				if (pgafee != null)
				{
					feeData.setPgAcquirerFeeType(pgafee.getFeeType());
					feeData.setPgAcquirerCost(getPaymentFeeCost(pgafee, amount));
				}
				final MsfFee pgefee = pm.getPgEnablerFee();
				if (pgefee != null)
				{
					feeData.setPgEnablerFeeType(pgefee.getFeeType());
					feeData.setPgEnablerCost(getPaymentFeeCost(pgefee, amount));
				}
				final MsfFee clientFee = pm.getClientFee();
				if (clientFee != null)
				{
					feeData.setPgClientCost(getPaymentFeeCost(clientFee, amount));
				}
				break;
			}
		}
		final double payNowAmount = MathUtil.sum(amount, feeData.getPgClientCost());
		result.put("clientFeeCost", feeData.getPgClientCost());
		result.put("payNowAmount", Double.valueOf(payNowAmount));
		final String cartCode = cartService.getSessionCart().getCode();
		// save fee data into session
		sessionService.setAttribute(cartCode + "_" + paymentMode + "_" + cardType + "_" + payNowAmount, feeData);
	}

	/**
	 * @param pgafee
	 * @param amount
	 * @return
	 */
	private Double getPaymentFeeCost(final MsfFee pgafee, final Double amount)
	{
		if (pgafee == null)
		{
			return null;
		}
		if (pgafee.getAmount() != null)
		{
			return pgafee.getAmount();
		}
		else if (pgafee.getPercentage() != null)
		{
			return Double.valueOf(MathUtil.scale(MathUtil.multiply(amount, pgafee.getPercentage()), 2));
		}
		return null;
	}

}
