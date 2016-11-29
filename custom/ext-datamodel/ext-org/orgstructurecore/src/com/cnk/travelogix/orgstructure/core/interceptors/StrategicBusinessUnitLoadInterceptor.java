/**
 *
 */
package com.cnk.travelogix.orgstructure.core.interceptors;

import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;

import java.util.Collections;

import com.cnk.travelogix.orgstructure.core.model.StrategicBusinessUnitModel;


/**
 *
 */
public class StrategicBusinessUnitLoadInterceptor implements LoadInterceptor<StrategicBusinessUnitModel>
{

	@Override
	public void onLoad(final StrategicBusinessUnitModel strategicBusinessUnit, final InterceptorContext context)
			throws InterceptorException
	{
		strategicBusinessUnit.setGroups(Collections.singleton((PrincipalGroupModel) strategicBusinessUnit.getCompany()));
	}

}
