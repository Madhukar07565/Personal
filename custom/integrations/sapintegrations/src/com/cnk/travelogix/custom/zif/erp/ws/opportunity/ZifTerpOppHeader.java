
package com.cnk.travelogix.custom.zif.erp.ws.opportunity;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ZifTerpOppHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifTerpOppHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uniqid" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="CrmtMode" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="CrmOppId" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="TerpOppId" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Trntyp" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="SalesOrg" type="{urn:sap-com:document:sap:rfc:functions}char14"/>
 *         &lt;element name="DistChannel" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="Division" type="{urn:sap-com:document:sap:rfc:functions}char2"/>
 *         &lt;element name="SalesOff" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="SalesGrp" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="CurrPhase" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Status" type="{urn:sap-com:document:sap:rfc:functions}char5"/>
 *         &lt;element name="Type" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *         &lt;element name="Source" type="{urn:sap-com:document:sap:rfc:functions}char3"/>
 *         &lt;element name="Importance" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="PhaseSince" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="StatusSince" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="ExpRevenue" type="{urn:sap-com:document:sap:rfc:functions}curr15.2"/>
 *         &lt;element name="ObjectId3" type="{urn:sap-com:document:sap:rfc:functions}char132"/>
 *         &lt;element name="Startdate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="ExpectEnd" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="QuoteUrl" type="{urn:sap-com:document:sap:rfc:functions}string"/>
 *         &lt;element name="PreferredModeCommunication" type="{urn:sap-com:document:sap:rfc:functions}char15"/>
 *         &lt;element name="PreferredTime" type="{urn:sap-com:document:sap:rfc:functions}char15"/>
 *         &lt;element name="ContactDate" type="{urn:sap-com:document:sap:rfc:functions}date10"/>
 *         &lt;element name="ContactTime" type="{urn:sap-com:document:sap:rfc:functions}time"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifTerpOppHeader", propOrder = {
    "uniqid",
    "crmtMode",
    "crmOppId",
    "terpOppId",
    "trntyp",
    "salesOrg",
    "distChannel",
    "division",
    "salesOff",
    "salesGrp",
    "currPhase",
    "status",
    "type",
    "source",
    "importance",
    "phaseSince",
    "statusSince",
    "expRevenue",
    "objectId3",
    "startdate",
    "expectEnd",
    "quoteUrl",
    "preferredModeCommunication",
    "preferredTime",
    "contactDate",
    "contactTime"
})
public class ZifTerpOppHeader {

    @XmlElement(name = "Uniqid", required = true)
    protected String uniqid;
    @XmlElement(name = "CrmtMode", required = true)
    protected String crmtMode;
    @XmlElement(name = "CrmOppId", required = true)
    protected String crmOppId;
    @XmlElement(name = "TerpOppId", required = true)
    protected String terpOppId;
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
    @XmlElement(name = "CurrPhase", required = true)
    protected String currPhase;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Source", required = true)
    protected String source;
    @XmlElement(name = "Importance", required = true)
    protected String importance;
    @XmlElement(name = "PhaseSince", required = true)
    protected String phaseSince;
    @XmlElement(name = "StatusSince", required = true)
    protected String statusSince;
    @XmlElement(name = "ExpRevenue", required = true)
    protected BigDecimal expRevenue;
    @XmlElement(name = "ObjectId3", required = true)
    protected String objectId3;
    @XmlElement(name = "Startdate", required = true)
    protected String startdate;
    @XmlElement(name = "ExpectEnd", required = true)
    protected String expectEnd;
    @XmlElement(name = "QuoteUrl", required = true)
    protected String quoteUrl;
    @XmlElement(name = "PreferredModeCommunication", required = true)
    protected String preferredModeCommunication;
    @XmlElement(name = "PreferredTime", required = true)
    protected String preferredTime;
    @XmlElement(name = "ContactDate", required = true)
    protected String contactDate;
    @XmlElement(name = "ContactTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar contactTime;

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
     * Gets the value of the crmOppId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmOppId() {
        return crmOppId;
    }

    /**
     * Sets the value of the crmOppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmOppId(String value) {
        this.crmOppId = value;
    }

    /**
     * Gets the value of the terpOppId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerpOppId() {
        return terpOppId;
    }

    /**
     * Sets the value of the terpOppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerpOppId(String value) {
        this.terpOppId = value;
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
     * Gets the value of the currPhase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrPhase() {
        return currPhase;
    }

    /**
     * Sets the value of the currPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrPhase(String value) {
        this.currPhase = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the importance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportance() {
        return importance;
    }

    /**
     * Sets the value of the importance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportance(String value) {
        this.importance = value;
    }

    /**
     * Gets the value of the phaseSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhaseSince() {
        return phaseSince;
    }

    /**
     * Sets the value of the phaseSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhaseSince(String value) {
        this.phaseSince = value;
    }

    /**
     * Gets the value of the statusSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSince() {
        return statusSince;
    }

    /**
     * Sets the value of the statusSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSince(String value) {
        this.statusSince = value;
    }

    /**
     * Gets the value of the expRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpRevenue() {
        return expRevenue;
    }

    /**
     * Sets the value of the expRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpRevenue(BigDecimal value) {
        this.expRevenue = value;
    }

    /**
     * Gets the value of the objectId3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId3() {
        return objectId3;
    }

    /**
     * Sets the value of the objectId3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId3(String value) {
        this.objectId3 = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartdate() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartdate(String value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the expectEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectEnd() {
        return expectEnd;
    }

    /**
     * Sets the value of the expectEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectEnd(String value) {
        this.expectEnd = value;
    }

    /**
     * Gets the value of the quoteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteUrl() {
        return quoteUrl;
    }

    /**
     * Sets the value of the quoteUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteUrl(String value) {
        this.quoteUrl = value;
    }

    /**
     * Gets the value of the preferredModeCommunication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredModeCommunication() {
        return preferredModeCommunication;
    }

    /**
     * Sets the value of the preferredModeCommunication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredModeCommunication(String value) {
        this.preferredModeCommunication = value;
    }

    /**
     * Gets the value of the preferredTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredTime() {
        return preferredTime;
    }

    /**
     * Sets the value of the preferredTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredTime(String value) {
        this.preferredTime = value;
    }

    /**
     * Gets the value of the contactDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDate() {
        return contactDate;
    }

    /**
     * Sets the value of the contactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDate(String value) {
        this.contactDate = value;
    }

    /**
     * Gets the value of the contactTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContactTime() {
        return contactTime;
    }

    /**
     * Sets the value of the contactTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContactTime(XMLGregorianCalendar value) {
        this.contactTime = value;
    }

}
