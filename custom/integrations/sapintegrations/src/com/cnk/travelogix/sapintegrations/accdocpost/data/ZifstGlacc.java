
package com.cnk.travelogix.sapintegrations.accdocpost.data;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;


public class ZifstGlacc
{

	@XmlElement(name = "Bschl", required = true)
	protected String bschl;
	@XmlElement(name = "Saknr", required = true)
	protected String saknr;
	@XmlElement(name = "Wrbtr", required = true)
	protected BigDecimal wrbtr;
	@XmlElement(name = "Wmwst", required = true)
	protected BigDecimal wmwst;
	@XmlElement(name = "Mwskz", required = true)
	protected String mwskz;
	@XmlElement(name = "Xmwst", required = true)
	protected String xmwst;
	@XmlElement(name = "Kostl", required = true)
	protected String kostl;
	@XmlElement(name = "Vbel2", required = true)
	protected String vbel2;
	@XmlElement(name = "Posn2", required = true)
	protected String posn2;
	@XmlElement(name = "Aufnr", required = true)
	protected String aufnr;
	@XmlElement(name = "Prctr", required = true)
	protected String prctr;
	@XmlElement(name = "Sgtxt", required = true)
	protected String sgtxt;
	@XmlElement(name = "Zuonr", required = true)
	protected String zuonr;
	@XmlElement(name = "Valut", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar valut;

	/**
	 * Gets the value of the bschl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBschl()
	{
		return bschl;
	}

	/**
	 * Sets the value of the bschl property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setBschl(final String value)
	{
		this.bschl = value;
	}

	/**
	 * Gets the value of the saknr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSaknr()
	{
		return saknr;
	}

	/**
	 * Sets the value of the saknr property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setSaknr(final String value)
	{
		this.saknr = value;
	}

	/**
	 * Gets the value of the wrbtr property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getWrbtr()
	{
		return wrbtr;
	}

	/**
	 * Sets the value of the wrbtr property.
	 * 
	 * @param value
	 *           allowed object is {@link BigDecimal }
	 * 
	 */
	public void setWrbtr(final BigDecimal value)
	{
		this.wrbtr = value;
	}

	/**
	 * Gets the value of the wmwst property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getWmwst()
	{
		return wmwst;
	}

	/**
	 * Sets the value of the wmwst property.
	 * 
	 * @param value
	 *           allowed object is {@link BigDecimal }
	 * 
	 */
	public void setWmwst(final BigDecimal value)
	{
		this.wmwst = value;
	}

	/**
	 * Gets the value of the mwskz property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMwskz()
	{
		return mwskz;
	}

	/**
	 * Sets the value of the mwskz property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setMwskz(final String value)
	{
		this.mwskz = value;
	}

	/**
	 * Gets the value of the xmwst property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXmwst()
	{
		return xmwst;
	}

	/**
	 * Sets the value of the xmwst property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setXmwst(final String value)
	{
		this.xmwst = value;
	}

	/**
	 * Gets the value of the kostl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getKostl()
	{
		return kostl;
	}

	/**
	 * Sets the value of the kostl property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setKostl(final String value)
	{
		this.kostl = value;
	}

	/**
	 * Gets the value of the vbel2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVbel2()
	{
		return vbel2;
	}

	/**
	 * Sets the value of the vbel2 property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setVbel2(final String value)
	{
		this.vbel2 = value;
	}

	/**
	 * Gets the value of the posn2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPosn2()
	{
		return posn2;
	}

	/**
	 * Sets the value of the posn2 property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setPosn2(final String value)
	{
		this.posn2 = value;
	}

	/**
	 * Gets the value of the aufnr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAufnr()
	{
		return aufnr;
	}

	/**
	 * Sets the value of the aufnr property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setAufnr(final String value)
	{
		this.aufnr = value;
	}

	/**
	 * Gets the value of the prctr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrctr()
	{
		return prctr;
	}

	/**
	 * Sets the value of the prctr property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setPrctr(final String value)
	{
		this.prctr = value;
	}

	/**
	 * Gets the value of the sgtxt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSgtxt()
	{
		return sgtxt;
	}

	/**
	 * Sets the value of the sgtxt property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setSgtxt(final String value)
	{
		this.sgtxt = value;
	}

	/**
	 * Gets the value of the zuonr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZuonr()
	{
		return zuonr;
	}

	/**
	 * Sets the value of the zuonr property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setZuonr(final String value)
	{
		this.zuonr = value;
	}

	/**
	 * Gets the value of the valut property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getValut()
	{
		return valut;
	}

	/**
	 * Sets the value of the valut property.
	 * 
	 * @param value
	 *           allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setValut(final XMLGregorianCalendar value)
	{
		this.valut = value;
	}

}
