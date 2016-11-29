/**
 *
 */
package com.cnk.travelogix.common.facades.product.provider.impl;

import com.cnk.travelogix.common.facades.product.data.flight.AirlineIATAData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightData;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i313879
 *
 */
public class FlightCompanyValueProvider implements CnkFacetValueProvider<FlightData>
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.facet.provider.CnkFacetValueProvider#getFacetValue(com.cnk.travelogix
	 * .common.facades.product.data.BaseProductData, java.lang.String)
	 */
	@Override
	public Object getFacetValue(final FlightData bean, final String propertyName)
	{
		final AirlineIATAData airlineIATA = bean.getAirlineIATA();
		if (airlineIATA != null)
		{
			return airlineIATA.getAirlineName();
		}
		return null;
	}



}
