/**
 *
 */
package com.cnk.travelogix.common.facades.product.cached.strategy;

import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;


/**
 * @author i313879
 *
 */
public interface CnkCachedStrategy<T extends BaseProductData>
{
	public boolean storeSearchResult(Object key, CnkProductSearchPageData searchData);

	public CnkProductSearchPageData getSearchResult(Object key);

	public boolean storeBean(Object key, T value);

	public T getBean(Object key);
}
