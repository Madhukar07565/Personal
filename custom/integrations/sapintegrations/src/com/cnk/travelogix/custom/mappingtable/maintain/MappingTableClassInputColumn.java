
package com.cnk.travelogix.custom.mappingtable.maintain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MappingTableClassInputColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MappingTableClassInputColumn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mappingtable.ws.highdeal.com/}MappingTableClassColumn">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="string" type="{http://schema.ws.highdeal.com/}String256"/>
 *           &lt;element name="currency" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingTableClassInputColumn", namespace = "http://mappingtable.ws.highdeal.com/", propOrder = {
    "string",
    "currency"
})
public class MappingTableClassInputColumn
    extends MappingTableClassColumn
{

    @XmlElementRef(name = "string", type = JAXBElement.class, required = false)
    protected JAXBElement<String> string;
    @XmlElementRef(name = "currency", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setString(JAXBElement<String> value) {
        this.string = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<String> value) {
        this.currency = value;
    }

}
