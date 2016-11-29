
package com.cnk.travelogix.sapintegrations.accdocpost.data;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;


public class ZifstVendor
{

	@XmlElement(name = "Bschl", required = true)
	protected String bschl;
	@XmlElement(name = "Lifnr", required = true)
	protected String lifnr;
	@XmlElement(name = "Umskz", required = true)
	protected String umskz;
	@XmlElement(name = "Wrbtr", required = true)
	protected BigDecimal wrbtr;
	@XmlElement(name = "Prctr", required = true)
	protected String prctr;
	@XmlElement(name = "Wmwst", required = true)
	protected BigDecimal wmwst;
	@XmlElement(name = "Mwskz", required = true)
	protected String mwskz;
	@XmlElement(name = "Xmwst", required = true)
	protected String xmwst;
	@XmlElement(name = "Zterm", required = true)
	protected String zterm;
	@XmlElement(name = "Zfbdt", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar zfbdt;
	@XmlElement(name = "Zlspr", required = true)
	protected String zlspr;
	@XmlElement(name = "Zlsch", required = true)
	protected String zlsch;
	@XmlElement(name = "Pycur", required = true)
	protected String pycur;
	@XmlElement(name = "Pyamt", required = true)
	protected BigDecimal pyamt;
	@XmlElement(name = "Bvtyp", required = true)
	protected String bvtyp;
	@XmlElement(name = "Fdlev", required = true)
	protected String fdlev;
	@XmlElement(name = "Zuonr", required = true)
	protected String zuonr;
	@XmlElement(name = "Vbel2", required = true)
	protected String vbel2;
	@XmlElement(name = "Posn2", required = true)
	protected String posn2;
	@XmlElement(name = "Sgtxt", required = true)
	protected String sgtxt;
	@XmlElement(name = "Qsskz", required = true)
	protected String qsskz;
	@XmlElement(name = "Bupla", required = true)
	protected String bupla;
	@XmlElement(name = "Secco", required = true)
	protected String secco;

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
	 * Gets the value of the lifnr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLifnr()
	{
		return lifnr;
	}

	/**
	 * Sets the value of the lifnr property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setLifnr(final String value)
	{
		this.lifnr = value;
	}

	/**
	 * Gets the value of the umskz property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUmskz()
	{
		return umskz;
	}

	/**
	 * Sets the value of the umskz property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setUmskz(final String value)
	{
		this.umskz = value;
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
	 * Gets the value of the zterm property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZterm()
	{
		return zterm;
	}

	/**
	 * Sets the value of the zterm property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setZterm(final String value)
	{
		this.zterm = value;
	}

	/**
	 * Gets the value of the zfbdt property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getZfbdt()
	{
		return zfbdt;
	}

	/**
	 * Sets the value of the zfbdt property.
	 * 
	 * @param value
	 *           allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setZfbdt(final XMLGregorianCalendar value)
	{
		this.zfbdt = value;
	}

	/**
	 * Gets the value of the zlspr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZlspr()
	{
		return zlspr;
	}

	/**
	 * Sets the value of the zlspr property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setZlspr(final String value)
	{
		this.zlspr = value;
	}

	/**
	 * Gets the value of the zlsch property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZlsch()
	{
		return zlsch;
	}

	/**
	 * Sets the value of the zlsch property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setZlsch(final String value)
	{
		this.zlsch = value;
	}

	/**
	 * Gets the value of the pycur property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPycur()
	{
		return pycur;
	}

	/**
	 * Sets the value of the pycur property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setPycur(final String value)
	{
		this.pycur = value;
	}

	/**
	 * Gets the value of the pyamt property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getPyamt()
	{
		return pyamt;
	}

	/**
	 * Sets the value of the pyamt property.
	 * 
	 * @param value
	 *           allowed object is {@link BigDecimal }
	 * 
	 */
	public void setPyamt(final BigDecimal value)
	{
		this.pyamt = value;
	}

	/**
	 * Gets the value of the bvtyp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBvtyp()
	{
		return bvtyp;
	}

	/**
	 * Sets the value of the bvtyp property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setBvtyp(final String value)
	{
		this.bvtyp = value;
	}

	/**
	 * Gets the value of the fdlev property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFdlev()
	{
		return fdlev;
	}

	/**
	 * Sets the value of the fdlev property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setFdlev(final String value)
	{
		this.fdlev = value;
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
	 * Gets the value of the qsskz property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQsskz()
	{
		return qsskz;
	}

	/**
	 * Sets the value of the qsskz property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setQsskz(final String value)
	{
		this.qsskz = value;
	}

	/**
	 * Gets the value of the bupla property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBupla()
	{
		return bupla;
	}

	/**
	 * Sets the value of the bupla property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setBupla(final String value)
	{
		this.bupla = value;
	}

	/**
	 * Gets the value of the secco property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSecco()
	{
		return secco;
	}

	/**
	 * Sets the value of the secco property.
	 * 
	 * @param value
	 *           allowed object is {@link String }
	 * 
	 */
	public void setSecco(final String value)
	{
		this.secco = value;
	}

}
