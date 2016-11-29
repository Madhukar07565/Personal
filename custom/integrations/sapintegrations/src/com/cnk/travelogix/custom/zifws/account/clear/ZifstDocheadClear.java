
package com.cnk.travelogix.custom.zifws.account.clear;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifstDocheadClear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifstDocheadClear">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uniqid" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="Account" type="{urn:sap-com:document:sap:rfc:functions}char16"/>
 *         &lt;element name="Budat" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="Blart" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Bukrs" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Waers" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/>
 *         &lt;element name="Agums" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Xblnr" type="{urn:sap-com:document:sap:rfc:functions}char16"/>
 *         &lt;element name="Bktxt" type="{urn:sap-com:document:sap:rfc:functions}char25"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifstDocheadClear", propOrder = {
    "uniqid",
    "account",
    "budat",
    "blart",
    "bukrs",
    "waers",
    "agums",
    "xblnr",
    "bktxt"
})
public class ZifstDocheadClear {

    @XmlElement(name = "Uniqid", required = true)
    protected String uniqid;
    @XmlElement(name = "Account", required = true)
    protected String account;
    @XmlElement(name = "Budat", required = true)
    protected String budat;
    @XmlElement(name = "Blart", required = true)
    protected String blart;
    @XmlElement(name = "Bukrs", required = true)
    protected String bukrs;
    @XmlElement(name = "Waers", required = true)
    protected String waers;
    @XmlElement(name = "Agums", required = true)
    protected String agums;
    @XmlElement(name = "Xblnr", required = true)
    protected String xblnr;
    @XmlElement(name = "Bktxt", required = true)
    protected String bktxt;

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
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the budat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudat() {
        return budat;
    }

    /**
     * Sets the value of the budat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudat(String value) {
        this.budat = value;
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
     * Gets the value of the agums property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgums() {
        return agums;
    }

    /**
     * Sets the value of the agums property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgums(String value) {
        this.agums = value;
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

}
