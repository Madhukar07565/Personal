/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet.impl;

import org.apache.commons.lang3.StringUtils;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;


/**
 * @author i313890
 *
 */
public class HotelNameCalculationHelper extends DefaultFacetCalculationHelper
{

	@Override
	public boolean process(final BaseProductData singleData, final CnkFacetData facet, final FacetToModelEntry facetEntry)
	{
		final String inputValue = facet.getValue();
		if (StringUtils.isEmpty(inputValue))
		{
			return true;
		}
		if (singleData instanceof HotelData)
		{
			final HotelData hotelData = (HotelData) singleData;
			if (StringUtils.containsIgnoreCase(hotelData.getBrand(), inputValue))
			{
				return true;
			}
		}
		return false;
	}
}
