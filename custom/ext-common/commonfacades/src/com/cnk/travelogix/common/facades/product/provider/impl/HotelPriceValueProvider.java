/**
 *
 */
package com.cnk.travelogix.common.facades.product.provider.impl;

import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i313879
 *
 */
public class HotelPriceValueProvider implements CnkFacetValueProvider<HotelData>
{
	@Override
	public Object getFacetValue(final HotelData bean, final String propertyName)
	{
		return Double.valueOf(String.valueOf(bean.getShowPrice().getAvgPriceAfterDisCount()));
	}
}
