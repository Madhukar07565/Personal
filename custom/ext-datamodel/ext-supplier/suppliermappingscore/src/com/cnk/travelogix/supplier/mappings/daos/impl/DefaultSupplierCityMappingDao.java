/**
 *
 */
package com.cnk.travelogix.supplier.mappings.daos.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.mappings.city.model.SupplierCityMappingModel;
import com.cnk.travelogix.supplier.mappings.daos.SupplierCityMappingDao;
import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingErrorCodes;
import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingException;


/**
 * The Class DefaultSupplierCityMappingDao.
 */
public class DefaultSupplierCityMappingDao extends AbstractItemDao implements SupplierCityMappingDao
{

	/** The logger. */
	private final Logger LOGGER = Logger.getLogger(DefaultSupplierCityMappingDao.class);

	@Override
	public SupplierCityMappingModel getSupplierCityMapping(final SupplierCityMappingModel pSupplierCityMappingModel)
			throws SupplierMappingException
	{
		try
		{
			LOGGER.debug("DefaultSupplierCityMappingDao : getSupplierCityMapping() : Entering.");

			final StringBuilder query = new StringBuilder();
			query.append("select {pk} from {").append(SupplierCityMappingModel._TYPECODE).append("} where {")
					.append(SupplierCityMappingModel.CODE).append(" } = '").append(pSupplierCityMappingModel.getCode()).append("'");

			LOGGER.debug("DefaultSupplierCityMappingDao : getSupplierCityMapping() : Firing query " + query.toString());

			final SearchResult<SupplierCityMappingModel> result = search(new FlexibleSearchQuery(query.toString()));

			if (result == null || (result.getResult() == null || result.getResult().isEmpty()))
			{
				throw new SupplierMappingException(SupplierMappingErrorCodes.ERR_EMPTY_RESULT_SET);
			}
			else if (result.getResult().size() > 1)
			{
				throw new SupplierMappingException(SupplierMappingErrorCodes.ERR_DUPLICATE_RECORD_FOUND);
			}

			LOGGER.debug("DefaultSupplierCityMappingDao : getSupplierCityMapping() : Results found : " + result.getResult());

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
			LOGGER.debug("DefaultSupplierCityMappingDao : getSupplierCityMapping() : Exiting.");
		}
	}
}
