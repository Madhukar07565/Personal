
package com.cnk.travelogix.custom.contract.provisioning;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargingContractSearchFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargingContractSearchFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}SearchFilter">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://schema.ws.highdeal.com/}StringAttributeDescription" minOccurs="0"/>
 *         &lt;element name="subscriberAccountId" type="{http://schema.ws.highdeal.com/}StringAttributeDescription" minOccurs="0"/>
 *         &lt;element name="additionalInfo" type="{http://schema.ws.highdeal.com/}AdditionalAttributeDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subscriberAccountAdditionalInfo" type="{http://schema.ws.highdeal.com/}AdditionalAttributeDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rootChargingContractId" type="{http://schema.ws.highdeal.com/}StringAttributeDescription" minOccurs="0"/>
 *         &lt;element name="operationalStatus" type="{http://operationalstatus.ws.highdeal.com/}OperationalStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargingContractSearchFilter", namespace = "http://schema.provisioning.ws.highdeal.com/", propOrder = {
    "id",
    "subscriberAccountId",
    "additionalInfo",
    "subscriberAccountAdditionalInfo",
    "rootChargingContractId",
    "operationalStatus"
})
public class ChargingContractSearchFilter
    extends SearchFilter
{

    protected StringAttributeDescription id;
    protected StringAttributeDescription subscriberAccountId;
    protected List<AdditionalAttributeDescription> additionalInfo;
    protected List<AdditionalAttributeDescription> subscriberAccountAdditionalInfo;
    protected StringAttributeDescription rootChargingContractId;
    @XmlSchemaType(name = "string")
    protected OperationalStatus operationalStatus;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link StringAttributeDescription }
     *     
     */
    public StringAttributeDescription getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringAttributeDescription }
     *     
     */
    public void setId(StringAttributeDescription value) {
        this.id = value;
    }

    /**
     * Gets the value of the subscriberAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link StringAttributeDescription }
     *     
     */
    public StringAttributeDescription getSubscriberAccountId() {
        return subscriberAccountId;
    }

    /**
     * Sets the value of the subscriberAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringAttributeDescription }
     *     
     */
    public void setSubscriberAccountId(StringAttributeDescription value) {
        this.subscriberAccountId = value;
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
     * {@link AdditionalAttributeDescription }
     * 
     * 
     */
    public List<AdditionalAttributeDescription> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new ArrayList<AdditionalAttributeDescription>();
        }
        return this.additionalInfo;
    }

    /**
     * Gets the value of the subscriberAccountAdditionalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberAccountAdditionalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberAccountAdditionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalAttributeDescription }
     * 
     * 
     */
    public List<AdditionalAttributeDescription> getSubscriberAccountAdditionalInfo() {
        if (subscriberAccountAdditionalInfo == null) {
            subscriberAccountAdditionalInfo = new ArrayList<AdditionalAttributeDescription>();
        }
        return this.subscriberAccountAdditionalInfo;
    }

    /**
     * Gets the value of the rootChargingContractId property.
     * 
     * @return
     *     possible object is
     *     {@link StringAttributeDescription }
     *     
     */
    public StringAttributeDescription getRootChargingContractId() {
        return rootChargingContractId;
    }

    /**
     * Sets the value of the rootChargingContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringAttributeDescription }
     *     
     */
    public void setRootChargingContractId(StringAttributeDescription value) {
        this.rootChargingContractId = value;
    }

    /**
     * Gets the value of the operationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalStatus }
     *     
     */
    public OperationalStatus getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Sets the value of the operationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalStatus }
     *     
     */
    public void setOperationalStatus(OperationalStatus value) {
        this.operationalStatus = value;
    }

}
