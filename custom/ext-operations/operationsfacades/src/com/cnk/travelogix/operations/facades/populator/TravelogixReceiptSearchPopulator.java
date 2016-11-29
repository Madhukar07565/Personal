package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.commercefacades.order.data.CCPaymentInfoData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.util.Assert;

import com.cnk.travelogix.client.core.b2bunit.model.TravelogixB2BUnitModel;
import com.cnk.travelogix.common.core.cart.data.SupplierData;
import com.cnk.travelogix.common.core.model.receipts.TravelogixInvoiceModel;
import com.cnk.travelogix.common.core.model.receipts.TravelogixPaymentReceiptModel;
import com.cnk.travelogix.common.core.model.receipts.TravelogixRemarksModel;
import com.cnk.travelogix.operations.data.EnumerationDto;
import com.cnk.travelogix.operations.data.TravelogixClientDetailsData;
import com.cnk.travelogix.operations.data.TravelogixInvoiceData;
import com.cnk.travelogix.operations.data.TravelogixPaymentReceiptData;
import com.cnk.travelogix.operations.data.TravelogixRemarksData;


/**
 * The travelogix receipt populator
 */
public class TravelogixReceiptSearchPopulator implements Populator<TravelogixPaymentReceiptModel, TravelogixPaymentReceiptData>
{
	@Resource
	private Converter<PaymentInfoModel, CCPaymentInfoData> travelogixPaymentInfoConverter;

	@Resource
	private AbstractPopulatingConverter<ProductModel, ProductData> productConverter;

	@Resource
	private Converter<TravelogixInvoiceModel, TravelogixInvoiceData> travelogixInvoiceConverter;

	@Resource
	private Converter<TravelogixRemarksModel, TravelogixRemarksData> travelogixReceiptRemarksConverter;

	@Resource
	private Converter<TravelogixB2BUnitModel, TravelogixClientDetailsData> travelogixB2BClientConverter;

	@Resource
	private EnumerationService enumerationService;

	@Override
	public void populate(final TravelogixPaymentReceiptModel source, final TravelogixPaymentReceiptData target)
			throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		Assert.notNull(source.getOrder(), "Parameter order cannot be null");
		Assert.notNull(source.getOrder().getEntries(), "Parameter order entries cannot be null");
		Assert.notNull(source.getRoe(), "Parameter roe details cannot be null");
		target.setReceiptCreationDate(source.getCreationtime());
		target.setReceiptNumber(source.getCode());
		target.setReferenceId(source.getOrder().getCode());
		target.setTravelogixPaymentInfoData(travelogixPaymentInfoConverter.convert(source.getPaymentInfo()));

		//		travelogixClientDetailsData
		//			.setPassengerName(source.getOrder().getEntries().get(0).getTraveller().iterator().next().getFirstName());

		target.setTravelogixClientDetailsData(travelogixB2BClientConverter.convert(source.getClient()));
		target.setTravelogixProductData(productConverter.convert(source.getOrder().getEntries().get(0).getProduct()));
		target.setPos(source.getPOS());
		target.setReceiptAmount(source.getAmount());
		target.setPassengerName(source.getOrder().getEntries().get(0).getTraveller().iterator().next().getFirstName());
		target.setRoe(source.getRoe().getRoe());
		target.setFunctionalReceiptAmount(source.getFunctionalAmount());
		target.setUnAppliedAmount(source.getUnappliedAmount());
		target.setCreatedBy(source.getCreatedBy().getName());
		target.setReceiptStatus(getStatus(source));
		if (null != source.getSupplier())
		{
			final SupplierData supplierData = new SupplierData();
			supplierData.setName(source.getSupplier().getName());
			supplierData.setCode(source.getSupplier().getCode());
			target.setSupplier(supplierData);
		}
		if (null != source.getInvoices())
		{
			target.setInvoiceData(travelogixInvoiceConverter.convertAll(source.getInvoices()));
		}
		if (null != source.getTravelogixRemarksList())
		{
			target.setRemarksData(travelogixReceiptRemarksConverter.convertAll(source.getTravelogixRemarksList()));
		}
	}

	public List<EnumerationDto> getStatus(final TravelogixPaymentReceiptModel source)
	{
		final List<EnumerationDto> dtos = new ArrayList<>();
		final EnumerationDto dto = new EnumerationDto();
		dto.setCode(source.getStatus().getCode());
		dto.setName(enumerationService.getEnumerationName(source.getStatus()));
		dtos.add(dto);
		return dtos;
	}

}
