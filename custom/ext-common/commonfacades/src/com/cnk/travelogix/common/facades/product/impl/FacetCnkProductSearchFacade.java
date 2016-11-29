/**
 *
 */
package com.cnk.travelogix.common.facades.product.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.fest.util.Collections;

import com.cnk.travelogix.common.facades.product.CnkProductSearchFacade;
import com.cnk.travelogix.common.facades.product.data.BasePageableSearchData;
import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetDataList;
import com.cnk.travelogix.common.facades.product.data.CnkFacetValueData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;
import com.cnk.travelogix.common.facades.product.facet.CnkProductFacetHandler;
import com.cnk.travelogix.common.facades.product.facet.impl.FacetToModelEntry;
import com.cnk.travelogix.common.facades.product.facet.impl.FacetToModelMapper;


/**
 * @author i313879
 *
 */
public abstract class FacetCnkProductSearchFacade<RESULT extends BaseProductData> implements CnkProductSearchFacade
{
	//The class to be decorated
	private CnkProductSearchFacade<RESULT> cnkProductSearchFacade;

	private FacetToModelMapper facetToModelMapper;

	private CnkProductFacetHandler cnkProductFacetHandler;

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

		List<CnkFacetDataList> facetList = searchParameters.getFacets();
		if (facetList == null)
		{
			facetList = new ArrayList();
			final CnkFacetDataList theFacets = new CnkFacetDataList();
			final List<CnkFacetData> facets = buildFacetSkeleton();
			theFacets.setFacets(facets);
			facetList.add(theFacets);
		}
		//TODO: facet process
		final CnkProductSearchPageData result = cnkProductSearchFacade.searchProduct(searchParameters);

		preHandleFacet(facetList);

		HandleFacet(result, facetList);

		postHandleFacet(result, facetList);

		return result;

	}

	protected void preHandleFacet(final List<CnkFacetDataList> facetList)
	{

		if (Collections.isEmpty(facetList))
		{
			return;
		}
		for (final CnkFacetDataList theFacetDataList : facetList)
		{
			if (theFacetDataList == null)
			{
				continue;
			}
			if (CollectionUtils.isEmpty(theFacetDataList.getFacets()))
			{
				continue;
			}
			for (final CnkFacetData facet : theFacetDataList.getFacets())
			{
				final List<CnkFacetValueData> facetValueList = facet.getValues();
				if (!Collections.isEmpty(facetValueList))
				{
					for (final CnkFacetValueData valueData : facetValueList)
					{
						valueData.setCount(0);
					}

				}
			}
		}
	}

	/**
	 * abstract method to handle facet differently
	 *
	 * @param result
	 * @param facets
	 */
	protected abstract void HandleFacet(CnkProductSearchPageData result, List<CnkFacetDataList> facetList);

	/**
	 * used for inherited.
	 *
	 * @param result
	 * @param facets
	 */
	protected void postHandleFacet(final CnkProductSearchPageData result, final List<CnkFacetDataList> facetList)
	{
		if (Collections.isEmpty(facetList))
		{
			return;
		}
		for (final CnkFacetDataList theFacetDataList : facetList)
		{
			if (theFacetDataList == null)
			{
				continue;
			}
			for (final CnkFacetData facet : theFacetDataList.getFacets())
			{
				final List<CnkFacetValueData> facetValueList = facet.getValues();
				if (!Collections.isEmpty(facetValueList))
				{
					final java.util.Iterator<CnkFacetValueData> iterator = facetValueList.iterator();
					while (iterator.hasNext())
					{
						final CnkFacetValueData valueData = iterator.next();
						if (valueData.getCount() == 0 && !valueData.isSelected())
						{
							iterator.remove();
						}
					}

				}
			}
		}
	}

	protected List<CnkFacetData> buildFacetSkeleton()
	{
		final List<FacetToModelEntry> facetEntries = facetToModelMapper.getFacetToModelEntries();
		final List<CnkFacetData> facets = new ArrayList();

		for (final FacetToModelEntry facetEntry : facetEntries)
		{
			facets.add(createNormalFacet(facetEntry));
		}
		return facets;
	}

	private CnkFacetData createNormalFacet(final FacetToModelEntry facetEntry)
	{
		final CnkFacetData facetData = new CnkFacetData();
		facetData.setCode(facetEntry.getFacetCode());
		facetData.setName(facetEntry.getFacetName());
		//facetData.setType(FacetType.);;
		return facetData;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cnk.travelogix.common.facades.product.CnkProductSearchFacade#searchProductDetail(java.lang.String)
	 */
	@Override
	public BaseProductData searchProductDetail(final String productId)
	{
		// YTODO Auto-generated method stub
		return cnkProductSearchFacade.searchProductDetail(productId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.CnkProductSearchFacade#searchProductDetail(com.cnk.travelogix.common
	 * .facades.product.data.BasePageableSearchData)
	 */
	@Override
	public BaseProductData searchProductDetail(final BasePageableSearchData searchParameters)
	{
		//TODO: facet process
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
	 * @return the facetToModelMapper
	 */
	public FacetToModelMapper getFacetToModelMapper()
	{
		return facetToModelMapper;
	}

	/**
	 * @param facetToModelMapper
	 *           the facetToModelMapper to set
	 */
	public void setFacetToModelMapper(final FacetToModelMapper facetToModelMapper)
	{
		this.facetToModelMapper = facetToModelMapper;
	}

	/**
	 * @return the cnkProductFacetHandler
	 */
	public CnkProductFacetHandler getCnkProductFacetHandler()
	{
		return cnkProductFacetHandler;
	}

	/**
	 * @param cnkProductFacetHandler
	 *           the cnkProductFacetHandler to set
	 */
	public void setCnkProductFacetHandler(final CnkProductFacetHandler cnkProductFacetHandler)
	{
		this.cnkProductFacetHandler = cnkProductFacetHandler;
	}


}
