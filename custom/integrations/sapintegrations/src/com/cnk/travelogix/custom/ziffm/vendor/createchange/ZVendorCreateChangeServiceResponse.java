
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
 *         &lt;element name="EtStatus" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifttStatusDoc"/>
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
    "etStatus"
})
@XmlRootElement(name = "ZVendorCreateChangeServiceResponse")
public class ZVendorCreateChangeServiceResponse {

    @XmlElement(name = "EtStatus", required = true)
    protected ZifttStatusDoc etStatus;

    /**
     * Gets the value of the etStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ZifttStatusDoc }
     *     
     */
    public ZifttStatusDoc getEtStatus() {
        return etStatus;
    }

    /**
     * Sets the value of the etStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifttStatusDoc }
     *     
     */
    public void setEtStatus(ZifttStatusDoc value) {
        this.etStatus = value;
    }

}
