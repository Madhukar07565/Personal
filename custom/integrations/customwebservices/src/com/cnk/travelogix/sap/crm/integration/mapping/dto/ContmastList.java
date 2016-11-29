
package com.cnk.travelogix.sap.crm.integration.mapping.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

public class ContmastList implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElementWrapper 
	protected List<Contmast> item;
	
	public ContmastList() {
		// TODO Auto-generated constructor stub
	}

    public List<Contmast> getItem() {
        if (item == null) {
            item = new ArrayList<Contmast>();
        }
        return this.item;
    }

}
