/*
 *
 * Copyright (c) Cox And Kings
 * All rights reserved.
 *
 */
package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.commercefacades.order.data.CCPaymentInfoData;
import de.hybris.platform.commerceservices.converter.Populator;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;


/**
 * The travelogix payment info populator
 */
public class TravelogixPaymentInfoPopulator implements Populator<PaymentInfoModel, CCPaymentInfoData>
{
	@Override
	public void populate(final PaymentInfoModel source, final CCPaymentInfoData target)
	{
		/*
		 * Assert.notNull(source, "Parameter source cannot be null."); Assert.notNull(target,
		 * "Parameter target cannot be null."); if (source instanceof CreditCardEMIPaymentInfoModel) {
		 * target.setCardType(((CreditCardPaymentInfoModel) source).getType().getCode());
		 * target.setCardNumber(((CreditCardPaymentInfoModel) source).getNumber());
		 * target.setCvvNumber(((CreditCardEMIPaymentInfoModel) source).getCvv().toString());
		 * target.setExpiryMonth(((CreditCardPaymentInfoModel) source).getValidToMonth());
		 * target.setExpiryYear(((CreditCardPaymentInfoModel) source).getValidToYear()); } else if (source instanceof
		 * DebitCardPaymentInfoModel) { target.setCardNumber(((DebitCardPaymentInfoModel) source).getCardNumber());
		 * target.setCardType(((DebitCardPaymentInfoModel) source).getCardType().getCode());
		 * target.setNameOnCard(((DebitCardPaymentInfoModel) source).getNameOnCard());
		 * target.setExpiryMonth(((DebitCardPaymentInfoModel) source).getValidToMonth());
		 * target.setExpiryYear(((DebitCardPaymentInfoModel) source).getValidToYear());
		 * target.setCvvNumber(((DebitCardPaymentInfoModel) source).getCvv());
		 *
		 * } else if (source instanceof DirectDepositPaymentInfoModel) {
		 * target.setChequeNo(((DirectDepositPaymentInfoModel) source).getChequeOrDDNumber());
		 * target.setChequeDate(((DirectDepositPaymentInfoModel) source).getChequeOrDDDate());
		 *
		 * } else if (source instanceof DirectDepositCashPaymentInfoModel) {
		 *
		 * target.setAccountNumber(((DirectDepositCashPaymentInfoModel) source).getBankAccountNumber());
		 *
		 * } else if (source instanceof FundTransferPaymentInfoModel) {
		 * target.setFromBankName(((FundTransferPaymentInfoModel) source).getFromBank().getName());
		 * target.setToBankName(((FundTransferPaymentInfoModel) source).getToBank().getName());
		 * target.setReferenceNumber(((FundTransferPaymentInfoModel) source).getReferenceNumber()); } else if (source
		 * instanceof EPOSPaymentInfoModel) { target.setCardType(((EPOSPaymentInfoModel) source).getCreditOrDebitCard());
		 * }
		 */
	}
}


