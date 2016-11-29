
package com.cnk.travelogix.custom.contract.provisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mode" type="{http://suac.ws.highdeal.com/}AccountTaxationMode"/>
 *         &lt;choice>
 *           &lt;element name="vat" type="{http://suac.ws.highdeal.com/}TaxInfoVAT"/>
 *           &lt;element name="ezTax" type="{http://suac.ws.highdeal.com/}TaxInfoEZTax"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInfo", namespace = "http://suac.ws.highdeal.com/", propOrder = {
    "mode",
    "vat",
    "ezTax"
})
public class TaxInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AccountTaxationMode mode;
    protected TaxInfoVAT vat;
    protected TaxInfoEZTax ezTax;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTaxationMode }
     *     
     */
    public AccountTaxationMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTaxationMode }
     *     
     */
    public void setMode(AccountTaxationMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInfoVAT }
     *     
     */
    public TaxInfoVAT getVat() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInfoVAT }
     *     
     */
    public void setVat(TaxInfoVAT value) {
        this.vat = value;
    }

    /**
     * Gets the value of the ezTax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInfoEZTax }
     *     
     */
    public TaxInfoEZTax getEzTax() {
        return ezTax;
    }

    /**
     * Sets the value of the ezTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInfoEZTax }
     *     
     */
    public void setEzTax(TaxInfoEZTax value) {
        this.ezTax = value;
    }

}
