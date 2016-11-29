package com.cnk.travelogix.supplier.mappings.interceptor;

/**
 *
 */

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.mappings.city.model.SupplierCityMappingModel;
import com.cnk.travelogix.supplier.mappings.services.SupplierMappingService;


/**
 * The Class SupplierCityMappingValidateInterceptor.
 */
public class SupplierCityMappingValidateInterceptor implements ValidateInterceptor<SupplierCityMappingModel>

{

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(SupplierCityMappingValidateInterceptor.class);

	/** The supplier City mapping service. */
	private SupplierMappingService<SupplierCityMappingModel> supplierMappingService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.ValidateInterceptor#onValidate(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onValidate(final SupplierCityMappingModel pSupplierCityMappingModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		LOGGER.debug("SupplierCityMappingValidateInterceptor : onValidate() : Entering.");

		if (ctx.isNew(pSupplierCityMappingModel))
		{
			validateExistence(pSupplierCityMappingModel);
		}
		LOGGER.debug("SupplierCityMappingValidateInterceptor : onValidate() : Exiting.");
	}

	/**
	 * Validate existence.
	 *
	 * @param pSupplierCityMappingModel
	 *           the supplier city mapping model
	 * @throws InterceptorException
	 *            the interceptor exception
	 */
	private void validateExistence(final SupplierCityMappingModel pSupplierCityMappingModel) throws InterceptorException
	{
		LOGGER.debug("SupplierCityMappingValidateInterceptor : validateExistence() : Entering.");

		if (getSupplierMappingService().isExists(pSupplierCityMappingModel))
		{
			throw new InterceptorException(Localization.getLocalizedString("error.suppliercitymapping.exists"));
		}
		else
		{
			LOGGER.debug("SupplierCityMappingValidateInterceptor : validateExistence() : Record does not exists. VALIDATION PASS");
		}
		LOGGER.debug("SupplierCityMappingValidateInterceptor : validateExistence() : Exiting.");
	}

	/**
	 * Gets the supplier mapping service.
	 *
	 * @return the supplierMappingService
	 */
	public SupplierMappingService<SupplierCityMappingModel> getSupplierMappingService()
	{
		return supplierMappingService;
	}

	/**
	 * Sets the supplier mapping service.
	 *
	 * @param supplierMappingService
	 *           the supplierMappingService to set
	 */
	public void setSupplierMappingService(final SupplierMappingService<SupplierCityMappingModel> supplierMappingService)
	{
		this.supplierMappingService = supplierMappingService;
	}


}
