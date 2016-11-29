
package com.cnk.travelogix.sapintegrations.so.createchange.data;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;


public class ZifTerpSoConditionsData
{

	@XmlElement(name = "ItmNumber", required = true)
	protected String itmNumber;
	@XmlElement(name = "CondType", required = true)
	protected String condType;
	@XmlElement(name = "CondValue", required = true)
	protected BigDecimal condValue;
	@XmlElement(name = "Currency", required = true)
	protected String currency;
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
	 * Gets the value of the condType property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getCondType()
	{
		return condType;
	}

	/**
	 * Sets the value of the condType property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setCondType(final String value)
	{
		this.condType = value;
	}

	/**
	 * Gets the value of the condValue property.
	 *
	 * @return possible object is {@link BigDecimal }
	 *
	 */
	public BigDecimal getCondValue()
	{
		return condValue;
	}

	/**
	 * Sets the value of the condValue property.
	 *
	 * @param value
	 *           allowed object is {@link BigDecimal }
	 *
	 */
	public void setCondValue(final BigDecimal value)
	{
		this.condValue = value;
	}

	/**
	 * Gets the value of the currency property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getCurrency()
	{
		return currency;
	}

	/**
	 * Sets the value of the currency property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setCurrency(final String value)
	{
		this.currency = value;
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
