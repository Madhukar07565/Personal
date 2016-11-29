/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *  
 */
package com.cnk.travelogix.strategies.impl;


import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import com.cnk.travelogix.strategies.OrderCodeIdentificationStrategy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Required;


/**
 * Default implementation of {@link com.cnk.travelogix.strategies.OrderCodeIdentificationStrategy}.
 */
public class DefaultOrderCodeIdentificationStrategy implements OrderCodeIdentificationStrategy
{
	private String idPattern;

	/**
	 * Checks if given string is GUID
	 *
	 * @param potentialId
	 *           - string to check
	 * @return result
	 */
	@Override
	public boolean isID(final String potentialId)
	{
		validateParameterNotNull(potentialId, "identifier must not be null");
		if (potentialId == null || potentialId.isEmpty())
		{
			return false;
		}

		final Pattern pattern = Pattern.compile(this.idPattern);
		final Matcher matcher = pattern.matcher(potentialId);
		if (matcher.find())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Required
	public void setIdPattern(final String idPattern)
	{
		this.idPattern = idPattern;
	}
}
