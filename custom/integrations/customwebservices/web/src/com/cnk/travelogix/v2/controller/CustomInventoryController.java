package com.cnk.travelogix.v2.controller;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.webservicescommons.cache.CacheControl;
import de.hybris.platform.webservicescommons.cache.CacheControlDirective;
import de.hybris.platform.webservicescommons.jaxb.JaxbContextFactory;

import java.math.BigDecimal;

import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cnk.travelogix.inventory.acco.data.UpdateInventoryResponseData;
import com.cnk.travelogix.inventory.acco.dto.UpdateInventoryResponseWsDto;
import com.cnk.travelogix.inventory.data.AccoInventoryDefinitionData;
import com.cnk.travelogix.inventory.dto.AccoInventoryDefinitionWsDTO;
import com.cnk.travelogix.supplier.inventory.data.FlightSearchData;
import com.cnk.travelogix.supplier.inventory.data.HotelSearchData;
import com.cnk.travelogix.supplier.inventory.data.SupplierInventoryDataList;
import com.cnk.travelogix.supplier.inventory.data.flight.FlightDetailDataList;
import com.cnk.travelogix.supplier.inventory.dto.FlightSearchWsDTO;
import com.cnk.travelogix.supplier.inventory.dto.HotelSearchWsDTO;
import com.cnk.travelogix.supplier.inventory.dto.SupplierInventoryWsDTOList;
import com.cnk.travelogix.supplier.inventory.dto.flight.FlightDetailWsDTOList;
import com.cnk.travelogix.supplier.inventory.facade.InventoryFacade;
import com.cnk.travelogix.supplier.inventory.facade.SupplierSearchFacade;

import org.eclipse.persistence.jaxb.JAXBContext;
import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.opentravel.ota._2003._05.HotelResModifyRequestType;
import org.opentravel.ota._2003._05.HotelResModifyResponseType;
import org.opentravel.ota._2003._05.OTAAirDetailsRQ;
import org.opentravel.ota._2003._05.OTAAirDetailsRS;

/**
 * This controller class manages Inventory related functionalities
 * @author I077322
 * 
 */
@Controller
@RequestMapping(value = "/{baseSiteId}/inventory")
@CacheControl(directive = CacheControlDirective.PRIVATE)
public class CustomInventoryController extends BaseCommerceController {

    private static final Logger LOG = LoggerFactory.getLogger(CustomInventoryController.class);

    @Autowired
    private SupplierSearchFacade supplierSearchFacade;
    
    @Autowired
    private InventoryFacade inventoryFacade;

    
    @Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
    @RequestMapping(value = "/acco/{supplierId}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public SupplierInventoryWsDTOList search(@PathVariable("supplierId") final String supplierId,
	    @RequestBody final HotelSearchWsDTO search) {
	LOG.info("#accoSearch - Start");
	LOG.debug("#supplierInventoryListWsDTO - SupplierId:{}", supplierId);
	final HotelSearchData hotelSearchData = getDataMapper()
		.map(search, HotelSearchData.class);
	final SupplierInventoryDataList supplierInventoryDataList = supplierSearchFacade.search(supplierId,hotelSearchData);
	final SupplierInventoryWsDTOList supplierInventoryWsDTOList = getDataMapper()
		.map(supplierInventoryDataList, SupplierInventoryWsDTOList.class);
	LOG.info("#accoSearch - Finish");
	return supplierInventoryWsDTOList;
    }
    
    @Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
    @RequestMapping(value = "/air/{supplierId}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public FlightDetailWsDTOList search(@PathVariable("supplierId") final String supplierId,
	    @RequestBody final FlightSearchWsDTO search) {
	LOG.info("#flightSearch - Start");
	LOG.debug("#supplierInventoryListWsDTO - SupplierId:{}", supplierId);
	final FlightSearchData flightSearchData = getDataMapper()
		.map(search, FlightSearchData.class);
	final FlightDetailDataList flightDetailDataList = supplierSearchFacade.search(supplierId,flightSearchData);
	final FlightDetailWsDTOList flightDetailWsDTOList = getDataMapper()
		.map(flightDetailDataList, FlightDetailWsDTOList.class);
	LOG.info("#flightSearch - Finish");
	return flightDetailWsDTOList;
    }
    
    @Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
    @RequestMapping(value = "/updateInventory/acco/{supplierId}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public UpdateInventoryResponseWsDto updateInventory(@PathVariable("supplierId") final String supplierId,
	    @RequestBody final AccoInventoryDefinitionWsDTO updateInventory) {
	LOG.info("#updateInventory - Start");
	LOG.debug("#updateInventory - SupplierId:{}", supplierId);
	final AccoInventoryDefinitionData updateInventoryData = getDataMapper()
		.map(updateInventory, AccoInventoryDefinitionData.class);
	final UpdateInventoryResponseData updateInventoryResponseData = inventoryFacade.updateInventory(supplierId, updateInventoryData);
	final UpdateInventoryResponseWsDto updateInventoryResponseWsDto = getDataMapper()
		.map(updateInventoryResponseData, UpdateInventoryResponseWsDto.class);
	LOG.info("#updateInventory - Finish");
	return updateInventoryResponseWsDto;
    }
	

	 
    @Secured({ "ROLE_CUSTOMERGROUP", "ROLE_TRUSTED_CLIENT", "ROLE_CUSTOMERMANAGERGROUP" })
    @RequestMapping(value = "/hotel2/{supplierId}", method = RequestMethod.POST, consumes =
	  { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public HotelResModifyResponseType updateInventory(@PathVariable("supplierId") final String supplierId,
	    @RequestBody final HotelResModifyRequestType otaHotelInvNotifRQ) {
	LOG.info("#updateInventory - Start");
	LOG.debug("#updateInventory - version" + otaHotelInvNotifRQ.getVersion().doubleValue());
	HotelResModifyResponseType response = new HotelResModifyResponseType();
	response.setVersion(BigDecimal.valueOf(10.2d));
	LOG.info("#updateInventory - Finish");
	return response;
    }

}
