package com.cnk.travelogix.operations.facades.impl;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.model.receipts.TravelogixPaymentReceiptModel;
import com.cnk.travelogix.operations.data.TravelogixPaymentReceiptData;
import com.cnk.travelogix.operations.facades.TravelogixPaymentReceiptFacade;
import com.cnk.travelogix.operations.services.receipts.impl.DefaultTravelogixPaymentReceiptService;


/**
 * The facade implementation to manage the receipts
 */
public class DefaultTravelogixPaymentReceiptFacade implements TravelogixPaymentReceiptFacade
{

	private static final Logger LOG = Logger.getLogger(DefaultTravelogixPaymentReceiptFacade.class);

	@Resource
	private Converter<TravelogixPaymentReceiptModel, TravelogixPaymentReceiptData> receiptSearchConverter;

	@Resource
	ModelService modelService;

	@Resource
	private DefaultTravelogixPaymentReceiptService travelogixPaymentReceiptService;

	/**
	 * The method to fetch receipts.
	 *
	 * @return List<TravelogixPaymentReceiptData>
	 */
	@Override
	public SearchPageData<TravelogixPaymentReceiptData> searchReceipts(final TravelogixPaymentReceiptData receiptData,
			final PageableData pageableData)
	{
		final SearchPageData<TravelogixPaymentReceiptModel> receipts = travelogixPaymentReceiptService.searchReceipts(receiptData,
				pageableData);

		return convertPageData(receipts, receiptSearchConverter);
	}

	protected <S, T> SearchPageData<T> convertPageData(final SearchPageData<S> source, final Converter<S, T> converter)
	{
		final SearchPageData<T> result = new SearchPageData<>();
		result.setPagination(source.getPagination());
		result.setSorts(source.getSorts());
		result.setResults(Converters.convertAll(source.getResults(), converter));
		return result;
	}

	/**
	 * @return the receiptSearchConverter
	 */
	public Converter<TravelogixPaymentReceiptModel, TravelogixPaymentReceiptData> getReceiptSearchConverter()
	{
		return receiptSearchConverter;
	}

	/**
	 * @param receiptSearchConverter
	 *           the receiptSearchConverter to set
	 */
	public void setReceiptSearchConverter(
			final Converter<TravelogixPaymentReceiptModel, TravelogixPaymentReceiptData> receiptSearchConverter)
	{
		this.receiptSearchConverter = receiptSearchConverter;
	}

	/**
	 * @return the travelogixPaymentReceiptService
	 */
	public DefaultTravelogixPaymentReceiptService getTravelogixPaymentReceiptService()
	{
		return travelogixPaymentReceiptService;
	}

	/**
	 * @param travelogixPaymentReceiptService
	 *           the travelogixPaymentReceiptService to set
	 */
	public void setTravelogixPaymentReceiptService(final DefaultTravelogixPaymentReceiptService travelogixPaymentReceiptService)
	{
		this.travelogixPaymentReceiptService = travelogixPaymentReceiptService;
	}

}
