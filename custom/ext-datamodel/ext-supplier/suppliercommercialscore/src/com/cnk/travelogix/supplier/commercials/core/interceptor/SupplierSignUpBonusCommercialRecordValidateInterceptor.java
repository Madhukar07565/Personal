/**
 *
 */
package com.cnk.travelogix.supplier.commercials.core.interceptor;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import java.util.Date;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.commercials.core.advanced.signupbonus.model.SignupBonusCriteriaModel;
import com.cnk.travelogix.supplier.commercials.core.advanced.signupbonus.model.SupplierSignUpBonusCommercialRecordModel;


/**
 * Interceptor to validate SignupBonusCommercial <br>
 * <h6>Period From and To date</h6> <br>
 * <h6>Status value changing on reaching Validity to date</h6>
 */
public class SupplierSignUpBonusCommercialRecordValidateInterceptor implements ValidateInterceptor<SupplierSignUpBonusCommercialRecordModel>
{
	private static final Logger LOG = Logger.getLogger(SupplierSignUpBonusCommercialRecordValidateInterceptor.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.ValidateInterceptor#onValidate(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onValidate(final SupplierSignUpBonusCommercialRecordModel signupBonusCommercialModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.info("Inside onValidate() of  SignupBonusCommercialValidateInterceptor");
		}
		if (signupBonusCommercialModel.getCriteria() != null)
		{
			for (final SignupBonusCriteriaModel criteria : signupBonusCommercialModel.getCriteria())
			{
				if (criteria.getPeriodFrom() != null && criteria.getPeriodTo() != null
						&& (criteria.getPeriodFrom().compareTo(signupBonusCommercialModel.getValidFrom()) == -1
								|| criteria.getPeriodTo().compareTo(signupBonusCommercialModel.getValidTo()) == 1))
				{
					throw new InterceptorException(Localization.getLocalizedString("signupbonus.period.daterange.validation.message"));
				}
			}

		}
		if (signupBonusCommercialModel.getValidTo().compareTo(new Date()) >= 0)
		{
			signupBonusCommercialModel.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
		}

		if (LOG.isDebugEnabled())
		{
			LOG.info("End onValidate() of SignupBonusCommercialValidateInterceptor");
		}

	}

}
