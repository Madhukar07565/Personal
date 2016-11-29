package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class ClientcoreManager extends GeneratedClientcoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( ClientcoreManager.class.getName() );
	
	public static final ClientcoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ClientcoreManager) em.getExtension(ClientcoreConstants.EXTENSIONNAME);
	}
	
}
