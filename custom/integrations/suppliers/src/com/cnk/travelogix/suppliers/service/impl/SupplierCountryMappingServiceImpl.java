package com.cnk.travelogix.suppliers.service.impl;

import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;
import com.cnk.travelogix.supplier.mappings.country.model.SupplierCountryMappingModel;
import com.cnk.travelogix.supplier.mappings.country.model.SupplierCountryModel;
import com.cnk.travelogix.suppliers.service.SupplierCountryMappingService;
import com.cnk.travelogix.suppliers.util.CsvWriter;
import com.cnk.travelogix.suppliers.util.SupplierUtils;

public class SupplierCountryMappingServiceImpl implements SupplierCountryMappingService {

    private static final Logger LOG = Logger.getLogger(SupplierCountryMappingServiceImpl.class);

    @Autowired
    private SupplierUtils supplierUtils;
    @Autowired
    private FlexibleSearchService flexibleSearchService;

    private static final String FILE_HEADER = "GlobalId,SupplierType,SupplierID,CountryCode,CountryName,Active";

    @Override
    public boolean getAllSupplierCountry() {
	try {
	    final CsvWriter csvWriter = this.getCsvWriter();

	    final SupplierCountryModel supplierCountryModelReq = new SupplierCountryModel();
	    supplierCountryModelReq.setActive(Boolean.TRUE);
	    final List<SupplierCountryModel> supplierCountryModelList = flexibleSearchService.getModelsByExample(supplierCountryModelReq);

	    if (supplierCountryModelList != null && !supplierCountryModelList.isEmpty()) {
		for (final SupplierCountryModel supplierCountryModel : supplierCountryModelList) {
		    writeSupplierCountryRecord(csvWriter, supplierCountryModel);
		}
	    }
	    csvWriter.close();
	    return true;
	} catch (final Exception e) {
	    LOG.info("#getAllSupplierCountry" + e.getMessage(), e);
	    return false;
	}
    }

    @Override
    public boolean mapUpdatedSupplierCountry(final SupplierCountryModel supplierCountryModelReq) {
	try {
	    final CsvWriter csvWriter = this.getCsvWriter();
	    final SupplierCountryModel supplierCountryModel = flexibleSearchService.getModelByExample(supplierCountryModelReq);
	    this.writeSupplierCountryRecord(csvWriter, supplierCountryModel);
	    csvWriter.close();
	    return true;
	} catch (final Exception e) {
	    LOG.info("#mapUpdatedSupplierCountry" + e.getMessage(), e);
	    return false;
	}
    }

    /**
     * @return csvWriter
     * @throws IOException
     */
    private CsvWriter getCsvWriter() throws IOException {
	final String mappingOutputFile = supplierUtils.getMappingOutputFile("country.mapping.path.key", "supplier_country_map_");
	final boolean alreadyExists = new File(mappingOutputFile).exists();
	final CsvWriter csvWriter = new CsvWriter(new FileWriter(mappingOutputFile, true), SupplierUtils.COMMA_DELIMITER);

	if (!alreadyExists) {
	    csvWriter.write(FILE_HEADER);
	    csvWriter.endRecord();
	}
	return csvWriter;
    }

    /**
     * @param csvOutput
     * @param supplierCountryModel
     * @throws IOException
     */
    private void writeSupplierCountryRecord(final CsvWriter csvOutput, final SupplierCountryModel supplierCountryModel) throws IOException {
	final Collection<com.cnk.travelogix.supplier.mappings.model.AbstractSupplierMappingModel> mappings = supplierCountryModel.getMappings();
	//final SupplierModel supplier = supplierCountryModel.getSupplier();
	for (final com.cnk.travelogix.supplier.mappings.model.AbstractSupplierMappingModel abstractSupplierMappingModel : mappings) {
	    if (abstractSupplierMappingModel instanceof SupplierCountryMappingModel) {
		final SupplierCountryMappingModel supplierCountryMappingModel = (SupplierCountryMappingModel) abstractSupplierMappingModel;
		/*final Collection<CountryModel> countries = supplierCountryMappingModel.getCountries();
		for (final CountryModel countryModel : countries) {
		    csvOutput.write(countryModel.getIsocode());
		    csvOutput.write(supplier.getSupplierType() != null ? supplier.getSupplierType().getCode() : null);
		    csvOutput.write(supplier.getCode());
		    csvOutput.write(supplierCountryModel.getCode());
		    csvOutput.write(countryModel.getName());
		    csvOutput.write(supplierCountryModel.getActive().toString());
		    csvOutput.endRecord();
		}*/
	    }
	}
    }
}
