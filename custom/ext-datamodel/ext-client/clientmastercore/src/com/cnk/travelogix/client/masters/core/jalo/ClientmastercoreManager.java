package com.cnk.travelogix.client.masters.core.jalo;

import com.cnk.travelogix.client.masters.core.constants.ClientmastercoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class ClientmastercoreManager extends GeneratedClientmastercoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( ClientmastercoreManager.class.getName() );
	
	public static final ClientmastercoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ClientmastercoreManager) em.getExtension(ClientmastercoreConstants.EXTENSIONNAME);
	}
	
}
