/**
 * 
 */
package com.cnk.travelogix.common.facades.product.provider.impl;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.common.facades.product.data.hotel.AmentyData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.data.hotel.RoomData;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;

/**
 * @author i313890
 *
 */
public class HotelRoomAmenitiesValueProvider implements CnkFacetValueProvider<HotelData>
{

	@Override
	public Object getFacetValue(HotelData hotelData, String propertyName)
	{
		List<String> amentityList = new ArrayList<String>();
		List<RoomData> rooms = hotelData.getRooms();
		for(RoomData room :rooms){
			List<AmentyData> roomAmenties = room.getRoomAmenities();
			for(AmentyData amenty:roomAmenties){
				amentityList.add(amenty.getName());
			}
		}
		return amentityList;
	}

}
