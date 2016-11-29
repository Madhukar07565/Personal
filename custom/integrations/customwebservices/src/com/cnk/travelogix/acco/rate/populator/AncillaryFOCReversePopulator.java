package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.ancillaryfOC.model.AncillaryFOCModel;
import com.cnk.travelogix.rate.acco.data.AncillaryFOCData;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class AncillaryFOCReversePopulator implements Populator<AncillaryFOCData, AncillaryFOCModel> {

	@Override
	public void populate(AncillaryFOCData source, AncillaryFOCModel target) throws ConversionException {
		
		target.setNoOfChildren(source.getNoOfChildren());
	}

}
