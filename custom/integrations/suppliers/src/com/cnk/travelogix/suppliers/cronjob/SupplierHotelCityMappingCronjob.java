package com.cnk.travelogix.suppliers.cronjob;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.suppliers.service.SupplierHotelCityMappingService;

public class SupplierHotelCityMappingCronjob extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = Logger.getLogger(SupplierHotelCityMappingCronjob.class);
    @Autowired
    private SupplierHotelCityMappingService supplierHotelCityMappingService;

    @Override
    public PerformResult perform(final CronJobModel arg0) {
	LOG.info("SupplierHotelCityMappingCronjob.perform - Start");
	final boolean flag = supplierHotelCityMappingService.getAllSupplierHotelCity();
	if (flag) {
	    LOG.info("Supplier Hotel city mapping dump is successfull ");
	    return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	} else {
	    LOG.info("Supplier Hotel city mapping dump is not successfull ");
	    return new PerformResult(CronJobResult.FAILURE, CronJobStatus.FINISHED);
	}
    }

}
