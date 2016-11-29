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
package com.cnk.travelogix.common.core.event;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.event.AbstractCommerceUserEvent;


/**
 * Forgotten password event, implementation of {@link AbstractCommerceUserEvent}
 */
public class B2cAccountEnableEvent extends AbstractCommerceUserEvent<BaseSiteModel>
{
	private String token;

	/**
	 * Default constructor
	 */
	public B2cAccountEnableEvent()
	{
		super();
	}

	/**
	 * Parameterized Constructor
	 * 
	 * @param token
	 */
	public B2cAccountEnableEvent(final String token)
	{
		super();
		this.token = token;
	}

	/**
	 * @return the token
	 */
	public String getToken()
	{
		return token;
	}

	/**
	 * @param token
	 *           the token to set
	 */
	public void setToken(final String token)
	{
		this.token = token;
	}

}
