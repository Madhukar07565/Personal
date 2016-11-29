/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.client.core.companyoffers.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.client.core.companyoffer.model.CompanyOffersModel;
import com.cnk.travelogix.client.core.companyoffers.dao.CompanyOfferDao;


/**
 *
 */
public class CompanyOfferDaoImpl implements CompanyOfferDao
{
	@Deprecated
	protected FlexibleSearchService flexibleSearchService;

	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	@Override
	public boolean checkForDuplicateValues(final CompanyOffersModel companyModel)
	{
		boolean resultValue = false;
		final StringBuilder query = new StringBuilder();

		final Map<String, Object> attributes = new HashMap();
		attributes.put("company", companyModel.getCompanyOffersCompany());
		attributes.put("client", companyModel.getClientCompanyOffers());
		attributes.put("products", companyModel.getProducts());

		query.append(
				"select {pk} from {CompanyOffers as co join OfferType as ot on {co.offerType}={ot.pk} join OfferSubType as ost on {co.offerSubType}={ost.pk}} where ");
		query.append("{co.offerName}='" + companyModel.getOfferName() + "' AND ");
		query.append("{ot.code}='" + companyModel.getOfferType() + "' AND ");
		query.append("{ost.code}='" + companyModel.getOfferSubType() + "'");

		final SearchResult<CompanyOffersModel> result = getFlexibleSearchService().search(query.toString());

		if (result != null && CollectionUtils.isNotEmpty(result.getResult()))
		{
			resultValue = true;
		}
		return resultValue;


	}

}
