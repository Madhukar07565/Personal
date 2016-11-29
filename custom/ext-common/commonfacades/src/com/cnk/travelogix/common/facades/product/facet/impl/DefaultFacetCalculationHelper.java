/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fest.util.Collections;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetValueData;
import com.cnk.travelogix.common.facades.product.facet.CnkFacetCalculationHelper;


/**
 * @author i313879
 *
 */
public class DefaultFacetCalculationHelper implements CnkFacetCalculationHelper
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.facet.CnkFacetCalculationHelper#process(com.cnk.travelogix.common.facades
	 * .product.data.BaseProductData, com.cnk.travelogix.common.facades.product.data.CnkFacetData)
	 */
	@Override
	public boolean process(final BaseProductData singleData, final CnkFacetData facet, final FacetToModelEntry facetEntry)
	{
		boolean result = true;
		final Map<Object, CnkFacetValueData> facetMap = getFacetMap(facet);
		String code = (String) facetEntry.getFacetValueCode(singleData);
		final Object value = facetEntry.getFacetValue(singleData);
		code = code == null ? "Empty" : code;
		CnkFacetValueData facetValue = facetMap.get(code);
		List<CnkFacetValueData> facetValueList = facet.getValues();
		if (facetValueList == null)
		{
			facetValueList = new ArrayList();
		}
		if (facetValue == null)
		{
			facetValue = new CnkFacetValueData();
			facetValue.setCode(code);
			facetValue.setName(code);
			facetValue.setValue(value.toString());
			facetMap.put(code, facetValue);
			facetValueList.add(facetValue);
		}

		facetValue.setCount(facetValue.getCount() + 1);

		if (facetEntry.isNeedMinPrice())
		{
			final double price = facetEntry.getCaculatedPrice(singleData);
			final double existValue = Double.parseDouble(facetValue.getValue());
			if (price < existValue)
			{
				facetValue.setValue(Double.toString(price));
			}
		}
		facet.setValues(facetValueList);
		//TODO: need to consider multi select
		result = isPassFilter(facetMap, code);
		return result;
	}

	protected boolean isPassFilter(final Map<Object, CnkFacetValueData> facetMap, final String code)
	{
		boolean result = true;
		final List<String> selectedCodes = new ArrayList();
		for (final CnkFacetValueData facetValue : facetMap.values())
		{
			if (facetValue.isSelected())
			{
				selectedCodes.add(facetValue.getCode());
			}
		}
		if (!Collections.isEmpty(selectedCodes))
		{
			result = selectedCodes.contains(code);
		}
		return result;
	}

	protected Map<Object, CnkFacetValueData> getFacetMap(final CnkFacetData facet)
	{
		final Map result = new HashMap();
		if (facet.getValues() != null)
		{
			for (final CnkFacetValueData facetValue : facet.getValues())
			{
				result.put(facetValue.getCode(), facetValue);
			}
		}
		return result;
	}

}
