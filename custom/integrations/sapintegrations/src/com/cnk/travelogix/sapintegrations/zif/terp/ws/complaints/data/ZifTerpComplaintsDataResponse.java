package com.cnk.travelogix.sapintegrations.zif.terp.ws.complaints.data;



public class ZifTerpComplaintsDataResponse
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
