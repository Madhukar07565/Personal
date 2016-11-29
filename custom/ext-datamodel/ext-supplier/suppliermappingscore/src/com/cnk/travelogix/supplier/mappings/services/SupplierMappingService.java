/**
 *
 */
package com.cnk.travelogix.supplier.mappings.services;

import com.cnk.travelogix.supplier.mappings.exception.SupplierMappingException;


// TODO: Auto-generated Javadoc
/**
 * The Interface SupplierMappingService.
 *
 * @author admin
 * @param <SUPPLIER_MAPPING_MODEL>
 *           the generic type
 */
public interface SupplierMappingService<SUPPLIER_MAPPING_MODEL>
{

	/**
	 * Generate unique id.
	 *
	 * @param model
	 *           the model
	 * @throws SupplierMappingException
	 *            the supplier mapping exception
	 */
	void generateAndAssignUniqueId(SUPPLIER_MAPPING_MODEL model) throws SupplierMappingException;

	/**
	 * Checks if is exists.
	 *
	 * @param model
	 *           the model
	 * @return true, if is exists
	 */
	public boolean isExists(final SUPPLIER_MAPPING_MODEL model);

	/**
	 * Gets the model.
	 *
	 * @param model
	 *           the model
	 * @return the model
	 * @throws SupplierMappingException
	 *            the supplier mapping exception
	 */
	public SUPPLIER_MAPPING_MODEL getModel(final SUPPLIER_MAPPING_MODEL model) throws SupplierMappingException;
}
