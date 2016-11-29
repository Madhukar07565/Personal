
package com.cnk.travelogix.sapintegrations.accdocpost.data;

import javax.xml.bind.annotation.XmlElement;


public class ZifstStatusDoc
{

	@XmlElement(name = "Uniqid", required = true)
	protected String uniqid;
	@XmlElement(name = "Docnumber", required = true)
	protected String docnumber;
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
	 * Gets the value of the docnumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDocnumber()
	{
		return docnumber;
	}

	/**
	 * Sets the value of the docnumber property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setDocnumber(final String value)
	{
		this.docnumber = value;
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
