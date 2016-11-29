
package com.cnk.travelogix.contract.provisioning.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingContractItemAccountAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargingContractItemAccountAssignment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://contract.ws.highdeal.com/}ChargingContractItemRevisionAccountAssignment">
 *       &lt;sequence>
 *         &lt;element name="type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://schema.ws.highdeal.com/}String256">
 *               &lt;enumeration value="postpaid"/>
 *               &lt;enumeration value="prepaid"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargingContractItemAccountAssignment", namespace = "http://contract.ws.highdeal.com/", propOrder = {
    "type"
})
public class ChargingContractItemAccountAssignment
    extends ChargingContractItemRevisionAccountAssignment
{

    @XmlElement(required = true)
    protected String type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
