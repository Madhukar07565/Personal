/**
 *
 */
package com.cnk.travelogix.b2c.storefront.forms;

import java.util.List;


/**
 * @author i323801
 *
 */
public class HotelTraveler
{
	private String orderEntryNumber;
	private String roomId;
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String travelerTitle;
	private String mobileNumber;
	private String email;
	private String nationality;

	private Boolean agreeTerms;
	private Boolean insurance;
	private Boolean partPayment;
	private Boolean timeLimit;

	private List<HotelNonPrimaryTraveller> nonPrimaryTravellers;
	private String specialrequest;

	/**
	 * @return the orderEntryNumber
	 */
	public String getOrderEntryNumber()
	{
		return orderEntryNumber;
	}

	/**
	 * @param orderEntryNumber
	 *           the orderEntryNumber to set
	 */
	public void setOrderEntryNumber(String orderEntryNumber)
	{
		this.orderEntryNumber = orderEntryNumber;
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
	 * @return the timeLimit
	 */
	public Boolean getTimeLimit()
	{
		return timeLimit;
	}

	/**
	 * @param timeLimit
	 *           the timeLimit to set
	 */
	public void setTimeLimit(Boolean timeLimit)
	{
		this.timeLimit = timeLimit;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @param firstName
	 *           the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @param lastName
	 *           the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/**
	 * @return the travelerTitle
	 */
	public String getTravelerTitle()
	{
		return travelerTitle;
	}

	/**
	 * @param travelerTitle
	 *           the travelerTitle to set
	 */
	public void setTravelerTitle(String travelerTitle)
	{
		this.travelerTitle = travelerTitle;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber()
	{
		return mobileNumber;
	}

	/**
	 * @param mobileNumber
	 *           the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * @param email
	 *           the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality()
	{
		return nationality;
	}

	/**
	 * @param nationality
	 *           the nationality to set
	 */
	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}

	/**
	 * @return the nonPrimaryTravellers
	 */
	public List<HotelNonPrimaryTraveller> getNonPrimaryTravellers()
	{
		return nonPrimaryTravellers;
	}

	/**
	 * @param nonPrimaryTravellers
	 *           the nonPrimaryTravellers to set
	 */
	public void setNonPrimaryTravellers(List<HotelNonPrimaryTraveller> nonPrimaryTravellers)
	{
		this.nonPrimaryTravellers = nonPrimaryTravellers;
	}

	/**
	 * @return the specialrequest
	 */
	public String getSpecialrequest()
	{
		return specialrequest;
	}

	/**
	 * @param specialrequest
	 *           the specialrequest to set
	 */
	public void setSpecialrequest(String specialrequest)
	{
		this.specialrequest = specialrequest;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName()
	{
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}

	/**
	 * @return the agreeTerms
	 */
	public Boolean getAgreeTerms()
	{
		return agreeTerms;
	}

	/**
	 * @param agreeTerms the agreeTerms to set
	 */
	public void setAgreeTerms(Boolean agreeTerms)
	{
		this.agreeTerms = agreeTerms;
	}

	/**
	 * @return the insurance
	 */
	public Boolean getInsurance()
	{
		return insurance;
	}

	/**
	 * @param insurance the insurance to set
	 */
	public void setInsurance(Boolean insurance)
	{
		this.insurance = insurance;
	}

	/**
	 * @return the partPayment
	 */
	public Boolean getPartPayment()
	{
		return partPayment;
	}

	/**
	 * @param partPayment the partPayment to set
	 */
	public void setPartPayment(Boolean partPayment)
	{
		this.partPayment = partPayment;
	}

	 

}
