/**
 *
 */
package com.cnk.travelogix.common.facades.product.impl;

import de.hybris.platform.util.Config;

import org.fest.util.Collections;

import com.cnk.travelogix.common.facades.product.CnkProductSearchFacade;
import com.cnk.travelogix.common.facades.product.cached.CnkProductCachedHandler;
import com.cnk.travelogix.common.facades.product.data.BasePageableSearchData;
import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.HotelSearchData;


/**
 * @author i313879
 *
 */
public class CachedCnkProductSearchFacade<RESULT extends BaseProductData> implements CnkProductSearchFacade
{
	//The class to be decorated
	private CnkProductSearchFacade<RESULT> cnkProductSearchFacade;

	private CnkProductCachedHandler<RESULT> cnkProductCachedHandler;

	//private RedisTemplate redisTemplate;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.facades.product.CnkProductSearchFacade#searchProduct(com.cnk.travelogix.common.facades
	 * .product.data.BasePageableSearchData)
	 */
	@Override
	public CnkProductSearchPageData searchProduct(final BasePageableSearchData searchParameters)
	{
		//TODO: caching process
		//redisTemplate.getStringSerializer();
		CnkProductSearchPageData result = cnkProductCachedHandler.getSearchDataFromLocalCache(searchParameters);
		if (result == null || Collections.isEmpty(result.getResult()))
		{
			result = cnkProductCachedHandler.getSearchDataFromRemoteCache(searchParameters);
		}
		if (result == null || Collections.isEmpty(result.getResult()))
		{
			result = cnkProductSearchFacade.searchProduct(searchParameters);
			if (result == null || Collections.isEmpty(result.getResult()))
			{
				//alternative search
				this.useAlternativeSearch(searchParameters);
				result = cnkProductSearchFacade.searchProduct(searchParameters);
			}
			if (result != null && !Collections.isEmpty(result.getResult()))
			{
				cnkProductCachedHandler.storeSearchDataToLocalCache(searchParameters, result); // asynchronous
				cnkProductCachedHandler.storeSearchDataToRemoteCache(searchParameters, result); // asynchronous
			}
		}
		else if (!Collections.isEmpty(result.getResult()))
		{
			cnkProductCachedHandler.storeSearchDataToLocalCache(searchParameters, result); // asynchronous
		}

		return result;
	}

	private void useAlternativeSearch(final BasePageableSearchData searchParameters)
	{
		final Boolean isEnableAlterSrc = Boolean.valueOf(Config.getParameter("hotel.alternativeSearch.toggle"));
		if (isEnableAlterSrc.booleanValue())
		{
			if (searchParameters instanceof HotelSearchData)
			{
				//TODO
			}
		}
	}


	@Override
	public RESULT searchProductDetail(final String productId)
	{
		// YTODO Auto-generated method stub
		RESULT result = cnkProductCachedHandler.getBeanFromLocalCache(productId);
		if (result == null)
		{
			result = cnkProductCachedHandler.getBeanFromRemoteCache(productId);
		}
		if (result == null)
		{
			result = cnkProductSearchFacade.searchProductDetail(productId);
			if (result != null)
			{
				cnkProductCachedHandler.storeBeanToLocalCache(result);
				cnkProductCachedHandler.storeBeanToRemoteCache(result);
			}
		}
		else
		{
			cnkProductCachedHandler.storeBeanToLocalCache(result);
		}

		return result;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.facades.product.CnkProductSearchFacade#searchProductDetail(com.cnk.travelogix.common
	 * .facades.product.data.BasePageableSearchData)
	 */
	@Override
	public RESULT searchProductDetail(final BasePageableSearchData searchParameters)
	{
		//TODO: caching process
		return cnkProductSearchFacade.searchProductDetail(searchParameters);
	}



	/**
	 * @return the cnkProductSearchFacade
	 */
	public CnkProductSearchFacade<RESULT> getCnkProductSearchFacade()
	{
		return cnkProductSearchFacade;
	}

	/**
	 * @param cnkProductSearchFacade
	 *           the cnkProductSearchFacade to set
	 */
	public void setCnkProductSearchFacade(final CnkProductSearchFacade<RESULT> cnkProductSearchFacade)
	{
		this.cnkProductSearchFacade = cnkProductSearchFacade;
	}

	/**
	 * @return the cnkProductCachedHandler
	 */
	public CnkProductCachedHandler getCnkProductCachedHandler()
	{
		return cnkProductCachedHandler;
	}

	/**
	 * @param cnkProductCachedHandler
	 *           the cnkProductCachedHandler to set
	 */
	public void setCnkProductCachedHandler(final CnkProductCachedHandler cnkProductCachedHandler)
	{
		this.cnkProductCachedHandler = cnkProductCachedHandler;
	}

}
