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
public class WorkflowActionCreateForm
{

	private String name;
	private String desc;
	private String principal;
	private String priority;
	private String fileHandler;
	private String status;
	private String action;
	private String taskType;
	private String taskCategory;
	private String orderCode;
	private String parent;
	private String code;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dueDate;
	private String product;
	private String lockedBy;
	private String companyMarket;
	private String companyName;
	private String clientType;
	private String functionalArea;
	private String clientCategory;
	private String clientSubCategory;
	
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
	 * @return the desc
	 */
	public String getDesc()
	{
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc)
	{
		this.desc = desc;
	}
	/**
	 * @return the principal
	 */
	public String getPrincipal()
	{
		return principal;
	}
	/**
	 * @param principal the principal to set
	 */
	public void setPrincipal(String principal)
	{
		this.principal = principal;
	}
	/**
	 * @return the priority
	 */
	public String getPriority()
	{
		return priority;
	}
	/**
	 * @param priority the priority to set
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
	 * @param fileHandler the fileHandler to set
	 */
	public void setFileHandler(String fileHandler)
	{
		this.fileHandler = fileHandler;
	}
	/**
	 * @return the status
	 */
	public String getStatus()
	{
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status)
	{
		this.status = status;
	}
	/**
	 * @return the action
	 */
	public String getAction()
	{
		return action;
	}
	/**
	 * @param action the action to set
	 */
	public void setAction(String action)
	{
		this.action = action;
	}
	/**
	 * @return the taskType
	 */
	public String getTaskType()
	{
		return taskType;
	}
	/**
	 * @param taskType the taskType to set
	 */
	public void setTaskType(String taskType)
	{
		this.taskType = taskType;
	}
	/**
	 * @return the orderCode
	 */
	public String getOrderCode()
	{
		return orderCode;
	}
	/**
	 * @param orderCode the orderCode to set
	 */
	public void setOrderCode(String orderCode)
	{
		this.orderCode = orderCode;
	}
	/**
	 * @return the parent
	 */
	public String getParent()
	{
		return parent;
	}
	/**
	 * @param parent the parent to set
	 */
	public void setParent(String parent)
	{
		this.parent = parent;
	}
	/**
	 * @return the code
	 */
	public String getCode()
	{
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code)
	{
		this.code = code;
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
	/**
	 * @return the taskCategory
	 */
	public String getTaskCategory()
	{
		return taskCategory;
	}
	/**
	 * @param taskCategory the taskCategory to set
	 */
	public void setTaskCategory(String taskCategory)
	{
		this.taskCategory = taskCategory;
	}
	/**
	 * @return the product
	 */
	public String getProduct()
	{
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(String product)
	{
		this.product = product;
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
	 * @return the clientCategory
	 */
	public String getClientCategory()
	{
		return clientCategory;
	}
	/**
	 * @param clientCategory the clientCategory to set
	 */
	public void setClientCategory(String clientCategory)
	{
		this.clientCategory = clientCategory;
	}
	/**
	 * @return the clientSubCategory
	 */
	public String getClientSubCategory()
	{
		return clientSubCategory;
	}
	/**
	 * @param clientSubCategory the clientSubCategory to set
	 */
	public void setClientSubCategory(String clientSubCategory)
	{
		this.clientSubCategory = clientSubCategory;
	}
	
	
}
