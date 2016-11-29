/**
 *
 */
package com.cnk.travelogix.common.facades.populators.hotelDataPopulator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntAccoGeneral;
import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntAccommodation;
import com.cnk.travelogix.common.core.storefront.svcint.dto.general.SvcIntOptionItem;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelMarkerData;


/**
 * @author i313890
 *
 */
public class HotelGeneralInfoPopulator implements Populator<SvcIntAccommodation, HotelData>
{

	@Override
	public void populate(final SvcIntAccommodation source, final HotelData target) throws ConversionException
	{
		final SvcIntAccoGeneral general = source.getGeneral();
		if (null != general)
		{
			target.setChain(general.getBrand());
			target.setBrand(general.getName());
			if (null != general.getStarRating())
			{
				target.setHotelRating(general.getStarRating().toString());
			}
			final List<SvcIntOptionItem> travellerTypes = general.getTravellerTypeList();
			final List<String> TravellerTypeTarget = new ArrayList<String>();
			for (final SvcIntOptionItem travellertype : travellerTypes)
			{
				TravellerTypeTarget.add(travellertype.getDescription());
			}
			target.setTravellerType(TravellerTypeTarget);
			target.setOverview(general.getOverview());
			target.setAddress(general.getAddress());
			target.setNoOfRooms(general.getCountOfRooms());
			target.setNoOfFloors(general.getCountOfFloors());
			if (null != general.getConstraint())
			{
				if (null != general.getConstraint().getDefaultCheckInTime())
				{
					target.setCheckInTime(general.getConstraint().getDefaultCheckInTime().toString());
					target.setCheckOutTime(general.getConstraint().getDefaultCheckOutTime().toString());
				}
				target.setPayAtHotel(general.getConstraint().getPayAtHotel());
				target.setFreeCancel(null != general.getConstraint().getFreeCancelUntil() ? Boolean.TRUE : Boolean.FALSE);
				target.setFreeCancelDate(general.getConstraint().getFreeCancelUntil());
			}

			final HotelMarkerData marker = new HotelMarkerData();
			if (null != general.getMap() && null != general.getMap().getLatitude())
			{
				marker.setLatitude(general.getMap().getLatitude().toString());
				marker.setLongitude(general.getMap().getLongitude().toString());
				target.setMarker(marker);
				target.setLocation(general.getMap().getArea().getDescription());
			}
		}
	}
}
