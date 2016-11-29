
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
 *         &lt;element name="IDocheader" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifstDochead"/>
 *         &lt;element name="ItAccountgl" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZifstGlacc" minOccurs="0"/>
 *         &lt;element name="ItCustomer" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZifstCustomer" minOccurs="0"/>
 *         &lt;element name="ItVendor" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZifstVendor" minOccurs="0"/>
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
    "iDocheader",
    "itAccountgl",
    "itCustomer",
    "itVendor"
})
@XmlRootElement(name = "ZIffmAccountDocument")
public class ZIffmAccountDocument {

    @XmlElement(name = "IDocheader", required = true)
    protected ZifstDochead iDocheader;
    @XmlElement(name = "ItAccountgl")
    protected TableOfZifstGlacc itAccountgl;
    @XmlElement(name = "ItCustomer")
    protected TableOfZifstCustomer itCustomer;
    @XmlElement(name = "ItVendor")
    protected TableOfZifstVendor itVendor;

    /**
     * Gets the value of the iDocheader property.
     * 
     * @return
     *     possible object is
     *     {@link ZifstDochead }
     *     
     */
    public ZifstDochead getIDocheader() {
        return iDocheader;
    }

    /**
     * Sets the value of the iDocheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifstDochead }
     *     
     */
    public void setIDocheader(ZifstDochead value) {
        this.iDocheader = value;
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
