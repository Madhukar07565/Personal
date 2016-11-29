
package com.cnk.travelogix.sap.crm.integration.mapping.dto;

import java.io.Serializable;

public class Status implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String legacyId;
    protected String customer;
    protected String status;
    protected String messagetype;
    protected String message;
    protected String sysubrc;
    
    public Status() {
		// TODO Auto-generated constructor stub
	}

    /**
     * Gets the value of the legacyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyId() {
        return legacyId;
    }

    /**
     * Sets the value of the legacyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyId(String value) {
        this.legacyId = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
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
