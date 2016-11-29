package com.cnk.travelogix.operations.services.daos;

import com.cnk.travelogix.common.core.model.receipts.TravelogixPaymentReceiptModel;
import com.cnk.travelogix.operations.data.TravelogixPaymentReceiptData;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;


/**
 * The travelogix receipt dao implementation
 */
public interface TravelogixPaymentReceiptDao
{
	/**
	 * The implementation to fetch reciepts.
	 */
	public SearchPageData<TravelogixPaymentReceiptModel> findReceipts(final TravelogixPaymentReceiptData receiptData,
			final PageableData pageableData);
}
