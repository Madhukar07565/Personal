
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidAccountMaintainRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidAccountMaintainRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prepaidAccount" type="{http://suac.ws.highdeal.com/}PrepaidAccount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidAccountMaintainRequest", propOrder = {
    "prepaidAccount"
})
public class PrepaidAccountMaintainRequest {

    @XmlElement(required = true)
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
