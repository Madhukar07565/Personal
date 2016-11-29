package com.cnk.travelogix.suppliers.service;

import com.cnk.travelogix.supplier.mappings.country.model.SupplierCountryModel;

/**
 * @author I077988
 */
public interface SupplierCountryMappingService {

    /**
     * @return boolean
     */
    public boolean getAllSupplierCountry();

    /**
     * @param supplierCountryModelReq
     * @return boolean
     */
    public boolean mapUpdatedSupplierCountry(final SupplierCountryModel supplierCountryModelReq);

}
