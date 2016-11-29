/**
 *
 */
package com.cnk.travelogix.supplier.mappings.daos;

import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingException;
import com.cnk.travelogix.supplier.mappings.product.model.SupplierAccommodationMappingModel;


/**
 * @author admin
 *
 */
public interface SupplierAccommodationMappingDao
{

	/**
	 * Gets the supplier country mapping.
	 *
	 * @param pSupplierAccommodationMappingModel
	 *           the supplier country mapping model
	 * @return the supplier country mapping
	 * @throws SupplierMappingException
	 *            the supplier mapping exception
	 */
	public SupplierAccommodationMappingModel getSupplierAccommodationMapping(
			final SupplierAccommodationMappingModel pSupplierAccommodationMappingModel) throws SupplierMappingException;
}
