/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet.impl;

import java.util.ArrayList;
import java.util.List;


/**
 * @author i313879
 *
 */
public class TwowayFlightFacetToModelMapper extends FacetToModelMapper
{

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
		entry.setFacetValueProvider(getProviderByName("defaultCnkFacetValueProvider"));
		result.add(entry);

		//departure time
		entry = new FacetToModelEntry(this);
		entry.setFacetCode("returnTime");
		entry.setBeanClass("FlightData");
		entry.setBeanPropertyName("arrivalTime");
		entry.setFacetName("Return Time");
		entry.setFacetHelper(getFacetHelperByName("departureTimeFacetCalculationHelper"));
		entry.setFacetValueProvider(getProviderByName("defaultCnkFacetValueProvider"));
		result.add(entry);

		//Price Range
		entry = new FacetToModelEntry(this);
		entry.setFacetCode("priceRange");
		entry.setBeanClass("FlightData");
		entry.setBeanPropertyName("priceInfo");
		entry.setFacetName("Price Range");
		entry.setPriceValueProvider(getProviderByName("flightPriceValueProvider"));
		entry.setFacetHelper(getFacetHelperByName("priceRangeFacetCalculationHelper"));
		entry.setFacetCodeProvider(getProviderByName("flightPriceValueProvider"));
		result.add(entry);

		//No. of Stops
		entry = new FacetToModelEntry(this);
		entry.setFacetCode("numOfStops");
		entry.setBeanClass("FlightData");
		entry.setBeanPropertyName("numberOfStops");
		entry.setFacetName("No. of Stops");
		entry.setNeedMinPrice(true);
		entry.setFacetValueProvider(getProviderByName("flightPriceValueProvider"));
		result.add(entry);

		//Class
		entry = new FacetToModelEntry(this);
		entry.setFacetCode("class");
		entry.setBeanClass("FlightData");
		entry.setBeanPropertyName("cabinClass");
		entry.setFacetName("Class");
		entry.setNeedMinPrice(true);
		entry.setFacetValueProvider(getProviderByName("flightPriceValueProvider"));
		result.add(entry);

		//AirLine
		entry = new FacetToModelEntry(this);
		entry.setFacetCode("airlines");
		entry.setBeanClass("FlightData");
		entry.setBeanPropertyName("airlineIATA");
		entry.setFacetName("Airlines");
		entry.setNeedAccumulate(true);
		entry.setNeedMinPrice(true);
		entry.setFacetCodeProvider(getProviderByName("flightCompanyValueProvider"));
		entry.setFacetValueProvider(getProviderByName("flightPriceValueProvider"));
		result.add(entry);
		//entry.setFacetHelper(this.getPriceRangeFacetCalculationHelper());




		return result;
	}

}
