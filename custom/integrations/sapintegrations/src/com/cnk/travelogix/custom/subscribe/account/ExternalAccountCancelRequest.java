
package com.cnk.travelogix.custom.subscribe.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalAccountCancelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalAccountCancelRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalAccountReference" type="{http://suac.ws.highdeal.com/}ExternalAccountReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalAccountCancelRequest", propOrder = {
    "externalAccountReference"
})
public class ExternalAccountCancelRequest {

    @XmlElement(required = true)
    protected ExternalAccountReference externalAccountReference;

    /**
     * Gets the value of the externalAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalAccountReference }
     *     
     */
    public ExternalAccountReference getExternalAccountReference() {
        return externalAccountReference;
    }

    /**
     * Sets the value of the externalAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalAccountReference }
     *     
     */
    public void setExternalAccountReference(ExternalAccountReference value) {
        this.externalAccountReference = value;
    }

}
