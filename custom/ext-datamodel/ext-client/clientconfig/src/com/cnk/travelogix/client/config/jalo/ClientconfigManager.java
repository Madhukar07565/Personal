package com.cnk.travelogix.client.config.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class ClientconfigManager extends GeneratedClientconfigManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( ClientconfigManager.class.getName() );
	
	public static final ClientconfigManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ClientconfigManager) em.getExtension(ClientconfigConstants.EXTENSIONNAME);
	}
	
}
