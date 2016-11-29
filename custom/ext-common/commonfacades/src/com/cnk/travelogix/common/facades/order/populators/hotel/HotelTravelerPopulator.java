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

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.cnk.travelogix.common.core.cart.data.AccommodationNonPrimaryTravellerData;
import com.cnk.travelogix.common.core.cart.data.AccommodationTravellerData;
import com.cnk.travelogix.common.core.cart.data.OrderHotelDetailInfoData;
import com.cnk.travelogix.common.core.cart.data.OrderRoomDetailInfoData;
import com.cnk.travelogix.common.core.model.AccommodationTravellerModel;
import com.cnk.travelogix.common.core.model.NonPrimaryTravellerModel;
import com.cnk.travelogix.common.core.model.OrderHotelDetailInfoModel;
import com.cnk.travelogix.common.core.model.TravellerModel;

/**
 *
 */
public class HotelTravelerPopulator implements Populator<TravellerModel,AccommodationTravellerData>
{
	@Override
	public void populate(TravellerModel travelerModel, AccommodationTravellerData travelerData) throws ConversionException
	{
		travelerData.setFirstName(travelerModel.getFirstName());
		travelerData.setLastName(travelerModel.getLastName());
		travelerData.setTitle(travelerModel.getTitle().getCode());
		travelerData.setMobileNumber(travelerModel.getMobileNumber());
		travelerData.setEmail(travelerModel.getEmail());
		travelerData.setNationality(travelerModel.getNationality());

		AccommodationTravellerModel hotelTravelerModel = (AccommodationTravellerModel) travelerModel;
		final List<NonPrimaryTravellerModel> nonPriTravlers = hotelTravelerModel.getNonPrimaryTravellerList();

		if (!nonPriTravlers.isEmpty())
		{
			List<AccommodationNonPrimaryTravellerData> npts = new ArrayList<AccommodationNonPrimaryTravellerData>();
			for (NonPrimaryTravellerModel nonTra : nonPriTravlers)
			{
				AccommodationNonPrimaryTravellerData npt = new AccommodationNonPrimaryTravellerData();
				npt.setFirstName(nonTra.getFirstName());
				npt.setLastName(nonTra.getLastName());
				npt.setTitle(nonTra.getTitle());
				npt.setDateOfBirth(nonTra.getDateOfBirth());

				npts.add(npt);
			}
			travelerData.setNonPrimaryTravellerList(npts);
		}
	}

}
