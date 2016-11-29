/**
 *
 */
package com.cnk.travelogix.common.facades.product.provider.impl;

import com.cnk.travelogix.common.facades.product.data.flight.FlightResultData;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i323616
 *
 */
public class MulticityIntlFlightArrivalValueProvider implements CnkFacetValueProvider<FlightResultData>
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
		// YTODO Auto-generated method stub
		if (bean.getListOfFlights().isEmpty())
		{
			return null;
		}
		return bean.getListOfFlights().get(bean.getListOfFlights().size() - 1).getArrivalTime();
	}

}
