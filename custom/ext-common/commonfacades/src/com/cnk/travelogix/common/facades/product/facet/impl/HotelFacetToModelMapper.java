/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet.impl;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.common.facades.product.facet.CnkFacetCalculationHelper;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;
import com.cnk.travelogix.common.facades.product.util.AchievePropertiesUtil;


/**
 * @author i313879
 *
 */
public class HotelFacetToModelMapper extends FacetToModelMapper
{
	@Override
	protected List<FacetToModelEntry> buildMockupEntrys()
	{
		final List<FacetToModelEntry> result = new ArrayList();
		result.add(buildEntry("brand", "HotelData", "brand", "hotel.facet.hotelName",
				getFacetHelperByName("hotelNameCalculationHelper"), null, null, null));
		result.add(buildEntry("travellerType", "HotelData", "travellerType", "hotel.facet.travellerType", null, null, null, null));
		result.add(buildEntry("starRating", "HotelData", "hotelRating", "hotel.facet.starRating", null, null, null, null));
		result.add(buildEntry("accommodationType", "HotelData", "accommodationType", "hotel.facet.accommodationType", null, null,
				null, null));
		result.add(buildEntry("roomAmenity", "HotelData", "roomAmenities", "hotel.facet.roomAmenities", null,
				getProviderByName("hotelRoomAmenitiesValueProvider"), null, getProviderByName("hotelRoomAmenitiesValueProvider")));
		result.add(buildEntry("budgetRange", "HotelData", "priceInfo", "hotel.facet.budgetRange",
				getFacetHelperByName("budgetRangeFacetCalculationHelper"), null, getProviderByName("hotelPriceValueProvider"), null));
		result.add(buildEntry("location", "HotelData", "location", "hotel.facet.location",
				getFacetHelperByName("hotelLocationCalculationHelper"), null, null, null));
		result.add(buildEntry("hotelFacility", "HotelData", "facilities", "hotel.facet.facilities", null,
				getProviderByName("hotelFacilitiesValueProvider"), null, getProviderByName("hotelFacilitiesValueProvider")));
		result.add(buildEntry("chain", "HotelData", "chain", "hotel.facet.chain", null, null, null, null));
		return result;
	}

	private FacetToModelEntry buildEntry(final String code, final String className, final String property, final String facetName,
			final CnkFacetCalculationHelper helper, final CnkFacetValueProvider facetCodeProvider,
			final CnkFacetValueProvider priveValueProvider, final CnkFacetValueProvider cnkFacetValueProvider)
	{
		final FacetToModelEntry entry = new FacetToModelEntry(this);
		entry.setFacetCode(code);
		entry.setBeanClass(className);
		entry.setBeanPropertyName(property);
		entry.setFacetName(AchievePropertiesUtil.getProperties(facetName));
		entry.setFacetHelper(helper);
		entry.setFacetCodeProvider(facetCodeProvider);
		entry.setPriceValueProvider(priveValueProvider);
		entry.setFacetValueProvider(cnkFacetValueProvider);
		return entry;
	}
}
