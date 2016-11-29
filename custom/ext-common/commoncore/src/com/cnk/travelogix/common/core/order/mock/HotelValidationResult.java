/**
 * 
 */
package com.cnk.travelogix.common.core.order.mock;

import java.util.Map;


/**
 * @author i323801
 *
 */
public class HotelValidationResult
{
	private String hotelId;
	private Map<String, RoomResult> resultMap;


	public class RoomResult
	{
		private String roomId;
		private double priceInfo;
		private int numberOfAvaiableRooms;

		/**
		 * @return the roomId
		 */
		public String getRoomId()
		{
			return roomId;
		}

		/**
		 * @param roomId
		 *           the roomId to set
		 */
		public void setRoomId(String roomId)
		{
			this.roomId = roomId;
		}

		/**
		 * @return the priceInfo
		 */
		public double getPriceInfo()
		{
			return priceInfo;
		}

		/**
		 * @param priceInfo
		 *           the priceInfo to set
		 */
		public void setPriceInfo(double priceInfo)
		{
			this.priceInfo = priceInfo;
		}

		/**
		 * @return the numberOfAvaiableRooms
		 */
		public int getNumberOfAvaiableRooms()
		{
			return numberOfAvaiableRooms;
		}

		/**
		 * @param numberOfAvaiableRooms
		 *           the numberOfAvaiableRooms to set
		 */
		public void setNumberOfAvaiableRooms(int numberOfAvaiableRooms)
		{
			this.numberOfAvaiableRooms = numberOfAvaiableRooms;
		}

	}

	/**
	 * @return the hotelId
	 */
	public String getHotelId()
	{
		return hotelId;
	}

	/**
	 * @param hotelId
	 *           the hotelId to set
	 */
	public void setHotelId(String hotelId)
	{
		this.hotelId = hotelId;
	}



	/**
	 * @return the resultMap
	 */
	public Map<String, RoomResult> getResultMap()
	{
		return resultMap;
	}

	/**
	 * @param resultMap
	 *           the resultMap to set
	 */
	public void setResultMap(Map<String, RoomResult> resultMap)
	{
		this.resultMap = resultMap;
	}
}
