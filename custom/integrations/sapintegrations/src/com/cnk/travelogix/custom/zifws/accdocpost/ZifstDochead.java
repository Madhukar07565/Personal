
package com.cnk.travelogix.custom.zifws.accdocpost;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ZifstDochead complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifstDochead">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uniqid" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="Bldat" type="{urn:sap-com:document:sap:rfc:functions}date"/>
 *         &lt;element name="Blart" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Bukrs" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Budat" type="{urn:sap-com:document:sap:rfc:functions}date"/>
 *         &lt;element name="Waers" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/>
 *         &lt;element name="Kursf" type="{urn:sap-com:document:sap:rfc:functions}decimal9.5"/>
 *         &lt;element name="Xblnr" type="{urn:sap-com:document:sap:rfc:functions}char16"/>
 *         &lt;element name="Bktxt" type="{urn:sap-com:document:sap:rfc:functions}char25"/>
 *         &lt;element name="Uname" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifstDochead", propOrder = {
    "uniqid",
    "bldat",
    "blart",
    "bukrs",
    "budat",
    "waers",
    "kursf",
    "xblnr",
    "bktxt",
    "uname"
})
public class ZifstDochead {

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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqid() {
        return uniqid;
    }

    /**
     * Sets the value of the uniqid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqid(String value) {
        this.uniqid = value;
    }

    /**
     * Gets the value of the bldat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBldat() {
        return bldat;
    }

    /**
     * Sets the value of the bldat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBldat(XMLGregorianCalendar value) {
        this.bldat = value;
    }

    /**
     * Gets the value of the blart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlart() {
        return blart;
    }

    /**
     * Sets the value of the blart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlart(String value) {
        this.blart = value;
    }

    /**
     * Gets the value of the bukrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBukrs() {
        return bukrs;
    }

    /**
     * Sets the value of the bukrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBukrs(String value) {
        this.bukrs = value;
    }

    /**
     * Gets the value of the budat property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBudat() {
        return budat;
    }

    /**
     * Sets the value of the budat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBudat(XMLGregorianCalendar value) {
        this.budat = value;
    }

    /**
     * Gets the value of the waers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaers() {
        return waers;
    }

    /**
     * Sets the value of the waers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaers(String value) {
        this.waers = value;
    }

    /**
     * Gets the value of the kursf property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKursf() {
        return kursf;
    }

    /**
     * Sets the value of the kursf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKursf(BigDecimal value) {
        this.kursf = value;
    }

    /**
     * Gets the value of the xblnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXblnr() {
        return xblnr;
    }

    /**
     * Sets the value of the xblnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXblnr(String value) {
        this.xblnr = value;
    }

    /**
     * Gets the value of the bktxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBktxt() {
        return bktxt;
    }

    /**
     * Sets the value of the bktxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBktxt(String value) {
        this.bktxt = value;
    }

    /**
     * Gets the value of the uname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUname() {
        return uname;
    }

    /**
     * Sets the value of the uname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUname(String value) {
        this.uname = value;
    }

}
