package com.cnk.travelogix.supplier.settlementterms.core.jalo;

import com.cnk.travelogix.supplier.settlementterms.core.constants.SuppliersettlementtermscoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SuppliersettlementtermscoreManager extends GeneratedSuppliersettlementtermscoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( SuppliersettlementtermscoreManager.class.getName() );
	
	public static final SuppliersettlementtermscoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SuppliersettlementtermscoreManager) em.getExtension(SuppliersettlementtermscoreConstants.EXTENSIONNAME);
	}
	
}
