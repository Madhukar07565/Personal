/**
 * 
 */
package com.cnk.travelogix.common.storefront.forms;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author I319924
 *
 */
public class WorkflowActionSearchForm
{
	
	private String name;
	private String priority;
	private String fileHandler;
	private String clientType;
	private String productName;
	private String functionalArea;
	private String companyMarket;
	private String companyName;
	private boolean assignedToMe;
	private boolean assignedByMe;
	private int pageSize;
	private String lockedBy;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dueDate;

	/**
	 * @return the priority
	 */
	public String getPriority()
	{
		return priority;
	}

	/**
	 * @param priority
	 *           the priority to set
	 */
	public void setPriority(String priority)
	{
		this.priority = priority;
	}

	/**
	 * @return the fileHandler
	 */
	public String getFileHandler()
	{
		return fileHandler;
	}

	/**
	 * @param fileHandler
	 *           the fileHandler to set
	 */
	public void setFileHandler(String fileHandler)
	{
		this.fileHandler = fileHandler;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the clientType
	 */
	public String getClientType()
	{
		return clientType;
	}

	/**
	 * @param clientType the clientType to set
	 */
	public void setClientType(String clientType)
	{
		this.clientType = clientType;
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
	 * @return the functionalArea
	 */
	public String getFunctionalArea()
	{
		return functionalArea;
	}

	/**
	 * @param functionalArea the functionalArea to set
	 */
	public void setFunctionalArea(String functionalArea)
	{
		this.functionalArea = functionalArea;
	}

	/**
	 * @return the companyMarket
	 */
	public String getCompanyMarket()
	{
		return companyMarket;
	}

	/**
	 * @param companyMarket the companyMarket to set
	 */
	public void setCompanyMarket(String companyMarket)
	{
		this.companyMarket = companyMarket;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName()
	{
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
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

	/**
	 * @return the lockedBy
	 */
	public String getLockedBy()
	{
		return lockedBy;
	}

	/**
	 * @param lockedBy the lockedBy to set
	 */
	public void setLockedBy(String lockedBy)
	{
		this.lockedBy = lockedBy;
	}

	/**
	 * @return the dueDate
	 */
	public Date getDueDate()
	{
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate)
	{
		this.dueDate = dueDate;
	}
}
