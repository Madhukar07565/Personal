/**
 *
 */
package com.cnk.travelogix.common.facades.product.provider.impl;

import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i313890
 *
 */
public class HotelStarRatingValueProvider implements CnkFacetValueProvider<HotelData>
{

	@Override
	public Object getFacetValue(final HotelData hotelData, final String propertyName)
	{
		return hotelData.getHotelRating();
	}

}
