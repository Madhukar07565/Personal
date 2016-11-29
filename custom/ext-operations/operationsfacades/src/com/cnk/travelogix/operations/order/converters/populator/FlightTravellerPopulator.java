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

import com.cnk.travelogix.common.core.cart.data.FlightTravellerData;
import com.cnk.travelogix.common.core.cart.data.TravellerData;
import com.cnk.travelogix.common.core.model.FlightTravellerModel;
import com.cnk.travelogix.common.core.model.TravellerModel;


/**
 * This populator is used for populate FlightTravellerModel into FlightTravellerData
 *
 * @author C5244544
 */
public class FlightTravellerPopulator implements Populator<FlightTravellerModel, FlightTravellerData>
{
	private Converter<TravellerModel, TravellerData> travellerConverter;

	@Override
	public void populate(final FlightTravellerModel source, final FlightTravellerData target) throws ConversionException
	{

		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		target.setSpecialrequest(source.getSpecialRequest());
		travellerConverter.convert(source,target); 

	}

	/**
	 * @return the travellerConverter
	 */
	public Converter<TravellerModel, TravellerData> getTravellerConverter()
	{
		return travellerConverter;
	}

	/**
	 * @param travellerConverter
	 *           the travellerConverter to set
	 */
	public void setTravellerConverter(final Converter<TravellerModel, TravellerData> travellerConverter)
	{
		this.travellerConverter = travellerConverter;
	}

}
