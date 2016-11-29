/**
 *
 */
package com.cnk.travelogix.orgstructure.core.interceptors;

import de.hybris.platform.catalog.model.CompanyModel;
import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;

import java.util.Collections;


/**
 *
 */
public class CompanyLoadInterceptor implements LoadInterceptor<CompanyModel>
{

	@Override
	public void onLoad(final CompanyModel company, final InterceptorContext context) throws InterceptorException
	{
		company.setGroups(Collections.singleton((PrincipalGroupModel) company.getGroupCompany()));
	}

}
