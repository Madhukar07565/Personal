
package com.cnk.travelogix.custom.subscribe.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalAccountMaintainMassRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalAccountMaintainMassRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schema.provisioning.ws.highdeal.com/}externalAccountMaintainRequest" maxOccurs="1000"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalAccountMaintainMassRequest", propOrder = {
    "externalAccountMaintainRequest"
})
public class ExternalAccountMaintainMassRequest {

    @XmlElement(namespace = "http://schema.provisioning.ws.highdeal.com/", required = true)
    protected List<ExternalAccountMaintainRequest> externalAccountMaintainRequest;

    /**
     * Gets the value of the externalAccountMaintainRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalAccountMaintainRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalAccountMaintainRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalAccountMaintainRequest }
     * 
     * 
     */
    public List<ExternalAccountMaintainRequest> getExternalAccountMaintainRequest() {
        if (externalAccountMaintainRequest == null) {
            externalAccountMaintainRequest = new ArrayList<ExternalAccountMaintainRequest>();
        }
        return this.externalAccountMaintainRequest;
    }

}
