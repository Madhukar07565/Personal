/**
 *
 */
package com.cnk.travelogix.common.facades.product.cached.strategy.impl;

import com.cnk.travelogix.common.facades.product.cached.strategy.CnkCachedStrategy;
import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;


/**
 * @author i313879
 *
 */
public class DefaultCnkCachedStrategy implements CnkCachedStrategy
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.cached.strategy.CnkCachedStrategy#storeSearchResult(java.lang.Object,
	 * com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData)
	 */
	@Override
	public boolean storeSearchResult(final Object key, final CnkProductSearchPageData searchData)
	{
		// YTODO Auto-generated method stub
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cnk.travelogix.common.facades.product.cached.strategy.CnkCachedStrategy#getSearchResult(java.lang.Object)
	 */
	@Override
	public CnkProductSearchPageData getSearchResult(final Object key)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cnk.travelogix.common.facades.product.cached.strategy.CnkCachedStrategy#storeBean(java.lang.Object,
	 * com.cnk.travelogix.common.facades.product.data.BaseProductData)
	 */
	@Override
	public boolean storeBean(final Object key, final BaseProductData value)
	{
		// YTODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cnk.travelogix.common.facades.product.cached.strategy.CnkCachedStrategy#getBean(java.lang.Object)
	 */
	@Override
	public BaseProductData getBean(final Object key)
	{
		// YTODO Auto-generated method stub
		return null;
	}

}
