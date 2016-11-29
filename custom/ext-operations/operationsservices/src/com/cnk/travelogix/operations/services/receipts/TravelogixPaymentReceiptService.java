package com.cnk.travelogix.operations.services.receipts;

import com.cnk.travelogix.common.core.model.receipts.TravelogixPaymentReceiptModel;
import com.cnk.travelogix.operations.data.TravelogixPaymentReceiptData;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;


/**
 * This Service will manage the multiple functionalities of receipt[search,create,view]
 */
public interface TravelogixPaymentReceiptService
{
	/**
	 * This method handles the search functionality of receipt. Provides the receipts.
	 *
	 * @return List<TravelogixPaymentReceiptModel>
	 */
	public SearchPageData<TravelogixPaymentReceiptModel> searchReceipts(final TravelogixPaymentReceiptData receiptData,
			final PageableData pageableData);
}
