/**
 *
 */
package com.cnk.travelogix.operation.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.datamodel.operation.clientreconfirmationconfig.model.ClientReconfirmationConfigModel;


/**
 * This PrepareInterceptor generate the unique code for Client reconfirmaion config model based on configured number
 * generator series
 *
 * @author C5244543
 *
 */
public class ClientReconfirmationConfigPrepareInterceptor implements PrepareInterceptor<ClientReconfirmationConfigModel>
{
	private KeyGenerator keyGenerator;


	@Override
	public void onPrepare(final ClientReconfirmationConfigModel model, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(model))
		{
			model.setCode("CRC" + (String) this.keyGenerator.generate());
		}
	}

	@Required
	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}
}
