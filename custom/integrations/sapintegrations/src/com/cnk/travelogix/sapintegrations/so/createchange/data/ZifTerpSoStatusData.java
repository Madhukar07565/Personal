
package com.cnk.travelogix.sapintegrations.so.createchange.data;

import javax.xml.bind.annotation.XmlElement;


public class ZifTerpSoStatusData
{

	@XmlElement(name = "Uniqid", required = true)
	protected String uniqid;
	@XmlElement(name = "SoDocNo", required = true)
	protected String soDocNo;
	@XmlElement(name = "Status", required = true)
	protected String status;
	@XmlElement(name = "Messagetype", required = true)
	protected String messagetype;
	@XmlElement(name = "Message", required = true)
	protected String message;
	@XmlElement(name = "Sysubrc", required = true)
	protected String sysubrc;

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

	/**
	 * Gets the value of the soDocNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSoDocNo()
	{
		return soDocNo;
	}

	/**
	 * Sets the value of the soDocNo property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setSoDocNo(final String value)
	{
		this.soDocNo = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus()
	{
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setStatus(final String value)
	{
		this.status = value;
	}

	/**
	 * Gets the value of the messagetype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessagetype()
	{
		return messagetype;
	}

	/**
	 * Sets the value of the messagetype property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setMessagetype(final String value)
	{
		this.messagetype = value;
	}

	/**
	 * Gets the value of the message property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * Sets the value of the message property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setMessage(final String value)
	{
		this.message = value;
	}

	/**
	 * Gets the value of the sysubrc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSysubrc()
	{
		return sysubrc;
	}

	/**
	 * Sets the value of the sysubrc property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setSysubrc(final String value)
	{
		this.sysubrc = value;
	}

}
