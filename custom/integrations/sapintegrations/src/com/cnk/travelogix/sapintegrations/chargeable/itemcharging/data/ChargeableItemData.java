
package com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data;

import javax.xml.datatype.XMLGregorianCalendar;


public class ChargeableItemData
{

	protected String name;
	protected StringUniqueIdentifier uid;
	protected String userTechnicalId;
	protected String serviceId;
	protected XMLGregorianCalendar consumptionDate;
	protected ChargeableItemUserProperties userProperties;

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
	 * Gets the value of the uid property.
	 *
	 * @return possible object is {@link StringUniqueIdentifier }
	 *
	 */
	public StringUniqueIdentifier getUid()
	{
		return uid;
	}

	/**
	 * Sets the value of the uid property.
	 *
	 * @param value
	 *           allowed object is {@link StringUniqueIdentifier }
	 *
	 */
	public void setUid(final StringUniqueIdentifier value)
	{
		this.uid = value;
	}

	/**
	 * Gets the value of the userTechnicalId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getUserTechnicalId()
	{
		return userTechnicalId;
	}

	/**
	 * Sets the value of the userTechnicalId property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setUserTechnicalId(final String value)
	{
		this.userTechnicalId = value;
	}

	/**
	 * Gets the value of the serviceId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getServiceId()
	{
		return serviceId;
	}

	/**
	 * Sets the value of the serviceId property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setServiceId(final String value)
	{
		this.serviceId = value;
	}

	/**
	 * Gets the value of the consumptionDate property.
	 *
	 * @return possible object is {@link XMLGregorianCalendar }
	 *
	 */
	public XMLGregorianCalendar getConsumptionDate()
	{
		return consumptionDate;
	}

	/**
	 * Sets the value of the consumptionDate property.
	 *
	 * @param value
	 *           allowed object is {@link XMLGregorianCalendar }
	 *
	 */
	public void setConsumptionDate(final XMLGregorianCalendar value)
	{
		this.consumptionDate = value;
	}

	/**
	 * Gets the value of the userProperties property.
	 *
	 * @return possible object is {@link ChargeableItemUserProperties }
	 *
	 */
	public ChargeableItemUserProperties getUserProperties()
	{
		return userProperties;
	}

	/**
	 * Sets the value of the userProperties property.
	 *
	 * @param value
	 *           allowed object is {@link ChargeableItemUserProperties }
	 *
	 */
	public void setUserProperties(final ChargeableItemUserProperties value)
	{
		this.userProperties = value;
	}

}
