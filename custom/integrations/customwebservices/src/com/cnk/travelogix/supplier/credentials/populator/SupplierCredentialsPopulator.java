package com.cnk.travelogix.supplier.credentials.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.core.util.CryptoUtil;
import com.cnk.travelogix.supplier.credentials.core.model.SupplierCredentialsModel;
import com.cnk.travelogix.supplier.credentials.data.CredentialsData;
import com.cnk.travelogix.supplier.credentials.data.SupplierCredentialsData;

/**
 * Class populate information from SupplierCredentialsModel to
 * SupplierCredentialsData
 */
public class SupplierCredentialsPopulator implements Populator<SupplierCredentialsModel, SupplierCredentialsData> {
    
    @Autowired
    private CryptoUtil cryptoUtil;

    @Override
    public void populate(final SupplierCredentialsModel source, final SupplierCredentialsData target) throws ConversionException {
	/*target.setSupplierID(source.getSupplier().getCode());
	final CredentialsData credentials = new CredentialsData();
	if (source.getCredentialsInfo() instanceof GDSCredentialInfoModel) {
	    final GDSCredentialInfoModel credInfoModel = (GDSCredentialInfoModel) source.getCredentialsInfo();
	    credentials.setName(credInfoModel.getLoginId());
	    credentials.setValue(cryptoUtil.encrypt(credInfoModel.getPassword()));
	    credentials.setOperationURL(credInfoModel.getEndPointUrl());
	    credentials.setIsEncrypted(Boolean.TRUE);
	}
	target.setCredentials(credentials);*/
    }
}