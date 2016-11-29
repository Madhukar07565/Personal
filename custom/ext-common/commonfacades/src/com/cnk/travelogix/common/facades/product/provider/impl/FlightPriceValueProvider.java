/**
 *
 */
package com.cnk.travelogix.common.facades.product.provider.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.common.facades.product.data.flight.FareSummaryData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightData;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i313879
 *
 */
public class FlightPriceValueProvider implements CnkFacetValueProvider<FlightData>
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
		final List<FareSummaryData> fareSummaries = bean.getFareSummary();
		double price = Double.MAX_VALUE;
		if (CollectionUtils.isNotEmpty(fareSummaries))
		{
			for (final FareSummaryData value : fareSummaries)
			{
				final double thePrice = Double.parseDouble(value.getWebPrice());
				if (price > thePrice)
				{
					price = thePrice;
				}

			}
		}
		return new Double(price);
	}
}
