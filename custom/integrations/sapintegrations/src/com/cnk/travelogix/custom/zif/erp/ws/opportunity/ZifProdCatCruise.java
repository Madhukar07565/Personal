
package com.cnk.travelogix.custom.zif.erp.ws.opportunity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifProdCatCruise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifProdCatCruise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Destination" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="YearOfDeparture" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="MonthOfDeparture" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="NoOfCabin" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="NoOfAdults" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="StarRating" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="BudgetPerPerson" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="Themes" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="CruiseLiner" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="CruiseLength" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="NoOfChildren" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifProdCatCruise", propOrder = {
    "destination",
    "yearOfDeparture",
    "monthOfDeparture",
    "noOfCabin",
    "noOfAdults",
    "starRating",
    "budgetPerPerson",
    "themes",
    "cruiseLiner",
    "cruiseLength",
    "noOfChildren"
})
public class ZifProdCatCruise {

    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "YearOfDeparture", required = true)
    protected String yearOfDeparture;
    @XmlElement(name = "MonthOfDeparture", required = true)
    protected String monthOfDeparture;
    @XmlElement(name = "NoOfCabin", required = true)
    protected String noOfCabin;
    @XmlElement(name = "NoOfAdults", required = true)
    protected String noOfAdults;
    @XmlElement(name = "StarRating", required = true)
    protected String starRating;
    @XmlElement(name = "BudgetPerPerson", required = true)
    protected String budgetPerPerson;
    @XmlElement(name = "Themes", required = true)
    protected String themes;
    @XmlElement(name = "CruiseLiner", required = true)
    protected String cruiseLiner;
    @XmlElement(name = "CruiseLength", required = true)
    protected String cruiseLength;
    @XmlElement(name = "NoOfChildren", required = true)
    protected String noOfChildren;

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
     * Gets the value of the noOfCabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfCabin() {
        return noOfCabin;
    }

    /**
     * Sets the value of the noOfCabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfCabin(String value) {
        this.noOfCabin = value;
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
     * Gets the value of the budgetPerPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetPerPerson() {
        return budgetPerPerson;
    }

    /**
     * Sets the value of the budgetPerPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetPerPerson(String value) {
        this.budgetPerPerson = value;
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
     * Gets the value of the cruiseLiner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCruiseLiner() {
        return cruiseLiner;
    }

    /**
     * Sets the value of the cruiseLiner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCruiseLiner(String value) {
        this.cruiseLiner = value;
    }

    /**
     * Gets the value of the cruiseLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCruiseLength() {
        return cruiseLength;
    }

    /**
     * Sets the value of the cruiseLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCruiseLength(String value) {
        this.cruiseLength = value;
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

}
