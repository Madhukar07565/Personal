
package com.cnk.travelogix.custom.zif.erp.ws.opportunity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifProdCatForex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifProdCatForex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoOfTraveller" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *         &lt;element name="FulfilmentLocation" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="PurposeOfPurchase" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="Product" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *         &lt;element name="CurrencyToBuySell" type="{urn:sap-com:document:sap:rfc:functions}char30"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifProdCatForex", propOrder = {
    "noOfTraveller",
    "fulfilmentLocation",
    "purposeOfPurchase",
    "product",
    "currencyToBuySell"
})
public class ZifProdCatForex {

    @XmlElement(name = "NoOfTraveller", required = true)
    protected String noOfTraveller;
    @XmlElement(name = "FulfilmentLocation", required = true)
    protected String fulfilmentLocation;
    @XmlElement(name = "PurposeOfPurchase", required = true)
    protected String purposeOfPurchase;
    @XmlElement(name = "Product", required = true)
    protected String product;
    @XmlElement(name = "CurrencyToBuySell", required = true)
    protected String currencyToBuySell;

    /**
     * Gets the value of the noOfTraveller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfTraveller() {
        return noOfTraveller;
    }

    /**
     * Sets the value of the noOfTraveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfTraveller(String value) {
        this.noOfTraveller = value;
    }

    /**
     * Gets the value of the fulfilmentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfilmentLocation() {
        return fulfilmentLocation;
    }

    /**
     * Sets the value of the fulfilmentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfilmentLocation(String value) {
        this.fulfilmentLocation = value;
    }

    /**
     * Gets the value of the purposeOfPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeOfPurchase() {
        return purposeOfPurchase;
    }

    /**
     * Sets the value of the purposeOfPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeOfPurchase(String value) {
        this.purposeOfPurchase = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the currencyToBuySell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyToBuySell() {
        return currencyToBuySell;
    }

    /**
     * Sets the value of the currencyToBuySell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyToBuySell(String value) {
        this.currencyToBuySell = value;
    }

}
