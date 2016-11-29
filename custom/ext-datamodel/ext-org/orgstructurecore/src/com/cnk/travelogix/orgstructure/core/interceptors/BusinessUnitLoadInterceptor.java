/**
 *
 */
package com.cnk.travelogix.orgstructure.core.interceptors;

import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;

import java.util.Collections;

import com.cnk.travelogix.orgstructure.core.model.BusinessUnitModel;


/**
 *
 */
public class BusinessUnitLoadInterceptor implements LoadInterceptor<BusinessUnitModel>
{

	@Override
	public void onLoad(final BusinessUnitModel businessUnit, final InterceptorContext context) throws InterceptorException
	{
		businessUnit.setGroups(Collections.singleton((PrincipalGroupModel) businessUnit.getStrategicBusinessUnit()));
	}

}
