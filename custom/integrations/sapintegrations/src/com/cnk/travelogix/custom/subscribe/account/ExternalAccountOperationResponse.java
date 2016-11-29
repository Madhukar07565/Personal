
package com.cnk.travelogix.custom.subscribe.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalAccountOperationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalAccountOperationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}Response">
 *       &lt;sequence>
 *         &lt;element name="externalAccountReference" type="{http://suac.ws.highdeal.com/}ExternalAccountReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalAccountOperationResponse", propOrder = {
    "externalAccountReference"
})
public class ExternalAccountOperationResponse
    extends Response
{

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
