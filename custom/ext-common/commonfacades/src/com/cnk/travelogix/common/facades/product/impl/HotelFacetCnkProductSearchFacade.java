/**
 *
 */
package com.cnk.travelogix.common.facades.product.impl;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.common.facades.product.data.CnkFacetDataList;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;


/**
 * @author i313879
 *
 */
public class HotelFacetCnkProductSearchFacade extends FacetCnkProductSearchFacade<HotelData>
{
	@Override
	protected void HandleFacet(final CnkProductSearchPageData result, final List<CnkFacetDataList> facetList)
	{
		// YTODO Auto-generated method stub
		final List<HotelData> resultList = result.getResult();
		//the filtered result list is to be used.
		final List<HotelData> facetResultList = new ArrayList();

		for (final HotelData singleData : resultList)
		{
			if (getCnkProductFacetHandler().handleFacet(singleData, facetList.get(0).getFacets(), getFacetToModelMapper()))
			{
				facetResultList.add(singleData);
			}
		}
		final List<HotelData> facetBestPriceList = new ArrayList();
		if (facetResultList.size() > 0)
		{
			facetBestPriceList.add(facetResultList.get(0));
		}

		result.setBestPriceRecommend(facetBestPriceList);
		result.setResult(facetResultList);
		result.setFacets(facetList);
	}

}
