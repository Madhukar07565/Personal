
package com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for ChargeableItemChargeMassRequest complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ChargeableItemChargeMassRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="context" type="{http://schema.charging.ws.highdeal.com/}ChargeableItemChargeContextData" minOccurs="0"/>
 *         &lt;element name="chargeableItemChargeRequest" type="{http://schema.charging.ws.highdeal.com/}ChargeableItemChargeRequestData" maxOccurs="1000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeableItemChargeMassRequest", propOrder =
{ "context", "chargeableItemChargeRequest" })
public class ChargeableItemChargeMassRequest
{

	protected ChargeableItemChargeContextData context;
	protected List<ChargeableItemChargeRequestData> chargeableItemChargeRequest;

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
	 * Gets the value of the chargeableItemChargeRequest property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the chargeableItemChargeRequest property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getChargeableItemChargeRequest().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ChargeableItemChargeRequestData }
	 * 
	 * 
	 */
	public List<ChargeableItemChargeRequestData> getChargeableItemChargeRequest()
	{
		if (chargeableItemChargeRequest == null)
		{
			chargeableItemChargeRequest = new ArrayList<ChargeableItemChargeRequestData>();
		}
		return this.chargeableItemChargeRequest;
	}

}
