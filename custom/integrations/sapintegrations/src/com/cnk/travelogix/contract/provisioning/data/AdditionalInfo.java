
package com.cnk.travelogix.contract.provisioning.data;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;


public class AdditionalInfo
{

	protected String name;
	protected String description;
	protected String string;
	protected XMLGregorianCalendar date;
	protected BigDecimal number;

	/**
	 * Gets the value of the name property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the value of the name property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setName(final String value)
	{
		this.name = value;
	}

	/**
	 * Gets the value of the description property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Sets the value of the description property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setDescription(final String value)
	{
		this.description = value;
	}

	/**
	 * Gets the value of the string property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getString()
	{
		return string;
	}

	/**
	 * Sets the value of the string property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setString(final String value)
	{
		this.string = value;
	}

	/**
	 * Gets the value of the date property.
	 *
	 * @return possible object is {@link XMLGregorianCalendar }
	 *
	 */
	public XMLGregorianCalendar getDate()
	{
		return date;
	}

	/**
	 * Sets the value of the date property.
	 *
	 * @param value
	 *           allowed object is {@link XMLGregorianCalendar }
	 *
	 */
	public void setDate(final XMLGregorianCalendar value)
	{
		this.date = value;
	}

	/**
	 * Gets the value of the number property.
	 *
	 * @return possible object is {@link BigDecimal }
	 *
	 */
	public BigDecimal getNumber()
	{
		return number;
	}

	/**
	 * Sets the value of the number property.
	 *
	 * @param value
	 *           allowed object is {@link BigDecimal }
	 *
	 */
	public void setNumber(final BigDecimal value)
	{
		this.number = value;
	}

}
