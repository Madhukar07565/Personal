package com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data;

import javax.xml.datatype.XMLGregorianCalendar;


public class ZifProdRvSbTuktukLimousinData
{

	protected String pickUpDate;
	protected XMLGregorianCalendar pickUpTime;
	protected String pickUpLocation;
	protected String dropOffDate;
	protected XMLGregorianCalendar dropOffTime;
	protected String dropOffLocation;
	protected String noOfPassangers;

	/**
	 * Gets the value of the pickUpDate property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getPickUpDate()
	{
		return pickUpDate;
	}

	/**
	 * Sets the value of the pickUpDate property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setPickUpDate(final String value)
	{
		this.pickUpDate = value;
	}

	/**
	 * Gets the value of the pickUpTime property.
	 *
	 * @return possible object is {@link XMLGregorianCalendar }
	 *
	 */
	public XMLGregorianCalendar getPickUpTime()
	{
		return pickUpTime;
	}

	/**
	 * Sets the value of the pickUpTime property.
	 *
	 * @param value
	 *           allowed object is {@link XMLGregorianCalendar }
	 *
	 */
	public void setPickUpTime(final XMLGregorianCalendar value)
	{
		this.pickUpTime = value;
	}

	/**
	 * Gets the value of the pickUpLocation property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getPickUpLocation()
	{
		return pickUpLocation;
	}

	/**
	 * Sets the value of the pickUpLocation property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setPickUpLocation(final String value)
	{
		this.pickUpLocation = value;
	}

	/**
	 * Gets the value of the dropOffDate property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getDropOffDate()
	{
		return dropOffDate;
	}

	/**
	 * Sets the value of the dropOffDate property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setDropOffDate(final String value)
	{
		this.dropOffDate = value;
	}

	/**
	 * Gets the value of the dropOffTime property.
	 *
	 * @return possible object is {@link XMLGregorianCalendar }
	 *
	 */
	public XMLGregorianCalendar getDropOffTime()
	{
		return dropOffTime;
	}

	/**
	 * Sets the value of the dropOffTime property.
	 *
	 * @param value
	 *           allowed object is {@link XMLGregorianCalendar }
	 *
	 */
	public void setDropOffTime(final XMLGregorianCalendar value)
	{
		this.dropOffTime = value;
	}

	/**
	 * Gets the value of the dropOffLocation property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getDropOffLocation()
	{
		return dropOffLocation;
	}

	/**
	 * Sets the value of the dropOffLocation property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setDropOffLocation(final String value)
	{
		this.dropOffLocation = value;
	}

	/**
	 * Gets the value of the noOfPassangers property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getNoOfPassangers()
	{
		return noOfPassangers;
	}

	/**
	 * Sets the value of the noOfPassangers property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setNoOfPassangers(final String value)
	{
		this.noOfPassangers = value;
	}

}
