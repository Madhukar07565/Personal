
package com.cnk.travelogix.custom.subscribe.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PrepaidAccountStateChangeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidAccountStateChangeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prepaidAccountReference" type="{http://suac.ws.highdeal.com/}PrepaidAccountReference"/>
 *         &lt;element name="stateCode" type="{http://suac.ws.highdeal.com/}PrepaidAccountState"/>
 *         &lt;element name="fromDate" type="{http://schema.ws.highdeal.com/}Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidAccountStateChangeRequest", propOrder = {
    "prepaidAccountReference",
    "stateCode",
    "fromDate"
})
public class PrepaidAccountStateChangeRequest {

    @XmlElement(required = true)
    protected PrepaidAccountReference prepaidAccountReference;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PrepaidAccountState stateCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;

    /**
     * Gets the value of the prepaidAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidAccountReference }
     *     
     */
    public PrepaidAccountReference getPrepaidAccountReference() {
        return prepaidAccountReference;
    }

    /**
     * Sets the value of the prepaidAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidAccountReference }
     *     
     */
    public void setPrepaidAccountReference(PrepaidAccountReference value) {
        this.prepaidAccountReference = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidAccountState }
     *     
     */
    public PrepaidAccountState getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidAccountState }
     *     
     */
    public void setStateCode(PrepaidAccountState value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

}
