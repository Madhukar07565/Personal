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
package com.cnk.travelogix.common.facades.order.populators;

import de.hybris.platform.commercefacades.order.data.AbstractOrderData;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.enums.OrderEntryTypeEnum;


/**
 *
 */
public class GroupOrderEntryConverter<SOURCE extends AbstractOrderData, TARGET extends AbstractOrderData> extends
		AbstractPopulatingConverter<SOURCE, TARGET>
{
	private static final Logger LOG = Logger.getLogger(GroupOrderEntryConverter.class);

	private Map<OrderEntryTypeEnum, Populator> groupOrderEntryPopulators;

	@Override
	public void populate(final SOURCE source, final TARGET target)
	{
		if (CollectionUtils.isNotEmpty(source.getEntries()))
		{
			try
			{
				// Copy properties from source to target.
				PropertyUtils.copyProperties(target, source);
			}
			catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e)
			{
				throw new RuntimeException("Error during copying properties from source order data to target order data");
			}

			// Group order entries.
			final List<OrderEntryData> groupedOrderEntries = new ArrayList<OrderEntryData>();
			source.getEntries()
					.stream()
					.collect(Collectors.groupingBy(OrderEntryData::getOrderEntryType))
					.forEach(
							(orderEntryType, orderEntries) -> {
								if (LOG.isDebugEnabled())
								{
									LOG.debug(String.format(
											"Current order entry type is [%s], it has [%s] order entries before grouping.",
											orderEntryType.getCode(), "" + orderEntries.size()));
								}

								// Get group populator from the predefined populator map.
								final Populator populator = groupOrderEntryPopulators.get(orderEntryType);
								if (populator != null)
								{
									populator.populate(orderEntries, groupedOrderEntries);
								}
								else
								{
									LOG.error(String.format("Please assign a group populator to the current product type [%s].",
											orderEntryType.toString()));
								}
							});

			target.setEntries(groupedOrderEntries);
		}
	}

	/**
	 * @return the groupOrderEntryPopulators
	 */
	public Map<OrderEntryTypeEnum, Populator> getGroupOrderEntryPopulators()
	{
		return groupOrderEntryPopulators;
	}

	/**
	 * @param groupOrderEntryPopulators
	 *           the groupOrderEntryPopulators to set
	 */
	public void setGroupOrderEntryPopulators(final Map<OrderEntryTypeEnum, Populator> groupOrderEntryPopulators)
	{
		this.groupOrderEntryPopulators = groupOrderEntryPopulators;
	}
}
