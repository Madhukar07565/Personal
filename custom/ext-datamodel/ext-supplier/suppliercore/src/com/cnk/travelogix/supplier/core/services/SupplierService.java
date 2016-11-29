/**
 *
 */
package com.cnk.travelogix.supplier.core.services;

import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * this method will generate common supplier Id and company supplier Id
 */
public interface SupplierService
{
	public void generateSupplierCommonAndCompanyId(SupplierModel supplierModel) throws InterceptorException;

}
