package com.cnk.travelogix.supplier.mappings.interceptor;

/**
 *
 */

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.mappings.country.model.SupplierCountryMappingModel;
import com.cnk.travelogix.supplier.mappings.services.SupplierMappingService;


// TODO: Auto-generated Javadoc
/**
 * The Class SupplierCountryMappingValidateInterceptor.
 */
public class SupplierCountryMappingValidateInterceptor implements ValidateInterceptor<SupplierCountryMappingModel>

{

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(SupplierCountryMappingValidateInterceptor.class);

	/** The supplier mapping service. */
	private SupplierMappingService<SupplierCountryMappingModel> supplierMappingService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.ValidateInterceptor#onValidate(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onValidate(final SupplierCountryMappingModel pSupplierCountryMappingModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		LOGGER.debug("Entering SupplierCountryMappingValidateInterceptor : onValidate().");

		if (ctx.isNew(pSupplierCountryMappingModel))
		{
			validateExistence(pSupplierCountryMappingModel);
		}
		LOGGER.debug("SupplierCountryMappingValidateInterceptor : onValidate() : Exiting.");
	}

	/**
	 * Validate existence.
	 *
	 * @param pSupplierCountryMappingModel
	 *           the supplier country mapping model
	 * @throws InterceptorException
	 */
	private void validateExistence(final SupplierCountryMappingModel pSupplierCountryMappingModel) throws InterceptorException
	{
		if (getSupplierMappingService().isExists(pSupplierCountryMappingModel))
		{
			throw new InterceptorException(Localization.getLocalizedString("error.suppliercountrymapping.exists"));
		}
		else
		{
			LOGGER.debug(
					"SupplierCountryMappingValidateInterceptor : validateExistence() : Record does not exists. VALIDATION PASS");
		}

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
