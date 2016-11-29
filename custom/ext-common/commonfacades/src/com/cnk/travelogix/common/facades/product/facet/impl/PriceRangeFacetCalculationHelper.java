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
 * @author i313879
 *
 */
public class PriceRangeFacetCalculationHelper extends DefaultFacetCalculationHelper
{
	//the price Range facet for CNK

	@Override
	public boolean process(final BaseProductData singleData, final CnkFacetData facet, final FacetToModelEntry facetEntry)
	{
		final Map<Object, CnkFacetValueData> facetMap = getFacetMap(facet);
		final double price = facetEntry.getCaculatedPrice(singleData);
		return this.handlePriceRange(facetMap, price, facet);
	}

	private boolean handlePriceRange(final Map<Object, CnkFacetValueData> facetMap, final double price, final CnkFacetData facet)
	{
		final CnkFacetValueData minFacetValue = getOrCreateMinPrice(facetMap);
		final CnkFacetValueData maxFacetValue = getOrCreateMaxPrice(facetMap);
		List<CnkFacetValueData> facetValueList = facet.getValues();
		if (facetValueList == null)
		{
			facetValueList = new ArrayList();
			facetValueList.add(minFacetValue);
			facetValueList.add(maxFacetValue);
	
			facet.setValues(facetValueList);
		}
		if (price > maxFacetValue.getDoubleValue())
		{
			if (maxFacetValue.isSelected())
			{
				return false;
			}
			maxFacetValue.setDoubleValue(price);
		}
		if (price < minFacetValue.getDoubleValue())
		{
			if (minFacetValue.isSelected())
			{
				return false;
			}
			minFacetValue.setDoubleValue(price);
		}
		return true;
	}

	protected CnkFacetValueData getOrCreateMinPrice(final Map<Object, CnkFacetValueData> facetMap)
	{
		CnkFacetValueData facetValue = facetMap.get(FacetToModelEntry.MIN);
		if (facetValue == null)
		{
			facetValue = new CnkFacetValueData();
			facetValue.setCode(FacetToModelEntry.MIN);
			facetValue.setSelected(false);
			facetValue.setDoubleValue(0); //TODO: use double value
		}
//		else
//		{
//			facetValue.setSelected(true);
//			setFacetValueForDouble(facetValue);
//		}
		facetValue.setCount(facetValue.getCount() + 1);
		return facetValue;
	}

	protected CnkFacetValueData getOrCreateMaxPrice(final Map<Object, CnkFacetValueData> facetMap)
	{
		CnkFacetValueData facetValue = facetMap.get(FacetToModelEntry.MAX);
		if (facetValue == null)
		{
			facetValue = new CnkFacetValueData();
			facetValue.setCode(FacetToModelEntry.MAX);
			facetValue.setSelected(false);
			facetValue.setDoubleValue(10000); //TODO: use double value
		}
//		else
//		{
//			facetValue.setSelected(true);
//			setFacetValueForDouble(facetValue);
//		}
		facetValue.setCount(facetValue.getCount() + 1);
		return facetValue;
	}

	private void setFacetValueForDouble(final CnkFacetValueData facetValue)
	{
		if (!StringUtils.isEmpty(facetValue.getValue()))
		{
			facetValue.setDoubleValue(Double.parseDouble(facetValue.getValue()));
		}
		else
		{
			facetValue.setValue(Double.toString(facetValue.getDoubleValue()));
		}
	}
}
