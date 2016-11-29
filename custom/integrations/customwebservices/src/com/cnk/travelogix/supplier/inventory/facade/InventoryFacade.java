
package com.cnk.travelogix.supplier.inventory.facade;

import java.util.List;

import com.cnk.travelogix.inventory.acco.data.UpdateInventoryResponseData;
import com.cnk.travelogix.inventory.data.AccoInventoryDefinitionData;
import com.cnk.travelogix.inventory.data.UpdateInventortyData;

/**
 * @author I077322
 *
 */

public interface InventoryFacade {
    
    /**
     * @param supplierId
     * @param accoInventoryDefinition
     * @return UpdateInventoryResponseData
     */
    public UpdateInventoryResponseData updateInventory(final String supplierId, final AccoInventoryDefinitionData accoInventoryDefinition);
    
    public UpdateInventoryResponseData updateInventoryDefinition(UpdateInventortyData updateInventory);
    
}
