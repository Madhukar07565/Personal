/**
 *
 */
package com.cnk.travelogix.supplier.mapping.facade.impl;

import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.Collection;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;
import com.cnk.travelogix.supplier.mapping.data.CityData;
import com.cnk.travelogix.supplier.mapping.facade.SupplierMappingFacade;
import com.cnk.travelogix.supplier.mappings.city.model.SupplierCityMappingModel;
import com.cnk.travelogix.supplier.mappings.city.model.SupplierCityModel;
import com.cnk.travelogix.supplier.mappings.country.model.SupplierCountryMappingModel;
import com.cnk.travelogix.supplier.mappings.country.model.SupplierCountryModel;
import com.cnk.travelogix.supplier.mappings.model.AbstractSupplierMappingModel;

/**
 * This facade class manages supplier mapping related functionalities
 * 
 * @author I077988
 *
 */
public class SupplierMappingFacadeImpl implements SupplierMappingFacade {

    private static final Logger LOG = LoggerFactory.getLogger(SupplierMappingFacadeImpl.class);

    @Resource(name = "flexibleSearchService")
    private FlexibleSearchService flexibleSearchService;
    @Autowired
    @Qualifier("supplierCityMappingConverter")
    private Converter<CityModel, CityData> supplierCityMappingConverter;
    @Autowired
    @Qualifier("supplierCountryMappingConverter")
    private Converter<CountryModel, CountryData> supplierCountryMappingConverter;

    @Override
    public CityData getSupplierCityMapping(final String supplierId, final String supplierCity, final String supplierCountry) {
	LOG.info("#getSupplierCityMapping - Start");
	CityData cityData = null;
	SupplierModel supplierModel = new SupplierModel();
	SupplierCityModel supplierCityModel = new SupplierCityModel();
	supplierModel.setCode(supplierId);
	supplierModel = flexibleSearchService.getModelByExample(supplierModel);
	supplierCityModel.setCode(supplierCity);
	supplierCityModel.setSupplier(supplierModel);
	if (StringUtils.isNotBlank(supplierCountry)) {
	    supplierCityModel.setCountryCode(supplierCountry);
	}
	supplierCityModel = flexibleSearchService.getModelByExample(supplierCityModel);

	final Collection<AbstractSupplierMappingModel> mappings = supplierCityModel.getMappings();
	for (final AbstractSupplierMappingModel abstractSupplierMappingModel : mappings) {
	    if (abstractSupplierMappingModel instanceof SupplierCityMappingModel) {
		final SupplierCityMappingModel supplierCityMappingModel = (SupplierCityMappingModel) abstractSupplierMappingModel;
		/*final Collection<CityModel> cities = supplierCityMappingModel.getCities();
		for (final CityModel cityModel : cities) {
		    cityData = supplierCityMappingConverter.convert(cityModel);
		}*/
		 cityData = supplierCityMappingConverter.convert(supplierCityMappingModel.getCity());
	    }
	}
	LOG.info("#getSupplierCityMapping - Finish");
	return cityData;
    }

    @Override
    public CountryData getSupplierCountryMapping(final String supplierId, final String supplierCountry) {
	LOG.info("#getSupplierCountryMapping - Start");
	CountryData countryData = null;
	SupplierModel supplierModel = new SupplierModel();
	SupplierCountryModel supplierCountryModel = new SupplierCountryModel();
	supplierModel.setCode(supplierId);
	supplierModel = flexibleSearchService.getModelByExample(supplierModel);
	supplierCountryModel.setCode(supplierCountry);
	supplierCountryModel.setSupplier(supplierModel);
	supplierCountryModel = flexibleSearchService.getModelByExample(supplierCountryModel);

	final Collection<AbstractSupplierMappingModel> mappings = supplierCountryModel.getMappings();
	for (final AbstractSupplierMappingModel abstractSupplierMappingModel : mappings) {
	    if (abstractSupplierMappingModel instanceof SupplierCountryMappingModel) {
		final SupplierCountryMappingModel supplierCountryMappingModel = (SupplierCountryMappingModel) abstractSupplierMappingModel;
//		final Collection<CountryModel> countries = supplierCountryMappingModel.getCountries();
//		for (final CountryModel countryModel : countries) {
//		    countryData = supplierCountryMappingConverter.convert(countryModel);
//		}
		countryData = supplierCountryMappingConverter.convert(supplierCountryMappingModel.getCountry());	
	    }
	}
	LOG.info("#getSupplierCountryMapping - Finish");
	return countryData;
    }
}
