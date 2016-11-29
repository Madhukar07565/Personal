package com.cnk.travelogix.acco.inventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class AccoinventorycoreManager extends GeneratedAccoinventorycoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( AccoinventorycoreManager.class.getName() );
	
	public static final AccoinventorycoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AccoinventorycoreManager) em.getExtension(AccoinventorycoreConstants.EXTENSIONNAME);
	}
	
}
