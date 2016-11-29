package com.cnk.travelogix.supplier.accommodation.dao;

import com.cnk.travelogix.product.common.core.model.AccommodationModel;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;

@FunctionalInterface
public interface AccommodationSearchDao {

	public SearchPageData<AccommodationModel> searchAccommodation(final PageableData pageableData);

}
