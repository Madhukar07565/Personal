package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.rate.acco.data.AccomodationSupplierRateData;
import com.cnk.travelogix.supplier.rates.model.supplierrates.accommodation.AccommodationSupplierRateModel;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class AccomodationSupplierRateReversePopulator implements Populator<AccomodationSupplierRateData, AccommodationSupplierRateModel> {

	

	@Override
	public void populate(AccomodationSupplierRateData source, AccommodationSupplierRateModel target)
			throws ConversionException {
		
		//target.setsource.getAccomodationRateDefinition().get(0);//model type
		//target.setSupplier(source.getSupplier()); //model type
	    //target.setProduct(source.getProduct());
		
	}

}
