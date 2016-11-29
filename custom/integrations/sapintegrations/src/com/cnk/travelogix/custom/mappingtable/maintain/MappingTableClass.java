
package com.cnk.travelogix.custom.mappingtable.maintain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MappingTableClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MappingTableClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="owner" type="{http://schema.ws.highdeal.com/}String256"/>
 *         &lt;element name="description" type="{http://schema.ws.highdeal.com/}String2000" minOccurs="0"/>
 *         &lt;element name="inputColumn" type="{http://mappingtable.ws.highdeal.com/}MappingTableClassInputColumn" maxOccurs="4"/>
 *         &lt;element name="outputColumn" type="{http://mappingtable.ws.highdeal.com/}MappingTableClassOutputColumn" maxOccurs="15" minOccurs="0"/>
 *         &lt;element name="additionalInfo" type="{http://schema.ws.highdeal.com/}AdditionalInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingTableClass", namespace = "http://mappingtable.ws.highdeal.com/", propOrder = {
    "id",
    "owner",
    "description",
    "inputColumn",
    "outputColumn",
    "additionalInfo"
})
public class MappingTableClass {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String owner;
    protected String description;
    @XmlElement(required = true)
    protected List<MappingTableClassInputColumn> inputColumn;
    protected List<MappingTableClassOutputColumn> outputColumn;
    protected List<AdditionalInfo> additionalInfo;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the inputColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MappingTableClassInputColumn }
     * 
     * 
     */
    public List<MappingTableClassInputColumn> getInputColumn() {
        if (inputColumn == null) {
            inputColumn = new ArrayList<MappingTableClassInputColumn>();
        }
        return this.inputColumn;
    }

    /**
     * Gets the value of the outputColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MappingTableClassOutputColumn }
     * 
     * 
     */
    public List<MappingTableClassOutputColumn> getOutputColumn() {
        if (outputColumn == null) {
            outputColumn = new ArrayList<MappingTableClassOutputColumn>();
        }
        return this.outputColumn;
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

}
