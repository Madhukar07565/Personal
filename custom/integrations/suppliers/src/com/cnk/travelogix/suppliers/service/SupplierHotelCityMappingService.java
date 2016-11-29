package com.cnk.travelogix.suppliers.service;

import com.cnk.travelogix.supplier.mappings.room.model.SupplierRoomMappingModel;

/**
 * @author I077988
 */
public interface SupplierHotelCityMappingService {
    
    /**
     * @return boolean
     */
    public boolean getAllSupplierHotelCity();
    
    /**
     * @param supplierRoomMappingModelReq
     * @return boolean
     */
    public boolean mapUpdatedSupplierHotelCity(final SupplierRoomMappingModel supplierRoomMappingModelReq);
}
