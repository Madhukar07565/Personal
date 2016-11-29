/**
 *
 */
package com.cnk.travelogix.operation.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import org.apache.log4j.Logger;

import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;
import com.cnk.travelogix.operations.services.strategy.ReconfirmationConfigDuplicateChackStrategy;


/**
 * @author C5244543
 *
 */
public class DuplicateValidateInterceptor implements ValidateInterceptor<ReconfirmationConfigModel>
{
	private static final Logger LOG = Logger.getLogger(DuplicateValidateInterceptor.class);

	private ReconfirmationConfigDuplicateChackStrategy reconfirmationConfigDuplicateChackStrategy;

	@Override
	public void onValidate(final ReconfirmationConfigModel configData, final InterceptorContext cxt) throws InterceptorException
	{
		boolean flag = false;
		if (LOG.isDebugEnabled())
		{
			LOG.debug("checking for Duplicate instence...!!!");
		}
		if (cxt.isNew(configData))
		{
			flag = reconfirmationConfigDuplicateChackStrategy.isReconfirmationRecordExist(configData);
			if (flag)
			{
				throw new InterceptorException(Localization.getLocalizedString("reconfirmationconfig.duplicate.error"));
			}
		}
	}

	/**
	 * @return the reconfirmationConfigDuplicateChackStrategy
	 */
	public ReconfirmationConfigDuplicateChackStrategy getReconfirmationConfigDuplicateChackStrategy()
	{
		return reconfirmationConfigDuplicateChackStrategy;
	}

	/**
	 * @param reconfirmationConfigDuplicateChackStrategy
	 *           the reconfirmationConfigDuplicateChackStrategy to set
	 */
	public void setReconfirmationConfigDuplicateChackStrategy(
			final ReconfirmationConfigDuplicateChackStrategy reconfirmationConfigDuplicateChackStrategy)
	{
		this.reconfirmationConfigDuplicateChackStrategy = reconfirmationConfigDuplicateChackStrategy;
	}
}
