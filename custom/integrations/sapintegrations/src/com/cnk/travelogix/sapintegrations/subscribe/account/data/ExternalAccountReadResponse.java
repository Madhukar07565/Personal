
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalAccountReadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalAccountReadResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}Response">
 *       &lt;sequence>
 *         &lt;element name="externalAccount" type="{http://suac.ws.highdeal.com/}ExternalAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalAccountReadResponse", propOrder = {
    "externalAccount"
})
public class ExternalAccountReadResponse
    extends Response
{

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
