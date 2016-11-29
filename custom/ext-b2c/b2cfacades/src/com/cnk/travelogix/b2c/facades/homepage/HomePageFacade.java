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
package com.cnk.travelogix.b2c.facades.homepage;

import java.util.Date;
import java.util.List;

import com.cnk.travelogix.common.core.enums.ProductTypeEnum;
import com.cnk.travelogix.common.core.model.TravellerTypeModel;
import com.cnk.travelogix.common.facades.home.data.TravellerDealData;
import com.cnk.travelogix.common.facades.product.data.flight.PopularFlightData;
import com.cnk.travelogix.common.facades.product.data.flight.PopularHotelCityData;


/**
 *
 */
public interface HomePageFacade
{
	List<TravellerDealData> getTravellerDealData();

	List<PopularFlightData> getPopularFlightData();

	List<PopularHotelCityData> getPopularHotelCityData();

	List<TravellerTypeModel> getTravellerType();

	List<String> getTop4PopularCities(Date startDate, Date endDate, ProductTypeEnum productType);

	List getTop9PopularFlights(Date startDate, Date endDate, ProductTypeEnum productType);

}
