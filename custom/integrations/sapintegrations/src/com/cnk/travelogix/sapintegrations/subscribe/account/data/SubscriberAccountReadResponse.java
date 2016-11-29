
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberAccountReadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberAccountReadResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}Response">
 *       &lt;sequence>
 *         &lt;element name="subscriberAccount" type="{http://suac.ws.highdeal.com/}SubscriberAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberAccountReadResponse", propOrder = {
    "subscriberAccount"
})
public class SubscriberAccountReadResponse
    extends Response
{

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
