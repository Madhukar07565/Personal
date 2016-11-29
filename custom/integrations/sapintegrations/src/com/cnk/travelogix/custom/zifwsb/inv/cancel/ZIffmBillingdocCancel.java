
package com.cnk.travelogix.custom.zifwsb.inv.cancel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PBillingdoc" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="PUniqid" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pBillingdoc",
    "pUniqid"
})
@XmlRootElement(name = "ZIffmBillingdocCancel")
public class ZIffmBillingdocCancel {

    @XmlElement(name = "PBillingdoc", required = true)
    protected String pBillingdoc;
    @XmlElement(name = "PUniqid", required = true)
    protected String pUniqid;

    /**
     * Gets the value of the pBillingdoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBillingdoc() {
        return pBillingdoc;
    }

    /**
     * Sets the value of the pBillingdoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBillingdoc(String value) {
        this.pBillingdoc = value;
    }

    /**
     * Gets the value of the pUniqid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUniqid() {
        return pUniqid;
    }

    /**
     * Sets the value of the pUniqid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUniqid(String value) {
        this.pUniqid = value;
    }

}
