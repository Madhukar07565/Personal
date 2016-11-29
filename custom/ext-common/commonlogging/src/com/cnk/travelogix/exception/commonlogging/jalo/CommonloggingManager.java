package com.cnk.travelogix.exception.commonlogging.jalo;

import com.cnk.travelogix.exception.commonlogging.constants.CommonloggingConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class CommonloggingManager extends GeneratedCommonloggingManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( CommonloggingManager.class.getName() );
	
	public static final CommonloggingManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CommonloggingManager) em.getExtension(CommonloggingConstants.EXTENSIONNAME);
	}
	
}
