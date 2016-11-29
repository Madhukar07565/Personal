package com.cnk.travelogix.suppliers.events;

import com.cnk.travelogix.supplier.mappings.product.model.SupplierProductModel;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class SupplierProductMappingEvent extends AbstractEvent{
    private SupplierProductModel supplierProductModel;

    public SupplierProductMappingEvent(SupplierProductModel supplierProductModel) {
	super();
	this.supplierProductModel = supplierProductModel;
    }

    public SupplierProductModel getSupplierProductModel() {
        return supplierProductModel;
    }

    public void setSupplierProductModel(SupplierProductModel supplierProductModel) {
        this.supplierProductModel = supplierProductModel;
    }
}
