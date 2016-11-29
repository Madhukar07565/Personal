package com.cnk.travelogix.suppliers.events;

import com.cnk.travelogix.supplier.mappings.country.model.SupplierCountryModel;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class SupplierCountryMappingEvent extends AbstractEvent{
    private SupplierCountryModel supplierCountryModel;

    public SupplierCountryMappingEvent(SupplierCountryModel supplierCountryModel) {
	super();
	this.supplierCountryModel = supplierCountryModel;
    }
    public SupplierCountryModel getSupplierCountryModel() {
	return supplierCountryModel;
    }
    public void setSupplierCountryModel(SupplierCountryModel supplierCountryModel) {
	this.supplierCountryModel = supplierCountryModel;
    }
}
