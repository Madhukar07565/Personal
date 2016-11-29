/**
 *
 */
package com.cnk.travelogix.supplier.mappings.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import com.cnk.travelogix.supplier.mappings.city.model.SupplierCityMappingModel;
import com.cnk.travelogix.supplier.mappings.services.SupplierMappingService;


// TODO: Auto-generated Javadoc
/**
 * The Class SupplierCityMappingPrepareInterceptor.
 */
public class SupplierCityMappingPrepareInterceptor implements PrepareInterceptor<SupplierCityMappingModel>
{

	/** The logger. */
	private final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(SupplierCityMappingPrepareInterceptor.class);

	/** The supplier mapping service. */
	private SupplierMappingService<SupplierCityMappingModel> supplierMappingService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final SupplierCityMappingModel pSupplierCityMappingModel, final InterceptorContext pInterceptorCtx)
			throws InterceptorException
	{
		LOGGER.debug("Entering SupplierCityMappingPrepareInterceptor : onPrepare().");

		try
		{
			if (pSupplierCityMappingModel != null && pInterceptorCtx.isNew(pSupplierCityMappingModel))
			{
				getSupplierMappingService().generateAndAssignUniqueId(pSupplierCityMappingModel);
				LOGGER.debug("SupplierCityMappingPrepareInterceptor : onPrepare() : Map ID : " + pSupplierCityMappingModel.getCode());
			}
		}
		catch (final Exception e)
		{
			LOGGER.error("ERROR : " + e);
			throw new InterceptorException(e.getMessage(), e);
		}

		LOGGER.debug("SupplierCityMappingPrepareInterceptor : onPrepare() : Exiting.");
	}

	/**
	 * @return the supplierMappingService
	 */
	public SupplierMappingService<SupplierCityMappingModel> getSupplierMappingService()
	{
		return supplierMappingService;
	}

	/**
	 * @param supplierMappingService
	 *           the supplierMappingService to set
	 */
	public void setSupplierMappingService(final SupplierMappingService<SupplierCityMappingModel> supplierMappingService)
	{
		this.supplierMappingService = supplierMappingService;
	}
}
