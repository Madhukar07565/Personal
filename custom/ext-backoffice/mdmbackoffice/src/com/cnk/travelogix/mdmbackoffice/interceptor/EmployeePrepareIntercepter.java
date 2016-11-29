/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.interceptor;

import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;


/**
 * This PrepareIntersepter used for setting the Employee name with combination of firstName+middleName+lastName
 *
 * @author C5244543
 *
 */
public class EmployeePrepareIntercepter implements PrepareInterceptor<EmployeeModel>
{
	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final EmployeeModel employee, final InterceptorContext arg1) throws InterceptorException
	{
		final StringBuffer displayName = new StringBuffer();
		displayName.append(employee.getFirstName());
		displayName.append(
				employee.getMiddleName() != null && !employee.getMiddleName().isEmpty() ? " " + employee.getMiddleName() : "");
		displayName.append(employee.getLastName() != null && !employee.getLastName().isEmpty() ? " " + employee.getLastName() : "");
		employee.setName(displayName.toString());
	}

}
