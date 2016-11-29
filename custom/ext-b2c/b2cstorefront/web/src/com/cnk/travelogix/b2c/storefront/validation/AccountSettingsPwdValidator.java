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
@Component("accountSettingsPwdValidator")
public class AccountSettingsPwdValidator implements Validator
{

	@Override
	public void validate(final Object object, final Errors errors)
	{
		final AccountSettingsForm form = (AccountSettingsForm) object;
		final String newPwd = form.getNewPwd();
		final String checkNewPwd = form.getCheckNewPwd();

		validatePassword(errors, newPwd);
		compareConsisitency(errors, newPwd, checkNewPwd);
	}

	protected void compareConsisitency(final Errors errors, final String value, final String checkValue)
	{
		if (StringUtils.isNotEmpty(value) && StringUtils.isNotEmpty(checkValue) && !StringUtils.equals(value, checkValue))
		{
			errors.rejectValue("checkNewPwd", "account.settings.checkPwd.equals");
		}
		else
		{
			if (StringUtils.isEmpty(checkValue))
			{
				errors.rejectValue("checkNewPwd", "account.settings.checkPwd.equals");
			}
		}
	}

	protected void validatePassword(final Errors errors, final String pwd)
	{
		if (StringUtils.isEmpty(pwd))
		{
			errors.rejectValue("newPwd", "register.pwd.invalid");
		}
		else if (StringUtils.length(pwd) < 6 || StringUtils.length(pwd) > 255)
		{
			errors.rejectValue("newPwd", "register.pwd.invalid");
		}
		else if (!checkPwdComplexity(pwd))
		{
			errors.rejectValue("newPwd", "register.pwd.invalid");
		}
	}

	private boolean checkPwdComplexity(final String pwd)
	{
		final Pattern p = Pattern.compile(
				"([0-9].*([a-zA-Z].*[~!@#$%^&*()+=|{}':;',\\[\\].<>/?~]|[~!@#$%^&*()+=|{}':;',\\[\\].<>/?~].*[a-zA-Z])|[a-zA-Z].*([0-9].*[~!@#$%^&*()+=|{}':;',\\[\\].<>/?~]|[~!@#$%^&*()+=|{}':;',\\[\\].<>/?~].*[0-9])|[~!@#$%^&*()+=|{}':;',\\[\\].<>/?~].*([0-9].*[a-zA-Z]|[a-zA-Z].*[0-9]))");
		final Matcher m = p.matcher(pwd);
		return m.matches();
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	public boolean supports(final Class<?> aClass)
	{
		return AccountSettingsForm.class.equals(aClass);
	}

}
