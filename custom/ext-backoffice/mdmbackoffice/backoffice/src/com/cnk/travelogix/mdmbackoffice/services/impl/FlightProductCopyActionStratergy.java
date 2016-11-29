/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.services.impl;

import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.user.UserService;

import com.cnk.travelogix.mdmbackoffice.services.CopyActionStratergy;
import com.cnk.travelogix.product.transport.masters.core.model.FlightProductModel;
import com.hybris.cockpitng.util.BackofficeSpringUtil;


/**
 * Flight product specific Copy Action
 */
public class FlightProductCopyActionStratergy implements CopyActionStratergy<FlightProductModel>
{
	public UserService getUserFacade()
	{
		return (UserService) BackofficeSpringUtil.getBean("userService");
	}

	@Override
	public FlightProductModel postCopyAction(final FlightProductModel clone, final FlightProductModel model)
	{
		clone.setCode(null);
		clone.setCatalogVersion(null);
		clone.setCopiedFrom(model.getCode() + model.getCatalogVersion().getCatalog().getName());
		clone.setLockedBy((EmployeeModel) getUserFacade().getCurrentUser());
		return clone;
	}

}
