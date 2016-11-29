/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.operations.facades.populator;

import de.hybris.platform.commercefacades.order.data.CCPaymentInfoData;
import de.hybris.platform.commerceservices.converter.Populator;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.Set;

import org.hsqldb.lib.HashSet;
import org.springframework.util.Assert;

import com.cnk.travelogix.common.core.enums.PaymentModes;
import com.cnk.travelogix.common.core.model.CashOnDeliveryPaymentInfoModel;
import com.cnk.travelogix.masterdata.core.contacts.model.ContactDetailsModel;


/**
 *
 */
public class TravelogixCODPaymentInfoReversePopulator implements Populator<CCPaymentInfoData, CashOnDeliveryPaymentInfoModel>
{

	@Override
	public void populate(final CCPaymentInfoData source, final CashOnDeliveryPaymentInfoModel target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		final Set<ContactDetailsModel> contact = (Set<ContactDetailsModel>) new HashSet();
		final AddressModel addressModel = new AddressModel();
		final ContactDetailsModel contactDetailsModel = new ContactDetailsModel();
		contactDetailsModel.setPersonName(source.getContactPerson());
		contactDetailsModel.setPhone_1(source.getMobileNo());
		contact.add(contactDetailsModel);
		addressModel.setContactDetails(contact);
		target.setDeliveryAddress(addressModel);
		target.setPaymentMode(PaymentModes.valueOf(source.getModeOfPayment()));
	}
}
