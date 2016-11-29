/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.services.impl;

import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.user.UserService;

import com.cnk.travelogix.mdmbackoffice.services.CopyActionStratergy;
import com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.paymentadvice.model.PaymentAdviceForOtherFeeModel;
import com.hybris.cockpitng.util.BackofficeSpringUtil;


/**
 *
 */
public class PaymentAdviceForOtherFeeCopyActionStrategy implements CopyActionStratergy<PaymentAdviceForOtherFeeModel>
{
	public UserService getUserFacade()
	{
		return (UserService) BackofficeSpringUtil.getBean("userService");
	}

	@Override
	public PaymentAdviceForOtherFeeModel postCopyAction(final PaymentAdviceForOtherFeeModel clone,
			final PaymentAdviceForOtherFeeModel model)
	{
		clone.setCode(null);
		clone.setCatalogVersion(model.getCatalogVersion());
		clone.setCopiedFrom(model.getCode() + model.getCatalogVersion().getCatalog().getName());
		clone.setLockedBy((EmployeeModel) getUserFacade().getCurrentUser());
		return clone;
	}

}
