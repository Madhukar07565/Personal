package com.cnk.travelogix.supplier.mappings.services.impl;

import org.apache.commons.validator.GenericValidator;
import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.mappings.country.model.SupplierCountryMappingModel;
import com.cnk.travelogix.supplier.mappings.daos.SupplierCountryMappingDao;
import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingErrorCodes;
import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingException;
import com.cnk.travelogix.supplier.mappings.services.SupplierCountryMappingService;


public class DefaultSupplierCountryMappingServiceImpl implements SupplierCountryMappingService
{

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(DefaultSupplierCountryMappingServiceImpl.class);

	/** The supplier country mapping dao. */
	private SupplierCountryMappingDao supplierCountryMappingDao;


	/**
	 * Gets the supplier country mapping.
	 *
	 * @param pSupplierCountryMappingModel
	 *           the supplier country mapping model
	 * @return the supplier country mapping
	 */
	@Override
	public SupplierCountryMappingModel getModel(final SupplierCountryMappingModel pSupplierCountryMappingModel)
			throws SupplierMappingException
	{
		try
		{
			LOGGER.debug("DefaultSupplierCountryMappingServiceImpl : getSupplierCountryMapping() : Entering.");

			return supplierCountryMappingDao.getSupplierCountryMapping(pSupplierCountryMappingModel);
		}
		finally
		{
			LOGGER.debug("DefaultSupplierCountryMappingServiceImpl : getModel() : Exiting.");
		}
	}

	@Override
	public boolean isExists(final SupplierCountryMappingModel pSupplierCountryMappingModel)
	{
		try
		{
			LOGGER.debug("Entering DefaultSupplierCountryMappingServiceImpl : isExists().");

			if (this.getModel(pSupplierCountryMappingModel) != null)
			{
				LOGGER.debug("DefaultSupplierCountryMappingServiceImpl : isExists() : Record with CODE : "
						+ pSupplierCountryMappingModel.getCode() + " exists.");

				return true;
			}
		}
		catch (final SupplierMappingException e)
		{
			LOGGER.error("DefaultSupplierCountryMappingServiceImpl : isExists : ERROR : " + e);
		}

		LOGGER.debug("DefaultSupplierCountryMappingServiceImpl : isExists() : Exiting.");
		return false;
	}

	/**
	 * Gets the supplier country mapping dao.
	 *
	 * @return the supplier country mapping dao
	 */
	public SupplierCountryMappingDao getSupplierCountryMappingDao()
	{
		return supplierCountryMappingDao;
	}

	/**
	 * @param supplierCountryMappingDao
	 *           the supplierCountryMappingDao to set
	 */
	public void setSupplierCountryMappingDao(final SupplierCountryMappingDao supplierCountryMappingDao)
	{
		this.supplierCountryMappingDao = supplierCountryMappingDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.supplier.mappings.services.SupplierMappingService#generateAndAssignUniqueId(java.lang.Object)
	 */
	@Override
	public void generateAndAssignUniqueId(final SupplierCountryMappingModel pSupplierCountryMappingModel)
			throws SupplierMappingException
	{
		LOGGER.debug("DefaultSupplierCountryMappingServiceImpl : generateAndAssignUniqueId() : Entering.");

		try
		{
			final StringBuilder mapId = new StringBuilder();

			if (pSupplierCountryMappingModel.getSupplierCountry() != null)
			{
				// COMMON SUPPLIER ID
				final String lCommonSupplierId = (pSupplierCountryMappingModel.getSupplierCountry().getSupplier() != null
						&& !GenericValidator.isBlankOrNull(pSupplierCountryMappingModel.getSupplierCountry().getSupplier().getCode()))
								? pSupplierCountryMappingModel.getSupplierCountry().getSupplier().getCode().trim() : "";
				mapId.append(lCommonSupplierId);

				// SUPPLIER COUNTRY CODE
				final String lSupplierCountryCode = (!GenericValidator
						.isBlankOrNull(pSupplierCountryMappingModel.getSupplierCountry().getCode()))
								? pSupplierCountryMappingModel.getSupplierCountry().getCode().trim() : "";
				mapId.append(lSupplierCountryCode);

				// SUPPLIER COUNTRY
				final String lSupplierCountry = (!GenericValidator
						.isBlankOrNull(pSupplierCountryMappingModel.getSupplierCountry().getName()))
								? pSupplierCountryMappingModel.getSupplierCountry().getName().trim() : "";
				mapId.append(lSupplierCountry);
			}
			else
			{
				throw new SupplierMappingException("ERROR in generating MAP ID. SupplierCountry found null.",
						SupplierMappingErrorCodes.ERR_MANDATORY_RECORD_FOUND_NULL);
			}

			if (pSupplierCountryMappingModel.getCountry() != null)
			{

				// TRAVEL ERP COUNTRY CODE
				final String lCountryCode = !GenericValidator.isBlankOrNull(pSupplierCountryMappingModel.getCountry().getIsocode())
						? pSupplierCountryMappingModel.getCountry().getIsocode().trim() : "";
				mapId.append(lCountryCode);
			}
			else
			{
				throw new SupplierMappingException("ERROR in generating MAP ID. Country found null.",
						SupplierMappingErrorCodes.ERR_MANDATORY_RECORD_FOUND_NULL);
			}

			pSupplierCountryMappingModel.setCode(mapId.toString());

			LOGGER.debug("DefaultSupplierCountryMappingServiceImpl : generateAndAssignUniqueId() : Generated Map Id : "
					+ pSupplierCountryMappingModel.getCode());

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
			LOGGER.debug("DefaultSupplierCountryMappingServiceImpl : generateAndAssignUniqueId() : Exiting.");
		}
	}
}