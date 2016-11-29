package com.cnk.travelogix.suppliers.events;

import org.apache.log4j.Logger;

import com.cnk.travelogix.suppliers.service.SupplierCountryMappingService;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

public class SupplierCountryMappingListener extends AbstractEventListener<SupplierCountryMappingEvent> {

    private static final Logger LOG = Logger.getLogger(SupplierCityMappingListener.class);
    private SupplierCountryMappingService supplierCountryMappingService; 
    
    @Override
    protected void onEvent(SupplierCountryMappingEvent event) {
	boolean updatedRecordOrNot = supplierCountryMappingService.mapUpdatedSupplierCountry(event.getSupplierCountryModel());
	LOG.info("updated values "+updatedRecordOrNot);
    }

    public SupplierCountryMappingService getSupplierCountryMappingService() {
        return supplierCountryMappingService;
    }

    public void setSupplierCountryMappingService(SupplierCountryMappingService supplierCountryMappingService) {
        this.supplierCountryMappingService = supplierCountryMappingService;
    }
}
