
package com.cnk.travelogix.custom.contract.provisioning;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingContractMaintainMassRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargingContractMaintainMassRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schema.provisioning.ws.highdeal.com/}chargingContractMaintainRequest" maxOccurs="1000"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargingContractMaintainMassRequest", namespace = "http://schema.provisioning.ws.highdeal.com/", propOrder = {
    "chargingContractMaintainRequest"
})
public class ChargingContractMaintainMassRequest {

    @XmlElement(namespace = "http://schema.provisioning.ws.highdeal.com/", required = true)
    protected List<MaintainChargingContractRequest> chargingContractMaintainRequest;

    /**
     * Gets the value of the chargingContractMaintainRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargingContractMaintainRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargingContractMaintainRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintainChargingContractRequest }
     * 
     * 
     */
    public List<MaintainChargingContractRequest> getChargingContractMaintainRequest() {
        if (chargingContractMaintainRequest == null) {
            chargingContractMaintainRequest = new ArrayList<MaintainChargingContractRequest>();
        }
        return this.chargingContractMaintainRequest;
    }

}
