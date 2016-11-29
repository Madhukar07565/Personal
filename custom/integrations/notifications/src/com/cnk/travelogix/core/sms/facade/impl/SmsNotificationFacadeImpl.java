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
package com.cnk.travelogix.core.sms.facade.impl;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.task.TaskModel;
import de.hybris.platform.task.TaskService;

import java.util.Calendar;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cnk.travelogix.core.sms.facade.SmsNotificationFacade;
import com.cnk.travelogix.model.SMSContextModel;

/**
 * @author I077988
 */
public class SmsNotificationFacadeImpl implements SmsNotificationFacade {

    private static final Logger LOG = LoggerFactory.getLogger(SmsNotificationFacadeImpl.class);

    @Resource(name = "modelService")
    private ModelService modelService;
    @Resource(name = "taskService")
    private TaskService taskService;

    @Override
    public void sendSmsNotification(final String toMobileNumber, final String smsText) {
	LOG.info("#sendSmsNotification - Start");
	LOG.debug("#smsNotification - MobileNumber:{}, SmsTest:{}", toMobileNumber, smsText);
	final TaskModel task = modelService.create(TaskModel.class);
	task.setRunnerBean("smsTaskRunner");
	// the execution time is current time
	task.setExecutionDate(Calendar.getInstance().getTime());
	final SMSContextModel smsContext = new SMSContextModel();
	smsContext.setSmsNotification(smsText);
	smsContext.setToMobileNumber(toMobileNumber);
	modelService.save(smsContext);
	task.setContext(smsContext);
	taskService.scheduleTask(task);
	LOG.info("#sendSmsNotification - Finish");
    }
}
