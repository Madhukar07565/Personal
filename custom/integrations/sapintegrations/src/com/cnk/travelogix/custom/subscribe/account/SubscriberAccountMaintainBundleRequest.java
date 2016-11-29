
package com.cnk.travelogix.custom.subscribe.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberAccountMaintainBundleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberAccountMaintainBundleRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schema.provisioning.ws.highdeal.com/}subscriberAccountMaintainRequest" maxOccurs="1000"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberAccountMaintainBundleRequest", propOrder = {
    "subscriberAccountMaintainRequest"
})
public class SubscriberAccountMaintainBundleRequest {

    @XmlElement(namespace = "http://schema.provisioning.ws.highdeal.com/", required = true)
    protected List<SubscriberAccountMaintainRequest> subscriberAccountMaintainRequest;

    /**
     * Gets the value of the subscriberAccountMaintainRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberAccountMaintainRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberAccountMaintainRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberAccountMaintainRequest }
     * 
     * 
     */
    public List<SubscriberAccountMaintainRequest> getSubscriberAccountMaintainRequest() {
        if (subscriberAccountMaintainRequest == null) {
            subscriberAccountMaintainRequest = new ArrayList<SubscriberAccountMaintainRequest>();
        }
        return this.subscriberAccountMaintainRequest;
    }

}
