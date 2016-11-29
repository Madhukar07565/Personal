
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidAccountOperationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidAccountOperationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}Response">
 *       &lt;sequence>
 *         &lt;element name="prepaidAccountReference" type="{http://suac.ws.highdeal.com/}PrepaidAccountReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidAccountOperationResponse", propOrder = {
    "prepaidAccountReference"
})
public class PrepaidAccountOperationResponse
    extends Response
{

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
