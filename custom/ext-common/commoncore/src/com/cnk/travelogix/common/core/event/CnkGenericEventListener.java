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

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;


/**
 * @author i318043
 *
 */
public class CnkGenericEventListener extends AbstractEventListener<CnkGenericEvent>
{
	private static final Logger LOG = Logger.getLogger(CnkGenericEventListener.class);

	private List<CnkGenericEventStrategy> eventStrategyList;

	/**
	 * @param eventStrategyList
	 *           the eventStrategyList to set
	 */
	public void setEventStrategyList(final List<CnkGenericEventStrategy> eventStrategyList)
	{
		this.eventStrategyList = eventStrategyList;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.event.impl.AbstractEventListener#onEvent(de.hybris.platform.servicelayer.event.
	 * events.AbstractEvent)
	 */
	@Override
	protected void onEvent(final CnkGenericEvent event)
	{
		final Class strategyClass = event.getStrategyClass();
		if (LOG.isDebugEnabled())
		{
			LOG.debug("onEvent(CnkGenericEvent) - start - invoking " + strategyClass.getName()); //$NON-NLS-1$
		}
		eventStrategyList.stream().filter(strategy -> strategy.getClass().equals(strategyClass)).forEach(strategy -> {
			try
			{
				strategy.handleEvent(event.getPayloads());
			}
			catch (final Exception e)
			{
				LOG.error("onEvent(CnkGenericEvent) - error", e);
			}
		});

		if (LOG.isDebugEnabled())
		{
			LOG.debug("onEvent(CnkGenericEvent) - end"); //$NON-NLS-1$
		}
	}

	@FunctionalInterface
	public static interface CnkGenericEventStrategy
	{
		void handleEvent(Map<String, Object> payloads);
	}

}



