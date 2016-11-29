
package com.cnk.travelogix.custom.subscribe.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidAccountCancelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidAccountCancelRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prepaidAccountReference" type="{http://suac.ws.highdeal.com/}PrepaidAccountReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidAccountCancelRequest", propOrder = {
    "prepaidAccountReference"
})
public class PrepaidAccountCancelRequest {

    @XmlElement(required = true)
    protected PrepaidAccountReference prepaidAccountReference;

    /**
     * Gets the value of the prepaidAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidAccountReference }
     *     
     */
    public PrepaidAccountReference getPrepaidAccountReference() {
        return prepaidAccountReference;
    }

    /**
     * Sets the value of the prepaidAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidAccountReference }
     *     
     */
    public void setPrepaidAccountReference(PrepaidAccountReference value) {
        this.prepaidAccountReference = value;
    }

}
