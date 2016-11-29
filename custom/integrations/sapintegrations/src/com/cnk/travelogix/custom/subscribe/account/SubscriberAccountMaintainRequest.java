
package com.cnk.travelogix.custom.subscribe.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberAccountMaintainRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberAccountMaintainRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberAccount" type="{http://suac.ws.highdeal.com/}SubscriberAccount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberAccountMaintainRequest", propOrder = {
    "subscriberAccount"
})
public class SubscriberAccountMaintainRequest {

    @XmlElement(required = true)
    protected SubscriberAccount subscriberAccount;

    /**
     * Gets the value of the subscriberAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberAccount }
     *     
     */
    public SubscriberAccount getSubscriberAccount() {
        return subscriberAccount;
    }

    /**
     * Sets the value of the subscriberAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberAccount }
     *     
     */
    public void setSubscriberAccount(SubscriberAccount value) {
        this.subscriberAccount = value;
    }

}
