package com.cnk.travelogix.operations.facades.impl;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.operation.enums.ServiceOrderType;
import com.cnk.travelogix.operation.serviceorder.model.ServiceOrderModel;
import com.cnk.travelogix.operations.data.EnumerationDto;
import com.cnk.travelogix.operations.data.ServiceOrderData;
import com.cnk.travelogix.operations.data.ServiceOrderSearchParameterData;
import com.cnk.travelogix.operations.facades.ServiceOrderFacade;
import com.cnk.travelogix.operations.services.ServiceOrderService;


/**
 *
 * Facade Layer Class for Service Order functionality
 */
public class DefaultServiceOrderFacade implements ServiceOrderFacade
{
	private Converter<ServiceOrderModel, ServiceOrderData> serviceOrderConverter;

	private ServiceOrderService serviceOrderService;

	private EnumerationService enumerationService;

	@Override
	public SearchPageData<ServiceOrderData> searchServiceOrders(final ServiceOrderSearchParameterData searchData,
			final PageableData pageableData)
	{
		final SearchPageData<ServiceOrderModel> models = serviceOrderService.searchServiceOrders(searchData, pageableData);
		return convertPageData(models, getServiceOrderConverter());
	}

	protected <S, T> SearchPageData<T> convertPageData(final SearchPageData<S> source, final Converter<S, T> converter)
	{
		final SearchPageData<T> result = new SearchPageData<>();
		result.setPagination(source.getPagination());
		result.setSorts(source.getSorts());
		result.setResults(Converters.convertAll(source.getResults(), converter));
		return result;
	}

	@Override
	public List<EnumerationDto> getServiceOrderTypes()
	{
		//TODO Refactor following code to use populator converter
		final List<EnumerationDto> dtos = new ArrayList<>();
		final List<ServiceOrderType> enumTypes = enumerationService.getEnumerationValues(ServiceOrderType._TYPECODE);
		for (final ServiceOrderType enumType : enumTypes)
		{
			final EnumerationDto dto = new EnumerationDto();
			dto.setCode(enumType.getCode());
			dto.setName(enumerationService.getEnumerationName(enumType));
			dtos.add(dto);
		}
		return dtos;
	}

	/**
	 * @return the serviceOrderService
	 */
	public ServiceOrderService getServiceOrderService()
	{
		return serviceOrderService;
	}

	/**
	 * @param serviceOrderService
	 *           the serviceOrderService to set
	 */
	public void setServiceOrderService(final ServiceOrderService serviceOrderService)
	{
		this.serviceOrderService = serviceOrderService;
	}

	/**
	 * @return the serviceOrderConverter
	 */
	public Converter<ServiceOrderModel, ServiceOrderData> getServiceOrderConverter()
	{
		return serviceOrderConverter;
	}

	/**
	 * @param serviceOrderConverter
	 *           the serviceOrderConverter to set
	 */
	public void setServiceOrderConverter(final Converter<ServiceOrderModel, ServiceOrderData> serviceOrderConverter)
	{
		this.serviceOrderConverter = serviceOrderConverter;
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
