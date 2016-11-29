package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.rate.acco.data.PassengerLevelSurchargeDetailData;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.PassengerLevelSurchargeDetailModel;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class PassengerLevelSurchargeDetailReversePopulator implements Populator<PassengerLevelSurchargeDetailData, PassengerLevelSurchargeDetailModel> {

	@Override
	public void populate(PassengerLevelSurchargeDetailData source, PassengerLevelSurchargeDetailModel target)
			throws ConversionException {
		
		target.setStdCommissionValue(source.getStdCommissionValue());
	}

}
