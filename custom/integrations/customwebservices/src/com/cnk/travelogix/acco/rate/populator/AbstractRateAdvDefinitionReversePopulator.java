package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.rate.acco.data.AbstractRateAdvDefinitionData;
import com.cnk.travelogix.supplier.rates.supplierrate.model.parent.AbstractRateAdvDefinitionModel;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class AbstractRateAdvDefinitionReversePopulator implements Populator<AbstractRateAdvDefinitionData, AbstractRateAdvDefinitionModel>{

	@Override
	public void populate(AbstractRateAdvDefinitionData source, AbstractRateAdvDefinitionModel target)
			throws ConversionException {	
		target.setMaxPax(source.getMaxPax());
		target.setMinPax(source.getMinPax());
		target.setPriceInclusion(source.getPriceInclusion());
		target.setPriceExclusion(source.getPriceExclusion());
		target.setTaxInformation(source.getTaxInformation());
		target.setInternalDescription(source.getInternalDescription());
		target.setPriceInclusion(source.getPriceExclusion());
		target.setExternalDescription(source.getExternalDescription());
		target.setOverrideRate(source.getOverrideRate());
		target.setChildPolicy(source.getChildPolicy());
		target.setMaxNights(source.getMaxNights());	
	}

}
