package com.cnk.travelogix.crm.converter;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;

import de.hybris.platform.search.restriction.SearchRestrictionService;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

public class AbstractCRMConverter {
	
	@Resource(name = "flexibleSearchService")
	FlexibleSearchService flexibleSearchService;

	@Resource(name = "searchRestrictionService")
	private SearchRestrictionService searchRestrictionService;
	
	Logger LOG = Logger.getLogger(AbstractCRMConverter.class);
	
	public CityModel getCity(final String cityIso)
	{
		List<CityModel> resList = null;
		CityModel city = null;
		try
		{
			searchRestrictionService.disableSearchRestrictions();
			final String query = "select {cit.pk} from {city as cit} where {cit.isocode} =?cityIso";
			final FlexibleSearchQuery flexiQuery = new FlexibleSearchQuery(query);
			flexiQuery.addQueryParameter("cityIso", cityIso);
			final SearchResult<CityModel> searchResult = flexibleSearchService.search(flexiQuery);
			resList = searchResult.getResult();

			if (!resList.isEmpty())
			{
				city = resList.get(0);
			}
			if (resList.size() > 1)
			{
				throw new AmbiguousIdentifierException("Found " + resList.size() + " users with the unique uid '" + city + "'");
			}
		}
		catch (final Exception e)
		{
			LOG.info("Model Not foun" + e.getMessage(), e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return city;
	}
}
