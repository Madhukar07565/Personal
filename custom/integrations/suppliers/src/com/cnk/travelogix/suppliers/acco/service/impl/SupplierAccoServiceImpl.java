/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.suppliers.acco.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.suppliers.acco.converter.AccoCreateBookingConverter;
import com.cnk.travelogix.suppliers.acco.converter.AddPassengerConverter;
import com.cnk.travelogix.suppliers.acco.converter.AddRoomConverter;
import com.cnk.travelogix.suppliers.acco.converter.AncillaryBookingConverter;
import com.cnk.travelogix.suppliers.acco.converter.AvailabilityAndPriceConverter;
import com.cnk.travelogix.suppliers.acco.converter.CancelPassengerConverter;
import com.cnk.travelogix.suppliers.acco.converter.CancelRoomConverter;
import com.cnk.travelogix.suppliers.acco.converter.ChangePeriodOfStayConverter;
import com.cnk.travelogix.suppliers.acco.converter.GetDetailsConverter;
import com.cnk.travelogix.suppliers.acco.converter.GetPoliciesConverter;
import com.cnk.travelogix.suppliers.acco.converter.HotelCancelConverter;
import com.cnk.travelogix.suppliers.acco.converter.OnRequestBookingUpdateConverter;
import com.cnk.travelogix.suppliers.acco.converter.RePricingConverter;
import com.cnk.travelogix.suppliers.acco.converter.RetrieveBookingConverter;
import com.cnk.travelogix.suppliers.acco.converter.RetrieveBookingListConverter;
import com.cnk.travelogix.suppliers.acco.converter.UpdatePassengerConverter;
import com.cnk.travelogix.suppliers.acco.converter.UpdateRoomConverter;
import com.cnk.travelogix.suppliers.acco.data.AddRoomHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.AddRoomHotelResModifyResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.AncillaryBookingHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.AncillaryBookingHotelResModifyResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.CancelHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.CancelHotelResModifyResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.CancelRoomRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.CancelRoomResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.ChangePeriodOfStayHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.ChangePeriodOfStayHotelResModifyResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.CreateBookingRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.GetDetailsRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.GetDetailsResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.GetPoliciesRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.GetPoliciesResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelAvailRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelAvailResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelCancelResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelCancelWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelResModifyResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.HotelResResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.OnRequestBookingUpdateRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.OnRequestBookingUpdateResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.RePricingRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.RePricingResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingListRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingListResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.RetrieveBookingWrapper;
import com.cnk.travelogix.suppliers.acco.data.UpdateHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.UpdateHotelResModifyResponseWrapper;
import com.cnk.travelogix.suppliers.acco.data.UpdateRoomHotelResModifyRequestWrapper;
import com.cnk.travelogix.suppliers.acco.data.UpdateRoomHotelResModifyResponseWrapper;
import com.cnk.travelogix.suppliers.acco.service.SupplierAccoService;
import com.cnk.travelogix.suppliers.client.SupplierClient;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.cnk.travelogix.suppliers.acco.converter.AccoCreateBookingConverter;
import de.hybris.platform.servicelayer.config.ConfigurationService;

/**
 * @author I077988
 */
public class SupplierAccoServiceImpl implements SupplierAccoService {

    private static final Logger LOG = LoggerFactory.getLogger(SupplierAccoServiceImpl.class);

    @Autowired(required = true)
    private SupplierClient supplierClient;
    @Autowired
    private ConfigurationService configurationService;

    @Autowired
    private RePricingConverter rePricing;
    @Autowired
    private AddRoomConverter addRoomConverter;
    @Autowired
    private GetDetailsConverter getDetailsConverter;
    @Autowired
    private UpdateRoomConverter updateRoomConverter;
    @Autowired(required = true)
    private CancelRoomConverter cancelRoomConverter;
    @Autowired(required = true)
    private GetPoliciesConverter getPoliciesConverter;
    @Autowired(required = true)
    private HotelCancelConverter hotelCancelConverter;
    @Autowired(required = true)
    private AddPassengerConverter addPassengerConverter;
    @Autowired(required = true)
    private UpdatePassengerConverter updatePassengerConverter;
    @Autowired(required = true)
    private CancelPassengerConverter cancelPassengerConverter;
    @Autowired(required = true)
    private RetrieveBookingConverter retrieveBookingConverter;
    @Autowired
    private AncillaryBookingConverter ancillaryBookingConverter;
    @Autowired
    private AccoCreateBookingConverter accoCreateBookingConverter;
    @Autowired
    private ChangePeriodOfStayConverter changePeriodOfStayConverter;
    @Autowired(required = true)
    private RetrieveBookingListConverter retrieveBookingListConverter;
    @Autowired(required = true)
    private AvailabilityAndPriceConverter availabilityAndPriceConverter;
    @Autowired(required = true)
    private OnRequestBookingUpdateConverter onRequestBookingUpdateConverter;

    @Override
    public HotelAvailResponseWrapper otaAccoGetAvailabilityAndPrice(HotelAvailRequestWrapper request) {
	LOG.info("#otaAccoGetAvailabilityAndPrice - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoGetAvailabilityAndPrice.url");
	final AccoInterfaceRQ accoInterfaceRQ = availabilityAndPriceConverter.toOTAHotelAvailRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	HotelAvailResponseWrapper response = availabilityAndPriceConverter.fromOTAHotelAvailRS(accoInterfaceRS);
	LOG.info("#otaAccoGetAvailabilityAndPrice - Finish");
	return response;
    }

    @Override
    public GetDetailsResponseWrapper otaAccoGetDetails(GetDetailsRequestWrapper request) {
	LOG.info("#otaAccoGetDetails - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoGetDetails.url");
	final AccoInterfaceRQ accoInterfaceRQ = getDetailsConverter.toOTAGetDetailRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	GetDetailsResponseWrapper response = getDetailsConverter.fromOTAGetDetailRS(accoInterfaceRS);
	LOG.info("#otaAccoGetDetails - Finish");
	return response;
    }

    @Override
    public RePricingResponseWrapper otaAccoRepricing(RePricingRequestWrapper request) {
	LOG.info("#otaAccoRepricing - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoRepricing.url");
	final AccoInterfaceRQ accoInterfaceRQ = rePricing.toOTARePricingRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	RePricingResponseWrapper response = rePricing.fromOTARePricingRS(accoInterfaceRS);
	LOG.info("#otaAccoRepricing - Finish");
	return response;

    }

    @Override
    public GetPoliciesResponseWrapper otaAccoGetPolicies(GetPoliciesRequestWrapper request) {
	LOG.info("#otaAccoGetPolicies - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoGetPolicies.url");
	final AccoInterfaceRQ accoInterfaceRQ = getPoliciesConverter.toOTAHotelGetCancellationPolicyRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	GetPoliciesResponseWrapper response = getPoliciesConverter.fromOTAHotelGetCancellationPolicyRS(accoInterfaceRS);
	LOG.info("#otaAccoGetPolicies - Finish");
	return response;
    }

    @Override
    public HotelResResponseWrapper otaAccoCreateBooking(final CreateBookingRequestWrapper request) {
	LOG.info("#otaAccoCreateBooking - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoCreateBooking.url");
	final AccoInterfaceRQ accoInterfaceRQ = accoCreateBookingConverter.toOTAHotelResRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	final HotelResResponseWrapper response = accoCreateBookingConverter.fromOTAHotelResRS(accoInterfaceRS);
	LOG.info("#otaAccoCreateBooking - Finish");
	return response;
    }

    @Override
    public HotelCancelResponseWrapper otaAccoCancelBooking(HotelCancelWrapper request) {
	LOG.info("#otaAccoCancelBooking - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoCancelBooking.url");
	final AccoInterfaceRQ accoInterfaceRQ = hotelCancelConverter.toOTACancelRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	HotelCancelResponseWrapper response = hotelCancelConverter.fromOTACancelRS(accoInterfaceRS);
	LOG.info("#otaAccoCancelBooking - Finish");
	return response;
    }

    @Override
    public RetrieveBookingResponseWrapper otaAccoRetrieveBooking(RetrieveBookingWrapper request) {
	LOG.info("#otaAccoRetrieveBooking - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoRetrieveBooking.url");
	final AccoInterfaceRQ accoInterfaceRQ = retrieveBookingConverter.toOTAReadRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	RetrieveBookingResponseWrapper response = retrieveBookingConverter.fromOTAReadRS(accoInterfaceRS);
	LOG.info("#otaAccoRetrieveBooking - Finish");
	return response;
    }

    @Override
    public RetrieveBookingListResponseWrapper otaAccoRetrieveBookingList(RetrieveBookingListRequestWrapper request) {
	LOG.info("#otaAccoRetrieveBookingList - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoRetrieveBookingList.url");
	final AccoInterfaceRQ accoInterfaceRQ = retrieveBookingListConverter.toOTAReadRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	RetrieveBookingListResponseWrapper response = retrieveBookingListConverter.fromOTAReadRS(accoInterfaceRS);
	LOG.info("#otaAccoRetrieveBookingList - Finish");
	return response;
    }

    @Override
    public HotelResModifyResponseWrapper otaAccoAddPassenger(HotelResModifyRequestWrapper request) {
	LOG.info("#otaAccoAddPassenger - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoAddPassenger.url");
	final AccoInterfaceRQ accoInterfaceRQ = addPassengerConverter.toOTAHotelResModifyRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	HotelResModifyResponseWrapper response = addPassengerConverter.fromOTAHotelResModifyRS(accoInterfaceRS);
	LOG.info("#otaAccoAddPassenger - Finish");
	return response;
    }

    @Override
    public UpdateHotelResModifyResponseWrapper otaAccoUpdatePassenger(UpdateHotelResModifyRequestWrapper request) {
	LOG.info("#otaAccoUpdatePassenger - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoUpdatePassenger.url");
	final AccoInterfaceRQ accoInterfaceRQ = updatePassengerConverter.toOTAHotelResModifyRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	UpdateHotelResModifyResponseWrapper response = updatePassengerConverter.fromOTAHotelResModifyRS(accoInterfaceRS);
	LOG.info("#otaAccoUpdatePassenger - Finish");
	return response;
    }

    @Override
    public CancelHotelResModifyResponseWrapper otaAccoCancelPassenger(CancelHotelResModifyRequestWrapper request) {
	LOG.info("#otaAccoCancelPassenger - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoCancelPassenger.url");
	final AccoInterfaceRQ accoInterfaceRQ = cancelPassengerConverter.toOTAHotelResModifyRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	CancelHotelResModifyResponseWrapper response = cancelPassengerConverter.fromOTAHotelResModifyRS(accoInterfaceRS);
	LOG.info("#otaAccoCancelPassenger - Finish");
	return response;
    }

    @Override
    public AddRoomHotelResModifyResponseWrapper otaAccoAddRoom(AddRoomHotelResModifyRequestWrapper request) {
	LOG.info("#otaAccoAddRoom - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoAddRoom.url");
	final AccoInterfaceRQ accoInterfaceRQ = addRoomConverter.toOTAHotelResModifyRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	AddRoomHotelResModifyResponseWrapper response = addRoomConverter.fromOTAHotelResModifyRS(accoInterfaceRS);
	LOG.info("#otaAccoAddRoom - Finish");
	return response;
    }

    @Override
    public UpdateRoomHotelResModifyResponseWrapper otaAccoUpdateRoom(UpdateRoomHotelResModifyRequestWrapper request) {
	LOG.info("#otaAccoUpdateRoom - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoUpdateRoom.url");
	final AccoInterfaceRQ accoInterfaceRQ = updateRoomConverter.toOTAHotelResModifyRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	UpdateRoomHotelResModifyResponseWrapper response = updateRoomConverter.fromOTAHotelResModifyRS(accoInterfaceRS);
	LOG.info("#otaAccoUpdateRoom - Finish");
	return response;
    }

    @Override
    public CancelRoomResponseWrapper otaAccoCancelRoom(CancelRoomRequestWrapper request) {
	LOG.info("#otaAccoCancelRoom - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoCancelRoom.url");
	final AccoInterfaceRQ accoInterfaceRQ = cancelRoomConverter.toOTACancelRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	CancelRoomResponseWrapper response = cancelRoomConverter.fromOTACancelRS(accoInterfaceRS);
	LOG.info("#otaAccoCancelRoom - Finish");
	return response;
    }

    @Override
    public ChangePeriodOfStayHotelResModifyResponseWrapper otaAccoChangePeriodOfStay(ChangePeriodOfStayHotelResModifyRequestWrapper request) {
	LOG.info("#otaAccoChangePeriodOfStay - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoChangePeriodOfStay.url");
	final AccoInterfaceRQ accoInterfaceRQ = changePeriodOfStayConverter.toOTAHotelResModifyRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	ChangePeriodOfStayHotelResModifyResponseWrapper response = changePeriodOfStayConverter.fromOTAHotelResModifyRS(accoInterfaceRS);
	LOG.info("#otaAccoChangePeriodOfStay - Finish");
	return response;
    }

    @Override
    public AncillaryBookingHotelResModifyResponseWrapper otaAccoAncillaryBooking(AncillaryBookingHotelResModifyRequestWrapper request) {
	LOG.info("#otaAccoAncillaryAmendment - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAccoAncillaryAmendment.url");
	final AccoInterfaceRQ accoInterfaceRQ = ancillaryBookingConverter.toOTAHotelResModifyRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	AncillaryBookingHotelResModifyResponseWrapper response = ancillaryBookingConverter.fromOTAHotelResModifyRS(accoInterfaceRS);
	LOG.info("#otaAccoAncillaryAmendment - Finish");
	return response;
    }

    @Override
    public OnRequestBookingUpdateResponseWrapper otaOnRequestBookingUpdate(OnRequestBookingUpdateRequestWrapper request) {
	LOG.info("#otaOnRequestBookingUpdate - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaOnRequestBookingUpdate.url");
	final AccoInterfaceRQ accoInterfaceRQ = onRequestBookingUpdateConverter.toOTAReadRQ(request);
	final AccoInterfaceRS accoInterfaceRS = supplierClient.postForAccoInterface(url, accoInterfaceRQ);
	OnRequestBookingUpdateResponseWrapper response = onRequestBookingUpdateConverter.fromOTAReadRS(accoInterfaceRS);
	LOG.info("#otaOnRequestBookingUpdate - Finish");
	return response;
    }
}
