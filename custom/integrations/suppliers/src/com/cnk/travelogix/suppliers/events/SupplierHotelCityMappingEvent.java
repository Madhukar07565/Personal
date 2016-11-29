package com.cnk.travelogix.suppliers.events;

import com.cnk.travelogix.supplier.mappings.room.model.SupplierRoomMappingModel;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class SupplierHotelCityMappingEvent extends AbstractEvent{

    private SupplierRoomMappingModel supplierRoomMappingModel;

    public SupplierHotelCityMappingEvent(SupplierRoomMappingModel supplierRoomMappingModel) {
	super();
	this.supplierRoomMappingModel = supplierRoomMappingModel;
    }

    public SupplierRoomMappingModel getSupplierRoomMappingModel() {
        return supplierRoomMappingModel;
    }

    public void setSupplierRoomMappingModel(SupplierRoomMappingModel supplierRoomMappingModel) {
        this.supplierRoomMappingModel = supplierRoomMappingModel;
    }
}
