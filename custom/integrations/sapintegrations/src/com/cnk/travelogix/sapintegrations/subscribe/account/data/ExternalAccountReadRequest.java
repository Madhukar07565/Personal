
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalAccountReadRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalAccountReadRequest">
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
@XmlType(name = "ExternalAccountReadRequest", propOrder = {
    "externalAccountReference"
})
public class ExternalAccountReadRequest {

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
