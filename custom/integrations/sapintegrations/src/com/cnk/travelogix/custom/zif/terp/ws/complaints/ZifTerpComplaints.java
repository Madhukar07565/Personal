
package com.cnk.travelogix.custom.zif.terp.ws.complaints;

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
 *         &lt;element name="CompHeader" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifTerpComplaintsHeader"/>
 *         &lt;element name="CompItem" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZttTerpComplaintsItems" minOccurs="0"/>
 *         &lt;element name="CompPartners" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZttTerpComplaintsPartners" minOccurs="0"/>
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
    "compHeader",
    "compItem",
    "compPartners"
})
@XmlRootElement(name = "ZifTerpComplaints")
public class ZifTerpComplaints {

    @XmlElement(name = "CompHeader", required = true)
    protected ZifTerpComplaintsHeader compHeader;
    @XmlElement(name = "CompItem")
    protected ZttTerpComplaintsItems compItem;
    @XmlElement(name = "CompPartners")
    protected ZttTerpComplaintsPartners compPartners;

    /**
     * Gets the value of the compHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ZifTerpComplaintsHeader }
     *     
     */
    public ZifTerpComplaintsHeader getCompHeader() {
        return compHeader;
    }

    /**
     * Sets the value of the compHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifTerpComplaintsHeader }
     *     
     */
    public void setCompHeader(ZifTerpComplaintsHeader value) {
        this.compHeader = value;
    }

    /**
     * Gets the value of the compItem property.
     * 
     * @return
     *     possible object is
     *     {@link ZttTerpComplaintsItems }
     *     
     */
    public ZttTerpComplaintsItems getCompItem() {
        return compItem;
    }

    /**
     * Sets the value of the compItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZttTerpComplaintsItems }
     *     
     */
    public void setCompItem(ZttTerpComplaintsItems value) {
        this.compItem = value;
    }

    /**
     * Gets the value of the compPartners property.
     * 
     * @return
     *     possible object is
     *     {@link ZttTerpComplaintsPartners }
     *     
     */
    public ZttTerpComplaintsPartners getCompPartners() {
        return compPartners;
    }

    /**
     * Sets the value of the compPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZttTerpComplaintsPartners }
     *     
     */
    public void setCompPartners(ZttTerpComplaintsPartners value) {
        this.compPartners = value;
    }

}
