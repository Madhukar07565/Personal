/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.services.impl;

import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.user.UserService;

import com.cnk.travelogix.mdmbackoffice.services.CopyActionStratergy;
import com.cnk.travelogix.product.common.core.model.AccommodationModel;
import com.hybris.cockpitng.util.BackofficeSpringUtil;


/**
 * Acco product specific Copy Action
 */
public class AccommodationCopyActionStratergy implements CopyActionStratergy<AccommodationModel>
{
	public UserService getUserFacade()
	{
		return (UserService) BackofficeSpringUtil.getBean("userService");
	}

	@Override
	public AccommodationModel postCopyAction(final AccommodationModel clone, final AccommodationModel model)
	{
		clone.setCode(null);
		clone.setCatalogVersion(null);
		clone.setCopiedFrom(model.getCode() + model.getCatalogVersion().getCatalog().getName());
		clone.setLockedBy((EmployeeModel) getUserFacade().getCurrentUser());
		return clone;
	}

}
