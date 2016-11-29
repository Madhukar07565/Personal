
package com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback;

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
 *         &lt;element name="Status" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZttTerpComplaintsStatus"/>
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
    "status"
})
@XmlRootElement(name = "ZifTerpComplaintsResponse", namespace = "urn:sap-com:document:sap:rfc:functions")
public class ZifTerpComplaintsResponse {

    @XmlElement(name = "Status", required = true)
    protected ZttTerpComplaintsStatus status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ZttTerpComplaintsStatus }
     *     
     */
    public ZttTerpComplaintsStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZttTerpComplaintsStatus }
     *     
     */
    public void setStatus(ZttTerpComplaintsStatus value) {
        this.status = value;
    }

}
