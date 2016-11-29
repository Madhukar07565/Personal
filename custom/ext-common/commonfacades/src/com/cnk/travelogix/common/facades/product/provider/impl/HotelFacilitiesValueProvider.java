/**
 *
 */
package com.cnk.travelogix.common.facades.product.provider.impl;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.common.facades.product.data.hotel.FacilityData;
import com.cnk.travelogix.common.facades.product.data.hotel.FacilityDetailData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i313890
 *
 */
public class HotelFacilitiesValueProvider implements CnkFacetValueProvider<HotelData>
{

	@Override
	public Object getFacetValue(final HotelData hotelData, final String propertyName)
	{
		final List<String> facilitiesList = new ArrayList<String>();
		final FacilityData facilityDate = hotelData.getFacilities();
		for (final FacilityDetailData facitily : facilityDate.getFacilitydetails())
		{
			facilitiesList.add(facitily.getName());
		}
		return facilitiesList;
	}

}
