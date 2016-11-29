
package com.cnk.travelogix.custom.subscribe.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberAccountSearchFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberAccountSearchFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}SearchFilter">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://schema.ws.highdeal.com/}StringAttributeDescription" minOccurs="0"/>
 *         &lt;element name="additionalInfo" type="{http://schema.ws.highdeal.com/}AdditionalAttributeDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberAccountSearchFilter", propOrder = {
    "id",
    "additionalInfo"
})
public class SubscriberAccountSearchFilter
    extends SearchFilter
{

    protected StringAttributeDescription id;
    protected List<AdditionalAttributeDescription> additionalInfo;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link StringAttributeDescription }
     *     
     */
    public StringAttributeDescription getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringAttributeDescription }
     *     
     */
    public void setId(StringAttributeDescription value) {
        this.id = value;
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
     * {@link AdditionalAttributeDescription }
     * 
     * 
     */
    public List<AdditionalAttributeDescription> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new ArrayList<AdditionalAttributeDescription>();
        }
        return this.additionalInfo;
    }

}
