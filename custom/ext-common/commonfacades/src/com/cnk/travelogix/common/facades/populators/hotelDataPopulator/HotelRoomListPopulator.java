/**
 *
 */
package com.cnk.travelogix.common.facades.populators.hotelDataPopulator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntAccoRoomInfo;
import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntAccoRoomOccupancy;
import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntAccommodation;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.data.hotel.RoomData;
import com.cnk.travelogix.common.facades.product.data.hotel.RoomDetailData;
import com.cnk.travelogix.common.facades.product.data.hotel.RoomOccupancyData;


public class HotelRoomListPopulator implements Populator<SvcIntAccommodation, HotelData>
{
	private HotelSingleRoomPopulator hotelSingleRoomPopulator;

	@Override
	public void populate(final SvcIntAccommodation source, final HotelData target) throws ConversionException
	{
		final List<SvcIntAccoRoomInfo> roomList = source.getRoomList();
		final List<RoomData> roomDataList = new ArrayList<RoomData>();
		if (CollectionUtils.isNotEmpty(roomList))
		{
			final Map<String, List<SvcIntAccoRoomInfo>> roomMap = this.convertToRoomMap(roomList);
			for (final Entry<String, List<SvcIntAccoRoomInfo>> entry : roomMap.entrySet())
			{
				final List<SvcIntAccoRoomInfo> svcIntAccoRoomInfoItem = entry.getValue();
				//here we think each room type has the same occupancy,picture,ancillary
				final SvcIntAccoRoomInfo svcIntAccoRoomInfo = svcIntAccoRoomInfoItem.get(0);

				final String svcIntAcctRoomType = svcIntAccoRoomInfo.getRoomCategory();
				final SvcIntAccoRoomOccupancy roomOccupancy = svcIntAccoRoomInfo.getMaxOccupancy();

				final List<RoomDetailData> roomDetailList = new ArrayList<RoomDetailData>();
				populateRoomDetailList(svcIntAccoRoomInfoItem, roomDetailList);

				final RoomOccupancyData roomOccupancyData = new RoomOccupancyData();
				convertToRoomOccupancy(roomOccupancy, roomOccupancyData);

				final RoomData roomData = new RoomData();
				roomData.setRoomType(svcIntAcctRoomType);//room type
				roomData.setRoomDetails(roomDetailList);//room detail list
				roomData.setRoomOccupacy(roomOccupancyData);//room occupancy
				roomDataList.add(roomData);
			}
		}
	}


	protected void populateRoomDetailList(final List<SvcIntAccoRoomInfo> svcIntAccoRoomInfoItem,
			final List<RoomDetailData> roomDetailList)
	{
		for (final SvcIntAccoRoomInfo item : svcIntAccoRoomInfoItem)
		{
			final RoomDetailData roomDetailData = new RoomDetailData();
			hotelSingleRoomPopulator.populate(item, roomDetailData);
			roomDetailList.add(roomDetailData);
		}
	}

	protected void convertToRoomOccupancy(final SvcIntAccoRoomOccupancy source, final RoomOccupancyData target)
	{
		target.setMaxAdultNo(source.getMaxAdultNo());
		target.setMaxChildrenNo(source.getMaxChildrenNo());
		target.setMaxinfantNo(source.getMaxInfantNo());
	}

	protected Map<String, List<SvcIntAccoRoomInfo>> convertToRoomMap(final List<SvcIntAccoRoomInfo> roomList)
	{
		final Map<String, List<SvcIntAccoRoomInfo>> roomMap = new HashMap();
		for (final SvcIntAccoRoomInfo item : roomList)
		{
			final String roomType = item.getRoomCategory();
			if (null != roomMap.get(roomType))
			{
				roomMap.get(roomType).add(item);
			}
			else
			{
				final List<SvcIntAccoRoomInfo> tempList = new ArrayList<SvcIntAccoRoomInfo>();
				tempList.add(item);
				roomMap.put(roomType, tempList);
			}
		}
		return roomMap;
	}





	public HotelSingleRoomPopulator getHotelSingleRoomPopulator()
	{
		return hotelSingleRoomPopulator;
	}

	public void setHotelSingleRoomPopulator(final HotelSingleRoomPopulator hotelSingleRoomPopulator)
	{
		this.hotelSingleRoomPopulator = hotelSingleRoomPopulator;
	}

}
