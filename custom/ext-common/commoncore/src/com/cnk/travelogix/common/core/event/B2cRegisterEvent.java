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
 * Registration event, implementation of {@link AbstractCommerceUserEvent}
 */
public class B2cRegisterEvent extends AbstractCommerceUserEvent<BaseSiteModel>
{
	private String password;
	private String randomCode;
	private EventType eventType;

	public enum EventType
	{
		REGISTRATION, ACTIVATION;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(final String password)
	{
		this.password = password;
	}

	public String getRandomCode()
	{
		return randomCode;
	}

	public void setRandomCode(final String randomCode)
	{
		this.randomCode = randomCode;
	}

	public EventType getEventType()
	{
		return eventType;
	}

	public void setEventType(final EventType eventType)
	{
		this.eventType = eventType;
	}
}
