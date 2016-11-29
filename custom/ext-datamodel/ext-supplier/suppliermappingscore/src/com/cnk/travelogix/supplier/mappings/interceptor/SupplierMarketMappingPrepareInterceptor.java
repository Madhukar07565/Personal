package com.cnk.travelogix.supplier.mappings.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import com.cnk.travelogix.supplier.mappings.market.model.MarketMappingModel;


public class SupplierMarketMappingPrepareInterceptor implements PrepareInterceptor<MarketMappingModel>
{
	private KeyGenerator keyGenerator;

	@Override
	public void onPrepare(final MarketMappingModel marketMappingModel, final InterceptorContext ctx) throws InterceptorException
	{
		marketMappingModel.setCode((String) keyGenerator.generate());
	}

	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}

	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}
}