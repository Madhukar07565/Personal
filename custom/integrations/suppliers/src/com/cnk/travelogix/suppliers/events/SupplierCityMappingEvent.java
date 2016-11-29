package com.cnk.travelogix.suppliers.events;

import com.cnk.travelogix.supplier.mappings.city.model.SupplierCityModel;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;



/**
 * Event for City Mapping
 */
public class SupplierCityMappingEvent extends AbstractEvent{
    
    private SupplierCityModel supplierCityModel;
    
    /**
     * Constructor
     * @param supplierCityModel
     */
    public SupplierCityMappingEvent(SupplierCityModel supplierCityModel) {
	super();
	this.supplierCityModel = supplierCityModel;
    }

    public SupplierCityModel getSupplierCityModel() {
        return supplierCityModel;
    }

    public void setSupplierCityModel(SupplierCityModel supplierCityModel) {
        this.supplierCityModel = supplierCityModel;
    }
}
