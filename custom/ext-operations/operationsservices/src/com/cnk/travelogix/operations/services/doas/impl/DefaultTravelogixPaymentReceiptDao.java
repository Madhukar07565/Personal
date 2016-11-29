package com.cnk.travelogix.operations.services.doas.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;
import com.cnk.travelogix.common.core.enums.ReceiptStatus;
import com.cnk.travelogix.common.core.enums.ReceiptType;
import com.cnk.travelogix.common.core.model.receipts.TravelogixPaymentReceiptModel;
import com.cnk.travelogix.operations.data.TravelogixPaymentReceiptData;
import com.cnk.travelogix.operations.services.daos.TravelogixPaymentReceiptDao;

import de.hybris.platform.commerceservices.search.flexiblesearch.PagedFlexibleSearchService;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.search.restriction.SearchRestrictionService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.user.UserService;


public class DefaultTravelogixPaymentReceiptDao implements TravelogixPaymentReceiptDao
{
	private static final Logger LOG = Logger.getLogger(DefaultTravelogixPaymentReceiptDao.class);

	private static final String BOOOKING_REFERENCE = "Booking_Reference_No";
	private static final String RECEIPT_NUMBER = "Receipt_No";
	private static final String COMMERCIAL_STATEMENT = "Commercial_Statement_ID";
	private static final String CODE = "code";

	private static final String FIND_RECEIPTS_QUERY = "SELECT {t:pk} FROM {TravelogixPaymentReceipt as t";
	private static final String FIND_CLIENT_QUERY = "SELECT {tu:pk} FROM {TravelogixB2BUnit as tu";

	@Resource
	private FlexibleSearchService flexibleSearchService;


	@Resource(name = "searchRestrictionService")
	private SearchRestrictionService searchRestrictionService;

	@Resource
	private UserService userService;

	@Resource(name = "pagedFlexibleSearchService")
	private PagedFlexibleSearchService pagedFlexibleSearchService;

	@Override
	public SearchPageData<TravelogixPaymentReceiptModel> findReceipts(final TravelogixPaymentReceiptData receiptData,
			final PageableData pageableData)
	{
		SearchPageData<TravelogixPaymentReceiptModel> searchResults = null;
		final Map<String, Object> params = new HashMap<String, Object>();
		StringBuilder queryString = null;

		if (null != receiptData.getReferenceId())
		{
			queryString = new StringBuilder(FIND_RECEIPTS_QUERY);
			findReceiptsByReference(receiptData, params, queryString);
		}
		else if (null != receiptData.getTravelogixClientDetailsData().getClientId()
				|| null != receiptData.getTravelogixClientDetailsData().getClientName())
		{
			queryString = new StringBuilder(FIND_CLIENT_QUERY);
			queryString.append(
					"} WHERE {tu:" + TravelogixB2BUnitModel.UID + "}=?uid OR " + "{tu:" + TravelogixB2BUnitModel.NAME + "}=?name");
			params.put("uid", receiptData.getTravelogixClientDetailsData().getClientId());
			params.put("name", receiptData.getTravelogixClientDetailsData().getClientName());
		}
		else
		{
			queryString = new StringBuilder(FIND_RECEIPTS_QUERY);
			findReceiptsByType(receiptData, params, queryString);
		}
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString.toString());
		query.getQueryParameters().putAll(params);
		try
		{
			searchResults = pagedFlexibleSearchService.search(query, pageableData);
		}
		catch (final Exception exception)
		{
			LOG.error("Exception on getting receipt record based on search parameter:", exception);
		}

		return searchResults;
	}

	public String findClientByNameOrId()
	{

		return null;
	}

	/**
	 * Find receipts by receipt type
	 */
	private void findReceiptsByType(final TravelogixPaymentReceiptData receiptData, final Map<String, Object> params,
			final StringBuilder queryString)
	{
		if ((receiptData.getReceiptType() != null)
				&& (receiptData.getReceiptType().toString()).equalsIgnoreCase(ReceiptType.BOOKING_RECEIPT.getCode()))
		{
			queryString.append("} WHERE {" + ReceiptType._TYPECODE + "} IN ({{SELECT {pk} FROM {" + ReceiptType._TYPECODE
					+ "} WHERE {code}=?code}})");
			queryString.append(" AND {t:" + TravelogixPaymentReceiptModel.STATUS + "} IN ({{SELECT {pk} FROM {"
					+ ReceiptStatus._TYPECODE + "} WHERE {code} !=?statusCode}})");
			params.put(CODE, receiptData.getReceiptType());
			params.put("statusCode", ReceiptStatus.REVERSED);
		}
		else if ((receiptData.getReceiptType() != null)
				&& !(receiptData.getReceiptType().toString()).equalsIgnoreCase(ReceiptType.BOOKING_RECEIPT.getCode()))
		{
			queryString.append("} WHERE {" + ReceiptType._TYPECODE + "} IN ({{SELECT {pk} FROM {" + ReceiptType._TYPECODE
					+ "} WHERE {code}=?code}})");
			params.put(CODE, receiptData.getReceiptType());
		}
	}

	/**
	 * Find receipts by reference ID
	 */
	private void findReceiptsByReference(final TravelogixPaymentReceiptData receiptData, final Map<String, Object> params,
			final StringBuilder queryString)
	{
		if (receiptData.getReferenceId().equalsIgnoreCase(BOOOKING_REFERENCE))
		{
			if (null != receiptData.getReceiptNumber())
			{
				findReceiptByOrderCode(receiptData.getReceiptNumber(), params, queryString);
			}
			else if (receiptData.getTravelogixClientDetailsData().getClientName() != null)
			{
				findReceiptsByOrderedClientName(receiptData.getTravelogixClientDetailsData().getClientName(), params, queryString);
			}
		}
		else if (receiptData.getReferenceId().equalsIgnoreCase(RECEIPT_NUMBER))
		{
			if (null != receiptData.getReceiptNumber())
			{
				queryString.append("} WHERE {t:code}=?code");
				params.put("code", receiptData.getReceiptNumber());
			}
			else if (receiptData.getTravelogixClientDetailsData().getClientName() != null)
			{
				findReceiptByClientName(receiptData.getTravelogixClientDetailsData().getClientName(), params, queryString);
			}
		}
		else if (receiptData.getReferenceId().equalsIgnoreCase(COMMERCIAL_STATEMENT))
		{
			// TO DO - The implementation for the commercial statement query to find receipts.
		}
	}

	/**
	 * The flexible query to find receipt by order code
	 */
	private void findReceiptByOrderCode(final Integer receiptNumber, final Map<String, Object> params,
			final StringBuilder queryString)
	{
		queryString.append(" JOIN " + OrderModel._TYPECODE + " AS o ON {o:" + OrderModel.PK);
		queryString.append("}={t:" + TravelogixPaymentReceiptModel.ORDER + "}} " + "WHERE {o:" + OrderModel.CODE + "}=?code");
		params.put(CODE, receiptNumber.toString());
	}

	/**
	 * The flexible query to find receipt by client name
	 */
	private void findReceiptByClientName(final String clientName, final Map<String, Object> params,
			final StringBuilder queryString)
	{
		queryString.append(" JOIN " + CustomerModel._TYPECODE + " AS c ON ");
		queryString.append("{c:" + CustomerModel.PK + "}={t:" + TravelogixPaymentReceiptModel.CLIENT + "}} ");
		queryString.append("WHERE {c:" + CustomerModel.UID + "}=?clientName");
		params.put("clientName", clientName);
	}

	/**
	 * The flexible query to find receipts in order by name
	 */
	private void findReceiptsByOrderedClientName(final String clientName, final Map<String, Object> params,
			final StringBuilder queryString)
	{
		queryString.append(" JOIN " + OrderModel._TYPECODE + " AS o ON ");
		queryString.append(
				"{o:" + OrderModel.PK + "}={t:" + TravelogixPaymentReceiptModel.ORDER + "} JOIN" + UserModel._TYPECODE + " AS u ON ");
		queryString.append("{u:" + UserModel.PK + "}={o:" + OrderModel.USER + "} }");
		queryString.append("WHERE {u:" + UserModel.UID + "}=?clientName");
		params.put("clientName", clientName);
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

	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}
}
