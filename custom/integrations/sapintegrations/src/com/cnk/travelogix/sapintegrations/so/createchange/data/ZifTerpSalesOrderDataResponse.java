
package com.cnk.travelogix.sapintegrations.so.createchange.data;

import javax.xml.bind.annotation.XmlElement;

import com.cnk.travelogix.common.data.Errors;


public class ZifTerpSalesOrderDataResponse extends Errors
{

	@XmlElement(name = "Status", required = true)
	protected ZttTerpSoStatusData status;

	/**
	 * Gets the value of the status property.
	 *
	 * @return possible object is {@link ZttTerpSoStatusData }
	 *
	 */
	public ZttTerpSoStatusData getStatus()
	{
		return status;
	}

	/**
	 * Sets the value of the status property.
	 *
	 * @param value
	 *           allowed object is {@link ZttTerpSoStatusData }
	 *
	 */
	public void setStatus(final ZttTerpSoStatusData value)
	{
		this.status = value;
	}

}
