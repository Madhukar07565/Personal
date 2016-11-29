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
@Component("accountSettingsMobileValidator")
public class AccountSettingsMobileValidator implements Validator
{
	private static final Pattern MOBILE_REGEX = Pattern.compile("^[0-9]*$");
	//	private static final Pattern MOBILE_REGEX = Pattern.compile("^\d{n}$");

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
		final String mobile = (String) object;
		validateMobile(errors, mobile);

	}

	protected void validateMobile(final Errors errors, final String mobile)
	{
		if (StringUtils.isEmpty(mobile))
		{
			errors.rejectValue("mobile", "account.settings.mobile.invalid");
		}
		else if (!validateMobileFormate(mobile))
		{
			errors.rejectValue("mobile", "account.settings.mobile.invalid");
		}
	}

	protected boolean validateMobileFormate(final String mobile)
	{
		final Matcher matcher = MOBILE_REGEX.matcher(mobile);
		return matcher.matches();
	}

}
