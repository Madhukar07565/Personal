/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.process.action;

import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.processengine.action.AbstractProceduralAction;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.task.RetryLaterException;

import com.cnk.travelogix.mdmbackoffice.process.model.EmployeeRegistrationProcessModel;


/**
 * This Action class is used for generating the password and setting to the employee.
 *
 * @author C5244543
 *
 */
public class EmployeePasswordGenerateAction extends AbstractProceduralAction<EmployeeRegistrationProcessModel>
{

	private ConfigurationService configurationService;
	private ModelService modelService;
	private UserService userService;

	/*
	 * (non-Javadoc) This method generate the password and set to the employee
	 *
	 * @see
	 * de.hybris.platform.processengine.action.AbstractProceduralAction#executeAction(com.cnk.travelogix.mdmbackoffice.
	 * process.model.EmployeeRegistrationProcessModel)
	 */
	@Override
	public void executeAction(final EmployeeRegistrationProcessModel employeeRegistrationProcessModel)
			throws RetryLaterException, Exception
	{
		final EmployeeModel employee = employeeRegistrationProcessModel.getEmployee();
		final String password = this.configurationService.getConfiguration().getString("employee.default.password", "");
		if (password != null)
		{
			getUserService().setPasswordWithDefaultEncoding(employee, password);
		}
		modelService.save(employee);
	}

	/**
	 * @return the modelService
	 */
	@Override
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	@Override
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * @return the userService
	 */
	public UserService getUserService()
	{
		return userService;
	}

	/**
	 * @param userService
	 *           the userService to set
	 */
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	/**
	 * @param configurationService
	 *           the configurationService to set
	 */
	public void setConfigurationService(final ConfigurationService configurationService)
	{
		this.configurationService = configurationService;
	}
}
