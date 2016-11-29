/**
 *
 */
package com.cnk.travelogix.common.core.si.converters.populators;

import de.hybris.platform.converters.Populator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntAirOptinalPreference;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntAirRQItinerary;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightGetAvailabilityAndFareRequest;
import com.cnk.travelogix.common.core.storefront.svcint.dto.general.SvcIntPersonMatrix;
import com.cnk.travelogix.common.facades.product.data.FlightHotelSearchData;
import com.cnk.travelogix.common.facades.product.data.FlightHotelSearchEntryData;
import com.cnk.travelogix.common.facades.product.data.FlightSearchData;


public class SvcIntFlightGetAvailabilityAndFareRequestPopulator implements
		Populator<FlightHotelSearchData, SvcIntFlightGetAvailabilityAndFareRequest>
{
	private static final Logger LOG = Logger.getLogger(SvcIntFlightGetAvailabilityAndFareRequestPopulator.class);

	@Override
	public void populate(final FlightHotelSearchData source, final SvcIntFlightGetAvailabilityAndFareRequest target)
	{
		final List<FlightHotelSearchEntryData> entrys = source.getEntrys();
		if (CollectionUtils.isEmpty(entrys))
		{
			LOG.error("The List<FlightHotelSearchEntryData> is empty!");
			return;
		}

		target.setItineraryList(new ArrayList<SvcIntAirRQItinerary>());
		target.setTravellerMatrix(new SvcIntPersonMatrix());
		target.setOptinalPreference(new SvcIntAirOptinalPreference());
		target.getOptinalPreference().setCodeListOfAirlineCompany(new ArrayList<>());
		target.getOptinalPreference().setCodeListOfCabinClass(new ArrayList<>());

		for (final FlightHotelSearchEntryData flightHotelSearchEntryData : entrys)
		{
			final FlightSearchData departureFlightSearchData = flightHotelSearchEntryData.getDepartureFlightSearchData();
			final FlightSearchData returnFlightSearchData = flightHotelSearchEntryData.getReturnFlightSearchData();
			addSearchItinerary(departureFlightSearchData, source, target);
			if (null != returnFlightSearchData)
			{
				addSearchItinerary(returnFlightSearchData, source, target);
			}
		}

	}

	private void addSearchItinerary(final FlightSearchData sourceEntryFlight, final FlightHotelSearchData source,
								final SvcIntFlightGetAvailabilityAndFareRequest target)
	{
		final List<SvcIntAirRQItinerary> itineraryList = target.getItineraryList();
		final SvcIntPersonMatrix travellerMatrix = target.getTravellerMatrix();
		final SvcIntAirOptinalPreference optionalPreference = target.getOptinalPreference();

		// basic info
		final SvcIntAirRQItinerary svcIntItinerary = new SvcIntAirRQItinerary();
		svcIntItinerary.setStartingFrom(sourceEntryFlight.getFromCity());
		svcIntItinerary.setGoingTo(sourceEntryFlight.getToCity());
		svcIntItinerary.setDepartureDateTime(sourceEntryFlight.getDepartureDate());
		itineraryList.add(svcIntItinerary);

		// traveller info
		travellerMatrix.setAdultList(createAgeList(sourceEntryFlight.getNumberOfAdult()));
		travellerMatrix.setChildList(createAgeList(sourceEntryFlight.getNumberOfChild()));
		travellerMatrix.setInfantList(createAgeList(sourceEntryFlight.getNumberOfInfant()));

		// preference
		optionalPreference.getCodeListOfAirlineCompany().addAll(Arrays.asList(sourceEntryFlight.getSpecificAirline()));
		optionalPreference.getCodeListOfCabinClass().add(sourceEntryFlight.getFlightClass());
		optionalPreference.setDirectFlightOnly(source.getDirectFlightOnly());
		optionalPreference.setRefundableFlightOnly(source.getRefundableFlightOnly());
	}
	
	private List<Integer> createAgeList(final Integer number)
	{
		final List<Integer> ageList = new ArrayList<Integer>();
		if (number != null)
		{
			for (int index = 0; index < number.intValue(); index++)
			{
				ageList.add(new Integer("-1"));
			}
		}
		return ageList;
	}

}
