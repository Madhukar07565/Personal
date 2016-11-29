
package com.cnk.travelogix.contract.provisioning.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindChargingContractResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindChargingContractResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}SearchResponse">
 *       &lt;sequence>
 *         &lt;element name="chargingContract" type="{http://contract.ws.highdeal.com/}ChargingContract" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindChargingContractResponse", namespace = "http://schema.provisioning.ws.highdeal.com/", propOrder = {
    "chargingContract"
})
public class FindChargingContractResponse
    extends SearchResponse
{

    protected List<ChargingContract> chargingContract;

    /**
     * Gets the value of the chargingContract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargingContract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargingContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargingContract }
     * 
     * 
     */
    public List<ChargingContract> getChargingContract() {
        if (chargingContract == null) {
            chargingContract = new ArrayList<ChargingContract>();
        }
        return this.chargingContract;
    }

}
