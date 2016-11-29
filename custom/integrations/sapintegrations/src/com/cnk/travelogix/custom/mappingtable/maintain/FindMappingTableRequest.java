
package com.cnk.travelogix.custom.mappingtable.maintain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindMappingTableRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindMappingTableRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mappingTableSearchFilter" type="{http://schema.subscribermappingtablemanagement.ws.highdeal.com/}MappingTableSearchFilter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindMappingTableRequest", namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", propOrder = {
    "mappingTableSearchFilter"
})
public class FindMappingTableRequest {

    @XmlElement(required = true)
    protected MappingTableSearchFilter mappingTableSearchFilter;

    /**
     * Gets the value of the mappingTableSearchFilter property.
     * 
     * @return
     *     possible object is
     *     {@link MappingTableSearchFilter }
     *     
     */
    public MappingTableSearchFilter getMappingTableSearchFilter() {
        return mappingTableSearchFilter;
    }

    /**
     * Sets the value of the mappingTableSearchFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MappingTableSearchFilter }
     *     
     */
    public void setMappingTableSearchFilter(MappingTableSearchFilter value) {
        this.mappingTableSearchFilter = value;
    }

}
