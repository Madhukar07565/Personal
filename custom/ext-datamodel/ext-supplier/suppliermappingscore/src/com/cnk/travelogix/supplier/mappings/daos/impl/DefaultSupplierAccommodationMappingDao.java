/**
 *
 */
package com.cnk.travelogix.supplier.mappings.daos.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.mappings.daos.SupplierAccommodationMappingDao;
import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingErrorCodes;
import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingException;
import com.cnk.travelogix.supplier.mappings.product.model.SupplierAccommodationMappingModel;


/**
 * The Class DefaultSupplierAccommodationMappingDao.
 *
 * @author admin
 */
public class DefaultSupplierAccommodationMappingDao extends AbstractItemDao implements SupplierAccommodationMappingDao
{

	/** The logger. */
	private final Logger LOGGER = Logger.getLogger(DefaultSupplierAccommodationMappingDao.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.supplier.mappings.daos.SupplierAccommodationMappingDao#getSupplierAccommodationMapping(com.cnk.
	 * travelogix.supplier.mappings.product.model.SupplierAccommodationMappingModel)
	 */
	@Override
	public SupplierAccommodationMappingModel getSupplierAccommodationMapping(
			final SupplierAccommodationMappingModel pSupplierAccommodationMappingModel) throws SupplierMappingException
	{
		try
		{
			LOGGER.debug("Entering DefaultSupplierAccommodationMappingDao : getSupplierAccommodationMapping().");

			final StringBuilder query = new StringBuilder();
			query.append("select {pk} from {").append(SupplierAccommodationMappingModel._TYPECODE).append("} where {")
					.append(SupplierAccommodationMappingModel.CODE).append(" } = '")
					.append(pSupplierAccommodationMappingModel.getCode()).append("'");

			LOGGER.debug(
					"DefaultSupplierAccommodationMappingDao : getSupplierAccommodationMapping() : Firing query " + query.toString());

			final SearchResult<SupplierAccommodationMappingModel> result = search(new FlexibleSearchQuery(query.toString()));

			if (result == null || (result.getResult() == null || result.getResult().isEmpty()))
			{
				throw new SupplierMappingException(SupplierMappingErrorCodes.ERR_EMPTY_RESULT_SET);
			}
			else if (result.getResult().size() > 1)
			{
				throw new SupplierMappingException(SupplierMappingErrorCodes.ERR_DUPLICATE_RECORD_FOUND);
			}

			LOGGER.debug("DefaultSupplierAccommodationMappingDao : getSupplierAccommodationMapping() : Results found : "
					+ result.getResult());

			return result.getResult().isEmpty() ? null : result.getResult().get(0);
		}
		catch (final SupplierMappingException e)
		{
			throw e;
		}
		catch (final Exception e)
		{
			throw new SupplierMappingException(SupplierMappingErrorCodes.ERR_RUNTIME, e);
		}
		finally
		{
			LOGGER.debug("DefaultSupplierAccommodationMappingDao : getSupplierAccommodationMapping() : Exiting.");
		}
	}
}
