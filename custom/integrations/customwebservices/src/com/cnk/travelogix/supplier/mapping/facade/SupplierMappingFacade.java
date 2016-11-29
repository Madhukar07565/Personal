/**
 *
 */
package com.cnk.travelogix.supplier.mapping.facade;

import de.hybris.platform.commercefacades.user.data.CountryData;

import com.cnk.travelogix.supplier.mapping.data.CityData;

/**
 * @author I077988
 *
 */
public interface SupplierMappingFacade {
    /**
     * @param supplierId
     * @param supplierCity
     * @param supplierCountry
     * @return CityData
     */
    public CityData getSupplierCityMapping(final String supplierId, final String supplierCity, final String supplierCountry);

    /**
     * @param supplierId
     * @param supplierCountry
     * @return CountryData
     */
    public CountryData getSupplierCountryMapping(final String supplierId, final String supplierCountry);
}
