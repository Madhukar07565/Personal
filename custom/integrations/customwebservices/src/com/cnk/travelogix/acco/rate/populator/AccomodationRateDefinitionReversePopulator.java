package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.masterdata.core.enums.ClientType;
import com.cnk.travelogix.rate.acco.data.AccommodationRateDefinitionData;
import com.cnk.travelogix.supplier.rates.enums.PriceApplicabilityType;
import com.cnk.travelogix.supplier.rates.enums.RateApplicabilityType;
import com.cnk.travelogix.supplier.rates.model.supplierrates.accommodation.AccommodationRateDefinitionModel;

import de.hybris.platform.advancedsavedquery.enums.AdvancedQueryComparatorEnum;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class AccomodationRateDefinitionReversePopulator implements Populator<AccommodationRateDefinitionData,AccommodationRateDefinitionModel>{

	@Override
	public void populate(AccommodationRateDefinitionData source, AccommodationRateDefinitionModel target)
			throws ConversionException {
		target.setPriceApplicability(PriceApplicabilityType.valueOf(source.getPriceApplicability()));
		target.setNoOfRooms(source.getNoOfRooms());
	
		target.setComparator(AdvancedQueryComparatorEnum.valueOf(source.getComparator()));
		target.setNet(source.getNet());
		target.setCommissionValue(source.getCommisionValue());
		target.setRateTypeApplicableFor(RateApplicabilityType.valueOf(source.getRateTypeApplicableFor()));
		target.setClientType(ClientType.valueOf(source.getClientType()));
		//target.setSupplierRateCode(source.getCompanyRateCode().getCode()); //Model type
	}

}
