
package com.cnk.travelogix.custom.ziffm.vendor.createchange;

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
 *         &lt;element name="IsVendorInput" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZvendorInput"/>
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
    "isVendorInput"
})
@XmlRootElement(name = "ZVendorCreateChangeService")
public class ZVendorCreateChangeService {

    @XmlElement(name = "IsVendorInput", required = true)
    protected ZvendorInput isVendorInput;

    /**
     * Gets the value of the isVendorInput property.
     * 
     * @return
     *     possible object is
     *     {@link ZvendorInput }
     *     
     */
    public ZvendorInput getIsVendorInput() {
        return isVendorInput;
    }

    /**
     * Sets the value of the isVendorInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZvendorInput }
     *     
     */
    public void setIsVendorInput(ZvendorInput value) {
        this.isVendorInput = value;
    }

}
