
package com.cnk.travelogix.custom.zif.erp.ws.custmastercreate.b2b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifErpStContmast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifErpStContmast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegacyCp" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="ContPerson" type="{urn:sap-com:document:sap:rfc:functions}char35"/>
 *         &lt;element name="CpRole" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="ContAccgrp" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="ContHouseNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="ContStreet" type="{urn:sap-com:document:sap:rfc:functions}char60"/>
 *         &lt;element name="ContStreet2" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="ContStreet3" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="ContStreet4" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="ContStreet5" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="ContCity" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="ContPostalCode" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="ContCountryKey" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="ContRegion" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="ContTelNo" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="Department" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Designation" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifErpStContmast", propOrder = {
    "legacyCp",
    "contPerson",
    "cpRole",
    "contAccgrp",
    "contHouseNo",
    "contStreet",
    "contStreet2",
    "contStreet3",
    "contStreet4",
    "contStreet5",
    "contCity",
    "contPostalCode",
    "contCountryKey",
    "contRegion",
    "contTelNo",
    "department",
    "designation"
})
public class ZifErpStContmast {

    @XmlElement(name = "LegacyCp", required = true)
    protected String legacyCp;
    @XmlElement(name = "ContPerson", required = true)
    protected String contPerson;
    @XmlElement(name = "CpRole", required = true)
    protected String cpRole;
    @XmlElement(name = "ContAccgrp", required = true)
    protected String contAccgrp;
    @XmlElement(name = "ContHouseNo", required = true)
    protected String contHouseNo;
    @XmlElement(name = "ContStreet", required = true)
    protected String contStreet;
    @XmlElement(name = "ContStreet2", required = true)
    protected String contStreet2;
    @XmlElement(name = "ContStreet3", required = true)
    protected String contStreet3;
    @XmlElement(name = "ContStreet4", required = true)
    protected String contStreet4;
    @XmlElement(name = "ContStreet5", required = true)
    protected String contStreet5;
    @XmlElement(name = "ContCity", required = true)
    protected String contCity;
    @XmlElement(name = "ContPostalCode", required = true)
    protected String contPostalCode;
    @XmlElement(name = "ContCountryKey", required = true)
    protected String contCountryKey;
    @XmlElement(name = "ContRegion", required = true)
    protected String contRegion;
    @XmlElement(name = "ContTelNo", required = true)
    protected String contTelNo;
    @XmlElement(name = "Department", required = true)
    protected String department;
    @XmlElement(name = "Designation", required = true)
    protected String designation;

    /**
     * Gets the value of the legacyCp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyCp() {
        return legacyCp;
    }

    /**
     * Sets the value of the legacyCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyCp(String value) {
        this.legacyCp = value;
    }

    /**
     * Gets the value of the contPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContPerson() {
        return contPerson;
    }

    /**
     * Sets the value of the contPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContPerson(String value) {
        this.contPerson = value;
    }

    /**
     * Gets the value of the cpRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpRole() {
        return cpRole;
    }

    /**
     * Sets the value of the cpRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpRole(String value) {
        this.cpRole = value;
    }

    /**
     * Gets the value of the contAccgrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContAccgrp() {
        return contAccgrp;
    }

    /**
     * Sets the value of the contAccgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContAccgrp(String value) {
        this.contAccgrp = value;
    }

    /**
     * Gets the value of the contHouseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContHouseNo() {
        return contHouseNo;
    }

    /**
     * Sets the value of the contHouseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContHouseNo(String value) {
        this.contHouseNo = value;
    }

    /**
     * Gets the value of the contStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContStreet() {
        return contStreet;
    }

    /**
     * Sets the value of the contStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContStreet(String value) {
        this.contStreet = value;
    }

    /**
     * Gets the value of the contStreet2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContStreet2() {
        return contStreet2;
    }

    /**
     * Sets the value of the contStreet2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContStreet2(String value) {
        this.contStreet2 = value;
    }

    /**
     * Gets the value of the contStreet3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContStreet3() {
        return contStreet3;
    }

    /**
     * Sets the value of the contStreet3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContStreet3(String value) {
        this.contStreet3 = value;
    }

    /**
     * Gets the value of the contStreet4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContStreet4() {
        return contStreet4;
    }

    /**
     * Sets the value of the contStreet4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContStreet4(String value) {
        this.contStreet4 = value;
    }

    /**
     * Gets the value of the contStreet5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContStreet5() {
        return contStreet5;
    }

    /**
     * Sets the value of the contStreet5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContStreet5(String value) {
        this.contStreet5 = value;
    }

    /**
     * Gets the value of the contCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContCity() {
        return contCity;
    }

    /**
     * Sets the value of the contCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContCity(String value) {
        this.contCity = value;
    }

    /**
     * Gets the value of the contPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContPostalCode() {
        return contPostalCode;
    }

    /**
     * Sets the value of the contPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContPostalCode(String value) {
        this.contPostalCode = value;
    }

    /**
     * Gets the value of the contCountryKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContCountryKey() {
        return contCountryKey;
    }

    /**
     * Sets the value of the contCountryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContCountryKey(String value) {
        this.contCountryKey = value;
    }

    /**
     * Gets the value of the contRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContRegion() {
        return contRegion;
    }

    /**
     * Sets the value of the contRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContRegion(String value) {
        this.contRegion = value;
    }

    /**
     * Gets the value of the contTelNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContTelNo() {
        return contTelNo;
    }

    /**
     * Sets the value of the contTelNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContTelNo(String value) {
        this.contTelNo = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the designation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the value of the designation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

}
