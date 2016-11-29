package com.cnk.travelogix.suppliers.service;

import com.cnk.travelogix.supplier.mappings.product.model.SupplierProductModel;

/**
 * @author I077988
 */
public interface SupplierProductMappingService {

    /**
     * @return boolean
     */
    public boolean getAllSupplierProducts();

    /**
     * @param supplierProductModelReq
     * @return boolean
     */
    public boolean mapUpdatedSupplierProduct(final SupplierProductModel supplierProductModelReq);
}
