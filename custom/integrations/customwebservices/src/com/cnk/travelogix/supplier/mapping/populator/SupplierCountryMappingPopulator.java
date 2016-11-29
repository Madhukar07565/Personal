package com.cnk.travelogix.supplier.mapping.populator;

import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

/**
 * Class populate information from CountryModel to CountryData
 */
public class SupplierCountryMappingPopulator implements Populator<CountryModel, CountryData> {

    @Override
    public void populate(final CountryModel source, final CountryData target) throws ConversionException {
	target.setIsocode(source.getIsocode());
	target.setName(source.getName());
    }

}
