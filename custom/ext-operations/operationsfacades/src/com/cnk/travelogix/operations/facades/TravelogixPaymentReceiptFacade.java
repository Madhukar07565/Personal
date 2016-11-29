package com.cnk.travelogix.operations.facades;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;

import com.cnk.travelogix.operations.data.TravelogixPaymentReceiptData;


/**
 * The implementation of facade for receipts.
 */
public interface TravelogixPaymentReceiptFacade
{
	/**
	 * Search receipts based on the given parameters by user.
	 */
	public SearchPageData<TravelogixPaymentReceiptData> searchReceipts(final TravelogixPaymentReceiptData receiptData,
			final PageableData pageableData);

}
