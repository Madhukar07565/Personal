/**
 *
 */
package com.cnk.travelogix.supplier.mapping.populator;

import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;
import com.cnk.travelogix.supplier.mapping.data.CityData;

/**
 * Class populate information from CityModel to CityData
 */
public class SupplierCityMappingPopulator implements Populator<CityModel, CityData> {

    @Override
    public void populate(final CityModel source, final CityData target) throws ConversionException {
	target.setCityIsoCode(source.getIsocode());
	target.setCityName(source.getName());
	final CountryData country = new CountryData();
	country.setIsocode(source.getCountry().getIsocode());
	country.setName(source.getCountry().getName());
	target.setCountry(country);
    }
}
