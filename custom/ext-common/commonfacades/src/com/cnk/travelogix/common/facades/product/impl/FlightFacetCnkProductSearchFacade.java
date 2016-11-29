/**
 *
 */
package com.cnk.travelogix.common.facades.product.impl;

import de.hybris.platform.core.Registry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.common.facades.product.data.BasePageableSearchData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetData;
import com.cnk.travelogix.common.facades.product.data.CnkFacetDataList;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.FlightHotelSearchData;
import com.cnk.travelogix.common.facades.product.data.FlightProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightData;
import com.cnk.travelogix.common.facades.product.data.flight.FlightResultData;
import com.cnk.travelogix.common.facades.product.facet.impl.FacetToModelMapper;
import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i313879
 *
 */
public class FlightFacetCnkProductSearchFacade extends FacetCnkProductSearchFacade<FlightData>
{

	@Override
	public FlightProductSearchPageData searchProduct(final BasePageableSearchData searchParameters)
	{
		boolean twoway = false;
		//		final List<FlightHotelSearchEntryData> entries = ((FlightHotelSearchData) searchParameters).getEntrys();
		final String flightType = ((FlightHotelSearchData) searchParameters).getFlightType();
		twoway = (flightType.equalsIgnoreCase("twoway"));
		//		final int ways = entries.size();
		//		if (ways == 1)
		//		{
		//			final FlightHotelSearchEntryData firstData = entries.get(0);
		//			if (firstData.getReturnFlightSearchData() != null)
		//			{
		//				twoway = true;
		//			}
		//		}
		if (twoway)
		{
			setFacetToModelMapper((FacetToModelMapper) Registry.getApplicationContext().getBean("twowayFlightFacetToModelMapper"));
		}
		else
		{
			setFacetToModelMapper((FacetToModelMapper) Registry.getApplicationContext().getBean("onewayFlightFacetToModelMapper"));
		}
		return (FlightProductSearchPageData) super.searchProduct(searchParameters);
	}

	@Override
	protected void preHandleFacet(final List<CnkFacetDataList> facetList)
	{
		super.preHandleFacet(facetList);

		if (CollectionUtils.isEmpty(facetList))
		{
			return;
		}

		final List<CnkFacetData> facetSkeleton = this.buildFacetSkeleton();

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cnk.travelogix.common.facades.product.impl.FacetCnkProductSearchFacade#HandleFacet(com.cnk.travelogix.common
	 * .facades.product.data.CnkProductSearchPageData, java.util.List)
	 */
	@Override
	protected void HandleFacet(final CnkProductSearchPageData result, final List<CnkFacetDataList> facetList)
	{
		// YTODO Auto-generated method stub
		final List<FlightResultData> resultList = result.getResult();
		final List<FlightResultData> bestPriceList = result.getBestPriceRecommend();
		final boolean isTwoway = isTwoway(result);
		final boolean isMulticity = isMulticity(result);
		if (isMulticity)
		{
			handleMulticity(result, facetList);
			return;
		}

		for (int i = 0; i < resultList.size(); i++)
		{
			final FlightResultData singleData = resultList.get(i);
			final FlightResultData bestPriceData = bestPriceList.get(i);

			CnkFacetData twowayFacet = null;
			if (isTwoway)
			{
				twowayFacet = this.removeTwoFacet(facetList.get(0).getFacets(), i);
			}

			final List facetFlightList = new ArrayList();
			for (final FlightData flight : singleData.getListOfFlights())
			{
				if (getCnkProductFacetHandler().handleFacet(flight, facetList.get(0).getFacets(), getFacetToModelMapper()))
				{
					facetFlightList.add(flight);
				}
			}
			final FlightData bestPrice = this.getBestRecommend(facetFlightList);
			final List<FlightData> best = new ArrayList();
			if (bestPrice != null)
			{
				best.add(bestPrice);
			}
			bestPriceData.setListOfFlights(best);
			singleData.setListOfFlights(facetFlightList);
			if (isTwoway)
			{
				this.addTwowayFacet(i, facetList.get(0).getFacets(), twowayFacet);
			}
		}
		setStartAtAndTotal(result);
		result.setFacets(facetList);
	}

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

	private void handleMulticity(final CnkProductSearchPageData result, final List<CnkFacetDataList> facetList)
	{
		final List<FlightResultData> resultList = result.getResult();
		final List<FlightResultData> bestPriceList = result.getBestPriceRecommend();
		adjustMulticityFacets(result, facetList);

		for (int i = 0; i < resultList.size(); i++)
		{
			final List<CnkFacetData> facets = facetList.get(i).getFacets();

			final FlightResultData singleData = resultList.get(i);
			final FlightResultData bestPriceData = bestPriceList.get(i);

			final List facetFlightList = new ArrayList();
			for (final FlightData flight : singleData.getListOfFlights())
			{
				if (getCnkProductFacetHandler().handleFacet(flight, facets, getFacetToModelMapper()))
				{
					facetFlightList.add(flight);
				}
			}
			final FlightData bestPrice = this.getBestRecommend(facetFlightList);
			final List<FlightData> best = new ArrayList();
			if (bestPrice != null)
			{
				best.add(bestPrice);
			}
			bestPriceData.setListOfFlights(best);
			singleData.setListOfFlights(facetFlightList);

		}
		setStartAtAndTotal(result);
		result.setFacets(facetList);
	}

	private void adjustMulticityFacets(final CnkProductSearchPageData result, final List<CnkFacetDataList> facetList)
	{
		final int ways = result.getResult().size();
		for (int i = 0; i < ways; i++)
		{
			CnkFacetDataList facet = (i < facetList.size()) ? facetList.get(i) : null;
			if (facet == null)
			{
				facet = new CnkFacetDataList();
				facet.setFacets(this.buildFacetSkeleton());
				facetList.add(facet);
			}
		}
	}

	private boolean isTwoway(final CnkProductSearchPageData result)
	{
		if (result instanceof FlightProductSearchPageData)
		{
			return ((FlightProductSearchPageData) result).getFlightType().equals("TWOWAY");//TODO: replace "TWOWAY" to enum
		}
		return result.getResult().size() == 2;
	}

	private boolean isMulticity(final CnkProductSearchPageData result)
	{
		if (result instanceof FlightProductSearchPageData)
		{
			return ((FlightProductSearchPageData) result).getFlightType().equals("MULTICITY");//TODO: replace "MULTICITY" to enum
		}
		return result.getResult().size() > 2;
	}

	private void addTwowayFacet(final int index, final List<CnkFacetData> facets, final CnkFacetData toAddFacet)
	{
		if (index == 0)
		{
			facets.add(2, toAddFacet);//TODO: bad practice
		}
		else
		{
			facets.add(1, toAddFacet); //TODO: bad practice
		}
	}

	private CnkFacetData removeTwoFacet(final List<CnkFacetData> facets, final int index)
	{
		CnkFacetData result = null;
		if (index == 0)
		{
			final Iterator<CnkFacetData> iter = facets.iterator();
			while (iter.hasNext())
			{
				final CnkFacetData facet = iter.next();
				//TODO:  Bad practice!
				if (facet.getCode().equals("returnTime"))
				{
					result = facet;
					iter.remove();
				}
			}
		}
		else
		{
			final Iterator<CnkFacetData> iter = facets.iterator();
			while (iter.hasNext())
			{
				final CnkFacetData facet = iter.next();
				//TODO:  Bad practice!
				if (facet.getCode().equals("departureTime"))
				{
					result = facet;
					iter.remove();
				}
			}
		}
		return result;
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

	private FlightData getBestRecommend(final List<FlightData> flights)
	{

		final CnkFacetValueProvider<FlightData> flightPriceValueProvider = (CnkFacetValueProvider) Registry.getApplicationContext()
				.getBean("flightPriceValueProvider"); //TODO: not good

		Collections.sort(flights, new Comparator<FlightData>()
		{
			@Override
			public int compare(final FlightData o1, final FlightData o2)
			{
				final double p1 = Double.parseDouble(flightPriceValueProvider.getFacetValue(o1, "price").toString());
				final double p2 = Double.parseDouble(flightPriceValueProvider.getFacetValue(o2, "price").toString());
				return (int) ((int) p1 - p2);
			}

		});
		if (flights.size() == 0)
		{
			return null;
		}
		return flights.get(0);
	}


	@Override
	protected void postHandleFacet(final CnkProductSearchPageData result, final List<CnkFacetDataList> facetList)
	{
		if (!isTwoway(result))
		{
			return;
		}

		final List<CnkFacetData> skeletonFacets = buildFacetSkeleton();
		for (int i = 0; i < skeletonFacets.size(); i++)
		{
			final CnkFacetData facet = skeletonFacets.get(i);
			for (final CnkFacetData calculatedFacet : facetList.get(0).getFacets())
			{
				if (calculatedFacet.getCode().equals(facet.getCode()))
				{
					skeletonFacets.set(i, calculatedFacet);
				}
			}
		}

		facetList.get(0).setFacets(skeletonFacets);
		super.postHandleFacet(result, facetList);
	}
}
