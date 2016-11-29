package com.cnk.travelogix.common.storefront.forms;

import java.util.Date;

/**
 * @author C5248825
 *
 */
public class ServiceOrderSearchForm
{
	
	private String serviceOrderType;
	private String serviceOrderId;
	private String supplierName;
	private String supplierId;
	private String supplierCurrency;
	private String supplierSettlementStatus;
	private String supplierBillPassingStatus;
	private String productCategory;
	private String productCategorySubType;
	private String productName;
	private String bookingRefNumber;
	private String eticketId;
	private String passengerName;
	private String searchDateType;
	private Date fromDate;
	private Date toDate;

	private boolean assignedToMe;
	private boolean assignedByMe;
	private int pageSize;

	/**
	 * @return the serviceOrderType
	 */
	public String getServiceOrderType()
	{
		return serviceOrderType;
	}
	/**
	 * @param serviceOrderType the serviceOrderType to set
	 */
	public void setServiceOrderType(String serviceOrderType)
	{
		this.serviceOrderType = serviceOrderType;
	}
	/**
	 * @return the serviceOrderId
	 */
	public String getServiceOrderId()
	{
		return serviceOrderId;
	}
	/**
	 * @param serviceOrderId the serviceOrderId to set
	 */
	public void setServiceOrderId(String serviceOrderId)
	{
		this.serviceOrderId = serviceOrderId;
	}
	/**
	 * @return the supplierName
	 */
	public String getSupplierName()
	{
		return supplierName;
	}
	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName)
	{
		this.supplierName = supplierName;
	}
	/**
	 * @return the supplierId
	 */
	public String getSupplierId()
	{
		return supplierId;
	}
	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(String supplierId)
	{
		this.supplierId = supplierId;
	}
	/**
	 * @return the supplierCurrency
	 */
	public String getSupplierCurrency()
	{
		return supplierCurrency;
	}
	/**
	 * @param supplierCurrency the supplierCurrency to set
	 */
	public void setSupplierCurrency(String supplierCurrency)
	{
		this.supplierCurrency = supplierCurrency;
	}
	/**
	 * @return the supplierSettlementStatus
	 */
	public String getSupplierSettlementStatus()
	{
		return supplierSettlementStatus;
	}
	/**
	 * @param supplierSettlementStatus the supplierSettlementStatus to set
	 */
	public void setSupplierSettlementStatus(String supplierSettlementStatus)
	{
		this.supplierSettlementStatus = supplierSettlementStatus;
	}
	/**
	 * @return the supplierBillPassingStatus
	 */
	public String getSupplierBillPassingStatus()
	{
		return supplierBillPassingStatus;
	}
	/**
	 * @param supplierBillPassingStatus the supplierBillPassingStatus to set
	 */
	public void setSupplierBillPassingStatus(String supplierBillPassingStatus)
	{
		this.supplierBillPassingStatus = supplierBillPassingStatus;
	}
	/**
	 * @return the productCategory
	 */
	public String getProductCategory()
	{
		return productCategory;
	}
	/**
	 * @param productCategory the productCategory to set
	 */
	public void setProductCategory(String productCategory)
	{
		this.productCategory = productCategory;
	}
	/**
	 * @return the productCategorySubType
	 */
	public String getProductCategorySubType()
	{
		return productCategorySubType;
	}
	/**
	 * @param productCategorySubType the productCategorySubType to set
	 */
	public void setProductCategorySubType(String productCategorySubType)
	{
		this.productCategorySubType = productCategorySubType;
	}
	/**
	 * @return the productName
	 */
	public String getProductName()
	{
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	/**
	 * @return the bookingRefNumber
	 */
	public String getBookingRefNumber()
	{
		return bookingRefNumber;
	}
	/**
	 * @param bookingRefNumber the bookingRefNumber to set
	 */
	public void setBookingRefNumber(String bookingRefNumber)
	{
		this.bookingRefNumber = bookingRefNumber;
	}
	/**
	 * @return the eticketId
	 */
	public String getEticketId()
	{
		return eticketId;
	}
	/**
	 * @param eticketId the eticketId to set
	 */
	public void setEticketId(String eticketId)
	{
		this.eticketId = eticketId;
	}
	/**
	 * @return the passengerName
	 */
	public String getPassengerName()
	{
		return passengerName;
	}
	/**
	 * @param passengerName the passengerName to set
	 */
	public void setPassengerName(String passengerName)
	{
		this.passengerName = passengerName;
	}
	/**
	 * @return the searchDateType
	 */
	public String getSearchDateType()
	{
		return searchDateType;
	}
	/**
	 * @param searchDateType the searchDateType to set
	 */
	public void setSearchDateType(String searchDateType)
	{
		this.searchDateType = searchDateType;
	}
	/**
	 * @return the fromDate
	 */
	public Date getFromDate()
	{
		return fromDate;
	}
	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(Date fromDate)
	{
		this.fromDate = fromDate;
	}
	/**
	 * @return the toDate
	 */
	public Date getToDate()
	{
		return toDate;
	}
	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(Date toDate)
	{
		this.toDate = toDate;
	}
	/**
	 * @return the assignedToMe
	 */
	public boolean isAssignedToMe()
	{
		return assignedToMe;
	}
	/**
	 * @param assignedToMe the assignedToMe to set
	 */
	public void setAssignedToMe(boolean assignedToMe)
	{
		this.assignedToMe = assignedToMe;
	}
	/**
	 * @return the assignedByMe
	 */
	public boolean isAssignedByMe()
	{
		return assignedByMe;
	}
	/**
	 * @param assignedByMe the assignedByMe to set
	 */
	public void setAssignedByMe(boolean assignedByMe)
	{
		this.assignedByMe = assignedByMe;
	}
	/**
	 * @return the pageSize
	 */
	public int getPageSize()
	{
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}
}
