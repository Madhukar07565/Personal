package com.cnk.travelogix.product.accommodation.masters.core.jalo;

import com.cnk.travelogix.product.accommodation.masters.core.constants.AccoproductmasterscoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class AccoproductmasterscoreManager extends GeneratedAccoproductmasterscoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( AccoproductmasterscoreManager.class.getName() );
	
	public static final AccoproductmasterscoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AccoproductmasterscoreManager) em.getExtension(AccoproductmasterscoreConstants.EXTENSIONNAME);
	}
	
}
