package com.cnk.travelogix.suppliers.cronjob;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.suppliers.service.SupplierCountryMappingService;

public class SupplierCountryMappingCronjob extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = Logger.getLogger(SupplierCountryMappingCronjob.class);

    @Autowired
    private SupplierCountryMappingService supplierCountryMappingService;

    @Override
    public PerformResult perform(final CronJobModel cronJob) {
	LOG.info("SupplierCountryMappingCronjob.perform - Start");
	final boolean flag = supplierCountryMappingService.getAllSupplierCountry();
	if (flag) {
	    LOG.info("Supplier country mapping dump is successfull ");
	    return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	} else {
	    LOG.info("Supplier country mapping dump is not successfull ");
	    return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
	}
    }

}
