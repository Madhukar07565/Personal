/**
 *
 */
package com.cnk.travelogix.orgstructure.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import com.cnk.travelogix.orgstructure.core.model.MarketModel;


/**
 * Interceptor to generate uid for market
 *
 */
public class MarketPrepareInterceptor implements PrepareInterceptor<MarketModel>
{
	private KeyGenerator keyGenerator;

	@Override
	public void onPrepare(final MarketModel marketModel, final InterceptorContext context) throws InterceptorException
	{
		if (context.isNew(marketModel))
		{
			marketModel.setUid((String) keyGenerator.generate());
		}
	}

	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}
}
