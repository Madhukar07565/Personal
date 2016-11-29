package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.offercombinationrule.model.OfferCombinationRuleModel;
import com.cnk.travelogix.rate.acco.data.OfferCombinationRuleData;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class OfferCombinationRuleReversePopulator implements Populator<OfferCombinationRuleData, OfferCombinationRuleModel>{

	@Override
	public void populate(OfferCombinationRuleData source, OfferCombinationRuleModel target) throws ConversionException {
		
		target.setCombinationAllowed(source.getCombinationAllowed());
	}

}
