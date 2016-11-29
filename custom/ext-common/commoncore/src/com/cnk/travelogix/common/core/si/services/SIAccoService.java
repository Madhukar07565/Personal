/**
 *
 */
package com.cnk.travelogix.common.core.si.services;

import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntHotelGetAvailabilityAndPriceRequest;
import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntHotelGetAvailabilityAndPriceResponse;


/**
 * @author i318043
 */
public interface SIAccoService {

    SvcIntHotelGetAvailabilityAndPriceResponse search(SvcIntHotelGetAvailabilityAndPriceRequest request);

    SvcIntHotelGetAvailabilityAndPriceResponse getDetail(SvcIntHotelGetAvailabilityAndPriceRequest request);

    Object getAncillaryList();

    Object getAvailabilityAndPrice();

    Object reserveInventory();

    Object createBooking();

    Object getCancellationPolicyList();

    Object cancelBooking();
}




