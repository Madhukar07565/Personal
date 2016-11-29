/**
 *
 */
package com.cnk.travelogix.common.facades.product.impl;

import java.util.ArrayList;
import java.util.List;

import org.fest.util.Collections;

import com.cnk.travelogix.common.facades.product.CnkProductSearchFacade;
import com.cnk.travelogix.common.facades.product.data.BasePageableSearchData;
import com.cnk.travelogix.common.facades.product.data.BaseProductData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSortConditionData;
import com.cnk.travelogix.common.facades.product.data.CnkSortedDataList;
import com.cnk.travelogix.common.facades.product.sort.CnkProductSortHelper;
import com.cnk.travelogix.common.facades.product.sort.impl.SortedToModelEntry;
import com.cnk.travelogix.common.facades.product.sort.impl.SortedToModelMapper;


/**
 * @author i313879
 *
 */
public abstract class SortedCnkProductSearchFacade<RESULT extends BaseProductData> implements CnkProductSearchFacade
{

	//The class to be decorated
	private CnkProductSearchFacade<RESULT> cnkProductSearchFacade;

	private SortedToModelMapper sortedToModelMapper;

	private CnkProductSortHelper cnkProductSortHelper;


	protected List<CnkProductSortConditionData> buildSortedSkeleton()
	{
		final List<SortedToModelEntry> sortedEntries = sortedToModelMapper.getSortedToModelEntries();
		final List<CnkProductSortConditionData> sortedConditionList = new ArrayList();

		for (final SortedToModelEntry sortedEntry : sortedEntries)
		{
			sortedConditionList.add(createNormalSort(sortedEntry));
		}
		return sortedConditionList;
	}

	private CnkProductSortConditionData createNormalSort(final SortedToModelEntry sortedEntry)
	{
		final CnkProductSortConditionData facetData = new CnkProductSortConditionData();
		facetData.setCode(sortedEntry.getCode());
		facetData.setName(sortedEntry.getName());
		facetData.setDesc(sortedEntry.isDesc());
		if (sortedEntry.getCode().equalsIgnoreCase("Price"))
		{
			facetData.setSelected(true);
		}
		//facetData.setType(FacetType.);;
		return facetData;
	}

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

		//TODO: facet process
		final CnkProductSearchPageData result = cnkProductSearchFacade.searchProduct(searchParameters);

		final List<CnkSortedDataList> sortConditionList = getSortedDataList(searchParameters);
		sort(result, sortConditionList);
		result.setSortConditionList(sortConditionList);
		return result;
	}

	protected List<CnkSortedDataList> getSortedDataList(final BasePageableSearchData searchParameters)
	{
		List<CnkSortedDataList> sortedList = searchParameters.getSortConditionList();
		if (Collections.isEmpty(sortedList))
		{
			sortedList = new ArrayList();
			final CnkSortedDataList theSortedConditions = new CnkSortedDataList();
			final List<CnkProductSortConditionData> conditions = buildSortedSkeleton();
			theSortedConditions.setConditions(conditions);
			sortedList.add(theSortedConditions);
		}
		return sortedList;
	}

	protected abstract void sort(final CnkProductSearchPageData result, final List<CnkSortedDataList> sortedList);


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
		// YTODO Auto-generated method stub
		return cnkProductSearchFacade.searchProductDetail(searchParameters);
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
	 * @return the cnkProductSortHelper
	 */
	public CnkProductSortHelper getCnkProductSortHelper()
	{
		return cnkProductSortHelper;
	}

	/**
	 * @param cnkProductSortHelper
	 *           the cnkProductSortHelper to set
	 */
	public void setCnkProductSortHelper(final CnkProductSortHelper cnkProductSortHelper)
	{
		this.cnkProductSortHelper = cnkProductSortHelper;
	}

	/**
	 * @return the sortedToModelMapper
	 */
	public SortedToModelMapper getSortedToModelMapper()
	{
		return sortedToModelMapper;
	}

	/**
	 * @param sortedToModelMapper
	 *           the sortedToModelMapper to set
	 */
	public void setSortedToModelMapper(final SortedToModelMapper sortedToModelMapper)
	{
		this.sortedToModelMapper = sortedToModelMapper;
	}

}
