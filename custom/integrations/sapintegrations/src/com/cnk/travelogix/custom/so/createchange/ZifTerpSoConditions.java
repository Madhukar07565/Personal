
package com.cnk.travelogix.custom.so.createchange;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifTerpSoConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifTerpSoConditions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItmNumber" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/>
 *         &lt;element name="CondType" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="CondValue" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/>
 *         &lt;element name="Currency" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/>
 *         &lt;element name="CrmtMode" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifTerpSoConditions", propOrder = {
    "itmNumber",
    "condType",
    "condValue",
    "currency",
    "crmtMode"
})
public class ZifTerpSoConditions {

    @XmlElement(name = "ItmNumber", required = true)
    protected String itmNumber;
    @XmlElement(name = "CondType", required = true)
    protected String condType;
    @XmlElement(name = "CondValue", required = true)
    protected BigDecimal condValue;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "CrmtMode", required = true)
    protected String crmtMode;

    /**
     * Gets the value of the itmNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmNumber() {
        return itmNumber;
    }

    /**
     * Sets the value of the itmNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmNumber(String value) {
        this.itmNumber = value;
    }

    /**
     * Gets the value of the condType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondType() {
        return condType;
    }

    /**
     * Sets the value of the condType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondType(String value) {
        this.condType = value;
    }

    /**
     * Gets the value of the condValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCondValue() {
        return condValue;
    }

    /**
     * Sets the value of the condValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCondValue(BigDecimal value) {
        this.condValue = value;
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
     * Gets the value of the crmtMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmtMode() {
        return crmtMode;
    }

    /**
     * Sets the value of the crmtMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmtMode(String value) {
        this.crmtMode = value;
    }

}
