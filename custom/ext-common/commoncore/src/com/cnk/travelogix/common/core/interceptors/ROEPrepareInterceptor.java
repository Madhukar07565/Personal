/**
 *
 */
package com.cnk.travelogix.common.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import java.util.Date;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.core.supplier.model.TravelogixROEModel;



/**
 * @author I320212
 *
 */
public class ROEPrepareInterceptor implements PrepareInterceptor<TravelogixROEModel>
{
	private static final Logger LOG = Logger.getLogger(ROEPrepareInterceptor.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final TravelogixROEModel travelogixROEModel, final InterceptorContext arg1) throws InterceptorException
	{
		final String code = travelogixROEModel.getRoeType().toString().substring(0, 3).toUpperCase() + "_" + (new Date().getTime());
		if (LOG.isDebugEnabled())
		{
			LOG.debug("code in onPrepare of ROEPrepareInterceptor:" + code);
		}
		travelogixROEModel.setRoeTypeId(code);
		travelogixROEModel.setCode(code);
	}
}
