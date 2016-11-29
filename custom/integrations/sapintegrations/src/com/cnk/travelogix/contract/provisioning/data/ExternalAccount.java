
package com.cnk.travelogix.contract.provisioning.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="subscriberAccountId" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="description" type="{http://schema.ws.highdeal.com/}String2000" minOccurs="0"/>
 *         &lt;element name="additionalId" type="{http://schema.ws.highdeal.com/}String256" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://schema.ws.highdeal.com/}CurrencyCode" minOccurs="0"/>
 *         &lt;element name="externalSystemCode" type="{http://schema.ws.highdeal.com/}String256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalAccount", namespace = "http://suac.ws.highdeal.com/", propOrder = {
    "id",
    "subscriberAccountId",
    "description",
    "additionalId",
    "currencyCode",
    "externalSystemCode"
})
public class ExternalAccount {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String subscriberAccountId;
    protected String description;
    protected String additionalId;
    protected String currencyCode;
    protected String externalSystemCode;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the externalSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSystemCode() {
        return externalSystemCode;
    }

    /**
     * Sets the value of the externalSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSystemCode(String value) {
        this.externalSystemCode = value;
    }

}
