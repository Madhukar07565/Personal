/**
 *
 */
package com.cnk.travelogix.common.core.si.services;

import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightBookingRequest;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightBookingResponse;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightGetAvailabilityAndFareRequest;
import com.cnk.travelogix.common.core.storefront.svcint.dto.air.SvcIntFlightGetAvailabilityAndFareResponse;


/**
 * @author i318043
 */
public interface SIAirService {
    SvcIntFlightGetAvailabilityAndFareResponse search(SvcIntFlightGetAvailabilityAndFareRequest request);

    Object getAncillaryList();

    Object getAvailabilityAndPrice();

    Object reserveInventory();

    SvcIntFlightBookingResponse createBooking(SvcIntFlightBookingRequest request);

    Object getCancellationPolicyList();

    Object cancelBooking();
}
