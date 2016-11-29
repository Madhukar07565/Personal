/**
 *
 */
package com.cnk.travelogix.common.facades.product.impl;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import de.hybris.platform.core.Registry;
import de.hybris.platform.servicelayer.config.ConfigurationService;

import org.apache.commons.configuration.Configuration;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.cnk.travelogix.common.facades.product.CnkProductSearchFacade;
import com.cnk.travelogix.common.facades.product.data.BasePageableSearchData;
import com.cnk.travelogix.common.facades.product.data.FlightHotelSearchData;
import com.cnk.travelogix.common.facades.product.data.FlightProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.flight.AirlineIATAData;
import com.cnk.travelogix.common.facades.product.data.flight.AirportData;
import com.cnk.travelogix.common.facades.product.data.flight.FareDetailData;
import com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightDetailData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightResultData;
import com.cnk.travelogix.common.facades.product.util.CnkBeanUtil;
import com.thoughtworks.xstream.XStream;


/**
 * @author i313879
 *
 */
public class MockupFlightSearchFacade implements CnkProductSearchFacade<FlightData>
{

	private static final Logger LOG = Logger.getLogger(MockupFlightSearchFacade.class);

	private static final String SI_SERVICE_ENABLE = "si.service.enable";

	@Autowired(required = true)
	@Qualifier("configurationService")
	private ConfigurationService configurationService;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.facades.product.CnkProductSearchFacade#searchProduct(com.cnk.travelogix.common.facades
	 * .product.data.BasePageableSearchData)
	 */
	@Override
	public FlightProductSearchPageData searchProduct(final BasePageableSearchData searchParameters)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug(CnkBeanUtil.getString(searchParameters));
		}

		if (isSIServiceEnable())
		{
			SvcIntFlightSearchFacade svcIntFlightSearchFacade = (SvcIntFlightSearchFacade) Registry.getApplicationContext().getBean("svcIntFlightSearchFacade");
			return svcIntFlightSearchFacade.searchProduct(searchParameters);
		}
		else
		{
			return buildMockupSearchPageData(searchParameters);
		}
	}
	
	/**
	 * Is SI service enable?
	 * 
	 * @return enable
	 */
	private boolean isSIServiceEnable()
	{
		boolean isServiceEnable = false;
		final Configuration configuration = configurationService.getConfiguration();
		if (configuration != null)
		{
			isServiceEnable = configuration.getBoolean(SI_SERVICE_ENABLE, false);
		}
		return isServiceEnable;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.facades.product.CnkProductSearchFacade#searchProductDetail(com.cnk.travelogix.common
	 * .facades.product.data.BasePageableSearchData)
	 */
	@Override
	public FlightData searchProductDetail(final BasePageableSearchData searchParameters)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug(CnkBeanUtil.getString(searchParameters));
		}
		return buildFlight("flightData1.1");
	}

	@Override
	public FlightData searchProductDetail(final String productId)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug(CnkBeanUtil.getString(productId));
		}
		return buildFlight(productId);
	}

	private FlightProductSearchPageData newSearchResult(final BasePageableSearchData searchParameters)
	{
		final FlightProductSearchPageData result = new FlightProductSearchPageData();
		if (searchParameters instanceof FlightHotelSearchData)
		{
			result.setCurrentSection(((FlightHotelSearchData) searchParameters).getCurrentSection());
			result.setFlightType(((FlightHotelSearchData) searchParameters).getFlightType());
		}
		return result;
	}

	private FlightProductSearchPageData buildMockupSearchPageData4Oneway(final BasePageableSearchData searchParameters)
	{
		final FlightProductSearchPageData result = newSearchResult(searchParameters);
		result.setFlightType("ONEWAY");
		final XStream xstream = new XStream();
		final InputStream xml1 = getClass().getResourceAsStream("/commonfacades/test/flightData1.1.xml");
		final FlightData hotel1 = (FlightData) xstream.fromXML(xml1);

		final InputStream xml2 = getClass().getResourceAsStream("/commonfacades/test/flightData1.2.xml");
		final FlightData hotel2 = (FlightData) xstream.fromXML(xml2);

		final InputStream xml3 = getClass().getResourceAsStream("/commonfacades/test/flightData1.3.xml");
		final FlightData hotel3 = (FlightData) xstream.fromXML(xml3);

		setDisplayTime4FlightData(hotel1, hotel2, hotel3);

		final List<FlightResultData> bestPriceRecommend = new ArrayList();
		List<FlightData> flights = new ArrayList();
		flights.add(hotel3);

		final FlightResultData bestflightResult1 = new FlightResultData();
		bestflightResult1.setListOfFlights(flights);
		bestPriceRecommend.add(bestflightResult1);
		Date startDate = ((FlightHotelSearchData) searchParameters).getEntrys().get(0).getDepartureFlightSearchData()
				.getDepartureDate();
		final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		if (startDate == null)
		{
			try
			{
				startDate = dateFormatter.parse("2016-08-17");
			}
			catch (final ParseException e)
			{
				// YTODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		bestflightResult1.setFareCarouselMap(genearteFareCarouselMap(startDate, true));

		bestflightResult1.setSelectedItemKey(dateFormatter.format(startDate));
		result.setBestPriceRecommend(bestPriceRecommend);
		result.setBreadcrumbs(Collections.EMPTY_LIST);
		result.setFacets(Collections.EMPTY_LIST);
		result.setPageNum(1);


		final List<FlightResultData> resultHotels = new ArrayList();
		flights = new ArrayList();
		final FlightResultData result1 = new FlightResultData();
		flights.add(hotel1);
		flights.add(hotel2);
		flights.add(hotel3);
		result1.setListOfFlights(flights);

		resultHotels.add(result1);

		result.setResult(resultHotels);

		return result;

	}

	private FlightProductSearchPageData buildMockupSearchPageData4Twoway(final BasePageableSearchData searchParameters)
	{
		final FlightProductSearchPageData result = newSearchResult(searchParameters);
		result.setFlightType("TWOWAY");
		final XStream xstream = new XStream();
		final InputStream xml1_1 = getClass().getResourceAsStream("/commonfacades/test/flightData1.1.xml");
		final FlightData hotel1_1 = (FlightData) xstream.fromXML(xml1_1);

		final InputStream xml1_2 = getClass().getResourceAsStream("/commonfacades/test/flightData1.2.xml");
		final FlightData hotel1_2 = (FlightData) xstream.fromXML(xml1_2);

		final InputStream xml1_3 = getClass().getResourceAsStream("/commonfacades/test/flightData1.3.xml");
		final FlightData hotel1_3 = (FlightData) xstream.fromXML(xml1_3);

		final InputStream xml2_1 = getClass().getResourceAsStream("/commonfacades/test/flightData2.1.xml");
		final FlightData hotel2_1 = (FlightData) xstream.fromXML(xml2_1);

		final InputStream xml2_2 = getClass().getResourceAsStream("/commonfacades/test/flightData2.2.xml");
		final FlightData hotel2_2 = (FlightData) xstream.fromXML(xml2_2);

		final InputStream xml2_3 = getClass().getResourceAsStream("/commonfacades/test/flightData2.3.xml");
		final FlightData hotel2_3 = (FlightData) xstream.fromXML(xml2_3);

		setDisplayTime4FlightData(hotel1_1, hotel1_2, hotel1_3, hotel2_1, hotel2_2, hotel2_3);

		final List<FlightResultData> bestPriceRecommend = new ArrayList();
		List<FlightData> flights = new ArrayList();
		flights.add(hotel1_3);


		final FlightResultData bestflightResult1 = new FlightResultData();
		bestflightResult1.setListOfFlights(flights);

		final FlightResultData bestflightResult2 = new FlightResultData();
		flights = new ArrayList();
		flights.add(hotel2_3);
		bestflightResult2.setListOfFlights(flights);

		bestPriceRecommend.add(bestflightResult1);
		bestPriceRecommend.add(bestflightResult2);

		Date startDate = ((FlightHotelSearchData) searchParameters).getEntrys().get(0).getDepartureFlightSearchData()
				.getDepartureDate();
		final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		if (startDate == null)
		{
			try
			{
				startDate = dateFormatter.parse("2016-08-17");
			}
			catch (final ParseException e)
			{
				// YTODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		bestflightResult1.setFareCarouselMap(genearteFareCarouselMap(startDate, true));
		bestflightResult1.setSelectedItemKey(dateFormatter.format(startDate));
		startDate = ((FlightHotelSearchData) searchParameters).getEntrys().get(0).getReturnFlightSearchData().getDepartureDate();
		if (startDate == null)
		{
			try
			{
				startDate = dateFormatter.parse("2016-08-19");
			}
			catch (final ParseException e)
			{
				// YTODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		bestflightResult2.setFareCarouselMap(genearteFareCarouselMap(startDate, true));
		bestflightResult2.setSelectedItemKey(dateFormatter.format(startDate));

		//		bestflightResult1.setFareCarouselMap(createFareCarouselMap());
		//		bestflightResult2.setFareCarouselMap(createFareCarouselMap());
		//		bestflightResult1.setSelectedItemKey("Sun | Jul 17");
		//		bestflightResult2.setSelectedItemKey("Sun | Jul 17");
		result.setBestPriceRecommend(bestPriceRecommend);
		result.setBreadcrumbs(Collections.EMPTY_LIST);
		result.setFacets(Collections.EMPTY_LIST);
		result.setPageNum(1);


		final List<FlightResultData> resultHotels = new ArrayList();
		flights = new ArrayList();
		final FlightResultData result1 = new FlightResultData();
		flights.add(hotel1_1);
		flights.add(hotel1_2);
		flights.add(hotel1_3);
		result1.setListOfFlights(flights);

		flights = new ArrayList();
		final FlightResultData result2 = new FlightResultData();
		flights.add(hotel2_1);
		flights.add(hotel2_2);
		flights.add(hotel2_3);
		result2.setListOfFlights(flights);

		resultHotels.add(result1);
		resultHotels.add(result2);

		result.setResult(resultHotels);

		return result;
	}

	private FlightProductSearchPageData buildMockupSearchPageData4Multiway(final BasePageableSearchData searchParameters)
	{
		final FlightProductSearchPageData result = newSearchResult(searchParameters);
		result.setFlightType("MULTICITY");
		final XStream xstream = new XStream();
		final InputStream xml1_1 = getClass().getResourceAsStream("/commonfacades/test/flightData3.1.xml");
		final FlightData hotel1_1 = (FlightData) xstream.fromXML(xml1_1);

		final InputStream xml1_2 = getClass().getResourceAsStream("/commonfacades/test/flightData3.2.xml");
		final FlightData hotel1_2 = (FlightData) xstream.fromXML(xml1_2);

		final InputStream xml1_3 = getClass().getResourceAsStream("/commonfacades/test/flightData3.3.xml");
		final FlightData hotel1_3 = (FlightData) xstream.fromXML(xml1_3);

		final InputStream xml2_1 = getClass().getResourceAsStream("/commonfacades/test/flightData4.1.xml");
		final FlightData hotel2_1 = (FlightData) xstream.fromXML(xml2_1);

		final InputStream xml2_2 = getClass().getResourceAsStream("/commonfacades/test/flightData4.2.xml");
		final FlightData hotel2_2 = (FlightData) xstream.fromXML(xml2_2);

		final InputStream xml2_3 = getClass().getResourceAsStream("/commonfacades/test/flightData4.3.xml");
		final FlightData hotel2_3 = (FlightData) xstream.fromXML(xml2_3);

		final InputStream xml3_1 = getClass().getResourceAsStream("/commonfacades/test/flightData2.1.xml");
		final FlightData hotel3_1 = (FlightData) xstream.fromXML(xml3_1);

		final InputStream xml3_2 = getClass().getResourceAsStream("/commonfacades/test/flightData2.2.xml");
		final FlightData hotel3_2 = (FlightData) xstream.fromXML(xml3_2);

		final InputStream xml3_3 = getClass().getResourceAsStream("/commonfacades/test/flightData2.3.xml");
		final FlightData hotel3_3 = (FlightData) xstream.fromXML(xml3_3);

		setDisplayTime4FlightData(hotel1_1, hotel1_2, hotel1_3, hotel2_1, hotel2_2, hotel2_3, hotel3_1, hotel3_2, hotel3_3);

		final List<FlightResultData> bestPriceRecommend = new ArrayList();

		List<FlightData> flights = new ArrayList();
		flights.add(hotel1_3);
		final FlightResultData bestflightResult1 = new FlightResultData();
		bestflightResult1.setListOfFlights(flights);

		final FlightResultData bestflightResult2 = new FlightResultData();
		flights = new ArrayList();
		flights.add(hotel3_2);
		bestflightResult2.setListOfFlights(flights);

		final FlightResultData bestflightResult3 = new FlightResultData();
		flights = new ArrayList();
		flights.add(hotel3_3);
		bestflightResult3.setListOfFlights(flights);

		bestPriceRecommend.add(bestflightResult1);
		bestPriceRecommend.add(bestflightResult2);
		bestPriceRecommend.add(bestflightResult3);

		bestflightResult1.setFareCarouselMap(createFareCarouselMap());
		bestflightResult2.setFareCarouselMap(createFareCarouselMap());
		bestflightResult3.setFareCarouselMap(createFareCarouselMap());

		result.setBestPriceRecommend(bestPriceRecommend);
		result.setBreadcrumbs(Collections.EMPTY_LIST);
		result.setFacets(Collections.EMPTY_LIST);
		result.setPageNum(1);


		final List<FlightResultData> resultHotels = new ArrayList();
		flights = new ArrayList();
		final FlightResultData result1 = new FlightResultData();
		flights.add(hotel1_1);
		flights.add(hotel1_2);
		flights.add(hotel1_3);
		result1.setListOfFlights(flights);

		flights = new ArrayList();
		final FlightResultData result2 = new FlightResultData();
		flights.add(hotel2_1);
		flights.add(hotel2_2);
		flights.add(hotel2_3);
		result2.setListOfFlights(flights);

		flights = new ArrayList();
		final FlightResultData result3 = new FlightResultData();
		flights.add(hotel3_1);
		flights.add(hotel3_2);
		flights.add(hotel3_3);
		result3.setListOfFlights(flights);

		resultHotels.add(result1);
		resultHotels.add(result2);
		resultHotels.add(result3);

		result.setResult(resultHotels);

		return result;
	}

	private FlightProductSearchPageData buildMockupSearchPageData4MulticityIntl(final BasePageableSearchData searchParameters)
	{
		final FlightProductSearchPageData result = newSearchResult(searchParameters);
		result.setFlightType("MULTICITY-INTL");
		final XStream xstream = new XStream();
		final InputStream xml1_1 = getClass().getResourceAsStream("/commonfacades/test/flightData2.1.xml");
		final FlightData hotel1_1 = (FlightData) xstream.fromXML(xml1_1);

		final InputStream xml1_2 = getClass().getResourceAsStream("/commonfacades/test/flightData3.1.xml");
		final FlightData hotel1_2 = (FlightData) xstream.fromXML(xml1_2);

		final InputStream xml1_3 = getClass().getResourceAsStream("/commonfacades/test/flightData4.1.xml");
		final FlightData hotel1_3 = (FlightData) xstream.fromXML(xml1_3);

		final InputStream xml2_1 = getClass().getResourceAsStream("/commonfacades/test/flightData2.2.xml");
		final FlightData hotel2_1 = (FlightData) xstream.fromXML(xml2_1);

		final InputStream xml2_2 = getClass().getResourceAsStream("/commonfacades/test/flightData3.2.xml");
		final FlightData hotel2_2 = (FlightData) xstream.fromXML(xml2_2);

		final InputStream xml2_3 = getClass().getResourceAsStream("/commonfacades/test/flightData4.2.xml");
		final FlightData hotel2_3 = (FlightData) xstream.fromXML(xml2_3);

		final InputStream xml3_1 = getClass().getResourceAsStream("/commonfacades/test/flightData2.3.xml");
		final FlightData hotel3_1 = (FlightData) xstream.fromXML(xml3_1);

		final InputStream xml3_2 = getClass().getResourceAsStream("/commonfacades/test/flightData3.3.xml");
		final FlightData hotel3_2 = (FlightData) xstream.fromXML(xml3_2);

		final InputStream xml3_3 = getClass().getResourceAsStream("/commonfacades/test/flightData4.3.xml");
		final FlightData hotel3_3 = (FlightData) xstream.fromXML(xml3_3);

		setDisplayTime4FlightData(hotel1_1, hotel1_2, hotel1_3, hotel2_1, hotel2_2, hotel2_3, hotel3_1, hotel3_2, hotel3_3);

		final List<FlightResultData> bestPriceRecommend = new ArrayList();

		List<FlightData> flights = new ArrayList();
		flights.add(hotel1_1);
		final FlightResultData bestflightResult1 = new FlightResultData();
		bestflightResult1.setListOfFlights(flights);

		final FlightResultData bestflightResult2 = new FlightResultData();
		flights = new ArrayList();
		flights.add(hotel1_2);
		bestflightResult2.setListOfFlights(flights);

		final FlightResultData bestflightResult3 = new FlightResultData();
		flights = new ArrayList();
		flights.add(hotel1_3);
		bestflightResult3.setListOfFlights(flights);

		bestPriceRecommend.add(bestflightResult1);

		bestflightResult1.setFareCarouselMap(createFareCarouselMap());

		result.setBestPriceRecommend(bestPriceRecommend);
		result.setBreadcrumbs(Collections.EMPTY_LIST);
		result.setFacets(Collections.EMPTY_LIST);
		result.setPageNum(1);


		final List<FlightResultData> resultHotels = new ArrayList();
		flights = new ArrayList();
		final FlightResultData result1 = new FlightResultData();
		flights.add(hotel1_1);
		flights.add(hotel1_2);
		flights.add(hotel1_3);
		result1.setListOfFlights(flights);

		flights = new ArrayList();
		final FlightResultData result2 = new FlightResultData();
		flights.add(hotel2_1);
		flights.add(hotel2_2);
		flights.add(hotel2_3);
		result2.setListOfFlights(flights);

		flights = new ArrayList();
		final FlightResultData result3 = new FlightResultData();
		flights.add(hotel3_1);
		flights.add(hotel3_2);
		flights.add(hotel3_3);
		result3.setListOfFlights(flights);

		resultHotels.add(result1);
		resultHotels.add(result2);
		resultHotels.add(result3);

		result.setResult(resultHotels);

		return result;
	}

	private void setDisplayTime4FlightData(final FlightData... flights)
	{
		for (final FlightData flight : flights)
		{
			final SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm");
			final SimpleDateFormat dateFormatter = new SimpleDateFormat("dd MMM, EEE");

			flight.setDisplayDepartureTime(timeFormatter.format(flight.getDepartureTime()));
			flight.setDisplayArrivalTime(timeFormatter.format(flight.getArrivalTime()));
			flight.setDisplayDepartureDate(dateFormatter.format(flight.getDepartureTime()));
			flight.setDisplayArrivalDate(dateFormatter.format(flight.getArrivalTime()));
			for (final FlightDetailData flightDetail : flight.getFlightDetails())
			{
				flightDetail.setDisplayDepartureTime(timeFormatter.format(flightDetail.getDepartureTime()));
				flightDetail.setDisplayDepartureDate(dateFormatter.format(flightDetail.getDepartureTime()));
				flightDetail.setDisplayArrivalTime(timeFormatter.format(flightDetail.getArrivalTime()));
				flightDetail.setDisplayArrivalDate(dateFormatter.format(flightDetail.getArrivalTime()));
			}
		}
	}

	private FlightProductSearchPageData buildMockupSearchPageData(final BasePageableSearchData searchParameters)
	{
		//List<CnkFacetData> facets = null;
		//facets = ((FlightHotelSearchData) searchParameters).getFacets();

		final String flightType = ((FlightHotelSearchData) searchParameters).getFlightType();

		if (flightType.equalsIgnoreCase("oneway"))
		{

			return buildMockupSearchPageData4Oneway(searchParameters);
		}
		else if (flightType.equalsIgnoreCase("twoway"))
		{
			return buildMockupSearchPageData4Twoway(searchParameters);
		}
		else if (flightType.equalsIgnoreCase("multicity-intl"))
		{
			return buildMockupSearchPageData4MulticityIntl(searchParameters);
		}
		return buildMockupSearchPageData4Multiway(searchParameters);
		//		try
		//		{
		//			final CnkProductSearchPageData result = new CnkProductSearchPageData();
		//			final XStream xstream = new XStream();
		//			final InputStream xml1 = getClass().getResourceAsStream("/commonfacades/test/flightData1.xml");
		//			final FlightData hotel1 = (FlightData) xstream.fromXML(xml1);
		//
		//			final InputStream xml2 = getClass().getResourceAsStream("/commonfacades/test/flightData2.xml");
		//			final FlightData hotel2 = (FlightData) xstream.fromXML(xml2);
		//
		//			final InputStream xml3 = getClass().getResourceAsStream("/commonfacades/test/flightData3.xml");
		//			final FlightData hotel3 = (FlightData) xstream.fromXML(xml3);
		//
		//			// start mock facet
		//			if (facets == null)
		//			{
		//				final String mockFacetInJson = "[{'code':'DepartureTime','values':[{'code':'from','name':'','value':6,'selected':true},{'code':'to','name':'','value':13,'selected':true}]},{'code':'priceRange','values':[{'code':'min','name':'','value':0,'selected':true},{'code':'max','name':'','value':10000,'selected':true}]},{'code':'numberOfStop','values':[{'code':'Nonstop','name':'Nonstop','value':'10,297','selected':false},{'code':'1 Stop','name':'1 Stop','value':'12,518','selected':false},{'code':'2 Stops','name':'2 Stops','value':'12,402','selected':false},{'code':'3 Stops','name':'3 Stops','value':'12,518','selected':false},{'code':'4 Stops','name':'4 Stops','value':'8,660','selected':false}]},{'code':'class','values':[{'code':'First','name':'First','value':'10,297','selected':false},{'code':'Business','name':'Business','value':'12,518','selected':false},{'code':'Economy','name':'Economy','value':'12,402','selected':false}]},{'code':'airlines','values':[{'code':'GoAir (2)','name':'GoAir (2)','value':'10,297','selected':false},{'code':'Jet Airways (2)','name':'Jet Airways (2)','value':'12,518','selected':false},{'code':'Spicejet (2)','name':'Spicejet (2)','value':'12,402','selected':false},{'code':'JetKonnect (2)','name':'JetKonnect (2)','value':'12,518','selected':false}]}]";
		//				final ObjectMapper objectMapper = new ObjectMapper();
		//				objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		//				objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		//				objectMapper.setDateFormat(new SimpleDateFormat("dd MMM, yyyy"));
		//				facets = objectMapper.readValue(mockFacetInJson,
		//						objectMapper.getTypeFactory().constructCollectionType(List.class, CnkFacetData.class));
		//			}
		//			// end mock facet
		//
		//			final List<FlightResultData> bestPriceRecommend = new ArrayList();
		//			List<FlightData> flights = new ArrayList();
		//			flights.add(hotel1);
		//			final FlightResultData bestflightResult1 = new FlightResultData();
		//			bestflightResult1.setListOfFlights(flights);
		//			bestflightResult1.setFareCarouselMap(createFareCarouselMap());
		//
		//			final FlightResultData bestflightResult2 = new FlightResultData();
		//			bestflightResult2.setListOfFlights(flights);
		//			bestflightResult2.setFareCarouselMap(createFareCarouselMap());
		//
		//			final FlightResultData bestflightResult3 = new FlightResultData();
		//			bestflightResult3.setListOfFlights(flights);
		//			bestflightResult3.setFareCarouselMap(createFareCarouselMap());
		//			if (ways >= 1)
		//			{
		//				bestPriceRecommend.add(bestflightResult1);
		//			}
		//			if (ways >= 2)
		//			{
		//				bestPriceRecommend.add(bestflightResult2);
		//			}
		//			if (ways >= 3)
		//			{
		//				bestPriceRecommend.add(bestflightResult3);
		//			}
		//
		//			result.setBestPriceRecommend(bestPriceRecommend);
		//			result.setBreadcrumbs(Collections.EMPTY_LIST);
		//			result.setFacets(Collections.EMPTY_LIST);
		//			result.setPageNum(1);
		//
		//			final List<FlightResultData> resultHotels = new ArrayList();
		//			flights = new ArrayList();
		//			final FlightResultData result1 = new FlightResultData();
		//			flights.add(hotel1);
		//			flights.add(hotel2);
		//			flights.add(hotel3);
		//			result1.setListOfFlights(flights);
		//
		//			final FlightResultData result2 = new FlightResultData();
		//			flights = new ArrayList();
		//			flights.add(hotel1);
		//			flights.add(hotel2);
		//			flights.add(hotel3);
		//			result2.setListOfFlights(flights);
		//
		//			final FlightResultData result3 = new FlightResultData();
		//			flights = new ArrayList();
		//			flights.add(hotel1);
		//			flights.add(hotel2);
		//			flights.add(hotel3);
		//			result3.setListOfFlights(flights);
		//
		//			if (ways >= 1)
		//			{
		//				resultHotels.add(result1);
		//			}
		//			if (ways >= 2)
		//			{
		//				resultHotels.add(result2);
		//			}
		//			if (ways >= 3)
		//			{
		//				resultHotels.add(result3);
		//			}
		//
		//			result.setResult(resultHotels);
		//			result.setFacets(facets);
		//			return result;
		//		}
		//		catch (final Exception e)
		//		{
		//			LOG.error(e);
		//			return new CnkProductSearchPageData();
		//		}
	}

	private FlightData buildFlight(final String id)
	{
		try
		{
			final XStream xstream = new XStream();
			final InputStream xml1 = getClass().getResourceAsStream("/commonfacades/test/" + id + ".xml");
			final FlightData result = (FlightData) xstream.fromXML(xml1);
			return result;
		}
		catch (final Exception e)
		{
			LOG.error(e);
			return new FlightData();
		}
	}

	public static void main(final String[] args)
	{
		final XStream xstream = new XStream();
		final String xml = xstream.toXML(setup());
		System.out.println(xml);
		final FlightData hotel = (FlightData) xstream.fromXML(xml);
		final String beanStr = CnkBeanUtil.getString(hotel);

		System.out.println(beanStr);
	}

	private Map createFareCarouselMap()
	{
		final Map result = new HashMap();
		final FareSummaryData data = new FareSummaryData();
		data.setWebPrice("3,000");

		result.put("Sat | Jul 9", data);
		result.put("Sun | Jul 10", data);
		result.put("Mon | Jul 11", data);
		result.put("Tue | Jul 12", data);
		result.put("Wed | Jul 13", data);
		result.put("Thu | Jul 14", data);
		result.put("Fri | Jul 15", data);
		result.put("Sat | Jul 16", data);
		result.put("Sun | Jul 17", data);
		result.put("Mon | Jul 18", data);
		result.put("Tue | Jul 19", data);
		result.put("Wed | Jul 20", data);
		result.put("Thu | Jul 21", data);
		result.put("Fri | Jul 22", data);
		result.put("Sat | Jul 23", data);
		result.put("Sun | Jul 24", data);
		result.put("Mon | Jul 25", data);
		result.put("Tue | Jul 26", data);
		result.put("Wed | Jul 27", data);
		result.put("Thu | Jul 28", data);
		result.put("Fri | Jul 29", data);
		result.put("Sat | Jul 30", data);
		result.put("Sun | Jul 31", data);
		return result;
	}

	private Map<String, FareSummaryData> genearteFareCarouselMap(final Date parmDate, final boolean isStartDate)
	{
		final Map<String, FareSummaryData> result = new LinkedHashMap<String, FareSummaryData>();
		final FareSummaryData data = new FareSummaryData();
		data.setWebPrice("3,000");

		final Calendar calendar = Calendar.getInstance();
		final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		calendar.setTime(parmDate);
		final int startIndex = isStartDate ? -3 : -8;
		calendar.add(Calendar.DAY_OF_YEAR, startIndex);
		for (int i = 0; i < 14; i++)
		{
			calendar.add(Calendar.DAY_OF_YEAR, 1);
			result.put(dateFormatter.format(calendar.getTime()), data);
		}
		return result;
	}


	private static FlightData setup()
	{
		final FlightData result = new FlightData();

		result.setId("id");
		result.setCabinClass("cabinClass");
		result.setDepartureTime(new Date());
		result.setArrivalTime(new Date());
		result.setDuration("");
		result.setFlightNumber("flightNumber");

		final AirlineIATAData airlineIATA = new AirlineIATAData();
		airlineIATA.setAccountingCode("accountingCode");
		airlineIATA.setAirlineName("airlineName");
		airlineIATA.setAirlinePrefix("airlinePrefix");
		result.setAirlineIATA(airlineIATA);

		final FareSummaryData fareSummary = new FareSummaryData();
		fareSummary.setCurrency("currency");
		fareSummary.setListPrice("listPrice");
		fareSummary.setPointEarn("pointEarn");
		fareSummary.setWebPrice("webPrice");
		fareSummary.setType("fly");
		final List<FareSummaryData> fareSummaryList = new ArrayList();
		fareSummaryList.add(fareSummary);
		fareSummaryList.add(fareSummary);
		result.setFareSummary(fareSummaryList);

		final List<FlightDetailData> flightDetails = new ArrayList();
		final FlightDetailData flightDetails1 = new FlightDetailData();
		flightDetails1.setArrivalTime(new Date());
		flightDetails1.setCabinClass("cabinClass");
		flightDetails1.setDepartureTime(new Date());
		flightDetails1.setDuration("");
		AirportData fromSection = new AirportData();
		fromSection.setCity("city");
		fromSection.setTerminal("terminal");
		flightDetails1.setFromSection(fromSection);
		AirportData toSection = new AirportData();
		toSection.setCity("city");
		toSection.setTerminal("terminal");
		flightDetails1.setToSection(toSection);
		FareDetailData fareDetail = new FareDetailData();
		fareDetail.setBaseFare("baseFare");
		fareDetail.setCurrency("currency");
		fareDetail.setFuelSurcharge("fuelSurcharge");
		fareDetail.setJnTax("jnTax");
		fareDetail.setPsgrSvcFee("psgrSvcFee");
		fareDetail.setServiceTax("serviceTax");

		final FlightDetailData flightDetails2 = new FlightDetailData();
		flightDetails2.setArrivalTime(new Date());
		flightDetails2.setCabinClass("cabinClass");
		flightDetails2.setDepartureTime(new Date());
		flightDetails2.setDuration("duration");
		fromSection = new AirportData();
		fromSection.setCity("city");
		fromSection.setTerminal("terminal");
		flightDetails2.setFromSection(fromSection);
		toSection = new AirportData();
		toSection.setCity("city");
		toSection.setTerminal("terminal");
		flightDetails2.setToSection(toSection);
		fareDetail = new FareDetailData();
		fareDetail.setBaseFare("baseFare");
		fareDetail.setCurrency("currency");
		fareDetail.setFuelSurcharge("fuelSurcharge");
		fareDetail.setJnTax("jnTax");
		fareDetail.setPsgrSvcFee("psgrSvcFee");
		fareDetail.setServiceTax("serviceTax");
		fareDetail.setType("fly");

		flightDetails.add(flightDetails1);
		flightDetails.add(flightDetails2);
		result.setFlightDetails(flightDetails);

		final List fareDetailList = new ArrayList();
		fareDetailList.add(fareDetail);
		fareDetailList.add(fareDetail);
		result.setFareDetail(fareDetailList);

		fromSection = new AirportData();
		fromSection.setCity("city");
		fromSection.setTerminal("terminal");
		result.setFromSection(fromSection);

		toSection = new AirportData();
		toSection.setCity("city");
		toSection.setTerminal("terminal");
		result.setToSection(toSection);

		final List<String> services = new ArrayList();
		services.add("20KG baggag included");
		services.add("Meal included");

		result.setServices(services);

		return result;
	}

}
