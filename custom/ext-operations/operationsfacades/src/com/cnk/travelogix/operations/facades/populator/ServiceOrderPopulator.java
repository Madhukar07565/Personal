package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.util.Assert;

import com.cnk.travelogix.operation.serviceorder.model.ServiceOrderModel;
import com.cnk.travelogix.operations.data.ServiceOrderData;


/**
 * Populating ServiceOrderModel model into data.
 *
 */
public class ServiceOrderPopulator implements Populator<ServiceOrderModel, ServiceOrderData>
{

	@Override
	public void populate(final ServiceOrderModel source, final ServiceOrderData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		if (source.getOrderEntry() != null && source.getOrderEntry().getOrderProductInfo() != null
				&& source.getOrderEntry().getOrderProductInfo().getSourceSupplier() != null)
		{
			target.setSupplierName(source.getOrderEntry().getOrderProductInfo().getSourceSupplier().getName());
		}
		target.setPsoId(source.getCode());
		// TODO Remove hard coding and proper conversion.
		target.setPslId(source.getCode());
		target.setFsoId("");
		target.setFslId("");
		target.setNetAmountPayable(0.0);
		target.setAmountPaid(0.0);
		target.setBalanceAmountPayable(0.0);
		target.setDifferenceSupplierInvoice(0.0);
		//TODO for missing/pending items
		target.setCreditDebitNote("");
		target.setPaymentAdvice("");
		target.setPaymentAdviceStatus("");
		target.setSupplierSettlementStatus("");
		target.setSupplierBillEntry("");
		target.setSupplierBillStatus("");
		target.setStopPayment("");
	}

}
