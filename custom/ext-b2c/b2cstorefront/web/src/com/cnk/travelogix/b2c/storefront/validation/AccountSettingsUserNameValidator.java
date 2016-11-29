/**
 *
 */
package com.cnk.travelogix.b2c.storefront.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cnk.travelogix.b2c.storefront.forms.AccountSettingsForm;


/**
 * @author i322561
 *
 */
@Component("accountSettingsUserNameValidator")
public class AccountSettingsUserNameValidator implements Validator
{

	private static final Pattern EMAIL_REGEX = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");

	@Override
	public void validate(final Object object, final Errors errors)
	{
		final AccountSettingsForm form = (AccountSettingsForm) object;
		final String userName = form.getNewUserName();
		final String checkUserName = form.getCheckNewUserName();

		validateEmail(errors, userName);
		compareConsisitency(errors, userName, checkUserName);
	}

	protected void validateEmail(final Errors errors, final String email)
	{
		if (StringUtils.isEmpty(email))
		{
			errors.rejectValue("newUserName", "register.email.invalid");
		}
		else if (StringUtils.length(email) > 255 || !validateEmailAddress(email))
		{
			errors.rejectValue("newUserName", "register.email.invalid");
		}
	}

	protected boolean validateEmailAddress(final String email)
	{
		final Matcher matcher = EMAIL_REGEX.matcher(email);
		return matcher.matches();
	}

	protected void compareConsisitency(final Errors errors, final String value, final String checkValue)
	{
		if (StringUtils.isNotEmpty(value) && StringUtils.isNotEmpty(checkValue) && !StringUtils.equals(value, checkValue))
		{
			errors.rejectValue("checkNewUserName", "account.settings.checkUserName.equals");
		}
		else
		{
			if (StringUtils.isEmpty(checkValue))
			{
				errors.rejectValue("checkNewUserName", "account.settings.checkUserName.equals");
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(final Class<?> aClass)
	{
		return AccountSettingsForm.class.equals(aClass);
	}

}
