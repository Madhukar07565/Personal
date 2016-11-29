/**
 *
 */
package com.cnk.travelogix.common.facades.product.sort.impl;

import java.util.List;

import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;
import com.cnk.travelogix.common.facades.product.sort.CnkProductSortHelper;


/**
 * @author i313890
 *
 */
public class HotelCnkProductSortHelper implements CnkProductSortHelper<HotelData>
{

	@Override
	public List<HotelData> sortResult(final List<HotelData> result, final CnkFacetValueProvider valueProvider, final boolean isDesc)
	{
		result.sort((r1, r2) -> {
			final Object o1 = valueProvider.getFacetValue(r1, null);
			final Object o2 = valueProvider.getFacetValue(r2, null);
			if (o1 instanceof Comparable && o2 instanceof Comparable)
			{
				return isDesc ? -((Comparable) o1).compareTo(o2) : ((Comparable) o1).compareTo(o2);
			}
			return 0;
		});
		return result;
	}

}
