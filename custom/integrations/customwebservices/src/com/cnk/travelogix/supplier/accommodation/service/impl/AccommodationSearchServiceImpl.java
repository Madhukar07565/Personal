package com.cnk.travelogix.supplier.accommodation.service.impl;

import javax.annotation.Resource;

import com.cnk.travelogix.product.common.core.model.AccommodationModel;
import com.cnk.travelogix.supplier.accommodation.dao.AccommodationSearchDao;
import com.cnk.travelogix.supplier.accommodation.service.AccommodationSearchService;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;

public class AccommodationSearchServiceImpl implements AccommodationSearchService{
	
	@Resource(name="accommodationSearchDao")
	AccommodationSearchDao accommodationSearchDao;
	@Override
	public SearchPageData<AccommodationModel> searchAccommodation(PageableData pageableData) {
		return accommodationSearchDao.searchAccommodation(pageableData);
	}
}
