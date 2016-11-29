/**
 *
 */
package com.cnk.travelogix.common.facades.product.cached;

import com.cnk.travelogix.common.facades.product.data.BasePageableSearchData;
import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;


/**
 * @author i313879
 *
 */
public interface CnkProductCachedHandler<RESULT extends BaseProductData>
{
	public boolean storeBeanToRemoteCache(RESULT result);

	public RESULT getBeanFromRemoteCache(String id);

	public CnkProductSearchPageData getSearchDataFromRemoteCache(BasePageableSearchData searchParameters);

	public boolean storeSearchDataToRemoteCache(BasePageableSearchData searchParameters, CnkProductSearchPageData result);



	public boolean storeBeanToLocalCache(RESULT result);

	public RESULT getBeanFromLocalCache(String id);

	public CnkProductSearchPageData getSearchDataFromLocalCache(BasePageableSearchData searchParameters);

	public boolean storeSearchDataToLocalCache(BasePageableSearchData searchParameters, CnkProductSearchPageData result);

}
