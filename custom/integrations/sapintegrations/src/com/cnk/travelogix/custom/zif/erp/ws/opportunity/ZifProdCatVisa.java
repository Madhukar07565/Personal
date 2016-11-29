
package com.cnk.travelogix.custom.zif.erp.ws.opportunity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifProdCatVisa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifProdCatVisa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SingleOrMultipleEntry" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="CountryToVisit" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="DurationOfStay" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="PurposeOfTravel" type="{urn:sap-com:document:sap:rfc:functions}char25"/>
 *         &lt;element name="PassportIssuedCountry" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="PassportIssuedCity" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="CurrentResidenceCountry" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="CurrentResidenceCity" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="ImmigrationStatus" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Citizenship" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="DateOfDeparture" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifProdCatVisa", propOrder = {
    "singleOrMultipleEntry",
    "countryToVisit",
    "durationOfStay",
    "purposeOfTravel",
    "passportIssuedCountry",
    "passportIssuedCity",
    "currentResidenceCountry",
    "currentResidenceCity",
    "immigrationStatus",
    "citizenship",
    "dateOfDeparture"
})
public class ZifProdCatVisa {

    @XmlElement(name = "SingleOrMultipleEntry", required = true)
    protected String singleOrMultipleEntry;
    @XmlElement(name = "CountryToVisit", required = true)
    protected String countryToVisit;
    @XmlElement(name = "DurationOfStay", required = true)
    protected String durationOfStay;
    @XmlElement(name = "PurposeOfTravel", required = true)
    protected String purposeOfTravel;
    @XmlElement(name = "PassportIssuedCountry", required = true)
    protected String passportIssuedCountry;
    @XmlElement(name = "PassportIssuedCity", required = true)
    protected String passportIssuedCity;
    @XmlElement(name = "CurrentResidenceCountry", required = true)
    protected String currentResidenceCountry;
    @XmlElement(name = "CurrentResidenceCity", required = true)
    protected String currentResidenceCity;
    @XmlElement(name = "ImmigrationStatus", required = true)
    protected String immigrationStatus;
    @XmlElement(name = "Citizenship", required = true)
    protected String citizenship;
    @XmlElement(name = "DateOfDeparture", required = true)
    protected String dateOfDeparture;

    /**
     * Gets the value of the singleOrMultipleEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleOrMultipleEntry() {
        return singleOrMultipleEntry;
    }

    /**
     * Sets the value of the singleOrMultipleEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleOrMultipleEntry(String value) {
        this.singleOrMultipleEntry = value;
    }

    /**
     * Gets the value of the countryToVisit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryToVisit() {
        return countryToVisit;
    }

    /**
     * Sets the value of the countryToVisit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryToVisit(String value) {
        this.countryToVisit = value;
    }

    /**
     * Gets the value of the durationOfStay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationOfStay() {
        return durationOfStay;
    }

    /**
     * Sets the value of the durationOfStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationOfStay(String value) {
        this.durationOfStay = value;
    }

    /**
     * Gets the value of the purposeOfTravel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeOfTravel() {
        return purposeOfTravel;
    }

    /**
     * Sets the value of the purposeOfTravel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeOfTravel(String value) {
        this.purposeOfTravel = value;
    }

    /**
     * Gets the value of the passportIssuedCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportIssuedCountry() {
        return passportIssuedCountry;
    }

    /**
     * Sets the value of the passportIssuedCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportIssuedCountry(String value) {
        this.passportIssuedCountry = value;
    }

    /**
     * Gets the value of the passportIssuedCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportIssuedCity() {
        return passportIssuedCity;
    }

    /**
     * Sets the value of the passportIssuedCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportIssuedCity(String value) {
        this.passportIssuedCity = value;
    }

    /**
     * Gets the value of the currentResidenceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentResidenceCountry() {
        return currentResidenceCountry;
    }

    /**
     * Sets the value of the currentResidenceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentResidenceCountry(String value) {
        this.currentResidenceCountry = value;
    }

    /**
     * Gets the value of the currentResidenceCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentResidenceCity() {
        return currentResidenceCity;
    }

    /**
     * Sets the value of the currentResidenceCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentResidenceCity(String value) {
        this.currentResidenceCity = value;
    }

    /**
     * Gets the value of the immigrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmigrationStatus() {
        return immigrationStatus;
    }

    /**
     * Sets the value of the immigrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmigrationStatus(String value) {
        this.immigrationStatus = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenship(String value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the dateOfDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    /**
     * Sets the value of the dateOfDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfDeparture(String value) {
        this.dateOfDeparture = value;
    }

}
