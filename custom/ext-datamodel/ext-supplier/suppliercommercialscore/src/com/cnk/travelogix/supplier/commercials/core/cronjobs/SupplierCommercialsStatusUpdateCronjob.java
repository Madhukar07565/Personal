/**
 *
 */
package com.cnk.travelogix.supplier.commercials.core.cronjobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.commercials.core.service.SupplierCommercialHeadsService;


/* Cronjob for changing status of commercial heads
 */
public class SupplierCommercialsStatusUpdateCronjob extends AbstractJobPerformable<CronJobModel>
{
	private static final Logger LOG = Logger.getLogger(SupplierCommercialsStatusUpdateCronjob.class);
	private SupplierCommercialHeadsService supplierCommercialHeadsService;


	@Override
	public PerformResult perform(final CronJobModel cronJobModel)
	{
		try
		{
			supplierCommercialHeadsService.changeCommercialHeadsStatus();
			return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
		}
		catch (final Exception e)
		{
			LOG.error("Exception occurred during comercial head status change", e);
			return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
		}
	}
	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable#perform(de.hybris.platform.cronjob.model.
	 * CronJobModel)
	 */

	/**
	 * @return the supplierCommercialHeadsService
	 */
	public SupplierCommercialHeadsService getSupplierCommercialHeadsService()
	{
		return supplierCommercialHeadsService;
	}

	/**
	 * @param supplierCommercialHeadsService
	 *           the supplierCommercialHeadsService to set
	 */
	public void setSupplierCommercialHeadsService(final SupplierCommercialHeadsService supplierCommercialHeadsService)
	{
		this.supplierCommercialHeadsService = supplierCommercialHeadsService;
	}

}
