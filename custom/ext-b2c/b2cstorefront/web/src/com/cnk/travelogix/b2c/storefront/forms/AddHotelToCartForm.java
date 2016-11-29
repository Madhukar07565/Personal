/**
 * 
 */
package com.cnk.travelogix.b2c.storefront.forms;

import de.hybris.platform.acceleratorstorefrontcommons.forms.AddToCartForm;

import java.util.Date;


/**
 * @author i323801
 *
 */
public class AddHotelToCartForm extends AddToCartForm
{
	private String hotelId;
	private String roomId;
	private String groupId;
	private String roomType;
	private String numberOfAdult;
	private String numberOfChild;
	private Date checkInDate;
	private Date checkOutDate;
	private String numberOfRoom;
	private String numberOfNight;

	private String originalGroupId;
	private Boolean editMode;
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
	 * @return the numberOfAdult
	 */
	public String getNumberOfAdult()
	{
		return numberOfAdult;
	}

	/**
	 * @param numberOfAdult
	 *           the numberOfAdult to set
	 */
	public void setNumberOfAdult(String numberOfAdult)
	{
		this.numberOfAdult = numberOfAdult;
	}

	/**
	 * @return the numberOfChild
	 */
	public String getNumberOfChild()
	{
		return numberOfChild;
	}

	/**
	 * @param numberOfChild
	 *           the numberOfChild to set
	 */
	public void setNumberOfChild(String numberOfChild)
	{
		this.numberOfChild = numberOfChild;
	}


	/**
	 * @return the checkInDate
	 */
	public Date getCheckInDate()
	{
		return checkInDate;
	}

	/**
	 * @param checkInDate
	 *           the checkInDate to set
	 */
	public void setCheckInDate(Date checkInDate)
	{
		this.checkInDate = checkInDate;
	}

	/**
	 * @return the checkOutDate
	 */
	public Date getCheckOutDate()
	{
		return checkOutDate;
	}

	/**
	 * @param checkOutDate
	 *           the checkOutDate to set
	 */
	public void setCheckOutDate(Date checkOutDate)
	{
		this.checkOutDate = checkOutDate;
	}

	/**
	 * @return the numberOfRoom
	 */
	public String getNumberOfRoom()
	{
		return numberOfRoom;
	}

	/**
	 * @param numberOfRoom
	 *           the numberOfRoom to set
	 */
	public void setNumberOfRoom(String numberOfRoom)
	{
		this.numberOfRoom = numberOfRoom;
	}

	/**
	 * @return the numberOfNight
	 */
	public String getNumberOfNight()
	{
		return numberOfNight;
	}

	/**
	 * @param numberOfNight
	 *           the numberOfNight to set
	 */
	public void setNumberOfNight(String numberOfNight)
	{
		this.numberOfNight = numberOfNight;
	}

	/**
	 * @return the groupId
	 */
	public String getGroupId()
	{
		return groupId;
	}

	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(String groupId)
	{
		this.groupId = groupId;
	}

	/**
	 * @return the roomType
	 */
	public String getRoomType()
	{
		return roomType;
	}

	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(String roomType)
	{
		this.roomType = roomType;
	}

	/**
	 * @return the editMode
	 */
	public Boolean getEditMode()
	{
		return editMode;
	}

	/**
	 * @param editMode the editMode to set
	 */
	public void setEditMode(Boolean editMode)
	{
		this.editMode = editMode;
	}

	/**
	 * @return the originalGroupId
	 */
	public String getOriginalGroupId()
	{
		return originalGroupId;
	}

	/**
	 * @param originalGroupId the originalGroupId to set
	 */
	public void setOriginalGroupId(String originalGroupId)
	{
		this.originalGroupId = originalGroupId;
	}
	
}
