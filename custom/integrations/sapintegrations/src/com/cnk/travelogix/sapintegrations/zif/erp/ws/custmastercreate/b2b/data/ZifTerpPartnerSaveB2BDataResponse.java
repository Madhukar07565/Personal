package com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data;

import com.cnk.travelogix.common.data.Errors;


public class ZifTerpPartnerSaveB2BDataResponse extends Errors
{
	protected ZifErpTtStatusCB2BData status;

	/**
	 * Gets the value of the status property.
	 *
	 * @return possible object is {@link ZifErpTtStatusCB2BData }
	 *
	 */
	public ZifErpTtStatusCB2BData getStatus()
	{
		return status;
	}

	/**
	 * Sets the value of the status property.
	 *
	 * @param value
	 *           allowed object is {@link ZifErpTtStatusCB2BData }
	 *
	 */
	public void setStatus(final ZifErpTtStatusCB2BData value)
	{
		this.status = value;
	}

}
