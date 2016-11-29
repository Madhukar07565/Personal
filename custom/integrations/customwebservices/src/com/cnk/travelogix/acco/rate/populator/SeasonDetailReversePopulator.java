package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.rate.acco.data.SeasonDetailData;
import com.cnk.travelogix.supplier.masters.core.enums.SeasonType;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.SeasonDetailModel;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class SeasonDetailReversePopulator implements Populator<SeasonDetailData, SeasonDetailModel> {

	@Override
	public void populate(SeasonDetailData source, SeasonDetailModel target) throws ConversionException {
		
		target.setSeasonality(SeasonType.valueOf(source.getSeasonality()).toString());
		
	}

}
