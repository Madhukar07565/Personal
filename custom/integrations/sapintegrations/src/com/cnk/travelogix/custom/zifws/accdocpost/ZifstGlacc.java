
package com.cnk.travelogix.custom.zifws.accdocpost;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ZifstGlacc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifstGlacc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bschl" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Saknr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Wrbtr" type="{urn:sap-com:document:sap:rfc:functions}curr13.2"/>
 *         &lt;element name="Wmwst" type="{urn:sap-com:document:sap:rfc:functions}curr13.2"/>
 *         &lt;element name="Mwskz" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Xmwst" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Kostl" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Vbel2" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Posn2" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/>
 *         &lt;element name="Aufnr" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="Prctr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Sgtxt" type="{urn:sap-com:document:sap:rfc:functions}char50"/>
 *         &lt;element name="Zuonr" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Valut" type="{urn:sap-com:document:sap:rfc:functions}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifstGlacc", propOrder = {
    "bschl",
    "saknr",
    "wrbtr",
    "wmwst",
    "mwskz",
    "xmwst",
    "kostl",
    "vbel2",
    "posn2",
    "aufnr",
    "prctr",
    "sgtxt",
    "zuonr",
    "valut"
})
public class ZifstGlacc {

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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBschl() {
        return bschl;
    }

    /**
     * Sets the value of the bschl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBschl(String value) {
        this.bschl = value;
    }

    /**
     * Gets the value of the saknr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaknr() {
        return saknr;
    }

    /**
     * Sets the value of the saknr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaknr(String value) {
        this.saknr = value;
    }

    /**
     * Gets the value of the wrbtr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWrbtr() {
        return wrbtr;
    }

    /**
     * Sets the value of the wrbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWrbtr(BigDecimal value) {
        this.wrbtr = value;
    }

    /**
     * Gets the value of the wmwst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWmwst() {
        return wmwst;
    }

    /**
     * Sets the value of the wmwst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWmwst(BigDecimal value) {
        this.wmwst = value;
    }

    /**
     * Gets the value of the mwskz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMwskz() {
        return mwskz;
    }

    /**
     * Sets the value of the mwskz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMwskz(String value) {
        this.mwskz = value;
    }

    /**
     * Gets the value of the xmwst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmwst() {
        return xmwst;
    }

    /**
     * Sets the value of the xmwst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmwst(String value) {
        this.xmwst = value;
    }

    /**
     * Gets the value of the kostl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKostl() {
        return kostl;
    }

    /**
     * Sets the value of the kostl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKostl(String value) {
        this.kostl = value;
    }

    /**
     * Gets the value of the vbel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVbel2() {
        return vbel2;
    }

    /**
     * Sets the value of the vbel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVbel2(String value) {
        this.vbel2 = value;
    }

    /**
     * Gets the value of the posn2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosn2() {
        return posn2;
    }

    /**
     * Sets the value of the posn2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosn2(String value) {
        this.posn2 = value;
    }

    /**
     * Gets the value of the aufnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAufnr() {
        return aufnr;
    }

    /**
     * Sets the value of the aufnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAufnr(String value) {
        this.aufnr = value;
    }

    /**
     * Gets the value of the prctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrctr() {
        return prctr;
    }

    /**
     * Sets the value of the prctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrctr(String value) {
        this.prctr = value;
    }

    /**
     * Gets the value of the sgtxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgtxt() {
        return sgtxt;
    }

    /**
     * Sets the value of the sgtxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgtxt(String value) {
        this.sgtxt = value;
    }

    /**
     * Gets the value of the zuonr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZuonr() {
        return zuonr;
    }

    /**
     * Sets the value of the zuonr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZuonr(String value) {
        this.zuonr = value;
    }

    /**
     * Gets the value of the valut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValut() {
        return valut;
    }

    /**
     * Sets the value of the valut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValut(XMLGregorianCalendar value) {
        this.valut = value;
    }

}
