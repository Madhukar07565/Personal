/**
 *
 */
package com.cnk.travelogix.common.facades.product.sort.impl;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.common.facades.product.provider.CnkFacetValueProvider;


/**
 * @author i313890
 *
 */
public class HotelSortedToModelMapper extends SortedToModelMapper
{
	private CnkFacetValueProvider defaultCnkFacetValueProvider;

	@Override
	protected List<SortedToModelEntry> buildMockupEntries()
	{
		final List<SortedToModelEntry> entrys = new ArrayList();
		entrys.add(createEntry("Price", "Price(from low to high)", "hotelPriceValueProvider"));
		entrys.add(createEntry("hotelRating", "Star Rating(from low to high)", "hotelStarRatingValueProvider"));
		entrys.add(createEntry("Recommended", "Recommended(from low to high)", "hotelRecommendedValueProvider"));
		entrys.add(createEntry("Popularity", "Popularity(from low to high)", "hotelPopularityValueProvider"));


		return entrys;
	}

	private SortedToModelEntry createEntry(final String code, final String name, final String providerName)
	{
		final SortedToModelEntry entry = new SortedToModelEntry();
		entry.setCode(code);
		entry.setName(name);
		entry.setDesc(false);
		entry.setSortedValueProvider(getProviderByName(providerName));
		return entry;
	}

	/**
	 * @return the defaultCnkFacetValueProvider
	 */
	public CnkFacetValueProvider getDefaultCnkFacetValueProvider()
	{
		return defaultCnkFacetValueProvider;
	}

	/**
	 * @param defaultCnkFacetValueProvider
	 *           the defaultCnkFacetValueProvider to set
	 */
	public void setDefaultCnkFacetValueProvider(final CnkFacetValueProvider defaultCnkFacetValueProvider)
	{
		this.defaultCnkFacetValueProvider = defaultCnkFacetValueProvider;
	}


}
