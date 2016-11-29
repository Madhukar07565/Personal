
package com.cnk.travelogix.sapintegrations.so.createchange.data;

import javax.xml.bind.annotation.XmlElement;


public class ZIfTerpSoPartnersData
{

	@XmlElement(name = "ItmNumber", required = true)
	protected String itmNumber;
	@XmlElement(name = "PartnerFunction", required = true)
	protected String partnerFunction;
	@XmlElement(name = "PartnNumb", required = true)
	protected String partnNumb;
	@XmlElement(name = "CrmtMode", required = true)
	protected String crmtMode;

	/**
	 * Gets the value of the itmNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getItmNumber()
	{
		return itmNumber;
	}

	/**
	 * Sets the value of the itmNumber property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setItmNumber(final String value)
	{
		this.itmNumber = value;
	}

	/**
	 * Gets the value of the partnerFunction property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPartnerFunction()
	{
		return partnerFunction;
	}

	/**
	 * Sets the value of the partnerFunction property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setPartnerFunction(final String value)
	{
		this.partnerFunction = value;
	}

	/**
	 * Gets the value of the partnNumb property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPartnNumb()
	{
		return partnNumb;
	}

	/**
	 * Sets the value of the partnNumb property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setPartnNumb(final String value)
	{
		this.partnNumb = value;
	}

	/**
	 * Gets the value of the crmtMode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCrmtMode()
	{
		return crmtMode;
	}

	/**
	 * Sets the value of the crmtMode property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setCrmtMode(final String value)
	{
		this.crmtMode = value;
	}

}
