
package com.cnk.travelogix.custom.zifws.account.clear;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EStatus" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifttStatusDoc"/>
 *         &lt;element name="ItAccount" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZifstAccount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eStatus",
    "itAccount"
})
@XmlRootElement(name = "ZIffmAccountClearResponse")
public class ZIffmAccountClearResponse {

    @XmlElement(name = "EStatus", required = true)
    protected ZifttStatusDoc eStatus;
    @XmlElement(name = "ItAccount", required = true)
    protected TableOfZifstAccount itAccount;

    /**
     * Gets the value of the eStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ZifttStatusDoc }
     *     
     */
    public ZifttStatusDoc getEStatus() {
        return eStatus;
    }

    /**
     * Sets the value of the eStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifttStatusDoc }
     *     
     */
    public void setEStatus(ZifttStatusDoc value) {
        this.eStatus = value;
    }

    /**
     * Gets the value of the itAccount property.
     * 
     * @return
     *     possible object is
     *     {@link TableOfZifstAccount }
     *     
     */
    public TableOfZifstAccount getItAccount() {
        return itAccount;
    }

    /**
     * Sets the value of the itAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfZifstAccount }
     *     
     */
    public void setItAccount(TableOfZifstAccount value) {
        this.itAccount = value;
    }

}
