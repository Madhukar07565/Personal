package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.rate.acco.data.RatePaymentDetailData;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.RatePaymentDetailModel;
import com.cnk.travelogix.supplier.settlementterms.core.enums.SettlementScheduleType;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class RatePaymentDetailReversePopulator implements Populator<RatePaymentDetailData, RatePaymentDetailModel>{

	@Override
	public void populate(RatePaymentDetailData source, RatePaymentDetailModel target) throws ConversionException {
		// TODO Auto-generated method stub
		target.setPayablePercentage(source.getPayablePercentage());
		target.setSettlementSchedule(SettlementScheduleType.valueOf(source.getSettlementSchedule()));
		target.setGuranteeRequired(source.getGuaranteeRequired());
		target.setRemarks(source.getRemarks());
	
	}

}
