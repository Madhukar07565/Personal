package com.cnk.travelogix.exception.commonlogging.event;

import de.hybris.platform.servicelayer.event.ClusterAwareEvent;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;


public class TravelogixErrorMasterEvent extends AbstractEvent implements ClusterAwareEvent
{
	private final String category;
	private final String code;

	public TravelogixErrorMasterEvent(final String code, final String category)
	{
		super();
		this.code = code;
		this.category = category;
	}

	public String getCategory()
	{
		return category;
	}

	public String getCode()
	{
		return code;
	}

	@Override
	public String toString()
	{

		return this.code + "(" + this.category + ")";
	}


	@Override
	public boolean publish(final int sourceNodeId, final int targetNodeId)
	{
		return (sourceNodeId == targetNodeId);
	}
}