package com.cnk.travelogix.supplier.rates.jalo;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SupplierratedefinitionscoreManager extends GeneratedSupplierratedefinitionscoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( SupplierratedefinitionscoreManager.class.getName() );
	
	public static final SupplierratedefinitionscoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SupplierratedefinitionscoreManager) em.getExtension(SupplierratedefinitionscoreConstants.EXTENSIONNAME);
	}
	
}
