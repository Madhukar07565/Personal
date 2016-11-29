
package com.cnk.travelogix.sapintegrations.so.createchange.data;

public class ZifTerpSalesOrderDataRequest
{

	protected ZttTerpSoConditionsData soConditions;
	protected ZifTerpSoHeaderData soHeader;
	protected ZttTerpSoItemData soItems;
	protected ZttTerpSoPartnersData soPartners;

	/**
	 * Gets the value of the soConditions property.
	 *
	 * @return possible object is {@link ZttTerpSoConditionsData }
	 *
	 */
	public ZttTerpSoConditionsData getSoConditions()
	{
		return soConditions;
	}

	/**
	 * Sets the value of the soConditions property.
	 *
	 * @param value
	 *           allowed object is {@link ZttTerpSoConditionsData }
	 *
	 */
	public void setSoConditions(final ZttTerpSoConditionsData value)
	{
		this.soConditions = value;
	}

	/**
	 * Gets the value of the soHeader property.
	 *
	 * @return possible object is {@link ZifTerpSoHeaderData }
	 *
	 */
	public ZifTerpSoHeaderData getSoHeader()
	{
		return soHeader;
	}

	/**
	 * Sets the value of the soHeader property.
	 *
	 * @param value
	 *           allowed object is {@link ZifTerpSoHeaderData }
	 *
	 */
	public void setSoHeader(final ZifTerpSoHeaderData value)
	{
		this.soHeader = value;
	}

	/**
	 * Gets the value of the soItems property.
	 *
	 * @return possible object is {@link ZttTerpSoItemData }
	 *
	 */
	public ZttTerpSoItemData getSoItems()
	{
		return soItems;
	}

	/**
	 * Sets the value of the soItems property.
	 *
	 * @param value
	 *           allowed object is {@link ZttTerpSoItemData }
	 *
	 */
	public void setSoItems(final ZttTerpSoItemData value)
	{
		this.soItems = value;
	}

	/**
	 * Gets the value of the soPartners property.
	 *
	 * @return possible object is {@link ZttTerpSoPartnersData }
	 *
	 */
	public ZttTerpSoPartnersData getSoPartners()
	{
		return soPartners;
	}

	/**
	 * Sets the value of the soPartners property.
	 *
	 * @param value
	 *           allowed object is {@link ZttTerpSoPartnersData }
	 *
	 */
	public void setSoPartners(final ZttTerpSoPartnersData value)
	{
		this.soPartners = value;
	}

}
