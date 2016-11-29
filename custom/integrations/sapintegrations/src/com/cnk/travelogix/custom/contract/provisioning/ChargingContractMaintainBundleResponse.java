
package com.cnk.travelogix.custom.contract.provisioning;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingContractMaintainBundleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargingContractMaintainBundleResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}Response">
 *       &lt;sequence>
 *         &lt;element ref="{http://schema.provisioning.ws.highdeal.com/}chargingContractMaintainResponse" maxOccurs="1000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargingContractMaintainBundleResponse", namespace = "http://schema.provisioning.ws.highdeal.com/", propOrder = {
    "chargingContractMaintainResponse"
})
public class ChargingContractMaintainBundleResponse
    extends Response
{

    @XmlElement(namespace = "http://schema.provisioning.ws.highdeal.com/")
    protected List<ContractOperationResponse> chargingContractMaintainResponse;

    /**
     * Gets the value of the chargingContractMaintainResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargingContractMaintainResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargingContractMaintainResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractOperationResponse }
     * 
     * 
     */
    public List<ContractOperationResponse> getChargingContractMaintainResponse() {
        if (chargingContractMaintainResponse == null) {
            chargingContractMaintainResponse = new ArrayList<ContractOperationResponse>();
        }
        return this.chargingContractMaintainResponse;
    }

}
