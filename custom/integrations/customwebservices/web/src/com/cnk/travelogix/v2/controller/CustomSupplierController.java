/**
 *
 */
package com.cnk.travelogix.v2.controller;

import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.commercewebservicescommons.dto.user.CountryWsDTO;
import de.hybris.platform.webservicescommons.cache.CacheControl;
import de.hybris.platform.webservicescommons.cache.CacheControlDirective;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnk.travelogix.supplier.credentials.data.SupplierCredentialsData;
import com.cnk.travelogix.supplier.credentials.dto.SupplierCredentialsWsDTO;
import com.cnk.travelogix.supplier.credentials.facade.SupplierCredentialsFacade;
import com.cnk.travelogix.supplier.mapping.data.CityData;
import com.cnk.travelogix.supplier.mapping.dto.CityWsDTO;
import com.cnk.travelogix.supplier.mapping.facade.SupplierMappingFacade;

/**
 * This controller class manages supplier related functionalities
 * 
 * @author I077988
 *
 */
@Controller
@RequestMapping(value = "/{baseSiteId}/suppliers")
@CacheControl(directive = CacheControlDirective.PRIVATE)
public class CustomSupplierController extends BaseCommerceController {

    private static final Logger LOG = LoggerFactory.getLogger(CustomSupplierController.class);

    @Autowired
    private SupplierMappingFacade supplierMappingFacade;
    @Autowired
    private SupplierCredentialsFacade supplierCredentialsFacade;

    @Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
    @RequestMapping(value = "/credentials/{supplierCredId}", method = RequestMethod.GET)
    @ResponseBody
    public SupplierCredentialsWsDTO getSupplierCredentials(@PathVariable final String supplierCredId) {
	LOG.info("#getSupplierCredentials - Start");
	LOG.debug("#getSupplierCredentials - SupplierCredId:{}", supplierCredId);
	final SupplierCredentialsData supplierCredentialsData = supplierCredentialsFacade.getSupplierCredentialsById(supplierCredId);
	final SupplierCredentialsWsDTO supplierCredentialsWsDTO = getDataMapper().map(supplierCredentialsData, SupplierCredentialsWsDTO.class);
	LOG.info("#getSupplierCredentials - Finish");
	return supplierCredentialsWsDTO;
    }

    @Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
    @RequestMapping(value = "/{supplierId}/citymapping/{supplierCity}", method = RequestMethod.GET)
    @ResponseBody
    public CityWsDTO getSupplierCityMapping(@PathVariable("supplierId") final String supplierId,
	    @PathVariable("supplierCity") final String supplierCity,
	    @RequestParam(value = "supplierCountry", required = false) String supplierCountry) {
	LOG.info("#getSupplierCityMapping - Start");
	LOG.debug("#getSupplierCityMapping - SupplierId:{}, SupplierCity:{}, SupplierCountry:{}", supplierId, supplierCity, supplierCountry);
	final CityData cityData = supplierMappingFacade.getSupplierCityMapping(supplierId, supplierCity, supplierCountry);
	final CityWsDTO cityWsDto = getDataMapper().map(cityData, CityWsDTO.class);
	LOG.info("#getSupplierCityMapping - Finish");
	return cityWsDto;
    }

    @Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
    @RequestMapping(value = "/{supplierId}/countrymapping/{supplierCountry}", method = RequestMethod.GET)
    @ResponseBody
    public CountryWsDTO getSupplierCountryMapping(@PathVariable("supplierId") final String supplierId,
	    @PathVariable("supplierCountry") final String supplierCountry) {
	LOG.info("#getSupplierCountryMapping - Start");
	LOG.debug("#getSupplierCountryMapping - SupplierId:{}, SupplierCountry:{}", supplierId, supplierCountry);
	final CountryData countData = supplierMappingFacade.getSupplierCountryMapping(supplierId, supplierCountry);
	final CountryWsDTO countryWsDto = getDataMapper().map(countData, CountryWsDTO.class);
	LOG.info("#getSupplierCountryMapping - Finish");
	return countryWsDto;
    }

}
