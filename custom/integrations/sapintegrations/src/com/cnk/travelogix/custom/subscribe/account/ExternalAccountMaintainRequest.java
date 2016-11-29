
package com.cnk.travelogix.custom.subscribe.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalAccountMaintainRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalAccountMaintainRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalAccount" type="{http://suac.ws.highdeal.com/}ExternalAccount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalAccountMaintainRequest", propOrder = {
    "externalAccount"
})
public class ExternalAccountMaintainRequest {

    @XmlElement(required = true)
    protected ExternalAccount externalAccount;

    /**
     * Gets the value of the externalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalAccount }
     *     
     */
    public ExternalAccount getExternalAccount() {
        return externalAccount;
    }

    /**
     * Sets the value of the externalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalAccount }
     *     
     */
    public void setExternalAccount(ExternalAccount value) {
        this.externalAccount = value;
    }

}
