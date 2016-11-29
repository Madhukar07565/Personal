
package com.cnk.travelogix.custom.mappingtable.maintain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindMappingTableResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindMappingTableResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}SearchResponse">
 *       &lt;sequence>
 *         &lt;element name="mappingTable" type="{http://subscribermappingtable.ws.highdeal.com/}SubscriberMappingTable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindMappingTableResponse", namespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", propOrder = {
    "mappingTable"
})
public class FindMappingTableResponse
    extends SearchResponse
{

    protected List<SubscriberMappingTable> mappingTable;

    /**
     * Gets the value of the mappingTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mappingTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMappingTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberMappingTable }
     * 
     * 
     */
    public List<SubscriberMappingTable> getMappingTable() {
        if (mappingTable == null) {
            mappingTable = new ArrayList<SubscriberMappingTable>();
        }
        return this.mappingTable;
    }

}
