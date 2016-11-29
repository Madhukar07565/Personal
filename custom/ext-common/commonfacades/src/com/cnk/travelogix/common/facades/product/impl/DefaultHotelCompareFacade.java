/**
 *
 */
package com.cnk.travelogix.common.facades.product.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.common.facades.product.CnkProductCompareFacade;
import com.cnk.travelogix.common.facades.product.data.hotel.AmentyData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelCompareData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.data.hotel.LandmarkData;
import com.cnk.travelogix.common.facades.product.data.hotel.RoomData;
import com.thoughtworks.xstream.XStream;


/**
 * @author i313890
 *
 */
public class DefaultHotelCompareFacade implements CnkProductCompareFacade<HotelCompareData>
{

	@Override
	public List<HotelCompareData> searchProductByIds(final String... productId)
	{
		final List<HotelCompareData> hotelList = new ArrayList<HotelCompareData>();
		for (final String hotelId : productId)
		{

			hotelList.add(this.convertToCompareHotelData(this.buildHotel(hotelId)));
		}
		return hotelList;
	}


	private HotelCompareData convertToCompareHotelData(final HotelData hotelData)
	{
		final HotelCompareData hotelCompareData = new HotelCompareData();
		hotelCompareData.setId(hotelData.getId());
		hotelCompareData.setPropertyName(hotelData.getBrand());
		hotelCompareData.setPrice(hotelData.getShowPrice().getAvgPriceAfterDisCount());
		hotelCompareData.setPicture(hotelData.getHotelPictureUrl().get(0));
		hotelCompareData.setStarRating(Integer.valueOf(hotelData.getHotelRating()));
		hotelCompareData.setLocation(hotelData.getLocation());
		hotelCompareData.setTripAdvisorRate(Integer.valueOf(5));
		hotelCompareData.setPrice(Double.valueOf(3333));
		hotelCompareData.setCheckInTime(hotelData.getCheckInTime());
		hotelCompareData.setCheckOutTime(hotelData.getCheckOutTime());
		hotelCompareData.setNoOfRooms(hotelData.getNoOfRooms());
		hotelCompareData.setNoOfFloors(hotelData.getNoOfFloors());
		this.convertLandMark(hotelData, hotelCompareData);
		this.convertAmenity(hotelData, hotelCompareData);
		return hotelCompareData;
	}


	private void convertLandMark(final HotelData source, final HotelCompareData target)
	{
		final List<LandmarkData> landMarks = source.getLandmarksNearby();
		for (final LandmarkData landmark : landMarks)
		{
			if (landmark.getName().contains("Airport"))
			{
				target.setAirportDistance(landmark.getDistance());
				break;
			}
			if (landmark.getName().contains("center"))
			{
				target.setCityCenterDistance(landmark.getDistance());
				break;
			}
			if (landmark.getName().contains("station"))
			{
				target.setLocationStationDistance(landmark.getDistance());
				break;
			}
			if (landmark.getName().contains("railway"))
			{
				target.setRailwayStationDistance(landmark.getDistance());
				break;
			}
		}
	}

	private void convertAmenity(final HotelData source, final HotelCompareData target)
	{
		final List<RoomData> rooms = source.getRooms();
		for (final RoomData room : rooms)
		{
			final List<AmentyData> amenities = room.getRoomAmenities();
			for (final AmentyData amenty : amenities)
			{
				if (amenty.getName().contains("air"))
				{
					target.setAirCondition(Boolean.TRUE);
				}
				if (amenty.getName().contains("bar"))
				{
					target.setBar(Boolean.TRUE);
				}
				if (amenty.getName().contains("wifi"))
				{
					target.setFreewifi(Boolean.TRUE);
				}
				if (amenty.getName().contains("24"))
				{
					target.setCheckIn(Boolean.TRUE);
				}
				if (amenty.getName().contains("gym"))
				{
					target.setGym(Boolean.TRUE);
				}
				if (amenty.getName().contains("pool"))
				{
					target.setPool(Boolean.TRUE);
				}
				if (amenty.getName().contains("restrant"))
				{
					target.setRestaurant(Boolean.TRUE);
				}
				if (amenty.getName().contains("service"))
				{
					target.setRommService(Boolean.TRUE);
				}
				if (amenty.getName().contains("laundry"))
				{
					target.setLaundryService(Boolean.TRUE);
				}
				if (amenty.getName().contains("business"))
				{
					target.setBusinessCenter(Boolean.TRUE);
				}
				if (amenty.getName().contains("coffee"))
				{
					target.setCoffeeShop(Boolean.TRUE);
				}
			}
		}
	}

	private HotelData buildHotel(final String productId)
	{
		InputStream xml1 = null;
		try
		{
			//TODO: remove the hardcord for demo code Start
			if (productId.equals("hotel_001"))
			{
				xml1 = getClass().getResourceAsStream("/commonfacades/test/hotelData1.xml");
			}
			else if (productId.equals("hotel_002"))
			{
				xml1 = getClass().getResourceAsStream("/commonfacades/test/hotelData2.xml");
			}
			else if (productId.equals("hotel_003"))
			{
				xml1 = getClass().getResourceAsStream("/commonfacades/test/hotelData3.xml");
			}
			// remove the hardcord for demo code End

			final XStream xstream = new XStream();

			final HotelData result = (HotelData) xstream.fromXML(xml1);
			return result;
		}
		catch (final Exception e)
		{
			return new HotelData();
		}
	}
}
