package com.cnk.travelogix.presales.core.service.impl;

import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;

import com.cnk.travelogix.date.util.TravelogixDateUtil;
import com.cnk.travelogix.presales.core.service.AssuredBusinessService;
import com.cnk.travelogix.presales.model.AssuredBusinessModel;


/**
 * Generates code using keyGenerator and set into AssuredBusinessId attribute.
 */
public class DefaultAssuredBusinessService implements AssuredBusinessService
{
	private static final Logger LOG = Logger.getLogger(DefaultAssuredBusinessService.class);

	private KeyGenerator keyGenerator;

	@Override
	public void generateAssuredBusinessId(final AssuredBusinessModel assuredBusinessModel)
	{
		if (assuredBusinessModel.getAssuredBusinessId() == null)
		{
			assuredBusinessModel.setAssuredBusinessId("ASB" + keyGenerator.generate());
			LOG.debug("Set new code for AssuredBusinessModel Model -" + assuredBusinessModel.getAssuredBusinessId());
		}
	}

	@Override
	public boolean validateToDate(final AssuredBusinessModel assuredBusinessModel)
	{
		final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		final String fromDate = df.format(assuredBusinessModel.getValidFrom());
		final String toDate = df.format(assuredBusinessModel.getValidTo());

		if (assuredBusinessModel.getValidFrom() != null && assuredBusinessModel.getValidTo() != null)
		{
			final TravelogixDateUtil checkDate = new TravelogixDateUtil();
			return checkDate.validateDate(fromDate, toDate);
		}
		return true;
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
