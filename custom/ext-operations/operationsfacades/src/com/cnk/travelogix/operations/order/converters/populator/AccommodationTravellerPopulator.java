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

import com.cnk.travelogix.common.core.cart.data.AccommodationNonPrimaryTravellerData;
import com.cnk.travelogix.common.core.cart.data.AccommodationTravellerData;
import com.cnk.travelogix.common.core.cart.data.TravellerData;
import com.cnk.travelogix.common.core.model.AccommodationTravellerModel;
import com.cnk.travelogix.common.core.model.NonPrimaryTravellerModel;
import com.cnk.travelogix.common.core.model.TravellerModel;


/**
 * @author C5244544
 */

public class AccommodationTravellerPopulator implements Populator<AccommodationTravellerModel, AccommodationTravellerData>
{

	private Converter<TravellerModel, TravellerData> travellerConverter;
	private Converter<NonPrimaryTravellerModel, AccommodationNonPrimaryTravellerData> nonPrimaryTravellerConverter;

	@Override
	public void populate(final AccommodationTravellerModel source, final AccommodationTravellerData target)
			throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		
		target.setSpecialrequest(source.getSpecialRequest());

		target.setNonPrimaryTravellerList(getNonPrimaryTravellers(source));
		travellerConverter.convert(source,target); 


	}

	public List<AccommodationNonPrimaryTravellerData> getNonPrimaryTravellers(final AccommodationTravellerModel source)
	{

		final List<NonPrimaryTravellerModel> nonPrimaryTravellers = source.getNonPrimaryTravellerList();
		final List<AccommodationNonPrimaryTravellerData> nonPrimaryTravellerDatas = new ArrayList<>();
		for (final NonPrimaryTravellerModel nonPrimaryTravellerModel : nonPrimaryTravellers)
		{
			nonPrimaryTravellerDatas.add(getNonPrimaryTravellerConverter().convert(nonPrimaryTravellerModel));
		}
		return nonPrimaryTravellerDatas;

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

	/**
	 * @return the nonPrimaryTravellerConverter
	 */
	public Converter<NonPrimaryTravellerModel, AccommodationNonPrimaryTravellerData> getNonPrimaryTravellerConverter()
	{
		return nonPrimaryTravellerConverter;
	}

	/**
	 * @param nonPrimaryTravellerConverter
	 *           the nonPrimaryTravellerConverter to set
	 */
	public void setNonPrimaryTravellerConverter(
			final Converter<NonPrimaryTravellerModel, AccommodationNonPrimaryTravellerData> nonPrimaryTravellerConverter)
	{
		this.nonPrimaryTravellerConverter = nonPrimaryTravellerConverter;
	}





}
