
package com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for ChargeableItemCheckChargeRequest complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ChargeableItemCheckChargeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="context" type="{http://schema.charging.ws.highdeal.com/}ChargeableItemChargeContextData" minOccurs="0"/>
 *         &lt;element name="chargeableItem" type="{http://schema.charging.ws.highdeal.com/}ChargeableItemData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeableItemCheckChargeRequest", propOrder =
{ "context", "chargeableItem" })
public class ChargeableItemCheckChargeRequest
{

	protected ChargeableItemChargeContextData context;
	@XmlElement(required = true)
	protected ChargeableItemData chargeableItem;

	/**
	 * Gets the value of the context property.
	 * 
	 * @return possible object is {@link ChargeableItemChargeContextData }
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
	 *           allowed object is {@link ChargeableItemChargeContextData }
	 * 
	 */
	public void setContext(final ChargeableItemChargeContextData value)
	{
		this.context = value;
	}

	/**
	 * Gets the value of the chargeableItem property.
	 * 
	 * @return possible object is {@link ChargeableItemData }
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
	 *           allowed object is {@link ChargeableItemData }
	 * 
	 */
	public void setChargeableItem(final ChargeableItemData value)
	{
		this.chargeableItem = value;
	}

}
