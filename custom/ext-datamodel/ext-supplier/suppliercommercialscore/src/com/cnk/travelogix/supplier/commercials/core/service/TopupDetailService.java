/**
 *
 */
package com.cnk.travelogix.supplier.commercials.core.service;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.model.TopupDetailModel;


/**
 *
 */
public interface TopupDetailService
{
	/**
	 * Calling dao for Duplicate Entries for TopupDetail based on Amount,Currency, and IncentivePercentage
	 *
	 * @param topupDetailModel
	 * @throws AmbiguousIdentifierException
	 */
	public TopupDetailModel getTopupDetails(TopupDetailModel topupDetailModel) throws DuplicateUidException;

}
