
package com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data;

public class ZifTerpPartnerSaveDataRequest
{

	protected ZifErpTtContmastData contactData;
	protected ZifErpStCustmastData customerData;

	/**
	 * Gets the value of the contactData property.
	 *
	 * @return possible object is {@link ZifErpTtContmastData }
	 *
	 */
	public ZifErpTtContmastData getContactData()
	{
		return contactData;
	}

	/**
	 * Sets the value of the contactData property.
	 *
	 * @param value
	 *           allowed object is {@link ZifErpTtContmastData }
	 *
	 */
	public void setContactData(final ZifErpTtContmastData value)
	{
		this.contactData = value;
	}

	/**
	 * Gets the value of the customerData property.
	 *
	 * @return possible object is {@link ZifErpStCustmastData }
	 *
	 */
	public ZifErpStCustmastData getCustomerData()
	{
		return customerData;
	}

	/**
	 * Sets the value of the customerData property.
	 *
	 * @param value
	 *           allowed object is {@link ZifErpStCustmastData }
	 *
	 */
	public void setCustomerData(final ZifErpStCustmastData value)
	{
		this.customerData = value;
	}

}
