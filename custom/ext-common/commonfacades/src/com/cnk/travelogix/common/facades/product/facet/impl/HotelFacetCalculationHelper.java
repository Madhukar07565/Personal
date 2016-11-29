/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetValueData;


/**
 * @author i313890
 *
 */
public class HotelFacetCalculationHelper extends DefaultFacetCalculationHelper
{

	@Override
	public boolean process(final BaseProductData singleData, final CnkFacetData facet, final FacetToModelEntry facetEntry)
	{
		boolean result = true;
		final Map<Object, CnkFacetValueData> facetMap = getFacetMap(facet);
		final Object code = facetEntry.getFacetValueCode(singleData);
		final Object value = facetEntry.getFacetValue(singleData);
		boolean isInitPage = false;
		final List<String> codeList = new ArrayList<String>();
		final List<String> valueList = new ArrayList<String>();
		if (code != null && value != null)
		{
			if (code instanceof String)
			{
				codeList.add((String) code);
				valueList.add((String) value);
			}
			else if (code instanceof List)
			{
				codeList.addAll((List) code);
				valueList.addAll((List) value);
			}
			for (int i = 0; i < codeList.size(); i++)
			{
				final String c = codeList.get(i);
				final String v = valueList.get(i);
				CnkFacetValueData facetValue = facetMap.get(c);
				List<CnkFacetValueData> facetValueList = facet.getValues();
				if (facetValueList == null)
				{
					isInitPage = true;
					facetValueList = new ArrayList();
				}
				if (facetValue == null)
				{
					facetValue = new CnkFacetValueData();
					facetValue.setCode(c);
					facetValue.setName(c);
					facetValue.setValue(v);
					facetValue.setCount(facetValue.getCount() + 1);
					facetMap.put(c, facetValue);
					facetValueList.add(facetValue);
				}
				if (facetEntry.isNeedMinPrice())
				{
					//TODO.
				}
				facet.setValues(this.removeRepeatValue(facetValueList));
				result = isPassFilter(facetMap, c);
				if (!isInitPage && result)
				{
					return result;
				}
			}
		}
		return result;
	}

	protected List<CnkFacetValueData> removeRepeatValue(final List<CnkFacetValueData> facetValueList)
	{
		final Map<String, CnkFacetValueData> map = new HashMap<String, CnkFacetValueData>();
		for (final CnkFacetValueData data : facetValueList)
		{
			if (map.get(data.getCode()) == null)
			{
				map.put(data.getCode(), data);
			}
		}
		return new ArrayList(map.values());
	}
}
