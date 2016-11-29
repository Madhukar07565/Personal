/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.common.core.payment.data;

import java.util.List;


/**
 * @author i323727
 *
 */
public class PaymentSummary
{
	List<PaymentTransactionData> paymentTransactionList;

	/** total price of products which must be paid initially */
	double totalPriceOfFullPay;

	/** total price of products which will be paid in specified time limit */
	double totalPriceOfTimeLimitPay;

	/** total price of products which will be paid by initial pay + balance schedule pay */
	double totalPriceOfPartPay;

	/** planned price of products part pay */
	double plannedPriceOfPartPay;

	/** totalPriceOfFullPay + totalPriceOfTimeLimitPay + totalPriceOfPartPay */
	double totalPriceOfAll;

	/** totalPriceOfFullPay + plannedPriceOfPartPay */
	double initialPriceOfAll;

	/** paid price of multiple payment transactions */
	double totalPaidPrice;

	/** pay now price, initialPriceOfAll - totalPaidPrice */
	double payNowPrice;

}
