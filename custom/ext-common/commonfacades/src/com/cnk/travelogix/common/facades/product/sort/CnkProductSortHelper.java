/**
 *
 */
package com.cnk.travelogix.common.facades.product.sort;

import java.util.List;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i323616
 *
 */
public interface CnkProductSortHelper<RESULT extends BaseProductData>
{
	public abstract List<RESULT> sortResult(List<RESULT> result, CnkFacetValueProvider valueProvider, boolean isDesc);
}
