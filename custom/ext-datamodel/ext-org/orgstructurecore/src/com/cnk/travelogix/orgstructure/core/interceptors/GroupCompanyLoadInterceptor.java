/**
 *
 */
package com.cnk.travelogix.orgstructure.core.interceptors;

import de.hybris.platform.core.model.security.PrincipalGroupModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;

import java.util.Collections;

import com.cnk.travelogix.orgstructure.core.model.GroupCompanyModel;


/**
 *
 */
public class GroupCompanyLoadInterceptor implements LoadInterceptor<GroupCompanyModel>
{

	@Override
	public void onLoad(final GroupCompanyModel groupComapany, final InterceptorContext context) throws InterceptorException
	{
		groupComapany.setGroups(Collections.singleton((PrincipalGroupModel) groupComapany.getGroupOfCompanies()));
	}
}
