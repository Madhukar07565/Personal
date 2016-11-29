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

import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.cart.data.AccommodationTravellerData;
import com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData;
import com.cnk.travelogix.common.core.model.AccommodationTravellerModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;


/**
 * @author C5244544
 */
public class OrderRoomDetailInfoPopulator implements Populator<OrderRoomDetailInfoModel, OrderRoomDetailInfoData>
{

	private Converter<AccommodationTravellerModel, AccommodationTravellerData> accommodationTravellerConverter;

	@Override
	public void populate(final OrderRoomDetailInfoModel source, final OrderRoomDetailInfoData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
//		if(source.getHotelTraveler()!=null)
//		{
//		target.setHotelTraveler(accommodationTravellerConverter.convert(source.getHotelTraveler()));
//		} 

	}

	/**
	 * @return the accommodationTravellerConverter
	 */
	public Converter<AccommodationTravellerModel, AccommodationTravellerData> getAccommodationTravellerConverter()
	{
		return accommodationTravellerConverter;
	}

	/**
	 * @param accommodationTravellerConverter
	 *           the accommodationTravellerConverter to set
	 */
	public void setAccommodationTravellerConverter(
			final Converter<AccommodationTravellerModel, AccommodationTravellerData> accommodationTravellerConverter)
	{
		this.accommodationTravellerConverter = accommodationTravellerConverter;
	}




}
