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
import de.hybris.platform.acceleratorstorefrontcommons.annotations.PreValidateCheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;
import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.ResourceBreadcrumbBuilder;
import de.hybris.platform.acceleratorstorefrontcommons.checkout.steps.CheckoutStep;
import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.checkout.steps.AbstractCheckoutStepController;
import de.hybris.platform.acceleratorstorefrontcommons.forms.AddressForm;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.commercefacades.order.CartFacade;
import de.hybris.platform.commercefacades.order.data.CartData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.commercefacades.user.data.TitleData;
import de.hybris.platform.commerceservices.order.CommerceCartModificationException;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnk.travelogix.b2c.facades.order.B2cCartFacade;
import com.cnk.travelogix.b2c.storefront.controllers.ControllerConstants;
import com.cnk.travelogix.b2c.storefront.controllers.pages.CartPageController;
import com.cnk.travelogix.common.core.cart.data.OrderHotelDetailInfoData;


@Controller
@RequestMapping(value = "/checkout/multi/review")
public class ReviewCheckoutStepController extends AbstractCheckoutStepController
{
	private static final Logger LOGGER = Logger.getLogger(ReviewCheckoutStepController.class);

	@Resource(name = "cartFacade")
	private CartFacade cartFacade;

	@Resource(name = "b2cCartFacade")
	private B2cCartFacade b2cCartFacade;


	@Resource(name = "simpleBreadcrumbBuilder")
	private ResourceBreadcrumbBuilder resourceBreadcrumbBuilder;

	@Resource(name = "userFacade")
	private UserFacade userFacade;
	
	private static final String REVIEW = "review";

	@RequestMapping(method = RequestMethod.GET)
	@RequireHardLogIn
	@Override
	@PreValidateCheckoutStep(checkoutStep = REVIEW)
	public String enterStep(final Model model, final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException, // NOSONAR
			CommerceCartModificationException
	{
		final CartData cartData = cartFacade.getSessionCartWithEntryOrdering(true);

		model.addAttribute("cartData", cartData);

//		List<OrderEntryData> hotelData = b2cCartFacade.getHotelInfoByGroup();
//		if (hotelData != null & !hotelData.isEmpty())
//		{
//			model.addAttribute("haveHotel", Boolean.TRUE);
//			model.addAttribute("hotelData", hotelData);
//		}

		List<TitleData> titleData = userFacade.getTitles();
		model.addAttribute("titleData", titleData);

		final ContentPageModel contentPage = getContentPageForLabelOrId(CartPageController.EZG_B2C_CART_CMS_PAGE_LABEL);
		storeCmsPageInModel(model, contentPage);
		setUpMetaDataForContentPage(model, contentPage);
		model.addAttribute(WebConstants.BREADCRUMBS_KEY, resourceBreadcrumbBuilder.getBreadcrumbs("breadcrumb.cart"));
		model.addAttribute("pageType", PageType.CART.name());
		model.addAttribute("section", ControllerConstants.Views.Pages.MultiStepCheckout.Ezeego.CART_REVIEW);
		return ControllerConstants.Views.Pages.Cart.EzgCartPage;

	}

	@RequestMapping(method = RequestMethod.POST)
	@RequireHardLogIn
	public String review(final AddressForm addressForm, final BindingResult bindingResult, final Model model,
			final RedirectAttributes redirectModel) throws CMSItemNotFoundException
	{
		// TODO use ajax
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

	protected CheckoutStep getCheckoutStep()
	{
		return getCheckoutStep(REVIEW);
	}


}
