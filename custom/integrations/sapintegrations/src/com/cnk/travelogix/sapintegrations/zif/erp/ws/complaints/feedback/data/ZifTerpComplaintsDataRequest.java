package com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data;


public class ZifTerpComplaintsDataRequest
{

	protected ZifTerpComplaintsHeaderData compHeader;
	protected ZttTerpComplaintsItemsData compItem;
	protected ZttTerpComplaintsPartnersData compPartners;

	/**
	 * Gets the value of the compHeader property.
	 * 
	 * @return possible object is {@link ZifTerpComplaintsHeaderData }
	 * 
	 */
	public ZifTerpComplaintsHeaderData getCompHeader()
	{
		return compHeader;
	}

	/**
	 * Sets the value of the compHeader property.
	 * 
	 * @param value
	 *           allowed object is {@link ZifTerpComplaintsHeaderData }
	 * 
	 */
	public void setCompHeader(final ZifTerpComplaintsHeaderData value)
	{
		this.compHeader = value;
	}

	/**
	 * Gets the value of the compItem property.
	 * 
	 * @return possible object is {@link ZttTerpComplaintsItemsData }
	 * 
	 */
	public ZttTerpComplaintsItemsData getCompItem()
	{
		return compItem;
	}

	/**
	 * Sets the value of the compItem property.
	 * 
	 * @param value
	 *           allowed object is {@link ZttTerpComplaintsItemsData }
	 * 
	 */
	public void setCompItem(final ZttTerpComplaintsItemsData value)
	{
		this.compItem = value;
	}

	/**
	 * Gets the value of the compPartners property.
	 * 
	 * @return possible object is {@link ZttTerpComplaintsPartnersData }
	 * 
	 */
	public ZttTerpComplaintsPartnersData getCompPartners()
	{
		return compPartners;
	}

	/**
	 * Sets the value of the compPartners property.
	 * 
	 * @param value
	 *           allowed object is {@link ZttTerpComplaintsPartnersData }
	 * 
	 */
	public void setCompPartners(final ZttTerpComplaintsPartnersData value)
	{
		this.compPartners = value;
	}

}
