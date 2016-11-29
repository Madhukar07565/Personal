
package com.cnk.travelogix.custom.so.createchange;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifTerpSoHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifTerpSoHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uniqid" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="Trntyp" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="SalesOrg" type="{urn:sap-com:document:sap:rfc:functions}char14"/>
 *         &lt;element name="DistChannel" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Division" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="SalesOff" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="SalesGrp" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="DocCurr" type="{urn:sap-com:document:sap:rfc:functions}cuky5"/>
 *         &lt;element name="ExgRate" type="{urn:sap-com:document:sap:rfc:functions}decimal9.5"/>
 *         &lt;element name="ReqDeliDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="Pmnttrms" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="PoNumberSold" type="{urn:sap-com:document:sap:rfc:functions}char35"/>
 *         &lt;element name="SoDocNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="YourRefSold" type="{urn:sap-com:document:sap:rfc:functions}char12"/>
 *         &lt;element name="OrdReason" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Submission" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="PoDateSold" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="NetValue" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/>
 *         &lt;element name="TaxAmount" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/>
 *         &lt;element name="Status1" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="SoNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="CrmtMode" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="CampaignCode" type="{urn:sap-com:document:sap:rfc:functions}char24"/>
 *         &lt;element name="OpportunityId" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifTerpSoHeader", propOrder = {
    "uniqid",
    "trntyp",
    "salesOrg",
    "distChannel",
    "division",
    "salesOff",
    "salesGrp",
    "docCurr",
    "exgRate",
    "reqDeliDate",
    "pmnttrms",
    "poNumberSold",
    "soDocNo",
    "yourRefSold",
    "ordReason",
    "submission",
    "poDateSold",
    "netValue",
    "taxAmount",
    "status1",
    "soNo",
    "crmtMode",
    "campaignCode",
    "opportunityId"
})
public class ZifTerpSoHeader {

    @XmlElement(name = "Uniqid", required = true)
    protected String uniqid;
    @XmlElement(name = "Trntyp", required = true)
    protected String trntyp;
    @XmlElement(name = "SalesOrg", required = true)
    protected String salesOrg;
    @XmlElement(name = "DistChannel", required = true)
    protected String distChannel;
    @XmlElement(name = "Division", required = true)
    protected String division;
    @XmlElement(name = "SalesOff", required = true)
    protected String salesOff;
    @XmlElement(name = "SalesGrp", required = true)
    protected String salesGrp;
    @XmlElement(name = "DocCurr", required = true)
    protected String docCurr;
    @XmlElement(name = "ExgRate", required = true)
    protected BigDecimal exgRate;
    @XmlElement(name = "ReqDeliDate", required = true)
    protected String reqDeliDate;
    @XmlElement(name = "Pmnttrms", required = true)
    protected String pmnttrms;
    @XmlElement(name = "PoNumberSold", required = true)
    protected String poNumberSold;
    @XmlElement(name = "SoDocNo", required = true)
    protected String soDocNo;
    @XmlElement(name = "YourRefSold", required = true)
    protected String yourRefSold;
    @XmlElement(name = "OrdReason", required = true)
    protected String ordReason;
    @XmlElement(name = "Submission", required = true)
    protected String submission;
    @XmlElement(name = "PoDateSold", required = true)
    protected String poDateSold;
    @XmlElement(name = "NetValue", required = true)
    protected BigDecimal netValue;
    @XmlElement(name = "TaxAmount", required = true)
    protected BigDecimal taxAmount;
    @XmlElement(name = "Status1", required = true)
    protected String status1;
    @XmlElement(name = "SoNo", required = true)
    protected String soNo;
    @XmlElement(name = "CrmtMode", required = true)
    protected String crmtMode;
    @XmlElement(name = "CampaignCode", required = true)
    protected String campaignCode;
    @XmlElement(name = "OpportunityId", required = true)
    protected String opportunityId;

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
     * Gets the value of the trntyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrntyp() {
        return trntyp;
    }

    /**
     * Sets the value of the trntyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrntyp(String value) {
        this.trntyp = value;
    }

    /**
     * Gets the value of the salesOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrg() {
        return salesOrg;
    }

    /**
     * Sets the value of the salesOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrg(String value) {
        this.salesOrg = value;
    }

    /**
     * Gets the value of the distChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistChannel() {
        return distChannel;
    }

    /**
     * Sets the value of the distChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistChannel(String value) {
        this.distChannel = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the salesOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOff() {
        return salesOff;
    }

    /**
     * Sets the value of the salesOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOff(String value) {
        this.salesOff = value;
    }

    /**
     * Gets the value of the salesGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesGrp() {
        return salesGrp;
    }

    /**
     * Sets the value of the salesGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesGrp(String value) {
        this.salesGrp = value;
    }

    /**
     * Gets the value of the docCurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocCurr() {
        return docCurr;
    }

    /**
     * Sets the value of the docCurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocCurr(String value) {
        this.docCurr = value;
    }

    /**
     * Gets the value of the exgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExgRate() {
        return exgRate;
    }

    /**
     * Sets the value of the exgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExgRate(BigDecimal value) {
        this.exgRate = value;
    }

    /**
     * Gets the value of the reqDeliDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqDeliDate() {
        return reqDeliDate;
    }

    /**
     * Sets the value of the reqDeliDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqDeliDate(String value) {
        this.reqDeliDate = value;
    }

    /**
     * Gets the value of the pmnttrms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmnttrms() {
        return pmnttrms;
    }

    /**
     * Sets the value of the pmnttrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmnttrms(String value) {
        this.pmnttrms = value;
    }

    /**
     * Gets the value of the poNumberSold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNumberSold() {
        return poNumberSold;
    }

    /**
     * Sets the value of the poNumberSold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNumberSold(String value) {
        this.poNumberSold = value;
    }

    /**
     * Gets the value of the soDocNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoDocNo() {
        return soDocNo;
    }

    /**
     * Sets the value of the soDocNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoDocNo(String value) {
        this.soDocNo = value;
    }

    /**
     * Gets the value of the yourRefSold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYourRefSold() {
        return yourRefSold;
    }

    /**
     * Sets the value of the yourRefSold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYourRefSold(String value) {
        this.yourRefSold = value;
    }

    /**
     * Gets the value of the ordReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdReason() {
        return ordReason;
    }

    /**
     * Sets the value of the ordReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdReason(String value) {
        this.ordReason = value;
    }

    /**
     * Gets the value of the submission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmission() {
        return submission;
    }

    /**
     * Sets the value of the submission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmission(String value) {
        this.submission = value;
    }

    /**
     * Gets the value of the poDateSold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoDateSold() {
        return poDateSold;
    }

    /**
     * Sets the value of the poDateSold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoDateSold(String value) {
        this.poDateSold = value;
    }

    /**
     * Gets the value of the netValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetValue() {
        return netValue;
    }

    /**
     * Sets the value of the netValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetValue(BigDecimal value) {
        this.netValue = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the status1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus1() {
        return status1;
    }

    /**
     * Sets the value of the status1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus1(String value) {
        this.status1 = value;
    }

    /**
     * Gets the value of the soNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoNo() {
        return soNo;
    }

    /**
     * Sets the value of the soNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoNo(String value) {
        this.soNo = value;
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

    /**
     * Gets the value of the campaignCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignCode() {
        return campaignCode;
    }

    /**
     * Sets the value of the campaignCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignCode(String value) {
        this.campaignCode = value;
    }

    /**
     * Gets the value of the opportunityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityId() {
        return opportunityId;
    }

    /**
     * Sets the value of the opportunityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityId(String value) {
        this.opportunityId = value;
    }

}
