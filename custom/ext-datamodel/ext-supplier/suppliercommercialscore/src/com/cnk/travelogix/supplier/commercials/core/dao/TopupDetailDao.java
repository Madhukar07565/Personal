/**
 *
 */
package com.cnk.travelogix.supplier.commercials.core.dao;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.model.TopupDetailModel;


/* Search for TopupDetail */
public interface TopupDetailDao
{
	/**
	 * Checks for Duplicate Entries for TopupDetail based on Amount,Currency, and IncentivePercentage
	 *
	 * @param amount
	 * @param currency
	 * @param percentage
	 * @throws AmbiguousIdentifierException
	 */
	public TopupDetailModel getTopupDetails(Double amount, CurrencyModel currency, Double percentage) throws DuplicateUidException;

}