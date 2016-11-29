package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class ActivityproductmasterscoreManager extends GeneratedActivityproductmasterscoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( ActivityproductmasterscoreManager.class.getName() );
	
	public static final ActivityproductmasterscoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ActivityproductmasterscoreManager) em.getExtension(ActivityproductmasterscoreConstants.EXTENSIONNAME);
	}
	
}
