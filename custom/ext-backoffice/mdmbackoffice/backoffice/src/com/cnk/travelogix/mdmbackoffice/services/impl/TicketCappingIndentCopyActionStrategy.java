/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.services.impl;

import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.user.UserService;

import com.cnk.travelogix.mdmbackoffice.services.CopyActionStratergy;
import com.cnk.travelogix.supplier.credentials.core.indents.model.TicketCappingIndentModel;
import com.hybris.cockpitng.util.BackofficeSpringUtil;


/**
 *
 */
public class TicketCappingIndentCopyActionStrategy implements CopyActionStratergy<TicketCappingIndentModel>
{
	public UserService getUserFacade()
	{
		return (UserService) BackofficeSpringUtil.getBean("userService");
	}

	@Override
	public TicketCappingIndentModel postCopyAction(final TicketCappingIndentModel clone, final TicketCappingIndentModel model)
	{
		clone.setCode(null);
		clone.setCatalogVersion(model.getCatalogVersion());
		clone.setCopiedFrom(model.getCode() + model.getCatalogVersion().getCatalog().getName());
		clone.setLockedBy((EmployeeModel) getUserFacade().getCurrentUser());
		return clone;
	}

}
