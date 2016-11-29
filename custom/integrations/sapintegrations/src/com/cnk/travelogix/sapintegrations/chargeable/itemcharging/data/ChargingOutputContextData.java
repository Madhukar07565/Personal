
package com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data;

import javax.xml.bind.annotation.XmlElement;


public class ChargingOutputContextData
{

	@XmlElement(defaultValue = "true")
	protected Boolean chargeableItemExported;

	/**
	 * Gets the value of the chargeableItemExported property.
	 *
	 * @return possible object is {@link Boolean }
	 *
	 */
	public Boolean isChargeableItemExported()
	{
		return chargeableItemExported;
	}

	/**
	 * Sets the value of the chargeableItemExported property.
	 *
	 * @param value
	 *           allowed object is {@link Boolean }
	 *
	 */
	public void setChargeableItemExported(final Boolean value)
	{
		this.chargeableItemExported = value;
	}

}
