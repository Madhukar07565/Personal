/**
 *
 */
package com.cnk.travelogix.common.core.captcha.services;


public interface CaptchaService
{
	public enum RecaptchaAttribute
	{
		size("com.cnk.travelogix.common.core.recaptcha.CaptchaSize"), theme(
				"com.cnk.travelogix.common.core.recaptcha.CaptchaTheme"), language(
						"com.cnk.travelogix.common.core.recaptcha.CaptchaLanguage");
		private final String value;

		RecaptchaAttribute(final String value)
		{
			this.value = value;
		}

		public String getValue()
		{
			return value;
		}
	}

	/**
	 * @param key
	 *           choose among 'size','theme','language' to set
	 * @param val
	 *           provide the value of the attributes, notice the term please.
	 */
	public void customizeReCaptcha(RecaptchaAttribute key, String val);

	/**
	 * To verify the Captcha response, return true if it is verified.
	 *
	 * @param gRecaptchaResponse
	 *           The Response String to be verified
	 * @param hostname
	 *           The server's hostname.Just for security.
	 *
	 * @return verify success or not
	 */
	boolean verify(final String gRecaptchaResponse, final String hostname);
}
