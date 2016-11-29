
package com.cnk.travelogix.custom.mappingtable.maintain;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MappingTableClassOutputColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MappingTableClassOutputColumn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mappingtable.ws.highdeal.com/}MappingTableClassColumn">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="string" type="{http://schema.ws.highdeal.com/}String256"/>
 *           &lt;element name="number" type="{http://schema.ws.highdeal.com/}Decimal28_6"/>
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
@XmlType(name = "MappingTableClassOutputColumn", namespace = "http://mappingtable.ws.highdeal.com/", propOrder = {
    "string",
    "number"
})
public class MappingTableClassOutputColumn
    extends MappingTableClassColumn
{

    @XmlElementRef(name = "string", type = JAXBElement.class, required = false)
    protected JAXBElement<String> string;
    @XmlElementRef(name = "number", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> number;

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
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNumber(JAXBElement<BigDecimal> value) {
        this.number = value;
    }

}
