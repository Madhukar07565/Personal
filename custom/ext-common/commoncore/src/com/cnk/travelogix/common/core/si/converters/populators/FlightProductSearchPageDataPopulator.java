/**
 * 
 */
package com.cnk.travelogix.common.core.si.converters.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntAirRSItinerary;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlight;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightGetAvailabilityAndFareResponse;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntOriginDestinationOption;
import com.cnk.travelogix.common.facades.product.data.FlightProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightResultData;


/**
 * @author i317604
 *
 */
public class FlightProductSearchPageDataPopulator implements
		Populator<SvcIntFlightGetAvailabilityAndFareResponse, FlightProductSearchPageData<FlightResultData>>
{
	@Autowired(required = true)
	@Qualifier("flightDataConverter")
	private Converter<SvcIntFlight, FlightData> flightDataConverter;

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final SvcIntFlightGetAvailabilityAndFareResponse source,
			final FlightProductSearchPageData<FlightResultData> target) throws ConversionException
	{
		// TODO_SVTINT: Only for ONEWAY.
		final List<FlightResultData> flightResultDataList = new ArrayList<FlightResultData>();
		final List<SvcIntAirRSItinerary> itineraryList = source.getItineraryList();
		if (CollectionUtils.isNotEmpty(itineraryList))
		{
			final List<FlightData> flightDataList = new ArrayList<FlightData>();
			itineraryList.forEach(itinerary -> {
				final List<SvcIntOriginDestinationOption> originDestinationOptionList = itinerary.getOriginDestinationOptionList();
				if (CollectionUtils.isNotEmpty(originDestinationOptionList))
				{
					originDestinationOptionList.forEach(svcIntOriginDestinationOption -> {
						final List<SvcIntFlight> flightList = svcIntOriginDestinationOption.getFlightList();
						if (CollectionUtils.isNotEmpty(flightList))
						{
							flightList.forEach(svcIntFlight -> {
								flightDataList.add(flightDataConverter.convert(svcIntFlight));
							});
						}
					});
				}
			});
			
			final FlightResultData flightResultData = new FlightResultData();
			flightResultData.setListOfFlights(flightDataList);
			flightResultData.setFareCarouselMap(genearteFareCarouselMap());
			
			flightResultDataList.add(flightResultData);
		}
		
		target.setResult(flightResultDataList);
		// TODO_SVTINT: Pending price.
		target.setBestPriceRecommend(getBestPriceRecommend(flightResultDataList));
		target.setFlightType("ONEWAY");
	}
	
	private Map<String, FareSummaryData> genearteFareCarouselMap()
	{
		Date startDate = null;
		final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		try
		{
			startDate = dateFormatter.parse("2016-08-17");
		}
		catch (final ParseException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
		}
		
		final Map<String, FareSummaryData> result = new LinkedHashMap<String, FareSummaryData>();
		final FareSummaryData data = new FareSummaryData();
		data.setWebPrice("3,000");

		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
//		final int startIndex = isStartDate ? -3 : -8;
		final int startIndex = -3;
		calendar.add(Calendar.DAY_OF_YEAR, startIndex);
		for (int i = 0; i < 14; i++)
		{
			calendar.add(Calendar.DAY_OF_YEAR, 1);
			result.put(dateFormatter.format(calendar.getTime()), data);
		}
		return result;
	}
	
	/**
	 * Get best price recommend list.
	 * 
	 * @param flightResultDataList
	 * @return best price recommend list
	 */
	private List<FlightResultData> getBestPriceRecommend(final List<FlightResultData> flightResultDataList)
	{
		if (CollectionUtils.isNotEmpty(flightResultDataList))
		{
			final List<FlightResultData> bestPriceRecommend = new ArrayList<FlightResultData>();
			final List<FlightData> listOfFlights = flightResultDataList.get(0).getListOfFlights();
			if (CollectionUtils.isNotEmpty(listOfFlights))
			{
				final FlightResultData flightResultData = new FlightResultData();
				flightResultData.setListOfFlights(listOfFlights.subList(0, 1));
				bestPriceRecommend.add(flightResultData);
			}
			return bestPriceRecommend;
		}
		return null;
	}

}
