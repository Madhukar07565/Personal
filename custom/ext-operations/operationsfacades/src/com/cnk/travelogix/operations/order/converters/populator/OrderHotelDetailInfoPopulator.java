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

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.cart.data.OrderHotelDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.PriceInfoData;
import com.cnk.travelogix.common.core.model.OrderHotelDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.PriceInfoModel;


/**
 * @author C5244544
 */
public class OrderHotelDetailInfoPopulator implements Populator<OrderHotelDetailInfoModel, OrderHotelDetailInfoData>
{
	Converter<PriceInfoModel, PriceInfoData> priceInfoConverter;
	Converter<OrderRoomDetailInfoModel, OrderRoomDetailInfoData> orderRoomDetailInfoConverter;

	@Override
	public void populate(final OrderHotelDetailInfoModel source, final OrderHotelDetailInfoData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		target.setHotelAddress(source.getHotelAddress());
		target.setHotelId(source.getHotelId());
		target.setHotelName(source.getHotelName());
		target.setHotelPictureUrl(source.getHotelPictureUrl());
		//		target.setNumberOfAdult(source.getNumberOfAdult());
		//		target.setNumberOfChild(source.getNumberOfChild());
		//		target.setNumberOfRooms(source.getNumberOfrooms());
		if (source.getPriceInfo() != null)
		{
			target.setPriceInfo(priceInfoConverter.convert(source.getPriceInfo()));
		}
		target.setReservationDay(source.getReservationDay());
		//		target.setNumberOfRooms(source.getNumberOfrooms());
		//target.setRoomDetailInfoList(getroomDetails(source));
	}

	List<OrderRoomDetailInfoData> getroomDetails(final OrderHotelDetailInfoModel source)
	{
		final List<OrderRoomDetailInfoData> roomsDetailsInfoDatas = new ArrayList<>();
		final List<OrderRoomDetailInfoModel> roomsDetails = source.getOrderRoomDetailInfo();
		for (final OrderRoomDetailInfoModel roomsDetail : roomsDetails)
		{
			roomsDetailsInfoDatas.add(orderRoomDetailInfoConverter.convert(roomsDetail));
		}

		return roomsDetailsInfoDatas;

	}

	/**
	 * @return the priceInfoConverter
	 */
	public Converter<PriceInfoModel, PriceInfoData> getPriceInfoConverter()
	{
		return priceInfoConverter;
	}

	/**
	 * @param priceInfoConverter
	 *           the priceInfoConverter to set
	 */
	public void setPriceInfoConverter(final Converter<PriceInfoModel, PriceInfoData> priceInfoConverter)
	{
		this.priceInfoConverter = priceInfoConverter;
	}

	/**
	 * @return the orderRoomDetailInfoConverter
	 */
	public Converter<OrderRoomDetailInfoModel, OrderRoomDetailInfoData> getOrderRoomDetailInfoConverter()
	{
		return orderRoomDetailInfoConverter;
	}

	/**
	 * @param orderRoomDetailInfoConverter
	 *           the orderRoomDetailInfoConverter to set
	 */
	public void setOrderRoomDetailInfoConverter(
			final Converter<OrderRoomDetailInfoModel, OrderRoomDetailInfoData> orderRoomDetailInfoConverter)
	{
		this.orderRoomDetailInfoConverter = orderRoomDetailInfoConverter;
	}



}
