package com.cnk.travelogix.supplier.credentials.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.credentials.core.indents.model.TicketCappingIndentModel;


/**
 * Prepare interceptor for TicketCappingIndent
 */
public class TicketCappingIndentPrepareInterceptor implements PrepareInterceptor<TicketCappingIndentModel>
{
	private final Logger log = Logger.getLogger(TicketCappingIndentPrepareInterceptor.class);

	private KeyGenerator keyGenerator;
	private static final String CODE_PREFIX = "CAPTKT";

	@Override
	public void onPrepare(final TicketCappingIndentModel ticketCappingIndent, final InterceptorContext context)
			throws InterceptorException
	{
		if (ticketCappingIndent.getCode() == null)
		{
			ticketCappingIndent.setCode(CODE_PREFIX + keyGenerator.generate().toString());
			log.debug("Set new code for TicketCappingIndentModel -" + ticketCappingIndent.getCode());
		}
	}

	/**
	 * @return the keyGenerator
	 */
	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}

	/**
	 * @param keyGenerator
	 *           the keyGenerator to set
	 */
	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}

}
