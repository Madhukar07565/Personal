
package com.cnk.travelogix.custom.contract.provisioning;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingContractRevision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargingContractRevision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;choice>
 *           &lt;element name="subscriberAccountId" type="{http://schema.ws.highdeal.com/}String256"/>
 *           &lt;element name="rootChargingContractId" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;/choice>
 *         &lt;element name="additionalInfo" type="{http://schema.ws.highdeal.com/}AdditionalInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="chargingContractItemRevision" type="{http://contract.ws.highdeal.com/}ChargingContractItemRevision" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargingContractRevision", namespace = "http://contract.ws.highdeal.com/", propOrder = {
    "id",
    "subscriberAccountId",
    "rootChargingContractId",
    "additionalInfo",
    "chargingContractItemRevision"
})
public class ChargingContractRevision {

    @XmlElement(required = true)
    protected String id;
    protected String subscriberAccountId;
    protected String rootChargingContractId;
    protected List<AdditionalInfo> additionalInfo;
    protected List<ChargingContractItemRevision> chargingContractItemRevision;

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
     * Gets the value of the subscriberAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberAccountId() {
        return subscriberAccountId;
    }

    /**
     * Sets the value of the subscriberAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberAccountId(String value) {
        this.subscriberAccountId = value;
    }

    /**
     * Gets the value of the rootChargingContractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootChargingContractId() {
        return rootChargingContractId;
    }

    /**
     * Sets the value of the rootChargingContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootChargingContractId(String value) {
        this.rootChargingContractId = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInfo }
     * 
     * 
     */
    public List<AdditionalInfo> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new ArrayList<AdditionalInfo>();
        }
        return this.additionalInfo;
    }

    /**
     * Gets the value of the chargingContractItemRevision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargingContractItemRevision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargingContractItemRevision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargingContractItemRevision }
     * 
     * 
     */
    public List<ChargingContractItemRevision> getChargingContractItemRevision() {
        if (chargingContractItemRevision == null) {
            chargingContractItemRevision = new ArrayList<ChargingContractItemRevision>();
        }
        return this.chargingContractItemRevision;
    }

}
