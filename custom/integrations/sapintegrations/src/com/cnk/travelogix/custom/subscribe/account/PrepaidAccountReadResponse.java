
package com.cnk.travelogix.custom.subscribe.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidAccountReadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidAccountReadResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}Response">
 *       &lt;sequence>
 *         &lt;element name="prepaidAccount" type="{http://suac.ws.highdeal.com/}PrepaidAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidAccountReadResponse", propOrder = {
    "prepaidAccount"
})
public class PrepaidAccountReadResponse
    extends Response
{

    protected PrepaidAccount prepaidAccount;

    /**
     * Gets the value of the prepaidAccount property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidAccount }
     *     
     */
    public PrepaidAccount getPrepaidAccount() {
        return prepaidAccount;
    }

    /**
     * Sets the value of the prepaidAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidAccount }
     *     
     */
    public void setPrepaidAccount(PrepaidAccount value) {
        this.prepaidAccount = value;
    }

}
