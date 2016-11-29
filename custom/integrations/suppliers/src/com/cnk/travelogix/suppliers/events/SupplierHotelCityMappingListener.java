package com.cnk.travelogix.suppliers.events;

import org.apache.log4j.Logger;

import com.cnk.travelogix.suppliers.service.SupplierCityMappingService;
import com.cnk.travelogix.suppliers.service.SupplierHotelCityMappingService;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

public class SupplierHotelCityMappingListener extends AbstractEventListener<SupplierHotelCityMappingEvent> {

    private static final Logger LOG = Logger.getLogger(SupplierCityMappingListener.class);
    private SupplierHotelCityMappingService supplierHotelCityMappingService; 
    
    @Override
    protected void onEvent(SupplierHotelCityMappingEvent event) {
	boolean updatedRecordOrNot = supplierHotelCityMappingService.mapUpdatedSupplierHotelCity(event.getSupplierRoomMappingModel());
	LOG.info("updated values "+updatedRecordOrNot);
    }

    public SupplierHotelCityMappingService getSupplierHotelCityMappingService() {
        return supplierHotelCityMappingService;
    }

    public void setSupplierHotelCityMappingService(SupplierHotelCityMappingService supplierHotelCityMappingService) {
        this.supplierHotelCityMappingService = supplierHotelCityMappingService;
    }
}
