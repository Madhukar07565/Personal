/**
 *
 */
package com.cnk.travelogix.orgstructure.core.interceptors;

import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;

import java.util.Collections;

import com.cnk.travelogix.orgstructure.core.model.MarketModel;


/**
 *
 */
public class MarketLoadInterceptor implements LoadInterceptor<MarketModel>
{

	@Override
	public void onLoad(final MarketModel market, final InterceptorContext context) throws InterceptorException
	{
		if (null != market.getBusinessUnit())
		{
			market.setGroups(Collections.singleton((PrincipalGroupModel) market.getBusinessUnit()));
			return;
		}
	}

}
