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

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.common.core.cart.data.AccommodationNonPrimaryTravellerData;
import com.cnk.travelogix.common.core.cart.data.AccommodationTravellerData;
import com.cnk.travelogix.common.core.model.AccommodationTravellerModel;
import com.cnk.travelogix.common.core.model.NonPrimaryTravellerModel;
import com.cnk.travelogix.common.core.model.TravellerModel;


/**
 *
 */
public class HotelTravelerReversePopulator implements Populator<AccommodationTravellerData, AccommodationTravellerModel>
{
	private UserService userService;
	/**
	 * covert traveler data to traveler model
	 */
	@Override
	public void populate(AccommodationTravellerData travelerData, AccommodationTravellerModel traveler) throws ConversionException
	{

		traveler.setFirstName(travelerData.getFirstName());
		traveler.setLastName(travelerData.getLastName());
		traveler.setTitle(getUserService().getTitleForCode(travelerData.getTitle()));
		traveler.setMobileNumber(travelerData.getMobileNumber());
		traveler.setEmail(travelerData.getEmail());
		traveler.setNationality(travelerData.getNationality());

		final List<NonPrimaryTravellerModel> nonPrimaryTravellers = new ArrayList<NonPrimaryTravellerModel>();
		final List<AccommodationNonPrimaryTravellerData> nonTraves = travelerData.getNonPrimaryTravellerList();

		if (nonTraves != null && !nonTraves.isEmpty())
		{
			for (final AccommodationNonPrimaryTravellerData nonTrave : nonTraves)
			{
				final NonPrimaryTravellerModel nonPrimaryTraveller1 = new NonPrimaryTravellerModel();
				nonPrimaryTraveller1.setTitle(nonTrave.getTitle());
				nonPrimaryTraveller1.setFirstName(nonTrave.getFirstName());
				nonPrimaryTraveller1.setLastName(nonTrave.getLastName());

				if (nonTrave.getDateOfBirth() != null)
				{
					nonPrimaryTraveller1.setDateOfBirth(nonTrave.getDateOfBirth());
				}

				nonPrimaryTravellers.add(nonPrimaryTraveller1);
			}


			traveler.setNonPrimaryTravellerList(nonPrimaryTravellers);
		}
	
	}
	/**
	 * @return the userService
	 */
	public UserService getUserService()
	{
		return userService;
	}
	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService)
	{
		this.userService = userService;
	}

}
