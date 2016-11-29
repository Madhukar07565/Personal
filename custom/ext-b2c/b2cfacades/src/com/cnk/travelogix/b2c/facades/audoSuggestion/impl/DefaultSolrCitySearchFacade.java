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
package com.cnk.travelogix.b2c.facades.audoSuggestion.impl;

import de.hybris.platform.commercefacades.search.data.AutocompleteSuggestionData;
import de.hybris.platform.commerceservices.search.solrfacetsearch.data.AutocompleteSuggestion;
import de.hybris.platform.commerceservices.threadcontext.ThreadContextService;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import com.cnk.travelogix.b2c.facades.audoSuggestion.CitySearchFacade;
import com.cnk.travelogix.b2c.services.autoSuggestion.CitySearchAutocompleteService;


/**
 *
 */
public class DefaultSolrCitySearchFacade implements CitySearchFacade
{

	private Converter<AutocompleteSuggestion, AutocompleteSuggestionData> autocompleteSuggestionConverter;
	private CitySearchAutocompleteService<AutocompleteSuggestion> autocompleteService;
	private ThreadContextService threadContextService;

	@Override
	public List<AutocompleteSuggestionData> getAutocompleteSuggestions(final String input)
	{
		return getThreadContextService().executeInContext(
				new ThreadContextService.Executor<List<AutocompleteSuggestionData>, ThreadContextService.Nothing>()
				{
					@Override
					public List<AutocompleteSuggestionData> execute()
					{
						return Converters.convertAll(getAutocompleteService().getAutocompleteSuggestions(input),
								getAutocompleteSuggestionConverter());
					}
				});
	}

	/**
	 * @return the autocompleteSuggestionConverter
	 */
	public Converter<AutocompleteSuggestion, AutocompleteSuggestionData> getAutocompleteSuggestionConverter()
	{
		return autocompleteSuggestionConverter;
	}

	/**
	 * @param autocompleteSuggestionConverter
	 *           the autocompleteSuggestionConverter to set
	 */
	public void setAutocompleteSuggestionConverter(
			final Converter<AutocompleteSuggestion, AutocompleteSuggestionData> autocompleteSuggestionConverter)
	{
		this.autocompleteSuggestionConverter = autocompleteSuggestionConverter;
	}

	/**
	 * @return the autocompleteService
	 */
	public CitySearchAutocompleteService<AutocompleteSuggestion> getAutocompleteService()
	{
		return autocompleteService;
	}

	/**
	 * @param autocompleteService
	 *           the autocompleteService to set
	 */
	public void setAutocompleteService(final CitySearchAutocompleteService<AutocompleteSuggestion> autocompleteService)
	{
		this.autocompleteService = autocompleteService;
	}

	/**
	 * @return the threadContextService
	 */
	public ThreadContextService getThreadContextService()
	{
		return threadContextService;
	}

	/**
	 * @param threadContextService
	 *           the threadContextService to set
	 */
	public void setThreadContextService(final ThreadContextService threadContextService)
	{
		this.threadContextService = threadContextService;
	}

}
