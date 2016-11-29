
package com.cnk.travelogix.custom.zif.erp.ws.custmastercreate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifErpStStatusC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifErpStStatusC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegacyId" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Customer" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Status" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Messagetype" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Message" type="{urn:sap-com:document:sap:rfc:functions}char255"/>
 *         &lt;element name="Sysubrc" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifErpStStatusC", propOrder = {
    "legacyId",
    "customer",
    "status",
    "messagetype",
    "message",
    "sysubrc"
})
public class ZifErpStStatusC {

    @XmlElement(name = "LegacyId", required = true)
    protected String legacyId;
    @XmlElement(name = "Customer", required = true)
    protected String customer;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Messagetype", required = true)
    protected String messagetype;
    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "Sysubrc", required = true)
    protected String sysubrc;

    /**
     * Gets the value of the legacyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyId() {
        return legacyId;
    }

    /**
     * Sets the value of the legacyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyId(String value) {
        this.legacyId = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the messagetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagetype() {
        return messagetype;
    }

    /**
     * Sets the value of the messagetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagetype(String value) {
        this.messagetype = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the sysubrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysubrc() {
        return sysubrc;
    }

    /**
     * Sets the value of the sysubrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysubrc(String value) {
        this.sysubrc = value;
    }

}
