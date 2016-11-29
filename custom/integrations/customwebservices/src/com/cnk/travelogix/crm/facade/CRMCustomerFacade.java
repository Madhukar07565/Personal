package com.cnk.travelogix.crm.facade;
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



import com.cnk.travelogix.sap.crm.integration.mapping.dto.CRMCustReplicationWSRequest;
import com.cnk.travelogix.sap.crm.integration.mapping.dto.CRMCustReplicationWSResponse;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;


/**
 *
 */
public interface CRMCustomerFacade
{
	public CRMCustReplicationWSResponse createUpdateUser(final CRMCustReplicationWSRequest crmCustReplicationWSRequest)
			throws DuplicateUidException;
}
