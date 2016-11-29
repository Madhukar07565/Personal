package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class TransportinventorycoreManager extends GeneratedTransportinventorycoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( TransportinventorycoreManager.class.getName() );
	
	public static final TransportinventorycoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TransportinventorycoreManager) em.getExtension(TransportinventorycoreConstants.EXTENSIONNAME);
	}
	
}
