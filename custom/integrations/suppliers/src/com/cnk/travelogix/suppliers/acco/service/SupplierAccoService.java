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
package com.cnk.travelogix.suppliers.acco.service;

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

/**
 * @author I077988
 */
public interface SupplierAccoService {

    public HotelAvailResponseWrapper otaAccoGetAvailabilityAndPrice(HotelAvailRequestWrapper request);

    public GetDetailsResponseWrapper otaAccoGetDetails(GetDetailsRequestWrapper request);

    public RePricingResponseWrapper otaAccoRepricing(RePricingRequestWrapper request);

    public GetPoliciesResponseWrapper otaAccoGetPolicies(GetPoliciesRequestWrapper request);

    public HotelResResponseWrapper otaAccoCreateBooking(final CreateBookingRequestWrapper request);

    public HotelCancelResponseWrapper otaAccoCancelBooking(HotelCancelWrapper request);

    public RetrieveBookingResponseWrapper otaAccoRetrieveBooking(RetrieveBookingWrapper request);

    public RetrieveBookingListResponseWrapper otaAccoRetrieveBookingList(RetrieveBookingListRequestWrapper request);

    public HotelResModifyResponseWrapper otaAccoAddPassenger(HotelResModifyRequestWrapper requestWrapper);

    public UpdateHotelResModifyResponseWrapper otaAccoUpdatePassenger(UpdateHotelResModifyRequestWrapper request);

    public CancelHotelResModifyResponseWrapper otaAccoCancelPassenger(CancelHotelResModifyRequestWrapper request);

    public AddRoomHotelResModifyResponseWrapper otaAccoAddRoom(AddRoomHotelResModifyRequestWrapper request);

    public UpdateRoomHotelResModifyResponseWrapper otaAccoUpdateRoom(UpdateRoomHotelResModifyRequestWrapper request);

    public CancelRoomResponseWrapper otaAccoCancelRoom(CancelRoomRequestWrapper request);

    public ChangePeriodOfStayHotelResModifyResponseWrapper otaAccoChangePeriodOfStay(ChangePeriodOfStayHotelResModifyRequestWrapper request);

    public AncillaryBookingHotelResModifyResponseWrapper otaAccoAncillaryBooking(AncillaryBookingHotelResModifyRequestWrapper request);

    public OnRequestBookingUpdateResponseWrapper otaOnRequestBookingUpdate(OnRequestBookingUpdateRequestWrapper request);

}
