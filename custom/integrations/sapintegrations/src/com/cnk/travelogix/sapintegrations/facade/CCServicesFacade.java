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

import com.cnk.travelogix.contract.provisioning.data.ContractOperationResponseData;
import com.cnk.travelogix.contract.provisioning.data.MaintainChargingContractRequestData;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargeableItemChargeRequestData;
import com.cnk.travelogix.sapintegrations.chargeable.itemcharging.data.ChargeableItemChargeResponseData;
import com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.MaintainMappingTableRequestData;
import com.cnk.travelogix.sapintegrations.mappingtable.maintain.data.MappingTableOperationResponseData;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountCancelRequest;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountMaintainData;
import com.cnk.travelogix.sapintegrations.subscribe.account.data.SubscriberAccountOperationResponseData;


/**
 *
 */
public interface CCServicesFacade
{
	SubscriberAccountOperationResponseData subscribeAccMaintain(SubscriberAccountMaintainData request);

	MappingTableOperationResponseData createMappingTableMaintain(final MaintainMappingTableRequestData request);

	SubscriberAccountOperationResponseData canceSubscriberAccount(SubscriberAccountCancelRequest cancelRequestData);

	public ContractOperationResponseData contractProvisioning(final MaintainChargingContractRequestData request);

	public ChargeableItemChargeResponseData itemCharging(ChargeableItemChargeRequestData request);
}
