/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.process.action;

import de.hybris.platform.acceleratorservices.email.EmailService;
import de.hybris.platform.acceleratorservices.model.email.EmailAddressModel;
import de.hybris.platform.acceleratorservices.model.email.EmailMessageModel;
import de.hybris.platform.acceleratorservices.process.email.actions.GenerateEmailAction;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.task.RetryLaterException;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.mdmbackoffice.process.model.EmployeeRegistrationProcessModel;
import com.google.common.collect.Lists;


/** This Action class is used for generating the Email for register employee
 * @author C5244543
 *
 */
public class EmployeeRegistrationPasswordNotificationEmailAction extends GenerateEmailAction
{

	private static final Logger LOG = Logger.getLogger(EmployeeRegistrationPasswordNotificationEmailAction.class);

	private EmailService emailService;
	private ModelService modelService;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.acceleratorservices.process.email.actions.GenerateEmailAction#executeAction(de.hybris.platform
	 * .processengine.model.BusinessProcessModel)
	 */
	@Override
	public Transition executeAction(final BusinessProcessModel businessProcessModel) throws RetryLaterException
	{
		final Transition transition = super.executeAction(businessProcessModel);

		if (transition == Transition.OK)
		{
			if (businessProcessModel instanceof EmployeeRegistrationProcessModel)
			{
				final EmployeeRegistrationProcessModel employeeRegistrationProcessModel = (EmployeeRegistrationProcessModel) businessProcessModel;
				final EmployeeModel employee = employeeRegistrationProcessModel.getEmployee();
				// Get the emails of said employees
				final EmailAddressModel recipient = getEmailAddressesOfEmployee1(employee);
				final List<EmailAddressModel> recipients = Lists.newArrayList(recipient);
				if (CollectionUtils.isEmpty(recipients))
				{
					LOG.warn(String.format("'%s' is not having email address.", employee.getName()));
					return Transition.NOK;
				}
				// Get the email message (there should only be one!) and set recipients
				final EmailMessageModel emailMessage = businessProcessModel.getEmails().iterator().next();
				emailMessage.setToAddresses(recipients);
				modelService.save(emailMessage);

			}
		}
		return transition;

	}

	public EmailAddressModel getEmailAddressesOfEmployee(final EmployeeModel employee)
	{
		EmailAddressModel emailAddress = null;
		for (final AddressModel address : Lists.newArrayList(employee.getAddresses()))
		{
			if (BooleanUtils.isTrue(address.getContactAddress()))
			{
				if (StringUtils.isNotBlank(address.getEmail()))
				{
					emailAddress = emailService.getOrCreateEmailAddressForEmail(address.getEmail(), employee.getName());
				}
				break;
			}
		}

		return emailAddress;

	}

	public EmailAddressModel getEmailAddressesOfEmployee1(final EmployeeModel employee)
	{
		EmailAddressModel emailAddress = null;

		if (StringUtils.isNotBlank(employee.getContactEmail()))
		{
			emailAddress = emailService.getOrCreateEmailAddressForEmail(employee.getContactEmail(), employee.getName());
		}
		return emailAddress;

	}

	/**
	 * @return the emailService
	 */
	public EmailService getEmailService()
	{
		return emailService;
	}

	/**
	 * @param emailService
	 *           the emailService to set
	 */
	public void setEmailService(final EmailService emailService)
	{
		this.emailService = emailService;
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

}
