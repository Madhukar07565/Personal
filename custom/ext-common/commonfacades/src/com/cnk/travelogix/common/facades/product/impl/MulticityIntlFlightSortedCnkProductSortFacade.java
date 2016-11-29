/**
 *
 */
package com.cnk.travelogix.common.facades.product.impl;

import java.util.List;

import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.CnkSortedDataList;
import com.cnk.travelogix.common.facades.product.data.flight.FlightData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightResultData;
import com.cnk.travelogix.common.facades.product.sort.CnkProductSortHandler;


/**
 * @author i323616
 *
 */
public class MulticityIntlFlightSortedCnkProductSortFacade extends SortedCnkProductSearchFacade<FlightData>
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
		if (sortedList.isEmpty())
		{
			return;
		}
		final CnkSortedDataList sortedDataList = sortedList.get(0);
		cnkProductSortHandler.handleSort(resultList, sortedDataList, getSortedToModelMapper());
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
