package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class CommonCoreManager extends GeneratedCommonCoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( CommonCoreManager.class.getName() );
	
	public static final CommonCoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CommonCoreManager) em.getExtension(CommonCoreConstants.EXTENSIONNAME);
	}
	
}
