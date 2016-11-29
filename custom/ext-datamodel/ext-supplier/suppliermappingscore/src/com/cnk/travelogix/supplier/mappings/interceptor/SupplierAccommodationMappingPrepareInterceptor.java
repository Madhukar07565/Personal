/**
 *
 */
package com.cnk.travelogix.supplier.mappings.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import com.cnk.travelogix.supplier.mappings.product.model.SupplierAccommodationMappingModel;
import com.cnk.travelogix.supplier.mappings.services.SupplierMappingService;


/**
 * The Class SupplierAccommodationMappingPrepareInterceptor.
 *
 * @author admin
 */
public class SupplierAccommodationMappingPrepareInterceptor implements PrepareInterceptor<SupplierAccommodationMappingModel>
{

	/** The logger. */
	private final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger
			.getLogger(SupplierAccommodationMappingPrepareInterceptor.class);

	/** The supplier mapping service. */
	private SupplierMappingService<SupplierAccommodationMappingModel> supplierMappingService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final SupplierAccommodationMappingModel pSupplierAccommodationMappingModel,
			final InterceptorContext pInterceptorCtx) throws InterceptorException
	{
		LOGGER.debug("Entering SupplierAccommodationMappingPrepareInterceptor : onPrepare.");
		try
		{
			if (pSupplierAccommodationMappingModel != null && pInterceptorCtx.isNew(pSupplierAccommodationMappingModel))
			{
				getSupplierMappingService().generateAndAssignUniqueId(pSupplierAccommodationMappingModel);
			}
		}
		catch (final Exception e)
		{
			LOGGER.error("ERROR : " + e);
			throw new InterceptorException(e.getMessage(), e);
		}
		LOGGER.debug("SupplierAccommodationMappingPrepareInterceptor : onPrepare() : Exiting.");
	}

	/**
	 * Gets the supplier mapping service.
	 *
	 * @return the supplierMappingService
	 */
	public SupplierMappingService<SupplierAccommodationMappingModel> getSupplierMappingService()
	{
		return supplierMappingService;
	}

	/**
	 * Sets the supplier mapping service.
	 *
	 * @param supplierMappingService
	 *           the supplierMappingService to set
	 */
	public void setSupplierMappingService(final SupplierMappingService<SupplierAccommodationMappingModel> supplierMappingService)
	{
		this.supplierMappingService = supplierMappingService;
	}
}
