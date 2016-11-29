
package com.cnk.travelogix.custom.subscribe.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PrepaidAccountReadRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidAccountReadRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prepaidAccountReference" type="{http://suac.ws.highdeal.com/}PrepaidAccountReference"/>
 *         &lt;element name="date" type="{http://schema.ws.highdeal.com/}Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidAccountReadRequest", propOrder = {
    "prepaidAccountReference",
    "date"
})
public class PrepaidAccountReadRequest {

    @XmlElement(required = true)
    protected PrepaidAccountReference prepaidAccountReference;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;

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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
