
package com.cnk.travelogix.contract.provisioning.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ChargingContractItemPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargingContractItemPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="start" type="{http://schema.ws.highdeal.com/}Date"/>
 *         &lt;element name="end" type="{http://schema.ws.highdeal.com/}Date" minOccurs="0"/>
 *         &lt;element name="parameter" type="{http://contract.ws.highdeal.com/}ChargingContractItemParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sharedCounter" type="{http://contract.ws.highdeal.com/}ChargingContractItemSharedCounter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pooledCounter" type="{http://contract.ws.highdeal.com/}ChargingContractItemPooledCounter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userTechnicalIdentifier" type="{http://contract.ws.highdeal.com/}ChargingContractItemUserTechnicalIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accountAssignment" type="{http://contract.ws.highdeal.com/}ChargingContractItemAccountAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargingContractItemPeriod", namespace = "http://contract.ws.highdeal.com/", propOrder = {
    "start",
    "end",
    "parameter",
    "sharedCounter",
    "pooledCounter",
    "userTechnicalIdentifier",
    "accountAssignment"
})
public class ChargingContractItemPeriod {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    protected List<ChargingContractItemParameter> parameter;
    protected List<ChargingContractItemSharedCounter> sharedCounter;
    protected List<ChargingContractItemPooledCounter> pooledCounter;
    protected List<ChargingContractItemUserTechnicalIdentifier> userTechnicalIdentifier;
    protected List<ChargingContractItemAccountAssignment> accountAssignment;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargingContractItemParameter }
     * 
     * 
     */
    public List<ChargingContractItemParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<ChargingContractItemParameter>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the sharedCounter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedCounter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedCounter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargingContractItemSharedCounter }
     * 
     * 
     */
    public List<ChargingContractItemSharedCounter> getSharedCounter() {
        if (sharedCounter == null) {
            sharedCounter = new ArrayList<ChargingContractItemSharedCounter>();
        }
        return this.sharedCounter;
    }

    /**
     * Gets the value of the pooledCounter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pooledCounter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPooledCounter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargingContractItemPooledCounter }
     * 
     * 
     */
    public List<ChargingContractItemPooledCounter> getPooledCounter() {
        if (pooledCounter == null) {
            pooledCounter = new ArrayList<ChargingContractItemPooledCounter>();
        }
        return this.pooledCounter;
    }

    /**
     * Gets the value of the userTechnicalIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userTechnicalIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserTechnicalIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargingContractItemUserTechnicalIdentifier }
     * 
     * 
     */
    public List<ChargingContractItemUserTechnicalIdentifier> getUserTechnicalIdentifier() {
        if (userTechnicalIdentifier == null) {
            userTechnicalIdentifier = new ArrayList<ChargingContractItemUserTechnicalIdentifier>();
        }
        return this.userTechnicalIdentifier;
    }

    /**
     * Gets the value of the accountAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargingContractItemAccountAssignment }
     * 
     * 
     */
    public List<ChargingContractItemAccountAssignment> getAccountAssignment() {
        if (accountAssignment == null) {
            accountAssignment = new ArrayList<ChargingContractItemAccountAssignment>();
        }
        return this.accountAssignment;
    }

}
