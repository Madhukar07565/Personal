/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.common.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;

import org.apache.commons.collections4.CollectionUtils;
import org.opentravel.ota._2003._05.ErrorType;
import org.opentravel.ota._2003._05.ErrorsType;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.cnk.travelogix.commons.error.Error;
import com.cnk.travelogix.commons.error.Error.ErrorOrigin;
import com.cnk.travelogix.commons.error.handler.ErrorHandler;
import com.cnk.travelogix.suppliers.common.data.Credential;
import com.cnk.travelogix.suppliers.common.data.Credentials;
import com.cnk.travelogix.suppliers.common.data.OperationURL;
import com.cnk.travelogix.suppliers.common.data.SupplierCredentials;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.common.CredentialType;
import com.coxandkings.integ.suppl.common.CredentialsType;
import com.coxandkings.integ.suppl.common.ErrorListType;
import com.coxandkings.integ.suppl.common.OperationURLType;
import com.coxandkings.integ.suppl.common.OperationURLsType;
import com.coxandkings.integ.suppl.common.RequestHeader;
import com.coxandkings.integ.suppl.common.ResponseHeader;
import com.coxandkings.integ.suppl.common.SupplierCredentialsListType;
import com.coxandkings.integ.suppl.common.SupplierCredentialsType;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * @author I077988
 *
 */
public class BaseConverter {

	private static final Logger LOG = LoggerFactory.getLogger(BaseConverter.class);

	public static final String NAMESPACE_AIR = "http://www.coxandkings.com/integ/suppl/air";
	public static final String NAMESPACE_ACCO = "http://www.coxandkings.com/integ/suppl/acco";

	@Autowired
	private JAXBContext jaxbContext;


	@Autowired 
	private ErrorHandler integrationsErrorHandler;

	/**
	 * @param requestHeaderData
	 * @return OTA RequestHeader
	 */
	public RequestHeader populateRequestHeader(final com.cnk.travelogix.suppliers.common.data.RequestHeader requestHeaderData) {
		final RequestHeader requestHeader = new RequestHeader();
		requestHeader.setUserID(requestHeaderData.getUserID());
		requestHeader.setSessionID(requestHeaderData.getSessionID());
		requestHeader.setTransactionID(requestHeaderData.getTransactionID());
		final SupplierCredentialsListType supplierCredentials = new SupplierCredentialsListType();

		SupplierIDType supplierIDType;
		SupplierCredentialsType supplierCredentialsType;
		for (SupplierCredentials supplierCredentialsData : requestHeaderData.getSupplierCredentials()) {
			supplierIDType = new SupplierIDType();
			supplierCredentialsType = new SupplierCredentialsType();
			supplierIDType.setValue(supplierCredentialsData.getSupplierID().getValue());
			supplierIDType.setMarketType(supplierCredentialsData.getSupplierID().getMarketType());
			supplierCredentialsType.setSupplierID(supplierIDType);

			CredentialType credentialOne;
			final CredentialsType credentials = new CredentialsType();
			final Credentials credentialsData = supplierCredentialsData.getCredentials();
			for (Credential credentialData : credentialsData.getCredential()) {
				credentialOne = new CredentialType();
				credentialOne.setName(credentialData.getName());
				credentialOne.setValue(credentialData.getValue());
				credentialOne.setIsEncrypted(credentialData.getIsEncrypted());
				credentials.getCredential().add(credentialOne);
			}

			OperationURLType operationURL;
			final OperationURLsType operationURLsType = new OperationURLsType();
			for (OperationURL operationURLData : credentialsData.getOperationURL()) {
				operationURL = new OperationURLType();
				operationURL.setValue(operationURLData.getValue());
				operationURL.setOperation(operationURLData.getOperation());
				operationURLsType.getOperationURL().add(operationURL);
			}
			credentials.setOperationURLs(operationURLsType);
			supplierCredentialsType.setCredentials(credentials);
			supplierCredentials.getSupplierCredentials().add(supplierCredentialsType);
		}
		requestHeader.setSupplierCredentialsList(supplierCredentials);
		return requestHeader;
	}

	/**
	 * @param responseHeader
	 * @return ResponseHeader
	 */
	public com.cnk.travelogix.suppliers.common.data.ResponseHeader populateResponseHeader(final ResponseHeader responseHeader) {
		final com.cnk.travelogix.suppliers.common.data.ResponseHeader responseHeaderData = new com.cnk.travelogix.suppliers.common.data.ResponseHeader();
		responseHeaderData.setSessionID(responseHeader.getSessionID());
		responseHeaderData.setStatus(responseHeader.getStatus().toString());
		responseHeaderData.setTransactionID(responseHeader.getTransactionID());
		responseHeaderData.setUserID(responseHeader.getUserID());
		return responseHeaderData;
	}

	/**
	 * @param errors
	 * @return List<com.cnk.travelogix.suppliers.common.data.ErrorType>
	 */
	public List<com.cnk.travelogix.suppliers.common.data.ErrorType> getErrorsData(ErrorsType errors, String supplierId) {
		final List<com.cnk.travelogix.suppliers.common.data.ErrorType> errorsData = new ArrayList<>();
		if (errors != null) {
			final List<ErrorType> error = errors.getError();
			com.cnk.travelogix.suppliers.common.data.ErrorType errorData;
			for (ErrorType errorType : error) {
				errorData = new com.cnk.travelogix.suppliers.common.data.ErrorType();
				errorData.setType(errorType.getType());
				errorData.setCode(errorType.getCode());
				errorData.setShortText(errorType.getShortText());
				updateErrorData(errorData,supplierId);
				errorsData.add(errorData);

			}
		}
		return errorsData;
	}

	public List<com.cnk.travelogix.suppliers.common.data.ErrorType> getErrorsListData(ErrorListType errors, String supplierId) {
		final List<com.cnk.travelogix.suppliers.common.data.ErrorType> errorsData = new ArrayList<>();
		if (errors != null) {
			final List<com.coxandkings.integ.suppl.common.ErrorType> error = errors.getError();
			com.cnk.travelogix.suppliers.common.data.ErrorType errorData;

			for (com.coxandkings.integ.suppl.common.ErrorType errorType : error) {
				errorData = new com.cnk.travelogix.suppliers.common.data.ErrorType();
				errorData.setCode(errorType.getErrorCode());
				errorData.setShortText(errorType.getErrorMsg());
				updateErrorData(errorData,supplierId);
				errorsData.add(errorData);
			}
		}
		return errorsData;
	}

	private void updateErrorData(com.cnk.travelogix.suppliers.common.data.ErrorType errorData,String id) {
		
		Error commerceError = integrationsErrorHandler.handleError(populateErrorData(errorData,id));
		errorData.setCode(commerceError.getCode());
	}
	/**
	 * @param errors
	 * @return List<com.cnk.travelogix.suppliers.common.data.ErrorType>
	 */
	public List<com.cnk.travelogix.suppliers.common.data.ErrorType> getErrorsData(org.opentravel.ota._2003._05.OTAMessageQueueRS.Errors errors, String supplierId) {
		final List<com.cnk.travelogix.suppliers.common.data.ErrorType> errorsData = new ArrayList<>();
		if (errors != null) {
			final List<org.opentravel.ota._2003._05.OTAMessageQueueRS.Errors.Error> error = errors.getError();
			com.cnk.travelogix.suppliers.common.data.ErrorType errorData;
			for (org.opentravel.ota._2003._05.OTAMessageQueueRS.Errors.Error errorType : error) {
				errorData = new com.cnk.travelogix.suppliers.common.data.ErrorType();
				errorData.setCode(errorType.getCode());
				errorData.setMessage(errorType.getMessage());
				Error commerceError = integrationsErrorHandler.handleError(populateErrorData(errorData,supplierId));
				errorData.setCode(commerceError.getCode());
				errorsData.add(errorData);
			}
		}
		return errorsData;
	}
	
	/**
	 * @param errors
	 * @return List<com.cnk.travelogix.suppliers.common.data.ErrorType>
	 */
	public List<com.cnk.travelogix.suppliers.common.data.ErrorType> getErrorsData(ErrorsType errors) {
		final List<com.cnk.travelogix.suppliers.common.data.ErrorType> errorsData = new ArrayList<>();
		if (errors != null) {
			final List<ErrorType> error = errors.getError();
			com.cnk.travelogix.suppliers.common.data.ErrorType errorData;
			for (ErrorType errorType : error) {
				errorData = new com.cnk.travelogix.suppliers.common.data.ErrorType();
				errorData.setType(errorType.getType());
				errorData.setCode(errorType.getCode());
				errorData.setShortText(errorType.getShortText());
				errorsData.add(errorData);
			}
		}
		return errorsData;
	}

	public List<com.cnk.travelogix.suppliers.common.data.ErrorType> getErrorsListData(ErrorListType errors) {
		final List<com.cnk.travelogix.suppliers.common.data.ErrorType> errorsData = new ArrayList<>();
		if (errors != null) {
			final List<com.coxandkings.integ.suppl.common.ErrorType> error = errors.getError();
			com.cnk.travelogix.suppliers.common.data.ErrorType errorData;
			for (com.coxandkings.integ.suppl.common.ErrorType errorType : error) {
				errorData = new com.cnk.travelogix.suppliers.common.data.ErrorType();
				errorData.setCode(errorType.getErrorCode());
				errorData.setShortText(errorType.getErrorMsg());
				errorsData.add(errorData);
			}
		}
		return errorsData;
	}

	/**
	 * @param tpaExtensionsData
	 * @param elementNameSpace
	 * @return TPAExtensionsType
	 */
	public TPAExtensionsType getTPAExtensionsType(final TPAExtensions tpaExtensionsData, final String elementNameSpace) {
		final TPAExtensionsType tpaExtensions = new TPAExtensionsType();
		final Map<String, String> keyValuesMap = tpaExtensionsData.getKeyValueMap();
		if (keyValuesMap != null && !keyValuesMap.isEmpty()) {
			for (final Map.Entry<String, String> keyValueMap : keyValuesMap.entrySet()) {
				tpaExtensions.getAny().add(addNSElement(elementNameSpace, keyValueMap.getKey(), keyValueMap.getValue()));
			}
		}
		return tpaExtensions;
	}

	/**
	 * @param tpaExtensions
	 * @param elementTypes
	 * @return TPAExtensions
	 */
	public TPAExtensions getTPAExtensionsData(final TPAExtensionsType tpaExtensions, final List<String> elementTypes) {
		final TPAExtensions tpaExtensionsData = new TPAExtensions();
		if (!tpaExtensions.getAny().isEmpty()) {
			final Map<String, String> keyValuesMap = new HashMap<>();
			for (final Element element : tpaExtensions.getAny()) {
				if (elementTypes.contains(element.getLocalName())) {
					keyValuesMap.put(element.getLocalName(), element.getFirstChild().getNodeValue());
				}
			}
			tpaExtensionsData.setKeyValueMap(keyValuesMap);
		}
		return tpaExtensionsData;
	}

	/**
	 * @param date
	 * @return XMLGregorianCalendar
	 */
	public XMLGregorianCalendar toXMLGregorianCalendar(final Date date) {
		XMLGregorianCalendar xmlGrogerianCalendar = null;
		try {
			final GregorianCalendar gregorianCalendar = new GregorianCalendar();
			gregorianCalendar.setTime(date);
			xmlGrogerianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		} catch (Exception e) {
			LOG.warn("#toXMLGregorianCalendar Error: {}", e.getMessage(), e);
		}
		return xmlGrogerianCalendar;
	}

	/**
	 * @param xmlGregorianCalendar
	 * @return Date
	 */
	public Date getDateGregorianCalendar(final XMLGregorianCalendar xmlGregorianCalendar) {
		if (xmlGregorianCalendar == null) {
			return null;
		}
		return xmlGregorianCalendar.toGregorianCalendar().getTime();
	}

	/**
	 * @param date
	 * @return String
	 */
	public static String getDateAsString(Date date) {
		final DateFormat dateFormatObj = new SimpleDateFormat("yyyy-MM-dd");
		final String fomattedDate = dateFormatObj.format(date);
		LOG.debug("Formatted Date: {}", fomattedDate);
		return fomattedDate;
	}

	/**
	 * @param date
	 * @return Date
	 */
	public static Date getStringAsDate(String date) {
		final DateFormat dateFormatObj = new SimpleDateFormat("yyyy-MM-dd");
		Date fomattedDate = null;
		try {
			fomattedDate = dateFormatObj.parse(date);
		} catch (ParseException e) {
			LOG.warn("#getStringAsDate Error: {}", e.getMessage(), e);
		}
		LOG.debug("Formatted Date: {}", fomattedDate);
		return fomattedDate;
	}

	/**
	 * @param tagNS
	 * @param tagName
	 * @param tagValue
	 * @return Element
	 */
	public Element addNSElement(String tagNS, String tagName, String tagValue) {
		Element element = null;
		try {
			final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			element = document.createElementNS(tagNS, tagName);
			element.setTextContent(tagValue);
			document.appendChild(element);
		} catch (Exception e) {
			LOG.warn("#addNSElement Error: {}", e.getMessage(), e);
		}
		return element;
	}

	/**
	 * @param jaxbClass
	 * @param element
	 * @return jaxbClassObject
	 */
	public <T> T getJaxbObjectFromElement(final Class<T> jaxbClass, final Element element) {
		T jaxbClassObject = null;
		try {
			final DOMSource domSource = new DOMSource(element);
			final JAXBElement<T> jaxbElement = jaxbContext.createUnmarshaller().unmarshal(domSource, jaxbClass);
			jaxbClassObject = jaxbElement.getValue();
		} catch (Exception e) {
			LOG.warn("#getJaxbObjectFromElement Error: {}", e.getMessage(), e);
		}
		return jaxbClassObject;
	}

	/**
	 * @param jaxbClassObject
	 * @return Element
	 */
	public <T> Element getElementFromJaxbObject(final T jaxbClassObject) {
		Element element = null;
		try {
			final DOMResult domResult = new DOMResult();
			jaxbContext.createMarshaller().marshal(jaxbClassObject, domResult);
			element = ((Document) domResult.getNode()).getDocumentElement();
		} catch (Exception e) {
			LOG.warn("#getElementFromJaxbObject Error: {}", e.getMessage(), e);
		}
		return element;
	}

	protected boolean hasError(ErrorListType errorListType) {
		if (errorListType != null && CollectionUtils.size(errorListType.getError()) > 0) {
			return true;
		}
		return false;
	}
	private Error populateErrorData(com.cnk.travelogix.suppliers.common.data.ErrorType errorData,String id) {
		com.cnk.travelogix.commons.error.Error customError = new
				com.cnk.travelogix.commons.error.Error();
		customError.setCode(errorData.getCode());
		customError.setMessage(errorData.getMessage());
		customError.setId(id);
		customError.setOriginatingFrom(ErrorOrigin.SUPPLIERS);
		
		return customError;
	}
}
