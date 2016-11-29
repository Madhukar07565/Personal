package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.cnk.travelogix.common.core.model.receipts.ReceiptDetailsModel;
import com.cnk.travelogix.operations.data.TravelogixReceiptDetailsData;


/**
 * The travelogix receipt details populator
 */
public class TravelogixReceiptDetailsPopulator implements Populator<ReceiptDetailsModel, TravelogixReceiptDetailsData>
{
	@Override
	public void populate(final ReceiptDetailsModel source, final TravelogixReceiptDetailsData target) throws ConversionException
	{
		target.setAppliedCost(source.getAppliedCost());
		target.setInvoiceID(source.getInvoiceID());
		target.setReceiptId(source.getReceiptId());
	}

}
