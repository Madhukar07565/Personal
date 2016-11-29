package com.cnk.travelogix.client.settlementterms.jalo;

import com.cnk.travelogix.client.settlementterms.constants.ClientsettlementtermscoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class ClientsettlementtermscoreManager extends GeneratedClientsettlementtermscoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( ClientsettlementtermscoreManager.class.getName() );
	
	public static final ClientsettlementtermscoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ClientsettlementtermscoreManager) em.getExtension(ClientsettlementtermscoreConstants.EXTENSIONNAME);
	}
	
}
