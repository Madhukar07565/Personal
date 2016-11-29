/**
 *
 */
package com.cnk.travelogix.common.facades.product.sort.impl;

import java.util.List;

import com.cnk.travelogix.common.facades.product.data.CnkProductSortConditionData;
import com.cnk.travelogix.common.facades.product.data.CnkSortedDataList;
import com.cnk.travelogix.common.facades.product.data.flight.FlightData;
import com.cnk.travelogix.common.facades.product.sort.CnkProductSortHandler;
import com.cnk.travelogix.common.facades.product.sort.CnkProductSortHelper;


/**
 * @author i313879
 *
 */
public class FlightCnkProductSortHandler implements CnkProductSortHandler<FlightData>
{

	private CnkProductSortHelper cnkProductSortHelper;

	@Override
	public void handleSort(final List<FlightData> listOfFlights, final CnkSortedDataList sortedDataList,
			final SortedToModelMapper sortedToModelMapper)
	{
		// YTODO Auto-generated method stub
		for (final CnkProductSortConditionData condition : sortedDataList.getConditions())
		{
			if (condition.isSelected())
			{
				final SortedToModelEntry entry = sortedToModelMapper.getMapperEntryByCode(condition.getCode());
				if (entry == null)
				{
					return;
				}
				cnkProductSortHelper.sortResult(listOfFlights, entry.getSortedValueProvider(), condition.isDesc());
				//				final List<FlightData> result = cnkProductSortHelper.sortResult(listOfFlights, entry.getSortedValueProvider(),
				//						condition.isDesc());
				//				listOfFlights.clear();
				//				listOfFlights.addAll(result);
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
