/**
 *
 */
package com.cnk.travelogix.supplier.mappings.daos;

import com.cnk.travelogix.supplier.mappings.city.model.SupplierCityMappingModel;
import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingException;


/**
 * The Interface SupplierCityMappingDao.
 *
 * @author admin
 */
public interface SupplierCityMappingDao
{

	/**
	 * Gets the supplier city mapping.
	 *
	 * @param pSupplierCityMappingModel
	 *           the supplier city mapping model
	 * @return the supplier city mapping
	 * @throws SupplierMappingException
	 *            the supplier mapping exception
	 */
	public SupplierCityMappingModel getSupplierCityMapping(final SupplierCityMappingModel pSupplierCityMappingModel)
			throws SupplierMappingException;
}
