
package com.cnk.travelogix.custom.contract.provisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MaintainChargingContractRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintainChargingContractRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://schema.ws.highdeal.com/}Date"/>
 *         &lt;element name="chargingContractRevision" type="{http://contract.ws.highdeal.com/}ChargingContractRevision"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintainChargingContractRequest", namespace = "http://schema.provisioning.ws.highdeal.com/", propOrder = {
    "date",
    "chargingContractRevision"
})
public class MaintainChargingContractRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(required = true)
    protected ChargingContractRevision chargingContractRevision;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the chargingContractRevision property.
     * 
     * @return
     *     possible object is
     *     {@link ChargingContractRevision }
     *     
     */
    public ChargingContractRevision getChargingContractRevision() {
        return chargingContractRevision;
    }

    /**
     * Sets the value of the chargingContractRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingContractRevision }
     *     
     */
    public void setChargingContractRevision(ChargingContractRevision value) {
        this.chargingContractRevision = value;
    }

}
