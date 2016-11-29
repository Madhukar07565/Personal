
package com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data;

import com.cnk.travelogix.common.data.Errors;


public class ZifTerpPartnerSaveDataResponse extends Errors
{
	protected ZifErpTtStatusCData status;

	/**
	 * Gets the value of the status property.
	 *
	 * @return possible object is {@link ZifErpTtStatusCData }
	 *
	 */
	public ZifErpTtStatusCData getStatus()
	{
		return status;
	}

	/**
	 * Sets the value of the status property.
	 *
	 * @param value
	 *           allowed object is {@link ZifErpTtStatusCData }
	 *
	 */
	public void setStatus(final ZifErpTtStatusCData value)
	{
		this.status = value;
	}

}
