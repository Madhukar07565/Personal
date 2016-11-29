
package com.cnk.travelogix.custom.subscribe.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxInfoVAT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInfoVAT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxCode" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="customerCountryCode" type="{http://schema.ws.highdeal.com/}CountryCode" minOccurs="0"/>
 *         &lt;element name="businessCategory" type="{http://suac.ws.highdeal.com/}VATBusinessCategory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInfoVAT", namespace = "http://suac.ws.highdeal.com/", propOrder = {
    "taxCode",
    "customerCountryCode",
    "businessCategory"
})
public class TaxInfoVAT {

    @XmlElement(required = true)
    protected String taxCode;
    protected String customerCountryCode;
    @XmlSchemaType(name = "string")
    protected VATBusinessCategory businessCategory;

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the customerCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCountryCode() {
        return customerCountryCode;
    }

    /**
     * Sets the value of the customerCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCountryCode(String value) {
        this.customerCountryCode = value;
    }

    /**
     * Gets the value of the businessCategory property.
     * 
     * @return
     *     possible object is
     *     {@link VATBusinessCategory }
     *     
     */
    public VATBusinessCategory getBusinessCategory() {
        return businessCategory;
    }

    /**
     * Sets the value of the businessCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link VATBusinessCategory }
     *     
     */
    public void setBusinessCategory(VATBusinessCategory value) {
        this.businessCategory = value;
    }

}
