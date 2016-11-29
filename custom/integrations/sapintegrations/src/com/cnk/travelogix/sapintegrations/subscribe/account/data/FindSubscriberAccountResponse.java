
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindSubscriberAccountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindSubscriberAccountResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}SearchResponse">
 *       &lt;sequence>
 *         &lt;element name="subscriberAccount" type="{http://suac.ws.highdeal.com/}SubscriberAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindSubscriberAccountResponse", propOrder = {
    "subscriberAccount"
})
public class FindSubscriberAccountResponse
    extends SearchResponse
{

    protected List<SubscriberAccount> subscriberAccount;

    /**
     * Gets the value of the subscriberAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberAccount }
     * 
     * 
     */
    public List<SubscriberAccount> getSubscriberAccount() {
        if (subscriberAccount == null) {
            subscriberAccount = new ArrayList<SubscriberAccount>();
        }
        return this.subscriberAccount;
    }

}
