
package com.cnk.travelogix.custom.zifws.account.clear;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifstAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifstAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{urn:sap-com:document:sap:rfc:functions}char16"/>
 *         &lt;element name="Xblnr" type="{urn:sap-com:document:sap:rfc:functions}char16"/>
 *         &lt;element name="Zuonr" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Belnr" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Budat" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="Wrbtr" type="{urn:sap-com:document:sap:rfc:functions}curr13.2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifstAccount", propOrder = {
    "account",
    "xblnr",
    "zuonr",
    "belnr",
    "budat",
    "wrbtr"
})
public class ZifstAccount {

    @XmlElement(name = "Account", required = true)
    protected String account;
    @XmlElement(name = "Xblnr", required = true)
    protected String xblnr;
    @XmlElement(name = "Zuonr", required = true)
    protected String zuonr;
    @XmlElement(name = "Belnr", required = true)
    protected String belnr;
    @XmlElement(name = "Budat", required = true)
    protected String budat;
    @XmlElement(name = "Wrbtr", required = true)
    protected BigDecimal wrbtr;

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
     * Gets the value of the belnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelnr() {
        return belnr;
    }

    /**
     * Sets the value of the belnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelnr(String value) {
        this.belnr = value;
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

}
