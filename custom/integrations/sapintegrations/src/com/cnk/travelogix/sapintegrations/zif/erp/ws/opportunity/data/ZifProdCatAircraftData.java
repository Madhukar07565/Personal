package com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data;

import javax.xml.datatype.XMLGregorianCalendar;


public class ZifProdCatAircraftData
{
	protected String departureDate;
	protected XMLGregorianCalendar departureTime;
	protected String returnDate;
	protected XMLGregorianCalendar returnTime;
	protected String noOfPassangers;

	/**
	 * Gets the value of the departureDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDepartureDate()
	{
		return departureDate;
	}

	/**
	 * Sets the value of the departureDate property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setDepartureDate(final String value)
	{
		this.departureDate = value;
	}

	/**
	 * Gets the value of the departureTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDepartureTime()
	{
		return departureTime;
	}

	/**
	 * Sets the value of the departureTime property.
	 * 
	 * @param value
	 *           allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDepartureTime(final XMLGregorianCalendar value)
	{
		this.departureTime = value;
	}

	/**
	 * Gets the value of the returnDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReturnDate()
	{
		return returnDate;
	}

	/**
	 * Sets the value of the returnDate property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setReturnDate(final String value)
	{
		this.returnDate = value;
	}

	/**
	 * Gets the value of the returnTime property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getReturnTime()
	{
		return returnTime;
	}

	/**
	 * Sets the value of the returnTime property.
	 * 
	 * @param value
	 *           allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setReturnTime(final XMLGregorianCalendar value)
	{
		this.returnTime = value;
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
