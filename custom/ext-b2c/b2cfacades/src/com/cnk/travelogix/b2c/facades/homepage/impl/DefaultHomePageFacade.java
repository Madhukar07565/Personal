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
package com.cnk.travelogix.b2c.facades.homepage.impl;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.cnk.travelogix.b2c.facades.homepage.HomePageFacade;
import com.cnk.travelogix.b2c.services.homepage.HomePageService;
import com.cnk.travelogix.common.core.enums.ProductTypeEnum;
import com.cnk.travelogix.common.core.model.TravellerTypeModel;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightGetAvailabilityAndFareResponse;
import com.cnk.travelogix.common.facades.home.data.TravellerDealData;
import com.cnk.travelogix.common.facades.product.data.flight.PopularFlightData;
import com.cnk.travelogix.common.facades.product.data.flight.PopularHotelCityData;
import com.cnk.travelogix.common.facades.product.data.flight.PopularHotelData;
import com.cnk.travelogix.common.facades.product.util.DateUtil;


/**
 *
 */
public class DefaultHomePageFacade implements HomePageFacade
{
	@Resource(name = "flexibleSearchService")
	private FlexibleSearchService flexibleSearchService;

	@Resource(name = "modelService")
	private ModelService modelService;

	@Resource(name = "homePageService")
	private HomePageService homePageService;

	@Override
	public List<TravellerDealData> getTravellerDealData()
	{
		final List list = new ArrayList();
		list.add(mockTravellerDealData());
		final TravellerDealData hotelDeal1 = mockTravellerDealData();
		hotelDeal1.setProductCategory("hotel");
		list.add(hotelDeal1);
		list.add(mockTravellerDealData());
		final TravellerDealData hotelDeal2 = mockTravellerDealData();
		hotelDeal2.setProductCategory("hotel");
		list.add(hotelDeal2);
		list.add(mockTravellerDealData());
		list.add(mockTravellerDealData());
		return list;
	}

	private TravellerDealData mockTravellerDealData()
	{
		final TravellerDealData data = new TravellerDealData();
		data.setProductCategory("flight");
		data.setProductCategprySubType("one way");
		data.setOfferId("offerId");
		data.setOfferName("offer Name");
		data.setOfferImage("/home/deal_image1.jpg");
		data.setOfferShortDesc("offer short desc");
		data.setOfferType("Deal of the day");
		data.setOfferValidity(new Date());
		data.setLink("link");
		data.setUserIdentity("user idntity");
		data.setDestination("destination");
		data.setSaving(Double.valueOf(5353.77));
		return data;
	}

	@Override
	public List<PopularFlightData> getPopularFlightData()
	{
		//final Date endDate = new Date();
		//final Date startDate = DateUtil.getDateOffest(endDate, -30);
		//step1:get top 9 flights in 90days
		//final List<List<String>> flightsList = this.getTop9PopularFlights(startDate, endDate, ProductTypeEnum.TICKET);
		//step2:get flights info and price by startDate:now,endDate:now +14
		//		for (int i = 0; i < flightsList.size(); i++)
		//		{
		//			final List list = flightsList.get(i);
		//			final String fromCity = (String) list.get(0);
		//			final String toCity = (String) list.get(1);
		//			final String flightType = (String) list.get(2);
		//			this.getFlightsFromSI(fromCity, toCity, flightType);
		//		}
		final List list = new ArrayList();
		list.add(mockPopularFlightData_1());
		list.add(mockPopularFlightData_2());
		list.add(mockPopularFlightData());
		list.add(mockPopularFlightData());
		list.add(mockPopularFlightData());
		list.add(mockPopularFlightData());
		list.add(mockPopularFlightData());
		list.add(mockPopularFlightData());
		list.add(mockPopularFlightData());
		return list;
	}

	private PopularFlightData getFlightsFromSI(final String fromCity, final String toCity, final String flightType)
	{
		//final Date startDate = new Date();
		//final Date endDate = DateUtil.getDateOffest(startDate, 14);
		//TODO:get data from SI
		final SvcIntFlightGetAvailabilityAndFareResponse responseFlight = new SvcIntFlightGetAvailabilityAndFareResponse();

		final PopularFlightData popularFlightData = new PopularFlightData();
		popularFlightData.setFromSector(fromCity);
		popularFlightData.setToSector(toCity);
		this.convertToPopularFlightData(responseFlight, popularFlightData);
		return popularFlightData;
	}

	private PopularFlightData convertToPopularFlightData(final SvcIntFlightGetAvailabilityAndFareResponse responseFlight,
			final PopularFlightData popularFlightData)
	{
		//final int count = responseFlight.getFlightList().size();
		//TODO:common method calculated lowest price from price calendar;
		final Double companyPrice = Double.valueOf(23456.66);
		final Double publicPirce = Double.valueOf(2435.34);
		//final Date LowestPriceDate = new Date();//TODO:
		popularFlightData.setTotalBook(Integer.valueOf(0));
		popularFlightData.setListPrice(companyPrice);
		popularFlightData.setWebPrice(publicPirce);
		popularFlightData.setDay("");
		popularFlightData.setMonth("");
		return popularFlightData;
	}



	private PopularFlightData mockPopularFlightData()
	{
		final PopularFlightData data = new PopularFlightData();
		data.setFromSector("Delhi");
		data.setToSector("Bangalore");
		data.setWebPrice(Double.valueOf(3450));
		data.setListPrice(Double.valueOf(2450));
		data.setSavings(Double.valueOf(1000));
		data.setTotalBook(Integer.valueOf(23423));
		data.setMonth("Jul");
		data.setDay("22");
		return data;
	}



	private PopularHotelData mockPopularHotelData()
	{
		final PopularHotelData data = new PopularHotelData();
		data.setHotelImage("");
		data.setHotelListPrice(Double.valueOf(2256.5));
		data.setHotelName("Ginger Tree Beach resort");
		data.setHotelStarRating(Integer.valueOf(4));
		data.setSavings(Double.valueOf(333));
		data.setHotelWebPrice(Double.valueOf(1233));
		final Date baseDate = new Date();
		data.setCheckInDate(DateUtil.formateDateOffset(baseDate, 14));
		data.setCheckOutDate(DateUtil.formateDateOffset(baseDate, 15));
		return data;
	}

	private PopularFlightData mockPopularFlightData_1()
	{
		final PopularFlightData data = new PopularFlightData();
		data.setFromSector("Delhi");
		data.setToSector("Bangalore");
		data.setWebPrice(Double.valueOf(5150));
		data.setListPrice(Double.valueOf(2450));
		data.setSavings(Double.valueOf(730));
		data.setTotalBook(Integer.valueOf(23423));
		data.setMonth("Jul");
		data.setDay("12");
		data.setDepartureTime("2016-08-12");
		data.setReturnTime("2016-08-30");
		data.setFlightType("RETURN");
		return data;
	}

	private PopularFlightData mockPopularFlightData_2()
	{
		final PopularFlightData data = new PopularFlightData();
		data.setFromSector("Mumbai");
		data.setToSector("Delhi");
		data.setWebPrice(Double.valueOf(9830));
		data.setListPrice(Double.valueOf(2450));
		data.setSavings(Double.valueOf(140));
		data.setTotalBook(Integer.valueOf(23423));
		data.setMonth("Jul");
		data.setDay("18");
		data.setDepartureTime("2016-08-02");
		data.setReturnTime("2016-08-25");
		data.setFlightType("ONE_WAY");
		return data;
	}

	@Override
	public List<PopularHotelCityData> getPopularHotelCityData()
	{
		//book 90 day
		final Date startDate = new Date();
		final Date endDate = DateUtil.getDateOffest(startDate, -90);
		return this.requestTripAdvisor(getTop4PopularCities(startDate, endDate, ProductTypeEnum.ROOM));
	}

	private List<PopularHotelCityData> requestTripAdvisor(final List<String> cities)
	{
		//TODO: Integration with TripAdvisor to get hotels
		final List<PopularHotelCityData> list = new ArrayList<PopularHotelCityData>(4);
		list.add(mockPopularHotelCityData());
		list.add(mockPopularHotelCityData());
		list.add(mockPopularHotelCityData());
		list.add(mockPopularHotelCityData());
		//TODO:Integration with SI to get price and info
		return list;
	}

	private PopularHotelCityData mockPopularHotelCityData()
	{
		final PopularHotelCityData data = new PopularHotelCityData();
		data.setCity("Goa");
		data.setTotalBook(Integer.valueOf(1234));
		final Date baseDate = new Date();
		data.setStartTime(DateUtil.formateDateOffset(baseDate, 0));
		data.setEndTime(DateUtil.formateDateOffset(baseDate, 14));
		final List<PopularHotelData> list = new ArrayList<PopularHotelData>(2);
		list.add(mockPopularHotelData());
		list.add(mockPopularHotelData());
		data.setHotelList(list);
		return data;
	}

	@Override
	public List<String> getTop4PopularCities(final Date startDate, final Date endDate, final ProductTypeEnum productType)
	{
		return homePageService.getTop4PopularCitiesOfHotels(startDate, endDate, productType);
	}

	@Override
	public List<TravellerTypeModel> getTravellerType()
	{
		return homePageService.getTravellerType();
	}

	@Override
	public List getTop9PopularFlights(final Date startDate, final Date endDate, final ProductTypeEnum productType)
	{
		return homePageService.getTop9PopularFlights(startDate, endDate, productType);
	}
}
