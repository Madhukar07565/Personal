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
package com.cnk.travelogix.operation.reconfirmation.dao.impl;

import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.commerceservices.search.flexiblesearch.PagedFlexibleSearchService;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.search.restriction.SearchRestrictionService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.client.config.enums.CutOffDaysAndHours;
import com.cnk.travelogix.datamodel.operation.clientreconfirmationconfig.model.ClientReconfirmationConfigModel;
import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;
import com.cnk.travelogix.datamodel.operation.reconfirmationtraveldestination.model.ReconfirmationTravelDestinationModel;
import com.cnk.travelogix.datamodel.operation.supplierreconfirmationconfig.model.SupplierReconfirmationConfigModel;
import com.cnk.travelogix.masterdata.core.enums.ReconfirmationCutOffType;
import com.cnk.travelogix.operation.daos.ClientDao;
import com.cnk.travelogix.operation.daos.SupplierDao;
import com.cnk.travelogix.operation.reconfirmation.dao.TravelogixReconfirmationConfigDao;
import com.cnk.travelogix.operations.data.ClientReconfirmationConfigData;
import com.cnk.travelogix.operations.data.ReconfirmationSearchParameterData;
import com.cnk.travelogix.operations.data.ReconfirmationTravelDestinationData;
import com.cnk.travelogix.operations.data.SupplierReconfirmationConfigData;


/**
 *
 */
public class TravelogixReconfirmationConfigDaoImpl implements TravelogixReconfirmationConfigDao
{
	private static final Logger LOG = Logger.getLogger(TravelogixReconfirmationConfigDaoImpl.class);
	private static final String QUERY_RECONFIRMATION_SEARCH_BASE = "SELECT DISTINCT {rc:pk} FROM {ReconfirmationConfig as rc JOIN Product as p ON {rc:product}={p:PK} JOIN Category as cat ON {rc:productCategory}={cat:PK} JOIN ProductCategorySubType as subcat ON {rc:productCategorySubType}={subcat:PK} LEFT OUTER JOIN SupplierReconfirmationConfig as src ON {src:reconfirmationconfig}={rc:pk} LEFT OUTER JOIN ClientReconfirmationConfig as crc ON {crc:reconfirmationconfig} ={rc:pk} LEFT OUTER JOIN ReconfirmationTravelDestination as rtd ON {rtd:reconfirmationconfig} ={rc:pk} JOIN CatalogVersion AS catalogVersion ON {rc:catalogVersion}={catalogVersion:pk} JOIN Catalog AS catalog ON {catalog:pk}={catalogVersion:catalog}} WHERE {rc:code} IS NOT NULL ";
	private static final String CATALOG_ID = "EZ-IN";
	private static final String CATALOG_VERSION_NAME = "Online";
	@Resource(name = "pagedFlexibleSearchService")
	private PagedFlexibleSearchService pagedFlexibleSearchService;

	@Resource(name = "flexibleSearchService")
	private FlexibleSearchService flexibleSearchService;

	@Resource(name = "searchRestrictionService")
	private SearchRestrictionService searchRestrictionService;

	@Resource(name = "supplierDao")
	private SupplierDao supplierDao;

	@Resource(name = "clientDao")
	private ClientDao clientDao;

	@Override
	public ReconfirmationConfigModel getReconfirmationConfigForCode(final String code)
	{
		ReconfirmationConfigModel reconfirmationConfigModel = null;
		try
		{
			final StringBuilder sql = new StringBuilder(QUERY_RECONFIRMATION_SEARCH_BASE);
			sql.append(" AND {rc:code}=?code");
			sql.append(" AND {catalog.");
			sql.append(CatalogModel.ID);
			sql.append("}=?id ");
			//	query.append("AND {catalogVersion.");
			//	query.append(CatalogVersionModel.VERSION);
			//	query.append("}=?cv ");

			final FlexibleSearchQuery recofirmationQuery = new FlexibleSearchQuery(sql.toString());
			recofirmationQuery.addQueryParameter("code", code);
			recofirmationQuery.addQueryParameter("id", CATALOG_ID);
			//	recofirmationQuery.addQueryParameter("cv", CATALOG_VERSION_NAME);
			searchRestrictionService.disableSearchRestrictions();
			final List<ReconfirmationConfigModel> reconfirmationConfigModels = flexibleSearchService
					.<ReconfirmationConfigModel> search(recofirmationQuery).getResult();
			if (null != reconfirmationConfigModels && !reconfirmationConfigModels.isEmpty())
			{
				reconfirmationConfigModel = reconfirmationConfigModels.get(0);
			}
		}
		catch (final Exception e)
		{
			LOG.error("Flexible Search Exception while getting  reconfirmation Config Record based on code [" + code + "] ", e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return reconfirmationConfigModel;
	}

	@Override
	public List<ReconfirmationConfigModel> allReconfirmationRecords()
	{
		try
		{
			final FlexibleSearchQuery recofirmationQuery = new FlexibleSearchQuery(QUERY_RECONFIRMATION_SEARCH_BASE);
			searchRestrictionService.disableSearchRestrictions();
			final List<ReconfirmationConfigModel> reconfirmationConfigModels = flexibleSearchService
					.<ReconfirmationConfigModel> search(recofirmationQuery).getResult();
			if (null != reconfirmationConfigModels && !reconfirmationConfigModels.isEmpty())
			{
				return reconfirmationConfigModels;
			}
		}
		catch (final Exception e)
		{
			LOG.error("Flexible Search Exception while getting  all reconfirmation Config Records", e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return Collections.emptyList();
	}

	@Override
	public SearchPageData<ReconfirmationConfigModel> getAllReconfirmationConfigs(final ReconfirmationSearchParameterData seachData,
			final PageableData pageableData)
	{

		SearchPageData<ReconfirmationConfigModel> result = null;
		final StringBuilder query = new StringBuilder(QUERY_RECONFIRMATION_SEARCH_BASE);
		final Map queryParams = new HashMap();
		query.append(" AND {catalog.");
		query.append(CatalogModel.ID);
		query.append("}=?id ");
		//	query.append("AND {catalogVersion.");
		//	query.append(CatalogVersionModel.VERSION);
		//	query.append("}=?cv ");
		queryParams.put("id", CATALOG_ID);
		//		queryParams.put("cv", CATALOG_VERSION_NAME);

		if (null != seachData.getProductCategorySubTypeCode())
		{
			query.append("AND {subcat:code}=?productCategorySubType ");
			queryParams.put("productCategorySubType", seachData.getProductCategorySubTypeCode());
		}
		if (null != seachData.getProductCategoryCode())
		{
			query.append("AND {cat:code}=?productCategory ");
			queryParams.put("productCategory", seachData.getProductCategoryCode());
		}
		if (null != seachData.getProductCode())
		{
			query.append("AND {p:code}=?product ");
			queryParams.put("product", seachData.getProductCode());
		}

		//If Configuration For Client
		if (null != seachData.getConfigurationFor() && ("client".equalsIgnoreCase(seachData.getConfigurationFor())))
		{
			if (null != seachData.getClientCode())
			{
				query.append("AND {crc:client}=?clientUid ");
				queryParams.put("clientUid", clientDao.findClientByCode(seachData.getClientCode()));
			}
			else
			{
				if (null != seachData.getClientSubCategory())
				{
					query.append("AND {crc:client}=?clientCategory ");
					queryParams.put("clientCategory", clientDao
							.findClientsForClientCategories(seachData.getClientCategory(), seachData.getClientSubCategory()).get(0));
				}
			}
			query.append(" AND {crc:code} IS NOT NULL ");
		}
		else
		{
			if (null != seachData.getSupplierCode())
			{
				query.append("AND {src:supplier}=?supplier ");
				queryParams.put("supplier", supplierDao.findSupplierByCode(seachData.getSupplierCode()));
			}
			query.append(" AND {src:code} IS NOT NULL ");
		}
		query.append(" ORDER BY {rc.code} ASC ");
		try
		{
			searchRestrictionService.disableSearchRestrictions();
			result = pagedFlexibleSearchService.search(query.toString(), queryParams, pageableData);
		}
		catch (final Exception e)
		{
			LOG.error("Exception getting at the time of retrieve all reconfirmation record based on search parameter:", e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return result;
	}

	@Override
	public List<ReconfirmationConfigModel> getAllRecords(final ReconfirmationConfigModel configModel)
	{
		List<ReconfirmationConfigModel> result = null;
		final StringBuilder query = new StringBuilder(QUERY_RECONFIRMATION_SEARCH_BASE);
		final Map queryParams = new HashMap();
		query.append(" AND {catalog.");
		query.append(CatalogModel.ID);
		query.append("}=?id ");
		//	query.append("AND {catalogVersion.");
		//	query.append(CatalogVersionModel.VERSION);
		//	query.append("}=?cv ");
		queryParams.put("id", CATALOG_ID);
		//		queryParams.put("cv", CATALOG_VERSION_NAME);

		if (null != configModel.getProductCategorySubType())
		{
			query.append("AND {subcat:code}=?productCategorySubType ");
			queryParams.put("productCategorySubType", configModel.getProductCategorySubType().getCode());
		}
		if (null != configModel.getProductCategory())
		{
			query.append("AND {cat:code}=?productCategory ");
			queryParams.put("productCategory", configModel.getProductCategory().getCode());
		}
		if (null != configModel.getProduct())
		{
			query.append("AND {p:code}=?product ");
			queryParams.put("product", configModel.getProduct().getCode());
		}
		try
		{
			searchRestrictionService.disableSearchRestrictions();

			result = flexibleSearchService.search(query.toString(), queryParams).getResult();
		}
		catch (final Exception e)
		{
			LOG.error("Exception getting at the time of retrieve all reconfirmation record based on search parameter:", e);
		}
		finally
		{
			searchRestrictionService.enableSearchRestrictions();
		}
		return result;
	}

	@Override
	public List<ClientReconfirmationConfigModel> findClientConfigurations(final ClientReconfirmationConfigData configData)
	{
		final HashMap attr = new HashMap();
		final StringBuilder sql = new StringBuilder();
		sql.append("SELECT {crc:pk} FROM { ").append("ClientReconfirmationConfig").append(" as crc JOIN ")
				.append("TravelogixB2BUnit").append(" as client ON {crc:client}={client:pk} ").append("JOIN ReconfirmationInterval")
				.append(" as interval ON {crc:clientReconfirmationInterval}={interval:pk} } ")
				.append(" WHERE {crc:code} IS NOT NULL ");

		if (null != configData.getClient())
		{
			attr.put("client_uid", configData.getClient().getUid());
			sql.append(" AND {client:uid}=?client_uid");
			if (null != configData.getClientReconfirmationInterval())
			{
				attr.put("reconfirmationCutOff",
						ReconfirmationCutOffType.valueOf(configData.getClientReconfirmationInterval().getReconfirmationCutOff()));
				attr.put("cutoff", configData.getClientReconfirmationInterval().getCutoff());
				attr.put("cutOffDaysOrHours",
						CutOffDaysAndHours.valueOf(configData.getClientReconfirmationInterval().getCutOffDaysOrHours()));
				sql.append(" AND {interval:reconfirmationCutOff}=?reconfirmationCutOff").append(" AND {interval:cutoff}=?cutoff")
						.append(" AND {interval:cutOffDaysOrHours}=?cutOffDaysOrHours");
			}
		}
		final FlexibleSearchQuery query = new FlexibleSearchQuery(sql.toString());
		query.getQueryParameters().putAll(attr);
		final SearchResult result = this.flexibleSearchService.search(query);
		return result.getResult();
	}

	@Override
	public List<SupplierReconfirmationConfigModel> findSupplierConfigurations(final SupplierReconfirmationConfigData configData)
	{
		final HashMap attr = new HashMap();
		final StringBuilder sql = new StringBuilder();
		sql.append("SELECT {src:pk} FROM { ").append("SupplierReconfirmationConfig").append(" as src JOIN ").append("Supplier")
				.append(" as supplier ON {src:supplier}={supplier:pk} ").append("JOIN ReconfirmationInterval")
				.append(" as interval ON {src:supplierReconfirmationInterval}={interval:pk} } ")
				.append(" WHERE {src:code} IS NOT NULL ");

		if (null != configData.getSupplier())
		{
			attr.put("supplier_code", configData.getSupplier().getCode());
			sql.append(" AND {supplier:code}=?supplier_code");
			if (null != configData.getSupplierReconfirmationInterval())
			{
				attr.put("reconfirmationCutOff",
						ReconfirmationCutOffType.valueOf(configData.getSupplierReconfirmationInterval().getReconfirmationCutOff()));
				attr.put("cutoff", configData.getSupplierReconfirmationInterval().getCutoff());
				attr.put("cutOffDaysOrHours",
						CutOffDaysAndHours.valueOf(configData.getSupplierReconfirmationInterval().getCutOffDaysOrHours()));
				sql.append(" AND {interval:reconfirmationCutOff}=?reconfirmationCutOff").append(" AND {interval:cutoff}=?cutoff")
						.append(" AND {interval:cutOffDaysOrHours}=?cutOffDaysOrHours");
			}
		}
		final FlexibleSearchQuery query = new FlexibleSearchQuery(sql.toString());
		query.getQueryParameters().putAll(attr);
		final SearchResult result = this.flexibleSearchService.search(query);
		return result.getResult();
	}


	@Override
	public List<ReconfirmationTravelDestinationModel> findTravelDestinations(final ReconfirmationTravelDestinationData configData)
	{
		final HashMap attr = new HashMap();
		final StringBuilder sql = new StringBuilder();
		sql.append("SELECT {rtd:pk} FROM { ").append("ReconfirmationTravelDestination as rtd")
				.append(" JOIN Continent as continent ON {rtd:continent}={continent:pk}")
				.append(" JOIN Country as country ON {rtd:country}={country:pk}")
				.append(" JOIN City as city ON {rtd:city}={city:pk} }");
		attr.put("continent_isocode", configData.getContinent().getIsocode());
		attr.put("country_isocode", configData.getCountry().getIsocode());
		attr.put("city_isocode", configData.getCity().getCityIsoCode());
		attr.put("inclusion", configData.getInclusion());
		sql.append(" WHERE {country:isocode}=?continent_isocode").append(" AND {continent:isocode}=?country_isocode")
				.append(" AND {city:isocode}=?city_isocode");

		final FlexibleSearchQuery query = new FlexibleSearchQuery(sql.toString());
		query.getQueryParameters().putAll(attr);
		final SearchResult result = this.flexibleSearchService.search(query);
		return result.getResult();
	}

	/**
	 * @param pagedFlexibleSearchService
	 *           the pagedFlexibleSearchService to set
	 */
	public void setPagedFlexibleSearchService(final PagedFlexibleSearchService pagedFlexibleSearchService)
	{
		this.pagedFlexibleSearchService = pagedFlexibleSearchService;
	}

	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}
}
