/**
 * 
 */
package com.cnk.travelogix.common.storefront.forms;

import java.util.Date;
import java.util.List;

import com.cnk.travelogix.operations.data.EnumerationDto;

/**
 * @author C5248530
 *
 */
public class ReceiptSearchForm
{
	private String entityType;
	private String receiptType;
	private String referenceId;
	private Integer receiptNumber;
	private List<EnumerationDto> clientType;
	private List<EnumerationDto> clientCategory;
	private List<EnumerationDto> clientSubCategory;
	private String clientName;
	private String passengerName;
	private List<EnumerationDto> receiptStatus;
	private String dateType;
	private Date fromDate;
	private Date toDate;
	private int pageSize;
	/**
	 * @return the entityType
	 */
	public String getEntityType()
	{
		return entityType;
	}
	/**
	 * @param entityType the entityType to set
	 */
	public void setEntityType(String entityType)
	{
		this.entityType = entityType;
	}
	/**
	 * @return the receiptType
	 */
	public String getReceiptType()
	{
		return receiptType;
	}
	/**
	 * @param receiptType the receiptType to set
	 */
	public void setReceiptType(String receiptType)
	{
		this.receiptType = receiptType;
	}
	/**
	 * @return the referenceId
	 */
	public String getReferenceId()
	{
		return referenceId;
	}
	/**
	 * @param referenceId the referenceId to set
	 */
	public void setReferenceId(String referenceId)
	{
		this.referenceId = referenceId;
	}
	/**
	 * @return the receiptNumber
	 */
	public Integer getReceiptNumber()
	{
		return receiptNumber;
	}
	/**
	 * @param receiptNumber the receiptNumber to set
	 */
	public void setReceiptNumber(Integer receiptNumber)
	{
		this.receiptNumber = receiptNumber;
	}
	/**
	 * @return the clientType
	 */
	public List<EnumerationDto> getClientType()
	{
		return clientType;
	}
	/**
	 * @param clientType the clientType to set
	 */
	public void setClientType(List<EnumerationDto> clientType)
	{
		this.clientType = clientType;
	}
	/**
	 * @return the clientCategory
	 */
	public List<EnumerationDto> getClientCategory()
	{
		return clientCategory;
	}
	/**
	 * @param clientCategory the clientCategory to set
	 */
	public void setClientCategory(List<EnumerationDto> clientCategory)
	{
		this.clientCategory = clientCategory;
	}
	/**
	 * @return the clientSubCategory
	 */
	public List<EnumerationDto> getClientSubCategory()
	{
		return clientSubCategory;
	}
	/**
	 * @param clientSubCategory the clientSubCategory to set
	 */
	public void setClientSubCategory(List<EnumerationDto> clientSubCategory)
	{
		this.clientSubCategory = clientSubCategory;
	}
	/**
	 * @return the clientName
	 */
	public String getClientName()
	{
		return clientName;
	}
	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName)
	{
		this.clientName = clientName;
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
	 * @return the receiptStatus
	 */
	public List<EnumerationDto> getReceiptStatus()
	{
		return receiptStatus;
	}
	/**
	 * @param receiptStatus the receiptStatus to set
	 */
	public void setReceiptStatus(List<EnumerationDto> receiptStatus)
	{
		this.receiptStatus = receiptStatus;
	}
	/**
	 * @return the dateType
	 */
	public String getDateType()
	{
		return dateType;
	}
	/**
	 * @param dateType the dateType to set
	 */
	public void setDateType(String dateType)
	{
		this.dateType = dateType;
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
