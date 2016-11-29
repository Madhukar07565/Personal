package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class TransportproductmasterscoreManager extends GeneratedTransportproductmasterscoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( TransportproductmasterscoreManager.class.getName() );
	
	public static final TransportproductmasterscoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TransportproductmasterscoreManager) em.getExtension(TransportproductmasterscoreConstants.EXTENSIONNAME);
	}
	
}
