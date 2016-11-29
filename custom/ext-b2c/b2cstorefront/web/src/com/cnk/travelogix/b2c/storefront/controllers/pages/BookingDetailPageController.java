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

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractSearchPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.servicelayer.user.UserService;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnk.travelogix.b2c.facades.order.B2cOrderFacade;


@Controller
@Scope("tenant")
public class BookingDetailPageController extends AbstractSearchPageController
{
	private static final String NO_RESULTS_CMS_PAGE_ID = "ezgHotelSearchResultPage";
	private static final String SEARCH_BOOK_DETAIL_PAGE_ID = "ezgb2cAmendCancelAllProductsPage";

	@Resource(name = "b2cOrderFacade")
	private B2cOrderFacade orderFacade;

	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET, value = "/bookingDetail/{bookingId:.*}")
	public String getBookingDetail(@PathVariable("bookingId") final String bookingId, final Model model) throws CMSItemNotFoundException
	{
		final OrderData orderData = orderFacade.getGroupedOrderDetailsForCode(bookingId);

		if (orderData == null || CollectionUtils.isEmpty(orderData.getEntries()))
		{
			storeCmsPageInModel(model, getContentPageForLabelOrId(NO_RESULTS_CMS_PAGE_ID));
		}
		else
		{
			model.addAttribute("orderData", orderData);

			model.addAttribute("currentUserName", userService.getCurrentUser().getName());

			storeCmsPageInModel(model, getContentPageForLabelOrId(SEARCH_BOOK_DETAIL_PAGE_ID));
		}

		return getViewForPage(model);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT, value = "/cancelBooking/{bookingId:.*}")
	public String cancelBooking(@PathVariable("bookingId") final String bookingId)
	{
		// Update status to request for cancellation.
		orderFacade.updateOrderStatus(bookingId, OrderStatus.REQUEST_FOR_CANCELLATION);
		
		// Call CANCEL API
		
		// If successfully, update status to cancelled; Otherwise, log.
		
		return "560–2590345";
		
	}
	
}
