/**
 *
 */
package com.cnk.travelogix.common.facades.product;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSortConditionData;


/**
 * @author i323616
 *
 */
public interface CnkProductSortFacade<RESULT extends BaseProductData>
{
	public CnkProductSearchPageData sortSearchData(CnkProductSearchPageData searchResult, CnkProductSortConditionData condition);
}
