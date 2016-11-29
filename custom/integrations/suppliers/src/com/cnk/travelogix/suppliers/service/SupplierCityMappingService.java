package com.cnk.travelogix.suppliers.service;

import com.cnk.travelogix.supplier.mappings.city.model.SupplierCityModel;

/**
 * @author I077988
 */
public interface SupplierCityMappingService {

    /**
     * @return boolean
     */
    public boolean getAllSupplierCity();

    /**
     * @param supplierCityModelReq
     * @return boolean
     */
    public boolean mapUpdatedSupplierCity(final SupplierCityModel supplierCityModelReq);
}
