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
package com.cnk.travelogix.common.facades.order.populators.hotel;

import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.cart.data.HotelOrderEntryInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderEntryInfoData;
import com.cnk.travelogix.common.core.enums.OrderEntryTypeEnum;


/**
 *
 */
public class GroupHotelOrderEntryPopulator implements Populator<List<OrderEntryData>, List<OrderEntryData>>
{
	private static final Logger LOG = Logger.getLogger(GroupHotelOrderEntryPopulator.class);

	@Override
	public void populate(final List<OrderEntryData> source, final List<OrderEntryData> target) throws ConversionException
	{
		if (CollectionUtils.isNotEmpty(source))
		{
			// Group by group ID.
			final Map<String, List<OrderEntryData>> groupedOrderEntryDataMap = source.stream()
					.collect(Collectors.groupingBy(new Function<OrderEntryData, String>()
					{

						@Override
						public String apply(final OrderEntryData orderEntryData)
						{
							return getGroupId(orderEntryData);
						}

					}));
			if (LOG.isDebugEnabled())
			{
				LOG.debug("Order entry data list after grouped by group ID:" + groupedOrderEntryDataMap);
			}

			groupedOrderEntryDataMap.forEach((groupId, orderEntryDataList) -> {
				final OrderEntryData groupedHotelOrderEntryData = orderEntryDataList.get(0);
				// Populate hotel info using its own room info.
				populateHotelDetailInfo(groupedHotelOrderEntryData, groupedHotelOrderEntryData);

				for (int index = 1; index < orderEntryDataList.size(); index++)
				{
					final OrderEntryData hotelOrderEntryData = orderEntryDataList.get(index);

					populateHotelDetailInfo(groupedHotelOrderEntryData, hotelOrderEntryData);
					groupedHotelOrderEntryData.getEntries().addAll(hotelOrderEntryData.getEntries());
				}

				target.add(groupedHotelOrderEntryData);
			});
		}
	}

	/**
	 * Get group ID from hotel order entry data.
	 */
	private String getGroupId(final OrderEntryData hotelOrderEntryData)
	{
		String groupId = null;

		final OrderEntryInfoData orderEntryInfoData = hotelOrderEntryData.getOrderEntryInfoData();

		if (OrderEntryTypeEnum.HOTEL == hotelOrderEntryData.getOrderEntryType()
				&& orderEntryInfoData instanceof HotelOrderEntryInfoData)
		{
			groupId = ((HotelOrderEntryInfoData) orderEntryInfoData).getGroupId();
		}
		else
		{
			LOG.error("Please assign a valid hotel order entry data.");
		}

		return groupId;

	}

	/**
	 * Populate hotel detail info.
	 */
	private void populateHotelDetailInfo(final OrderEntryData groupedHotelOrderEntryData, final OrderEntryData hotelOrderEntryData)
	{
		//		final HotelOrderEntryInfoData groupedHotelOrderEntryInfoData = (HotelOrderEntryInfoData) groupedHotelOrderEntryData
		//				.getOrderEntryInfoData();
		//
		//		final OrderHotelDetailInfoData hotelDetailInfoData = groupedHotelOrderEntryInfoData.getHotelDetailInfoData();
		//
		//		int numberOfRooms = getIntFromString(hotelDetailInfoData.getNumberOfRooms(), 0);
		//		numberOfRooms += hotelOrderEntryData.getEntries().size();
		//		hotelDetailInfoData.setNumberOfRooms("" + numberOfRooms);
		//
		//		int numberOfAdult = getIntFromString(hotelDetailInfoData.getNumberOfAdult(), 0);
		//		int numberOfChild = getIntFromString(hotelDetailInfoData.getNumberOfChild(), 0);
		//		for (final OrderEntryData roomOrderEntryData : hotelOrderEntryData.getEntries())
		//		{
		//			final RoomOrderEntryInfoData roomOrderEntryInfoData = (RoomOrderEntryInfoData) roomOrderEntryData
		//					.getOrderEntryInfoData();
		//			final OrderRoomDetailInfoData roomDetailInfoData = roomOrderEntryInfoData.getRoomDetailInfoData();
		//
		//			numberOfAdult += getIntFromString(roomDetailInfoData.getNumberOfAdult(), 0);
		//			numberOfChild += getIntFromString(roomDetailInfoData.getNumberOfChild(), 0);
		//
		//			if (StringUtils.isBlank(hotelDetailInfoData.getNumberOfNight()))
		//			{
		//				hotelDetailInfoData.setNumberOfNight(roomDetailInfoData.getNumberOfNight());
		//			}
		//		}
		//
		//		hotelDetailInfoData.setNumberOfAdult("" + numberOfAdult);
		//		hotelDetailInfoData.setNumberOfChild("" + numberOfChild);

	}

	/**
	 * Get int from string value.
	 */
	private int getIntFromString(final String numberInString, final int defaultValue)
	{
		int number = defaultValue;

		if (StringUtils.isNotBlank(numberInString))
		{
			try
			{
				number = Integer.parseInt(numberInString);
			}
			catch (final Exception e)
			{
				LOG.error(String.format("Error during parsing [%s] to int", numberInString));
			}
		}

		return number;
	}

}
