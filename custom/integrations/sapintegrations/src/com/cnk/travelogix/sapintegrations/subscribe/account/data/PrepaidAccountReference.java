
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidAccountReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidAccountReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberAccountId" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="prepaidAccountId" type="{http://schema.ws.highdeal.com/}String256"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidAccountReference", namespace = "http://suac.ws.highdeal.com/", propOrder = {
    "subscriberAccountId",
    "prepaidAccountId"
})
public class PrepaidAccountReference {

    @XmlElement(required = true)
    protected String subscriberAccountId;
    @XmlElement(required = true)
    protected String prepaidAccountId;

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
     * Gets the value of the prepaidAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidAccountId() {
        return prepaidAccountId;
    }

    /**
     * Sets the value of the prepaidAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidAccountId(String value) {
        this.prepaidAccountId = value;
    }

}
