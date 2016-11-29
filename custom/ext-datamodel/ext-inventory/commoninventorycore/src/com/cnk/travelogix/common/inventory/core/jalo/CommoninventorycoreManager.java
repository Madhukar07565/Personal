package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class CommoninventorycoreManager extends GeneratedCommoninventorycoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( CommoninventorycoreManager.class.getName() );
	
	public static final CommoninventorycoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CommoninventorycoreManager) em.getExtension(CommoninventorycoreConstants.EXTENSIONNAME);
	}
	
}
