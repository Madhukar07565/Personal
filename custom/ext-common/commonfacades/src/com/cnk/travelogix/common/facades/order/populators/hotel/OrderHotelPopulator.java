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

import com.cnk.travelogix.common.core.cart.data.OrderHotelDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.PriceInfoData;
import com.cnk.travelogix.common.core.model.OrderHotelDetailInfoModel;
import com.cnk.travelogix.common.core.model.PriceInfoModel;


/**
 *
 */
public class OrderHotelPopulator implements Populator<OrderHotelDetailInfoModel, OrderHotelDetailInfoData>
{

	@Override
	public void populate(OrderHotelDetailInfoModel hotel, OrderHotelDetailInfoData hotelData) throws ConversionException
	{
		hotelData.setHotelId(hotel.getHotelId());
		hotelData.setHotelName(hotel.getHotelName());
		hotelData.setHotelRate(hotel.getHotelRate());
		hotelData.setHotelAddress(hotel.getHotelAddress());
		hotelData.setHotelCityName(hotel.getHotelCityName());
		hotelData.setHotelCountryName(hotel.getHotelCountryName());
		hotelData.setNumberOfAdult(hotel.getNumberOfAdult());
		hotelData.setNumberOfChild(hotel.getNumberOfChild());
		hotelData.setNumberOfRooms(hotel.getNumberOfrooms());
		hotelData.setNumberOfNight(hotel.getNumberOfNights());
		hotelData.setReservationDay(hotel.getNumberOfNights());
		hotelData.setHotelCheckinDate(hotel.getHotelCheckinDate());
		hotelData.setHotelCheckoutDate(hotel.getHotelCheckoutDate());
		PriceInfoModel priceInfo = hotel.getPriceInfo();
		if (priceInfo != null && priceInfo.getCostPrice() != null)
		{
			PriceInfoData priceData = new PriceInfoData();
			priceData.setCostPrice(priceInfo.getCostPrice().doubleValue());
			hotelData.setPriceInfo(priceData);
		}

		hotelData.setHotelRate(hotel.getHotelRate());
	}

}
