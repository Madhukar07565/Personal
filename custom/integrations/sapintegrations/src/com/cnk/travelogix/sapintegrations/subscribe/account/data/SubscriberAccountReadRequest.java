
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberAccountReadRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberAccountReadRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberAccountId" type="{http://schema.ws.highdeal.com/}String256"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberAccountReadRequest", propOrder = {
    "subscriberAccountId"
})
public class SubscriberAccountReadRequest {

    @XmlElement(required = true)
    protected String subscriberAccountId;

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

}
