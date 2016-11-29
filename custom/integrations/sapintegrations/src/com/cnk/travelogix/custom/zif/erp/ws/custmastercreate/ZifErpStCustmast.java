
package com.cnk.travelogix.custom.zif.erp.ws.custmastercreate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifErpStCustmast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifErpStCustmast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectTask" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="LegacyBp" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Category" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="BpRole" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="CustAccgrp" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Customer" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="CompCode" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="SalesOrg" type="{urn:sap-com:document:sap:rfc:functions}char14"/>
 *         &lt;element name="DistChannel" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Division" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Title" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="Name1" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Name2" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="SearchTerm" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="HouseNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Street" type="{urn:sap-com:document:sap:rfc:functions}char60"/>
 *         &lt;element name="Street2" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Street3" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Street4" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Street5" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="City" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="PostalCode" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="CountryKey" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Region" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="TelNo" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="TelExt" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="FaxNo" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="FaxExt" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Email" type="{urn:sap-com:document:sap:rfc:functions}char241"/>
 *         &lt;element name="Url" type="{urn:sap-com:document:sap:rfc:functions}char132"/>
 *         &lt;element name="TelNo2" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="Vendor" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="TradPartner" type="{urn:sap-com:document:sap:rfc:functions}char6"/>
 *         &lt;element name="IndustryKey" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="CustClass" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="ReccAcc" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="SortKey" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="PayTerm" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="RecPayhistI" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="AccClerk" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="SalesOff" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="SalesGrp" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/>
 *         &lt;element name="PricingProc" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="CustStatGrp" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="DelivPlant" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="SPayTerm" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="AccAssGrp" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="TaxClassif" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="RelCreate" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="PlanGrp" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="HeadOffice" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Gender" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="MaritalStatus" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Nationality" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="BirthDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="AnniversaryDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="CostCenter" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="AddressType" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="PassportNo" type="{urn:sap-com:document:sap:rfc:functions}char60"/>
 *         &lt;element name="PassportDateOfEntry" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="PassportValidFrom" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="PassportValidTo" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="PassportCountryOfIssue" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="VisaId" type="{urn:sap-com:document:sap:rfc:functions}char60"/>
 *         &lt;element name="VisaDateOfEntry" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="VisaValidFrom" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="VisaValidTo" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="VisaCountryOfIssue" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifErpStCustmast", propOrder = {
    "objectTask",
    "legacyBp",
    "category",
    "bpRole",
    "custAccgrp",
    "customer",
    "compCode",
    "salesOrg",
    "distChannel",
    "division",
    "title",
    "name1",
    "name2",
    "searchTerm",
    "houseNo",
    "street",
    "street2",
    "street3",
    "street4",
    "street5",
    "city",
    "postalCode",
    "countryKey",
    "region",
    "telNo",
    "telExt",
    "faxNo",
    "faxExt",
    "email",
    "url",
    "telNo2",
    "vendor",
    "tradPartner",
    "industryKey",
    "custClass",
    "reccAcc",
    "sortKey",
    "payTerm",
    "recPayhistI",
    "accClerk",
    "salesOff",
    "salesGrp",
    "currency",
    "pricingProc",
    "custStatGrp",
    "delivPlant",
    "sPayTerm",
    "accAssGrp",
    "taxClassif",
    "relCreate",
    "planGrp",
    "headOffice",
    "gender",
    "maritalStatus",
    "nationality",
    "birthDate",
    "anniversaryDate",
    "costCenter",
    "addressType",
    "passportNo",
    "passportDateOfEntry",
    "passportValidFrom",
    "passportValidTo",
    "passportCountryOfIssue",
    "visaId",
    "visaDateOfEntry",
    "visaValidFrom",
    "visaValidTo",
    "visaCountryOfIssue"
})
public class ZifErpStCustmast {

    @XmlElement(name = "ObjectTask", required = true)
    protected String objectTask;
    @XmlElement(name = "LegacyBp", required = true)
    protected String legacyBp;
    @XmlElement(name = "Category", required = true)
    protected String category;
    @XmlElement(name = "BpRole", required = true)
    protected String bpRole;
    @XmlElement(name = "CustAccgrp", required = true)
    protected String custAccgrp;
    @XmlElement(name = "Customer", required = true)
    protected String customer;
    @XmlElement(name = "CompCode", required = true)
    protected String compCode;
    @XmlElement(name = "SalesOrg", required = true)
    protected String salesOrg;
    @XmlElement(name = "DistChannel", required = true)
    protected String distChannel;
    @XmlElement(name = "Division", required = true)
    protected String division;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Name1", required = true)
    protected String name1;
    @XmlElement(name = "Name2", required = true)
    protected String name2;
    @XmlElement(name = "SearchTerm", required = true)
    protected String searchTerm;
    @XmlElement(name = "HouseNo", required = true)
    protected String houseNo;
    @XmlElement(name = "Street", required = true)
    protected String street;
    @XmlElement(name = "Street2", required = true)
    protected String street2;
    @XmlElement(name = "Street3", required = true)
    protected String street3;
    @XmlElement(name = "Street4", required = true)
    protected String street4;
    @XmlElement(name = "Street5", required = true)
    protected String street5;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "PostalCode", required = true)
    protected String postalCode;
    @XmlElement(name = "CountryKey", required = true)
    protected String countryKey;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlElement(name = "TelNo", required = true)
    protected String telNo;
    @XmlElement(name = "TelExt", required = true)
    protected String telExt;
    @XmlElement(name = "FaxNo", required = true)
    protected String faxNo;
    @XmlElement(name = "FaxExt", required = true)
    protected String faxExt;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Url", required = true)
    protected String url;
    @XmlElement(name = "TelNo2", required = true)
    protected String telNo2;
    @XmlElement(name = "Vendor", required = true)
    protected String vendor;
    @XmlElement(name = "TradPartner", required = true)
    protected String tradPartner;
    @XmlElement(name = "IndustryKey", required = true)
    protected String industryKey;
    @XmlElement(name = "CustClass", required = true)
    protected String custClass;
    @XmlElement(name = "ReccAcc", required = true)
    protected String reccAcc;
    @XmlElement(name = "SortKey", required = true)
    protected String sortKey;
    @XmlElement(name = "PayTerm", required = true)
    protected String payTerm;
    @XmlElement(name = "RecPayhistI", required = true)
    protected String recPayhistI;
    @XmlElement(name = "AccClerk", required = true)
    protected String accClerk;
    @XmlElement(name = "SalesOff", required = true)
    protected String salesOff;
    @XmlElement(name = "SalesGrp", required = true)
    protected String salesGrp;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "PricingProc", required = true)
    protected String pricingProc;
    @XmlElement(name = "CustStatGrp", required = true)
    protected String custStatGrp;
    @XmlElement(name = "DelivPlant", required = true)
    protected String delivPlant;
    @XmlElement(name = "SPayTerm", required = true)
    protected String sPayTerm;
    @XmlElement(name = "AccAssGrp", required = true)
    protected String accAssGrp;
    @XmlElement(name = "TaxClassif", required = true)
    protected String taxClassif;
    @XmlElement(name = "RelCreate", required = true)
    protected String relCreate;
    @XmlElement(name = "PlanGrp", required = true)
    protected String planGrp;
    @XmlElement(name = "HeadOffice", required = true)
    protected String headOffice;
    @XmlElement(name = "Gender", required = true)
    protected String gender;
    @XmlElement(name = "MaritalStatus", required = true)
    protected String maritalStatus;
    @XmlElement(name = "Nationality", required = true)
    protected String nationality;
    @XmlElement(name = "BirthDate", required = true)
    protected String birthDate;
    @XmlElement(name = "AnniversaryDate", required = true)
    protected String anniversaryDate;
    @XmlElement(name = "CostCenter", required = true)
    protected String costCenter;
    @XmlElement(name = "AddressType", required = true)
    protected String addressType;
    @XmlElement(name = "PassportNo", required = true)
    protected String passportNo;
    @XmlElement(name = "PassportDateOfEntry", required = true)
    protected String passportDateOfEntry;
    @XmlElement(name = "PassportValidFrom", required = true)
    protected String passportValidFrom;
    @XmlElement(name = "PassportValidTo", required = true)
    protected String passportValidTo;
    @XmlElement(name = "PassportCountryOfIssue", required = true)
    protected String passportCountryOfIssue;
    @XmlElement(name = "VisaId", required = true)
    protected String visaId;
    @XmlElement(name = "VisaDateOfEntry", required = true)
    protected String visaDateOfEntry;
    @XmlElement(name = "VisaValidFrom", required = true)
    protected String visaValidFrom;
    @XmlElement(name = "VisaValidTo", required = true)
    protected String visaValidTo;
    @XmlElement(name = "VisaCountryOfIssue", required = true)
    protected String visaCountryOfIssue;

    /**
     * Gets the value of the objectTask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectTask() {
        return objectTask;
    }

    /**
     * Sets the value of the objectTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectTask(String value) {
        this.objectTask = value;
    }

    /**
     * Gets the value of the legacyBp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyBp() {
        return legacyBp;
    }

    /**
     * Sets the value of the legacyBp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyBp(String value) {
        this.legacyBp = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the bpRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpRole() {
        return bpRole;
    }

    /**
     * Sets the value of the bpRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpRole(String value) {
        this.bpRole = value;
    }

    /**
     * Gets the value of the custAccgrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAccgrp() {
        return custAccgrp;
    }

    /**
     * Sets the value of the custAccgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAccgrp(String value) {
        this.custAccgrp = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the compCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompCode() {
        return compCode;
    }

    /**
     * Sets the value of the compCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompCode(String value) {
        this.compCode = value;
    }

    /**
     * Gets the value of the salesOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrg() {
        return salesOrg;
    }

    /**
     * Sets the value of the salesOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrg(String value) {
        this.salesOrg = value;
    }

    /**
     * Gets the value of the distChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistChannel() {
        return distChannel;
    }

    /**
     * Sets the value of the distChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistChannel(String value) {
        this.distChannel = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the name1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * Sets the value of the name1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * Gets the value of the name2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * Sets the value of the name2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2(String value) {
        this.name2 = value;
    }

    /**
     * Gets the value of the searchTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTerm() {
        return searchTerm;
    }

    /**
     * Sets the value of the searchTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTerm(String value) {
        this.searchTerm = value;
    }

    /**
     * Gets the value of the houseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNo() {
        return houseNo;
    }

    /**
     * Sets the value of the houseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNo(String value) {
        this.houseNo = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the street2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Sets the value of the street2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet2(String value) {
        this.street2 = value;
    }

    /**
     * Gets the value of the street3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet3() {
        return street3;
    }

    /**
     * Sets the value of the street3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet3(String value) {
        this.street3 = value;
    }

    /**
     * Gets the value of the street4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet4() {
        return street4;
    }

    /**
     * Sets the value of the street4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet4(String value) {
        this.street4 = value;
    }

    /**
     * Gets the value of the street5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet5() {
        return street5;
    }

    /**
     * Sets the value of the street5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet5(String value) {
        this.street5 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the countryKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryKey() {
        return countryKey;
    }

    /**
     * Sets the value of the countryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryKey(String value) {
        this.countryKey = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the telNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * Sets the value of the telNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelNo(String value) {
        this.telNo = value;
    }

    /**
     * Gets the value of the telExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelExt() {
        return telExt;
    }

    /**
     * Sets the value of the telExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelExt(String value) {
        this.telExt = value;
    }

    /**
     * Gets the value of the faxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * Sets the value of the faxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNo(String value) {
        this.faxNo = value;
    }

    /**
     * Gets the value of the faxExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxExt() {
        return faxExt;
    }

    /**
     * Sets the value of the faxExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxExt(String value) {
        this.faxExt = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the telNo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelNo2() {
        return telNo2;
    }

    /**
     * Sets the value of the telNo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelNo2(String value) {
        this.telNo2 = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the tradPartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradPartner() {
        return tradPartner;
    }

    /**
     * Sets the value of the tradPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradPartner(String value) {
        this.tradPartner = value;
    }

    /**
     * Gets the value of the industryKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryKey() {
        return industryKey;
    }

    /**
     * Sets the value of the industryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryKey(String value) {
        this.industryKey = value;
    }

    /**
     * Gets the value of the custClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustClass() {
        return custClass;
    }

    /**
     * Sets the value of the custClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustClass(String value) {
        this.custClass = value;
    }

    /**
     * Gets the value of the reccAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReccAcc() {
        return reccAcc;
    }

    /**
     * Sets the value of the reccAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReccAcc(String value) {
        this.reccAcc = value;
    }

    /**
     * Gets the value of the sortKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortKey() {
        return sortKey;
    }

    /**
     * Sets the value of the sortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortKey(String value) {
        this.sortKey = value;
    }

    /**
     * Gets the value of the payTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTerm() {
        return payTerm;
    }

    /**
     * Sets the value of the payTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTerm(String value) {
        this.payTerm = value;
    }

    /**
     * Gets the value of the recPayhistI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecPayhistI() {
        return recPayhistI;
    }

    /**
     * Sets the value of the recPayhistI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecPayhistI(String value) {
        this.recPayhistI = value;
    }

    /**
     * Gets the value of the accClerk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccClerk() {
        return accClerk;
    }

    /**
     * Sets the value of the accClerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccClerk(String value) {
        this.accClerk = value;
    }

    /**
     * Gets the value of the salesOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOff() {
        return salesOff;
    }

    /**
     * Sets the value of the salesOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOff(String value) {
        this.salesOff = value;
    }

    /**
     * Gets the value of the salesGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesGrp() {
        return salesGrp;
    }

    /**
     * Sets the value of the salesGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesGrp(String value) {
        this.salesGrp = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the pricingProc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingProc() {
        return pricingProc;
    }

    /**
     * Sets the value of the pricingProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingProc(String value) {
        this.pricingProc = value;
    }

    /**
     * Gets the value of the custStatGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustStatGrp() {
        return custStatGrp;
    }

    /**
     * Sets the value of the custStatGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustStatGrp(String value) {
        this.custStatGrp = value;
    }

    /**
     * Gets the value of the delivPlant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelivPlant() {
        return delivPlant;
    }

    /**
     * Sets the value of the delivPlant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelivPlant(String value) {
        this.delivPlant = value;
    }

    /**
     * Gets the value of the sPayTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPayTerm() {
        return sPayTerm;
    }

    /**
     * Sets the value of the sPayTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPayTerm(String value) {
        this.sPayTerm = value;
    }

    /**
     * Gets the value of the accAssGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccAssGrp() {
        return accAssGrp;
    }

    /**
     * Sets the value of the accAssGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccAssGrp(String value) {
        this.accAssGrp = value;
    }

    /**
     * Gets the value of the taxClassif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClassif() {
        return taxClassif;
    }

    /**
     * Sets the value of the taxClassif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClassif(String value) {
        this.taxClassif = value;
    }

    /**
     * Gets the value of the relCreate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelCreate() {
        return relCreate;
    }

    /**
     * Sets the value of the relCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelCreate(String value) {
        this.relCreate = value;
    }

    /**
     * Gets the value of the planGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanGrp() {
        return planGrp;
    }

    /**
     * Sets the value of the planGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanGrp(String value) {
        this.planGrp = value;
    }

    /**
     * Gets the value of the headOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadOffice() {
        return headOffice;
    }

    /**
     * Sets the value of the headOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadOffice(String value) {
        this.headOffice = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the anniversaryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnniversaryDate() {
        return anniversaryDate;
    }

    /**
     * Sets the value of the anniversaryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnniversaryDate(String value) {
        this.anniversaryDate = value;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the passportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNo() {
        return passportNo;
    }

    /**
     * Sets the value of the passportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNo(String value) {
        this.passportNo = value;
    }

    /**
     * Gets the value of the passportDateOfEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportDateOfEntry() {
        return passportDateOfEntry;
    }

    /**
     * Sets the value of the passportDateOfEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportDateOfEntry(String value) {
        this.passportDateOfEntry = value;
    }

    /**
     * Gets the value of the passportValidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportValidFrom() {
        return passportValidFrom;
    }

    /**
     * Sets the value of the passportValidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportValidFrom(String value) {
        this.passportValidFrom = value;
    }

    /**
     * Gets the value of the passportValidTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportValidTo() {
        return passportValidTo;
    }

    /**
     * Sets the value of the passportValidTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportValidTo(String value) {
        this.passportValidTo = value;
    }

    /**
     * Gets the value of the passportCountryOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportCountryOfIssue() {
        return passportCountryOfIssue;
    }

    /**
     * Sets the value of the passportCountryOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportCountryOfIssue(String value) {
        this.passportCountryOfIssue = value;
    }

    /**
     * Gets the value of the visaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaId() {
        return visaId;
    }

    /**
     * Sets the value of the visaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaId(String value) {
        this.visaId = value;
    }

    /**
     * Gets the value of the visaDateOfEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaDateOfEntry() {
        return visaDateOfEntry;
    }

    /**
     * Sets the value of the visaDateOfEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaDateOfEntry(String value) {
        this.visaDateOfEntry = value;
    }

    /**
     * Gets the value of the visaValidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaValidFrom() {
        return visaValidFrom;
    }

    /**
     * Sets the value of the visaValidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaValidFrom(String value) {
        this.visaValidFrom = value;
    }

    /**
     * Gets the value of the visaValidTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaValidTo() {
        return visaValidTo;
    }

    /**
     * Sets the value of the visaValidTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaValidTo(String value) {
        this.visaValidTo = value;
    }

    /**
     * Gets the value of the visaCountryOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaCountryOfIssue() {
        return visaCountryOfIssue;
    }

    /**
     * Sets the value of the visaCountryOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaCountryOfIssue(String value) {
        this.visaCountryOfIssue = value;
    }

}
