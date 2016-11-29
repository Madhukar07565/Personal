package com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data;

import com.cnk.travelogix.common.data.Errors;


public class ZifTerpComplaintsDataResponse extends Errors
{

	protected ZttTerpComplaintsStatusData status;

	/**
	 * Gets the value of the status property.
	 *
	 * @return possible object is {@link ZttTerpComplaintsStatusData }
	 *
	 */
	public ZttTerpComplaintsStatusData getStatus()
	{
		return status;
	}

	/**
	 * Sets the value of the status property.
	 *
	 * @param value
	 *           allowed object is {@link ZttTerpComplaintsStatusData }
	 *
	 */
	public void setStatus(final ZttTerpComplaintsStatusData value)
	{
		this.status = value;
	}

}
