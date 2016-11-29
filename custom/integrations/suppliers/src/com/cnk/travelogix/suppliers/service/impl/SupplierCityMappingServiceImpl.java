package com.cnk.travelogix.suppliers.service.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.masterdata.core.c2l.model.CityModel;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;
import com.cnk.travelogix.supplier.mappings.city.model.SupplierCityMappingModel;
import com.cnk.travelogix.supplier.mappings.city.model.SupplierCityModel;
import com.cnk.travelogix.suppliers.service.SupplierCityMappingService;
import com.cnk.travelogix.suppliers.util.CsvWriter;
import com.cnk.travelogix.suppliers.util.SupplierUtils;

public class SupplierCityMappingServiceImpl implements SupplierCityMappingService {

    private static final Logger LOG = Logger.getLogger(SupplierCityMappingServiceImpl.class);

    @Autowired
    private SupplierUtils supplierUtils;
    @Autowired
    private FlexibleSearchService flexibleSearchService;

    private static final String FILE_HEADER = "GlobalId,SupplierType,SupplierID,CountryCode,CityCode,CityName,Active";

    @Override
    public boolean getAllSupplierCity() {
	try {
	    final CsvWriter csvWriter = this.getCsvWriter();

	    final SupplierCityModel supplierCityModelReq = new SupplierCityModel();
	    supplierCityModelReq.setActive(Boolean.TRUE);
	    final List<SupplierCityModel> supplierCityModelList = flexibleSearchService.getModelsByExample(supplierCityModelReq);

	    if (supplierCityModelList != null && !supplierCityModelList.isEmpty()) {
		for (final SupplierCityModel supplierCityModel : supplierCityModelList) {
		    this.writeSupplierCityRecord(csvWriter, supplierCityModel);
		}
	    }
	    csvWriter.close();
	    return true;
	} catch (final Exception e) {
	    LOG.info("#getAllSupplierCity" + e.getMessage(), e);
	    return false;
	}
    }

    @Override
    public boolean mapUpdatedSupplierCity(final SupplierCityModel supplierCityModelReq) {
	try {
	    final CsvWriter csvWriter = this.getCsvWriter();
	    final SupplierCityModel supplierCityModel = flexibleSearchService.getModelByExample(supplierCityModelReq);
	    this.writeSupplierCityRecord(csvWriter, supplierCityModel);
	    csvWriter.close();
	    return true;
	} catch (final Exception e) {
	    LOG.info("#mapUpdatedSupplierCity" + e.getMessage(), e);
	    return false;
	}
    }

    /**
     * @return csvWriter
     * @throws IOException
     */
    private CsvWriter getCsvWriter() throws IOException {
	final String mappingOutputFile = supplierUtils.getMappingOutputFile("city.mapping.path.key", "supplier_city_map_");
	final boolean alreadyExists = new File(mappingOutputFile).exists();
	final CsvWriter csvWriter = new CsvWriter(new FileWriter(mappingOutputFile, true), SupplierUtils.COMMA_DELIMITER);

	if (!alreadyExists) {
	    csvWriter.write(FILE_HEADER);
	    csvWriter.endRecord();
	}
	return csvWriter;
    }

    /**
     * @param csvWriter
     * @param supplierCityModel
     * @throws IOException
     */
    private void writeSupplierCityRecord(final CsvWriter csvWriter, final SupplierCityModel supplierCityModel) throws IOException {
	//final SupplierModel supplier = supplierCityModel.getSupplier();
	final Collection<com.cnk.travelogix.supplier.mappings.model.AbstractSupplierMappingModel> mappings = supplierCityModel.getMappings();
	for (final com.cnk.travelogix.supplier.mappings.model.AbstractSupplierMappingModel abstractSupplierMappingModel : mappings) {
	    if (abstractSupplierMappingModel instanceof SupplierCityMappingModel) {
		/*final SupplierCityMappingModel supplierCityMappingModel = (SupplierCityMappingModel) abstractSupplierMappingModel;
		final Collection<CityModel> cities = supplierCityMappingModel.getCities();
		for (final CityModel cityModel : cities) {
		    csvWriter.write(supplier.getCommonUid());
		    csvWriter.write(supplier.getSupplierType() != null ? supplier.getSupplierType().getCode() : null);
		    csvWriter.write(supplier.getCode());
		    csvWriter.write(cityModel.getCountry() != null ? cityModel.getCountry().getIsocode() : null);
		    csvWriter.write(supplierCityModel.getCode());
		    csvWriter.write(cityModel.getName());
		    csvWriter.write(supplierCityModel.getActive().toString());
		    csvWriter.endRecord();
		}*/
	    }
	}
    }
}
