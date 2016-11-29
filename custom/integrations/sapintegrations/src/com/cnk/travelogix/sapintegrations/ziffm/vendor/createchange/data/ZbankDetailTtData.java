
package com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data;

import java.util.ArrayList;
import java.util.List;


public class ZbankDetailTtData
{

	protected List<ZbankDetailData> item;

	public List<ZbankDetailData> getItem()
	{
		if (item == null)
		{
			item = new ArrayList<ZbankDetailData>();
		}
		return this.item;
	}

}
