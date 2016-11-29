
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;



public class SubscriberAccount
{

	@XmlElement(required = true)
	protected String id;
	@XmlElement(required = true)
	protected String subscriberId;
	protected String description;
	protected String noTax;
	protected TaxInfo tax;
	protected List<AdditionalInfo> additionalInfo;

	public String currencyCode;



	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode()
	{
		return currencyCode;
	}

	/**
	 * @param currencyCode
	 *           the currencyCode to set
	 */
	public void setCurrencyCode(final String currencyCode)
	{
		this.currencyCode = currencyCode;
	}

	/**
	 * Gets the value of the id property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Sets the value of the id property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setId(final String value)
	{
		this.id = value;
	}

	/**
	 * Gets the value of the subscriberId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getSubscriberId()
	{
		return subscriberId;
	}

	/**
	 * Sets the value of the subscriberId property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setSubscriberId(final String value)
	{
		this.subscriberId = value;
	}

	/**
	 * Gets the value of the description property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Sets the value of the description property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setDescription(final String value)
	{
		this.description = value;
	}

	/**
	 * Gets the value of the noTax property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getNoTax()
	{
		return noTax;
	}

	/**
	 * Sets the value of the noTax property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setNoTax(final String value)
	{
		this.noTax = value;
	}

	/**
	 * Gets the value of the tax property.
	 *
	 * @return possible object is {@link TaxInfo }
	 *
	 */
	public TaxInfo getTax()
	{
		return tax;
	}

	/**
	 * Sets the value of the tax property.
	 *
	 * @param value
	 *           allowed object is {@link TaxInfo }
	 *
	 */
	public void setTax(final TaxInfo value)
	{
		this.tax = value;
	}

	/**
	 * Gets the value of the additionalInfo property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the additionalInfo property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getAdditionalInfo().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link AdditionalInfo }
	 *
	 *
	 */
	public List<AdditionalInfo> getAdditionalInfo()
	{
		if (additionalInfo == null)
		{
			additionalInfo = new ArrayList<AdditionalInfo>();
		}
		return this.additionalInfo;
	}



}
