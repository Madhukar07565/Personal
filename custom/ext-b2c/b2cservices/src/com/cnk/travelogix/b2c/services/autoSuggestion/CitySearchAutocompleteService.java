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
package com.cnk.travelogix.b2c.services.autoSuggestion;

import de.hybris.platform.commerceservices.search.solrfacetsearch.data.AutocompleteSuggestion;

import java.util.List;


/**
 *
 */
public interface CitySearchAutocompleteService<RESULT extends AutocompleteSuggestion>
{
	/**
	 * Get the auto complete suggestions for the input provided.
	 *
	 * @param input
	 *           the user's input on which the autocomplete is based
	 * @return a list of suggested search terms
	 */
	List<RESULT> getAutocompleteSuggestions(String input);
}
