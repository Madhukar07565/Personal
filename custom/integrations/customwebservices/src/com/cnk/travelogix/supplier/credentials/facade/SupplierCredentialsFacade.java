/**
 *
 */
package com.cnk.travelogix.supplier.credentials.facade;

import com.cnk.travelogix.supplier.credentials.data.SupplierCredentialsData;

/**
 * @author I077988
 *
 */
@FunctionalInterface
public interface SupplierCredentialsFacade {
    
    /**
     * @param supplierId
     * @return SupplierCredentialsDataList
     */
    public SupplierCredentialsData getSupplierCredentialsById(final String supplierId);
}
