package com.cnk.travelogix.suppliers.acco.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.ErrorType;
import org.opentravel.ota._2003._05.ErrorsType;
import org.opentravel.ota._2003._05.HotelResModifyRequestType;
import org.opentravel.ota._2003._05.HotelResModifyResponseType;
import org.opentravel.ota._2003._05.HotelResModifyType;
import org.opentravel.ota._2003._05.ServiceType.ServiceDetails;
import org.opentravel.ota._2003._05.ServicesType;
import org.opentravel.ota._2003._05.SpecialRequestType;
import org.opentravel.ota._2003._05.SpecialRequestType.SpecialRequest;
import org.opentravel.ota._2003._05.SuccessType;
import org.opentravel.ota._2003._05.UniqueIDType;

import com.cnk.travelogix.suppliers.acco.data.AncillaryBookingHotelResModifyRequest;
import com.cnk.travelogix.suppliers.acco.data.AncillaryBookingHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.AncillaryBookingHotelResModifyResponse;
import com.cnk.travelogix.suppliers.acco.data.AncillaryBookingHotelResModifyResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelResModify;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyRs;
import com.cnk.travelogix.suppliers.acco.data.HotelReservation;
import com.cnk.travelogix.suppliers.acco.data.ServiceType;
import com.cnk.travelogix.suppliers.acco.data.Success;
import com.cnk.travelogix.suppliers.acco.data.UniqueID;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRQWrapper;
import com.coxandkings.integ.suppl.acco.OTAHotelResModifyRSWrapper;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * Ancillary Booking Converter
 */
public class AncillaryBookingConverter extends AccoBaseConverter {

    /**
     * @param requestWrapperData
     * @return accoInterfaceRQ
     */
    public AccoInterfaceRQ toOTAHotelResModifyRQ(AncillaryBookingHotelResModifyRequestWrapper requestWrapperData) {
	final AccoInterfaceRQ accoInterfaceRQ = new AccoInterfaceRQ();
	final RequestBody requestBody = new RequestBody();
	OTAHotelResModifyRQWrapper requestWrapper;
	List<AncillaryBookingHotelResModifyRequest> passengers = requestWrapperData.getAncillaryBookingHotelResModifyRequest();
	for (AncillaryBookingHotelResModifyRequest request : passengers) {
	    requestWrapper = new OTAHotelResModifyRQWrapper();
	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(request.getSupplierID().getValue());
	    supplierIDType.setMarketType(request.getSupplierID().getMarketType());
	    requestWrapper.setSupplierID(supplierIDType);
	    requestWrapper.setSequence(request.getSequence());
	    HotelResModifyRequestType hotelResModifyRequestType = new HotelResModifyRequestType();
	    HotelResModify hotelResModify = request.getHotelResModifyRq();
	    hotelResModifyRequestType.setTarget(hotelResModify.getTarget());
	    hotelResModifyRequestType.setVersion(hotelResModify.getVersion());
	    hotelResModifyRequestType.setTransactionIdentifier(hotelResModify.getTransactionIdentifier());
	    List<UniqueIDType> uniqueIDTypes = getUniqueids(hotelResModify);
	    hotelResModifyRequestType.getUniqueID().addAll(uniqueIDTypes);
	    HotelResModifyType hotelResModifyType = new HotelResModifyType();
	    List<org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify> otaHotelModifyList = new ArrayList<>();
	    org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify otaHotelResModify = new org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify();
	    ServicesType serviceType = getAncillaryServices(hotelResModify);
	    if (!serviceType.getService().isEmpty())
		setAncillaryHotelModifyService(serviceType, otaHotelResModify);
	    otaHotelModifyList.add(otaHotelResModify);
	    hotelResModifyType.getHotelResModify().add(otaHotelResModify);
	    hotelResModifyRequestType.setHotelResModifies(hotelResModifyType);
	    requestWrapper.setOTAHotelResModifyRQ(hotelResModifyRequestType);
	    requestBody.getOTAHotelResModifyRQWrapper().add(requestWrapper);
	}
	accoInterfaceRQ.setRequestBody(requestBody);
	accoInterfaceRQ.setRequestHeader(populateRequestHeader(requestWrapperData.getRequestHeader()));
	return accoInterfaceRQ;
    }

    private void setAncillaryHotelModifyService(ServicesType serviceType, org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify otaHotelResModify) {
	if (serviceType.getService().get(0).getID() != null)
	    otaHotelResModify.setServices(serviceType);

    }

    /**
     * @param hotelResModify
     * @return otaServicesType
     */
    public org.opentravel.ota._2003._05.ServicesType getAncillaryServices(HotelResModify hotelResModify) {
	org.opentravel.ota._2003._05.ServicesType otaServicesType = new org.opentravel.ota._2003._05.ServicesType();
	List<HotelReservation> hotelReservations = hotelResModify.getHotelResModifies();
	List<org.opentravel.ota._2003._05.ServiceType> serviceTypeList = new ArrayList<>();
	for (HotelReservation hotelReservation : hotelReservations) {
	    List<ServiceType> serives = hotelReservation.getServices();
	    if (serives != null) {
		for (ServiceType serviceType : serives) {
		    org.opentravel.ota._2003._05.ServiceType otaServiceType = new org.opentravel.ota._2003._05.ServiceType();
		    otaServiceType.setID(serviceType.getId());
		    otaServiceType.setType(serviceType.getType());
		    com.cnk.travelogix.suppliers.acco.data.ServiceDetails serviceDatielsData = serviceType.getServiceDetails();
		    SpecialRequestType specialRequestType = new SpecialRequestType();
		    List<SpecialRequest> specialRequestList = new ArrayList<>();
		    List<com.cnk.travelogix.suppliers.acco.data.SpecialRequest> specialReqDataList = serviceDatielsData.getSpecialRequests();
		    setSpecialRequest(specialReqDataList, specialRequestList);
		    specialRequestType.getSpecialRequest().addAll(specialRequestList);
		    ServiceDetails otaServiceDeytails = new ServiceDetails();
		    otaServiceDeytails.setSpecialRequests(specialRequestType);
		    otaServiceType.setServiceDetails(otaServiceDeytails);
		    serviceTypeList.add(otaServiceType);
		}
	    }
	}
	otaServicesType.getService().addAll(serviceTypeList);
	return otaServicesType;
    }

    private void setSpecialRequest(List<com.cnk.travelogix.suppliers.acco.data.SpecialRequest> specialReqDataList, List<SpecialRequest> specialRequestList) {
	for (com.cnk.travelogix.suppliers.acco.data.SpecialRequest specialRequest : specialReqDataList) {
	    SpecialRequest otaSpecialRequest = new SpecialRequest();
	    otaSpecialRequest.setRequestCode(specialRequest.getRequestCode());
	    specialRequestList.add(otaSpecialRequest);
	}
    }

    /**
     * @param accoInterfaceRS
     * @return responseWrapper
     */
    public AncillaryBookingHotelResModifyResponseWrapper fromOTAHotelResModifyRS(AccoInterfaceRS accoInterfaceRS) {
	AncillaryBookingHotelResModifyResponseWrapper responseWrapper = new AncillaryBookingHotelResModifyResponseWrapper();

	AncillaryBookingHotelResModifyResponse ancillaryBookingHotelResModifyResponseData = null;
	List<AncillaryBookingHotelResModifyResponse> ancillaryBookingHotelResModifyResponsesData = new ArrayList<>();
	List<OTAHotelResModifyRSWrapper> otaHoteResRsWrapperList = accoInterfaceRS.getResponseBody().getOTAHotelResModifyRSWrapper();
	if (!hasError(accoInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAHotelResModifyRSWrapper otaHotelResModifyRSWrapper : otaHoteResRsWrapperList) {
		ancillaryBookingHotelResModifyResponseData = new AncillaryBookingHotelResModifyResponse();
		SupplierIDType supplierId = otaHotelResModifyRSWrapper.getSupplierID();
		ancillaryBookingHotelResModifyResponseData.setSupplierID(populateGetSupplierId(otaHotelResModifyRSWrapper.getSupplierID()));
		ancillaryBookingHotelResModifyResponseData.setSequence(otaHotelResModifyRSWrapper.getSequence());
		if (!hasError(otaHotelResModifyRSWrapper.getErrorList())) {
		    org.opentravel.ota._2003._05.HotelResModifyResponseType otaHotelResModifyResponseType = otaHotelResModifyRSWrapper.getOTAHotelResModifyRS();
		    HotelResModifyRs hotelResModifyRs = getAncillaryHotelModifyRS(otaHotelResModifyResponseType);
		    ancillaryBookingHotelResModifyResponseData.setHotelResModifyRs(hotelResModifyRs);
		}
		ancillaryBookingHotelResModifyResponseData.setErrors(getErrorsListData(otaHotelResModifyRSWrapper.getErrorList(), supplierId.getValue()));
		ancillaryBookingHotelResModifyResponsesData.add(ancillaryBookingHotelResModifyResponseData);
	    }
	}
	responseWrapper.getAncillaryBookingHotelResModifyResponse().add(ancillaryBookingHotelResModifyResponseData);
	responseWrapper.setResponseHeader(populateResponseHeader(accoInterfaceRS.getResponseHeader()));
	responseWrapper.setErrors(getErrorsListData(accoInterfaceRS.getResponseBody().getErrorList()));

	return responseWrapper;
    }

    private HotelResModifyRs getAncillaryHotelModifyRS(HotelResModifyResponseType otaHotelResModifyResponseType) {
	HotelResModifyRs hotelResModifyRs = new HotelResModifyRs();
	hotelResModifyRs.setTarget(otaHotelResModifyResponseType.getTarget());
	hotelResModifyRs.setTransactionIdentifier(otaHotelResModifyResponseType.getTransactionIdentifier());
	hotelResModifyRs.setVersion(otaHotelResModifyResponseType.getVersion());
	Object successType = otaHotelResModifyResponseType.getSuccess();
	if (successType instanceof SuccessType)
	    hotelResModifyRs.setSuccess((Success) successType);
	ErrorsType errors = otaHotelResModifyResponseType.getErrors();
	List<ErrorType> error = errors.getError();
	List<com.cnk.travelogix.suppliers.common.data.ErrorType> errorTypesList = new ArrayList<>();
	for (ErrorType errorType : error) {
	    com.cnk.travelogix.suppliers.common.data.ErrorType errorData = new com.cnk.travelogix.suppliers.common.data.ErrorType();
	    errorData.setType(errorType.getType());
	    errorData.setCode(errorType.getCode());
	    errorData.setShortText(errorType.getShortText());
	    errorTypesList.add(errorData);
	}
	hotelResModifyRs.setErrors(errorTypesList);

	HotelResModifyType hotelResModifyType = otaHotelResModifyResponseType.getHotelResModifies();
	List<HotelReservation> hotelReservationsDataList = new ArrayList<>();
	List<org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify> hotelResModifyList = hotelResModifyType.getHotelResModify();
	for (org.opentravel.ota._2003._05.HotelResModifyType.HotelResModify hotelResModify : hotelResModifyList) {
	    HotelReservation hotelReservationData = new HotelReservation();
	    List<UniqueIDType> uniqueidtypeList = hotelResModify.getUniqueID();
	    List<UniqueID> uniqueIdList = new ArrayList<>();
	    for (UniqueIDType uniqueIDType : uniqueidtypeList) {
		UniqueID uniqueID = new UniqueID();
		uniqueID.setId(uniqueIDType.getID());
		uniqueID.setType(uniqueIDType.getType());
		uniqueIdList.add(uniqueID);
	    }
	    hotelReservationData.setUniqueID(uniqueIdList);
	    hotelReservationsDataList.add(hotelReservationData);
	}
	hotelResModifyRs.setHotelResModifies(hotelReservationsDataList);

	return hotelResModifyRs;
    }

}
