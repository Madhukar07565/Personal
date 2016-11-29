package com.cnk.travelogix.suppliers.events;

import org.apache.log4j.Logger;

import com.cnk.travelogix.suppliers.service.SupplierProductMappingService;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

public class SupplierProductMappingListener extends AbstractEventListener<SupplierProductMappingEvent> {

    private static final Logger LOG = Logger.getLogger(SupplierCityMappingListener.class);
    private SupplierProductMappingService supplierProductMappingService; 
    
    @Override
    protected void onEvent(SupplierProductMappingEvent event) {
	boolean updatedRecordOrNot = supplierProductMappingService.mapUpdatedSupplierProduct(event.getSupplierProductModel());
	LOG.info("updated values "+updatedRecordOrNot);
    }

    public SupplierProductMappingService getSupplierProductMappingService() {
        return supplierProductMappingService;
    }

    public void setSupplierProductMappingService(SupplierProductMappingService supplierProductMappingService) {
        this.supplierProductMappingService = supplierProductMappingService;
    }
}
