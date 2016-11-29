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
package com.cnk.travelogix.b2c.facades.audoSuggestion;

import de.hybris.platform.commercefacades.search.data.AutocompleteSuggestionData;

import java.util.List;


/**
 *
 */
public interface CitySearchFacade
{
	/**
	 * Get the auto complete suggestions for the provided input.
	 *
	 * @param input
	 *           the user's input
	 * @return a list of suggested search terms
	 */
	List<AutocompleteSuggestionData> getAutocompleteSuggestions(String input);
}