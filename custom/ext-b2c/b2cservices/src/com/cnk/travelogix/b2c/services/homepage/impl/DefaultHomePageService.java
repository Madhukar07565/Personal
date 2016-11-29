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
package com.cnk.travelogix.b2c.services.homepage.impl;

import de.hybris.platform.core.model.enumeration.EnumerationValueModel;
import de.hybris.platform.core.model.order.OrderEntryModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.b2c.services.homepage.HomePageService;
import com.cnk.travelogix.common.core.enums.ProductTypeEnum;
import com.cnk.travelogix.common.core.model.CommonFlightInfoModel;
import com.cnk.travelogix.common.core.model.OrderFlightDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderHotelDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;
import com.cnk.travelogix.common.core.model.TravellerTypeModel;
import com.cnk.travelogix.supplier.masters.core.enums.JourneyType;


/**
 *
 */
public class DefaultHomePageService implements HomePageService
{
	@Resource(name = "flexibleSearchService")
	private FlexibleSearchService flexibleSearchService;

	public static final String QUERY_TOP_4_CITY_OF_HOTEL = " SELECT HOTELNAME FROM ({{"
			+ " SELECT COUNT(1) AS POPULAR,{OHDI:HOTELCITYNAME } AS HOTELNAME " + " FROM " + "{ "
			+ OrderEntryModel._TYPECODE
			+ " AS OE "
			+ " LEFT JOIN "
			+ OrderRoomDetailInfoModel._TYPECODE
			+ " AS ORDI "
			+ " ON {ORDI:PK} = {OE:ORDERPRODUCTINFO}"
			+ " LEFT JOIN "
			+ OrderHotelDetailInfoModel._TYPECODE
			+ " AS OHDI "
			+ " ON {OHDI:PK} = {ORDI:ORDERHOTELDETAILINFO } "
			+ " LEFT JOIN "
			+ EnumerationValueModel._TYPECODE
			+ " AS EV "
			+ " ON {EV:PK} = {OE:PRODUCTTYPEENUM} "
			+ " }"
			+ " WHERE "
			+ " {EV:CODE} = ?productType"
			+ " AND {OE:CREATIONTIME} >= ?startDate "
			+ " AND {OE:CREATIONTIME} <= ?endDate "
			+ " GROUP BY {OHDI:HOTELCITYNAME} "
			+ " ORDER BY POPULAR DESC" + " }}) cities ";

	public static final String QUERY_TOP_9_FLIGHTS = " SELECT FROMCITY,TOCITY,JOR"
			+ " FROM ( "
			+ " {{"
			+ " SELECT DISTINCT COUNT(1) AS ONUMBER,"
			+ " CASE {CFI:FROMCITY} WHEN STRCMP({CFI:FROMCITY},{CFI:TOCITY})>0 THEN {CFI:FROMCITY} ELSE {CFI:TOCITY} END AS FROMCITY ,"
			+ " CASE {CFI:TOCITY} WHEN STRCMP({CFI:FROMCITY},{CFI:TOCITY})>0 THEN {CFI:TOCITY} ELSE {CFI:FROMCITY} END AS TOCITY ,"
			+ " {JOUR:CODE} AS JOR " + " FROM " + " { "
			+ OrderEntryModel._TYPECODE
			+ " AS OE "
			+ " LEFT JOIN "
			+ OrderTicketInfoModel._TYPECODE
			+ " AS OTI "
			+ " ON {OE:ORDERPRODUCTINFO}={OTI:PK} "
			+ " LEFT JOIN "
			+ OrderFlightDetailInfoModel._TYPECODE
			+ " AS OFDI "
			+ " ON {OTI:ORDERFLIGHTDETAILINFO}={OFDI:PK} "
			+ " LEFT JOIN "
			+ CommonFlightInfoModel._TYPECODE
			+ " AS CFI "
			+ " ON {OTI:COMMONFLIGHTINFO}={CFI:PK} "
			+ " LEFT JOIN "
			+ JourneyType._TYPECODE
			+ " AS JOUR "
			+ " ON {OFDI:JOURNEYTYPE}={JOUR:PK} "
			+ " LEFT JOIN "
			+ ProductTypeEnum._TYPECODE
			+ " AS P "
			+ " ON {OE:PRODUCTTYPEENUM}={P:PK} "
			+ " } "
			+ " WHERE"
			+ " {JOUR:CODE}=?twoWayjourneyType "
			+ " AND"
			+ " {P:CODE} =?ProductType "
			+ " AND "
			+ " {OE:CREATIONTIME} >= ?startDate "
			+ " AND "
			+ " {OE:CREATIONTIME} <= ?endDate "
			+ " GROUP BY {CFI:FROMCITY},{CFI:TOCITY} "
			+ " }} UNION ALL {{ "
			+ " SELECT COUNT(1) AS ONUMBER,"
			+ " {CFI:FROMCITY} AS FROMCITY ,"
			+ " {CFI:TOCITY} AS TOCITY ,"
			+ " {JOUR:CODE} AS JOR "
			+ " FROM "
			+ " { "
			+ OrderEntryModel._TYPECODE
			+ " AS OE "
			+ " LEFT JOIN "
			+ OrderTicketInfoModel._TYPECODE
			+ " AS OTI "
			+ " ON {OE:ORDERPRODUCTINFO}={OTI:PK} "
			+ " LEFT JOIN "
			+ OrderFlightDetailInfoModel._TYPECODE
			+ " AS OFDI "
			+ " ON {OTI:ORDERFLIGHTDETAILINFO}={OFDI:PK} "
			+ " LEFT JOIN "
			+ CommonFlightInfoModel._TYPECODE
			+ " AS CFI "
			+ " ON {OTI:COMMONFLIGHTINFO}={CFI:PK} "
			+ " LEFT JOIN "
			+ JourneyType._TYPECODE
			+ " AS JOUR "
			+ " ON {OFDI:JOURNEYTYPE}={JOUR:PK} "
			+ " LEFT JOIN "
			+ ProductTypeEnum._TYPECODE
			+ " AS P "
			+ " ON {OE:PRODUCTTYPEENUM}={P:PK} "
			+ " } "
			+ " WHERE"
			+ " {JOUR:CODE}=?oneWayjourneyType "
			+ " AND"
			+ " {P:CODE} =?productType "
			+ " AND "
			+ " {OE:CREATIONTIME} >= ?startDate "
			+ " AND "
			+ " {OE:CREATIONTIME} <= ?endDate "
			+ " GROUP BY {CFI:FROMCITY},{CFI:TOCITY} "
			+ " }} "
			+ " ) AS FLIGHTS "
			+ " ORDER BY ONUMBER ";

	@Override
	public List<String> getTop4PopularCitiesOfHotels(final Date startDate, final Date endDate, final ProductTypeEnum productType)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_TOP_4_CITY_OF_HOTEL);
		query.addQueryParameter("productType", productType.getCode());
		query.addQueryParameter("startDate", startDate);
		query.addQueryParameter("endDate", endDate);
		final SearchResult<String> result = flexibleSearchService.search(query);
		return CollectionUtils.isNotEmpty(result.getResult()) ? result.getResult() : null;
	}


	@Override
	public List<TravellerTypeModel> getTravellerType()
	{

		final FlexibleSearchQuery query = new FlexibleSearchQuery("SELECT {PK} FROM {TRAVELLERTYPE}");
		final SearchResult<TravellerTypeModel> result = flexibleSearchService.search(query);
		return result.getResult();
	}


	@Override
	public List getTop9PopularFlights(final Date startDate, final Date endDate, final ProductTypeEnum productType)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(QUERY_TOP_9_FLIGHTS);
		query.addQueryParameter("oneWayjourneyType", JourneyType.ONE_WAY.getCode());
		query.addQueryParameter("twoWayjourneyType", JourneyType.RETURN.getCode());
		query.addQueryParameter("productType", productType.getCode());
		query.addQueryParameter("startDate", startDate);
		query.addQueryParameter("endDate", endDate);
		query.setResultClassList(Arrays.asList(String.class, String.class, String.class));
		final SearchResult<List<List<String>>> result = flexibleSearchService.search(query);

		return CollectionUtils.isNotEmpty(result.getResult()) ? result.getResult() : new ArrayList();
	}


}
