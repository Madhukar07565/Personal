
package com.cnk.travelogix.custom.zif.erp.ws.opportunity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifProdCatAccommodation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifProdCatAccommodation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TypeOfHotel" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="Location" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="StarCategory" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Meals" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="CheckInDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="CheckOutDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="NoOfNights" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="NoOfRooms" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="NoOfAdults" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
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
@XmlType(name = "ZifProdCatAccommodation", propOrder = {
    "typeOfHotel",
    "location",
    "starCategory",
    "meals",
    "checkInDate",
    "checkOutDate",
    "noOfNights",
    "noOfRooms",
    "noOfAdults",
    "noOfChildren"
})
public class ZifProdCatAccommodation {

    @XmlElement(name = "TypeOfHotel", required = true)
    protected String typeOfHotel;
    @XmlElement(name = "Location", required = true)
    protected String location;
    @XmlElement(name = "StarCategory", required = true)
    protected String starCategory;
    @XmlElement(name = "Meals", required = true)
    protected String meals;
    @XmlElement(name = "CheckInDate", required = true)
    protected String checkInDate;
    @XmlElement(name = "CheckOutDate", required = true)
    protected String checkOutDate;
    @XmlElement(name = "NoOfNights", required = true)
    protected String noOfNights;
    @XmlElement(name = "NoOfRooms", required = true)
    protected String noOfRooms;
    @XmlElement(name = "NoOfAdults", required = true)
    protected String noOfAdults;
    @XmlElement(name = "NoOfChildren", required = true)
    protected String noOfChildren;

    /**
     * Gets the value of the typeOfHotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfHotel() {
        return typeOfHotel;
    }

    /**
     * Sets the value of the typeOfHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfHotel(String value) {
        this.typeOfHotel = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the starCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarCategory() {
        return starCategory;
    }

    /**
     * Sets the value of the starCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarCategory(String value) {
        this.starCategory = value;
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

    /**
     * Gets the value of the checkInDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInDate() {
        return checkInDate;
    }

    /**
     * Sets the value of the checkInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInDate(String value) {
        this.checkInDate = value;
    }

    /**
     * Gets the value of the checkOutDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * Sets the value of the checkOutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOutDate(String value) {
        this.checkOutDate = value;
    }

    /**
     * Gets the value of the noOfNights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfNights() {
        return noOfNights;
    }

    /**
     * Sets the value of the noOfNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfNights(String value) {
        this.noOfNights = value;
    }

    /**
     * Gets the value of the noOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfRooms() {
        return noOfRooms;
    }

    /**
     * Sets the value of the noOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfRooms(String value) {
        this.noOfRooms = value;
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

}
