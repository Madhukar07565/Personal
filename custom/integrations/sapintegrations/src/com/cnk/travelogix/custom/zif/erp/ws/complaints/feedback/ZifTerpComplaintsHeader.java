
package com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifTerpComplaintsHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifTerpComplaintsHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uniqid" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="Katalogart" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Codegruppe" type="{urn:sap-com:document:sap:rfc:functions}char8"/>
 *         &lt;element name="Code" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Category" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="ProcessType" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Description" type="{urn:sap-com:document:sap:rfc:functions}char40"/>
 *         &lt;element name="Notes" type="{urn:sap-com:document:sap:rfc:functions}char132"/>
 *         &lt;element name="ReferenceDocumentNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="ServiceOrg" type="{urn:sap-com:document:sap:rfc:functions}char14"/>
 *         &lt;element name="ServiceOrgResp" type="{urn:sap-com:document:sap:rfc:functions}char14"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifTerpComplaintsHeader", propOrder = {
    "uniqid",
    "katalogart",
    "codegruppe",
    "code",
    "category",
    "processType",
    "description",
    "notes",
    "referenceDocumentNo",
    "serviceOrg",
    "serviceOrgResp"
})
public class ZifTerpComplaintsHeader {

    @XmlElement(name = "Uniqid", required = true)
    protected String uniqid;
    @XmlElement(name = "Katalogart", required = true)
    protected String katalogart;
    @XmlElement(name = "Codegruppe", required = true)
    protected String codegruppe;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Category", required = true)
    protected String category;
    @XmlElement(name = "ProcessType", required = true)
    protected String processType;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Notes", required = true)
    protected String notes;
    @XmlElement(name = "ReferenceDocumentNo", required = true)
    protected String referenceDocumentNo;
    @XmlElement(name = "ServiceOrg", required = true)
    protected String serviceOrg;
    @XmlElement(name = "ServiceOrgResp", required = true)
    protected String serviceOrgResp;

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

    /**
     * Gets the value of the katalogart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatalogart() {
        return katalogart;
    }

    /**
     * Sets the value of the katalogart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatalogart(String value) {
        this.katalogart = value;
    }

    /**
     * Gets the value of the codegruppe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodegruppe() {
        return codegruppe;
    }

    /**
     * Sets the value of the codegruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodegruppe(String value) {
        this.codegruppe = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
     * Gets the value of the processType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * Sets the value of the processType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessType(String value) {
        this.processType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the referenceDocumentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDocumentNo() {
        return referenceDocumentNo;
    }

    /**
     * Sets the value of the referenceDocumentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDocumentNo(String value) {
        this.referenceDocumentNo = value;
    }

    /**
     * Gets the value of the serviceOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOrg() {
        return serviceOrg;
    }

    /**
     * Sets the value of the serviceOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOrg(String value) {
        this.serviceOrg = value;
    }

    /**
     * Gets the value of the serviceOrgResp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOrgResp() {
        return serviceOrgResp;
    }

    /**
     * Sets the value of the serviceOrgResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOrgResp(String value) {
        this.serviceOrgResp = value;
    }

}
