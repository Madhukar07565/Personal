/**
 *
 */
package com.cnk.travelogix.common.facades.product.impl;

import java.util.List;

import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.CnkSortedDataList;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.sort.CnkProductSortHandler;


/**
 * @author i313890
 *
 */
public class HotelSortedCnkProductSortFacade extends SortedCnkProductSearchFacade<HotelData>
{
	private CnkProductSortHandler cnkProductSortHandler;

	@Override
	protected void sort(final CnkProductSearchPageData result, final List<CnkSortedDataList> sortedList)
	{
		final List<HotelData> hotelDataList = result.getResult();
		for (final CnkSortedDataList sorted : sortedList)
		{
			cnkProductSortHandler.handleSort(hotelDataList, sorted, getSortedToModelMapper());
		}
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
