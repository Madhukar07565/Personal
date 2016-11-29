package com.cnk.travelogix.supplier.mappings.services.impl;

import org.apache.commons.validator.GenericValidator;
import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.mappings.daos.SupplierAccommodationMappingDao;
import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingErrorCodes;
import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingException;
import com.cnk.travelogix.supplier.mappings.product.model.SupplierAccommodationMappingModel;
import com.cnk.travelogix.supplier.mappings.services.SupplierAccommodationMappingService;


public class DefaultSupplierAccommodationMappingServiceImpl implements SupplierAccommodationMappingService
{

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(DefaultSupplierAccommodationMappingServiceImpl.class);

	/** The supplier country mapping dao. */
	private SupplierAccommodationMappingDao supplierAccommodationMappingDao;


	/**
	 * Gets the supplier country mapping.
	 *
	 * @param pSupplierAccommodationMappingModel
	 *           the supplier country mapping model
	 * @return the supplier country mapping
	 */
	@Override
	public SupplierAccommodationMappingModel getModel(final SupplierAccommodationMappingModel pSupplierAccommodationMappingModel)
			throws SupplierMappingException
	{
		LOGGER.debug("DefaultSupplierAccommodationMappingServiceImpl : getSupplierAccommodationMapping() : Entering.");

		try
		{
			return getSupplierAccommodationMappingDao().getSupplierAccommodationMapping(pSupplierAccommodationMappingModel);
		}
		finally
		{
			LOGGER.debug("DefaultSupplierAccommodationMappingServiceImpl : getSupplierAccommodationMapping() : Exiting.");
		}
	}

	@Override
	public boolean isExists(final SupplierAccommodationMappingModel pSupplierAccommodationMappingModel)
	{
		LOGGER.debug("Entering DefaultSupplierAccommodationMappingServiceImpl : isExists().");

		try
		{
			if (this.getModel(pSupplierAccommodationMappingModel) != null)
			{
				LOGGER.debug("DefaultSupplierAccommodationMappingServiceImpl : isExists() : Record with CODE : "
						+ pSupplierAccommodationMappingModel.getCode() + " exists.");

				return true;
			}
		}
		catch (final SupplierMappingException e)
		{
			LOGGER.error("DefaultSupplierAccommodationMappingServiceImpl : isExists : ERROR : " + e);
		}

		LOGGER.debug("DefaultSupplierAccommodationMappingServiceImpl : isExists() : Exiting.");
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.supplier.mappings.services.SupplierMappingService#generateAndAssignUniqueId(java.lang.Object)
	 */
	@Override
	public void generateAndAssignUniqueId(final SupplierAccommodationMappingModel pSupplierAccommodationMappingModel)
			throws SupplierMappingException
	{
		try
		{
			LOGGER.debug("DefaultSupplierAccommodationMappingServiceImpl : generateAndAssignUniqueId() : Entering.");

			final StringBuilder mapId = new StringBuilder();

			if (pSupplierAccommodationMappingModel.getSupplierProduct() != null
					&& pSupplierAccommodationMappingModel.getSupplierProduct().getSupplier() != null)
			{
				// COMMON SUPPLIER ID
				final String lCommonSupplierId = !GenericValidator
						.isBlankOrNull(pSupplierAccommodationMappingModel.getSupplierProduct().getSupplier().getCode())
								? pSupplierAccommodationMappingModel.getSupplierProduct().getSupplier().getCode().trim() : "";
				mapId.append(lCommonSupplierId);

				// COMPANY SUPPLIER ID
				final String lCompanySupplierId = !GenericValidator
						.isBlankOrNull(pSupplierAccommodationMappingModel.getSupplierProduct().getSupplier().getCompanySupplierId())
								? pSupplierAccommodationMappingModel.getSupplierProduct().getSupplier().getCompanySupplierId().trim()
								: "";
				mapId.append(lCompanySupplierId);

				// SUPPLIERPRODUCT ID
				final String lSupplierProductId = !GenericValidator
						.isBlankOrNull(pSupplierAccommodationMappingModel.getSupplierProduct().getCode())
								? pSupplierAccommodationMappingModel.getSupplierProduct().getCode().trim() : "";
				mapId.append(lSupplierProductId);

				LOGGER.debug("DefaultSupplierAccommodationMappingServiceImpl : generateAndAssignUniqueId()  : Common Supplier Id : "
						+ pSupplierAccommodationMappingModel.getSupplierProduct().getSupplier().getCode());

				LOGGER.debug("DefaultSupplierAccommodationMappingServiceImpl : generateAndAssignUniqueId()  : Company Supplier Id : "
						+ pSupplierAccommodationMappingModel.getSupplierProduct().getSupplier().getCompanySupplierId());

				LOGGER.debug("DefaultSupplierAccommodationMappingServiceImpl : generateAndAssignUniqueId()  : SupplierProduct Id : "
						+ pSupplierAccommodationMappingModel.getSupplierProduct().getCode());
			}
			else
			{
				throw new SupplierMappingException("ERROR in generating MAP ID. SupplierProduct OR Supplier found null.",
						SupplierMappingErrorCodes.ERR_MANDATORY_RECORD_FOUND_NULL);
			}


			if (pSupplierAccommodationMappingModel.getAccommodation() != null)
			{
				// COMMON PRODUCT ID
				final String lCommonProductId = !GenericValidator
						.isBlankOrNull(pSupplierAccommodationMappingModel.getAccommodation().getCommonProductID())
								? pSupplierAccommodationMappingModel.getAccommodation().getCommonProductID().trim() : "";
				mapId.append(lCommonProductId);

				// COMPANY PRODUCT ID
				final String lCompanyProductId = !GenericValidator
						.isBlankOrNull(pSupplierAccommodationMappingModel.getAccommodation().getCode())
								? pSupplierAccommodationMappingModel.getAccommodation().getCode().trim() : "";
				mapId.append(lCompanyProductId);

				LOGGER.debug("DefaultSupplierAccommodationMappingServiceImpl : generateAndAssignUniqueId()  : Common Product Id : "
						+ pSupplierAccommodationMappingModel.getAccommodation().getCommonProductID());

				LOGGER.debug("DefaultSupplierAccommodationMappingServiceImpl : generateAndAssignUniqueId()  : Company Product Id : "
						+ pSupplierAccommodationMappingModel.getAccommodation().getCode());
			}
			else
			{
				throw new SupplierMappingException("ERROR in generating MAP ID. Product: Accommodation found null.",
						SupplierMappingErrorCodes.ERR_MANDATORY_RECORD_FOUND_NULL);
			}

			pSupplierAccommodationMappingModel.setCode(mapId.toString());

			LOGGER.debug("DefaultSupplierAccommodationMappingServiceImpl : generateAndAssignUniqueId()  : Map Id - "
					+ pSupplierAccommodationMappingModel.getCode());
		}
		catch (final SupplierMappingException e)
		{
			throw e;
		}
		catch (final Exception e)
		{
			throw new SupplierMappingException("ERROR while generating unique map id.", SupplierMappingErrorCodes.ERR_RUNTIME, e);
		}
		finally
		{
			LOGGER.debug("DefaultSupplierAccommodationMappingServiceImpl : generateAndAssignUniqueId() : Exiting.");
		}
	}

	/**
	 * Gets the supplier country mapping dao.
	 *
	 * @return the supplier country mapping dao
	 */
	public SupplierAccommodationMappingDao getSupplierAccommodationMappingDao()
	{
		return supplierAccommodationMappingDao;
	}

	/**
	 * Sets the supplier accommodation mapping dao.
	 *
	 * @param pSupplierAccommodationMappingDao
	 *           the new supplier accommodation mapping dao
	 */
	public void setSupplierAccommodationMappingDao(final SupplierAccommodationMappingDao pSupplierAccommodationMappingDao)
	{
		this.supplierAccommodationMappingDao = pSupplierAccommodationMappingDao;
	}

}