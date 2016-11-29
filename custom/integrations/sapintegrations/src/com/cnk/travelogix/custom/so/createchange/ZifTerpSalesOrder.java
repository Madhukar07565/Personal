
package com.cnk.travelogix.custom.so.createchange;

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
 *         &lt;element name="SoConditions" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZttTerpSoConditions" minOccurs="0"/>
 *         &lt;element name="SoHeader" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifTerpSoHeader" minOccurs="0"/>
 *         &lt;element name="SoItems" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZttTerpSoItemData" minOccurs="0"/>
 *         &lt;element name="SoPartners" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZttTerpSoPartners" minOccurs="0"/>
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
    "soConditions",
    "soHeader",
    "soItems",
    "soPartners"
})
@XmlRootElement(name = "ZifTerpSalesOrder", namespace = "urn:sap-com:document:sap:rfc:functions")
public class ZifTerpSalesOrder {

    @XmlElement(name = "SoConditions")
    protected ZttTerpSoConditions soConditions;
    @XmlElement(name = "SoHeader")
    protected ZifTerpSoHeader soHeader;
    @XmlElement(name = "SoItems")
    protected ZttTerpSoItemData soItems;
    @XmlElement(name = "SoPartners")
    protected ZttTerpSoPartners soPartners;

    /**
     * Gets the value of the soConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ZttTerpSoConditions }
     *     
     */
    public ZttTerpSoConditions getSoConditions() {
        return soConditions;
    }

    /**
     * Sets the value of the soConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZttTerpSoConditions }
     *     
     */
    public void setSoConditions(ZttTerpSoConditions value) {
        this.soConditions = value;
    }

    /**
     * Gets the value of the soHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ZifTerpSoHeader }
     *     
     */
    public ZifTerpSoHeader getSoHeader() {
        return soHeader;
    }

    /**
     * Sets the value of the soHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifTerpSoHeader }
     *     
     */
    public void setSoHeader(ZifTerpSoHeader value) {
        this.soHeader = value;
    }

    /**
     * Gets the value of the soItems property.
     * 
     * @return
     *     possible object is
     *     {@link ZttTerpSoItemData }
     *     
     */
    public ZttTerpSoItemData getSoItems() {
        return soItems;
    }

    /**
     * Sets the value of the soItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZttTerpSoItemData }
     *     
     */
    public void setSoItems(ZttTerpSoItemData value) {
        this.soItems = value;
    }

    /**
     * Gets the value of the soPartners property.
     * 
     * @return
     *     possible object is
     *     {@link ZttTerpSoPartners }
     *     
     */
    public ZttTerpSoPartners getSoPartners() {
        return soPartners;
    }

    /**
     * Sets the value of the soPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZttTerpSoPartners }
     *     
     */
    public void setSoPartners(ZttTerpSoPartners value) {
        this.soPartners = value;
    }

}
