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

import com.cnk.travelogix.transportinventory.core.model.AirCouponIndentRequestModel;


/**
 *
 */
public class TotalPriceHandler extends AbstractDynamicAttributeHandler<BigDecimal, AirCouponIndentRequestModel>
{
	@Override
	public BigDecimal get(final AirCouponIndentRequestModel model)
	{
		double totalFarePerCoupon = 0.0;
		double totalNumberOfCoupon = 0;
		if (model != null)
		{

			if (model.getTotalNumberOfCoupon() != null)
			{
				totalNumberOfCoupon = model.getTotalNumberOfCoupon().doubleValue();
			}

			if (model.getTotalFarePerCoupon() != null)
			{
				totalFarePerCoupon = model.getTotalFarePerCoupon().doubleValue();
			}

			return BigDecimal.valueOf(totalNumberOfCoupon * totalFarePerCoupon);
		}
		return super.get(model);
	}
}
