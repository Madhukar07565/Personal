
package com.cnk.travelogix.sapintegrations.invoice.create.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cnk.travelogix.common.data.Errors;


@XmlRootElement(name = "ZIffmBillDocCreateResponse")
public class ZIffmBillDocCreateResponseData extends Errors
{

	@XmlElement(name = "Status", required = true)
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
