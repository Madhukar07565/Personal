
package com.cnk.travelogix.custom.zif.erp.ws.opportunity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ZifProdCatBus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifProdCatBus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartingFrom" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="TravellingTo" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="FromDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="PreferredTime" type="{urn:sap-com:document:sap:rfc:functions}time"/>
 *         &lt;element name="NoOfAdults" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="NoOfChildren" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="NoOfInfants" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifProdCatBus", propOrder = {
    "startingFrom",
    "travellingTo",
    "fromDate",
    "preferredTime",
    "noOfAdults",
    "noOfChildren",
    "noOfInfants"
})
public class ZifProdCatBus {

    @XmlElement(name = "StartingFrom", required = true)
    protected String startingFrom;
    @XmlElement(name = "TravellingTo", required = true)
    protected String travellingTo;
    @XmlElement(name = "FromDate", required = true)
    protected String fromDate;
    @XmlElement(name = "PreferredTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar preferredTime;
    @XmlElement(name = "NoOfAdults", required = true)
    protected String noOfAdults;
    @XmlElement(name = "NoOfChildren", required = true)
    protected String noOfChildren;
    @XmlElement(name = "NoOfInfants", required = true)
    protected String noOfInfants;

    /**
     * Gets the value of the startingFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingFrom() {
        return startingFrom;
    }

    /**
     * Sets the value of the startingFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingFrom(String value) {
        this.startingFrom = value;
    }

    /**
     * Gets the value of the travellingTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravellingTo() {
        return travellingTo;
    }

    /**
     * Sets the value of the travellingTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravellingTo(String value) {
        this.travellingTo = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(String value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the preferredTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreferredTime() {
        return preferredTime;
    }

    /**
     * Sets the value of the preferredTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreferredTime(XMLGregorianCalendar value) {
        this.preferredTime = value;
    }

    /**
     * Gets the value of the noOfAdults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfAdults() {
        return noOfAdults;
    }

    /**
     * Sets the value of the noOfAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfAdults(String value) {
        this.noOfAdults = value;
    }

    /**
     * Gets the value of the noOfChildren property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfChildren() {
        return noOfChildren;
    }

    /**
     * Sets the value of the noOfChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfChildren(String value) {
        this.noOfChildren = value;
    }

    /**
     * Gets the value of the noOfInfants property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfInfants() {
        return noOfInfants;
    }

    /**
     * Sets the value of the noOfInfants property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfInfants(String value) {
        this.noOfInfants = value;
    }

}
