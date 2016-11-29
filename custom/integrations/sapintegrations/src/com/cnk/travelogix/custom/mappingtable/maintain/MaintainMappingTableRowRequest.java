
package com.cnk.travelogix.custom.mappingtable.maintain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintainMappingTableRowRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintainMappingTableRowRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mappingTableId" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="row" type="{http://mappingtable.ws.highdeal.com/}MappingTableRow" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintainMappingTableRowRequest", namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", propOrder = {
    "mappingTableId",
    "row"
})
public class MaintainMappingTableRowRequest {

    @XmlElement(required = true)
    protected String mappingTableId;
    @XmlElement(required = true)
    protected List<MappingTableRow> row;

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
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MappingTableRow }
     * 
     * 
     */
    public List<MappingTableRow> getRow() {
        if (row == null) {
            row = new ArrayList<MappingTableRow>();
        }
        return this.row;
    }

}
