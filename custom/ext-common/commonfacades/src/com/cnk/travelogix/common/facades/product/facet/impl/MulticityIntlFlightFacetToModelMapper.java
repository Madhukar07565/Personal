/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet.impl;

import java.util.ArrayList;
import java.util.List;


/**
 * @author i323616
 *
 */
public class MulticityIntlFlightFacetToModelMapper extends FacetToModelMapper
{

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.facades.product.facet.impl.FacetToModelMapper#buildMockupEntrys()
	 */
	@Override
	protected List<FacetToModelEntry> buildMockupEntrys()
	{
		final List<FacetToModelEntry> result = new ArrayList();

		FacetToModelEntry entry = new FacetToModelEntry(this);
		//departure time
		entry.setFacetCode("departureTime");
		entry.setBeanClass("FlightData");
		entry.setBeanPropertyName("departureTime");
		entry.setFacetName("Departure Time");
		entry.setFacetHelper(getFacetHelperByName("departureTimeFacetCalculationHelper"));
		entry.setFacetValueProvider(getProviderByName("multicityIntlFlightDepartureValueProvider"));
		result.add(entry);

		//departure time
		entry = new FacetToModelEntry(this);
		entry.setFacetCode("arrivalTime");
		entry.setBeanClass("FlightData");
		entry.setBeanPropertyName("arrivalTime");
		entry.setFacetName("Arrai Time");
		entry.setFacetHelper(getFacetHelperByName("departureTimeFacetCalculationHelper"));
		entry.setFacetValueProvider(getProviderByName("multicityIntlFlightArrivalValueProvider"));
		result.add(entry);

		//Price Range
		entry = new FacetToModelEntry(this);
		entry.setFacetCode("priceRange");
		entry.setBeanClass("FlightData");
		entry.setBeanPropertyName("priceInfo");
		entry.setFacetName("Price Range");
		entry.setPriceValueProvider(getProviderByName("multicityIntlFlightPriceValueProvider"));
		entry.setFacetHelper(getFacetHelperByName("priceRangeFacetCalculationHelper"));
		entry.setFacetCodeProvider(getProviderByName("multicityIntlFlightPriceValueProvider"));
		result.add(entry);

		//No. of Stops
		entry = new FacetToModelEntry(this);
		entry.setFacetCode("numOfStops");
		entry.setBeanClass("FlightData");
		entry.setNeedMinPrice(true);
		entry.setBeanPropertyName("numberOfStops");
		entry.setFacetName("No. of Stops");

		entry.setFacetValueProvider(getProviderByName("multicityIntlFlightPriceValueProvider"));
		result.add(entry);

		//Class
		entry = new FacetToModelEntry(this);
		entry.setFacetCode("class");
		entry.setBeanClass("FlightData");
		entry.setBeanPropertyName("cabinClass");
		entry.setNeedMinPrice(true);
		entry.setFacetName("Class");
		entry.setFacetValueProvider(getProviderByName("multicityIntlFlightPriceValueProvider"));
		result.add(entry);

		//AirLine
		entry = new FacetToModelEntry(this);
		entry.setFacetCode("airlines");
		entry.setBeanClass("FlightData");
		entry.setBeanPropertyName("airlineIATA");
		entry.setFacetName("Airlines");
		entry.setNeedAccumulate(true);
		entry.setNeedMinPrice(true);
		entry.setFacetCodeProvider(getProviderByName("multicityIntlFlightCompanyValueProvider"));
		entry.setFacetValueProvider(getProviderByName("multicityIntlFlightPriceValueProvider"));
		result.add(entry);
		//entry.setFacetHelper(this.getPriceRangeFacetCalculationHelper());

		return result;
	}

}
