
package com.cnk.travelogix.custom.zif.erp.ws.opportunity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifProdCatFlights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifProdCatFlights">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SectorFrom" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="SectorTo" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="DepartureDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="ReturnDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="NoOfAdults" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="NoOfChildren" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="NoOfInfants" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="PreferredAirline" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Class" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="Meals" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifProdCatFlights", propOrder = {
    "sectorFrom",
    "sectorTo",
    "departureDate",
    "returnDate",
    "noOfAdults",
    "noOfChildren",
    "noOfInfants",
    "preferredAirline",
    "clazz",
    "meals"
})
public class ZifProdCatFlights {

    @XmlElement(name = "SectorFrom", required = true)
    protected String sectorFrom;
    @XmlElement(name = "SectorTo", required = true)
    protected String sectorTo;
    @XmlElement(name = "DepartureDate", required = true)
    protected String departureDate;
    @XmlElement(name = "ReturnDate", required = true)
    protected String returnDate;
    @XmlElement(name = "NoOfAdults", required = true)
    protected String noOfAdults;
    @XmlElement(name = "NoOfChildren", required = true)
    protected String noOfChildren;
    @XmlElement(name = "NoOfInfants", required = true)
    protected String noOfInfants;
    @XmlElement(name = "PreferredAirline", required = true)
    protected String preferredAirline;
    @XmlElement(name = "Class", required = true)
    protected String clazz;
    @XmlElement(name = "Meals", required = true)
    protected String meals;

    /**
     * Gets the value of the sectorFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorFrom() {
        return sectorFrom;
    }

    /**
     * Sets the value of the sectorFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorFrom(String value) {
        this.sectorFrom = value;
    }

    /**
     * Gets the value of the sectorTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorTo() {
        return sectorTo;
    }

    /**
     * Sets the value of the sectorTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorTo(String value) {
        this.sectorTo = value;
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
     * Gets the value of the preferredAirline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredAirline() {
        return preferredAirline;
    }

    /**
     * Sets the value of the preferredAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredAirline(String value) {
        this.preferredAirline = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the meals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeals() {
        return meals;
    }

    /**
     * Sets the value of the meals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeals(String value) {
        this.meals = value;
    }

}
