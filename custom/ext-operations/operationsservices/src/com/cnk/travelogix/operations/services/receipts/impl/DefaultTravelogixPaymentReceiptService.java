package com.cnk.travelogix.operations.services.receipts.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.model.receipts.TravelogixPaymentReceiptModel;
import com.cnk.travelogix.operations.data.TravelogixPaymentReceiptData;
import com.cnk.travelogix.operations.services.doas.impl.DefaultTravelogixPaymentReceiptDao;
import com.cnk.travelogix.operations.services.receipts.TravelogixPaymentReceiptService;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;


public class DefaultTravelogixPaymentReceiptService implements TravelogixPaymentReceiptService
{
	private static final Logger LOG = Logger.getLogger(DefaultTravelogixPaymentReceiptService.class);

	@Resource
	private DefaultTravelogixPaymentReceiptDao travelogixPaymentReceiptDao;

	@Override
	public SearchPageData<TravelogixPaymentReceiptModel> searchReceipts(final TravelogixPaymentReceiptData receiptData,
			final PageableData pageableData)
	{
		SearchPageData<TravelogixPaymentReceiptModel> searchPageData = new SearchPageData<>();

		if (receiptData != null)
		{
			try
			{
				searchPageData = travelogixPaymentReceiptDao.findReceipts(receiptData, pageableData);
			}
			catch (final Exception exception)
			{
				LOG.error("Exception occured at the time of searching receipt records...!! ", exception);
			}
		}

		return searchPageData;
	}

	/**
	 * @return the travelogixPaymentReceiptDao
	 */
	public DefaultTravelogixPaymentReceiptDao getTravelogixPaymentReceiptDao()
	{
		return travelogixPaymentReceiptDao;
	}

	/**
	 * @param travelogixPaymentReceiptDao
	 *           the travelogixPaymentReceiptDao to set
	 */
	public void setTravelogixPaymentReceiptDao(final DefaultTravelogixPaymentReceiptDao travelogixPaymentReceiptDao)
	{
		this.travelogixPaymentReceiptDao = travelogixPaymentReceiptDao;
	}


}
