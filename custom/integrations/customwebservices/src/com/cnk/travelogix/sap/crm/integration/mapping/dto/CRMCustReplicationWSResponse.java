
package com.cnk.travelogix.sap.crm.integration.mapping.dto;

import java.io.Serializable;


public class CRMCustReplicationWSResponse implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected StatusList status;

	public CRMCustReplicationWSResponse() {
		// TODO Auto-generated constructor stub
	}
    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusList }
     *     
     */
    public StatusList getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusList }
     *     
     */
    public void setStatus(StatusList value) {
        this.status = value;
    }

}
