/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetValueData;


/**
 * @author i313890
 *
 */
public class HotelLocationCalculationHelper extends HotelFacetCalculationHelper
{

	@Override
	public boolean process(final BaseProductData singleData, final CnkFacetData facet, final FacetToModelEntry facetEntry)
	{
		final String inputValue = facet.getValue();
		if (StringUtils.isNoneEmpty(inputValue))
		{
			this.updateFacteVlaues(facet, inputValue);
		}
		boolean result = true;
		final Map<Object, CnkFacetValueData> facetMap = getFacetMap(facet);
		final Object code = facetEntry.getFacetValueCode(singleData);
		final Object value = facetEntry.getFacetValue(singleData);
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
				if (result)
				{
					return result;
				}
			}
		}
		return result;
	}


	private void updateFacteVlaues(final CnkFacetData facetData, final String facetvalue)
	{
		for (final CnkFacetValueData facet : facetData.getValues())
		{
			if (StringUtils.containsIgnoreCase(facet.getCode(), facetvalue))
			{
				facet.setSelected(true);
			}
		}
	}
}
