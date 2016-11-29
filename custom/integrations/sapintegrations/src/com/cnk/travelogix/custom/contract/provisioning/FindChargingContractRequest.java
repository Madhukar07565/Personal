
package com.cnk.travelogix.custom.contract.provisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindChargingContractRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindChargingContractRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargingContractSearchFilter" type="{http://schema.provisioning.ws.highdeal.com/}ChargingContractSearchFilter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindChargingContractRequest", namespace = "http://schema.provisioning.ws.highdeal.com/", propOrder = {
    "chargingContractSearchFilter"
})
public class FindChargingContractRequest {

    @XmlElement(required = true)
    protected ChargingContractSearchFilter chargingContractSearchFilter;

    /**
     * Gets the value of the chargingContractSearchFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ChargingContractSearchFilter }
     *     
     */
    public ChargingContractSearchFilter getChargingContractSearchFilter() {
        return chargingContractSearchFilter;
    }

    /**
     * Sets the value of the chargingContractSearchFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingContractSearchFilter }
     *     
     */
    public void setChargingContractSearchFilter(ChargingContractSearchFilter value) {
        this.chargingContractSearchFilter = value;
    }

}
