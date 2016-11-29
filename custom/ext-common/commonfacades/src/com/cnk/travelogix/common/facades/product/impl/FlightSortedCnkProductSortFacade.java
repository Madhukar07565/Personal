/**
 *
 */
package com.cnk.travelogix.common.facades.product.impl;

import java.util.ArrayList;
import java.util.List;

import org.fest.util.Collections;

import com.cnk.travelogix.common.facades.product.data.BasePageableSearchData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSortConditionData;
import com.cnk.travelogix.common.facades.product.data.CnkSortedDataList;
import com.cnk.travelogix.common.facades.product.data.FlightHotelSearchData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightResultData;
import com.cnk.travelogix.common.facades.product.sort.CnkProductSortHandler;


/**
 * @author i323616
 *
 */
public class FlightSortedCnkProductSortFacade extends SortedCnkProductSearchFacade<FlightData>
{

	private CnkProductSortHandler cnkProductSortHandler;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.facades.product.impl.SortedCnkProductSearchFacade#sort(com.cnk.travelogix.common.facades
	 * .product.data.CnkProductSearchPageData, java.util.List)
	 */
	@Override
	protected void sort(final CnkProductSearchPageData result, final List<CnkSortedDataList> sortedList)
	{
		final List<FlightResultData> resultList = result.getResult();
		for (int i = 0; i < resultList.size(); i++)
		{
			final FlightResultData flightResult = resultList.get(i);
			final CnkSortedDataList sortedDataList = sortedList.get(i);
			cnkProductSortHandler.handleSort(flightResult.getListOfFlights(), sortedDataList, getSortedToModelMapper());
		}

	}

	@Override
	protected List<CnkSortedDataList> getSortedDataList(final BasePageableSearchData searchParameters)
	{
		int ways = ((FlightHotelSearchData) searchParameters).getEntrys().size();
		ways = ((FlightHotelSearchData) searchParameters).getFlightType().equalsIgnoreCase("twoway") ? 2 : ways;

		List<CnkSortedDataList> sortedList = searchParameters.getSortConditionList();

		if (Collections.isEmpty(sortedList))
		{
			sortedList = new ArrayList();
			for (int i = 0; i < ways; i++)
			{
				final CnkSortedDataList theSortedConditions = new CnkSortedDataList();
				final List<CnkProductSortConditionData> conditions = buildSortedSkeleton();
				theSortedConditions.setConditions(conditions);
				sortedList.add(theSortedConditions);
			}
		}
		return sortedList;
	}

	/**
	 * @return the cnkProductSortHandler
	 */
	public CnkProductSortHandler getCnkProductSortHandler()
	{
		return cnkProductSortHandler;
	}

	/**
	 * @param cnkProductSortHandler
	 *           the cnkProductSortHandler to set
	 */
	public void setCnkProductSortHandler(final CnkProductSortHandler cnkProductSortHandler)
	{
		this.cnkProductSortHandler = cnkProductSortHandler;
	}


}
