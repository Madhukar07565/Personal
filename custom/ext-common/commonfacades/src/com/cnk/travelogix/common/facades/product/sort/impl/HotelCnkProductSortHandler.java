/**
 *
 */
package com.cnk.travelogix.common.facades.product.sort.impl;

import java.util.List;

import com.cnk.travelogix.common.facades.product.data.CnkProductSortConditionData;
import com.cnk.travelogix.common.facades.product.data.CnkSortedDataList;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.sort.CnkProductSortHandler;
import com.cnk.travelogix.common.facades.product.sort.CnkProductSortHelper;


/**
 * @author i313890
 *
 */
public class HotelCnkProductSortHandler implements CnkProductSortHandler<HotelData>
{
	private CnkProductSortHelper cnkProductSortHelper;

	@Override
	public void handleSort(final List<HotelData> listOfHotels, final CnkSortedDataList sortedDataList,
			final SortedToModelMapper sortedToModelMapper)
	{
		final List<CnkProductSortConditionData> conditions = sortedDataList.getConditions();
		for (final CnkProductSortConditionData condition : conditions)
		{
			final SortedToModelEntry entry = sortedToModelMapper.getMapperEntryByCode(condition.getCode());
			if (entry == null)
			{
				return;
			}
			if (condition.isSelected())
			{
				cnkProductSortHelper.sortResult(listOfHotels, entry.getSortedValueProvider(), condition.isDesc());
			}
		}
	}

	/**
	 * @return the cnkProductSortHelper
	 */
	public CnkProductSortHelper getCnkProductSortHelper()
	{
		return cnkProductSortHelper;
	}

	/**
	 * @param cnkProductSortHelper
	 *           the cnkProductSortHelper to set
	 */
	public void setCnkProductSortHelper(final CnkProductSortHelper cnkProductSortHelper)
	{
		this.cnkProductSortHelper = cnkProductSortHelper;
	}

}
