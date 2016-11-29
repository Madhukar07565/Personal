package com.cnk.travelogix.activity.inventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class ActivityinventorycoreManager extends GeneratedActivityinventorycoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( ActivityinventorycoreManager.class.getName() );
	
	public static final ActivityinventorycoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ActivityinventorycoreManager) em.getExtension(ActivityinventorycoreConstants.EXTENSIONNAME);
	}
	
}
