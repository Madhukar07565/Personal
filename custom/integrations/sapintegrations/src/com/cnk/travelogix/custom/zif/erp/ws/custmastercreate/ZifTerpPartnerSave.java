
package com.cnk.travelogix.custom.zif.erp.ws.custmastercreate;

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
 *         &lt;element name="ContactData" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifErpTtContmast"/>
 *         &lt;element name="CustomerData" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifErpStCustmast"/>
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
    "contactData",
    "customerData"
})
@XmlRootElement(name = "ZifTerpPartnerSave")
public class ZifTerpPartnerSave {

    @XmlElement(name = "ContactData", required = true)
    protected ZifErpTtContmast contactData;
    @XmlElement(name = "CustomerData", required = true)
    protected ZifErpStCustmast customerData;

    /**
     * Gets the value of the contactData property.
     * 
     * @return
     *     possible object is
     *     {@link ZifErpTtContmast }
     *     
     */
    public ZifErpTtContmast getContactData() {
        return contactData;
    }

    /**
     * Sets the value of the contactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifErpTtContmast }
     *     
     */
    public void setContactData(ZifErpTtContmast value) {
        this.contactData = value;
    }

    /**
     * Gets the value of the customerData property.
     * 
     * @return
     *     possible object is
     *     {@link ZifErpStCustmast }
     *     
     */
    public ZifErpStCustmast getCustomerData() {
        return customerData;
    }

    /**
     * Sets the value of the customerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifErpStCustmast }
     *     
     */
    public void setCustomerData(ZifErpStCustmast value) {
        this.customerData = value;
    }

}
