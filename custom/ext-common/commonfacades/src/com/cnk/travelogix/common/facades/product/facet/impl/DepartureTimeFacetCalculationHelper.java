/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetValueData;


/**
 * @author i313879
 *
 */
public class DepartureTimeFacetCalculationHelper extends DefaultFacetCalculationHelper
{
	@Override
	public boolean process(final BaseProductData singleData, final CnkFacetData facet, final FacetToModelEntry facetEntry)
	{
		final Map<Object, CnkFacetValueData> facetMap = getFacetMap(facet);
		final Date startTime = (Date) facetEntry.getFacetValueCode(singleData);
		final int maxHour = startTime.getMinutes() > 0 ? startTime.getHours() + 1 : startTime.getHours();
		final int minHour = startTime.getHours();
		return this.handleDateRange(facetMap, maxHour, minHour, facet);

	}

	private boolean handleDateRange(final Map<Object, CnkFacetValueData> facetMap, final int maxHour, final int minHour,
			final CnkFacetData facet)
	{
		final CnkFacetValueData minFacetValue = getOrCreateMinTime(facetMap);
		final CnkFacetValueData maxFacetValue = getOrCreateMaxTime(facetMap);

		List<CnkFacetValueData> facetValueList = facet.getValues();
		if (facetValueList == null)
		{
			facetValueList = new ArrayList();
			facetValueList.add(minFacetValue);
			facetValueList.add(maxFacetValue);
			facet.setValues(facetValueList);
		}

		if (maxHour > (Integer.parseInt(maxFacetValue.getValue().split(":")[0])))
		{
			if (maxFacetValue.isSelected())
			{
				return false;
			}
			maxFacetValue.setValue(Integer.toString(maxHour));
		}

		if (minHour < (Integer.parseInt(minFacetValue.getValue().split(":")[0])))
		{
			if (minFacetValue.isSelected())
			{
				return false;
			}
			minFacetValue.setValue(Integer.toString(minHour));
		}
		return true;
	}

	private CnkFacetValueData getOrCreateMinTime(final Map<Object, CnkFacetValueData> facetMap)
	{
		CnkFacetValueData facetValue = facetMap.get(FacetToModelEntry.MIN);
		if (facetValue == null)
		{
			facetValue = new CnkFacetValueData();
			facetValue.setCode(FacetToModelEntry.MIN);
			facetValue.setSelected(false);
			facetValue.setValue("24:00");
			//facetValue.setDateValue(max.getTime()); //TODO: use double value
		}
		else
		{
			//facetValue.setSelected(true);
			//facetValue.setValue(new Date()); //TODO: use the facet string value
		}
		facetValue.setCount(facetValue.getCount() + 1);
		return facetValue;
	}

	private CnkFacetValueData getOrCreateMaxTime(final Map<Object, CnkFacetValueData> facetMap)
	{
		CnkFacetValueData facetValue = facetMap.get(FacetToModelEntry.MAX);
		if (facetValue == null)
		{
			facetValue = new CnkFacetValueData();
			facetValue.setCode(FacetToModelEntry.MAX);
			facetValue.setSelected(false);
			facetValue.setValue("0:00");
			//			final Calendar max = Calendar.getInstance();
			//			max.set(0001, 01, 01);
			//			facetValue.setDateValue(max.getTime()); //TODO: use double value
		}
		else
		{
			//facetValue.setSelected(true);
			//facetValue.setDateValue(new Date()); //TODO: use the facet string value
		}
		facetValue.setCount(facetValue.getCount() + 1);
		return facetValue;
	}
}
