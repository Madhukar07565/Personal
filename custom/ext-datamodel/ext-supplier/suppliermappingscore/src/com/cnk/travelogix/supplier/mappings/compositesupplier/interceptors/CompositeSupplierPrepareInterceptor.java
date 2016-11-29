/**
 *
 */
package com.cnk.travelogix.supplier.mappings.compositesupplier.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.mappings.compositesupplier.model.CompositeSupplierModel;


/**
 * CompositeSupplierPrepareInterceptor
 * <h4>Generate unique key i.e Composite mapping id for CompositeSupplier</h4>
 */
public class CompositeSupplierPrepareInterceptor implements PrepareInterceptor<CompositeSupplierModel>
{

	private static final Logger LOG = Logger.getLogger(CompositeSupplierPrepareInterceptor.class.getName());

	private KeyGenerator compositMappingIdGenerator;

	/**
	 * Generate unique compositMappingId for Composite supplier
	 *
	 */
	@Override
	public void onPrepare(final CompositeSupplierModel compositeSupplier, final InterceptorContext context)
			throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside onPrepare() of CompositeSupplierPrepareInterceptor");
		}

		if (compositeSupplier.getCode() == null)
		{
			compositeSupplier.setCode(compositMappingIdGenerator.generate().toString());
		}

		LOG.info("End onPrepare() of CompositeSupplierPrepareInterceptor");
	}

	public void setCompositMappingIdGenerator(final KeyGenerator compositMappingIdGenerator)
	{
		this.compositMappingIdGenerator = compositMappingIdGenerator;
	}

}
