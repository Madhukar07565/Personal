
package com.cnk.travelogix.custom.contract.provisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingContractItemUserTechnicalIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargingContractItemUserTechnicalIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="userServiceId" type="{http://schema.ws.highdeal.com/}String256"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargingContractItemUserTechnicalIdentifier", namespace = "http://contract.ws.highdeal.com/", propOrder = {
    "name",
    "userServiceId"
})
public class ChargingContractItemUserTechnicalIdentifier {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String userServiceId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the userServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserServiceId() {
        return userServiceId;
    }

    /**
     * Sets the value of the userServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserServiceId(String value) {
        this.userServiceId = value;
    }

}
