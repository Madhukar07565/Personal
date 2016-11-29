/**
 *
 */
package com.cnk.travelogix.common.facades.product.impl;

import de.hybris.platform.core.Registry;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.common.facades.product.data.CnkFacetData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetDataList;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightResultData;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i323616
 *
 */
public class MulticityIntlFlightFacetCnkProductSearchFacade extends FacetCnkProductSearchFacade<FlightData>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.facades.product.impl.FacetCnkProductSearchFacade#HandleFacet(com.cnk.travelogix.common.
	 * facades.product.data.CnkProductSearchPageData, java.util.List)
	 */
	@Override
	protected void HandleFacet(final CnkProductSearchPageData result, final List<CnkFacetDataList> facetList)
	{
		final List<FlightResultData> resultList = result.getResult();
		final List<FlightResultData> bestPriceList = result.getBestPriceRecommend();
		if (0 == facetList.size())
		{
			final CnkFacetDataList facet = new CnkFacetDataList();
			facet.setFacets(buildFacetSkeleton());
			facetList.add(facet);
		}
		final List<CnkFacetData> facets = facetList.get(0).getFacets();
		final List<FlightResultData> flightGroupList = new ArrayList<FlightResultData>();
		for (final FlightResultData singleData : resultList)
		{
			if (getCnkProductFacetHandler().handleFacet(singleData, facets, getFacetToModelMapper()))
			{
				flightGroupList.add(singleData);
			}
		}
		result.setResult(flightGroupList);

		//		final FlightResultData bestPrice = bestPriceList.get(0);
		//		bestPriceList.clear();
		//		bestPriceList.add(bestPrice);
		bestPriceList.get(0).getListOfFlights().clear();
		if (!resultList.isEmpty())
		{
			bestPriceList.get(0).setListOfFlights(resultList.get(0).getListOfFlights());
		}
		setStartAtAndTotal(result);
		result.setFacets(facetList);
	}

	@Override
	protected void preHandleFacet(final List<CnkFacetDataList> facetList)
	{
		super.preHandleFacet(facetList);

		if (CollectionUtils.isEmpty(facetList))
		{
			return;
		}

		final List<CnkFacetData> facetSkeleton = buildFacetSkeleton();

		for (final CnkFacetDataList theFacetDataList : facetList)
		{
			if (theFacetDataList == null)
			{
				continue;
			}
			for (int i = 0; i < theFacetDataList.getFacets().size(); i++)
			{
				final CnkFacetData facet = theFacetDataList.getFacets().get(i);
				final CnkFacetData facetSKData = facetSkeleton.get(i);
				if (!facet.getCode().equals(facetSKData.getCode()))
				{
					facet.setCode(facetSKData.getCode());
					facet.setName(facetSKData.getName());
					facet.setValues(null);
				}
			}
		}
	}

	//	@Override
	//	protected void postHandleFacet(final CnkProductSearchPageData result, final List<CnkFacetDataList> facetList)
	//	{
	//		final List<CnkFacetData> skeletonFacets = buildFacetSkeleton();
	//		for (int i = 0; i < skeletonFacets.size(); i++)
	//		{
	//			final CnkFacetData facet = skeletonFacets.get(i);
	//			for (final CnkFacetData calculatedFacet : facetList.get(0).getFacets())
	//			{
	//				if (calculatedFacet.getCode().equals(facet.getCode()))
	//				{
	//					skeletonFacets.set(i, calculatedFacet);
	//				}
	//			}
	//		}
	//
	//		facetList.get(0).setFacets(skeletonFacets);
	//		super.postHandleFacet(result, facetList);
	//	}

	private void setStartAtAndTotal(final CnkProductSearchPageData<FlightResultData> result)
	{
		if (result.getBestPriceRecommend().size() > 0)
		{
			result.setStartAtPrice(this.getBestPrice(result.getBestPriceRecommend().get(0)));
		}
		if (result.getResult().size() > 0)
		{
			int totalSize = 0;
			for (final FlightResultData flightResult : result.getResult())
			{
				totalSize += flightResult.getListOfFlights().size();
			}
			result.setTotalSize(totalSize);
		}
	}

	private double getBestPrice(final FlightResultData flightResultData)
	{
		final CnkFacetValueProvider<FlightData> flightPriceValueProvider = (CnkFacetValueProvider) Registry.getApplicationContext()
				.getBean("flightPriceValueProvider"); //TODO: not good
		double bestPrice = Double.MAX_VALUE;
		for (final FlightData flight : flightResultData.getListOfFlights())
		{
			final double flightPrice = Double.parseDouble(flightPriceValueProvider.getFacetValue(flight, "price").toString());
			if (bestPrice > flightPrice)
			{
				bestPrice = flightPrice;
			}
		}
		return bestPrice;
	}
}
