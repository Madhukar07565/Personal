/**
 * 
 */
package com.cnk.travelogix.common.core.order.mock.util;

import de.hybris.platform.core.model.order.AbstractOrderEntryModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cnk.travelogix.common.core.enums.ProductTypeEnum;
import com.cnk.travelogix.common.core.model.OrderFlightDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderHotelDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderProductInfoModel;
import com.cnk.travelogix.common.core.model.OrderRoomDetailInfoModel;
import com.cnk.travelogix.common.core.model.OrderTicketInfoModel;

/**
 * @author i323801
 *
 */
public class CnkBookingUtils
{
	public static final String FLIGHT_LIST = "flight";
	public static final String HOTEL_LIST = "hotel";

	public static Map groupOrderEntries(final List<AbstractOrderEntryModel> entries)
	{
		Map<String, List> m = new HashMap();

		List flightList = new ArrayList();
		List hotelList = new ArrayList();
		m.put("hotel", hotelList);
		m.put("flight", flightList);

		for (AbstractOrderEntryModel entry : entries)
		{
			ProductTypeEnum prodType = entry.getProductTypeEnum();
			OrderProductInfoModel prod = entry.getOrderProductInfo();
			//String grpId = prod.getGroupId();
			if (prodType.equals(ProductTypeEnum.ROOM))
			{
				OrderRoomDetailInfoModel room = (OrderRoomDetailInfoModel) prod;
				OrderHotelDetailInfoModel hotel = room.getOrderHotelDetailInfo();
				if (!hotelList.contains(hotel))
				{
					hotelList.add(hotel);
				}
			}
			else if (prodType.equals(ProductTypeEnum.TICKET))
			{
				OrderTicketInfoModel ticket = (OrderTicketInfoModel) prod;
				OrderFlightDetailInfoModel flight = ticket.getOrderFlightDetailInfo();
				if (!flightList.contains(flight))
				{
					flightList.add(flight);
				}
			}
		}

		return m;
	}

}
