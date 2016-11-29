/**
 *
 */
package com.cnk.travelogix.supplier.credentials.facade.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.cnk.travelogix.supplier.credentials.core.model.SupplierCredentialsModel;
import com.cnk.travelogix.supplier.credentials.data.SupplierCredentialsData;
import com.cnk.travelogix.supplier.credentials.facade.SupplierCredentialsFacade;

/**
 * This facade class manages supplier credentials related functionalities
 * 
 * @author I077988
 *
 */
public class SupplierCredentialsFacadeImpl implements SupplierCredentialsFacade {

    private static final Logger LOG = Logger.getLogger(SupplierCredentialsFacadeImpl.class);

    @Resource(name = "flexibleSearchService")
    private FlexibleSearchService flexibleSearchService;

    @Autowired
    @Qualifier("supplierCredentialsConverter")
    private Converter<SupplierCredentialsModel, SupplierCredentialsData> supplierCredentialsConverter;

    @Override
    public SupplierCredentialsData getSupplierCredentialsById(final String supplierCredId) {
	LOG.info("#getSupplierCredentialsById - Start");
	SupplierCredentialsModel supplierCredentialsModel = new SupplierCredentialsModel();
	supplierCredentialsModel.setCode(supplierCredId);
	supplierCredentialsModel = flexibleSearchService.getModelByExample(supplierCredentialsModel);
	final SupplierCredentialsData supplierCredentialsData = supplierCredentialsConverter.convert(supplierCredentialsModel);
	LOG.info("#getSupplierCredentialsById - Finish");
	return supplierCredentialsData;
    }
}