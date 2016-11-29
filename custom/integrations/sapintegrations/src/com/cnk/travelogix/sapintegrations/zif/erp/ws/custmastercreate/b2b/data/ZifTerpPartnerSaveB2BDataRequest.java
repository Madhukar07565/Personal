package com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data;


public class ZifTerpPartnerSaveB2BDataRequest
{
	protected ZifErpTtContmastB2BData contactData;

	protected ZifErpStCustmastB2BData customerData;

	/**
	 * Gets the value of the contactData property.
	 *
	 * @return possible object is {@link ZifErpTtContmastB2BData }
	 *
	 */
	public ZifErpTtContmastB2BData getContactData()
	{
		return contactData;
	}

	/**
	 * Sets the value of the contactData property.
	 *
	 * @param value
	 *           allowed object is {@link ZifErpTtContmastB2BData }
	 *
	 */
	public void setContactData(final ZifErpTtContmastB2BData value)
	{
		this.contactData = value;
	}

	/**
	 * Gets the value of the customerData property.
	 *
	 * @return possible object is {@link ZifErpStCustmastB2BData }
	 *
	 */
	public ZifErpStCustmastB2BData getCustomerData()
	{
		return customerData;
	}

	/**
	 * Sets the value of the customerData property.
	 *
	 * @param value
	 *           allowed object is {@link ZifErpStCustmastB2BData }
	 *
	 */
	public void setCustomerData(final ZifErpStCustmastB2BData value)
	{
		this.customerData = value;
	}

}
