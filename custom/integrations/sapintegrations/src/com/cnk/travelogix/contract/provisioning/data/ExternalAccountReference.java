
package com.cnk.travelogix.contract.provisioning.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalAccountReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalAccountReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberAccountId" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="externalAccountId" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="additionalId" type="{http://schema.ws.highdeal.com/}String256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalAccountReference", namespace = "http://suac.ws.highdeal.com/", propOrder = {
    "subscriberAccountId",
    "externalAccountId",
    "additionalId"
})
public class ExternalAccountReference {

    @XmlElement(required = true)
    protected String subscriberAccountId;
    @XmlElement(required = true)
    protected String externalAccountId;
    protected String additionalId;

    /**
     * Gets the value of the subscriberAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberAccountId() {
        return subscriberAccountId;
    }

    /**
     * Sets the value of the subscriberAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberAccountId(String value) {
        this.subscriberAccountId = value;
    }

    /**
     * Gets the value of the externalAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAccountId() {
        return externalAccountId;
    }

    /**
     * Sets the value of the externalAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAccountId(String value) {
        this.externalAccountId = value;
    }

    /**
     * Gets the value of the additionalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalId() {
        return additionalId;
    }

    /**
     * Sets the value of the additionalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalId(String value) {
        this.additionalId = value;
    }

}
