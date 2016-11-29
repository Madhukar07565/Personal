/**
 * 
 */
package com.cnk.travelogix.common.core.si.converters.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntAirOptinalPreference;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntAirRQItinerary;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightGetAvailabilityAndFareRequest;
import com.cnk.travelogix.common.core.storefront.svcint.dto.general.SvcIntPersonMatrix;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchRQ;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchRequest;
import com.cnk.travelogix.suppliers.air.data.CabinPref;
import com.cnk.travelogix.suppliers.air.data.FlightTypePref;
import com.cnk.travelogix.suppliers.air.data.OriginDestinationInformation;
import com.cnk.travelogix.suppliers.air.data.PassengerTypeQuantity;
import com.cnk.travelogix.suppliers.air.data.PriceRequestInformation;
import com.cnk.travelogix.suppliers.air.data.TravelPreferences;
import com.cnk.travelogix.suppliers.air.data.TravelerInfoSummary;
import com.cnk.travelogix.suppliers.air.data.TravelerInformation;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;


/**
 * @author i317604
 *
 */
public class AirLowFareSearchRQPopulator implements Populator<SvcIntFlightGetAvailabilityAndFareRequest, AirLowFareSearchRequest>
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final SvcIntFlightGetAvailabilityAndFareRequest source, final AirLowFareSearchRequest target)
			throws ConversionException
	{
		final AirLowFareSearchRQ airLowFareSearchRQ = new AirLowFareSearchRQ();
		
		airLowFareSearchRQ.setOriginDestinationInformation(createOriginDestinationInformationList(source.getItineraryList()));

		airLowFareSearchRQ.setTravelPreferences(createTravelPreferencesList(source));

		airLowFareSearchRQ.setTravelerInfoSummary(createTravelerInfoSummary(source));
		// TODO: Hard Code. (Start)
		airLowFareSearchRQ.setVersion(new BigDecimal("1"));
		airLowFareSearchRQ.setTarget("Test");
		// TODO: Hard Code. (End)
		
		target.setAirLowFareSearchRQ(airLowFareSearchRQ);
	}

	/**
	 * Create OriginDestinationInformation List.
	 * 
	 * @param itineraryList
	 * @return OriginDestinationInformation List
	 */
	private List<OriginDestinationInformation> createOriginDestinationInformationList(final List<SvcIntAirRQItinerary> itineraryList)
	{
		List<OriginDestinationInformation> originDestinationInformations = new ArrayList<>();

		if (CollectionUtils.isNotEmpty(itineraryList))
		{
			itineraryList.forEach(itinerary -> {
				OriginDestinationInformation originDestinationInformation = new OriginDestinationInformation();
				originDestinationInformation.setOriginLocationCode(itinerary.getStartingFrom());
				originDestinationInformation.setDestinationLocationCode(itinerary.getGoingTo());
				originDestinationInformation.setDepartureDateTime(formatDate(itinerary.getDepartureDateTime()));
				originDestinationInformation.setReturnDateTime(formatDate(itinerary.getReturnDateTime()));
				originDestinationInformations.add(originDestinationInformation);
			});
		}

		return originDestinationInformations;
	}
	
	/**
	 * Format date.
	 * 
	 * @param date
	 * @return Formatted date.
	 */
	private String formatDate(final Date date)
	{
		return date == null ? null : new SimpleDateFormat("yyyy-MM-dd").format(date);
	}

	/**
	 * Create TravelPreferences List.
	 * 
	 * @param source
	 * @return TravelPreferences List
	 */
	private List<TravelPreferences> createTravelPreferencesList(final SvcIntFlightGetAvailabilityAndFareRequest source)
	{
		TravelPreferences travelPreference = new TravelPreferences();

		// Create FlightTypePref list.
		travelPreference.setFlightTypePref(createFlightTypePrefList());

		// Set max stops quantity. TODO_SVCINT
		travelPreference.setMaxStopsQuantity(new Integer(calculateMaxStopsQuantity(source.getItineraryList())));

		// Set cabin class. TODO_SVCINT
		travelPreference.setCabinPref(createCabinPrefList(source.getOptinalPreference()));

		List<TravelPreferences> travelPreferences = new ArrayList<>();
		travelPreferences.add(travelPreference);
		return travelPreferences;
	}

	/**
	 * Create FlightTypePref List.
	 * 
	 * @return FlightTypePref List
	 */
	private List<FlightTypePref> createFlightTypePrefList()
	{
		List<FlightTypePref> flightTypePrefs = new ArrayList<>();
		FlightTypePref flightTypePref = new FlightTypePref();
		// TODO: Hard code. (Start)
		//flightTypePref.setFlightType("Direct");
		flightTypePref.setMaxConnections(new BigInteger("10"));
		// TODO: Hard code. (End)
		flightTypePrefs.add(flightTypePref);
		return flightTypePrefs;
	}

	/**
	 * Calculate max stops quantity.
	 * 
	 * @return Max stops quantity
	 */
	private int calculateMaxStopsQuantity(final List<SvcIntAirRQItinerary> itineraryList)
	{
		return CollectionUtils.isEmpty(itineraryList) ? 0 : itineraryList.size() - 1;
	}

	/**
	 * Create cabin preference list.
	 * 
	 * @param optinalPreference
	 * @return Cabin preference list
	 */
	private List<CabinPref> createCabinPrefList(final SvcIntAirOptinalPreference optinalPreference)
	{
		final List<CabinPref> cabinPrefs = new ArrayList<>();
		if (optinalPreference != null && CollectionUtils.isNotEmpty(optinalPreference.getCodeListOfCabinClass()))
		{
			optinalPreference.getCodeListOfCabinClass().forEach(cabinClass -> {
				CabinPref cabinPref = new CabinPref();
				cabinPref.setCabin(cabinClass);
				cabinPrefs.add(cabinPref);
			});
		}

		return cabinPrefs;
	}

	private TravelerInfoSummary createTravelerInfoSummary(final SvcIntFlightGetAvailabilityAndFareRequest source)
	{
		TravelerInfoSummary travelerInfoSummary = new TravelerInfoSummary();

		travelerInfoSummary.setAirTraveler(createTravelerInformationList(source));

		travelerInfoSummary.setPriceRequestInformation(createPriceRequestInformation());

		travelerInfoSummary.setTpaExtensions(createTPAExtensions());

		return travelerInfoSummary;
	}

	private List<TravelerInformation> createTravelerInformationList(final SvcIntFlightGetAvailabilityAndFareRequest source)
	{
		List<TravelerInformation> travelerInformations = new ArrayList<>();
		final SvcIntPersonMatrix travellerMatrix = source.getTravellerMatrix();
		if (travellerMatrix != null)
		{
			travelerInformations.add(createTravelerInformation("ADT", travellerMatrix.getAdultList()));
			travelerInformations.add(createTravelerInformation("CHD", travellerMatrix.getChildList()));
			travelerInformations.add(createTravelerInformation("INF", travellerMatrix.getInfantList()));
		}

		return travelerInformations;
	}

	/**
	 * Create TravelerInformation.
	 * 
	 * @param passengerCode
	 * @param passengerList
	 * @return TravelerInformation
	 */
	private TravelerInformation createTravelerInformation(final String passengerCode, final List<Integer> passengerList)
	{
		TravelerInformation travelerInformation = new TravelerInformation();
		List<PassengerTypeQuantity> passengerTypeQuantitys = new ArrayList<>();
		PassengerTypeQuantity PassengerTypeQuantity = new PassengerTypeQuantity();
		PassengerTypeQuantity.setCode(passengerCode);
		PassengerTypeQuantity.setQuantity(getQuantityFromList(passengerList));
		passengerTypeQuantitys.add(PassengerTypeQuantity);
		travelerInformation.setPassengerTypeQuantity(passengerTypeQuantitys);

		return travelerInformation;
	}

	/**
	 * Get quantity from the given list.
	 * 
	 * @param list
	 * @return quantity
	 */
	private BigInteger getQuantityFromList(final List<Integer> list)
	{
		return new BigInteger(CollectionUtils.isEmpty(list) ? "0" : "" + list.size());
	}

	/**
	 * Create PriceRequestInformation.
	 * 
	 * @return PriceRequestInformation;
	 */
	private PriceRequestInformation createPriceRequestInformation()
	{
		PriceRequestInformation priceRequestInformation = new PriceRequestInformation();
		// TODO: Hard code. (Start)
		priceRequestInformation.setCurrencyCode("INR");
		priceRequestInformation.setPricingSource("Published");
		// TODO: Hard code. (End)
		return priceRequestInformation;
	}

	/**
	 * Create TPAExtensions.
	 * 
	 * @return TPAExtensions
	 */
	private TPAExtensions createTPAExtensions()
	{
		TPAExtensions tpaExtensions = new TPAExtensions();
		Map<String, String> keyValueMap = new HashMap<String, String>();
		// TODO: Hard code. (Start)
		// How many kinds of trip types?
		keyValueMap.put("TripType", "OneWay");
		keyValueMap.put("NearbyDepartures", "false");
		keyValueMap.put("NearbyDestinations", "false");
		// TODO: Hard code. (End)
		tpaExtensions.setKeyValueMap(keyValueMap);

		return tpaExtensions;
	}

}
