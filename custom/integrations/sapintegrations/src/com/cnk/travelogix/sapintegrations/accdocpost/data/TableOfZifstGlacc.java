
package com.cnk.travelogix.sapintegrations.accdocpost.data;

import java.util.ArrayList;
import java.util.List;


public class TableOfZifstGlacc
{

	protected List<ZifstGlacc> item;

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
	 * Objects of the following type(s) are allowed in the list {@link ZifstGlacc }
	 *
	 *
	 */
	public List<ZifstGlacc> getItem()
	{
		if (item == null)
		{
			item = new ArrayList<ZifstGlacc>();
		}
		return this.item;
	}

}
