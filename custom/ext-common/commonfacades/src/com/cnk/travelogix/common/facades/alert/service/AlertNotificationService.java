/**
 *
 */
package com.cnk.travelogix.common.facades.alert.service;

import de.hybris.platform.core.model.user.EmployeeModel;


/**
 *
 *
 */
public interface AlertNotificationService
{
	public void sendNotification(final String jobId, final String alertMessage, final String jobStatus,
			final EmployeeModel employeeModel);

}
