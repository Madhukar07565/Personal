
package com.cnk.travelogix.custom.zif.erp.ws.opportunity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifProdCatActivities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifProdCatActivities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FromDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="ToDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="NoOfAdults" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="NoOfChildren" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="Destination" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="Themes" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="MonthOfDeparture" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="YearOfDeparture" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="BudgetPerPerson" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="PhysicalIntensity" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifProdCatActivities", propOrder = {
    "fromDate",
    "toDate",
    "noOfAdults",
    "noOfChildren",
    "destination",
    "themes",
    "monthOfDeparture",
    "yearOfDeparture",
    "budgetPerPerson",
    "physicalIntensity"
})
public class ZifProdCatActivities {

    @XmlElement(name = "FromDate", required = true)
    protected String fromDate;
    @XmlElement(name = "ToDate", required = true)
    protected String toDate;
    @XmlElement(name = "NoOfAdults", required = true)
    protected String noOfAdults;
    @XmlElement(name = "NoOfChildren", required = true)
    protected String noOfChildren;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "Themes", required = true)
    protected String themes;
    @XmlElement(name = "MonthOfDeparture", required = true)
    protected String monthOfDeparture;
    @XmlElement(name = "YearOfDeparture", required = true)
    protected String yearOfDeparture;
    @XmlElement(name = "BudgetPerPerson", required = true)
    protected String budgetPerPerson;
    @XmlElement(name = "PhysicalIntensity", required = true)
    protected String physicalIntensity;

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
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(String value) {
        this.toDate = value;
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
     * Gets the value of the physicalIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalIntensity() {
        return physicalIntensity;
    }

    /**
     * Sets the value of the physicalIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalIntensity(String value) {
        this.physicalIntensity = value;
    }

}
