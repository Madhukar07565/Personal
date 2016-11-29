/**
 *
 */
package com.cnk.travelogix.supplier.credentials.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.util.localization.Localization;

import java.math.BigDecimal;

import com.cnk.travelogix.masterdata.core.paymentinfo.model.BankPaymentDetailModel;
import com.cnk.travelogix.supplier.credentials.core.indents.model.TicketCappingIndentModel;


/**
 * Interceptor for validating bank payment details for ticket capping indent
 */
public class TicketCappingIndentValidateInterceptor implements ValidateInterceptor<TicketCappingIndentModel>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.ValidateInterceptor#onValidate(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onValidate(final TicketCappingIndentModel ticketCappingIndentModel, final InterceptorContext ctx)
			throws InterceptorException
	{
		if (ticketCappingIndentModel.getBankPaymentDetails() != null)
		{
			BigDecimal transactionTotal = new BigDecimal("0");
			for (final BankPaymentDetailModel bankPaymentDetail : ticketCappingIndentModel.getBankPaymentDetails())
			{
				transactionTotal = transactionTotal.add(BigDecimal.valueOf(bankPaymentDetail.getAmount().doubleValue()));
				if (bankPaymentDetail.getAmount()
						.compareTo(BigDecimal.valueOf(ticketCappingIndentModel.getCappingAmount().doubleValue())) == 1)
				{
					throw new InterceptorException(Localization.getLocalizedString("ticketcapping.bankdetails.validation.message"));
				}
			}
			if (transactionTotal.compareTo(BigDecimal.valueOf(ticketCappingIndentModel.getCappingAmount().doubleValue())) == 1)
			{
				throw new InterceptorException(
						Localization.getLocalizedString("ticketcapping.bankdetails.total.transaction.validation.message"));
			}
		}

	}

}
