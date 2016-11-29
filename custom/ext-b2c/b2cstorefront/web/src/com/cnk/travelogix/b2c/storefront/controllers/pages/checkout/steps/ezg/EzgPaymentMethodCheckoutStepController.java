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


import de.hybris.platform.acceleratorservices.controllers.page.PageType;
import de.hybris.platform.acceleratorservices.enums.CheckoutPciOptionEnum;
import de.hybris.platform.acceleratorservices.payment.constants.PaymentConstants;
import de.hybris.platform.acceleratorservices.payment.data.PaymentData;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.PreValidateCheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;
import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.ResourceBreadcrumbBuilder;
import de.hybris.platform.acceleratorstorefrontcommons.checkout.steps.CheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.checkout.steps.AbstractCheckoutStepController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.acceleratorstorefrontcommons.forms.AddressForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.PaymentDetailsForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.PlaceOrderForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.SopPaymentDetailsForm;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.commercefacades.order.CartFacade;
import de.hybris.platform.commercefacades.order.data.AbstractOrderData;
import de.hybris.platform.commercefacades.order.data.CardTypeData;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.voucher.VoucherFacade;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.order.InvalidCartException;
import de.hybris.platform.payment.AdapterException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnk.travelogix.b2c.facades.order.B2cCartFacade;
import com.cnk.travelogix.b2c.storefront.controllers.ControllerConstants;
import com.cnk.travelogix.b2c.storefront.controllers.pages.CartPageController;
import com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.PriceInfoData;
import com.cnk.travelogix.common.core.enums.CnkRoomType;
import com.cnk.travelogix.common.core.enums.PaymentModes;
import com.cnk.travelogix.common.core.payment.data.AjaxResult;
import com.cnk.travelogix.common.core.payment.data.EzeeBalance;
import com.cnk.travelogix.common.core.payment.data.PaymentInfoForm;
import com.cnk.travelogix.common.core.payment.data.PaymentModeSetting;
import com.cnk.travelogix.common.core.payment.ezg.impl.AmexPaymentProvider;
import com.cnk.travelogix.common.facades.payment.CnkPaymentFacade;


@Controller
@RequestMapping(value = "/checkout/multi/payment")
public class EzgPaymentMethodCheckoutStepController extends AbstractCheckoutStepController
{
	protected static final Map<String, String> CYBERSOURCE_SOP_CARD_TYPES = new HashMap<>();
	private static final String PAYMENT_METHOD = "payment-method";
	private static final String CART_DATA_ATTR = "cartData";
	private static final String MINICART_PROD_COUNT = "minicartProdCount";
	private static final Logger LOGGER = Logger.getLogger(EzgPaymentMethodCheckoutStepController.class);
	protected static final String REDIRECT_URL_ADD_PAYMENT_METHOD = REDIRECT_PREFIX + "/checkout/multi/payment";

	@Resource(name = "b2cCartFacade")
	private B2cCartFacade b2cCartFacade;

	@Resource(name = "cartFacade")
	private CartFacade cartFacade;
	@Resource(name = "cnkPaymentFacade")
	private CnkPaymentFacade paymentFacade;
	@Resource(name = "voucherFacade")
	private VoucherFacade voucherFacade;

	@Resource(name = "simpleBreadcrumbBuilder")
	private ResourceBreadcrumbBuilder resourceBreadcrumbBuilder;

	@Override
	@RequestMapping(method = RequestMethod.GET)
	@RequireHardLogIn
	@PreValidateCheckoutStep(checkoutStep = PAYMENT_METHOD)
	public String enterStep(final Model model, final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
	{
		final PaymentModeSetting setting = paymentFacade.getPaymentModeSetting();
		/** generate payment plan for the current session cart **/
		paymentFacade.generatePaymentPlan();
		final CartData cartData = cartFacade.getSessionCartWithEntryOrdering(false);
		final AbstractOrderData orderData = b2cCartFacade.getGroupedCartData(cartData);
		model.addAttribute("paymentModeSetting", setting);
		if (setting.isEzeeBalancesEnabled())
		{
			final EzeeBalance ezeeBalance = new EzeeBalance();
			ezeeBalance.setRemainingAmount(BigDecimal.valueOf(30000));
			model.addAttribute("ezeeBalance", ezeeBalance);
		}
		//		model.addAttribute("voucherDataList", paymentFacade.getAvaliableVouchersForCart());
		model.addAttribute("cartData", orderData);
		final ContentPageModel contentPage = getContentPageForLabelOrId(CartPageController.EZG_B2C_CART_CMS_PAGE_LABEL);
		storeCmsPageInModel(model, contentPage);
		setUpMetaDataForContentPage(model, contentPage);
		model.addAttribute(WebConstants.BREADCRUMBS_KEY, resourceBreadcrumbBuilder.getBreadcrumbs("breadcrumb.cart"));
		model.addAttribute("pageType", PageType.CART.name());
		model.addAttribute("section", ControllerConstants.Views.Pages.MultiStepCheckout.Ezeego.CART_PAYMENT);
		//TODO
		return ControllerConstants.Views.Pages.Cart.EzgCartPage;
	}


	@RequestMapping(method = RequestMethod.GET, value = "/fee")
	@ResponseBody
	public AjaxResult getConvenienceFee(final Model model, @RequestParam("amount") final Double amount,
			@RequestParam("paymentMode") final String paymentMode, @RequestParam("cardType") final String cardType)
			throws CMSItemNotFoundException, CommerceCartModificationException
	{
		final AjaxResult result = new AjaxResult();
		result.setStatus(true);
		final PaymentModeSetting setting = paymentFacade.getPaymentModeSetting();

		paymentFacade.calculatePaymentFee(setting, result, paymentMode, cardType, amount);
		//		result.put("payNow", value)

		return result;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/cart")
	public String cart(final Model model, final RedirectAttributes redirectAttributes)
			throws CMSItemNotFoundException, CommerceCartModificationException
	{
		final OrderRoomDetailInfoData roomData = new OrderRoomDetailInfoData();
		roomData.setGroupId(String.valueOf(System.currentTimeMillis()));
		roomData.setHotelId("hotel_001");
		roomData.setRoomId("room_1");
		roomData.setRoomType(CnkRoomType.DOUBLE_ROOM);
		roomData.setRoomCheckinDate(new Date());
		roomData.setNumberOfAdult("1");
		roomData.setNumberOfChild("1");
		roomData.setNumberOfNight("1");
		final PriceInfoData price = new PriceInfoData();
		price.setCostPrice(4200);
		roomData.setRoomCheckoutDate(new Date(System.currentTimeMillis() + 3600 * 24 * 1000));
		final long quantity = 1;
		//TODO
		b2cCartFacade.addHotelToCart(roomData, quantity);
		return REDIRECT_URL_ADD_PAYMENT_METHOD;
	}

	@RequestMapping(value = "/redeem", method = RequestMethod.POST)
	@ResponseBody
	@RequireHardLogIn
	public AjaxResult redeemVoucher(final Model model, @RequestParam("voucherCode") final String voucherCode)
			throws CMSItemNotFoundException
	{
		final AjaxResult ajaxResult = new AjaxResult();
		try
		{
			voucherFacade.applyVoucher(voucherCode);
			//			final String totalPrice = cartFacade.getSessionCart().getTotalPrice().getFormattedValue();
			//			ajaxResult.setResult(totalPrice);
			ajaxResult.setStatus(true);
		}
		catch (final Exception e)
		{
			ajaxResult.setStatus(false);
			LOGGER.error("Redeem voucher error, ", e);
		}
		return ajaxResult;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@RequireHardLogIn
	public String addPaymentMethod(final Model model, final RedirectAttributes redirectAttributes,
			final HttpServletRequest request,
			/*
			 * @RequestParam(value = "modeOfPayment", required = false) final String modeOfPayment,
			 *
			 * @RequestParam(value = "cardType", required = false) final String cardType,
			 *
			 * @RequestParam("amountToPay") final String amountToPay,
			 *
			 * @RequestParam("codJson") final String codJson
			 */ @RequestBody final PaymentInfoForm form) throws CMSItemNotFoundException
	{
		final String modeOfPayment = form.getModeOfPayment();
		final String amountToPay = form.getAmountToPay();
		String cardType = null;
		if (PaymentModes.EZEEBAL.getCode().equals(modeOfPayment))
		{
			paymentFacade.completeEzeeCapture(amountToPay);
		}
		else if (PaymentModes.COD.getCode().equals(modeOfPayment))
		{
			return paymentFacade.completeCodPayment(form.getCod());
		}
		else if (PaymentModes.CREDITCARD.getCode().equals(modeOfPayment))
		{
			cardType = form.getCreditcard().getCardType();
		}
		else if (PaymentModes.EMI.getCode().equals(modeOfPayment))
		{
			cardType = form.getEmi().getCardType();
		}

		getCheckoutFacade().setDeliveryModeIfAvailable();
		setupAddPaymentPage(model);
		// Use the checkout PCI strategy for getting the URL for creating new subscriptions.
		//	final CheckoutPciOptionEnum subscriptionPciOption = getCheckoutFlowFacade().getSubscriptionPciOption();
		final CheckoutPciOptionEnum subscriptionPciOption = CheckoutPciOptionEnum.valueOf("hop");
		setCheckoutStepLinksForModel(model, getCheckoutStep());
		if (CheckoutPciOptionEnum.HOP.equals(subscriptionPciOption))
		{
			// Redirect the customer to the HOP page or show error message if it fails (e.g. no HOP configurations).
			try
			{
				//				final PaymentData hostedOrderPageData = getPaymentFacade()
				//						.beginHopCreateSubscription("/checkout/multi/payment/hop/amex/response", "/integration/merchant_callback");
				// 	"https://localhost:9002/b2cstorefront/ezginb2c/en/checkout/multi/payment/hop/response";
				final CartData cart = getCheckoutFacade().getCheckoutCart();

				final PaymentData hostedOrderPageData = getPaymentFacade().prepareHopOrderPageData(cart.getCode(), cardType,
						amountToPay, "/checkout/multi/payment/hop/%s/response");
				//				final String receiptResponseURL = hostedOrderPageData.getParameters().get("orderPage_receiptResponseURL");
				//				if ("amex".equals(cardType))
				//				{
				//					final AmexPaymentProvider amex = new AmexPaymentProvider();
				//					hostedOrderPageData.setPostUrl(amex.getPaymentServerSetting().getPaymentServerUrl());
				//					final CartData cartData = getCheckoutFacade().getCheckoutCart();
				//					hostedOrderPageData.setParameters(amex.getPaymentFields(cartData.getCode(), amountToPay, receiptResponseURL));
				//				}
				model.addAttribute("hostedOrderPageData", hostedOrderPageData);
				final boolean hopDebugMode = getSiteConfigService().getBoolean(PaymentConstants.PaymentProperties.HOP_DEBUG_MODE,
						false);
				model.addAttribute("hopDebugMode", Boolean.valueOf(hopDebugMode));
				return ControllerConstants.Views.Pages.MultiStepCheckout.Ezeego.HostedOrderPostPage;
			}
			catch (final Exception e)
			{
				LOGGER.error("Failed to build beginCreateSubscription request", e);
				GlobalMessages.addErrorMessage(model, "checkout.multi.paymentMethod.addPaymentDetails.generalError");
			}
		}
		else if (CheckoutPciOptionEnum.SOP.equals(subscriptionPciOption))
		{
			// Build up the SOP form data and render page containing form
			final SopPaymentDetailsForm sopPaymentDetailsForm = new SopPaymentDetailsForm();
			try
			{
				setupSilentOrderPostPage(sopPaymentDetailsForm, model);
				return ControllerConstants.Views.Pages.MultiStepCheckout.Ezeego.SilentOrderPostPage;
			}
			catch (final Exception e)
			{
				LOGGER.error("Failed to build beginCreateSubscription request", e);
				GlobalMessages.addErrorMessage(model, "checkout.multi.paymentMethod.addPaymentDetails.generalError");
				model.addAttribute("sopPaymentDetailsForm", sopPaymentDetailsForm);
			}
		}

		// If not using HOP or SOP we need to build up the payment details form
		final PaymentDetailsForm paymentDetailsForm = new PaymentDetailsForm();
		final AddressForm addressForm = new AddressForm();
		paymentDetailsForm.setBillingAddress(addressForm);
		model.addAttribute(paymentDetailsForm);

		final CartData cartData = getCheckoutFacade().getCheckoutCart();
		model.addAttribute(CART_DATA_ATTR, cartData);

		return ControllerConstants.Views.Pages.MultiStepCheckout.AddPaymentMethodPage;
	}

	@RequestMapping(value = "/cod", method = RequestMethod.POST)
	@RequireHardLogIn
	public String addCodPaymentMethod(final Model model, final RedirectAttributes redirectAttributes,
			final HttpServletRequest request, final PaymentInfoForm form) throws CMSItemNotFoundException
	{
		final String modeOfPayment = form.getModeOfPayment();
		if (PaymentModes.COD.getCode().equals(modeOfPayment))
		{
			return paymentFacade.completeCodPayment(form.getCod());
		}
		return null;
	}

	@RequestMapping(value = "/ezee", method = RequestMethod.POST)
	@ResponseBody
	@RequireHardLogIn
	public AjaxResult addEzeePayment(final Model model, final RedirectAttributes redirectAttributes,
			final HttpServletRequest request, @RequestParam(value = "modeOfPayment", required = false) final String modeOfPayment,
			@RequestParam(value = "cardType", required = false) final String cardType,
			@RequestParam("amountToPay") final String amountToPay) throws CMSItemNotFoundException
	{
		String amountToPayNow = null;
		if (PaymentModes.EZEEBAL.getCode().equals(modeOfPayment))
		{
			amountToPayNow = paymentFacade.completeEzeeCapture(amountToPay);
		}
		final AjaxResult result = AjaxResult.newInstance().status(true).put("amountToPayNow", amountToPayNow);
		return result;
	}

	protected void setupSilentOrderPostPage(final SopPaymentDetailsForm sopPaymentDetailsForm, final Model model)
	{
		final CartData cartData = getCheckoutFacade().getCheckoutCart();
		try
		{
			final String receiptResponseURL = "https://localhost:9002/b2cstorefront/ezginb2c/en/checkout/multi/payment/sop/response";
			final PaymentData silentOrderPageData = getPaymentFacade().beginSopCreateSubscription(
					"https://localhost:9002/b2cstorefront/ezginb2c/en/checkout/multi/sop/response", "/integration/merchant_callback");
			silentOrderPageData.setPostUrl("https://vpos.amxvpos.com/vpcpay");
			silentOrderPageData.getParameters().put("orderPage_receiptResponseURL", receiptResponseURL);

			final AmexPaymentProvider amex = new AmexPaymentProvider();
			silentOrderPageData.setParameters(amex.getPaymentFields(cartData.getCode(), "2000", receiptResponseURL));

			model.addAttribute("silentOrderPageData", silentOrderPageData);
			sopPaymentDetailsForm.setParameters(silentOrderPageData.getParameters());
			model.addAttribute("paymentFormUrl", silentOrderPageData.getPostUrl());
		}
		catch (final IllegalArgumentException e)
		{
			model.addAttribute("paymentFormUrl", "");
			model.addAttribute("silentOrderPageData", null);
			LOGGER.warn("Failed to set up silent order post page", e);
			GlobalMessages.addErrorMessage(model, "checkout.multi.sop.globalError");
		}

		model.addAttribute("silentOrderPostForm", new PaymentDetailsForm());
		model.addAttribute(CART_DATA_ATTR, cartData);
		model.addAttribute("deliveryAddress", cartData.getDeliveryAddress());
		model.addAttribute("sopPaymentDetailsForm", sopPaymentDetailsForm);
		model.addAttribute("paymentInfos", getUserFacade().getCCPaymentInfos(true));
		model.addAttribute("sopCardTypes", getSopCardTypes());
		if (StringUtils.isNotBlank(sopPaymentDetailsForm.getBillTo_country()))
		{
			model.addAttribute("regions", getI18NFacade().getRegionsForCountryIso(sopPaymentDetailsForm.getBillTo_country()));
			model.addAttribute("country", sopPaymentDetailsForm.getBillTo_country());
		}
	}


	protected Collection<CardTypeData> getSopCardTypes()
	{
		final Collection<CardTypeData> sopCardTypes = new ArrayList<CardTypeData>();

		final List<CardTypeData> supportedCardTypes = getCheckoutFacade().getSupportedCardTypes();
		for (final CardTypeData supportedCardType : supportedCardTypes)
		{
			// Add credit cards for all supported cards that have mappings for cybersource SOP
			if (CYBERSOURCE_SOP_CARD_TYPES.containsKey(supportedCardType.getCode()))
			{
				sopCardTypes.add(
						createCardTypeData(CYBERSOURCE_SOP_CARD_TYPES.get(supportedCardType.getCode()), supportedCardType.getName()));
			}
		}
		return sopCardTypes;
	}

	protected void setupAddPaymentPage(final Model model) throws CMSItemNotFoundException
	{
		model.addAttribute("metaRobots", "noindex,nofollow");
		model.addAttribute("hasNoPaymentInfo", Boolean.valueOf(getCheckoutFlowFacade().hasNoPaymentInfo()));
		prepareDataForPage(model);
		model.addAttribute(WebConstants.BREADCRUMBS_KEY,
				getResourceBreadcrumbBuilder().getBreadcrumbs("checkout.multi.paymentMethod.breadcrumb"));
		//		final ContentPageModel contentPage = getContentPageForLabelOrId(MULTI_CHECKOUT_SUMMARY_CMS_PAGE_LABEL);
		//		storeCmsPageInModel(model, contentPage);
		//		setUpMetaDataForContentPage(model, contentPage);
		setCheckoutStepLinksForModel(model, getCheckoutStep());
	}

	@RequestMapping(method = RequestMethod.POST)
	@RequireHardLogIn
	public String add(final Model model, @Valid final PaymentDetailsForm paymentDetailsForm, final BindingResult bindingResult)
			throws CMSItemNotFoundException
	{

		return getCheckoutStep().nextStep();
	}


	@RequestMapping(value = "/placeOrder")
	@RequireHardLogIn
	public String placeOrder(@ModelAttribute("placeOrderForm") final PlaceOrderForm placeOrderForm, final Model model,
			final HttpServletRequest request, final RedirectAttributes redirectModel) throws CMSItemNotFoundException, // NOSONAR
			InvalidCartException, CommerceCartModificationException
	{
		//		if (validateOrderForm(placeOrderForm, model))
		//		{
		//			return enterStep(model, redirectModel);
		//		}

		//Validate the cart
		//		if (validateCart(redirectModel))
		//		{
		//			// Invalid cart. Bounce back to the cart page.
		//			return REDIRECT_PREFIX + "/cart";
		//		}

		final String securityCode = placeOrderForm != null ? placeOrderForm.getSecurityCode() : "";

		// authorize, if failure occurs don't allow to place the order
		boolean isPaymentUthorized = redirectModel.getFlashAttributes().get("isAuthorized") == Boolean.TRUE;
		if (!isPaymentUthorized)
		{
			try
			{
				isPaymentUthorized = getCheckoutFacade().authorizePayment(securityCode);
			}
			catch (final AdapterException ae)
			{
				// handle a case where a wrong paymentProvider configurations on the store see getCommerceCheckoutService().getPaymentProvider()
				LOGGER.error(ae.getMessage(), ae);
			}
		}
		if (!isPaymentUthorized)
		{
			GlobalMessages.addErrorMessage(model, "checkout.error.authorization.failed");
			//			return enterStep(model, redirectModel);
			return "redirect:/checkout/multi/payment";
		}

		final OrderData orderData;
		try
		{
			orderData = getCheckoutFacade().placeOrder();
		}
		catch (final Exception e)
		{
			LOGGER.error("Failed to place Order", e);
			GlobalMessages.addErrorMessage(model, "checkout.placeOrder.failed");
			return REDIRECT_URL_ADD_PAYMENT_METHOD;
			//			return enterStep(model, redirectModel);
		}

		//return redirectToOrderConfirmationPage(orderData);
		request.getSession().setAttribute(MINICART_PROD_COUNT, 0);
		return "redirect:/order/" + orderData.getCode();
	}

	/**
	 * Validates the order form before to filter out invalid order states
	 *
	 * @param placeOrderForm
	 *           The spring form of the order being submitted
	 * @param model
	 *           A spring Model
	 * @return True if the order form is invalid and false if everything is valid.
	 */
	protected boolean validateOrderForm(final PlaceOrderForm placeOrderForm, final Model model)
	{
		final String securityCode = placeOrderForm.getSecurityCode();
		boolean invalid = false;

		//		if (getCheckoutFlowFacade().hasNoDeliveryAddress())
		//		{
		//			GlobalMessages.addErrorMessage(model, "checkout.deliveryAddress.notSelected");
		//			invalid = true;
		//		}
		//
		//		if (getCheckoutFlowFacade().hasNoDeliveryMode())
		//		{
		//			GlobalMessages.addErrorMessage(model, "checkout.deliveryMethod.notSelected");
		//			invalid = true;
		//		}

		if (getCheckoutFlowFacade().hasNoPaymentInfo())
		{
			GlobalMessages.addErrorMessage(model, "checkout.paymentMethod.notSelected");
			invalid = true;
		}
		else
		{
			// Only require the Security Code to be entered on the summary page if the SubscriptionPciOption is set to Default.
			if (CheckoutPciOptionEnum.DEFAULT.equals(getCheckoutFlowFacade().getSubscriptionPciOption())
					&& StringUtils.isBlank(securityCode))
			{
				GlobalMessages.addErrorMessage(model, "checkout.paymentMethod.noSecurityCode");
				invalid = true;
			}
		}

		if (!placeOrderForm.isTermsCheck())
		{
			GlobalMessages.addErrorMessage(model, "checkout.error.terms.not.accepted");
			invalid = true;
			return invalid;
		}
		final CartData cartData = getCheckoutFacade().getCheckoutCart();

		if (!getCheckoutFacade().containsTaxValues())
		{
			LOGGER.error(String.format(
					"Cart %s does not have any tax values, which means the tax cacluation was not properly done, placement of order can't continue",
					cartData.getCode()));
			GlobalMessages.addErrorMessage(model, "checkout.error.tax.missing");
			invalid = true;
		}

		if (!cartData.isCalculated())
		{
			LOGGER.error(
					String.format("Cart %s has a calculated flag of FALSE, placement of order can't continue", cartData.getCode()));
			GlobalMessages.addErrorMessage(model, "checkout.error.cart.notcalculated");
			invalid = true;
		}

		return invalid;
	}

	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	@RequireHardLogIn
	public String remove(@RequestParam(value = "paymentInfoId") final String paymentMethodId,
			final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
	{
		getUserFacade().unlinkCCPaymentInfo(paymentMethodId);
		GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.CONF_MESSAGES_HOLDER,
				"text.account.profile.paymentCart.removed");
		return getCheckoutStep().currentStep();
	}

	/**
	 * This method gets called when the "Use These Payment Details" button is clicked. It sets the selected payment
	 * method on the checkout facade and reloads the page highlighting the selected payment method.
	 *
	 * @param selectedPaymentMethodId
	 *           - the id of the payment method to use.
	 * @return - a URL to the page to load.
	 */
	@RequestMapping(value = "/choose", method = RequestMethod.GET)
	@RequireHardLogIn
	public String doSelectPaymentMethod(@RequestParam("selectedPaymentMethodId") final String selectedPaymentMethodId)
	{
		if (StringUtils.isNotBlank(selectedPaymentMethodId))
		{
			getCheckoutFacade().setPaymentDetails(selectedPaymentMethodId);
		}
		return getCheckoutStep().nextStep();
	}

	@RequestMapping(value = "/back", method = RequestMethod.GET)
	@RequireHardLogIn
	@Override
	public String back(final RedirectAttributes redirectAttributes)
	{
		return getCheckoutStep().previousStep();
	}

	@RequestMapping(value = "/next", method = RequestMethod.GET)
	@RequireHardLogIn
	@Override
	public String next(final RedirectAttributes redirectAttributes)
	{
		return getCheckoutStep().nextStep();
	}

	protected CardTypeData createCardTypeData(final String code, final String name)
	{
		final CardTypeData cardTypeData = new CardTypeData();
		cardTypeData.setCode(code);
		cardTypeData.setName(name);
		return cardTypeData;
	}



	protected CheckoutStep getCheckoutStep()
	{
		return getCheckoutStep(PAYMENT_METHOD);
	}

	static
	{
		// Map hybris card type to Cybersource SOP credit card
		CYBERSOURCE_SOP_CARD_TYPES.put("visa", "001");
		CYBERSOURCE_SOP_CARD_TYPES.put("master", "002");
		CYBERSOURCE_SOP_CARD_TYPES.put("amex", "003");
		CYBERSOURCE_SOP_CARD_TYPES.put("diners", "005");
		CYBERSOURCE_SOP_CARD_TYPES.put("maestro", "024");
	}

	/**
	 * @return the paymentFacade
	 */
	@Override
	public CnkPaymentFacade getPaymentFacade()
	{
		return paymentFacade;
	}

	/**
	 * @param paymentFacade
	 *           the paymentFacade to set
	 */
	public void setPaymentFacade(final CnkPaymentFacade paymentFacade)
	{
		this.paymentFacade = paymentFacade;
	}

	/**
	 * @return the cartFacade
	 */
	@Override
	public CartFacade getCartFacade()
	{
		return cartFacade;
	}

	/**
	 * @param cartFacade
	 *           the cartFacade to set
	 */
	public void setCartFacade(final CartFacade cartFacade)
	{
		this.cartFacade = cartFacade;
	}

	/**
	 * @return the voucherFacade
	 */
	public VoucherFacade getVoucherFacade()
	{
		return voucherFacade;
	}

	/**
	 * @param voucherFacade
	 *           the voucherFacade to set
	 */
	public void setVoucherFacade(final VoucherFacade voucherFacade)
	{
		this.voucherFacade = voucherFacade;
	}

}
