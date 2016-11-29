package com.cnk.travelogix.supplier.inventory.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.math.BigDecimal;

import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDefinitionModel;
import com.cnk.travelogix.supplier.inventory.data.SupplierInventoryData;

/**
 * Class populate information from AccoInventoryDefinitionModel to SupplierInventoryData
 */
public class SupplierInventoryPopulator implements Populator<AccoInventoryDefinitionModel, SupplierInventoryData> {

    @Override
    public void populate(final AccoInventoryDefinitionModel source, final SupplierInventoryData target) throws ConversionException {
	target.setSupplierID(source.getSupplier().getCode());
	target.setAvailabiltyStatus("N");
	target.setHotelCode(21);
	target.setTotalPrice(BigDecimal.valueOf(5050.75d));
    }
}