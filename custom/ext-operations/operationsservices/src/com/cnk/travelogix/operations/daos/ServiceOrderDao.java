package com.cnk.travelogix.operations.daos;

import java.util.List;

import com.cnk.travelogix.operation.serviceorder.model.ServiceOrderModel;
import com.cnk.travelogix.operations.data.ServiceOrderSearchParameterData;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;


/**
 *
 * Dao Layer Interface for Service Order functionality
 *
 */
public interface ServiceOrderDao
{
	List<ServiceOrderModel> findServiceOrderByCode(String code);

	SearchPageData<ServiceOrderModel> searchServiceOrders(ServiceOrderSearchParameterData seachData, PageableData pageableData);
}
