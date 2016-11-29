package com.cnk.travelogix.supplier.accommodation.service;

import com.cnk.travelogix.product.common.core.model.AccommodationModel;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;

@FunctionalInterface
public interface AccommodationSearchService {
	public SearchPageData<AccommodationModel> searchAccommodation(PageableData pageableData);
}
