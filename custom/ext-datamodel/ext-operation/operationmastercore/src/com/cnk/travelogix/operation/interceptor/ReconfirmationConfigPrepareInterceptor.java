/**
 *
 */
package com.cnk.travelogix.operation.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.model.ReconfirmationConfigModel;


/**
 * This PrepareInterceptor generate the unique code for reconfirmaion config model based on configured number generator
 * series
 *
 * @author C5244543
 *
 */
public class ReconfirmationConfigPrepareInterceptor implements PrepareInterceptor<ReconfirmationConfigModel>
{
	private KeyGenerator keyGenerator;


	@Override
	public void onPrepare(final ReconfirmationConfigModel model, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(model))
		{
			model.setCode((String) this.keyGenerator.generate());
		}
	}

	@Required
	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}

}
