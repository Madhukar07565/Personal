/**
 *
 */
package com.cnk.travelogix.common.facades.product.provider.impl;

import com.cnk.travelogix.common.facades.product.data.flight.FlightData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightResultData;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i323616
 *
 */
public class MulticityIntlFlightPriceValueProvider implements CnkFacetValueProvider<FlightResultData>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider#getFacetValue(com.cnk.travelogix.common.
	 * facades.product.data.BaseProductData, java.lang.String)
	 */
	@Override
	public Object getFacetValue(final FlightResultData bean, final String propertyName)
	{
		if (bean.getListOfFlights().isEmpty())
		{
			return null;
		}
		final FlightPriceValueProvider priceProvider = new FlightPriceValueProvider();
		double priceSum = 0;
		for (final FlightData flightData : bean.getListOfFlights())
		{
			priceSum += ((Double) priceProvider.getFacetValue(flightData, null)).doubleValue();
		}
		return new Double(priceSum);
	}

}
