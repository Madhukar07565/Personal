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
package com.cnk.travelogix.sapintegrations.facade;

import com.cnk.travelogix.custom.zifws.account.clear.data.ZIffmAccountClearDataRequest;
import com.cnk.travelogix.custom.zifws.account.clear.data.ZIffmAccountClearDataResponse;
import com.cnk.travelogix.custom.zifwsb.inv.cancel.data.ZIffmBillingdocCancelDataRequest;
import com.cnk.travelogix.custom.zifwsb.inv.cancel.data.ZIffmBillingdocCancelDataResponse;
import com.cnk.travelogix.sapintegrations.accdocpost.data.ZIffmAccountDocument;
import com.cnk.travelogix.sapintegrations.accdocpost.data.ZIffmAccountDocumentResponse;
import com.cnk.travelogix.sapintegrations.invoice.create.data.ZIffmBillDocCreateData;
import com.cnk.travelogix.sapintegrations.invoice.create.data.ZIffmBillDocCreateResponseData;
import com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZVendorCreateChangeServiceDataRequest;
import com.cnk.travelogix.sapintegrations.ziffm.vendor.createchange.data.ZVendorCreateChangeServiceDataResponse;


/**
 *
 */
public interface SAPServicesFacade
{
	ZIffmAccountDocumentResponse accDocPost(ZIffmAccountDocument request);

	ZIffmBillDocCreateResponseData createInvoice(final ZIffmBillDocCreateData request);

	ZIffmBillingdocCancelDataResponse invoiceCancel(ZIffmBillingdocCancelDataRequest request);

	ZIffmAccountClearDataResponse accountClear(ZIffmAccountClearDataRequest request);

	ZVendorCreateChangeServiceDataResponse createChangeVendor(ZVendorCreateChangeServiceDataRequest request);
}
