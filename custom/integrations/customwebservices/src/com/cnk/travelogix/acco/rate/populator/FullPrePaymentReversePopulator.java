package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.rate.acco.data.FullPrePaymentData;
//import com.cnk.travelogix.supplier.rates.supplierrate.model.common.FullPrePaymentModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.RatePaymentDetailModel;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.model.ModelService;

public class FullPrePaymentReversePopulator implements Populator{

	ModelService modelService;
	public ModelService getModelService() {
		return modelService;
	}
	public void setModelService(ModelService modelService) {
		this.modelService = modelService;
	}
	@Override
	public void populate(Object source, Object target) throws ConversionException {
		// TODO Auto-generated method stub
		
	}
	/*@Override
	public void populate(FullPrePaymentData source, FullPrePaymentModel target) throws ConversionException {
		
		RatePaymentDetailModel model = getModelService().create(RatePaymentDetailModel.class);
	       target.setRatePaymentDetail(model);
	
	       
	}
*/
	
}
