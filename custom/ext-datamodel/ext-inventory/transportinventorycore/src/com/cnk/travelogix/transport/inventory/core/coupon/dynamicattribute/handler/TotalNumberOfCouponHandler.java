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

import org.apache.log4j.Logger;

import com.cnk.travelogix.transport.inventory.core.enums.CouponType;
import com.cnk.travelogix.transportinventory.core.model.AirCouponIndentRequestModel;


/**
 *
 */
public class TotalNumberOfCouponHandler extends AbstractDynamicAttributeHandler<Integer, AirCouponIndentRequestModel>
{

	private static final Logger LOG = Logger.getLogger(TotalNumberOfCouponHandler.class.getName());

	@Override
	public Integer get(final AirCouponIndentRequestModel model)
	{
		int numberofBooklet = 0;
		int numberofCoupons = 0;

		if (model != null)
		{
			if (model.getNumberOfBooklets() != null)
			{
				numberofBooklet = model.getNumberOfBooklets().intValue();
			}
			else
			{
				LOG.debug("NumberOfBooklets data missing");
			}
			if (model.getNumberOfCoupons() != null)
			{
				numberofCoupons = model.getNumberOfCoupons().intValue();
			}
			else
			{
				LOG.debug("NumberOfCoupons data missing");
			}
			if (CouponType.PAPERCOUPON.equals(model.getTypeOfCoupon()))
			{
				return Integer.valueOf(numberofBooklet * numberofCoupons);
			}
			else if (CouponType.ECOUPON.equals(model.getTypeOfCoupon()))
			{
				return model.getNumberOfCoupons();
			}

		}
		return super.get(model);
	}

}
