package com.cnk.travelogix.orgstructure.core.interceptors;

import de.hybris.platform.catalog.model.CompanyModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;


/**
 * Interceptor to generate uid for company
 *
 */
public class CompanyPrepareInterceptor implements PrepareInterceptor<CompanyModel>
{
	private KeyGenerator keyGenerator;

	@Override
	public void onPrepare(final CompanyModel companyModel, final InterceptorContext context) throws InterceptorException
	{
		if (context.isNew(companyModel))
		{
			String companyId = companyModel.getGroupCompany().getUid();
			companyId = companyId.substring(0, 3);
			companyModel.setUid(companyId.concat((String) keyGenerator.generate()));
		}
	}

	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}

}
