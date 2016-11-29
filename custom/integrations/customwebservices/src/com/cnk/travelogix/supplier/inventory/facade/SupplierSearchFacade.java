
package com.cnk.travelogix.supplier.inventory.facade;

import com.cnk.travelogix.supplier.inventory.data.FlightSearchData;
import com.cnk.travelogix.supplier.inventory.data.HotelSearchData;
import com.cnk.travelogix.supplier.inventory.data.SupplierInventoryDataList;
import com.cnk.travelogix.supplier.inventory.data.flight.FlightDetailDataList;

/**
 * @author I077322
 *
 */
public interface SupplierSearchFacade {
    
    /**
     * @param supplierId
     * @return SupplierInventoryDataList
     */
    public SupplierInventoryDataList search(final String supplierId);

    /**
     * @param supplierId
     * @param hotelSearchData
     * @return SupplierInventoryDataList
     */
    public SupplierInventoryDataList search(String supplierId, HotelSearchData hotelSearchData);

    /**
     * @param supplierId
     * @param flightSearchData
     * @return FlightDetailDataList
     */
    public FlightDetailDataList search(String supplierId, FlightSearchData flightSearchData);
}
