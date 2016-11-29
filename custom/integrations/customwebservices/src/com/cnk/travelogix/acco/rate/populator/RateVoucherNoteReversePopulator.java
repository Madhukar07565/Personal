package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.model.AbstractTravelogixSupplierOfferModel;
import com.cnk.travelogix.rate.acco.data.RateVoucherNoteData;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.RateVoucherNoteModel;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.model.ModelService;

public class RateVoucherNoteReversePopulator implements Populator<RateVoucherNoteData, RateVoucherNoteModel>{

	ModelService modelservice;
	public ModelService getModelservice() {
		return modelservice;
	}
	public void setModelservice(ModelService modelservice) {
		this.modelservice = modelservice;
	}
	@Override
	public void populate(RateVoucherNoteData source, RateVoucherNoteModel target) throws ConversionException {
		// TODO Auto-generated method stub
		AbstractTravelogixSupplierOfferModel model = getModelservice().create(AbstractTravelogixSupplierOfferModel.class);
		target.setOfferName(model);
	}

}
