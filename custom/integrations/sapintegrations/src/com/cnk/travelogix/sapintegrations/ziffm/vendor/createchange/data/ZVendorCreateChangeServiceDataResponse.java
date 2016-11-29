
package com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data;

import com.cnk.travelogix.common.data.Errors;


public class ZVendorCreateChangeServiceDataResponse extends Errors
{

	protected ZifttStatusDocData etStatus;

	/**
	 * Gets the value of the etStatus property.
	 *
	 * @return possible object is {@link ZifttStatusDocData }
	 *
	 */
	public ZifttStatusDocData getEtStatus()
	{
		return etStatus;
	}

	/**
	 * Sets the value of the etStatus property.
	 *
	 * @param value
	 *           allowed object is {@link ZifttStatusDocData }
	 *
	 */
	public void setEtStatus(final ZifttStatusDocData value)
	{
		this.etStatus = value;
	}

}
