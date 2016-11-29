/**
 * 
 */
package com.cnk.travelogix.common.core.si.converters.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightGetAvailabilityAndFareRequest;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchRequest;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;


/**
 * @author i317604
 *
 */
public class RequestHeaderPopulator implements Populator<SvcIntFlightGetAvailabilityAndFareRequest, AirLowFareSearchRequest>
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(SvcIntFlightGetAvailabilityAndFareRequest source, AirLowFareSearchRequest target) throws ConversionException
	{
		final RequestHeader requestHeader = new RequestHeader();
		
		requestHeader.setSessionID("Sabre_1");
		requestHeader.setUserID("PERF");
		requestHeader.setTransactionID("Search_1");

		List<SupplierCredentials> supplierCredentials = new ArrayList<SupplierCredentials>();
		SupplierCredentials supplierCredential = new SupplierCredentials();
		SupplierID supplierID = new SupplierID();
		supplierID.setValue("SABRE");
		supplierCredential.setSupplierID(supplierID);

		Credentials credentials = new Credentials();
		credentials.setCredential(createCredentialList());

		List<OperationURL> operationURLList = new ArrayList<>();
		OperationURL operationURL = new OperationURL();
		operationURL.setValue("https://sws3-crt.cert.sabre.com/");
		operationURL.setOperation("all");
		operationURLList.add(operationURL);
		credentials.setOperationURL(operationURLList);

		supplierCredential.setCredentials(credentials);
		supplierCredentials.add(supplierCredential);
		requestHeader.setSupplierCredentials(supplierCredentials);
		
		target.setRequestHeader(requestHeader);
	}

	/**
	 * Create credential list.
	 * 
	 * @return credential list
	 */
	private List<Credential> createCredentialList()
	{
		List<Credential> credentialList = new ArrayList<>();
		credentialList.add(createCredential("Username", "SBj3tNir+Ko="));
		credentialList.add(createCredential("Password", "eq7vMf+HQB4="));
		credentialList.add(createCredential("Organization", "uKsgtv3gvfM="));
		credentialList.add(createCredential("PseudoCityCode", "uKsgtv3gvfM="));
		credentialList.add(createCredential("CompanyCode", "GrPsFOYmmr4="));

		return credentialList;
	}

	/**
	 * Create credential.
	 * 
	 * @param name
	 * @param value
	 * @return credential
	 */
	private Credential createCredential(final String name, final String value)
	{
		Credential credential = new Credential();
		credential.setName(name);
		credential.setValue(value);
		credential.setIsEncrypted(Boolean.TRUE);
		return credential;
	}

}
