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
package com.cnk.travelogix.operations.order.converters.populator;

import de.hybris.platform.commercefacades.order.converters.populator.OrderPopulator;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.core.model.order.OrderModel;

import org.springframework.util.Assert;


/**
 * This populator is used for populate new added field of Order
 *
 * @author C5244543 (Shivraj)
 */
public class TravelogixOrderPopulator extends OrderPopulator
{
	private GroupCompanyPopulator groupCompanyPopulator;

	@Override
	public void populate(final OrderModel source, final OrderData target)
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");

		super.populate(source, target);
		//	target.setIsTimeLimitBooking(source.getIsTimeLimitBooking());

		groupCompanyPopulator.populate(source, target);

		if (null != source)
		{
			if (null != source.getSalesApplication())
			{
				target.setPointOfSale(source.getSalesApplication().getCode());
			}
			if (null != source.getPaymentStatus())
			{
				target.setPaymentStatus(source.getPaymentStatus().getCode());
			}
		}

	}

	/**
	 * @return the groupCompanyPopulator
	 */
	public GroupCompanyPopulator getGroupCompanyPopulator()
	{
		return groupCompanyPopulator;
	}

	/**
	 * @param groupCompanyPopulator
	 *           the groupCompanyPopulator to set
	 */
	public void setGroupCompanyPopulator(final GroupCompanyPopulator groupCompanyPopulator)
	{
		this.groupCompanyPopulator = groupCompanyPopulator;
	}

}
