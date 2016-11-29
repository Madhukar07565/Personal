/**
 * 
 */
package com.cnk.travelogix.common.core.order.mock;

import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;


/**
 * @author i323801
 *
 */
public class MockSupplierCheckService
{
	public String checkSupplier(SupplierModel supplier)
	{
		return "ONLINE";//OFFLINE
	}
}
