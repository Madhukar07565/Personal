/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.email.context;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.customer.impl.DefaultCustomerEmailResolutionService;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.util.mail.MailUtils;

import org.apache.commons.mail.EmailException;
import org.apache.log4j.Logger;

import com.cnk.travelogix.mdmbackoffice.process.model.EmployeeRegistrationProcessModel;


/**This context class used for employee registration email template
 * 
 * @author C5244543
 *
 */
public class EmployeeRegistrationEmailContext extends AbstractEmailContext<EmployeeRegistrationProcessModel>
{
	private static final Logger LOG = Logger.getLogger(EmployeeRegistrationEmailContext.class);

	private EmployeeModel employeeModel;
private String employeeUid;
	/**
 * @return the employeeUid
 */
public String getEmployeeUid()
{
	return employeeUid;
}

/**
 * @param employeeUid the employeeUid to set
 */
public void setEmployeeUid(String employeeUid)
{
	this.employeeUid = employeeUid;
}

	/**
	 * @return the employeeModel
	 */
	public EmployeeModel getEmployeeModel()
	{
		return employeeModel;
	}

	/**
	 * @param employeeModel
	 *           the employeeModel to set
	 */
	public void setEmployeeModel(final EmployeeModel employeeModel)
	{
		this.employeeModel = employeeModel;
	}

	@Override
	public void init(final EmployeeRegistrationProcessModel businessProcessModel, final EmailPageModel emailPageModel)
	{
		super.init(businessProcessModel, emailPageModel);
		setEmployeeModel(businessProcessModel.getEmployee());
		put(EMAIL, businessProcessModel.getEmployee().getContactEmail());
		put(FROM_DISPLAY_NAME, emailPageModel.getFromName());
		setEmployeeUid(businessProcessModel.getEmployee().getUid());

		final EmployeeModel employeeModel = getEmployeeModel();
		if (employeeModel != null)
		{
			put(TITLE, "Dear");
			put(DISPLAY_NAME, employeeModel.getDisplayName());
			put(EMAIL, validateAndProcessEmailForEmployee(employeeModel));
		}


	}

	protected String validateAndProcessEmailForEmployee(final EmployeeModel employeeModel)
	{
		validateParameterNotNullStandardMessage("employeeModel", employeeModel);

		final String email = employeeModel.getContactEmail();
		try
		{
			MailUtils.validateEmailAddress(email, "employee email");
			return email;
		}
		catch (final EmailException e)
		{
			LOG.info("Given contact email is not appropriate email [" + email + "]. cause: " + e.getMessage());
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext#getSite(de.hybris.platform.
	 * processengine.model.BusinessProcessModel)
	 */
	@Override
	protected BaseSiteModel getSite(final EmployeeRegistrationProcessModel businessProcessModel)
	{
		return businessProcessModel.getSite();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext#getCustomer(de.hybris.platform.
	 * processengine.model.BusinessProcessModel)
	 */
	@Override
	protected CustomerModel getCustomer(final EmployeeRegistrationProcessModel businessProcessModel)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext#getEmailLanguage(de.hybris.
	 * platform.processengine.model.BusinessProcessModel)
	 */
	@Override
	protected LanguageModel getEmailLanguage(final EmployeeRegistrationProcessModel businessProcessModel)
	{
		return null;
	}
}
