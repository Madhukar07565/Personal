
package com.cnk.travelogix.sapintegrations.invoice.create.data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifstBilldoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifstBilldoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefDoc" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="ReqQty" type="{urn:sap-com:document:sap:rfc:functions}quantum15.3"/>
 *         &lt;element name="RefItem" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/>
 *         &lt;element name="BillDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifstBilldoc", propOrder = {
    "refDoc",
    "reqQty",
    "refItem",
    "billDate"
})
public class ZifstBilldocData {

    @XmlElement(name = "RefDoc", required = true)
    protected String refDoc;
    @XmlElement(name = "ReqQty", required = true)
    protected BigDecimal reqQty;
    @XmlElement(name = "RefItem", required = true)
    protected String refItem;
    @XmlElement(name = "BillDate", required = true)
    protected String billDate;

    /**
     * Gets the value of the refDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDoc() {
        return refDoc;
    }

    /**
     * Sets the value of the refDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDoc(String value) {
        this.refDoc = value;
    }

    /**
     * Gets the value of the reqQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReqQty() {
        return reqQty;
    }

    /**
     * Sets the value of the reqQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReqQty(BigDecimal value) {
        this.reqQty = value;
    }

    /**
     * Gets the value of the refItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefItem() {
        return refItem;
    }

    /**
     * Sets the value of the refItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefItem(String value) {
        this.refItem = value;
    }

    /**
     * Gets the value of the billDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillDate() {
        return billDate;
    }

    /**
     * Sets the value of the billDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillDate(String value) {
        this.billDate = value;
    }

}
