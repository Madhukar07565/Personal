
package com.cnk.travelogix.custom.zif.terp.ws.complaints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifTerpComplaintsPartners complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifTerpComplaintsPartners">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItmNumber" type="{urn:sap-com:document:sap:rfc:functions}numeric10"/>
 *         &lt;element name="PartnerFunction" type="{urn:sap-com:document:sap:rfc:functions}char8"/>
 *         &lt;element name="PartnNumb" type="{urn:sap-com:document:sap:rfc:functions}char32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifTerpComplaintsPartners", propOrder = {
    "itmNumber",
    "partnerFunction",
    "partnNumb"
})
public class ZifTerpComplaintsPartners {

    @XmlElement(name = "ItmNumber", required = true)
    protected String itmNumber;
    @XmlElement(name = "PartnerFunction", required = true)
    protected String partnerFunction;
    @XmlElement(name = "PartnNumb", required = true)
    protected String partnNumb;

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
     * Gets the value of the partnerFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerFunction() {
        return partnerFunction;
    }

    /**
     * Sets the value of the partnerFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerFunction(String value) {
        this.partnerFunction = value;
    }

    /**
     * Gets the value of the partnNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnNumb() {
        return partnNumb;
    }

    /**
     * Sets the value of the partnNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnNumb(String value) {
        this.partnNumb = value;
    }

}
