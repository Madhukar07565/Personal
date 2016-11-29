/**
 *
 */
package com.cnk.travelogix.common.facades.populators.hotelDataPopulator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntAccommodation;
import com.cnk.travelogix.common.core.storefront.svcint.dto.general.SvcIntDistanceOptionItem;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.data.hotel.LandmarkData;


public class HotelLandmarkListPopulator implements Populator<SvcIntAccommodation, HotelData>
{

	@Override
	public void populate(final SvcIntAccommodation source, final HotelData target) throws ConversionException
	{
		final List<SvcIntDistanceOptionItem> landmarkList = source.getLandmarkList();
		final List<LandmarkData> landmarksNearby = new ArrayList<LandmarkData>();
		if (CollectionUtils.isNotEmpty(landmarkList))
		{
			for (final SvcIntDistanceOptionItem svcIntDistanceOptionItem : landmarkList)
			{
				final LandmarkData landmarkData = new LandmarkData();
				landmarkData.setName(svcIntDistanceOptionItem.getName());
				if (null != svcIntDistanceOptionItem.getDistance() && null != svcIntDistanceOptionItem.getUnit())
				{
					final String distence = svcIntDistanceOptionItem.getDistance().toString();
					final String unit = svcIntDistanceOptionItem.getUnit().getName();
					landmarkData.setDistance(distence + " " + unit);
				}
				landmarkData.setDescription(svcIntDistanceOptionItem.getDescription());
				landmarksNearby.add(landmarkData);
			}
			target.setLandmarksNearby(landmarksNearby);
		}
	}

}
