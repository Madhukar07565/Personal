
package com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZifTerpComplaintsStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZifTerpComplaintsStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uniqid" type="{urn:sap-com:document:sap:rfc:functions}char20"/>
 *         &lt;element name="FeedbackNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="ComplaintNo" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Status" type="{urn:sap-com:document:sap:rfc:functions}char10"/>
 *         &lt;element name="Messagetype" type="{urn:sap-com:document:sap:rfc:functions}char1"/>
 *         &lt;element name="Message" type="{urn:sap-com:document:sap:rfc:functions}char255"/>
 *         &lt;element name="Sysubrc" type="{urn:sap-com:document:sap:rfc:functions}char4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZifTerpComplaintsStatus", propOrder = {
    "uniqid",
    "feedbackNo",
    "complaintNo",
    "status",
    "messagetype",
    "message",
    "sysubrc"
})
public class ZifTerpComplaintsStatus {

    @XmlElement(name = "Uniqid", required = true)
    protected String uniqid;
    @XmlElement(name = "FeedbackNo", required = true)
    protected String feedbackNo;
    @XmlElement(name = "ComplaintNo", required = true)
    protected String complaintNo;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Messagetype", required = true)
    protected String messagetype;
    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "Sysubrc", required = true)
    protected String sysubrc;

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
     * Gets the value of the feedbackNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackNo() {
        return feedbackNo;
    }

    /**
     * Sets the value of the feedbackNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackNo(String value) {
        this.feedbackNo = value;
    }

    /**
     * Gets the value of the complaintNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplaintNo() {
        return complaintNo;
    }

    /**
     * Sets the value of the complaintNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplaintNo(String value) {
        this.complaintNo = value;
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
     * Gets the value of the messagetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagetype() {
        return messagetype;
    }

    /**
     * Sets the value of the messagetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagetype(String value) {
        this.messagetype = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the sysubrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysubrc() {
        return sysubrc;
    }

    /**
     * Sets the value of the sysubrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysubrc(String value) {
        this.sysubrc = value;
    }

}
