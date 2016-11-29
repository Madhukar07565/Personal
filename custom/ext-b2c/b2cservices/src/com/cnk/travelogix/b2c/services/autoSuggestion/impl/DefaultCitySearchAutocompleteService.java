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
package com.cnk.travelogix.b2c.services.autoSuggestion.impl;

import de.hybris.platform.commerceservices.search.solrfacetsearch.data.AutocompleteSuggestion;
import de.hybris.platform.commerceservices.search.solrfacetsearch.strategies.SolrFacetSearchConfigSelectionStrategy;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.solrfacetsearch.config.FacetSearchConfig;
import de.hybris.platform.solrfacetsearch.config.FacetSearchConfigService;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedType;
import de.hybris.platform.solrfacetsearch.config.exceptions.FacetConfigServiceException;
import de.hybris.platform.solrfacetsearch.indexer.SolrIndexedTypeCodeResolver;
import de.hybris.platform.solrfacetsearch.indexer.exceptions.IndexerException;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.solrfacetsearch.model.config.SolrIndexedTypeModel;
import de.hybris.platform.solrfacetsearch.suggester.SolrAutoSuggestService;
import de.hybris.platform.solrfacetsearch.suggester.SolrSuggestion;
import de.hybris.platform.solrfacetsearch.suggester.exceptions.SolrAutoSuggestException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.b2c.services.autoSuggestion.CitySearchAutocompleteService;


/**
 *
 */
public class DefaultCitySearchAutocompleteService implements CitySearchAutocompleteService<AutocompleteSuggestion>
{

	private FacetSearchConfigService facetSearchConfigService;
	private CommonI18NService commonI18NService;
	private SolrAutoSuggestService solrAutoSuggestService;
	private SolrIndexedTypeCodeResolver solrIndexedTypeCodeResolver;
	private SolrFacetSearchConfigSelectionStrategy solrFacetSearchConfigSelectionStrategy;
	@Resource(name = "modelService")
	private ModelService modelService;
	@Resource(name = "flexibleSearchService")
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<AutocompleteSuggestion> getAutocompleteSuggestions(final String input)
	{
		List<AutocompleteSuggestion> result = new ArrayList<>();
		try
		{
			//			final SolrFacetSearchConfigModel solrFacetSearchConfigModel = getSolrFacetSearchConfigSelectionStrategy()
			//					.getCurrentSolrFacetSearchConfig();
			final SolrFacetSearchConfigModel solrFacetSearchConfigModel = getTargetSolrFacetSearchConfigModel("ezgb2cCityIndex");
			final FacetSearchConfig facetSearchConfig = getFacetSearchConfigService().getConfiguration(
					solrFacetSearchConfigModel.getName());
			final IndexedType indexedType = getIndexedType(facetSearchConfig);

			final SolrIndexedTypeModel indexedTypeModel = findIndexedTypeModel(solrFacetSearchConfigModel, indexedType);

			final SolrSuggestion suggestions = getSolrAutoSuggestService().getAutoSuggestionsForQuery(
					getCommonI18NService().getCurrentLanguage(), indexedTypeModel, input);


			result = findBestSuggestions(suggestions, input);
		}
		catch (final SolrAutoSuggestException | FacetConfigServiceException | IndexerException e)
		{
			//TODO
		}

		return result;
	}


	private SolrFacetSearchConfigModel getTargetSolrFacetSearchConfigModel(final String solrConfigName)
	{
		final String querySolrFacetSearchConfig = "SELECT {" + SolrFacetSearchConfigModel.PK + "} FROM {"
				+ SolrFacetSearchConfigModel._TYPECODE + "} WHERE {" + SolrFacetSearchConfigModel.NAME + "}=?solrConfigName";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(querySolrFacetSearchConfig);
		query.addQueryParameter("solrConfigName", solrConfigName);
		final SearchResult<SolrFacetSearchConfigModel> searchResult = flexibleSearchService.search(query);
		if (CollectionUtils.isNotEmpty(searchResult.getResult()))
		{
			return searchResult.getResult().get(0);
		}
		return null;
	}

	protected IndexedType getIndexedType(final FacetSearchConfig config)
	{
		final IndexConfig indexConfig = config.getIndexConfig();

		// Strategy for working out which of the available indexed types to use
		final Collection<IndexedType> indexedTypes = indexConfig.getIndexedTypes().values();
		if (indexedTypes != null && !indexedTypes.isEmpty())
		{
			return indexedTypes.iterator().next();
		}

		// No indexed types
		return null;
	}

	protected SolrIndexedTypeModel findIndexedTypeModel(final SolrFacetSearchConfigModel facetSearchConfigModel,
			final IndexedType indexedType) throws IndexerException
	{
		if (indexedType == null)
		{
			throw new IndexerException("indexedType is NULL!");
		}
		for (final SolrIndexedTypeModel type : facetSearchConfigModel.getSolrIndexedTypes())
		{
			if (solrIndexedTypeCodeResolver.resolveIndexedTypeCode(type).equals(indexedType.getUniqueIndexedTypeCode()))
			{
				return type;
			}
		}
		throw new IndexerException("Could not find matching model for type: " + indexedType.getCode());
	}

	protected List<AutocompleteSuggestion> findBestSuggestions(final SolrSuggestion solrSuggestion, final String input)
	{
		final String trimmedInput = input.trim();

		final String lastTerm;
		final String precedingTerms;

		// Only provide suggestions for the last 'word' in the input
		final int indexOfLastSpace = trimmedInput.lastIndexOf(' ');
		if (indexOfLastSpace >= 0)
		{
			lastTerm = trimmedInput.substring(indexOfLastSpace + 1);
			precedingTerms = trimmedInput.substring(0, indexOfLastSpace).trim();
		}
		else
		{
			lastTerm = trimmedInput;
			precedingTerms = null;
		}

		final List<AutocompleteSuggestion> result = new ArrayList<>();

		// Get the suggestions for the last term
		final Collection<String> suggestions = solrSuggestion.getSuggestions().get(lastTerm.toLowerCase());
		if (suggestions != null)
		{
			for (final String suggestion : suggestions)
			{
				final String fullSuggestion = precedingTerms == null ? suggestion : precedingTerms + " " + suggestion;

				final AutocompleteSuggestion autocompleteSuggestion = createAutocompleteSuggestion();
				autocompleteSuggestion.setTerm(fullSuggestion);
				result.add(autocompleteSuggestion);
			}
		}

		return result;
	}

	protected AutocompleteSuggestion createAutocompleteSuggestion()
	{
		return new AutocompleteSuggestion();
	}

	/**
	 * @return the facetSearchConfigService
	 */
	public FacetSearchConfigService getFacetSearchConfigService()
	{
		return facetSearchConfigService;
	}

	/**
	 * @param facetSearchConfigService
	 *           the facetSearchConfigService to set
	 */
	public void setFacetSearchConfigService(final FacetSearchConfigService facetSearchConfigService)
	{
		this.facetSearchConfigService = facetSearchConfigService;
	}

	/**
	 * @return the commonI18NService
	 */
	public CommonI18NService getCommonI18NService()
	{
		return commonI18NService;
	}

	/**
	 * @param commonI18NService
	 *           the commonI18NService to set
	 */
	public void setCommonI18NService(final CommonI18NService commonI18NService)
	{
		this.commonI18NService = commonI18NService;
	}

	/**
	 * @return the solrAutoSuggestService
	 */
	public SolrAutoSuggestService getSolrAutoSuggestService()
	{
		return solrAutoSuggestService;
	}

	/**
	 * @param solrAutoSuggestService
	 *           the solrAutoSuggestService to set
	 */
	public void setSolrAutoSuggestService(final SolrAutoSuggestService solrAutoSuggestService)
	{
		this.solrAutoSuggestService = solrAutoSuggestService;
	}

	/**
	 * @return the solrIndexedTypeCodeResolver
	 */
	public SolrIndexedTypeCodeResolver getSolrIndexedTypeCodeResolver()
	{
		return solrIndexedTypeCodeResolver;
	}

	/**
	 * @param solrIndexedTypeCodeResolver
	 *           the solrIndexedTypeCodeResolver to set
	 */
	public void setSolrIndexedTypeCodeResolver(final SolrIndexedTypeCodeResolver solrIndexedTypeCodeResolver)
	{
		this.solrIndexedTypeCodeResolver = solrIndexedTypeCodeResolver;
	}

	/**
	 * @return the solrFacetSearchConfigSelectionStrategy
	 */
	public SolrFacetSearchConfigSelectionStrategy getSolrFacetSearchConfigSelectionStrategy()
	{
		return solrFacetSearchConfigSelectionStrategy;
	}

	/**
	 * @param solrFacetSearchConfigSelectionStrategy
	 *           the solrFacetSearchConfigSelectionStrategy to set
	 */
	public void setSolrFacetSearchConfigSelectionStrategy(
			final SolrFacetSearchConfigSelectionStrategy solrFacetSearchConfigSelectionStrategy)
	{
		this.solrFacetSearchConfigSelectionStrategy = solrFacetSearchConfigSelectionStrategy;
	}

}
