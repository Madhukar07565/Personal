
package com.cnk.travelogix.custom.zifwsb.invoice.create;

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
 *         &lt;element name="IBillDoc" type="{urn:sap-com:document:sap:soap:functions:mc-style}ZttBilldoc"/>
 *         &lt;element name="Uniqid" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
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
    "iBillDoc",
    "uniqid"
})
@XmlRootElement(name = "ZIffmBillDocCreate")
public class ZIffmBillDocCreate {

    @XmlElement(name = "IBillDoc", required = true)
    protected ZttBilldoc iBillDoc;
    @XmlElement(name = "Uniqid", required = true)
    protected String uniqid;

    /**
     * Gets the value of the iBillDoc property.
     * 
     * @return
     *     possible object is
     *     {@link ZttBilldoc }
     *     
     */
    public ZttBilldoc getIBillDoc() {
        return iBillDoc;
    }

    /**
     * Sets the value of the iBillDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZttBilldoc }
     *     
     */
    public void setIBillDoc(ZttBilldoc value) {
        this.iBillDoc = value;
    }

    /**
     * Gets the value of the uniqid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqid() {
        return uniqid;
    }

    /**
     * Sets the value of the uniqid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqid(String value) {
        this.uniqid = value;
    }

}
