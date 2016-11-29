/**
 *
 */
package com.cnk.travelogix.supplier.masters.core.services.impl;

import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.model.TravelogixPolicyModel;
import com.cnk.travelogix.supplier.masters.core.services.PolicyIdService;


/**
 * code to generate policy id which implements PolicyIdService
 *
 */
public class DefaultPolicyIdService implements PolicyIdService
{

	private KeyGenerator keyGenerator;
	private static final Logger LOG = Logger.getLogger(DefaultPolicyIdService.class);
	String key = "";

	/*
	 * method which generate code for Policy ID
	 *
	 * @see
	 * com.cnk.travelogix.supplier.masters.core.services.PolicyIdService#generatePolicyId(com.cnk.travelogix.masterdata.
	 * core.model.TravelogixPolicyModel)
	 */
	@Override
	public void generatePolicyId(final TravelogixPolicyModel travelogixPolicyModel)
	{

		if (StringUtils.isNotEmpty(travelogixPolicyModel.getPolicyType().getCode())
				&& StringUtils.isNotEmpty(travelogixPolicyModel.getPolicyType().getCode()))
		{
			key = travelogixPolicyModel.getPolicyType().getCode().concat(keyGenerator.generate().toString());
			travelogixPolicyModel.setCode(key);
			LOG.debug("Generated code for Policy ID is  " + travelogixPolicyModel.getCode());
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
