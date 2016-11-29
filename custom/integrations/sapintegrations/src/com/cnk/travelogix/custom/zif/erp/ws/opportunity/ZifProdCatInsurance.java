
package com.cnk.travelogix.custom.zif.erp.ws.opportunity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifProdCatInsurance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifProdCatInsurance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Destination" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="NoOfTraveller" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="DepartureDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="ReturnDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="NoOfAdults" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="AgeOfAdults" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="NoOfChildren" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="AgeOfChild" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="NoOfInfants" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="AgeOfInfant" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifProdCatInsurance", propOrder = {
    "destination",
    "noOfTraveller",
    "departureDate",
    "returnDate",
    "noOfAdults",
    "ageOfAdults",
    "noOfChildren",
    "ageOfChild",
    "noOfInfants",
    "ageOfInfant"
})
public class ZifProdCatInsurance {

    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "NoOfTraveller", required = true)
    protected String noOfTraveller;
    @XmlElement(name = "DepartureDate", required = true)
    protected String departureDate;
    @XmlElement(name = "ReturnDate", required = true)
    protected String returnDate;
    @XmlElement(name = "NoOfAdults", required = true)
    protected String noOfAdults;
    @XmlElement(name = "AgeOfAdults", required = true)
    protected String ageOfAdults;
    @XmlElement(name = "NoOfChildren", required = true)
    protected String noOfChildren;
    @XmlElement(name = "AgeOfChild", required = true)
    protected String ageOfChild;
    @XmlElement(name = "NoOfInfants", required = true)
    protected String noOfInfants;
    @XmlElement(name = "AgeOfInfant", required = true)
    protected String ageOfInfant;

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the noOfTraveller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfTraveller() {
        return noOfTraveller;
    }

    /**
     * Sets the value of the noOfTraveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfTraveller(String value) {
        this.noOfTraveller = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDate(String value) {
        this.returnDate = value;
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
     * Gets the value of the ageOfAdults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeOfAdults() {
        return ageOfAdults;
    }

    /**
     * Sets the value of the ageOfAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeOfAdults(String value) {
        this.ageOfAdults = value;
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
     * Gets the value of the ageOfChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeOfChild() {
        return ageOfChild;
    }

    /**
     * Sets the value of the ageOfChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeOfChild(String value) {
        this.ageOfChild = value;
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

    /**
     * Gets the value of the ageOfInfant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeOfInfant() {
        return ageOfInfant;
    }

    /**
     * Sets the value of the ageOfInfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeOfInfant(String value) {
        this.ageOfInfant = value;
    }

}
