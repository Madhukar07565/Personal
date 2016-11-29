/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.common.core.order;

import de.hybris.platform.core.enums.OrderStatus;

import com.cnk.travelogix.common.core.enums.ProductTypeEnum;


/**
 *
 */
public class OrderSearchCondition
{
	private String bookingID;
	private String passengerName;
	private String productName;
	private ProductTypeEnum productType;
	private OrderStatus bookingStatus;

	/**
	 * @return the bookingID
	 */
	public String getBookingID()
	{
		return bookingID;
	}

	/**
	 * @param bookingID
	 *
	 *           the bookingID to set
	 */
	public void setBookingID(final String bookingID)
	{
		this.bookingID = bookingID;
	}

	/**
	 * @return the passengerName
	 */
	public String getPassengerName()
	{
		return passengerName;
	}

	/**
	 * @param passengerName
	 *           the passengerName to set
	 */
	public void setPassengerName(final String passengerName)
	{
		this.passengerName = passengerName;
	}

	/**
	 * @return the productName
	 */
	public String getProductName()
	{
		return productName;
	}

	/**
	 * @param productName
	 *           the productName to set
	 */
	public void setProductName(final String productName)
	{
		this.productName = productName;
	}

	/**
	 * @return the productType
	 */
	public ProductTypeEnum getProductType()
	{
		return productType;
	}

	/**
	 * @param productType
	 *           the productType to set
	 */
	public void setProductType(final ProductTypeEnum productType)
	{
		this.productType = productType;
	}

	/**
	 * @return the bookingStatus
	 */
	public OrderStatus getBookingStatus()
	{
		return bookingStatus;
	}

	/**
	 * @param bookingStatus
	 *           the bookingStatus to set
	 */
	public void setBookingStatus(final OrderStatus bookingStatus)
	{
		this.bookingStatus = bookingStatus;
	}

}
