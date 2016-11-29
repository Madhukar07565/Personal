/**
 * 
 */
package com.cnk.travelogix.common.core.order.mock;

import java.util.Date;
import java.util.List;


/**
 * @author i323801
 *
 */
public class HotelSearchParam
{
	public class RoomParam
	{
		private String roomId;
		private int numOfAdult;
		private int numOfChild;
		private Date checkinDate;
		private Date checkoutDate;
		/**
		 * @param roomId
		 * @param numOfAdult
		 * @param numOfChild
		 */
		public RoomParam()
		{
			super();
			 
		}

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
		 * @return the numOfAdult
		 */
		public int getNumOfAdult()
		{
			return numOfAdult;
		}

		/**
		 * @param numOfAdult
		 *           the numOfAdult to set
		 */
		public void setNumOfAdult(int numOfAdult)
		{
			this.numOfAdult = numOfAdult;
		}

		/**
		 * @return the numOfChild
		 */
		public int getNumOfChild()
		{
			return numOfChild;
		}

		/**
		 * @param numOfChild
		 *           the numOfChild to set
		 */
		public void setNumOfChild(int numOfChild)
		{
			this.numOfChild = numOfChild;
		}
	}

	class SupplierParam
	{
		private String supplierId;
		private String supplierCredential;

		/**
		 * @return the supplierId
		 */
		public String getSupplierId()
		{
			return supplierId;
		}

		/**
		 * @param supplierId
		 *           the supplierId to set
		 */
		public void setSupplierId(String supplierId)
		{
			this.supplierId = supplierId;
		}

		/**
		 * @return the supplierCredential
		 */
		public String getSupplierCredential()
		{
			return supplierCredential;
		}

		/**
		 * @param supplierCredential
		 *           the supplierCredential to set
		 */
		public void setSupplierCredential(String supplierCredential)
		{
			this.supplierCredential = supplierCredential;
		}
	}

	private String hotelId;
	private Date checkinDate;
	private Date checkoutDate;
	private List<RoomParam> rooms;
	private List<SupplierParam> suppliers;
	private int numberOfRooms;

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
	 * @return the checkinDate
	 */
	public Date getCheckinDate()
	{
		return checkinDate;
	}

	/**
	 * @param checkinDate
	 *           the checkinDate to set
	 */
	public void setCheckinDate(Date checkinDate)
	{
		this.checkinDate = checkinDate;
	}

	/**
	 * @return the checkoutDate
	 */
	public Date getCheckoutDate()
	{
		return checkoutDate;
	}

	/**
	 * @param checkoutDate
	 *           the checkoutDate to set
	 */
	public void setCheckoutDate(Date checkoutDate)
	{
		this.checkoutDate = checkoutDate;
	}

	/**
	 * @return the rooms
	 */
	public List<RoomParam> getRooms()
	{
		return rooms;
	}

	/**
	 * @param rooms
	 *           the rooms to set
	 */
	public void setRooms(List<RoomParam> rooms)
	{
		this.rooms = rooms;
	}

	/**
	 * @return the suppliers
	 */
	public List<SupplierParam> getSuppliers()
	{
		return suppliers;
	}

	/**
	 * @param suppliers
	 *           the suppliers to set
	 */
	public void setSuppliers(List<SupplierParam> suppliers)
	{
		this.suppliers = suppliers;
	}

	/**
	 * @return the numberOfRooms
	 */
	public int getNumberOfRooms()
	{
		return numberOfRooms;
	}

	/**
	 * @param numberOfRooms
	 *           the numberOfRooms to set
	 */
	public void setNumberOfRooms(int numberOfRooms)
	{
		this.numberOfRooms = numberOfRooms;
	}

}
