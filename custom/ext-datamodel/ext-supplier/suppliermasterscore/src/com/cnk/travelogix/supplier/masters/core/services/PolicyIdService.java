/**
 *
 */
package com.cnk.travelogix.supplier.masters.core.services;

import com.cnk.travelogix.masterdata.core.model.TravelogixPolicyModel;


/**
 * this method will generate unique policy id
 */
public interface PolicyIdService
{
	public void generatePolicyId(TravelogixPolicyModel travelogixPolicyModel);

}
