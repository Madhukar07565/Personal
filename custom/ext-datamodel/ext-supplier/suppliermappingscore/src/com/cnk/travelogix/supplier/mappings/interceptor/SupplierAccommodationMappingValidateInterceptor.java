package com.cnk.travelogix.supplier.mappings.interceptor;

/**
 *
 */

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.mappings.product.model.SupplierAccommodationMappingModel;
import com.cnk.travelogix.supplier.mappings.services.SupplierMappingService;


// TODO: Auto-generated Javadoc
/**
 * The Class SupplierAccommodationMappingValidateInterceptor.
 */
public class SupplierAccommodationMappingValidateInterceptor implements ValidateInterceptor<SupplierAccommodationMappingModel>

{

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(SupplierAccommodationMappingValidateInterceptor.class);

	/** The supplier mapping service. */
	private SupplierMappingService<SupplierAccommodationMappingModel> supplierMappingService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.ValidateInterceptor#onValidate(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onValidate(final SupplierAccommodationMappingModel pSupplierAccommodationMappingModel,
			final InterceptorContext ctx) throws InterceptorException
	{
		LOGGER.debug("Entering SupplierAccommodationMappingValidateInterceptor : onValidate().");

		if (pSupplierAccommodationMappingModel != null && ctx.isNew(pSupplierAccommodationMappingModel))
		{
			validateExistence(pSupplierAccommodationMappingModel);
		}
		LOGGER.debug("SupplierAccommodationMappingValidateInterceptor : onValidate() : Exiting.");
	}

	/**
	 * Validate existence.
	 *
	 * @param pSupplierAccommodationMappingModel
	 *           the supplier country mapping model
	 * @throws InterceptorException
	 */
	private void validateExistence(final SupplierAccommodationMappingModel pSupplierAccommodationMappingModel)
			throws InterceptorException
	{
		if (getSupplierMappingService().isExists(pSupplierAccommodationMappingModel))
		{
			throw new InterceptorException(Localization.getLocalizedString("error.supplieraccomapping.exists"));
		}
		else
		{
			LOGGER.debug(
					"SupplierAccommodationMappingValidateInterceptor : validateExistence() : Record does not exists. VALIDATION PASS");
		}

	}

	/**
	 * @return the supplierMappingService
	 */
	public SupplierMappingService<SupplierAccommodationMappingModel> getSupplierMappingService()
	{
		return supplierMappingService;
	}

	/**
	 * @param supplierMappingService
	 *           the supplierMappingService to set
	 */
	public void setSupplierMappingService(final SupplierMappingService<SupplierAccommodationMappingModel> supplierMappingService)
	{
		this.supplierMappingService = supplierMappingService;
	}

}
