/**
 *
 */
package com.cnk.travelogix.common.core.order.mock;

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.model.OrderHotelDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.order.mock.HotelValidationResult.RoomResult;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.data.hotel.RoomData;
import com.cnk.travelogix.common.facades.product.data.hotel.RoomDetailData;
import com.thoughtworks.xstream.XStream;


/**
 * @author i313879
 *
 */
public class MockupHotelSearchService implements CnkProductSearchService<HotelData>
{

	private static final Logger LOG = Logger.getLogger(MockupHotelSearchService.class);

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


	@Override
	public HotelData searchProductDetail(final String productId)
	{
		return buildHotel(productId);
	}


	@Override
	public List<HotelData> getProductsDetail(Map<String, HotelSearchParam> searchParameters)
	{
		final CnkProductSearchPageData result = new CnkProductSearchPageData();
		final XStream xstream = new XStream();
		final InputStream xml1 = getClass().getResourceAsStream("/commonfacades/test/hotelData1.xml");
		final HotelData hotel1 = (HotelData) xstream.fromXML(xml1);

		final InputStream xml2 = getClass().getResourceAsStream("/commonfacades/test/hotelData2.xml");
		final HotelData hotel2 = (HotelData) xstream.fromXML(xml2);

		final InputStream xml3 = getClass().getResourceAsStream("/commonfacades/test/hotelData3.xml");
		final HotelData hotel3 = (HotelData) xstream.fromXML(xml3);

		result.setBreadcrumbs(Collections.EMPTY_LIST);
		final List<HotelData> resultHotels = new ArrayList();
		resultHotels.add(hotel1);
		resultHotels.add(hotel2);
		resultHotels.add(hotel3);
		result.setResult(resultHotels);
		return resultHotels;
	}

	/**
	 * @param validate
	 *           input params, hotel list
	 * @return validate result map, the key is room key(hotel id, room id), the value is validation result.
	 */
	@Override
	public Map<OrderHotelDetailInfoModel, HotelValidationResult> getHotelAvailibilityAndPrice(
			List<OrderHotelDetailInfoModel> hotelsParam)
	{
		Map<OrderHotelDetailInfoModel, HotelValidationResult> resultMap = new HashMap<OrderHotelDetailInfoModel, HotelValidationResult>();
		List<String> roomIdlist = new ArrayList<String>();
		
		//convert result to map
		List<HotelData> hotels = getProductsDetail(null);
		Map<String, HotelData> originResultMap = new HashMap<String, HotelData>();
		for (HotelData hotelData : hotels)
		{
				originResultMap.put(hotelData.getId(), hotelData);
		}
		
		//compose result
		for (OrderHotelDetailInfoModel hotel : hotelsParam)
		{
			String id = hotel.getHotelId();
			for (OrderRoomDetailInfoModel room : hotel.getOrderRoomDetailInfo())
			{
				roomIdlist.add(room.getRoomId());
			}

			HotelData hotelData = originResultMap.get(id);
			if (hotelData != null)
			{
				HotelValidationResult r = new HotelValidationResult();
				Map<String, RoomResult> roomMap = new HashMap<String, RoomResult>();
				for (RoomData room : hotelData.getRooms())
				{
					for (RoomDetailData detail : room.getRoomDetails())
					{
						if (roomIdlist.contains(detail.getRoomId()))
						{
							RoomResult rr = r.new RoomResult();
							rr.setNumberOfAvaiableRooms(detail.getNumLeft());
							if (detail.getPrice() != null)
							{
								rr.setPriceInfo(Double.parseDouble(detail.getPrice().getWebPrice()));
							}
							rr.setRoomId(detail.getRoomId());
							roomMap.put(detail.getRoomId(), rr);
						}
					}
				}
				r.setHotelId(hotelData.getId());
				r.setResultMap(roomMap);
				resultMap.put(hotel, r);
			}
			else
			{
				resultMap.put(hotel, null);
			}
		}

//		List<HotelData> hotels = getProductsDetail(null);
//		for (HotelData hotelData : hotels)
//		{
//			OrderHotelDetailInfoModel hotel = paramMap.get(hotelData.getId());
//			if (hotel != null)
//			{
//				HotelValidationResult r = new HotelValidationResult();
//				Map<String, RoomResult> roomMap = new HashMap<String, RoomResult>();
//				for (RoomData room : hotelData.getRooms())
//				{
//					for (RoomDetailData detail : room.getRoomDetails())
//					{
//						if (roomIdlist.contains(detail.getRoomId()))
//						{
//							RoomResult rr = r.new RoomResult();
//							rr.setNumberOfAvaiableRooms(detail.getNumLeft());
//							if (detail.getPrice() != null)
//							{
//								rr.setPriceInfo(Double.parseDouble(detail.getPrice().getWebPrice()));
//							}
//							rr.setRoomId(detail.getRoomId());
//							roomMap.put(detail.getRoomId(), rr);
//						}
//					}
//				}
//				r.setHotelId(hotelData.getId());
//				r.setResultMap(roomMap);
//
//				resultMap.put(hotel, r);
//			}
//		}
		return resultMap;
	}
}
