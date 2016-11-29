/**
 *
 */
package com.cnk.travelogix.common.facades.product.sort.impl;

import java.util.List;

import com.cnk.travelogix.common.facades.product.data.flight.FlightResultData;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;
import com.cnk.travelogix.common.facades.product.sort.CnkProductSortHelper;


/**
 * @author i323616
 *
 */
public class MulticityIntlFlightCnkProductSortHelper implements CnkProductSortHelper<FlightResultData>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.facades.product.sort.CnkProductSortHelper#sortResult(java.util.List,
	 * com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider, boolean)
	 */
	@Override
	public List<FlightResultData> sortResult(final List<FlightResultData> result, final CnkFacetValueProvider valueProvider,
			final boolean isDesc)
	{
		// YTODO Auto-generated method stub
		result.sort((r1, r2) -> {
			final Object o1 = valueProvider.getFacetValue(r1, null);
			final Object o2 = valueProvider.getFacetValue(r2, null);
			if (o1 instanceof Comparable && o2 instanceof Comparable)
			{
				return isDesc ? -((Comparable) o1).compareTo(o2) : ((Comparable) o1).compareTo(o2);
			}
			else
			{
				final int i1 = o1 instanceof Comparable ? 0 : 1;
				final int i2 = o2 instanceof Comparable ? 0 : 1;
				return i1 - i2;
			}
		});
		return result;
	}

}
