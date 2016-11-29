
package com.cnk.travelogix.custom.mappingtable.maintain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MappingTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MappingTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="mappingTableClassId" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="owner" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="additionalInfo" type="{http://schema.ws.highdeal.com/}AdditionalInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="row" type="{http://mappingtable.ws.highdeal.com/}MappingTableRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingTable", namespace = "http://mappingtable.ws.highdeal.com/", propOrder = {
    "id",
    "mappingTableClassId",
    "owner",
    "additionalInfo",
    "row"
})
public class MappingTable {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String mappingTableClassId;
    @XmlElement(required = true)
    protected String owner;
    protected List<AdditionalInfo> additionalInfo;
    protected List<MappingTableRow> row;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the mappingTableClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingTableClassId() {
        return mappingTableClassId;
    }

    /**
     * Sets the value of the mappingTableClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingTableClassId(String value) {
        this.mappingTableClassId = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInfo }
     * 
     * 
     */
    public List<AdditionalInfo> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new ArrayList<AdditionalInfo>();
        }
        return this.additionalInfo;
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
