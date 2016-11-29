package com.cnk.travelogix.suppliers.service.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;
import com.cnk.travelogix.product.common.core.model.AccommodationModel;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;
import com.cnk.travelogix.supplier.mappings.country.model.SupplierCountryModel;
import com.cnk.travelogix.supplier.mappings.room.model.SupplierRoomCategoryModel;
import com.cnk.travelogix.supplier.mappings.room.model.SupplierRoomMappingModel;
import com.cnk.travelogix.suppliers.service.SupplierHotelCityMappingService;
import com.cnk.travelogix.suppliers.util.CsvWriter;
import com.cnk.travelogix.suppliers.util.SupplierUtils;

public class SupplierHotelCityMappingServiceImpl implements SupplierHotelCityMappingService {

    private static final Logger LOG = Logger.getLogger(SupplierHotelCityMappingServiceImpl.class);

    @Autowired
    private SupplierUtils supplierUtils;
    @Autowired
    private FlexibleSearchService flexibleSearchService;

    private static final String FILE_HEADER = "SupplierID,CityCode,HotelCode,Active";

    @Override
    public boolean getAllSupplierHotelCity() {
	try {
	    final CsvWriter csvWriter = this.getCsvWriter();
	    final SupplierRoomMappingModel supplierRoomMappingModel = new SupplierRoomMappingModel();
	    supplierRoomMappingModel.setActive(true);

	    final List<SupplierRoomMappingModel> supplierRoomMappingModelList = flexibleSearchService.getModelsByExample(supplierRoomMappingModel);
	    if (supplierRoomMappingModelList != null && !supplierRoomMappingModelList.isEmpty()) {
		for (final SupplierRoomMappingModel supplierRoomMapping : supplierRoomMappingModelList) {
		    this.writeSupplierHotelCityRecord(csvWriter, supplierRoomMapping);
		}
	    }
	    csvWriter.close();
	    return true;
	} catch (final Exception e) {
	    LOG.info("#getAllSupplierHotelCity" + e.getMessage(), e);
	    return false;
	}

    }

    @Override
    public boolean mapUpdatedSupplierHotelCity(final SupplierRoomMappingModel supplierRoomMappingModelReq) {
	try {
	    final CsvWriter csvWriter = this.getCsvWriter();
	    final SupplierRoomMappingModel supplierRoomMappingModel = flexibleSearchService.getModelByExample(supplierRoomMappingModelReq);
	    this.writeSupplierHotelCityRecord(csvWriter, supplierRoomMappingModel);
	    csvWriter.close();
	    return true;
	} catch (final Exception e) {
	    LOG.info("#mapUpdatedSupplierHotelCity" + e.getMessage(), e);
	    return false;
	}
    }

    /**
     * @return csvWriter
     * @throws IOException
     */
    private CsvWriter getCsvWriter() throws IOException {
	final String mappingOutputFile = supplierUtils.getMappingOutputFile("hoteltocity.mapping.path.key", "supplier_hotel_city_map_");
	final boolean alreadyExists = new File(mappingOutputFile).exists();
	final CsvWriter csvWriter = new CsvWriter(new FileWriter(mappingOutputFile, true), SupplierUtils.COMMA_DELIMITER);

	if (!alreadyExists) {
	    csvWriter.write(FILE_HEADER);
	    csvWriter.endRecord();
	}
	return csvWriter;
    }

    private void writeSupplierHotelCityRecord(final CsvWriter csvOutput, final SupplierRoomMappingModel supplierRoomMapping) throws IOException {
	/*final SupplierModel supplierModel = supplierRoomMapping.getSupplier();
	Collection<SupplierRoomCategoryModel> supplierRoom = supplierRoomMapping.getSupplierRoomCategory();
	for (SupplierRoomCategoryModel roomCategory : supplierRoom) {

	    AccommodationModel accModel = supplierRoomMapping.getProduct();
	    final Set<CityModel> city = accModel.getAddress().getRegion().getCities();
	    for (CityModel eachCity : city) {
		//Supplier Id
		csvOutput.write(supplierModel.getCode());
		//Hotel Code
		csvOutput.write(roomCategory.getHotelId());
		//City Code
		csvOutput.write(eachCity.getIsocode());
		//Active Flag
		csvOutput.write(supplierModel.getActive().toString());
		csvOutput.endRecord();
	    }
	}*/
    }
}
