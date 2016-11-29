package com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data;

import com.cnk.travelogix.common.data.Errors;


public class ZifTerpOpportunityDataResponse extends Errors
{

	protected ZttStatusOppData status;

	/**
	 * Gets the value of the status property.
	 *
	 * @return possible object is {@link ZttStatusOppData }
	 *
	 */
	public ZttStatusOppData getStatus()
	{
		return status;
	}

	/**
	 * Sets the value of the status property.
	 *
	 * @param value
	 *           allowed object is {@link ZttStatusOppData }
	 *
	 */
	public void setStatus(final ZttStatusOppData value)
	{
		this.status = value;
	}

}
