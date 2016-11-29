
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
 *         &lt;element name="IDocheader" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZifstDocheadClear"/>
 *         &lt;element name="ItAccount" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZifstAccount" minOccurs="0"/>
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
    "iDocheader",
    "itAccount"
})
@XmlRootElement(name = "ZIffmAccountClear")
public class ZIffmAccountClear {

    @XmlElement(name = "IDocheader", required = true)
    protected ZifstDocheadClear iDocheader;
    @XmlElement(name = "ItAccount")
    protected TableOfZifstAccount itAccount;

    /**
     * Gets the value of the iDocheader property.
     * 
     * @return
     *     possible object is
     *     {@link ZifstDocheadClear }
     *     
     */
    public ZifstDocheadClear getIDocheader() {
        return iDocheader;
    }

    /**
     * Sets the value of the iDocheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZifstDocheadClear }
     *     
     */
    public void setIDocheader(ZifstDocheadClear value) {
        this.iDocheader = value;
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
