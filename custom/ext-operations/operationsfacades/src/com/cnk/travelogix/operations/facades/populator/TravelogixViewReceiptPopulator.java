/*
 *
 * Copyright (c) Cox And Kings
 * All rights reserved.
 *
 */
package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.commercefacades.order.data.CCPaymentInfoData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.converter.Populator;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.cnk.travelogix.client.core.companyoffer.model.ClientDetailsModel;
import com.cnk.travelogix.common.core.model.receipts.TravelogixPaymentReceiptModel;
import com.cnk.travelogix.operations.data.TravelogixClientDetailsData;
import com.cnk.travelogix.operations.data.TravelogixPaymentReceiptData;


/**
 *
 */
public class TravelogixViewReceiptPopulator implements Populator<TravelogixPaymentReceiptModel, TravelogixPaymentReceiptData>
{


	@Autowired
	private Converter<ClientDetailsModel, TravelogixClientDetailsData> travelogixClientDetailsConverter;

	@Autowired
	private Converter<ProductModel, ProductData> productConverter;

	@Autowired
	private Converter<PaymentInfoModel, CCPaymentInfoData> travelogixPaymentInfoConverter;


	@Override
	public void populate(final TravelogixPaymentReceiptModel source, final TravelogixPaymentReceiptData target)
			throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		final ClientDetailsModel clientDetailsModel = new ClientDetailsModel();
		final TravelogixClientDetailsData travelogixClientDetailsData = travelogixClientDetailsConverter
				.convert(clientDetailsModel);
		target.setTravelogixClientDetailsData(travelogixClientDetailsData);
		final ProductModel productModel = new ProductModel();
		final ProductData productData = productConverter.convert(productModel);
		final CCPaymentInfoData ccPaymentInfoData = travelogixPaymentInfoConverter.convert(source.getPaymentInfo());
		target.setTravelogixPaymentInfoData(ccPaymentInfoData);
		target.setReceiptCreationDate(source.getCreationtime());
		target.setReceiptNumber(source.getCode());
		target.setTravelogixProductData(productData);
		//target.setReceiptStatus(source.getStatus().getCode());
		target.setFunctionalReceiptAmount(source.getFunctionalAmount());
		target.setCreatedBy(source.getCreatedBy().getName());
		target.setUnAppliedAmount(source.getUnappliedAmount());
		/* target.setFunctionalUnAppliedAmount(source.getf); */
		/* target.setPassengerName(source.getClient().get); */
		/* target.setRoe(source.getRoe()); */
	}
}