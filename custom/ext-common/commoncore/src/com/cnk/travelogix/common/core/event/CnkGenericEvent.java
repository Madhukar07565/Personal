package com.cnk.travelogix.common.core.event;

import de.hybris.platform.core.Registry;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.event.ClusterAwareEvent;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;


/**
 *
 * <p>
 * If you hate to create events please use this generic one.
 * <p>
 * Note: Only the strategy class should process the corresponding events.
 *
 * @author i318043
 *
 */
public class CnkGenericEvent extends AbstractEvent implements ClusterAwareEvent
{
	/**
	 * Logger for this class
	 */
	private static final Logger LOG = Logger.getLogger(CnkGenericEvent.class);

	private static final String LISTENER_CLUSTER_IDS_TEMPLATE = "commoncore.event.%s-listener-cluster-ids";
	private final Class strategyClass;
	private final Map<String, Object> payloads;

	/**
	 * @return the strategyClass
	 */
	public Class getStrategyClass()
	{
		return strategyClass;
	}

	/**
	 * @return the payloads
	 */
	public Map<String, Object> getPayloads()
	{
		return payloads;
	}

	public CnkGenericEvent(final Class strategyClass, final Map<String, Object> payloads)
	{
		this.strategyClass = strategyClass;
		this.payloads = payloads;
	}

	@SuppressWarnings("boxing")
	@Override
	public boolean publish(final int sourceNodeId, final int targetNodeId)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("publish(int, int) - start"); //$NON-NLS-1$
		}

		List<Integer> clusterIdList = new ArrayList<>();
		final String configKey = String.format(LISTENER_CLUSTER_IDS_TEMPLATE, this.strategyClass.getSimpleName());
		final ConfigurationService configurationService = Registry.getApplicationContext().getBean(ConfigurationService.class);
		final String clusterIds = configurationService.getConfiguration().getString(configKey);
		if (StringUtils.isNotBlank(clusterIds))
		{
			clusterIdList = Arrays.stream(clusterIds.split("[;,]")).map(String::trim).mapToInt(Integer::parseInt).boxed()
					.collect(Collectors.toList());
		}
		////decide from and to which clusternode this event should be sent
		//return targetNodeId == 12; //broadcast to cluster node 12 only
		////return sourceNodeId < 5 && targetNodeId >= 5; //broadcast any event from any cluster node 1-4 to the cluster nodes 5-?
		////return true; //broadcast from all to all cluster nodes
		final boolean publishResult = clusterIdList.contains(targetNodeId);
		if (LOG.isDebugEnabled())
		{
			final String logMsg = "publish(int, int) - end - sourceId: %s, targetId: %s, publishResult: %s";
			LOG.debug(String.format(logMsg, sourceNodeId, targetNodeId, publishResult)); //$NON-NLS-1$
		}
		return publishResult;
	}
}
