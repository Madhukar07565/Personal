/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.services.impl;

import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.user.UserService;

import com.cnk.travelogix.mdmbackoffice.services.CopyActionStratergy;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;
import com.hybris.cockpitng.util.BackofficeSpringUtil;


/**
 * Created Copy Strategy for Supplier
 *
 */
public class SupplierCopyActionStratergy implements CopyActionStratergy<SupplierModel>
{
	public UserService getUserFacade()
	{
		return (UserService) BackofficeSpringUtil.getBean("userService");
	}

	@Override
	public SupplierModel postCopyAction(final SupplierModel clone, final SupplierModel model)
	{

		clone.setCode(null);
		clone.setCommonUid(null);
		clone.setCompanySupplierId(null);
		clone.setCatalogVersion(null);
		clone.setRemarks(null);
		clone.setCopiedFrom(model.getCode() + model.getCatalogVersion().getCatalog().getName());
		clone.setLockedBy((EmployeeModel) getUserFacade().getCurrentUser());

		return clone;
	}


}
