package com.cnk.travelogix.supplier.inventory.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.Date;

import com.cnk.travelogix.supplier.inventory.data.flight.FlightDetailData;
import com.cnk.travelogix.transport.inventory.core.model.AirInventoryDefinitionModel;

/**
 * Class populate information from AccoInventoryDefinitionModel to SupplierInventoryData
 */
public class FlightInventoryPopulator implements Populator<AirInventoryDefinitionModel, FlightDetailData> {

    @Override
    public void populate(final AirInventoryDefinitionModel source, final FlightDetailData target) throws ConversionException {
	target.setSupplierID(source.getSupplier().getCode());
	target.setArrivalTime(new Date());
    }
}