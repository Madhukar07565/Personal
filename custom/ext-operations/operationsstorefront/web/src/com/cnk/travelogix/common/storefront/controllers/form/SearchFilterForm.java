/**
 * 
 */
package com.cnk.travelogix.common.storefront.controllers.form;

/**
 * Form class for Search view booking page
 */
public class SearchFilterForm
{
	//booking details
	private String bookingRefNumber;
	private String bookingDateFrom;
	private String BookingDateTo;
	private String assignment;
	private String userName;
	private String bookingType;
	private String bookingStatus;
	private String bookingPriority;
	private String financialControlId;
	
	//Product Details
	private String travelDateFrom;
	private String travelDateTo;
	private String supplierCode;
	private String gdsPNR;
	private String airlinePNR;
	private String ticketNumber;
	private String airline;
	
	private String country;
	private String city;
	private String productName;
	private String supplierRefNumber;
	
	
	//Company details
	private String marketUid;
	private String companyUid;
	private String groupCompanyUid;
	private String groupOfCompanyUid;
	private String sbu;
	private String bu;
	//Client&Passenger Details
	private String clientType;
	private String clientCategory;
	private String clientSubCategory;
	
	private String travellerName;
	private String travellerPhoneNumber;
	private String travellerEmailId;

	private String savedQueryName;
	private boolean defaultSearch;


	/**
	 * @return the bookingRefNumber
	 */
	public String getBookingRefNumber()
	{
		return bookingRefNumber;
	}


	/**
	 * @param bookingRefNumber
	 *           the bookingRefNumber to set
	 */
	public void setBookingRefNumber(String bookingRefNumber)
	{
		this.bookingRefNumber = bookingRefNumber;
	}


	/**
	 * @return the bookingDateFrom
	 */
	public String getBookingDateFrom()
	{
		return bookingDateFrom;
	}


	/**
	 * @param bookingDateFrom
	 *           the bookingDateFrom to set
	 */
	public void setBookingDateFrom(String bookingDateFrom)
	{
		this.bookingDateFrom = bookingDateFrom;
	}


	/**
	 * @return the bookingDateTo
	 */
	public String getBookingDateTo()
	{
		return BookingDateTo;
	}


	/**
	 * @param bookingDateTo
	 *           the bookingDateTo to set
	 */
	public void setBookingDateTo(String bookingDateTo)
	{
		BookingDateTo = bookingDateTo;
	}


	/**
	 * @return the assignment
	 */
	public String getAssignment()
	{
		return assignment;
	}


	/**
	 * @param assignment
	 *           the assignment to set
	 */
	public void setAssignment(String assignment)
	{
		this.assignment = assignment;
	}

	/**
	 * @return the userName
	 */
	public String getUserName()
	{
		return userName;
	}


	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}


	/**
	 * @return the bookingType
	 */
	public String getBookingType()
	{
		return bookingType;
	}


	/**
	 * @param bookingType
	 *           the bookingType to set
	 */
	public void setBookingType(String bookingType)
	{
		this.bookingType = bookingType;
	}


	/**
	 * @return the bookingStatus
	 */
	public String getBookingStatus()
	{
		return bookingStatus;
	}


	/**
	 * @param bookingStatus
	 *           the bookingStatus to set
	 */
	public void setBookingStatus(String bookingStatus)
	{
		this.bookingStatus = bookingStatus;
	}


	/**
	 * @return the bookingPriority
	 */
	public String getBookingPriority()
	{
		return bookingPriority;
	}


	/**
	 * @param bookingPriority
	 *           the bookingPriority to set
	 */
	public void setBookingPriority(String bookingPriority)
	{
		this.bookingPriority = bookingPriority;
	}


	/**
	 * @return the financialControlId
	 */
	public String getFinancialControlId()
	{
		return financialControlId;
	}


	/**
	 * @param financialControlId
	 *           the financialControlId to set
	 */
	public void setFinancialControlId(String financialControlId)
	{
		this.financialControlId = financialControlId;
	}


	/**
	 * @return the supplierCode
	 */
	public String getSupplierCode()
	{
		return supplierCode;
	}


	/**
	 * @param supplierCode
	 *           the supplierCode to set
	 */
	public void setSupplierCode(String supplierCode)
	{
		this.supplierCode = supplierCode;
	}


	/**
	 * @return the groupOfCompanyUid
	 */
	public String getGroupOfCompanyUid()
	{
		return groupOfCompanyUid;
	}


	/**
	 * @param groupOfCompanyUid
	 *           the groupOfCompanyUid to set
	 */
	public void setGroupOfCompanyUid(String groupOfCompanyUid)
	{
		this.groupOfCompanyUid = groupOfCompanyUid;
	}


	/**
	 * @return the groupCompanyUid
	 */
	public String getGroupCompanyUid()
	{
		return groupCompanyUid;
	}


	/**
	 * @param groupCompanyUid
	 *           the groupCompanyUid to set
	 */
	public void setGroupCompanyUid(String groupCompanyUid)
	{
		this.groupCompanyUid = groupCompanyUid;
	}


	/**
	 * @return the companyUid
	 */
	public String getCompanyUid()
	{
		return companyUid;
	}


	/**
	 * @param companyUid
	 *           the companyUid to set
	 */
	public void setCompanyUid(String companyUid)
	{
		this.companyUid = companyUid;
	}

	/**
	 * @return the marketUid
	 */
	public String getMarketUid()
	{
		return marketUid;
	}


	/**
	 * @param marketUid the marketUid to set
	 */
	public void setMarketUid(String marketUid)
	{
		this.marketUid = marketUid;
	}


	/**
	 * @return the sbu
	 */
	public String getSbu()
	{
		return sbu;
	}


	/**
	 * @param sbu
	 *           the sbu to set
	 */
	public void setSbu(String sbu)
	{
		this.sbu = sbu;
	}


	/**
	 * @return the bu
	 */
	public String getBu()
	{
		return bu;
	}


	/**
	 * @param bu
	 *           the bu to set
	 */
	public void setBu(String bu)
	{
		this.bu = bu;
	}


	/**
	 * @return the travellerName
	 */
	public String getTravellerName()
	{
		return travellerName;
	}


	/**
	 * @param travellerName
	 *           the travellerName to set
	 */
	public void setTravellerName(String travellerName)
	{
		this.travellerName = travellerName;
	}


	/**
	 * @return the travellerPhoneNumber
	 */
	public String getTravellerPhoneNumber()
	{
		return travellerPhoneNumber;
	}


	/**
	 * @param travellerPhoneNumber
	 *           the travellerPhoneNumber to set
	 */
	public void setTravellerPhoneNumber(String travellerPhoneNumber)
	{
		this.travellerPhoneNumber = travellerPhoneNumber;
	}


	/**
	 * @return the travellerEmailId
	 */
	public String getTravellerEmailId()
	{
		return travellerEmailId;
	}


	/**
	 * @param travellerEmailId
	 *           the travellerEmailId to set
	 */
	public void setTravellerEmailId(String travellerEmailId)
	{
		this.travellerEmailId = travellerEmailId;
	}


	/**
	 * @return the savedQueryName
	 */
	public String getSavedQueryName()
	{
		return savedQueryName;
	}


	/**
	 * @param savedQueryName
	 *           the savedQueryName to set
	 */
	public void setSavedQueryName(String savedQueryName)
	{
		this.savedQueryName = savedQueryName;
	}


	/**
	 * @return the defaultSearch
	 */
	public boolean isDefaultSearch()
	{
		return defaultSearch;
	}


	/**
	 * @param defaultSearch the defaultSearch to set
	 */
	public void setDefaultSearch(boolean defaultSearch)
	{
		this.defaultSearch = defaultSearch;
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
