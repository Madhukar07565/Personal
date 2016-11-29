/**
 *
 */
package com.cnk.travelogix.rate.facade;

import com.cnk.travelogix.rate.acco.data.AccomodationSupplierRateData;
import com.cnk.travelogix.rate.acco.data.UpdateRateResponseData;
import com.cnk.travelogix.supplier.rates.model.supplierrates.accommodation.AccommodationRateDefinitionModel;
import com.cnk.travelogix.supplier.rates.model.supplierrates.accommodation.AccommodationSupplierRateModel;

/**
 * @author I077322
 *
 */
@FunctionalInterface
public interface RateFacade {
   
    /**
     * @param supplierId
     * @param accoSupplierRate
     * @return UpdateRateResponseData
     */
    public UpdateRateResponseData updateRate(String supplierId, AccomodationSupplierRateData accoSupplierRate);
    
  
}
