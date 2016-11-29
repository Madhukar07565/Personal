
package com.cnk.travelogix.sap.crm.integration.mapping.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StatusList implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected List<Status> item;
    
	public StatusList() {
		// TODO Auto-generated constructor stub
	}
	
    public List<Status> getItem() {
        if (item == null) {
            item = new ArrayList<Status>();
        }
        return this.item;
    }

	public void setItem(List<Status> item) {
		this.item = item;
	}
    
    
}
