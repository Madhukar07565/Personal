package com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data;

import javax.xml.datatype.XMLGregorianCalendar;


public class ZifProdCatBusData
{

	protected String startingFrom;
	protected String travellingTo;
	protected String fromDate;
	protected XMLGregorianCalendar preferredTime;
	protected String noOfAdults;
	protected String noOfChildren;
	protected String noOfInfants;

	/**
	 * Gets the value of the startingFrom property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStartingFrom()
	{
		return startingFrom;
	}

	/**
	 * Sets the value of the startingFrom property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setStartingFrom(final String value)
	{
		this.startingFrom = value;
	}

	/**
	 * Gets the value of the travellingTo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTravellingTo()
	{
		return travellingTo;
	}

	/**
	 * Sets the value of the travellingTo property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setTravellingTo(final String value)
	{
		this.travellingTo = value;
	}

	/**
	 * Gets the value of the fromDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFromDate()
	{
		return fromDate;
	}

	/**
	 * Sets the value of the fromDate property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setFromDate(final String value)
	{
		this.fromDate = value;
	}

	/**
	 * Gets the value of the preferredTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getPreferredTime()
	{
		return preferredTime;
	}

	/**
	 * Sets the value of the preferredTime property.
	 * 
	 * @param value
	 *           allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setPreferredTime(final XMLGregorianCalendar value)
	{
		this.preferredTime = value;
	}

	/**
	 * Gets the value of the noOfAdults property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNoOfAdults()
	{
		return noOfAdults;
	}

	/**
	 * Sets the value of the noOfAdults property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setNoOfAdults(final String value)
	{
		this.noOfAdults = value;
	}

	/**
	 * Gets the value of the noOfChildren property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNoOfChildren()
	{
		return noOfChildren;
	}

	/**
	 * Sets the value of the noOfChildren property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setNoOfChildren(final String value)
	{
		this.noOfChildren = value;
	}

	/**
	 * Gets the value of the noOfInfants property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNoOfInfants()
	{
		return noOfInfants;
	}

	/**
	 * Sets the value of the noOfInfants property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setNoOfInfants(final String value)
	{
		this.noOfInfants = value;
	}

}
