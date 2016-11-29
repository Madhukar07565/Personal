
package com.cnk.travelogix.sapintegrations.accdocpost.data;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;


public class ZifstDochead
{

	@XmlElement(name = "Uniqid", required = true)
	protected String uniqid;
	@XmlElement(name = "Bldat", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar bldat;
	@XmlElement(name = "Blart", required = true)
	protected String blart;
	@XmlElement(name = "Bukrs", required = true)
	protected String bukrs;
	@XmlElement(name = "Budat", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar budat;
	@XmlElement(name = "Waers", required = true)
	protected String waers;
	@XmlElement(name = "Kursf", required = true)
	protected BigDecimal kursf;
	@XmlElement(name = "Xblnr", required = true)
	protected String xblnr;
	@XmlElement(name = "Bktxt", required = true)
	protected String bktxt;
	@XmlElement(name = "Uname", required = true)
	protected String uname;

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
	 * Gets the value of the bldat property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getBldat()
	{
		return bldat;
	}

	/**
	 * Sets the value of the bldat property.
	 * 
	 * @param value
	 *           allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setBldat(final XMLGregorianCalendar value)
	{
		this.bldat = value;
	}

	/**
	 * Gets the value of the blart property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBlart()
	{
		return blart;
	}

	/**
	 * Sets the value of the blart property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setBlart(final String value)
	{
		this.blart = value;
	}

	/**
	 * Gets the value of the bukrs property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBukrs()
	{
		return bukrs;
	}

	/**
	 * Sets the value of the bukrs property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setBukrs(final String value)
	{
		this.bukrs = value;
	}

	/**
	 * Gets the value of the budat property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getBudat()
	{
		return budat;
	}

	/**
	 * Sets the value of the budat property.
	 * 
	 * @param value
	 *           allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setBudat(final XMLGregorianCalendar value)
	{
		this.budat = value;
	}

	/**
	 * Gets the value of the waers property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWaers()
	{
		return waers;
	}

	/**
	 * Sets the value of the waers property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setWaers(final String value)
	{
		this.waers = value;
	}

	/**
	 * Gets the value of the kursf property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getKursf()
	{
		return kursf;
	}

	/**
	 * Sets the value of the kursf property.
	 * 
	 * @param value
	 *           allowed object is {@link BigDecimal }
	 * 
	 */
	public void setKursf(final BigDecimal value)
	{
		this.kursf = value;
	}

	/**
	 * Gets the value of the xblnr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXblnr()
	{
		return xblnr;
	}

	/**
	 * Sets the value of the xblnr property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setXblnr(final String value)
	{
		this.xblnr = value;
	}

	/**
	 * Gets the value of the bktxt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBktxt()
	{
		return bktxt;
	}

	/**
	 * Sets the value of the bktxt property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setBktxt(final String value)
	{
		this.bktxt = value;
	}

	/**
	 * Gets the value of the uname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUname()
	{
		return uname;
	}

	/**
	 * Sets the value of the uname property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setUname(final String value)
	{
		this.uname = value;
	}

}
