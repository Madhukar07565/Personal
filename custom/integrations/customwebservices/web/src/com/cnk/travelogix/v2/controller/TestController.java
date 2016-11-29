package com.cnk.travelogix.v2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnk.travelogix.supplier.mappings.city.model.SupplierCityModel;
import com.cnk.travelogix.supplier.mappings.country.model.SupplierCountryModel;
import com.cnk.travelogix.supplier.mappings.product.model.SupplierProductModel;
import com.cnk.travelogix.supplier.mappings.room.model.SupplierRoomMappingModel;
import com.cnk.travelogix.suppliers.events.SupplierCityMappingEvent;
import com.cnk.travelogix.suppliers.events.SupplierCountryMappingEvent;
import com.cnk.travelogix.suppliers.events.SupplierHotelCityMappingEvent;
import com.cnk.travelogix.suppliers.events.SupplierProductMappingEvent;

import de.hybris.platform.servicelayer.event.EventService;

@Controller
@RequestMapping(value = "/{baseSiteId}/testmappings")
public class TestController extends BaseController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @Resource(name = "eventService")
    private EventService eventService;

    @RequestMapping(value = "/supplierCity",method = RequestMethod.GET)
    @ResponseBody
    public void testSupplierCityMappings() {
	LOG.info("*******************Test Controller********************");
	List<SupplierCityModel> supplierCityModels = new ArrayList<>();
	SupplierCityModel cityModel = new SupplierCityModel();
	cityModel.setActive(true);
	cityModel.setCountryCode("IN");
	cityModel.setCountryName("India");
	cityModel.setStateCode("Ka");
	cityModel.setCode("mum");
	
	SupplierCityModel cityModel1 = new SupplierCityModel();
	cityModel1.setActive(true);
	cityModel1.setCountryCode("GE");
	cityModel1.setCountryName("Germany");
	cityModel1.setStateCode("TN");
	cityModel1.setCode("abcd");
	
	SupplierCityModel cityModel2 = new SupplierCityModel();
	cityModel2.setActive(true);
	cityModel2.setCountryCode("US");
	cityModel2.setCountryName("UnitedStates");
	cityModel2.setStateCode("Ke");
	cityModel2.setCode("xyz");
	
	supplierCityModels.add(cityModel);
	supplierCityModels.add(cityModel1);
	
	for (SupplierCityModel supplierCityModel : supplierCityModels) {
	    eventService.publishEvent(new SupplierCityMappingEvent(supplierCityModel));
	}
	
    }
    
    @RequestMapping(value = "/supplierCountry",method = RequestMethod.GET)
    @ResponseBody
    public void testSupplierCountryMappings() {
	LOG.info("*******************Test Controller********************");
	SupplierCountryModel supplierCountryModel = new SupplierCountryModel();
	supplierCountryModel.setCode("country");
	SupplierCountryModel supplierCountryModel1 = new SupplierCountryModel();
	supplierCountryModel1.setCode("1234");
	eventService.publishEvent(new SupplierCountryMappingEvent(supplierCountryModel1));
    }
    
    @RequestMapping(value = "/supplierHotelCity",method = RequestMethod.GET)
    @ResponseBody
    public void testSupplierHotelCityMappings() {
	LOG.info("*******************Test Controller********************");
	SupplierRoomMappingModel supplierRoomMappingModel = new SupplierRoomMappingModel();
	supplierRoomMappingModel.setCode("hotelCity");
	SupplierRoomMappingModel supplierRoomMappingModel1 = new SupplierRoomMappingModel();
	supplierRoomMappingModel1.setCode("RoomCategoryMapping");
	eventService.publishEvent(new SupplierHotelCityMappingEvent(supplierRoomMappingModel));
	eventService.publishEvent(new SupplierHotelCityMappingEvent(supplierRoomMappingModel1));
    }
    
    @RequestMapping(value = "/supplierProduct",method = RequestMethod.GET)
    @ResponseBody
    public void testSupplierProductMappings() {
	LOG.info("*******************Test Controller********************");
	SupplierProductModel supplierProductModel = new SupplierProductModel();
	supplierProductModel.setCode("product");
	SupplierProductModel supplierProductModel1 = new SupplierProductModel();
	supplierProductModel1.setCode("productMapping");
	eventService.publishEvent(new SupplierProductMappingEvent(supplierProductModel));
	eventService.publishEvent(new SupplierProductMappingEvent(supplierProductModel1));
    }
}
