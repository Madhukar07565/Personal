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
package com.cnk.travelogix.core.sms.task;

import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.task.RetryLaterException;
import de.hybris.platform.task.TaskModel;
import de.hybris.platform.task.TaskRunner;
import de.hybris.platform.task.TaskService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.core.sms.client.SmsRestClient;
import com.cnk.travelogix.core.sms.client.dto.NetcoreResponse;
import com.cnk.travelogix.model.SMSContextModel;

/**
 * SmsTaskRunner is responsible for sending SMS messages by calling SMSRestClient
 * 
 * @author I077988
 */
public class SmsTaskRunner implements TaskRunner<TaskModel> {

    private static final Logger LOG = LoggerFactory.getLogger(SmsTaskRunner.class);

    private static final String MAX_RETRY_COUNT = "sms.task.retry.max.count";
    private static final String RETRY_DELAY_TIME = "sms.task.retry.delay.time"; // In Seconds

    @Autowired
    private SmsRestClient smsRestClient;
    @Autowired
    private ConfigurationService configurationService;

    public void run(final TaskService taskService, final TaskModel task) throws RetryLaterException {
	LOG.info("#run - Start");
	final SMSContextModel ctx = (SMSContextModel) task.getContext();
	try {
	    final NetcoreResponse response = smsRestClient.sendSmsNetcore(ctx.getToMobileNumber(), ctx.getSmsNotification());
	    if (response.getREQUESTERROR() != null) {
		LOG.warn("Error Processing SMS - ErrorDescription::{}", response.getREQUESTERROR().getERROR().getDESC());
		retySendSms(task.getRetry());
	    }
	} catch (Exception e) {
	    LOG.warn("#run - Failure ErrorMessage:{}", e);
	    retySendSms(task.getRetry());
	}
	LOG.info("#run - Finish");
    }

    private void retySendSms(final Integer retryCount) {
	final int maxRetryCount = Integer.parseInt(configurationService.getConfiguration().getString(MAX_RETRY_COUNT));
	final int retryDelay = Integer.parseInt(configurationService.getConfiguration().getString(RETRY_DELAY_TIME));
	if (retryCount.intValue() <= maxRetryCount) {
	    final RetryLaterException ex = new RetryLaterException("Error Processing SMS");
	    ex.setDelay(retryDelay);
	    throw ex;
	} else {
	    throw new IllegalStateException("Finally cannot perform after " + retryCount + " retries");
	}
    }

    public void handleError(final TaskService taskService, final TaskModel task, final Throwable error) {
	// this is called if a error occurred or a scheduled action could not be executed in time
	// TODO Need to persist the smscontext in case of a failure 
    }
}
