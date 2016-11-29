/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.operations.facades.impl;

import de.hybris.platform.commercefacades.order.OrderFacade;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.product.data.ProductData;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.cart.data.OrderProductInfoData;
import com.cnk.travelogix.operations.facades.FirstBookingCheckFacade;
import com.cnk.travelogix.operations.services.FirstBookingCheckService;



/**
 * Implementation class of FirstBookingCheckFacade
 *
 */


public class DefaultFirstBookingCheckFacade implements FirstBookingCheckFacade
{

	@Resource(name = "firstBookingCheckService")
	FirstBookingCheckService firstBookingCheckService;

	@Resource(name = "orderFacade")
	private OrderFacade orderFacade;

	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(DefaultFirstBookingCheckFacade.class);

	@Override
	public boolean isNewSupplier(final OrderEntryData orderEntry)
	{

		final OrderProductInfoData orderProductInfo = orderEntry.getOrderProductInfo();

		//orderProduct.getSupplier(); // need to change after China's team implementation

		return false;
	}

	@Override
	public boolean isFirstBookingCheckEnabledProd(final ProductData productData)
	{
		return true;
		//return firstBookingCheckService.isFirstBookingCheckEnabledProd(productData);
	}

}
