package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import javax.annotation.Resource;

import com.cnk.travelogix.common.core.model.receipts.ReceiptDetailsModel;
import com.cnk.travelogix.common.core.model.receipts.TravelogixInvoiceModel;
import com.cnk.travelogix.common.core.model.receipts.TravelogixPaymentReceiptModel;
import com.cnk.travelogix.operations.data.TravelogixInvoiceData;
import com.cnk.travelogix.operations.data.TravelogixPaymentReceiptData;
import com.cnk.travelogix.operations.data.TravelogixReceiptDetailsData;


/**
 * The travelogix invoice populator
 */
public class TravelogixInvoicePopulator implements Populator<TravelogixInvoiceModel, TravelogixInvoiceData>
{
	@Resource
	private Converter<ReceiptDetailsModel, TravelogixReceiptDetailsData> travelogixReceiptDetailsConverter;

	@Resource
	private Converter<AbstractOrderEntryModel, OrderEntryData> orderEntryConverter;

	@Resource
	private Converter<TravelogixPaymentReceiptModel, TravelogixPaymentReceiptData> receiptSearchConverter;

	@Override
	public void populate(final TravelogixInvoiceModel source, final TravelogixInvoiceData target) throws ConversionException
	{
		target.setBookingRefNo(target.getBookingRefNo());
		target.setCode(source.getCode());
		target.setOutstandingAmount(source.getOutstandingAmount());
		target.setTotalAppliedAmount(source.getTotalAppliedAmount());
		target.setTotalCost(source.getTotalCost());
		//target.setClient(source.getClient());
		target.setReceiptDetails(travelogixReceiptDetailsConverter.convert(source.getReceiptDetails()));
		target.setInvoiceParticulars(orderEntryConverter.convert(source.getInvoiceParticulars()));
	}

	/**
	 * @return the travelogixReceiptDetailsConverter
	 */
	public Converter<ReceiptDetailsModel, TravelogixReceiptDetailsData> getTravelogixReceiptDetailsConverter()
	{
		return travelogixReceiptDetailsConverter;
	}

	/**
	 * @param travelogixReceiptDetailsConverter
	 *           the travelogixReceiptDetailsConverter to set
	 */
	public void setTravelogixReceiptDetailsConverter(
			final Converter<ReceiptDetailsModel, TravelogixReceiptDetailsData> travelogixReceiptDetailsConverter)
	{
		this.travelogixReceiptDetailsConverter = travelogixReceiptDetailsConverter;
	}

	/**
	 * @return the orderEntryConverter
	 */
	public Converter<AbstractOrderEntryModel, OrderEntryData> getOrderEntryConverter()
	{
		return orderEntryConverter;
	}

	/**
	 * @param orderEntryConverter
	 *           the orderEntryConverter to set
	 */
	public void setOrderEntryConverter(final Converter<AbstractOrderEntryModel, OrderEntryData> orderEntryConverter)
	{
		this.orderEntryConverter = orderEntryConverter;
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

}
