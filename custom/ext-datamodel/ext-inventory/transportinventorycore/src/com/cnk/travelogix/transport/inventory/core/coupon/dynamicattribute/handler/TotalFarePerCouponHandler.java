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
package com.cnk.travelogix.transport.inventory.core.coupon.dynamicattribute.handler;

import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;

import java.math.BigDecimal;
import java.util.Collection;

import org.apache.log4j.Logger;

import com.cnk.travelogix.transportinventory.core.model.AirCouponIndentRequestModel;
import com.cnk.travelogix.transportinventory.core.model.CouponPriceRowModel;


/**
 *
 */
public class TotalFarePerCouponHandler extends AbstractDynamicAttributeHandler<BigDecimal, AirCouponIndentRequestModel>
{
	private static final Logger LOG = Logger.getLogger(TotalFarePerCouponHandler.class.getName());

	@Override
	public BigDecimal get(final AirCouponIndentRequestModel model)
	{
		if (model != null)
		{
			double amount = 0.0;
			final Collection<CouponPriceRowModel> couponPriceRows = model.getPrices();

			if (model.getPrices() != null)
			{
				for (final CouponPriceRowModel couponPiceRow : couponPriceRows)
				{
					amount += couponPiceRow.getPrice().doubleValue();
				}
			}
			else
			{
				LOG.debug("Coupon Price Rows are not available for");
			}

			return BigDecimal.valueOf(amount);

		}
		return super.get(model);
	}
}
