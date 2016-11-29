/**
 *
 */
package com.cnk.travelogix.supplier.mappings.daos;

import com.cnk.travelogix.supplier.mappings.country.model.SupplierCountryMappingModel;
import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingException;


/**
 * @author admin
 *
 */
public interface SupplierCountryMappingDao
{

	/**
	 * Gets the supplier country mapping.
	 *
	 * @param pSupplierCountryMappingModel
	 *           the supplier country mapping model
	 * @return the supplier country mapping
	 * @throws SupplierMappingException
	 *            the supplier mapping exception
	 */
	public SupplierCountryMappingModel getSupplierCountryMapping(final SupplierCountryMappingModel pSupplierCountryMappingModel)
			throws SupplierMappingException;
}
