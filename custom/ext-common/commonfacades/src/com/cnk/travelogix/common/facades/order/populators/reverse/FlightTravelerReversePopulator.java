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
package com.cnk.travelogix.common.facades.order.populators.reverse;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.user.UserService;

import javax.annotation.Resource;

import com.cnk.travelogix.common.core.cart.data.FlightTravellerData;
import com.cnk.travelogix.common.core.cart.data.TravellerData;
import com.cnk.travelogix.common.core.model.FlightTravellerModel;
import com.cnk.travelogix.common.core.model.TravellerModel;


/**
 *
 */
public class FlightTravelerReversePopulator<SOURCE extends TravellerData, TARGET extends TravellerModel> implements
		Populator<FlightTravellerData, FlightTravellerModel>
{
	@Resource
	UserService userService;

	@Override
	public void populate(final FlightTravellerData source, final FlightTravellerModel target) throws ConversionException
	{
		target.setCountryCode(source.getCountryCode());
		target.setDateOfBirth(source.getDateOfBirth());
		target.setEmail(source.getEmail());
		target.setFirstName(source.getFirstName());
		//		target.setIssueCountry(source.getIssueCountry());
		target.setLastName(source.getLastName());
		target.setMiddleName(source.getMiddleName());
		target.setMobileNumber(source.getMobileNumber());
		target.setNationality(source.getNationality());
		target.setFreflyernumber(source.getFreflyernumber());
		target.setFreflyerSelAirline(source.getFreflyerSelAirline());
		target.setMealprefer(source.getMealprefer());
		target.setPassportExpDate(source.getPassportExpDate());
		target.setPassportNumber(source.getPassportNumber());
		target.setPlaceOfIssue(source.getPlaceOfIssue());
		target.setSeatprefer(source.getSeatprefer());
		target.setSpecialRequest(source.getSpecialrequest());
		target.setTitle(this.userService.getTitleForCode(source.getTitle()));
	}
}
