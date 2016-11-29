package com.cnk.travelogix.operations.facades;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;

import java.util.List;

import com.cnk.travelogix.operations.data.EnumerationDto;
import com.cnk.travelogix.operations.data.ServiceOrderData;
import com.cnk.travelogix.operations.data.ServiceOrderSearchParameterData;


/**
 *
 * Facade Layer Interface for Service Order functionality
 */
public interface ServiceOrderFacade
{
	SearchPageData<ServiceOrderData> searchServiceOrders(ServiceOrderSearchParameterData searchData, PageableData pageableData);

	List<EnumerationDto> getServiceOrderTypes();

}
