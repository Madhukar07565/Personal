
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindSubscriberAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindSubscriberAccountRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberAccountSearchFilter" type="{http://schema.provisioning.ws.highdeal.com/}SubscriberAccountSearchFilter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindSubscriberAccountRequest", propOrder = {
    "subscriberAccountSearchFilter"
})
public class FindSubscriberAccountRequest {

    @XmlElement(required = true)
    protected SubscriberAccountSearchFilter subscriberAccountSearchFilter;

    /**
     * Gets the value of the subscriberAccountSearchFilter property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberAccountSearchFilter }
     *     
     */
    public SubscriberAccountSearchFilter getSubscriberAccountSearchFilter() {
        return subscriberAccountSearchFilter;
    }

    /**
     * Sets the value of the subscriberAccountSearchFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberAccountSearchFilter }
     *     
     */
    public void setSubscriberAccountSearchFilter(SubscriberAccountSearchFilter value) {
        this.subscriberAccountSearchFilter = value;
    }

}
