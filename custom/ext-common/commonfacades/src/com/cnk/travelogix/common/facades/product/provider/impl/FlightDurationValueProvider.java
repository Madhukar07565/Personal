/**
 *
 */
package com.cnk.travelogix.common.facades.product.provider.impl;

import com.cnk.travelogix.common.facades.product.data.flight.FlightData;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i323616
 *
 */
public class FlightDurationValueProvider implements CnkFacetValueProvider<FlightData>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.facades.product.facet.provider.CnkFacetValueProvider#getFacetValue(com.cnk.travelogix.
	 * common.facades.product.data.BaseProductData, java.lang.String)
	 */
	@Override
	public Object getFacetValue(final FlightData bean, final String propertyName)
	{
		// YTODO Auto-generated method stub
		final String[] splitResult = bean.getDuration().split(" ");
		int durationMinute = 0;
		for (final String str : splitResult)
		{
			final String end = str.substring(str.length() - 1);
			final String front = str.substring(0, str.length() - 1);
			switch (end)
			{
				case "d":
					durationMinute += Integer.parseInt(front) * 60 * 24;
					break;
				case "h":
					durationMinute += Integer.parseInt(front) * 60;
					break;
				case "m":
					durationMinute += Integer.parseInt(front);
					break;
			}
		}
		return new Integer(durationMinute);
	}

}
