/**
 *
 */
package com.cnk.travelogix.supplier.mappings.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import com.cnk.travelogix.supplier.mappings.country.model.SupplierCountryMappingModel;
import com.cnk.travelogix.supplier.mappings.services.SupplierMappingService;


// TODO: Auto-generated Javadoc
/**
 * The Class SupplierCountryMappingPrepareInterceptor.
 */
public class SupplierCountryMappingPrepareInterceptor implements PrepareInterceptor<SupplierCountryMappingModel>
{

	/** The logger. */
	private final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(SupplierCountryMappingModel.class);

	/** The supplier mapping service. */
	private SupplierMappingService<SupplierCountryMappingModel> supplierMappingService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final SupplierCountryMappingModel pSupplierCountryMappingModel, final InterceptorContext pInterceptorCtx)
			throws InterceptorException
	{
		LOGGER.debug("Entering SupplierCountryMappingPrepareInterceptor : onPrepare().");
		try
		{
			if (pSupplierCountryMappingModel != null && pInterceptorCtx.isNew(pSupplierCountryMappingModel))
			{
				getSupplierMappingService().generateAndAssignUniqueId(pSupplierCountryMappingModel);
			}
		}
		catch (final Exception e)
		{
			LOGGER.error("ERROR : " + e);
			throw new InterceptorException(e.getMessage(), e);
		}
		LOGGER.debug("SupplierCountryMappingPrepareInterceptor : onPrepare() : Exiting.");
	}

	/**
	 * @return the supplierMappingService
	 */
	public SupplierMappingService<SupplierCountryMappingModel> getSupplierMappingService()
	{
		return supplierMappingService;
	}

	/**
	 * @param supplierMappingService
	 *           the supplierMappingService to set
	 */
	public void setSupplierMappingService(final SupplierMappingService<SupplierCountryMappingModel> supplierMappingService)
	{
		this.supplierMappingService = supplierMappingService;
	}
}
