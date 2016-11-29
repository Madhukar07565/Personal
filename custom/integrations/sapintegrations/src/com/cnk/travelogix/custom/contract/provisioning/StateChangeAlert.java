
package com.cnk.travelogix.custom.contract.provisioning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StateChangeAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateChangeAlert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertCode" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="dayCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="toStateCode" type="{http://suac.ws.highdeal.com/}PrepaidAccountState"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateChangeAlert", namespace = "http://suac.ws.highdeal.com/", propOrder = {
    "alertCode",
    "dayCount",
    "toStateCode"
})
public class StateChangeAlert {

    @XmlElement(required = true)
    protected String alertCode;
    @XmlElement(defaultValue = "0")
    protected Integer dayCount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PrepaidAccountState toStateCode;

    /**
     * Gets the value of the alertCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCode() {
        return alertCode;
    }

    /**
     * Sets the value of the alertCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCode(String value) {
        this.alertCode = value;
    }

    /**
     * Gets the value of the dayCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayCount() {
        return dayCount;
    }

    /**
     * Sets the value of the dayCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayCount(Integer value) {
        this.dayCount = value;
    }

    /**
     * Gets the value of the toStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidAccountState }
     *     
     */
    public PrepaidAccountState getToStateCode() {
        return toStateCode;
    }

    /**
     * Sets the value of the toStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidAccountState }
     *     
     */
    public void setToStateCode(PrepaidAccountState value) {
        this.toStateCode = value;
    }

}
