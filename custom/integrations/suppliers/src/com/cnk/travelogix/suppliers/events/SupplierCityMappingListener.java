package com.cnk.travelogix.suppliers.events;

import org.apache.log4j.Logger;
import com.cnk.travelogix.suppliers.service.SupplierCityMappingService;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

/**
 * Listener class 
 */
public class SupplierCityMappingListener extends AbstractEventListener<SupplierCityMappingEvent> {

    private static final Logger LOG = Logger.getLogger(SupplierCityMappingListener.class);
    private SupplierCityMappingService supplierCityMappingService; 
    
    @Override
    protected void onEvent(SupplierCityMappingEvent event) {
	boolean updatedRecordOrNot = supplierCityMappingService.mapUpdatedSupplierCity(event.getSupplierCityModel());
	LOG.info("updated values "+updatedRecordOrNot);
    }
    public SupplierCityMappingService getSupplierCityMappingService() {
        return supplierCityMappingService;
    }
    public void setSupplierCityMappingService(SupplierCityMappingService supplierCityMappingService) {
        this.supplierCityMappingService = supplierCityMappingService;
    }
}
