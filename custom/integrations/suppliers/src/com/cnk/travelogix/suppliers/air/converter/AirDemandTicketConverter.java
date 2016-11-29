/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.air.converter;

import java.util.ArrayList;
import java.util.List;

import org.opentravel.ota._2003._05.OTAAirDemandTicketRQ;
import org.opentravel.ota._2003._05.OTAAirDemandTicketRQ.DemandTicketDetail;
import org.opentravel.ota._2003._05.OTAAirDemandTicketRQ.DemandTicketDetail.Commission;
import org.opentravel.ota._2003._05.OTAAirDemandTicketRQ.DemandTicketDetail.PaymentInfo;
import org.opentravel.ota._2003._05.OTAAirDemandTicketRS;
import org.opentravel.ota._2003._05.POSType;
import org.opentravel.ota._2003._05.SourceType;
import org.opentravel.ota._2003._05.TPAExtensionsType;
import org.opentravel.ota._2003._05.UniqueIDType;

import com.cnk.travelogix.suppliers.air.data.AirDemandTicketRS;
import com.cnk.travelogix.suppliers.air.data.AirDemandTicketRequest;
import com.cnk.travelogix.suppliers.air.data.AirDemandTicketRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirDemandTicketResponse;
import com.cnk.travelogix.suppliers.air.data.AirDemandTicketResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.BookingReferenceID;
import com.cnk.travelogix.suppliers.air.data.UniqueID;
import com.cnk.travelogix.suppliers.common.data.TPAExtensions;
import com.coxandkings.integ.suppl.air.OTAAirDemandTicketRQWrapper;
import com.coxandkings.integ.suppl.air.OTAAirDemandTicketRSWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ.RequestBody;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;
import com.coxandkings.integ.suppl.common.SupplierIDType;

/**
 * @author I077988
 *
 */
public class AirDemandTicketConverter extends AirBaseConverter {

    /**
     * @param requestWrapperData
     * @return AirInterfaceRQ
     */
    public AirInterfaceRQ toOTAAirDemandTicketRQ(final AirDemandTicketRequestWrapper requestWrapperData) {
	final AirInterfaceRQ airInterfaceRQ = new AirInterfaceRQ();
	final RequestBody requestBody = new RequestBody();

	OTAAirDemandTicketRQWrapper requestWrapper;
	final List<AirDemandTicketRequest> airDemandTickets = requestWrapperData.getAirDemandTickets();
	for (AirDemandTicketRequest request : airDemandTickets) {

	    requestWrapper = new OTAAirDemandTicketRQWrapper();

	    final SupplierIDType supplierIDType = new SupplierIDType();
	    supplierIDType.setValue(request.getSupplierID().getValue());
	    supplierIDType.setMarketType(request.getSupplierID().getMarketType());
	    requestWrapper.setSupplierID(supplierIDType);

	    final OTAAirDemandTicketRQ otaAirDemandTicketRQ = new OTAAirDemandTicketRQ();
	    otaAirDemandTicketRQ.setVersion(request.getVersion());
	    otaAirDemandTicketRQ.setTarget(request.getTarget());

	    final POSType pos = new POSType();
	    final SourceType sourceType = new SourceType();
	    pos.getSource().add(sourceType);
	    otaAirDemandTicketRQ.setPOS(pos);

	    com.cnk.travelogix.suppliers.air.data.DemandTicketDetail demandTicketDetailData = request.getDemandTicketDetail();
	    final DemandTicketDetail demandTicketDetail = new DemandTicketDetail();

	    UniqueID bookingReferenceIDData = demandTicketDetailData.getBookingReferenceID();
	    final UniqueIDType uniqueId = new UniqueIDType();
	    uniqueId.setID(bookingReferenceIDData.getId());
	    uniqueId.setType(bookingReferenceIDData.getType());
	    demandTicketDetail.setBookingReferenceID(uniqueId);

	    List<com.cnk.travelogix.suppliers.air.data.PaymentInfo> paymentInfos = demandTicketDetailData.getPaymentInfo();
	    for (com.cnk.travelogix.suppliers.air.data.PaymentInfo paymentInfo : paymentInfos) {
		PaymentInfo paymentInfoType = new PaymentInfo();
		paymentInfoType.setPaymentType(paymentInfo.getPaymentType());
		demandTicketDetail.getPaymentInfo().add(paymentInfoType);
	    }

	    List<com.cnk.travelogix.suppliers.air.data.Commission> commissionsData = demandTicketDetailData.getCommission();
	    for (com.cnk.travelogix.suppliers.air.data.Commission commissionData : commissionsData) {
		Commission commission = new Commission();
		commission.setPercent(commissionData.getPercent());
		commission.setAmount(commissionData.getAmount());
		demandTicketDetail.getCommission().add(commission);
	    }
	    final TPAExtensions tpaExtensionsData = demandTicketDetailData.getTpaExtensions();
	    if (tpaExtensionsData != null) {
		final TPAExtensionsType tpaExtensionsType = getTPAExtensionsType(tpaExtensionsData, NAMESPACE_AIR);
		demandTicketDetail.setTPAExtensions(tpaExtensionsType);
	    }

	    otaAirDemandTicketRQ.setDemandTicketDetail(demandTicketDetail);
	    requestBody.getOTAAirDemandTicketRQWrapper().add(requestWrapper);
	}
	airInterfaceRQ.setRequestBody(requestBody);
	airInterfaceRQ.setRequestHeader(populateRequestHeader(null));
	return airInterfaceRQ;
    }

    /**
     * @param airInterfaceRS
     *            AirInterfaceRS
     * @return AirDemandTicketResponseWrapper
     */
    public AirDemandTicketResponseWrapper fromOTAAirDemandTicketRS(final AirInterfaceRS airInterfaceRS) {
	final AirDemandTicketResponseWrapper airDemandTicketResponseWrapper = new AirDemandTicketResponseWrapper();
	AirDemandTicketResponse airDemandTicketResData;
	final List<AirDemandTicketResponse> airDemandTicketResesData = new ArrayList<>();
	final List<OTAAirDemandTicketRSWrapper> otaAirDemandTicketRSWrapperList = airInterfaceRS.getResponseBody().getOTAAirDemandTicketRSWrapper();
	if (!hasError(airInterfaceRS.getResponseBody().getErrorList())) {
	    for (OTAAirDemandTicketRSWrapper requestWrapper : otaAirDemandTicketRSWrapperList) {
		airDemandTicketResData = new AirDemandTicketResponse();
		airDemandTicketResData.setSupplierID(populateGetSupplierId(requestWrapper.getSupplierID()));
		String supplierId = requestWrapper.getSupplierID().getValue();
		airDemandTicketResData.setSequence(requestWrapper.getSequence());
		if (!hasError(requestWrapper.getErrorList())) {
		    final AirDemandTicketRS airDemandTicketRSData = new AirDemandTicketRS();
		    final OTAAirDemandTicketRS otaAirDemandTicketRS = requestWrapper.getOTAAirDemandTicketRS();
		    airDemandTicketResData.setErrors(getErrorsData(otaAirDemandTicketRS.getErrors(), supplierId));
		    final BookingReferenceID bookingReferenceID = new BookingReferenceID();
		    bookingReferenceID.setId(otaAirDemandTicketRS.getBookingReferenceID().getID());
		    bookingReferenceID.setType(otaAirDemandTicketRS.getBookingReferenceID().getType());
		    airDemandTicketRSData.setBookingReferenceID(bookingReferenceID);
		    airDemandTicketResData.setAirDemandTicketRS(airDemandTicketRSData);
		}
		airDemandTicketResData.setErrors(getErrorsListData(requestWrapper.getErrorList(), supplierId));
		airDemandTicketResesData.add(airDemandTicketResData);
	    }
	}
	airDemandTicketResponseWrapper.setAirDemandTicketResponses(airDemandTicketResesData);
	airDemandTicketResponseWrapper.setResponseHeader(populateResponseHeader(airInterfaceRS.getResponseHeader()));
	airDemandTicketResponseWrapper.setErrors(getErrorsListData(airInterfaceRS.getResponseBody().getErrorList()));

	return airDemandTicketResponseWrapper;
    }
}
