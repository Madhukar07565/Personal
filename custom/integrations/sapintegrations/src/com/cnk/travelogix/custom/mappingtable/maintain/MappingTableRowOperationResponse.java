
package com.cnk.travelogix.custom.mappingtable.maintain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MappingTableRowOperationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MappingTableRowOperationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}Response">
 *       &lt;sequence>
 *         &lt;element name="mappingTableId" type="{http://schema.ws.highdeal.com/}String256" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://schema.ws.highdeal.com/}String256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingTableRowOperationResponse", namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", propOrder = {
    "mappingTableId",
    "reference"
})
public class MappingTableRowOperationResponse
    extends Response
{

    protected String mappingTableId;
    protected String reference;

    /**
     * Gets the value of the mappingTableId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingTableId() {
        return mappingTableId;
    }

    /**
     * Sets the value of the mappingTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingTableId(String value) {
        this.mappingTableId = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

}
