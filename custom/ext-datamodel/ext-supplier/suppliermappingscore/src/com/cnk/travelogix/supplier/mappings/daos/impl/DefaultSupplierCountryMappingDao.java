/**
 *
 */
package com.cnk.travelogix.supplier.mappings.daos.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.mappings.country.model.SupplierCountryMappingModel;
import com.cnk.travelogix.supplier.mappings.daos.SupplierCountryMappingDao;
import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingErrorCodes;
import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingException;


/**
 * The Class DefaultSupplierCountryMappingDao.
 *
 * @author admin
 */
public class DefaultSupplierCountryMappingDao extends AbstractItemDao implements SupplierCountryMappingDao
{

	/** The logger. */
	private final Logger LOGGER = Logger.getLogger(DefaultSupplierCountryMappingDao.class);

	/**
	 * Gets the supplier country mapping.
	 *
	 * @param pSupplierCountryMappingModel
	 *           the supplier country mapping model
	 * @return the supplier country mapping
	 */
	@Override
	public SupplierCountryMappingModel getSupplierCountryMapping(final SupplierCountryMappingModel pSupplierCountryMappingModel)
			throws SupplierMappingException
	{
		try
		{
			LOGGER.debug("Entering DefaultSupplierCountryMappingDao : getSupplierCountryMapping().");

			final StringBuilder query = new StringBuilder();
			query.append("select {pk} from {").append(SupplierCountryMappingModel._TYPECODE).append("} where {")
					.append(SupplierCountryMappingModel.CODE).append(" } = '").append(pSupplierCountryMappingModel.getCode())
					.append("'");

			LOGGER.debug("DefaultSupplierCountryMappingDao : getSupplierCountryMapping() : Firing query " + query.toString());

			final SearchResult<SupplierCountryMappingModel> result = search(new FlexibleSearchQuery(query.toString()));

			if (result == null || (result.getResult() == null || result.getResult().isEmpty()))
			{
				throw new SupplierMappingException(SupplierMappingErrorCodes.ERR_EMPTY_RESULT_SET);
			}
			else if (result.getResult().size() > 1)
			{
				throw new SupplierMappingException(SupplierMappingErrorCodes.ERR_DUPLICATE_RECORD_FOUND);
			}

			LOGGER.debug("DefaultSupplierCountryMappingDao : getSupplierCountryMapping() : Results found : " + result.getResult());

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
			LOGGER.debug("DefaultSupplierCountryMappingDao : getSupplierCountryMapping() : Exiting.");
		}
	}
}
