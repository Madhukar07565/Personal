/**
 *
 */
package com.cnk.travelogix.masterdata.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import com.cnk.travelogix.masterdata.core.staff.model.StaffInformationModel;


/**
 * Interceptor to generate uid for Staff
 *
 */
public class StaffInformationPrepareInterceptor implements PrepareInterceptor<StaffInformationModel>
{
	private KeyGenerator keyGenerator;

	@Override
	public void onPrepare(final StaffInformationModel staffInformationModel, final InterceptorContext context)
			throws InterceptorException
	{
		if (context.isNew(staffInformationModel))
		{
			staffInformationModel.setUid((String) keyGenerator.generate());
		}
	}

	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}

}
