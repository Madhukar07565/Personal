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

import com.cnk.travelogix.transport.inventory.core.enums.CouponType;
import com.cnk.travelogix.transportinventory.core.model.AirCouponIndentRequestModel;


/**
 *
 */
public class RateHandler extends AbstractDynamicAttributeHandler<BigDecimal, AirCouponIndentRequestModel>
{
	@Override
	public BigDecimal get(final AirCouponIndentRequestModel model)
	{
		if (model != null)
		{
			final int numberofCoupons = model.getNumberOfCoupons().intValue();
			double totalFarePerCoupon = 0.0;
			if (model.getTotalFarePerCoupon() != null)
			{
				totalFarePerCoupon = model.getTotalFarePerCoupon().doubleValue();
			}


			if (CouponType.PAPERCOUPON.equals(model.getTypeOfCoupon()))
			{
				return BigDecimal.valueOf(totalFarePerCoupon * numberofCoupons);
			}
			else if (CouponType.ECOUPON.equals(model.getTypeOfCoupon()))
			{
				return BigDecimal.valueOf(totalFarePerCoupon);
			}


		}
		return super.get(model);
	}

}
