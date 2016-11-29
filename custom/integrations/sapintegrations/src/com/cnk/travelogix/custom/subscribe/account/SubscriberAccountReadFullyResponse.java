
package com.cnk.travelogix.custom.subscribe.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberAccountReadFullyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberAccountReadFullyResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}Response">
 *       &lt;sequence>
 *         &lt;element name="subscriberAccount" type="{http://suac.ws.highdeal.com/}SubscriberAccountWithAccounts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberAccountReadFullyResponse", propOrder = {
    "subscriberAccount"
})
public class SubscriberAccountReadFullyResponse
    extends Response
{

    protected SubscriberAccountWithAccounts subscriberAccount;

    /**
     * Gets the value of the subscriberAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberAccountWithAccounts }
     *     
     */
    public SubscriberAccountWithAccounts getSubscriberAccount() {
        return subscriberAccount;
    }

    /**
     * Sets the value of the subscriberAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberAccountWithAccounts }
     *     
     */
    public void setSubscriberAccount(SubscriberAccountWithAccounts value) {
        this.subscriberAccount = value;
    }

}
