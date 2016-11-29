
package com.cnk.travelogix.contract.provisioning.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingContractItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargingContractItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="chargePlanClassId" type="{http://schema.ws.highdeal.com/}String256"/>
 *           &lt;element name="refillPlanClassId" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;/choice>
 *         &lt;element name="id" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="externalId" type="{http://schema.ws.highdeal.com/}String256" minOccurs="0"/>
 *         &lt;element name="period" type="{http://contract.ws.highdeal.com/}ChargingContractItemPeriod" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargingContractItem", namespace = "http://contract.ws.highdeal.com/", propOrder = {
    "chargePlanClassId",
    "refillPlanClassId",
    "id",
    "externalId",
    "period"
})
public class ChargingContractItem {

    protected String chargePlanClassId;
    protected String refillPlanClassId;
    @XmlElement(required = true)
    protected String id;
    protected String externalId;
    @XmlElement(required = true)
    protected List<ChargingContractItemPeriod> period;

    /**
     * Gets the value of the chargePlanClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargePlanClassId() {
        return chargePlanClassId;
    }

    /**
     * Sets the value of the chargePlanClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargePlanClassId(String value) {
        this.chargePlanClassId = value;
    }

    /**
     * Gets the value of the refillPlanClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefillPlanClassId() {
        return refillPlanClassId;
    }

    /**
     * Sets the value of the refillPlanClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefillPlanClassId(String value) {
        this.refillPlanClassId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the period property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargingContractItemPeriod }
     * 
     * 
     */
    public List<ChargingContractItemPeriod> getPeriod() {
        if (period == null) {
            period = new ArrayList<ChargingContractItemPeriod>();
        }
        return this.period;
    }

}
