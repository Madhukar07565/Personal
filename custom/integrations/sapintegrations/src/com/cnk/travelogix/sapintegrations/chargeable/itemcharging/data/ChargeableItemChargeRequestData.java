
package com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data;

import javax.xml.bind.annotation.XmlElement;

import com.cnk.travelogix.custom.chargeable.itemcharging.ChargeableItem;
import com.cnk.travelogix.custom.chargeable.itemcharging.ChargeableItemChargeContext;


public class ChargeableItemChargeRequestData
{

	protected ChargeableItemChargeContextData context;
	@XmlElement(required = true)
	protected ChargeableItemData chargeableItem;

	/**
	 * Gets the value of the context property.
	 *
	 * @return possible object is {@link ChargeableItemChargeContext }
	 *
	 */
	public ChargeableItemChargeContextData getContext()
	{
		return context;
	}

	/**
	 * Sets the value of the context property.
	 *
	 * @param value
	 *           allowed object is {@link ChargeableItemChargeContext }
	 *
	 */
	public void setContext(final ChargeableItemChargeContextData value)
	{
		this.context = value;
	}

	/**
	 * Gets the value of the chargeableItem property.
	 *
	 * @return possible object is {@link ChargeableItem }
	 *
	 */
	public ChargeableItemData getChargeableItem()
	{
		return chargeableItem;
	}

	/**
	 * Sets the value of the chargeableItem property.
	 *
	 * @param value
	 *           allowed object is {@link ChargeableItem }
	 *
	 */
	public void setChargeableItem(final ChargeableItemData value)
	{
		this.chargeableItem = value;
	}

}
