
package com.cnk.travelogix.custom.zif.erp.ws.opportunity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifProdCatHolidays complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifProdCatHolidays">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoOfAdults" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="NoOfChildren" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="NoOfInfants" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="Themes" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="NoOfDays" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="YearOfDeparture" type="{urn:sap-com:document:sap:rfc:functions}numeric5"/>
 *         &lt;element name="MonthOfDeparture" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="DateOfTravel" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="AccommodationType" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="StarRating" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="Destination" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifProdCatHolidays", propOrder = {
    "noOfAdults",
    "noOfChildren",
    "noOfInfants",
    "themes",
    "noOfDays",
    "yearOfDeparture",
    "monthOfDeparture",
    "dateOfTravel",
    "accommodationType",
    "starRating",
    "destination"
})
public class ZifProdCatHolidays {

    @XmlElement(name = "NoOfAdults", required = true)
    protected String noOfAdults;
    @XmlElement(name = "NoOfChildren", required = true)
    protected String noOfChildren;
    @XmlElement(name = "NoOfInfants", required = true)
    protected String noOfInfants;
    @XmlElement(name = "Themes", required = true)
    protected String themes;
    @XmlElement(name = "NoOfDays", required = true)
    protected String noOfDays;
    @XmlElement(name = "YearOfDeparture", required = true)
    protected String yearOfDeparture;
    @XmlElement(name = "MonthOfDeparture", required = true)
    protected String monthOfDeparture;
    @XmlElement(name = "DateOfTravel", required = true)
    protected String dateOfTravel;
    @XmlElement(name = "AccommodationType", required = true)
    protected String accommodationType;
    @XmlElement(name = "StarRating", required = true)
    protected String starRating;
    @XmlElement(name = "Destination", required = true)
    protected String destination;

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

    /**
     * Gets the value of the themes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThemes() {
        return themes;
    }

    /**
     * Sets the value of the themes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThemes(String value) {
        this.themes = value;
    }

    /**
     * Gets the value of the noOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfDays() {
        return noOfDays;
    }

    /**
     * Sets the value of the noOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfDays(String value) {
        this.noOfDays = value;
    }

    /**
     * Gets the value of the yearOfDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearOfDeparture() {
        return yearOfDeparture;
    }

    /**
     * Sets the value of the yearOfDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearOfDeparture(String value) {
        this.yearOfDeparture = value;
    }

    /**
     * Gets the value of the monthOfDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthOfDeparture() {
        return monthOfDeparture;
    }

    /**
     * Sets the value of the monthOfDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthOfDeparture(String value) {
        this.monthOfDeparture = value;
    }

    /**
     * Gets the value of the dateOfTravel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfTravel() {
        return dateOfTravel;
    }

    /**
     * Sets the value of the dateOfTravel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfTravel(String value) {
        this.dateOfTravel = value;
    }

    /**
     * Gets the value of the accommodationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccommodationType() {
        return accommodationType;
    }

    /**
     * Sets the value of the accommodationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccommodationType(String value) {
        this.accommodationType = value;
    }

    /**
     * Gets the value of the starRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarRating() {
        return starRating;
    }

    /**
     * Sets the value of the starRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarRating(String value) {
        this.starRating = value;
    }

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

}
