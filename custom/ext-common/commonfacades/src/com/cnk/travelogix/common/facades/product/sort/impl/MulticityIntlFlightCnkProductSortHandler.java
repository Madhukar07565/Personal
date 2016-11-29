/**
 *
 */
package com.cnk.travelogix.common.facades.product.sort.impl;

import java.util.List;

import com.cnk.travelogix.common.facades.product.data.CnkProductSortConditionData;
import com.cnk.travelogix.common.facades.product.data.CnkSortedDataList;
import com.cnk.travelogix.common.facades.product.data.flight.FlightResultData;
import com.cnk.travelogix.common.facades.product.sort.CnkProductSortHandler;
import com.cnk.travelogix.common.facades.product.sort.CnkProductSortHelper;


/**
 * @author i323616
 *
 */
public class MulticityIntlFlightCnkProductSortHandler implements CnkProductSortHandler<FlightResultData>
{

	private CnkProductSortHelper cnkProductSortHelper;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.facades.product.sort.CnkProductSortHandler#handleSort(java.util.List,
	 * com.cnk.travelogix.common.facades.product.data.CnkSortedDataList,
	 * com.cnk.travelogix.common.facades.product.sort.impl.SortedToModelMapper)
	 */
	@Override
	public void handleSort(final List<FlightResultData> listOfTrips, final CnkSortedDataList sortedDataList,
			final SortedToModelMapper sortedToModelMapper)
	{
		for (final CnkProductSortConditionData condition : sortedDataList.getConditions())
		{
			if (condition.isSelected())
			{
				final SortedToModelEntry entry = sortedToModelMapper.getMapperEntryByCode(condition.getCode());
				if (entry == null)
				{
					return;
				}
				cnkProductSortHelper.sortResult(listOfTrips, entry.getSortedValueProvider(), condition.isDesc());
				return;
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
