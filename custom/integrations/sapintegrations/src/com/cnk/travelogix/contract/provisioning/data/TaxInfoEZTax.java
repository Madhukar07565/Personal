
package com.cnk.travelogix.contract.provisioning.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxInfoEZTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInfoEZTax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origination" type="{http://suac.ws.highdeal.com/}EZTaxString" minOccurs="0"/>
 *         &lt;element name="termination" type="{http://suac.ws.highdeal.com/}EZTaxString" minOccurs="0"/>
 *         &lt;element name="serviceAddress" type="{http://suac.ws.highdeal.com/}EZTaxString" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://suac.ws.highdeal.com/}EZTaxCustomerType" minOccurs="0"/>
 *         &lt;element name="incorporatedCode" type="{http://suac.ws.highdeal.com/}EZTaxIncorporatedCode" minOccurs="0"/>
 *         &lt;element name="clientResale" type="{http://suac.ws.highdeal.com/}EZTaxClientResale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInfoEZTax", namespace = "http://suac.ws.highdeal.com/", propOrder = {
    "origination",
    "termination",
    "serviceAddress",
    "customerType",
    "incorporatedCode",
    "clientResale"
})
public class TaxInfoEZTax {

    protected String origination;
    protected String termination;
    protected String serviceAddress;
    @XmlSchemaType(name = "string")
    protected EZTaxCustomerType customerType;
    @XmlSchemaType(name = "string")
    protected EZTaxIncorporatedCode incorporatedCode;
    @XmlSchemaType(name = "string")
    protected EZTaxClientResale clientResale;

    /**
     * Gets the value of the origination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigination() {
        return origination;
    }

    /**
     * Sets the value of the origination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigination(String value) {
        this.origination = value;
    }

    /**
     * Gets the value of the termination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermination() {
        return termination;
    }

    /**
     * Sets the value of the termination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermination(String value) {
        this.termination = value;
    }

    /**
     * Gets the value of the serviceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAddress() {
        return serviceAddress;
    }

    /**
     * Sets the value of the serviceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAddress(String value) {
        this.serviceAddress = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link EZTaxCustomerType }
     *     
     */
    public EZTaxCustomerType getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZTaxCustomerType }
     *     
     */
    public void setCustomerType(EZTaxCustomerType value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the incorporatedCode property.
     * 
     * @return
     *     possible object is
     *     {@link EZTaxIncorporatedCode }
     *     
     */
    public EZTaxIncorporatedCode getIncorporatedCode() {
        return incorporatedCode;
    }

    /**
     * Sets the value of the incorporatedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZTaxIncorporatedCode }
     *     
     */
    public void setIncorporatedCode(EZTaxIncorporatedCode value) {
        this.incorporatedCode = value;
    }

    /**
     * Gets the value of the clientResale property.
     * 
     * @return
     *     possible object is
     *     {@link EZTaxClientResale }
     *     
     */
    public EZTaxClientResale getClientResale() {
        return clientResale;
    }

    /**
     * Sets the value of the clientResale property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZTaxClientResale }
     *     
     */
    public void setClientResale(EZTaxClientResale value) {
        this.clientResale = value;
    }

}
