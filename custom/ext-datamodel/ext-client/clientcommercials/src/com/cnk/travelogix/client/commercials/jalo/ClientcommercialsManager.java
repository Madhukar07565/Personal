package com.cnk.travelogix.client.commercials.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class ClientcommercialsManager extends GeneratedClientcommercialsManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( ClientcommercialsManager.class.getName() );
	
	public static final ClientcommercialsManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ClientcommercialsManager) em.getExtension(ClientcommercialsConstants.EXTENSIONNAME);
	}
	
}
