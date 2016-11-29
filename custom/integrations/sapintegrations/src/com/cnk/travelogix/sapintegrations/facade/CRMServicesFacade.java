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

import com.cnk.travelogix.sapintegrations.so.createchange.data.ZifTerpSalesOrderDataRequest;
import com.cnk.travelogix.sapintegrations.so.createchange.data.ZifTerpSalesOrderDataResponse;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsDataRequest;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsDataResponse;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data.ZifTerpPartnerSaveB2BDataRequest;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.b2b.data.ZifTerpPartnerSaveB2BDataResponse;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifTerpPartnerSaveDataRequest;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.custmastercreate.data.ZifTerpPartnerSaveDataResponse;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifTerpOpportunityDataRequest;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.opportunity.data.ZifTerpOpportunityDataResponse;



/**
 *
 */
public interface CRMServicesFacade
{
	ZifTerpPartnerSaveDataResponse partnerSave(final ZifTerpPartnerSaveDataRequest request);

	ZifTerpPartnerSaveB2BDataResponse partnerSaveB2B(final ZifTerpPartnerSaveB2BDataRequest request);

	ZifTerpComplaintsDataResponse complaintsFeedback(final ZifTerpComplaintsDataRequest request);

	ZifTerpOpportunityDataResponse opportunity(final ZifTerpOpportunityDataRequest request);

	ZifTerpSalesOrderDataResponse createChangeSalesOrder(ZifTerpSalesOrderDataRequest request);
}
