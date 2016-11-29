/**
 *
 */
package com.cnk.travelogix.supplier.credentials.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import java.math.BigDecimal;
import java.util.Collection;

import com.cnk.travelogix.masterdata.core.paymentinfo.model.BankPaymentDetailModel;
import com.cnk.travelogix.supplier.credentials.core.indents.model.BankGuarenteeInfoModel;
import com.cnk.travelogix.supplier.credentials.core.indents.model.CreditDepositIndentModel;


/**
 * @author Akansha
 *
 */
public class CreditDepositIndentAmountPaidInterceptor implements PrepareInterceptor<CreditDepositIndentModel>
{

	@Override
	public void onPrepare(final CreditDepositIndentModel creditDepositIndentModel, final InterceptorContext arg1)
			throws InterceptorException
	{
		//final Logger log = Logger.getLogger(CreditDepositIndentInterceptor.class);

		BigDecimal amount = null;
		if (creditDepositIndentModel.getBankPaymentDetails() != null)
		{
			final Collection<BankPaymentDetailModel> item = creditDepositIndentModel.getBankPaymentDetails();
			for (final BankPaymentDetailModel bankPaymentDetailModel : item)
			{
				amount = bankPaymentDetailModel.getAmount();
			}


		}

		if (creditDepositIndentModel.getBankGuarenteeInfos() != null)
		{
			final Collection<BankGuarenteeInfoModel> item = creditDepositIndentModel.getBankGuarenteeInfos();
			for (final BankGuarenteeInfoModel bankGuarenteeInfoModel : item)
			{
				amount = bankGuarenteeInfoModel.getAmount();
			}

		}

		creditDepositIndentModel.setAmountPaid(amount);




	}

}
