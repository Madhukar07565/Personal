
package com.cnk.travelogix.custom.so.createchange;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifTerpSoItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifTerpSoItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItmNumber" type="{urn:sap-com:document:sap:rfc:functions}numeric6"/>
 *         &lt;element name="Material" type="{urn:sap-com:document:sap:rfc:functions}char18"/>
 *         &lt;element name="Quantity" type="{urn:sap-com:document:sap:rfc:functions}quantum13.3"/>
 *         &lt;element name="Adult" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/>
 *         &lt;element name="Child" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/>
 *         &lt;element name="Infant" type="{urn:sap-com:document:sap:rfc:functions}numeric4"/>
 *         &lt;element name="RejectionReason" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="ProfitCenter" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="MatGrp1" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="MatGrp2" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="MatGrp3" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="MatGrp4" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="MatGrp5" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Category" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="CrmtMode" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifTerpSoItem", propOrder = {
    "itmNumber",
    "material",
    "quantity",
    "adult",
    "child",
    "infant",
    "rejectionReason",
    "profitCenter",
    "matGrp1",
    "matGrp2",
    "matGrp3",
    "matGrp4",
    "matGrp5",
    "category",
    "crmtMode"
})
public class ZifTerpSoItem {

    @XmlElement(name = "ItmNumber", required = true)
    protected String itmNumber;
    @XmlElement(name = "Material", required = true)
    protected String material;
    @XmlElement(name = "Quantity", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "Adult", required = true)
    protected String adult;
    @XmlElement(name = "Child", required = true)
    protected String child;
    @XmlElement(name = "Infant", required = true)
    protected String infant;
    @XmlElement(name = "RejectionReason", required = true)
    protected String rejectionReason;
    @XmlElement(name = "ProfitCenter", required = true)
    protected String profitCenter;
    @XmlElement(name = "MatGrp1", required = true)
    protected String matGrp1;
    @XmlElement(name = "MatGrp2", required = true)
    protected String matGrp2;
    @XmlElement(name = "MatGrp3", required = true)
    protected String matGrp3;
    @XmlElement(name = "MatGrp4", required = true)
    protected String matGrp4;
    @XmlElement(name = "MatGrp5", required = true)
    protected String matGrp5;
    @XmlElement(name = "Category", required = true)
    protected String category;
    @XmlElement(name = "CrmtMode", required = true)
    protected String crmtMode;

    /**
     * Gets the value of the itmNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmNumber() {
        return itmNumber;
    }

    /**
     * Sets the value of the itmNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmNumber(String value) {
        this.itmNumber = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the adult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdult() {
        return adult;
    }

    /**
     * Sets the value of the adult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdult(String value) {
        this.adult = value;
    }

    /**
     * Gets the value of the child property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChild() {
        return child;
    }

    /**
     * Sets the value of the child property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChild(String value) {
        this.child = value;
    }

    /**
     * Gets the value of the infant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfant() {
        return infant;
    }

    /**
     * Sets the value of the infant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfant(String value) {
        this.infant = value;
    }

    /**
     * Gets the value of the rejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Sets the value of the rejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionReason(String value) {
        this.rejectionReason = value;
    }

    /**
     * Gets the value of the profitCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitCenter() {
        return profitCenter;
    }

    /**
     * Sets the value of the profitCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitCenter(String value) {
        this.profitCenter = value;
    }

    /**
     * Gets the value of the matGrp1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatGrp1() {
        return matGrp1;
    }

    /**
     * Sets the value of the matGrp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatGrp1(String value) {
        this.matGrp1 = value;
    }

    /**
     * Gets the value of the matGrp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatGrp2() {
        return matGrp2;
    }

    /**
     * Sets the value of the matGrp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatGrp2(String value) {
        this.matGrp2 = value;
    }

    /**
     * Gets the value of the matGrp3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatGrp3() {
        return matGrp3;
    }

    /**
     * Sets the value of the matGrp3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatGrp3(String value) {
        this.matGrp3 = value;
    }

    /**
     * Gets the value of the matGrp4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatGrp4() {
        return matGrp4;
    }

    /**
     * Sets the value of the matGrp4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatGrp4(String value) {
        this.matGrp4 = value;
    }

    /**
     * Gets the value of the matGrp5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatGrp5() {
        return matGrp5;
    }

    /**
     * Sets the value of the matGrp5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatGrp5(String value) {
        this.matGrp5 = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the crmtMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmtMode() {
        return crmtMode;
    }

    /**
     * Sets the value of the crmtMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmtMode(String value) {
        this.crmtMode = value;
    }

}
