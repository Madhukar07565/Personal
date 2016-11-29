
package com.cnk.travelogix.sapintegrations.invoice.create.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement(name = "ZIffmBillDocCreate")
public class ZIffmBillDocCreateData
{

	@XmlElement(name = "IBillDoc", required = true)
	protected ZttBilldocData iBillDoc;
	@XmlElement(name = "Uniqid", required = true)
	protected String uniqid;

	/**
	 * Gets the value of the iBillDoc property.
	 *
	 * @return possible object is {@link ZttBilldocData }
	 *
	 */
	public ZttBilldocData getIBillDoc()
	{
		return iBillDoc;
	}

	/**
	 * Sets the value of the iBillDoc property.
	 *
	 * @param value
	 *           allowed object is {@link ZttBilldocData }
	 *
	 */
	public void setIBillDoc(final ZttBilldocData value)
	{
		this.iBillDoc = value;
	}

	/**
	 * Gets the value of the uniqid property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getUniqid()
	{
		return uniqid;
	}

	/**
	 * Sets the value of the uniqid property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setUniqid(final String value)
	{
		this.uniqid = value;
	}

}
