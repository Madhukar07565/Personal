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
package com.cnk.travelogix.sapintegrations.converters.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.List;

import com.cnk.travelogix.contract.provisioning.data.AdditionalInfo;
import com.cnk.travelogix.contract.provisioning.data.ChargingContractItemParameter;
import com.cnk.travelogix.contract.provisioning.data.ChargingContractItemPooledCounter;
import com.cnk.travelogix.contract.provisioning.data.ChargingContractItemRevision;
import com.cnk.travelogix.contract.provisioning.data.ChargingContractItemRevisionAccountAssignment;
import com.cnk.travelogix.contract.provisioning.data.ChargingContractItemSharedCounter;
import com.cnk.travelogix.contract.provisioning.data.ChargingContractItemUserTechnicalIdentifier;
import com.cnk.travelogix.contract.provisioning.data.ChargingContractRevisionData;
import com.cnk.travelogix.contract.provisioning.data.MaintainChargingContractRequestData;
import com.cnk.travelogix.custom.contract.provisioning.ChargingContractRevision;
import com.cnk.travelogix.custom.contract.provisioning.MaintainChargingContractRequest;


/**
 *
 */
public class DefaultContractProvisioningRequestPopulator
		implements Populator<MaintainChargingContractRequestData, MaintainChargingContractRequest>
{

	@Override
	public void populate(final MaintainChargingContractRequestData source, final MaintainChargingContractRequest target)
			throws ConversionException
	{
		final ChargingContractRevisionData reqRevision = source.getChargingContractRevision();
		final ChargingContractRevision revision = new ChargingContractRevision();
		revision.setId(reqRevision.getId());
		revision.setRootChargingContractId(reqRevision.getRootChargingContractId());
		revision.setSubscriberAccountId(reqRevision.getSubscriberAccountId());

		final List<AdditionalInfo> additionalInfos = reqRevision.getAdditionalInfo();
		com.cnk.travelogix.custom.contract.provisioning.AdditionalInfo additionalData;
		for (final AdditionalInfo info : additionalInfos)
		{
			additionalData = new com.cnk.travelogix.custom.contract.provisioning.AdditionalInfo();
			additionalData.setDate(info.getDate());
			additionalData.setDescription(info.getDescription());
			additionalData.setName(info.getName());
			additionalData.setNumber(info.getNumber());
			additionalData.setString(info.getString());
			revision.getAdditionalInfo().add(additionalData);
		}
		final List<ChargingContractItemRevision> chargingContractItemRev = reqRevision.getChargingContractItemRevision();
		for (final ChargingContractItemRevision itemRevision : chargingContractItemRev)
		{
			final com.cnk.travelogix.custom.contract.provisioning.ChargingContractItemRevision newItemRevision = new com.cnk.travelogix.custom.contract.provisioning.ChargingContractItemRevision();
			newItemRevision.setChargePlanClassId(itemRevision.getChargePlanClassId());
			newItemRevision.setEnd(itemRevision.getEnd());
			newItemRevision.setExternalId(itemRevision.getExternalId());
			newItemRevision.setId(itemRevision.getId());
			newItemRevision.setRefillPlanClassId(itemRevision.getRefillPlanClassId());
			final List<ChargingContractItemRevisionAccountAssignment> contAssign = itemRevision.getAccountAssignment();
			for (final ChargingContractItemRevisionAccountAssignment cciraa : contAssign)
			{
				final com.cnk.travelogix.custom.contract.provisioning.ChargingContractItemRevisionAccountAssignment incciraa = new com.cnk.travelogix.custom.contract.provisioning.ChargingContractItemRevisionAccountAssignment();
				incciraa.setAccountId(cciraa.getAccountId());
				incciraa.setName(cciraa.getName());
				newItemRevision.getAccountAssignment().add(incciraa);
			}
			final List<ChargingContractItemParameter> params = itemRevision.getParameter();
			for (final ChargingContractItemParameter ccip : params)
			{
				final com.cnk.travelogix.custom.contract.provisioning.ChargingContractItemParameter inccip = new com.cnk.travelogix.custom.contract.provisioning.ChargingContractItemParameter();
				inccip.setDate(ccip.getDate());
				inccip.setName(ccip.getName());
				inccip.setNumber(ccip.getNumber());
				inccip.setString(ccip.getString());
				newItemRevision.getParameter().add(inccip);
			}
			final List<ChargingContractItemPooledCounter> pools = itemRevision.getPooledCounter();
			for (final ChargingContractItemPooledCounter pool : pools)
			{
				final com.cnk.travelogix.custom.contract.provisioning.ChargingContractItemPooledCounter inPool = new com.cnk.travelogix.custom.contract.provisioning.ChargingContractItemPooledCounter();
				inPool.setName(pool.getName());
				inPool.setNamespace(pool.getNamespace());
				newItemRevision.getPooledCounter().add(inPool);
			}

			final List<ChargingContractItemSharedCounter> shared = itemRevision.getSharedCounter();
			for (final ChargingContractItemSharedCounter ccisc : shared)
			{
				final com.cnk.travelogix.custom.contract.provisioning.ChargingContractItemSharedCounter inCcisc = new com.cnk.travelogix.custom.contract.provisioning.ChargingContractItemSharedCounter();
				inCcisc.setName(ccisc.getName());
				inCcisc.setNamespace(ccisc.getNamespace());
				newItemRevision.getSharedCounter().add(inCcisc);
			}
			final List<ChargingContractItemUserTechnicalIdentifier> useIds = itemRevision.getUserTechnicalIdentifier();
			for (final ChargingContractItemUserTechnicalIdentifier userId : useIds)
			{
				final com.cnk.travelogix.custom.contract.provisioning.ChargingContractItemUserTechnicalIdentifier id = new com.cnk.travelogix.custom.contract.provisioning.ChargingContractItemUserTechnicalIdentifier();
				id.setName(userId.getName());
				id.setUserServiceId(userId.getUserServiceId());
				newItemRevision.getUserTechnicalIdentifier().add(id);
			}
			revision.getChargingContractItemRevision().add(newItemRevision);
		}
		target.setChargingContractRevision(revision);
		target.setDate(source.getDate());
	}

}
