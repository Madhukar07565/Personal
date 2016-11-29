/**
 *
 */
package com.cnk.travelogix.common.core.util;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;


/**
 * @author i322561
 *
 */
public class EmailGenerationService
{
	private static final Logger LOG = Logger.getLogger(EmailGenerationService.class);

	/**
	 *
	 * @param email
	 * @return
	 * @throws EmailException
	 */
	public static boolean sendMail(final HtmlEmail email) throws EmailException
	{
		final String result = email.send();
		if (!StringUtils.isEmpty(result))
		{
			LOG.info("Email sent successfully to: " + email.getToAddresses());
			return true;
		}
		else
		{
			return false;
		}
	}

}
