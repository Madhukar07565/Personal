
package com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data;

import java.util.ArrayList;
import java.util.List;


public class ZifttStatusDocData
{

	protected List<ZifstStatusDocData> item;

	public List<ZifstStatusDocData> getItem()
	{
		if (item == null)
		{
			item = new ArrayList<ZifstStatusDocData>();
		}
		return this.item;
	}

}
