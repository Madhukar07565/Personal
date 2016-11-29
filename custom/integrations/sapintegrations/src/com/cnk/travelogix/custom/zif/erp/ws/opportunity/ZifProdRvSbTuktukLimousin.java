
package com.cnk.travelogix.custom.zif.erp.ws.opportunity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ZifProdRvSbTuktukLimousin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifProdRvSbTuktukLimousin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PickUpDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="PickUpTime" type="{urn:sap-com:document:sap:rfc:functions}time"/>
 *         &lt;element name="PickUpLocation" type="{urn:sap-com:document:sap:rfc:functions}char15"/>
 *         &lt;element name="DropOffDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="DropOffTime" type="{urn:sap-com:document:sap:rfc:functions}time"/>
 *         &lt;element name="DropOffLocation" type="{urn:sap-com:document:sap:rfc:functions}char15"/>
 *         &lt;element name="NoOfPassangers" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifProdRvSbTuktukLimousin", propOrder = {
    "pickUpDate",
    "pickUpTime",
    "pickUpLocation",
    "dropOffDate",
    "dropOffTime",
    "dropOffLocation",
    "noOfPassangers"
})
public class ZifProdRvSbTuktukLimousin {

    @XmlElement(name = "PickUpDate", required = true)
    protected String pickUpDate;
    @XmlElement(name = "PickUpTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar pickUpTime;
    @XmlElement(name = "PickUpLocation", required = true)
    protected String pickUpLocation;
    @XmlElement(name = "DropOffDate", required = true)
    protected String dropOffDate;
    @XmlElement(name = "DropOffTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dropOffTime;
    @XmlElement(name = "DropOffLocation", required = true)
    protected String dropOffLocation;
    @XmlElement(name = "NoOfPassangers", required = true)
    protected String noOfPassangers;

    /**
     * Gets the value of the pickUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpDate() {
        return pickUpDate;
    }

    /**
     * Sets the value of the pickUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpDate(String value) {
        this.pickUpDate = value;
    }

    /**
     * Gets the value of the pickUpTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickUpTime() {
        return pickUpTime;
    }

    /**
     * Sets the value of the pickUpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickUpTime(XMLGregorianCalendar value) {
        this.pickUpTime = value;
    }

    /**
     * Gets the value of the pickUpLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickUpLocation() {
        return pickUpLocation;
    }

    /**
     * Sets the value of the pickUpLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickUpLocation(String value) {
        this.pickUpLocation = value;
    }

    /**
     * Gets the value of the dropOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffDate() {
        return dropOffDate;
    }

    /**
     * Sets the value of the dropOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffDate(String value) {
        this.dropOffDate = value;
    }

    /**
     * Gets the value of the dropOffTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDropOffTime() {
        return dropOffTime;
    }

    /**
     * Sets the value of the dropOffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDropOffTime(XMLGregorianCalendar value) {
        this.dropOffTime = value;
    }

    /**
     * Gets the value of the dropOffLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropOffLocation() {
        return dropOffLocation;
    }

    /**
     * Sets the value of the dropOffLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropOffLocation(String value) {
        this.dropOffLocation = value;
    }

    /**
     * Gets the value of the noOfPassangers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfPassangers() {
        return noOfPassangers;
    }

    /**
     * Sets the value of the noOfPassangers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfPassangers(String value) {
        this.noOfPassangers = value;
    }

}
