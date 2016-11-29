
package com.cnk.travelogix.custom.ziffm.vendor.createchange;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZbankDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZbankDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Banks01" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Bankl01" type="{urn:sap-com:document:sap:rfc:functions}char15"/>
 *         &lt;element name="Bankn01" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Koinh01" type="{urn:sap-com:document:sap:rfc:functions}char60"/>
 *         &lt;element name="Bkont" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Bvtyp" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Bank" type="{urn:sap-com:document:sap:rfc:functions}char60"/>
 *         &lt;element name="Provz" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Stras" type="{urn:sap-com:document:sap:rfc:functions}char35"/>
 *         &lt;element name="StrSuppl3" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="StrSuppl4" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Ort01" type="{urn:sap-com:document:sap:rfc:functions}char35"/>
 *         &lt;element name="PostCode1" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Brnch" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Swift" type="{urn:sap-com:document:sap:rfc:functions}char11"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZbankDetail", propOrder = {
    "banks01",
    "bankl01",
    "bankn01",
    "koinh01",
    "bkont",
    "bvtyp",
    "bank",
    "provz",
    "stras",
    "strSuppl3",
    "strSuppl4",
    "ort01",
    "postCode1",
    "brnch",
    "swift"
})
public class ZbankDetail {

    @XmlElement(name = "Banks01", required = true)
    protected String banks01;
    @XmlElement(name = "Bankl01", required = true)
    protected String bankl01;
    @XmlElement(name = "Bankn01", required = true)
    protected String bankn01;
    @XmlElement(name = "Koinh01", required = true)
    protected String koinh01;
    @XmlElement(name = "Bkont", required = true)
    protected String bkont;
    @XmlElement(name = "Bvtyp", required = true)
    protected String bvtyp;
    @XmlElement(name = "Bank", required = true)
    protected String bank;
    @XmlElement(name = "Provz", required = true)
    protected String provz;
    @XmlElement(name = "Stras", required = true)
    protected String stras;
    @XmlElement(name = "StrSuppl3", required = true)
    protected String strSuppl3;
    @XmlElement(name = "StrSuppl4", required = true)
    protected String strSuppl4;
    @XmlElement(name = "Ort01", required = true)
    protected String ort01;
    @XmlElement(name = "PostCode1", required = true)
    protected String postCode1;
    @XmlElement(name = "Brnch", required = true)
    protected String brnch;
    @XmlElement(name = "Swift", required = true)
    protected String swift;

    /**
     * Gets the value of the banks01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanks01() {
        return banks01;
    }

    /**
     * Sets the value of the banks01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanks01(String value) {
        this.banks01 = value;
    }

    /**
     * Gets the value of the bankl01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankl01() {
        return bankl01;
    }

    /**
     * Sets the value of the bankl01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankl01(String value) {
        this.bankl01 = value;
    }

    /**
     * Gets the value of the bankn01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankn01() {
        return bankn01;
    }

    /**
     * Sets the value of the bankn01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankn01(String value) {
        this.bankn01 = value;
    }

    /**
     * Gets the value of the koinh01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoinh01() {
        return koinh01;
    }

    /**
     * Sets the value of the koinh01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoinh01(String value) {
        this.koinh01 = value;
    }

    /**
     * Gets the value of the bkont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkont() {
        return bkont;
    }

    /**
     * Sets the value of the bkont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkont(String value) {
        this.bkont = value;
    }

    /**
     * Gets the value of the bvtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBvtyp() {
        return bvtyp;
    }

    /**
     * Sets the value of the bvtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBvtyp(String value) {
        this.bvtyp = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBank(String value) {
        this.bank = value;
    }

    /**
     * Gets the value of the provz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvz() {
        return provz;
    }

    /**
     * Sets the value of the provz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvz(String value) {
        this.provz = value;
    }

    /**
     * Gets the value of the stras property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStras() {
        return stras;
    }

    /**
     * Sets the value of the stras property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStras(String value) {
        this.stras = value;
    }

    /**
     * Gets the value of the strSuppl3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSuppl3() {
        return strSuppl3;
    }

    /**
     * Sets the value of the strSuppl3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSuppl3(String value) {
        this.strSuppl3 = value;
    }

    /**
     * Gets the value of the strSuppl4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSuppl4() {
        return strSuppl4;
    }

    /**
     * Sets the value of the strSuppl4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSuppl4(String value) {
        this.strSuppl4 = value;
    }

    /**
     * Gets the value of the ort01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt01() {
        return ort01;
    }

    /**
     * Sets the value of the ort01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt01(String value) {
        this.ort01 = value;
    }

    /**
     * Gets the value of the postCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode1() {
        return postCode1;
    }

    /**
     * Sets the value of the postCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode1(String value) {
        this.postCode1 = value;
    }

    /**
     * Gets the value of the brnch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnch() {
        return brnch;
    }

    /**
     * Sets the value of the brnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrnch(String value) {
        this.brnch = value;
    }

    /**
     * Gets the value of the swift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwift() {
        return swift;
    }

    /**
     * Sets the value of the swift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwift(String value) {
        this.swift = value;
    }

}
