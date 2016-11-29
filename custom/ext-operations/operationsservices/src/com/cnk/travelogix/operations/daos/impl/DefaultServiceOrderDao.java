package com.cnk.travelogix.operations.daos.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.operation.serviceorder.model.ServiceOrderModel;
import com.cnk.travelogix.operations.daos.ServiceOrderDao;
import com.cnk.travelogix.operations.data.ServiceOrderSearchParameterData;

import de.hybris.platform.commerceservices.search.flexiblesearch.PagedFlexibleSearchService;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.search.restriction.SearchRestrictionService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.user.UserService;


/**
 *
 * Dao Class for Service Order functionality
 */
public class DefaultServiceOrderDao implements ServiceOrderDao
{
	protected static final Logger LOG = Logger.getLogger(DefaultServiceOrderDao.class);

	private FlexibleSearchService flexibleSearchService;

	private PagedFlexibleSearchService pagedFlexibleSearchService;

	private EnumerationService enumerationService;

	@Resource(name = "searchRestrictionService")
	private SearchRestrictionService searchRestrictionService;

	@Resource
	private UserService userService;

	private final String QUERY_FIND_SERVICE_ORDER_BY_CODE = "SELECT {" + ServiceOrderModel.PK + "} FROM {"
			+ ServiceOrderModel._TYPECODE + "} WHERE {" + ServiceOrderModel.CODE + "} = ?code";

	private final String QUERY_SEARCH_BASE = "SELECT {SRO.pk} FROM {ServiceOrder AS SRO"
			+ " JOIN AbstractOrderEntry AS AOE ON {SRO:orderEntry} = {AOE:pk}"
			+ " JOIN OrderProductInfo as OPI ON {AOE:orderProductInfo} = {OPI:pk}"
			+ " JOIN Supplier AS SUP ON {OPI:supplier} = {SUP:pk}" + " JOIN ServiceOrderType AS SOT ON {SRO:type} = {SOT:pk}} ";

	@Override
	public SearchPageData<ServiceOrderModel> searchServiceOrders(final ServiceOrderSearchParameterData searchData,
			final PageableData pageableData)
	{
		final StringBuilder query = new StringBuilder(QUERY_SEARCH_BASE);
		final Map queryParams = new HashMap();
		boolean flag = false;

		if (StringUtils.isNotEmpty(searchData.getServiceOrderType()))
		{
			if (!flag)
			{
				query.append("WHERE {SOT.code} = ?typeCode ");
				flag = true;
			}
			else
			{
				query.append("AND {SOT.code} = ?typeCode ");
			}
			queryParams.put("typeCode", searchData.getServiceOrderType());
		}

		if (StringUtils.isNotEmpty(searchData.getServiceOrderId()))
		{
			if (!flag)
			{
				query.append("WHERE {code} = ?code ");
				flag = true;
			}
			else
			{
				query.append("AND {code} = ?code ");
			}
			queryParams.put("code", searchData.getServiceOrderId());
		}

		if (StringUtils.isNotEmpty(searchData.getSupplierName()))
		{
			if (!flag)
			{
				query.append("WHERE {SUP:name} = ?supplierName ");
				flag = true;
			}
			else
			{
				query.append("AND {SUP:name} = ?supplierName ");
			}
			queryParams.put("supplierName", searchData.getSupplierName());
		}

		if (StringUtils.isNotEmpty(searchData.getSupplierId()))
		{
			if (!flag)
			{
				query.append("WHERE {SUP:code} = ?supplierId ");
				flag = true;
			}
			else
			{
				query.append(" AND {SUP:code} = ?supplierId ");
			}
			queryParams.put("supplierId", searchData.getSupplierId());
		}
		SearchPageData<ServiceOrderModel> result = null;
		try
		{
			// TODO check and remove search restriction
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

		LOG.debug(query.toString());
		return result;
	}

	@Override
	public List<ServiceOrderModel> findServiceOrderByCode(final String code)
	{
		validateParameterNotNull(code, "Code must not be null");
		final Map<String, Object> queryParams = new HashMap<String, Object>();
		queryParams.put("code", code);
		final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(QUERY_FIND_SERVICE_ORDER_BY_CODE, queryParams);
		final SearchResult<ServiceOrderModel> result = flexibleSearchService.search(fQuery);
		return result.getResult();
	}

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

	/**
	 * @return the pagedFlexibleSearchService
	 */
	public PagedFlexibleSearchService getPagedFlexibleSearchService()
	{
		return pagedFlexibleSearchService;
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
	 * @return the enumerationService
	 */
	public EnumerationService getEnumerationService()
	{
		return enumerationService;
	}

	/**
	 * @param enumerationService
	 *           the enumerationService to set
	 */
	public void setEnumerationService(final EnumerationService enumerationService)
	{
		this.enumerationService = enumerationService;
	}
}
