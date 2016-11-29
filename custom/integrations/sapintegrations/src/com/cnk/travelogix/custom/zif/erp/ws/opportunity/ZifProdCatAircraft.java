
package com.cnk.travelogix.custom.zif.erp.ws.opportunity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ZifProdCatAircraft complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifProdCatAircraft">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="DepartureTime" type="{urn:sap-com:document:sap:rfc:functions}time"/>
 *         &lt;element name="ReturnDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="ReturnTime" type="{urn:sap-com:document:sap:rfc:functions}time"/>
 *         &lt;element name="NoOfPassangers" type="{urn:sap-com:document:sap:rfc:functions}numeric2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifProdCatAircraft", propOrder = {
    "departureDate",
    "departureTime",
    "returnDate",
    "returnTime",
    "noOfPassangers"
})
public class ZifProdCatAircraft {

    @XmlElement(name = "DepartureDate", required = true)
    protected String departureDate;
    @XmlElement(name = "DepartureTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar departureTime;
    @XmlElement(name = "ReturnDate", required = true)
    protected String returnDate;
    @XmlElement(name = "ReturnTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar returnTime;
    @XmlElement(name = "NoOfPassangers", required = true)
    protected String noOfPassangers;

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDate(String value) {
        this.returnDate = value;
    }

    /**
     * Gets the value of the returnTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnTime() {
        return returnTime;
    }

    /**
     * Sets the value of the returnTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnTime(XMLGregorianCalendar value) {
        this.returnTime = value;
    }

    /**
     * Gets the value of the noOfPassangers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfPassangers() {
        return noOfPassangers;
    }

    /**
     * Sets the value of the noOfPassangers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfPassangers(String value) {
        this.noOfPassangers = value;
    }

}
