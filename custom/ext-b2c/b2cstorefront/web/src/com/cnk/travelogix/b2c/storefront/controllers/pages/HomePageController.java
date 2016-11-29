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

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.commercefacades.order.CartFacade;
import de.hybris.platform.commercefacades.order.data.CartData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cnk.travelogix.b2c.facades.homepage.HomePageFacade;
import com.cnk.travelogix.common.core.model.TravellerTypeModel;


/**
 * Controller for home page
 */
@Controller
@Scope("tenant")
@RequestMapping("/")
public class HomePageController extends AbstractPageController
{
	@Resource(name = "cartFacade")
	private CartFacade cartFacade;

	@Resource(name = "homePageFacade")
	private HomePageFacade homePageFacade;

	@RequestMapping(method = RequestMethod.GET)
	public String home(@RequestParam(value = "logout", defaultValue = "false") final boolean logout, final Model model,
			final RedirectAttributes redirectModel, @RequestParam(value = "tabName", defaultValue = "flight") final String tabName,
			@RequestParam(value = "travellerType", required = false) final String[] travellerType) throws CMSItemNotFoundException
	{
		if (logout)
		{
			GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.INFO_MESSAGES_HOLDER, "account.confirmation.signout.title");
			return REDIRECT_PREFIX + ROOT;
		}
		model.addAttribute("tabName", tabName);
		storeCmsPageInModel(model, getContentPageForLabelOrId(null));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(null));
		updatePageTitle(model, getContentPageForLabelOrId(null));
		storeViewDataInModel(model, travellerType);
		final CartData cartData = cartFacade.getMiniCart();
		if (cartData != null && cartData.getEntries() != null)
		{
			model.addAttribute("cartEntryCount", cartData.getTotalUnitCount());
		}

		return getViewForPage(model);
	}

	protected void storeViewDataInModel(final Model model, final String[] travellerType)
	{
		List typeList = new ArrayList();
		if (null != travellerType)
		{
			typeList = Arrays.asList(travellerType);
		}
		this.addTravellerDeals(model);
		this.addPopulatorFilght(model);
		this.addPopulatorHotel(model, typeList);
		this.addPopulatorFilghtAndHotel(model);
		this.addTravellerType(model, typeList);
	}

	protected void updatePageTitle(final Model model, final AbstractPageModel cmsPage)
	{
		storeContentPageTitleInModel(model, getPageTitleResolver().resolveHomePageTitle(cmsPage.getTitle()));
	}

	protected void addTravellerDeals(final Model model)
	{
		model.addAttribute("travellerDeals", homePageFacade.getTravellerDealData());
	}

	protected void addPopulatorFilght(final Model model)
	{
		model.addAttribute("popularFlight", homePageFacade.getPopularFlightData());
	}

	protected void addPopulatorHotel(final Model model, final List travellerType)
	{
		model.addAttribute("popularHotel", homePageFacade.getPopularHotelCityData());
	}

	protected void addPopulatorFilghtAndHotel(final Model model)
	{
		model.addAttribute("popularFlightAndHotel", "");
	}

	protected void addTravellerType(final Model model, final List travellerType)
	{
		final List<TravellerTypeModel> travellerTypeList = homePageFacade.getTravellerType();
		final List<TravellerTypeModel> selectedTravellerTypeList = new ArrayList<TravellerTypeModel>();
		for (final TravellerTypeModel type : travellerTypeList)
		{
			if (travellerType.contains(type.getCode()))
			{
				selectedTravellerTypeList.add(type);
			}
		}
		model.addAttribute("travellerType", travellerTypeList);
		model.addAttribute("selectedType", selectedTravellerTypeList);
	}
}
