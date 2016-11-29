
package com.cnk.travelogix.contract.provisioning.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberAccountWithAccounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberAccountWithAccounts">
 *   &lt;complexContent>
 *     &lt;extension base="{http://suac.ws.highdeal.com/}SubscriberAccount">
 *       &lt;sequence>
 *         &lt;element name="externalAccount" type="{http://suac.ws.highdeal.com/}ExternalAccount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prepaidAccount" type="{http://suac.ws.highdeal.com/}PrepaidAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberAccountWithAccounts", namespace = "http://suac.ws.highdeal.com/", propOrder = {
    "externalAccount",
    "prepaidAccount"
})
public class SubscriberAccountWithAccounts
    extends SubscriberAccount
{

    protected List<ExternalAccount> externalAccount;
    protected List<PrepaidAccount> prepaidAccount;

    /**
     * Gets the value of the externalAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalAccount }
     * 
     * 
     */
    public List<ExternalAccount> getExternalAccount() {
        if (externalAccount == null) {
            externalAccount = new ArrayList<ExternalAccount>();
        }
        return this.externalAccount;
    }

    /**
     * Gets the value of the prepaidAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prepaidAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrepaidAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrepaidAccount }
     * 
     * 
     */
    public List<PrepaidAccount> getPrepaidAccount() {
        if (prepaidAccount == null) {
            prepaidAccount = new ArrayList<PrepaidAccount>();
        }
        return this.prepaidAccount;
    }

}
