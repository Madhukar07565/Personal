/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.service.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.supplier.mappings.model.AbstractSupplierMappingModel;
import com.cnk.travelogix.supplier.mappings.product.model.SupplierProductModel;
import com.cnk.travelogix.suppliers.service.SupplierProductMappingService;
import com.cnk.travelogix.suppliers.util.CsvWriter;
import com.cnk.travelogix.suppliers.util.SupplierUtils;

/**
 * @author I077988
 */
public class SupplierProductMappingServiceImpl implements SupplierProductMappingService {

    private static final Logger LOG = Logger.getLogger(SupplierProductMappingServiceImpl.class);

    @Autowired
    private SupplierUtils supplierUtils;
    @Autowired
    private FlexibleSearchService flexibleSearchService;

    private static final String FILE_HEADER = "SupplierID,SupplierName,SupplierType,ProductType,Active";

    @Override
    public boolean getAllSupplierProducts() {
	try {
	    final CsvWriter csvWriter = this.getCsvWriter();

	    final SupplierProductModel supplierProductModelReq = new SupplierProductModel();
	    supplierProductModelReq.setActive(Boolean.TRUE);
	    final List<SupplierProductModel> supplierProductModelList = flexibleSearchService.getModelsByExample(supplierProductModelReq);

	    for (SupplierProductModel supplierProductModel : supplierProductModelList) {
		this.writeSupplierProductRecord(csvWriter, supplierProductModel);
	    }
	    csvWriter.close();
	    return true;
	} catch (final Exception e) {
	    LOG.info("#getAllSupplierProducts" + e.getMessage(), e);
	    return false;
	}
    }

    @Override
    public boolean mapUpdatedSupplierProduct(final SupplierProductModel supplierProductModelReq) {
	try {
	    final CsvWriter csvWriter = this.getCsvWriter();
	    final SupplierProductModel supplierProductModel = flexibleSearchService.getModelByExample(supplierProductModelReq);
	    this.writeSupplierProductRecord(csvWriter, supplierProductModel);
	    csvWriter.close();
	    return true;
	} catch (final Exception e) {
	    LOG.info("#mapUpdatedSupplierProduct" + e.getMessage(), e);
	    return false;
	}
    }

    /**
     * @return csvWriter
     * @throws IOException
     */
    private CsvWriter getCsvWriter() throws IOException {
	final String mappingOutputFile = supplierUtils.getMappingOutputFile("product.mapping.path.key", "supplier_product_map_");
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
     * @param supplierProductModel
     * @throws IOException
     */
    private void writeSupplierProductRecord(final CsvWriter csvWriter, SupplierProductModel supplierProductModel) throws IOException {
	/*final Collection<AbstractSupplierMappingModel> mappings = supplierProductModel.getMappings();
	for (AbstractSupplierMappingModel abstractSupplierMappingModel : mappings) {
	    csvWriter.write(abstractSupplierMappingModel.getSupplier().getCode());
	    csvWriter.write(abstractSupplierMappingModel.getSupplier().getName());
	    csvWriter.write(abstractSupplierMappingModel.getSupplier().getSupplierType().getType());
	    csvWriter.write(supplierProductModel.getCode());
	    csvWriter.write(supplierProductModel.getActive().toString());
	    csvWriter.endRecord();
	}*/
    }

}
