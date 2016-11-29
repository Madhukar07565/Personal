/**
 *
 */
package com.cnk.travelogix.b2c.storefront.validation;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.cnk.travelogix.b2c.storefront.forms.AccountSettingsForm;


/**
 * @author i322561
 *
 */
@Component("accountSettingsEmailValidator")
public class AccountSettingsEmailValidator extends AccountSettingsUserNameValidator
{

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

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	public void validate(final Object object, final Errors errors)
	{
		final String email = (String) object;
		validateEmail(errors, email);

	}

	@Override
	protected void validateEmail(final Errors errors, final String email)
	{
		if (StringUtils.isEmpty(email))
		{
			errors.rejectValue("subscribeEmail", "register.email.invalid");
		}
		else if (StringUtils.length(email) > 255 || !validateEmailAddress(email))
		{
			errors.rejectValue("subscribeEmail", "register.email.invalid");
		}
	}

}
