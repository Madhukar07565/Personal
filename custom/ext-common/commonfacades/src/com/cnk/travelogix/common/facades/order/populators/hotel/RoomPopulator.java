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

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.PriceInfoData;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.PriceInfoModel;


/**
 *
 */
public class RoomPopulator implements Populator<OrderRoomDetailInfoModel, OrderRoomDetailInfoData>
{
	@Override
	public void populate(final OrderRoomDetailInfoModel room, final OrderRoomDetailInfoData roomData) throws ConversionException
	{
		roomData.setHotelId(room.getHotelId());
		roomData.setRoomId(room.getRoomId());
		roomData.setRoomName(room.getRoomName());
		roomData.setRoomType(room.getRoomType());
		roomData.setRoomIndex(room.getRoomIndex());
		roomData.setNumberOfNight(room.getNumberOfNight());
		roomData.setNumberOfAdult(room.getNumberOfAdult());
		roomData.setNumberOfChild(room.getNumberOfChild());
		roomData.setRoomCheckinDate(room.getRoomCheckinDate());
		roomData.setRoomCheckoutDate(room.getRoomCheckoutDate());
		//TODO
		//roomData.setTimeLimit(room.getTimeLimit());
		roomData.setStatus(room.getOrderStatus());
		//TODO move to price populator
		final PriceInfoModel price = room.getPriceInfo();
		if (price != null && price.getCostPrice() != null)
		{
			final PriceInfoData priceInfo = new PriceInfoData();
			final String nights = room.getNumberOfNight();
			priceInfo.setCostPrice(Double.valueOf(nights).doubleValue() * price.getCostPrice().doubleValue());
			roomData.setPriceInfo(priceInfo);
		}
		//TODO
		//roomData.setAgreeTerms(room.getAgreeTerms());
	}

}
