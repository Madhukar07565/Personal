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
package com.cnk.travelogix.operations.facades;

import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.product.data.ProductData;


/**
 * @author C5244544
 */
public interface FirstBookingCheckFacade
{
	/**
	 * this is a method to check that the supplier is new or not
	 *
	 */
	public boolean isNewSupplier(OrderEntryData orderEntry);


	/**
	 * this is a method to check that the product is applicable for first booking check
	 *
	 */
	public boolean isFirstBookingCheckEnabledProd(ProductData productData);
}
