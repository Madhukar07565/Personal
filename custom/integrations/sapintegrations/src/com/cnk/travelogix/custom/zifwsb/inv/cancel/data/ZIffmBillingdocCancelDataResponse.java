package com.cnk.travelogix.custom.zifwsb.inv.cancel.data;

import com.cnk.travelogix.common.data.Errors;


public class ZIffmBillingdocCancelDataResponse extends Errors
{

	protected ZifstStatusDocData status;

	/**
	 * Gets the value of the status property.
	 *
	 * @return possible object is {@link ZifstStatusDocData }
	 *
	 */
	public ZifstStatusDocData getStatus()
	{
		return status;
	}

	/**
	 * Sets the value of the status property.
	 *
	 * @param value
	 *           allowed object is {@link ZifstStatusDocData }
	 *
	 */
	public void setStatus(final ZifstStatusDocData value)
	{
		this.status = value;
	}

}
