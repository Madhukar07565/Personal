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
package com.cnk.travelogix.supplier.settlementterms.core.services.impl;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.List;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.credentials.core.indents.model.CreditDepositIndentModel;
import com.cnk.travelogix.supplier.settlementterms.dao.SupplierSettlementDao;
import com.cnk.travelogix.supplier.settlementterms.model.NoCreditDepositCommSettlementModel;
import com.cnk.travelogix.supplier.settlementterms.model.RaiseIndentCronJobModel;


/**
 * A Cron Job to create Indent Details
 */
public class RaiseIndentJob extends AbstractJobPerformable<RaiseIndentCronJobModel>
{
	private static final Logger LOG = Logger.getLogger(RaiseIndentJob.class);
	private SupplierSettlementDao supplierSettlementDao;

	@Override
	public PerformResult perform(final RaiseIndentCronJobModel raiseIndent)
	{
		try
		{
			final List<NoCreditDepositCommSettlementModel> noCreditDepositList = supplierSettlementDao
					.findNoCreditDepositCommByAmmount();

			for (final NoCreditDepositCommSettlementModel noCreditDepositComm : noCreditDepositList)
			{
				final CreditDepositIndentModel creditDepositIndent = modelService.create(CreditDepositIndentModel.class);

				creditDepositIndent.setCatalogVersion(
						noCreditDepositComm.getStdCommCommisionableSettlement().getSupplierSettlement().getCatalogVersion());
				creditDepositIndent
						.setSupplier(noCreditDepositComm.getStdCommCommisionableSettlement().getSupplierSettlement().getSupplier());
				creditDepositIndent.setCurrency(noCreditDepositComm.getCurrency());
				creditDepositIndent.setModeOfSecurity(noCreditDepositComm.getModeOfSecurity());
				creditDepositIndent.setAmount(noCreditDepositComm.getAmount());
				creditDepositIndent.setCreditType(noCreditDepositComm.getTypeOfCredit());
				creditDepositIndent.setCredentials(noCreditDepositComm.getCredentialNameList());
				modelService.save(creditDepositIndent);
				noCreditDepositComm.setCreatedIndent(Boolean.TRUE);
				modelService.save(noCreditDepositComm);

			}
			return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occurred while creating DepositIndent", e);
			return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
		}
	}

	public SupplierSettlementDao getSupplierSettlementDao()
	{
		return supplierSettlementDao;
	}

	public void setSupplierSettlementDao(final SupplierSettlementDao supplierSettlementDao)
	{
		this.supplierSettlementDao = supplierSettlementDao;
	}

}
