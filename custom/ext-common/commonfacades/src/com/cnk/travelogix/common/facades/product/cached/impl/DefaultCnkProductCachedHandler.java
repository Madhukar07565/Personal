/**
 *
 */
package com.cnk.travelogix.common.facades.product.cached.impl;

import com.cnk.travelogix.common.facades.product.cached.CnkCachedHelper;
import com.cnk.travelogix.common.facades.product.cached.CnkProductCachedHandler;
import com.cnk.travelogix.common.facades.product.data.BasePageableSearchData;
import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;


/**
 * @author i313879
 *
 */
public class DefaultCnkProductCachedHandler implements CnkProductCachedHandler
{

	private CnkCachedHelper redisCacheHelper;

	private CnkCachedHelper localCacheHelper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.cached.CnkProductCachedHandler#storeBeanToRemoteCache(com.cnk.travelogix
	 * .common.facades.product.data.BaseProductData)
	 */
	@Override
	public boolean storeBeanToRemoteCache(final BaseProductData result)
	{
		// YTODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.cached.CnkProductCachedHandler#getBeanFromRemoteCache(java.lang.String)
	 */
	@Override
	public BaseProductData getBeanFromRemoteCache(final String id)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.cached.CnkProductCachedHandler#getSearchDataFromRemoteCache(com.cnk.
	 * travelogix.common.facades.product.data.BasePageableSearchData)
	 */
	@Override
	public CnkProductSearchPageData getSearchDataFromRemoteCache(final BasePageableSearchData searchParameters)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.cached.CnkProductCachedHandler#storeSearchDataToRemoteCache(com.cnk.
	 * travelogix.common.facades.product.data.CnkProductSearchPageData)
	 */
	@Override
	public boolean storeSearchDataToRemoteCache(final BasePageableSearchData searchParameters,
			final CnkProductSearchPageData result)
	{
		// YTODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.cached.CnkProductCachedHandler#storeBeanToLocalCache(com.cnk.travelogix
	 * .common.facades.product.data.BaseProductData)
	 */
	@Override
	public boolean storeBeanToLocalCache(final BaseProductData result)
	{
		// YTODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.cached.CnkProductCachedHandler#getBeanFromLocalCache(java.lang.String)
	 */
	@Override
	public BaseProductData getBeanFromLocalCache(final String id)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cnk.travelogix.common.facades.product.cached.CnkProductCachedHandler#getSearchDataFromLocalCache(com.cnk.
	 * travelogix.common.facades.product.data.BasePageableSearchData)
	 */
	@Override
	public CnkProductSearchPageData getSearchDataFromLocalCache(final BasePageableSearchData searchParameters)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cnk.travelogix.common.facades.product.cached.CnkProductCachedHandler#storeSearchDataToLocalCache(com.cnk.
	 * travelogix.common.facades.product.data.CnkProductSearchPageData)
	 */
	@Override
	public boolean storeSearchDataToLocalCache(final BasePageableSearchData searchParameters, final CnkProductSearchPageData result)
	{
		// YTODO Auto-generated method stub
		return false;
	}

	/**
	 * @return the redisCacheHelper
	 */
	public CnkCachedHelper getRedisCacheHelper()
	{
		return redisCacheHelper;
	}

	/**
	 * @param redisCacheHelper
	 *           the redisCacheHelper to set
	 */
	public void setRedisCacheHelper(final CnkCachedHelper redisCacheHelper)
	{
		this.redisCacheHelper = redisCacheHelper;
	}

	/**
	 * @return the localCacheHelper
	 */
	public CnkCachedHelper getLocalCacheHelper()
	{
		return localCacheHelper;
	}

	/**
	 * @param localCacheHelper
	 *           the localCacheHelper to set
	 */
	public void setLocalCacheHelper(final CnkCachedHelper localCacheHelper)
	{
		this.localCacheHelper = localCacheHelper;
	}




}
