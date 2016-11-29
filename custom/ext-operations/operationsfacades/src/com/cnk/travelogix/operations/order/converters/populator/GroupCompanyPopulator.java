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

import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.apache.log4j.Logger;

import com.cnk.travelogix.operations.data.GroupCompanyData;


/**
 * This class is for Converting GroupCompany details
 */
public class GroupCompanyPopulator implements Populator<OrderModel, OrderData>
{
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(GroupCompanyPopulator.class);

	@Override
	public void populate(final OrderModel source, final OrderData target) throws ConversionException
	{
		if (null != source)
		{
			if (null != source.getCompany() && null != source.getCompany().getGroupCompany())
			{
				final GroupCompanyData groupCompanyData = new GroupCompanyData();
				groupCompanyData.setUid(source.getCompany().getGroupCompany().getUid());
				groupCompanyData.setName(source.getCompany().getGroupCompany().getName());
				target.setGroupCompany(groupCompanyData);
			}
		}
	}
}
