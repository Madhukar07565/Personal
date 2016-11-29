/**
 *
 */
package com.cnk.travelogix.supplier.inventory.facade.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.util.StandardDateRange;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDefinitionModel;
import com.cnk.travelogix.accoinventory.core.model.AccoInventoryDetailModel;
import com.cnk.travelogix.accoinventory.core.model.InventoryRoomInfoModel;

import de.hybris.platform.basecommerce.enums.WeekDay;

import com.cnk.travelogix.client.core.traveller.prefernce.model.HotelPreferenceModel;
import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;
import com.cnk.travelogix.masterdata.core.c2l.model.LocationModel;
import com.cnk.travelogix.masterdata.core.category.model.ProductCategorySubTypeModel;
import com.cnk.travelogix.masterdata.core.enums.RoomCategory;
import com.cnk.travelogix.masterdata.core.enums.RoomType;
import com.cnk.travelogix.product.common.core.enums.Rating;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.model.accommodation.AccoSupplierAdvanceDefinitionModel;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.model.air.inclusionexclusion.TravelDestinationConfigModel;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;
import com.cnk.travelogix.supplier.credentials.core.model.SupplierCredentialsModel;
import com.cnk.travelogix.supplier.credentials.data.SupplierCredentialsData;
import com.cnk.travelogix.supplier.inventory.data.FlightSearchData;
import com.cnk.travelogix.supplier.inventory.data.HotelSearchData;
import com.cnk.travelogix.supplier.inventory.data.SupplierInventoryData;
import com.cnk.travelogix.supplier.inventory.data.SupplierInventoryDataList;
import com.cnk.travelogix.supplier.inventory.data.flight.FlightDetailData;
import com.cnk.travelogix.supplier.inventory.data.flight.FlightDetailDataList;
import com.cnk.travelogix.supplier.inventory.facade.SupplierSearchFacade;
//import com.cnk.travelogix.supplier.mappings.product.model.ProductMappingModel;
import com.cnk.travelogix.supplier.mappings.product.model.SupplierProductModel;
import com.cnk.travelogix.transport.inventory.core.model.AirInventoryDefinitionModel;
import com.cnk.travelogix.transportinventory.core.model.AirInventoryDetailModel;

/**
 * This facade class manages supplier offline search related functionalities
 * 
 * @author I077322
 * 
 */
public class SupplierSearchFacadeImpl implements SupplierSearchFacade {

    private static final Logger LOG = Logger.getLogger(SupplierSearchFacadeImpl.class);

    @Resource(name = "flexibleSearchService")
    private FlexibleSearchService flexibleSearchService;

    @Autowired
    @Qualifier("supplierInventoryConverter")
    private Converter<AccoInventoryDefinitionModel, SupplierInventoryData> supplierInventoryConverter;

    @Autowired
    @Qualifier("flightInventoryConverter")
    private Converter<AirInventoryDefinitionModel, FlightDetailData> flightInventoryConverter;

    @Override
    public SupplierInventoryDataList search(String supplierId) {
	LOG.info("#search - Start");
	SupplierModel supplierModel = new SupplierModel();
	supplierModel.setCode(supplierId);
	supplierModel = flexibleSearchService.getModelByExample(supplierModel);

	AccoInventoryDefinitionModel accInvDefModel = new AccoInventoryDefinitionModel();
	accInvDefModel.setSupplier(supplierModel);

	final List<AccoInventoryDefinitionModel> accInvDefModels = flexibleSearchService.getModelsByExample(accInvDefModel);

	final SupplierInventoryDataList supplierInventoryDataList = new SupplierInventoryDataList();
	final List<SupplierInventoryData> supplierInventory = new ArrayList<>();
	SupplierInventoryData supplierInventoryData;

	for (final AccoInventoryDefinitionModel supplierCredentialsModel : accInvDefModels) {
	    supplierInventoryData = supplierInventoryConverter.convert(supplierCredentialsModel);
	    supplierInventory.add(supplierInventoryData);
	    supplierInventoryDataList.setSupplierInventory(supplierInventory);
	}
	LOG.info("#search - Finish");
	return supplierInventoryDataList;
    }

    @Override
    public SupplierInventoryDataList search(String supplierId, HotelSearchData hotelSearchData) {
	LOG.info("#search Accommodation- Start");
	SupplierModel supplierModel = new SupplierModel();
	supplierModel.setCode(supplierId);
	supplierModel = flexibleSearchService.getModelByExample(supplierModel);

	LOG.trace("#search - city name" + hotelSearchData.getCity());

	AccoInventoryDefinitionModel accInvDefModel = new AccoInventoryDefinitionModel();
	accInvDefModel.setSupplier(supplierModel);

	final List<AccoInventoryDefinitionModel> accInvDefModels = flexibleSearchService.getModelsByExample(accInvDefModel);

	final SupplierInventoryDataList supplierInventoryDataList = new SupplierInventoryDataList();
	final List<SupplierInventoryData> supplierInventory = new ArrayList<>();
	SupplierInventoryData supplierInventoryData;

	for (final AccoInventoryDefinitionModel accoInventoryDefinition : accInvDefModels) {
	    supplierInventoryData = supplierInventoryConverter.convert(accoInventoryDefinition);
	    supplierInventory.add(supplierInventoryData);
	    supplierInventoryDataList.setSupplierInventory(supplierInventory);
	}

	LOG.info("#search Accommodation - Finish");
	return supplierInventoryDataList;
    }

    @Override
    public FlightDetailDataList search(String supplierId, FlightSearchData flightSearchData) {

	LOG.info("#flight search- Start");
	SupplierModel supplierModel = new SupplierModel();
	supplierModel.setCode(supplierId);
	supplierModel = flexibleSearchService.getModelByExample(supplierModel);

	LOG.trace("#search - from city name" + flightSearchData.getFromCity());

	AirInventoryDefinitionModel airInvDefModel = new AirInventoryDefinitionModel();
	airInvDefModel.setSupplier(supplierModel);


	final List<AirInventoryDefinitionModel> airInvDefModels = flexibleSearchService.getModelsByExample(airInvDefModel);

	final FlightDetailDataList flightDetailDataList = new FlightDetailDataList();
	final List<FlightDetailData> supplierAirInventory = new ArrayList<>();
	FlightDetailData flightDetailData;

	for (final AirInventoryDefinitionModel airInventoryDetailModel : airInvDefModels) {
	    flightDetailData = flightInventoryConverter.convert(airInventoryDetailModel);
	    supplierAirInventory.add(flightDetailData);
	    flightDetailDataList.setSupplierAirInventory(supplierAirInventory);
	}

	LOG.info("#flight search - Finish");
	return flightDetailDataList;
    }
}
