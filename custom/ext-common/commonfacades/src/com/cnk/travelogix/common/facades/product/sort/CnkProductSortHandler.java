/**
 *
 */
package com.cnk.travelogix.common.facades.product.sort;

import java.util.List;

import com.cnk.travelogix.common.facades.product.data.CnkSortedDataList;
import com.cnk.travelogix.common.facades.product.sort.impl.SortedToModelMapper;


/**
 * @author i313879
 *
 */
public interface CnkProductSortHandler<T>
{

	/**
	 * @param listOfFlights
	 * @param sortedDataList
	 * @param sortedToModelMapper
	 */
	public void handleSort(List<T> listOfFlights, CnkSortedDataList sortedDataList, SortedToModelMapper sortedToModelMapper);


}
