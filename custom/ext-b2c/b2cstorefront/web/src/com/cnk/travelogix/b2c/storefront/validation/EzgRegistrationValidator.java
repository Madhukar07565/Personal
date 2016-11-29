/**
 *
 */
package com.cnk.travelogix.b2c.storefront.validation;

import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.RegistrationValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.cnk.travelogix.b2c.storefront.forms.EzgRegisterForm;


/**
 * @author i322561
 *
 */
@Component("ezgRegistrationValidator")
public class EzgRegistrationValidator extends RegistrationValidator
{
	public static final Pattern PWD_REGEX = Pattern.compile(
			"([0-9].*([a-zA-Z].*[~!@#$%^&*()+=|{}':;',\\[\\].<>/?~]|[~!@#$%^&*()+=|{}':;',\\[\\].<>/?~].*[a-zA-Z])|[a-zA-Z].*([0-9].*[~!@#$%^&*()+=|{}':;',\\[\\].<>/?~]|[~!@#$%^&*()+=|{}':;',\\[\\].<>/?~].*[0-9])|[~!@#$%^&*()+=|{}':;',\\[\\].<>/?~].*([0-9].*[a-zA-Z]|[a-zA-Z].*[0-9]))");


	@Override
	public void validate(final Object object, final Errors errors)
	{
		final EzgRegisterForm registerForm = (EzgRegisterForm) object;
		final String email = registerForm.getEmail();
		final String pwd = registerForm.getPwd();
		final String checkPwd = registerForm.getCheckPwd();
		final boolean tAndC = registerForm.istAndC();

		validateEmail(errors, email);
		validatePassword(errors, pwd);
		comparePasswords(errors, pwd, checkPwd);
		validateTAndC(errors, tAndC);
	}

	protected void validateTAndC(final Errors errors, final boolean tAndC)
	{
		if (!tAndC)
		{
			errors.rejectValue("tAndC", "validation.tAndC.invalid");
		}
	}

	@Override
	protected void validatePassword(final Errors errors, final String pwd)
	{
		if (StringUtils.isEmpty(pwd))
		{
			errors.rejectValue("pwd", "register.pwd.invalid");
		}
		else if (StringUtils.length(pwd) < 8 || StringUtils.length(pwd) > 255)
		{
			errors.rejectValue("pwd", "register.pwd.invalid");
		}
		else if (!checkPwdComplexity(pwd))
		{
			errors.rejectValue("pwd", "register.pwd.invalid");
		}
	}

	private boolean checkPwdComplexity(final String pwd)
	{
		final Matcher m = PWD_REGEX.matcher(pwd);
		return m.matches();
	}

}
