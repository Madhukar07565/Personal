package com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data;

import java.util.ArrayList;
import java.util.List;


public class ZttTerpComplaintsStatusData
{

	protected List<ZifTerpComplaintsStatusData> item;

	/**
	 * Gets the value of the item property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the item property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getItem().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ZifTerpComplaintsStatusData }
	 * 
	 * 
	 */
	public List<ZifTerpComplaintsStatusData> getItem()
	{
		if (item == null)
		{
			item = new ArrayList<ZifTerpComplaintsStatusData>();
		}
		return this.item;
	}

}
