package com.cnk.travelogix.client.credit.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class ClientcreditManager extends GeneratedClientcreditManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( ClientcreditManager.class.getName() );
	
	public static final ClientcreditManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ClientcreditManager) em.getExtension(ClientcreditConstants.EXTENSIONNAME);
	}
	
}
