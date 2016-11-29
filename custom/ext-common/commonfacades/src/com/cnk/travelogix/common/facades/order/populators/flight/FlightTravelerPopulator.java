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
package com.cnk.travelogix.common.facades.order.populators.flight;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.cnk.travelogix.common.core.cart.data.FlightTravellerData;
import com.cnk.travelogix.common.core.cart.data.TravellerData;
import com.cnk.travelogix.common.core.model.FlightTravellerModel;
import com.cnk.travelogix.common.core.model.TravellerModel;


/**
 * Flight traveler populator.
 */
public class FlightTravelerPopulator<SOURCE extends TravellerModel, TARGET extends TravellerData>
		implements Populator<FlightTravellerModel, FlightTravellerData>
{

	@Override
	public void populate(final FlightTravellerModel source, final FlightTravellerData target) throws ConversionException
	{
		if (source != null)
		{
			target.setCountryCode(source.getCountryCode());
			target.setDateOfBirth(source.getDateOfBirth());
			target.setEmail(source.getEmail());
			target.setFirstName(source.getFirstName());
			target.setFreflyernumber(source.getFreflyernumber());
			target.setFreflyerSelAirline(source.getFreflyerSelAirline());
			//			target.setIssueCountry(source.getIssueCountry());
			target.setLastName(source.getLastName());
			target.setMealprefer(source.getMealprefer());
			target.setMiddleName(source.getMiddleName());
			target.setMobileNumber(source.getMobileNumber());
			target.setNationality(source.getNationality());
			target.setPassportExpDate(source.getPassportExpDate());
			target.setPassportNumber(source.getPassportNumber());
			target.setPlaceOfIssue(source.getPlaceOfIssue());
			target.setSeatprefer(source.getSeatprefer());
			target.setSpecialrequest(source.getSpecialRequest());
			target.setTitle(source.getTitle().getCode());
		}

	}
}
