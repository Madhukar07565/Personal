
package com.cnk.travelogix.custom.subscribe.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidAccountMaintainBundleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepaidAccountMaintainBundleResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}Response">
 *       &lt;sequence>
 *         &lt;element ref="{http://schema.provisioning.ws.highdeal.com/}prepaidAccountMaintainResponse" maxOccurs="1000"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepaidAccountMaintainBundleResponse", propOrder = {
    "prepaidAccountMaintainResponse"
})
public class PrepaidAccountMaintainBundleResponse
    extends Response
{

    @XmlElement(namespace = "http://schema.provisioning.ws.highdeal.com/", required = true)
    protected List<PrepaidAccountOperationResponse> prepaidAccountMaintainResponse;

    /**
     * Gets the value of the prepaidAccountMaintainResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prepaidAccountMaintainResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrepaidAccountMaintainResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrepaidAccountOperationResponse }
     * 
     * 
     */
    public List<PrepaidAccountOperationResponse> getPrepaidAccountMaintainResponse() {
        if (prepaidAccountMaintainResponse == null) {
            prepaidAccountMaintainResponse = new ArrayList<PrepaidAccountOperationResponse>();
        }
        return this.prepaidAccountMaintainResponse;
    }

}
