/**
 *
 */
package com.cnk.travelogix.common.facades.populators.hotelDataPopulator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.List;

import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntAccommodation;
import com.cnk.travelogix.common.core.storefront.svcint.dto.general.SvcIntDistanceOptionItem;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelMarkerData;
import com.cnk.travelogix.common.facades.product.data.hotel.LandmarkData;


public class HotelInAndAroundListPopulator implements Populator<SvcIntAccommodation, HotelData>
{

	@Override
	public void populate(final SvcIntAccommodation source, final HotelData target) throws ConversionException
	{
		final List<SvcIntDistanceOptionItem> inAndAroundSourceList = source.getInAndAroundList();
		final List<LandmarkData> inAndAroundTargetList = target.getInAndAround();
		for (final SvcIntDistanceOptionItem sourceItem : inAndAroundSourceList)
		{
			final LandmarkData landmarkData = new LandmarkData();
			landmarkData.setName(sourceItem.getName());
			landmarkData.setDistance(String.valueOf(sourceItem.getDistance()));
			if (null != sourceItem.getUnit())
			{
				landmarkData.setUnit(sourceItem.getUnit().getName());
			}
			if (null != sourceItem.getMap())
			{
				final HotelMarkerData marker = new HotelMarkerData();
				marker.setLatitude(String.valueOf(sourceItem.getMap().getLatitude()));
				marker.setLongitude(String.valueOf(sourceItem.getMap().getLongitude()));
				landmarkData.setMarker(marker);
			}
			inAndAroundTargetList.add(landmarkData);
		}
	}

}
