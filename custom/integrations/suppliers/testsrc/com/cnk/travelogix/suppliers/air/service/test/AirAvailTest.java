package com.cnk.travelogix.suppliers.air.service.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnk.travelogix.suppliers.air.data.AirAvailRQ;
import com.cnk.travelogix.suppliers.air.data.AirAvailRequest;
import com.cnk.travelogix.suppliers.air.data.AirAvailRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirAvailResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.OriginDestinationInformation;
import com.cnk.travelogix.suppliers.air.service.SupplierAirService;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.POSType;
import com.cnk.travelogix.suppliers.common.data.RequestHeader;
import com.cnk.travelogix.suppliers.common.data.SourceType;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.SupplierID;

/**
 * @author I077988
 *
 */
public class AirAvailTest {
    /**
     * @param args
     */
    public static void main(String[] args) {

	@SuppressWarnings("resource")
	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "suppliers-spring.xml" });
	SupplierAirService airService = (SupplierAirService) appContext.getBean("supplierAirService");

	final AirAvailRequestWrapper airAvailRequestWrapper = new AirAvailRequestWrapper();
	RequestHeader requestHeader = new RequestHeader();
	requestHeader.setSessionID("20160717T1347");
	requestHeader.setUserID("Venkatesh");
	requestHeader.setTransactionID("1347");

	Map<String, String> credentialsMap = new HashMap<String, String>();
	credentialsMap.put("Username", "1000");
	credentialsMap.put("Password", "table55");
	credentialsMap.put("Organization", "L7H8");
	credentialsMap.put("PseudoCityCode", "L7H8");
	credentialsMap.put("CompanyCode", "TN");

	List<SupplierCredentials> supplierCredentials = new ArrayList<SupplierCredentials>();
	SupplierCredentials supplierCredential = new SupplierCredentials();
	SupplierID supplierIDHeader = new SupplierID();
	supplierIDHeader.setValue("SABRE");
	supplierCredential.setSupplierID(supplierIDHeader);

	Credentials credentials = new Credentials();

	List<Credential> credentialList = new ArrayList<>();
	for (final Map.Entry<String, String> keyValueMap : credentialsMap.entrySet()) {
	    Credential credential = new Credential();
	    credential.setName(keyValueMap.getKey());
	    credential.setValue(keyValueMap.getValue());
	    credentialList.add(credential);
	}
	credentials.setCredential(credentialList);

	List<OperationURL> operationURLList = new ArrayList<>();
	OperationURL operationURL = new OperationURL();
	operationURL.setValue("https://sws3-crt.cert.sabre.com/");
	operationURL.setOperation("all");
	operationURLList.add(operationURL);
	credentials.setOperationURL(operationURLList);

	supplierCredential.setCredentials(credentials);
	supplierCredentials.add(supplierCredential);
	requestHeader.setSupplierCredentials(supplierCredentials);
	airAvailRequestWrapper.setRequestHeader(requestHeader);

	final List<AirAvailRequest> airAvailRequestList = new ArrayList<>();
	final AirAvailRequest airAvailRequest = new AirAvailRequest();
	final SupplierID supplierID = new SupplierID();
	supplierID.setValue("Sabre");
	airAvailRequest.setSupplierID(supplierID);
	airAvailRequest.setSequence(1);
	final AirAvailRQ airAvailRQ = new AirAvailRQ();
	airAvailRQ.setVersion(new BigDecimal("1.0"));
	airAvailRQ.setTarget("Test");
	final POSType posType = new POSType();
	List<SourceType> sourceTypeList = new ArrayList<>();
	final SourceType sourceType = new SourceType();
	sourceTypeList.add(sourceType);
	posType.setSource(sourceTypeList);
	airAvailRQ.setPos(posType);

	final List<OriginDestinationInformation> originDestinationInformationList = new ArrayList<>();
	final OriginDestinationInformation originDestinationInformation = new OriginDestinationInformation();
	originDestinationInformation.setRph("1");
	originDestinationInformation.setDepartureDateTime("2016-07-29");
	originDestinationInformation.setDestinationLocationCode("DEL");
	originDestinationInformation.setOriginLocationCode("BOM");
	originDestinationInformationList.add(originDestinationInformation);
	airAvailRQ.setOriginDestinationInformation(originDestinationInformationList);

	airAvailRequest.setAirAvailRQ(airAvailRQ);
	airAvailRequestList.add(airAvailRequest);
	airAvailRequestWrapper.setAirAvailRequest(airAvailRequestList);

	final AirAvailResponseWrapper response = airService.otaGetAvailability(airAvailRequestWrapper);
	System.out.println("Response : " + response.toString());
	System.out.println("Success");
    }
}
