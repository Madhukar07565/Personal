/**
 *
 */
package com.cnk.travelogix.operation.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.datamodel.operation.supplierreconfirmationconfig.model.SupplierReconfirmationConfigModel;


/**
 * This PrepareInterceptor generate the unique code for Supplier reconfirmaion config model based on configured number
 * generator series
 *
 * @author C5244543
 *
 */
public class SupplierReconfirmationConfigPrepareInterceptor implements PrepareInterceptor<SupplierReconfirmationConfigModel>
{
	private KeyGenerator keyGenerator;


	@Override
	public void onPrepare(final SupplierReconfirmationConfigModel model, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(model))
		{
			model.setCode("SRC" + (String) this.keyGenerator.generate());
		}
	}

	@Required
	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}
}
