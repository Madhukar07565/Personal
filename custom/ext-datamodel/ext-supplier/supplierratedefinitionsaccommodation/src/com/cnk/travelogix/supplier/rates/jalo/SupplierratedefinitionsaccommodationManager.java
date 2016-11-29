package com.cnk.travelogix.supplier.rates.jalo;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsaccommodationConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SupplierratedefinitionsaccommodationManager extends GeneratedSupplierratedefinitionsaccommodationManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( SupplierratedefinitionsaccommodationManager.class.getName() );
	
	public static final SupplierratedefinitionsaccommodationManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SupplierratedefinitionsaccommodationManager) em.getExtension(SupplierratedefinitionsaccommodationConstants.EXTENSIONNAME);
	}
	
}
