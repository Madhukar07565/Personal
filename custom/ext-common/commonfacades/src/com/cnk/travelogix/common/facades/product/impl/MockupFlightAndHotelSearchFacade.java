/**
 *
 */
package com.cnk.travelogix.common.facades.product.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;

import com.cnk.travelogix.common.facades.product.CnkProductSearchFacade;
import com.cnk.travelogix.common.facades.product.data.BasePageableSearchData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.FlightHotelSearchData;
import com.cnk.travelogix.common.facades.product.data.FlightHotelSearchEntryData;
import com.cnk.travelogix.common.facades.product.data.combination.FlightAndHotelData;
import com.cnk.travelogix.common.facades.product.data.combination.FlightAndHotelMulticityData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.util.CnkBeanUtil;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;


/**
 * @author i313879
 *
 */
public class MockupFlightAndHotelSearchFacade implements CnkProductSearchFacade<FlightAndHotelData>
{

	private static final Logger LOG = Logger.getLogger(MockupFlightAndHotelSearchFacade.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.CnkProductSearchFacade#searchProduct(com.cnk.travelogix.common.facades
	 * .product.data.BasePageableSearchData)
	 */
	@Override
	public CnkProductSearchPageData searchProduct(final BasePageableSearchData searchParameters)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug(CnkBeanUtil.getString(searchParameters));
		}
		return buildMockupSearchPageData(searchParameters);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.CnkProductSearchFacade#searchProductDetail(com.cnk.travelogix.common
	 * .facades.product.data.BasePageableSearchData)
	 */
	@Override
	public FlightAndHotelData searchProductDetail(final BasePageableSearchData searchParameters)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug(CnkBeanUtil.getString(searchParameters));
		}
		return buildFlightAndHotel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cnk.travelogix.common.facades.product.CnkProductSearchFacade#searchProductDetail(java.lang.String)
	 */
	@Override
	public FlightAndHotelData searchProductDetail(final String productId)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug(CnkBeanUtil.getString(productId));
		}
		return buildFlightAndHotel();
	}


	private CnkProductSearchPageData buildMockupSearchPageData(final BasePageableSearchData searchParameters)
	{
		try
		{
			boolean isMultiCity = false;
			//List<CnkFacetData> facets = null;
			if (searchParameters instanceof FlightHotelSearchData)
			{
				if (null != ((FlightHotelSearchData) searchParameters).getEntrys()
						&& ((FlightHotelSearchData) searchParameters).getEntrys().size() > 1)
				{
					isMultiCity = true;
				}
				//facets = ((FlightHotelSearchData) searchParameters).getFacets();
			}

			final XStream xstream = new XStream();
			final String dateFormat = "yyyy-MM-dd";
			final String[] acceptableFormats =
			{ "HH:mm:ss.S z" };
			xstream.registerConverter(new DateConverter(dateFormat, acceptableFormats));

			final InputStream xml1 = getClass().getResourceAsStream("/commonfacades/test/flightandhotel1.xml");
			final FlightAndHotelData hotel1 = (FlightAndHotelData) xstream.fromXML(xml1);

			final InputStream xml2 = getClass().getResourceAsStream("/commonfacades/test/flightandhotel1.xml");
			final FlightAndHotelData hotel2 = (FlightAndHotelData) xstream.fromXML(xml2);

			final InputStream xml3 = getClass().getResourceAsStream("/commonfacades/test/flightandhotel1.xml");
			final FlightAndHotelData hotel3 = (FlightAndHotelData) xstream.fromXML(xml3);

			// start mock facet
			//			if (facets == null)
			//			{
			//				final String mockFacetInJson = "[{'code':'priceRange','values':[{'code':'min','name':'','value':0,'selected':true},{'code':'max','name':'','value':10000,'selected':true}]},{'code':'startRating','values':[{'code':'5','name':'5','value':'5','selected':false},{'code':'4','name':'4','value':'4','selected':false},{'code':'3','name':'3','value':'3','selected':false},{'code':'2','name':'2','value':'2','selected':false},{'code':'1','name':'1','value':'1','selected':false}]},{'code':'hotelName','values':[{'code':'hotelName','name':'','value':'','selected':false}]},{'code':'location','values':[{'code':'default','name':'','value':'','selected':false},{'code':'South Delhi','name':'South Delhi','value':'South Delhi','selected':false},{'code':'Delhi Airport','name':'Delhi Airport','value':'Delhi Airport','selected':false},{'code':'Gurgaon','name':'Gurgaon','value':'Gurgaon','selected':false},{'code':'Paharganj','name':'Paharganj','value':'Paharganj','selected':false},{'code':'N. Delhi Railway Station','name':'N. Delhi Railway Station','value':'N. Delhi Railway Station','selected':false},{'code':'Mahipalpur','name':'Mahipalpur','value':'Mahipalpur','selected':false}]},{'code':'hotelFacilities','name':'Hotel Facilities','values':[{'code':'Coffee maker','name':'Coffee maker','value':'Coffee maker','selected':false},{'code':'Television','name':'Television','value':'Television','selected':false},{'code':'Bath tub','name':'Bath tub','value':'Bath tub','selected':false},{'code':'Mini bar','name':'Mini bar','value':'Mini bar','selected':false}]},{'code':'roomAmenities','name':'Room Amenities','values':[{'code':'High Speed Internet','name':'High Speed Internet','value':'High Speed Internet','selected':false},{'code':'Air Conditioning','name':'Air Conditioning','value':'Air Conditioning','selected':false},{'code':'Swimming Pool','name':'Swimming Pool','value':'Swimming Pool','selected':false},{'code':'Childcare','name':'Childcare','value':'Childcare','selected':false}]},{'code':'propertyType','name':'Property Type','values':[{'code':'Bed and Breakfast','name':'Bed and Breakfast','value':'Bed and Breakfast','selected':false},{'code':'Guest House','name':'Guest House','value':'Guest House','selected':false},{'code':'Heritage Hotel','name':'Heritage Hotel','value':'Heritage Hotel','selected':false},{'code':'Home Stay','name':'Home Stay','value':'Home Stay','selected':false},{'code':'Resort','name':'Resort','value':'Resort','selected':false},{'code':'Serviced Apartments','name':'Serviced Apartments','value':'Serviced Apartments','selected':false}]},{'code':'chain','name':'Chain','values':[{'code':'Taj hotels','name':'Taj hotels','value':'Taj hotels','selected':false},{'code':'Leela Hotels','name':'Leela Hotels','value':'Leela Hotels','selected':false},{'code':'Ginger hotels','name':'Ginger hotels','value':'Ginger hotels','selected':false}]}]";
			//				final ObjectMapper objectMapper = new ObjectMapper();
			//				objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
			//				objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
			//				objectMapper.setDateFormat(new SimpleDateFormat("dd MMM, yyyy"));
			//				facets = objectMapper.readValue(mockFacetInJson,
			//						objectMapper.getTypeFactory().constructCollectionType(List.class, CnkFacetData.class));
			//			}
			// end mock facet

			if (isMultiCity)
			{
				final CnkProductSearchPageData<FlightAndHotelMulticityData> multicityResult = new CnkProductSearchPageData();
				final List<FlightAndHotelMulticityData> bestPriceRecommend = new ArrayList();
				final List<FlightAndHotelMulticityData> resultHotels = new ArrayList();
				multicityResult.setBestPriceRecommend(bestPriceRecommend);
				multicityResult.setResult(resultHotels);

				final List<FlightHotelSearchEntryData> entrys = ((FlightHotelSearchData) searchParameters).getEntrys();
				for (final Iterator iterator = entrys.iterator(); iterator.hasNext(); iterator.next())
				{
					final FlightAndHotelMulticityData item = new FlightAndHotelMulticityData();
					final List<FlightAndHotelData> listOfFlightHotel = new ArrayList<FlightAndHotelData>();
					final int randomSize = 1 + new Random().nextInt(8);
					Thread.sleep(1);
					for (int i = 0; i < randomSize; i++)
					{
						listOfFlightHotel.add(hotel1);
					}
					item.setListOfFlightHotel(listOfFlightHotel);
					resultHotels.add(item);
				}
				final FlightAndHotelMulticityData bestRecommendItem = new FlightAndHotelMulticityData();
				bestRecommendItem.setListOfFlightHotel(new ArrayList());
				multicityResult.getBestPriceRecommend().add(bestRecommendItem);
				for (int i = 0; i < multicityResult.getResult().size(); i++)
				{
					bestRecommendItem.getListOfFlightHotel().add(multicityResult.getResult().get(i).getListOfFlightHotel().get(0));
				}
				//multicityResult.setFacets(facets);
				return multicityResult;
			}
			else
			{
				final CnkProductSearchPageData<FlightAndHotelData> singlecityResult = new CnkProductSearchPageData();
				final List<FlightAndHotelData> bestPriceRecommend = new ArrayList();
				final List<FlightAndHotelData> resultHotels = new ArrayList();
				singlecityResult.setBestPriceRecommend(bestPriceRecommend);
				singlecityResult.setResult(resultHotels);
				singlecityResult.setBreadcrumbs(Collections.EMPTY_LIST);
				singlecityResult.setFacets(Collections.EMPTY_LIST);
				singlecityResult.setPageNum(1);

				bestPriceRecommend.add(hotel1);
				bestPriceRecommend.add(hotel2);
				bestPriceRecommend.add(hotel3);
				bestPriceRecommend.add(hotel1);
				bestPriceRecommend.add(hotel2);
				bestPriceRecommend.add(hotel3);

				resultHotels.add(hotel1);
				resultHotels.add(hotel2);
				resultHotels.add(hotel3);
				resultHotels.add(hotel1);
				resultHotels.add(hotel2);
				resultHotels.add(hotel3);
				resultHotels.add(hotel1);
				resultHotels.add(hotel2);
				resultHotels.add(hotel3);
				resultHotels.add(hotel1);
				resultHotels.add(hotel2);
				resultHotels.add(hotel3);
				resultHotels.add(hotel1);
				resultHotels.add(hotel2);
				resultHotels.add(hotel3);
				resultHotels.add(hotel1);
				resultHotels.add(hotel2);
				resultHotels.add(hotel3);
				resultHotels.add(hotel1);
				resultHotels.add(hotel2);
				resultHotels.add(hotel3);
				resultHotels.add(hotel1);
				resultHotels.add(hotel2);
				resultHotels.add(hotel3);
				resultHotels.add(hotel1);
				resultHotels.add(hotel2);
				resultHotels.add(hotel3);
				resultHotels.add(hotel1);
				resultHotels.add(hotel2);
				resultHotels.add(hotel3);
				//singlecityResult.setFacets(facets);
				return singlecityResult;
			}
		}
		catch (final Exception e)
		{
			e.printStackTrace();
			return new CnkProductSearchPageData();
		}
	}

	private FlightAndHotelData buildFlightAndHotel()
	{
		try
		{
			final XStream xstream = new XStream();
			final InputStream xml1 = getClass().getResourceAsStream("/commonfacades/test/flightandhotel3.xml");
			final FlightAndHotelData result = (FlightAndHotelData) xstream.fromXML(xml1);
			return result;
		}
		catch (final Exception e)
		{
			return new FlightAndHotelData();
		}
	}

	public static void main(final String[] args)
	{
		final XStream xstream = new XStream();
		final String xml = xstream.toXML(setup());
		System.out.println(xml);
		final FlightAndHotelData hotel = (FlightAndHotelData) xstream.fromXML(xml);
		final String beanStr = CnkBeanUtil.getString(hotel);

		System.out.println(beanStr);
	}

	private static FlightAndHotelData setup()
	{
		final FlightAndHotelData result = new FlightAndHotelData();
		result.setId("id");
		result.setDepartureFlight(new FlightData());
		result.setHotel(new HotelData());

		return result;
	}
}
