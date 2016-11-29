package com.cnk.travelogix.supplier.mappings.interceptor;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;

/**
 *
 */

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.mappings.market.model.MarketMappingModel;
import com.cnk.travelogix.supplier.mappings.services.MarketMappingService;


public class MarketMappingValidateInterceptor implements ValidateInterceptor<MarketMappingModel>

{
	private static final Logger LOG = Logger.getLogger(MarketMappingValidateInterceptor.class);
	private MarketMappingService marketMappingService;

	@Override
	public void onValidate(final MarketMappingModel marketModel, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(marketModel))
		{
			try
			{
				marketMappingService.getMappingDetails(marketModel.getSupplier(), marketModel.getClientType(),
						marketModel.getCompanyMarket(), marketModel.getSupplierMarket());
			}
			catch (final DuplicateUidException e)
			{
				LOG.error(e);
				throw new InterceptorException("Record with this combination(Company-Supplier Market) already exists");
			}
		}
	}

	public MarketMappingService getMarketMappingService()
	{
		return marketMappingService;
	}


	public void setMarketMappingService(final MarketMappingService marketMappingService)
	{
		this.marketMappingService = marketMappingService;
	}

}
