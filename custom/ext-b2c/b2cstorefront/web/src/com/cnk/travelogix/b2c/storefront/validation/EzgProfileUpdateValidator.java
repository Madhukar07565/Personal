/**
 *
 */
package com.cnk.travelogix.b2c.storefront.validation;

import de.hybris.platform.commercefacades.user.data.ProfileData;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


/**
 * @author i322561
 *
 */
@Component("ezgProfileUpdateValidator")
public class EzgProfileUpdateValidator implements Validator
{

	@Override
	public void validate(final Object object, final Errors errors)
	{
		final ProfileData profileData = (ProfileData) object;
		final String firstName = profileData.getFirstName().trim();
		final String middleName = profileData.getMiddleName().trim();
		final String lastName = profileData.getLastName().trim();
		final String emailId = profileData.getEmailId();
		final List<String> areaCodeList = profileData.getAreaCode();
		final List<String> mobileNumberList = profileData.getMobileNumber();

		if (firstName == null || !firstName.matches("[a-zA-Z ]+"))
		{
			errors.rejectValue("firstName", "account.profile.firstname.invalid");
		}

		if (middleName != null && !"".equals(middleName))
		{
			if (!middleName.matches("[a-zA-Z ]+"))
			{
				errors.rejectValue("middleName", "account.profile.middlename.invalid");
			}
		}

		if (lastName == null || !lastName.matches("[a-zA-Z ]+"))
		{
			errors.rejectValue("lastName", "account.profile.lastname.invalid");
		}

		if (areaCodeList == null)
		{
			errors.rejectValue("areaCode", "1");
		}
		else if (mobileNumberList == null)
		{
			errors.rejectValue("mobileNumber", "1");
		}
		else
		{
			for (int i = 0; i < areaCodeList.size(); i++)
			{
				if (i == 0)
				{
					if (!areaCodeList.get(i).matches("[+][0-9]{1,4}"))
					{
						errors.rejectValue("areaCode", "1");
					}
					if (!mobileNumberList.get(i).matches("[0-9]{10}"))
					{
						errors.rejectValue("mobileNumber", "1");
					}
				}
				else
				{
					if (!("".equals(areaCodeList.get(i)) && "".equals(mobileNumberList.get(i))))
					{
						if (!areaCodeList.get(i).matches("[+][0-9]{1,4}"))
						{
							errors.rejectValue("areaCode", Integer.toString(i + 1));
						}
						if (!mobileNumberList.get(i).matches("[0-9]{10}"))
						{
							errors.rejectValue("mobileNumber", Integer.toString(i + 1));
						}
					}
				}
			}
		}

		if (emailId == null || !emailId.matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b"))
		{
			errors.rejectValue("emailId", "account.profile.emailId.invalid");
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(final Class<?> arg0)
	{
		return false;
	}
}
