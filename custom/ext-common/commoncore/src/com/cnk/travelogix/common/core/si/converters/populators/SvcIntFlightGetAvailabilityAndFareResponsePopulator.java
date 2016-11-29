/**
 * 
 */
package com.cnk.travelogix.common.core.si.converters.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.cnk.travelogix.common.core.enums.TripType;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntAirRSItinerary;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightGetAvailabilityAndFareResponse;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchResponse;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.PricedItinerary;


/**
 * @author i317604
 *
 */
public class SvcIntFlightGetAvailabilityAndFareResponsePopulator implements
		Populator<AirLowFareSearchResponseWrapper, SvcIntFlightGetAvailabilityAndFareResponse>
{
	@Autowired(required = true)
	@Qualifier("svcIntItineraryConverter")
	private Converter<PricedItinerary, SvcIntAirRSItinerary> svcIntItineraryConverter;

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final AirLowFareSearchResponseWrapper source, final SvcIntFlightGetAvailabilityAndFareResponse target)
			throws ConversionException
	{
		final List<AirLowFareSearchResponse> airLowFareSearchResponseList = source.getAirLowFareSearchResponses();
		if (CollectionUtils.isNotEmpty(airLowFareSearchResponseList))
		{
			// TODO_SVTINT: Maybe we need to process all responses later, but currently we just need to process the first one.
			final AirLowFareSearchResponse airLowFareSearchResponse = airLowFareSearchResponseList.get(0);
			if (airLowFareSearchResponse != null && airLowFareSearchResponse.getAirLowFareSearchRS() != null)
			{
				final List<SvcIntAirRSItinerary> svcIntItineraryList = createSvcIntItineraryList(airLowFareSearchResponse.getAirLowFareSearchRS()
						.getPricedItineraries());
				target.setItineraryList(svcIntItineraryList);
			}
		}
		
		// TODO_SVTINT
		target.setTripType(TripType.ONEWAY);
	}

	private List<SvcIntAirRSItinerary> createSvcIntItineraryList(final List<PricedItinerary> pricedItineraryList)
	{
		if (CollectionUtils.isNotEmpty(pricedItineraryList))
		{
			final List<SvcIntAirRSItinerary> SvcIntItineraryList = new ArrayList<SvcIntAirRSItinerary>();
			pricedItineraryList.forEach(pricedItinerary -> {
				if (pricedItinerary != null)
				{
					SvcIntItineraryList.add(svcIntItineraryConverter.convert(pricedItinerary));
				}
			});

			return SvcIntItineraryList;
		}

		return null;
	}
}
