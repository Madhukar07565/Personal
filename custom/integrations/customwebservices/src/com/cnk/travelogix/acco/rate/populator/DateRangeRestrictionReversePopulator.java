package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.dateRange.model.DateRangeRestrictionModel;
import com.cnk.travelogix.rate.acco.data.DateRangeRestrictionData;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class DateRangeRestrictionReversePopulator implements Populator<DateRangeRestrictionData, DateRangeRestrictionModel> {

	@Override
	public void populate(DateRangeRestrictionData source, DateRangeRestrictionModel target) throws ConversionException {
		
		target.setStandardDateRange(source.getStandardDateRange());//need to check
		
	}

}
