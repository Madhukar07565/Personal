
package com.cnk.travelogix.contract.provisioning.data;

import javax.xml.datatype.XMLGregorianCalendar;

import com.cnk.travelogix.custom.contract.provisioning.ChargingContractRevision;



public class MaintainChargingContractRequestData
{

	protected XMLGregorianCalendar date;
	protected ChargingContractRevisionData chargingContractRevision;

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
	 * Gets the value of the chargingContractRevision property.
	 *
	 * @return possible object is {@link ChargingContractRevision }
	 *
	 */
	public ChargingContractRevisionData getChargingContractRevision()
	{
		return chargingContractRevision;
	}

	/**
	 * Sets the value of the chargingContractRevision property.
	 *
	 * @param value
	 *           allowed object is {@link ChargingContractRevision }
	 *
	 */
	public void setChargingContractRevision(final ChargingContractRevisionData value)
	{
		this.chargingContractRevision = value;
	}

}
