/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.services.impl;

import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.user.UserService;

import com.cnk.travelogix.mdmbackoffice.services.CopyActionStratergy;
import com.cnk.travelogix.supplier.credentials.core.indents.model.CreditDepositIndentModel;
import com.hybris.cockpitng.util.BackofficeSpringUtil;


/**
 * Acco product specific Copy Action
 */
public class CreditDepositIndentCopyActionStrategy implements CopyActionStratergy<CreditDepositIndentModel>
{
	public UserService getUserFacade()
	{
		return (UserService) BackofficeSpringUtil.getBean("userService");
	}


	@Override
	public CreditDepositIndentModel postCopyAction(final CreditDepositIndentModel clone, final CreditDepositIndentModel model)
	{
		clone.setCode(null);
		clone.setCatalogVersion(model.getCatalogVersion());
		clone.setCopiedFrom(model.getCode() + model.getCatalogVersion().getCatalog().getName());
		clone.setLockedBy((EmployeeModel) getUserFacade().getCurrentUser());
		return clone;
	}

}
