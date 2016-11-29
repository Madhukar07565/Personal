
package com.cnk.travelogix.sap.crm.integration.mapping.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



public class CRMCustReplicationWSRequest implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected ContmastList contactData;
    protected Custmast customerData;

    public CRMCustReplicationWSRequest() {
		// TODO Auto-generated constructor stub
	}
    /**
     * Gets the value of the contactData property.
     * 
     * @return
     *     possible object is
     *     {@link ContmastList }
     *     
     */
    public ContmastList getContactData() {
        return contactData;
    }

    /**
     * Sets the value of the contactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContmastList }
     *     
     */
    public void setContactData(ContmastList value) {
        this.contactData = value;
    }

    /**
     * Gets the value of the customerData property.
     * 
     * @return
     *     possible object is
     *     {@link Custmast }
     *     
     */
    public Custmast getCustomerData() {
        return customerData;
    }

    /**
     * Sets the value of the customerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custmast }
     *     
     */
    public void setCustomerData(Custmast value) {
        this.customerData = value;
    }

}
