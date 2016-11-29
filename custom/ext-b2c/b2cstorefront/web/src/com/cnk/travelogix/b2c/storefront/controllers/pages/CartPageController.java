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

import de.hybris.platform.acceleratorfacades.flow.impl.SessionOverrideCheckoutFlowFacade;
import de.hybris.platform.acceleratorservices.controllers.page.PageType;
import de.hybris.platform.acceleratorservices.enums.CheckoutFlowEnum;
import de.hybris.platform.acceleratorservices.enums.CheckoutPciOptionEnum;
import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.ResourceBreadcrumbBuilder;
import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractCartPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.acceleratorstorefrontcommons.forms.UpdateQuantityForm;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.commercefacades.order.data.AbstractOrderData;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commercefacades.order.data.CartModificationData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.commercefacades.user.data.TitleData;
import de.hybris.platform.commerceservices.order.CommerceCartModification;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;
import de.hybris.platform.enumeration.EnumerationService;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnk.travelogix.b2c.facades.order.B2cCartFacade;
import com.cnk.travelogix.b2c.storefront.controllers.ControllerConstants;
import com.cnk.travelogix.common.core.cart.data.OrderFlightDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderHotelDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderTicketInfoData;


/**
 * Controller for cart page
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/cart")
public class CartPageController extends AbstractCartPageController
{
	public static final String EZG_B2C_CART_CMS_PAGE_LABEL = "ezgb2ccartpage";
	public static final String SHOW_CHECKOUT_STRATEGY_OPTIONS = "storefront.show.checkout.flows";
	public static final String ERROR_MSG_TYPE = "errorMsg";
	public static final String SUCCESSFUL_MODIFICATION_CODE = "success";
	private static final String MINICART_PROD_COUNT = "minicartProdCount";
	private static final String REDIRECT_CART_URL = REDIRECT_PREFIX + "/cart";

	public static final String CART_REPRICING = "repricing";
	public static final String CART_REFRESH_TIME = "refreshTime";
	public static final String CART_EXPIRE_TIME = "expireTime";
	
	public static final String CART_ITEM_TYPE_ORDER = "typeOrder";

	private static final Logger LOG = Logger.getLogger(CartPageController.class);

	@Resource(name = "simpleBreadcrumbBuilder")
	private ResourceBreadcrumbBuilder resourceBreadcrumbBuilder;

	@Resource(name = "enumerationService")
	private EnumerationService enumerationService;

	@Resource(name = "productVariantFacade")
	private ProductFacade productFacade;

	@Resource(name = "b2cCartFacade")
	private B2cCartFacade b2cCartFacade;

	@Resource(name = "userFacade")
	private UserFacade userFacade;

	@ModelAttribute("showCheckoutStrategies")
	public boolean isCheckoutStrategyVisible()
	{
		return getSiteConfigService().getBoolean(SHOW_CHECKOUT_STRATEGY_OPTIONS, false);
	}

	/**
	 * if any product add/update/delete, always do repricing, then add/refresh count down info in session. else when got
	 * to cart page, do repricing, then add count down info to session {repricing: true, refreshTime:3:30, expireTime:
	 * 5:00} if this info not in session then do repricing; if repricing is false, then do repricing; if repricing is
	 * true, calculate expire time, on 3:34 then {repricing: true, refreshTime:3:30, expireTime: 1:00}, not do repricing
	 * on 3:35 or later, then do repricing, {repricing: true, refreshTime:3:35, expireTime: 5:00} if order placed, purge
	 * the count down info from session.
	 *
	 * @throws CommerceCartModificationException
	 */
	private void checkAvailablityAndRepricing(final Model model, final HttpSession session)
			throws CommerceCartModificationException
	{
		//get/add repricing data to session
		HashMap reData = (HashMap) session.getAttribute(CART_REPRICING);

		if (reData == null)
		{
			reData = new HashMap();
			validateAndUpdateSession(model, reData);
		}
		else
		{
			final Date refreshTime = (Date) reData.get(CART_REFRESH_TIME);
			final long expireTime = (long) reData.get(CART_EXPIRE_TIME);
			final Date now = new Date();
			if (now.after(new Date(refreshTime.getTime() + expireTime)))
			{
				validateAndUpdateSession(model, reData);
			}
			else
			{
				final long newtime = expireTime - (now.getTime() - refreshTime.getTime());
				reData.put(CART_REFRESH_TIME, new Date());//update refresh time even we havn't do refresh
				reData.put(CART_EXPIRE_TIME, newtime);
			}
		}
		session.setAttribute(CART_REPRICING, reData);
	}

	private void validateAndUpdateSession(final Model model, final Map m) throws CommerceCartModificationException
	{
		final List<CommerceCartModification> cartChange = b2cCartFacade.checkAvaiablility();
		final long expireTime = b2cCartFacade.getExpireTime();
		m.put(CART_REFRESH_TIME, new Date());//now
		m.put(CART_EXPIRE_TIME, expireTime);

		model.addAttribute("cartChange", cartChange);//1, prod expired, should remove. 2, price changed, show message.
	}

	private void setupExpireTime(final Model model, final HttpSession session)
	{
		final HashMap reData = (HashMap) session.getAttribute(CART_REPRICING);
		long time;
		if (reData == null)
		{
			time = b2cCartFacade.getExpireTime();
		}
		else
		{
			time = (long) reData.get(CART_EXPIRE_TIME);
		}
		model.addAttribute("minExpireTime", time);
		final int seconds = Long.valueOf(((time / 1000) % 60)).intValue();
		final int minutes = Long.valueOf((time / 1000 / 60) % 60).intValue();
		final int hours = Long.valueOf((time / (1000 * 60 * 60)) % 24).intValue();
		final String fHours = StringUtils.leftPad("" + hours, 2, '0');
		final String fMinutes = StringUtils.leftPad("" + minutes, 2, '0');
		final String fSeconds = StringUtils.leftPad("" + seconds, 2, '0');
		model.addAttribute("formatedMinExpireTime", fHours + ":" + fMinutes + ":" + fSeconds);
	}

	/*
	 * Display the cart page
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String showCart(final Model model, final HttpSession session) throws CMSItemNotFoundException,
			CommerceCartModificationException // NOSONAR
	{
		//TODO uncomment this if want to test trav-39
		checkAvailablityAndRepricing(model, session);

		final CartData cartData = b2cCartFacade.getSessionCartWithEntryOrdering(false);
		model.addAttribute("cartData", cartData);
		if (cartData != null && cartData.getEntries() != null && !cartData.getEntries().isEmpty())
		{
			Object attribute = session.getAttribute(CART_ITEM_TYPE_ORDER);
			if(attribute == null || ((String[])attribute).length == 0){
				String sb = "";
				for (OrderEntryData ond : cartData.getEntries())
				{
					if(! StringUtils.contains(sb, ond.getOrderEntryType().getCode())){
						if(sb.length() == 0 ){
							sb = ond.getOrderEntryType().getCode();
						}else{
							sb += ":"+ ond.getOrderEntryType().getCode();
						}
					}
				}
				session.setAttribute(CART_ITEM_TYPE_ORDER, StringUtils.split(sb, ':'));
			}
			
			AbstractOrderData grpCartData = b2cCartFacade.getGroupedCartData(cartData);
			final List<OrderEntryData> hotelData = b2cCartFacade.getHotelInfoByGroup(grpCartData);
			if (hotelData != null & !hotelData.isEmpty())
			{
				model.addAttribute("haveHotel", Boolean.TRUE);
				model.addAttribute("hotelData", hotelData);
			}

			final List<OrderEntryData> flightGroupInfoList = this.b2cCartFacade.getTicketInfoByGroup(grpCartData);
			if (flightGroupInfoList.size() > 0)
			{
				model.addAttribute("haveFlight", Boolean.TRUE);
				model.addAttribute("flightGroupInfoList", flightGroupInfoList);
				final ObjectMapper mapper = new ObjectMapper();
				String jsonString = StringUtils.EMPTY;
				try
				{
					abstract class MixIn
					{
						@JsonIgnore
						OrderFlightDetailInfoData orderFlightDetailInfoData;
					}
					mapper.getSerializationConfig().addMixInAnnotations(OrderTicketInfoData.class, MixIn.class);
					jsonString = mapper.writeValueAsString(flightGroupInfoList);
				}
				catch (final JsonGenerationException e)
				{
					// YTODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (final JsonMappingException e)
				{
					// YTODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (final IOException e)
				{
					// YTODO Auto-generated catch block
					e.printStackTrace();
				}
				model.addAttribute("flightInfoJson", jsonString);
			}

			setupExpireTime(model, session);
		}

		final List<TitleData> titleData = userFacade.getTitles();
		model.addAttribute("titleData", titleData);

		final ContentPageModel contentPage = getContentPageForLabelOrId(EZG_B2C_CART_CMS_PAGE_LABEL);
		storeCmsPageInModel(model, contentPage);
		setUpMetaDataForContentPage(model, contentPage);

		model.addAttribute(WebConstants.BREADCRUMBS_KEY, resourceBreadcrumbBuilder.getBreadcrumbs("breadcrumb.cart"));
		model.addAttribute("pageType", PageType.CART.name());
		model.addAttribute("section", ControllerConstants.Views.Pages.MultiStepCheckout.Ezeego.CART_TRAVELERS);

		return ControllerConstants.Views.Pages.Cart.EzgCartPage;
	}

	/**
	 * Handle the '/cart/checkout' request url. This method checks to see if the cart is valid before allowing the
	 * checkout to begin. Note that this method does not require the user to be authenticated and therefore allows us to
	 * validate that the cart is valid without first forcing the user to login. The cart will be checked again once the
	 * user has logged in.
	 *
	 * @return The page to redirect to
	 */
	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public String cartCheck(final Model model, final RedirectAttributes redirectModel) throws CommerceCartModificationException
	{
		SessionOverrideCheckoutFlowFacade.resetSessionOverrides();

		if (!getCartFacade().hasEntries())
		{
			LOG.info("Missing or empty cart");

			// No session cart or empty session cart. Bounce back to the cart page.
			return REDIRECT_CART_URL;
		}


		//		if (validateCart(redirectModel))
		//		{
		//			return REDIRECT_CART_URL;
		//		}

		// Redirect to the start of the checkout flow to begin the checkout process
		// We just redirect to the generic '/checkout' page which will actually select the checkout flow
		// to use. The customer is not necessarily logged in on this request, but will be forced to login
		// when they arrive on the '/checkout' page.
		return REDIRECT_PREFIX + "/checkout";
	}

	@RequestMapping(value = "/getProductVariantMatrix", method = RequestMethod.GET)
	public String getProductVariantMatrix(@RequestParam("productCode") final String productCode,
			@RequestParam(value = "readOnly", required = false, defaultValue = "false") final String readOnly, final Model model)
	{

		final ProductData productData = productFacade.getProductForCodeAndOptions(productCode, Arrays.asList(ProductOption.BASIC,
				ProductOption.CATEGORIES, ProductOption.VARIANT_MATRIX_BASE, ProductOption.VARIANT_MATRIX_PRICE,
				ProductOption.VARIANT_MATRIX_MEDIA, ProductOption.VARIANT_MATRIX_STOCK, ProductOption.VARIANT_MATRIX_URL));

		model.addAttribute("product", productData);
		model.addAttribute("readOnly", "true".equalsIgnoreCase(readOnly));

		return ControllerConstants.Views.Fragments.Cart.ExpandGridInCart;
	}

	// This controller method is used to allow the site to force the visitor through a specified checkout flow.
	// If you only have a static configured checkout flow then you can remove this method.
	@RequestMapping(value = "/checkout/select-flow", method = RequestMethod.GET)
	public String initCheck(final Model model, final RedirectAttributes redirectModel,
			@RequestParam(value = "flow", required = false) final String flow,
			@RequestParam(value = "pci", required = false) final String pci) throws CommerceCartModificationException
	{
		SessionOverrideCheckoutFlowFacade.resetSessionOverrides();

		if (!getCartFacade().hasEntries())
		{
			LOG.info("Missing or empty cart");

			// No session cart or empty session cart. Bounce back to the cart page.
			return REDIRECT_CART_URL;
		}

		// Override the Checkout Flow setting in the session
		if (StringUtils.isNotBlank(flow))
		{
			final CheckoutFlowEnum checkoutFlow = enumerationService.getEnumerationValue(CheckoutFlowEnum.class,
					StringUtils.upperCase(flow));
			SessionOverrideCheckoutFlowFacade.setSessionOverrideCheckoutFlow(checkoutFlow);
		}

		// Override the Checkout PCI setting in the session
		if (StringUtils.isNotBlank(pci))
		{
			final CheckoutPciOptionEnum checkoutPci = enumerationService.getEnumerationValue(CheckoutPciOptionEnum.class,
					StringUtils.upperCase(pci));
			SessionOverrideCheckoutFlowFacade.setSessionOverrideSubscriptionPciOption(checkoutPci);
		}

		// Redirect to the start of the checkout flow to begin the checkout process
		// We just redirect to the generic '/checkout' page which will actually select the checkout flow
		// to use. The customer is not necessarily logged in on this request, but will be forced to login
		// when they arrive on the '/checkout' page.
		return REDIRECT_PREFIX + "/checkout";
	}

	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	@ResponseBody
	public Map removeProd(@RequestParam("entryNumber") final long entryNumber, final String prodCode,
			final HttpServletRequest request) throws CMSItemNotFoundException
	{
		final Map map = new HashMap();
		try
		{
			//final CartModificationData cartModification =
			b2cCartFacade.updateCartEntry(entryNumber, 0l);
			b2cCartFacade.normalizeRoomIndex();
		}
		catch (final CommerceCartModificationException e)
		{
			LOG.warn("Error happened when removing item from cart. entrynumberis : " + entryNumber + ".", e);
			map.put("status", "remove-failed");
			return map;
		}
		//item count in cart
		final CartData cart = b2cCartFacade.getSessionCart();
		//model.addAttribute("cart", cart);
		request.getSession().setAttribute(MINICART_PROD_COUNT, cart.getTotalUnitCount());
		//total price
		// the removed entry id.

		map.put("entryNumber", entryNumber);
		map.put("totalCount", cart.getTotalUnitCount());
		map.put("totalPrice", cart.getTotalPrice());
		map.put("status", "remove-success");
		return map;
	}

	/**
	 * remove all order entry under one hotel
	 *
	 * @param entryNumber
	 * @param prodCode
	 * @param request
	 * @return
	 * @throws CMSItemNotFoundException
	 */
	@RequestMapping(value = "/remove/hotel", method = RequestMethod.POST)
	public String removeHotel(final String hotelId, final String groupId, final HttpServletRequest request)
			throws CMSItemNotFoundException
	{
		try
		{
			//TODO need normalize entry Index?
			//final CartModificationData cartModification =
			b2cCartFacade.removeHotel(groupId);
		}
		catch (final CommerceCartModificationException e)
		{
			//LOG.warn("Error happened when removing item from cart. entrynumber is : " + entryNumber + ".", e);
			return REDIRECT_PREFIX + "/cart";
		}
		//item count in cart
		final CartData cart = b2cCartFacade.getSessionCart();
		request.getSession().setAttribute(MINICART_PROD_COUNT, cart.getTotalUnitCount());

		return REDIRECT_PREFIX + "/cart";
	}

	@RequestMapping(value = "/remove/flight", method = RequestMethod.POST)
	public String deleteFlight(@RequestParam final String flightEntryform, final Model model) throws CMSItemNotFoundException,
			ParseException
	{
		final ObjectMapper mapper = new ObjectMapper();
		List<Integer> entryNumbers = null;
		try
		{
			final JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class, Integer.class);
			entryNumbers = mapper.readValue(flightEntryform, javaType);
		}
		catch (final IOException e)
		{
			e.printStackTrace();
		}
		int entryNumber = 0;
		try
		{
			if (CollectionUtils.isNotEmpty(entryNumbers))
			{
				for (final Integer number : entryNumbers)
				{
					entryNumber = number.intValue();
					b2cCartFacade.updateCartEntry(entryNumber, 0l);
				}

			}
		}
		catch (final CommerceCartModificationException e)
		{
			LOG.warn("Error happened when removing item from cart. entrynumberis : " + entryNumber + ".", e);
		}

		//TODO UPDATE MINI COUNT QUANTITIES
		return REDIRECT_PREFIX + "/cart";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateCartQuantities(@RequestParam("entryNumber") final long entryNumber, final Model model,
			@Valid final UpdateQuantityForm form, final BindingResult bindingResult, final HttpServletRequest request,
			final RedirectAttributes redirectModel) throws CMSItemNotFoundException
	{
		if (bindingResult.hasErrors())
		{
			for (final ObjectError error : bindingResult.getAllErrors())
			{
				if ("typeMismatch".equals(error.getCode()))
				{
					GlobalMessages.addErrorMessage(model, "basket.error.quantity.invalid");
				}
				else
				{
					GlobalMessages.addErrorMessage(model, error.getDefaultMessage());
				}
			}
		}
		else if (getCartFacade().hasEntries())
		{
			try
			{
				final CartModificationData cartModification = getCartFacade().updateCartEntry(entryNumber,
						form.getQuantity().longValue());
				addFlashMessage(form, request, redirectModel, cartModification);

				// Redirect to the cart page on update success so that the browser doesn't re-post again
				return REDIRECT_CART_URL;
			}
			catch (final CommerceCartModificationException ex)
			{
				LOG.warn("Couldn't update product with the entry number: " + entryNumber + ".", ex);
			}
		}

		prepareDataForPage(model);

		model.addAttribute(WebConstants.BREADCRUMBS_KEY, resourceBreadcrumbBuilder.getBreadcrumbs("breadcrumb.cart"));
		model.addAttribute("pageType", PageType.CART.name());

		return ControllerConstants.Views.Pages.Cart.CartPage;
	}

	protected void addFlashMessage(final UpdateQuantityForm form, final HttpServletRequest request,
			final RedirectAttributes redirectModel, final CartModificationData cartModification)
	{
		if (cartModification.getQuantity() == form.getQuantity().longValue())
		{
			// Success

			if (cartModification.getQuantity() == 0)
			{
				// Success in removing entry
				GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.CONF_MESSAGES_HOLDER, "basket.page.message.remove");
			}
			else
			{
				// Success in update quantity
				GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.CONF_MESSAGES_HOLDER, "basket.page.message.update");
			}
		}
		else if (cartModification.getQuantity() > 0)
		{
			// Less than successful
			GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.ERROR_MESSAGES_HOLDER,
					"basket.page.message.update.reducedNumberOfItemsAdded.lowStock", new Object[]
					{ cartModification.getEntry().getProduct().getName(), cartModification.getQuantity(), form.getQuantity(),
							request.getRequestURL().append(cartModification.getEntry().getProduct().getUrl()) });
		}
		else
		{
			// No more stock available
			GlobalMessages.addFlashMessage(
					redirectModel,
					GlobalMessages.ERROR_MESSAGES_HOLDER,
					"basket.page.message.update.reducedNumberOfItemsAdded.noStock",
					new Object[]
					{ cartModification.getEntry().getProduct().getName(),
							request.getRequestURL().append(cartModification.getEntry().getProduct().getUrl()) });
		}
	}

	@SuppressWarnings("boxing")
	@ResponseBody
	@RequestMapping(value = "/updateMultiD", method = RequestMethod.POST)
	public CartData updateCartQuantitiesMultiD(@RequestParam("entryNumber") final Integer entryNumber,
			@RequestParam("productCode") final String productCode, final Model model, @Valid final UpdateQuantityForm form,
			final BindingResult bindingResult)
	{
		if (bindingResult.hasErrors())
		{
			for (final ObjectError error : bindingResult.getAllErrors())
			{
				if ("typeMismatch".equals(error.getCode()))
				{
					GlobalMessages.addErrorMessage(model, "basket.error.quantity.invalid");
				}
				else
				{
					GlobalMessages.addErrorMessage(model, error.getDefaultMessage());
				}
			}
		}
		else
		{
			try
			{
				final CartModificationData cartModification = getCartFacade().updateCartEntry(
						getOrderEntryData(form.getQuantity(), productCode, entryNumber));
				if (cartModification.getStatusCode().equals(SUCCESSFUL_MODIFICATION_CODE))
				{
					GlobalMessages.addMessage(model, GlobalMessages.CONF_MESSAGES_HOLDER, cartModification.getStatusMessage(), null);
				}
				else if (!model.containsAttribute(ERROR_MSG_TYPE))
				{
					GlobalMessages.addMessage(model, GlobalMessages.ERROR_MESSAGES_HOLDER, cartModification.getStatusMessage(), null);
				}
			}
			catch (final CommerceCartModificationException ex)
			{
				LOG.warn("Couldn't update product with the entry number: " + entryNumber + ".", ex);
			}

		}
		return getCartFacade().getSessionCart();
	}

	@SuppressWarnings("boxing")
	protected OrderEntryData getOrderEntryData(final long quantity, final String productCode, final Integer entryNumber)
	{
		final OrderEntryData orderEntry = new OrderEntryData();
		orderEntry.setQuantity(quantity);
		orderEntry.setProduct(new ProductData());
		orderEntry.getProduct().setCode(productCode);
		orderEntry.setEntryNumber(entryNumber);
		return orderEntry;
	}

}
