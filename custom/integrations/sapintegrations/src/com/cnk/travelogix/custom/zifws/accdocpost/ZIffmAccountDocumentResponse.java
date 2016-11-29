
package com.cnk.travelogix.custom.zifws.accdocpost;

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
 *         &lt;element name="EStatus" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifttStatusDoc"/>
 *         &lt;element name="ItAccountgl" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZifstGlacc"/>
 *         &lt;element name="ItCustomer" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZifstCustomer"/>
 *         &lt;element name="ItVendor" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZifstVendor"/>
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
    "eStatus",
    "itAccountgl",
    "itCustomer",
    "itVendor"
})
@XmlRootElement(name = "ZIffmAccountDocumentResponse")
public class ZIffmAccountDocumentResponse {

    @XmlElement(name = "EStatus", required = true)
    protected ZifttStatusDoc eStatus;
    @XmlElement(name = "ItAccountgl", required = true)
    protected TableOfZifstGlacc itAccountgl;
    @XmlElement(name = "ItCustomer", required = true)
    protected TableOfZifstCustomer itCustomer;
    @XmlElement(name = "ItVendor", required = true)
    protected TableOfZifstVendor itVendor;

    /**
     * Gets the value of the eStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ZifttStatusDoc }
     *     
     */
    public ZifttStatusDoc getEStatus() {
        return eStatus;
    }

    /**
     * Sets the value of the eStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifttStatusDoc }
     *     
     */
    public void setEStatus(ZifttStatusDoc value) {
        this.eStatus = value;
    }

    /**
     * Gets the value of the itAccountgl property.
     * 
     * @return
     *     possible object is
     *     {@link TableOfZifstGlacc }
     *     
     */
    public TableOfZifstGlacc getItAccountgl() {
        return itAccountgl;
    }

    /**
     * Sets the value of the itAccountgl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfZifstGlacc }
     *     
     */
    public void setItAccountgl(TableOfZifstGlacc value) {
        this.itAccountgl = value;
    }

    /**
     * Gets the value of the itCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link TableOfZifstCustomer }
     *     
     */
    public TableOfZifstCustomer getItCustomer() {
        return itCustomer;
    }

    /**
     * Sets the value of the itCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfZifstCustomer }
     *     
     */
    public void setItCustomer(TableOfZifstCustomer value) {
        this.itCustomer = value;
    }

    /**
     * Gets the value of the itVendor property.
     * 
     * @return
     *     possible object is
     *     {@link TableOfZifstVendor }
     *     
     */
    public TableOfZifstVendor getItVendor() {
        return itVendor;
    }

    /**
     * Sets the value of the itVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfZifstVendor }
     *     
     */
    public void setItVendor(TableOfZifstVendor value) {
        this.itVendor = value;
    }

}
