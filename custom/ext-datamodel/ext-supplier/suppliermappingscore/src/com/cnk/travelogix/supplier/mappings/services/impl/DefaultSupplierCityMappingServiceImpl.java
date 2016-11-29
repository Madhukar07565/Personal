package com.cnk.travelogix.supplier.mappings.services.impl;

import org.apache.commons.validator.GenericValidator;
import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.mappings.city.model.SupplierCityMappingModel;
import com.cnk.travelogix.supplier.mappings.daos.SupplierCityMappingDao;
import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingErrorCodes;
import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingException;
import com.cnk.travelogix.supplier.mappings.services.SupplierCityMappingService;


// TODO: Auto-generated Javadoc
/**
 * The Class DefaultSupplierCityMappingServiceImpl.
 */
public class DefaultSupplierCityMappingServiceImpl implements SupplierCityMappingService
{

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(DefaultSupplierCityMappingServiceImpl.class);

	/** The supplier City mapping dao. */
	private SupplierCityMappingDao supplierCityMappingDao;


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.supplier.mappings.services.SupplierCityMappingService#getSupplierCityMapping(com.cnk.travelogix
	 * .supplier.mappings.city.model.SupplierCityMappingModel)
	 */
	@Override
	public SupplierCityMappingModel getModel(final SupplierCityMappingModel pSupplierCityMappingModel)
			throws SupplierMappingException
	{
		LOGGER.debug("Entering DefaultSupplierCityMappingServiceImpl : getSupplierCityMapping().");

		try
		{
			return supplierCityMappingDao.getSupplierCityMapping(pSupplierCityMappingModel);
		}
		finally
		{
			LOGGER.debug("DefaultSupplierCityMappingServiceImpl : getModel() : Exiting.");
		}
	}

	/**
	 * Gets the supplier city mapping dao.
	 *
	 * @return the supplierCityMappingDao
	 */
	public SupplierCityMappingDao getSupplierCityMappingDao()
	{
		return supplierCityMappingDao;
	}

	/**
	 * Sets the supplier city mapping dao.
	 *
	 * @param supplierCityMappingDao
	 *           the supplierCityMappingDao to set
	 */
	public void setSupplierCityMappingDao(final SupplierCityMappingDao supplierCityMappingDao)
	{
		this.supplierCityMappingDao = supplierCityMappingDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.supplier.mappings.services.SupplierCityMappingService#isExists(com.cnk.travelogix.supplier.
	 * mappings.city.model.SupplierCityMappingModel)
	 */
	@Override
	public boolean isExists(final SupplierCityMappingModel pSupplierCityMappingModel)
	{
		LOGGER.debug("Entering DefaultSupplierCityMappingServiceImpl : isExists().");

		try
		{
			if (this.getModel(pSupplierCityMappingModel) != null)
			{
				LOGGER.debug("DefaultSupplierCityMappingServiceImpl : isExists() : Record with CODE : "
						+ pSupplierCityMappingModel.getCode() + " exists.");
				return true;
			}
		}
		catch (final SupplierMappingException e)
		{
			LOGGER.error("DefaultSupplierCityMappingServiceImpl : isExists : ERROR : " + e);
		}

		LOGGER.debug("DefaultSupplierCityMappingServiceImpl : isExists() : Exiting.");
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.supplier.mappings.services.SupplierMappingService#generateUniqueId(java.lang.Object)
	 */
	@Override
	public void generateAndAssignUniqueId(final SupplierCityMappingModel pSupplierCityMappingModel) throws SupplierMappingException
	{

		try
		{
			LOGGER.debug("DefaultSupplierCityMappingServiceImpl : generateAndAssignUniqueId() : Entering.");

			final StringBuilder mapId = new StringBuilder();

			if (pSupplierCityMappingModel.getSupplierCity() != null)
			{
				// COMMON SUPPLIER ID
				final String lCommonSupplierId = (pSupplierCityMappingModel.getSupplierCity().getSupplier() != null
						&& !GenericValidator.isBlankOrNull(pSupplierCityMappingModel.getSupplierCity().getSupplier().getCode()))
								? pSupplierCityMappingModel.getSupplierCity().getSupplier().getCode().trim() : "";
				mapId.append(lCommonSupplierId);

				// SUPPLIER CITY CODE
				final String lSupplierCityCode = (!GenericValidator
						.isBlankOrNull(pSupplierCityMappingModel.getSupplierCity().getCode()))
								? pSupplierCityMappingModel.getSupplierCity().getCode().trim() : "";
				mapId.append(lSupplierCityCode);

				// SUPPLIER CITY
				final String lSupplierCity = (!GenericValidator.isBlankOrNull(pSupplierCityMappingModel.getSupplierCity().getName()))
						? pSupplierCityMappingModel.getSupplierCity().getName().trim() : "";
				mapId.append(lSupplierCity);
			}
			else
			{
				throw new SupplierMappingException("ERROR in generating MAP ID. Supplier City found null.",
						SupplierMappingErrorCodes.ERR_MANDATORY_RECORD_FOUND_NULL);
			}

			if (pSupplierCityMappingModel.getCity() != null)
			{
				// TRAVEL ERP CITY
				final String lCityCode = !GenericValidator.isBlankOrNull(pSupplierCityMappingModel.getCity().getIsocode())
						? pSupplierCityMappingModel.getCity().getIsocode().trim() : "";
				mapId.append(lCityCode);
			}
			else
			{
				throw new SupplierMappingException("ERROR in generating MAP ID. City found null.",
						SupplierMappingErrorCodes.ERR_MANDATORY_RECORD_FOUND_NULL);
			}

			pSupplierCityMappingModel.setCode(mapId.toString());

			LOGGER.debug("DefaultSupplierCityMappingServiceImpl : generateAndAssignUniqueId() : Unique Code generated : "
					+ pSupplierCityMappingModel.getCode());
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
}