package com.cnk.travelogix.holiday.inventory.core.jalo;

import com.cnk.travelogix.holiday.inventory.core.constants.HolidayinventorycoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class HolidayinventorycoreManager extends GeneratedHolidayinventorycoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( HolidayinventorycoreManager.class.getName() );
	
	public static final HolidayinventorycoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (HolidayinventorycoreManager) em.getExtension(HolidayinventorycoreConstants.EXTENSIONNAME);
	}
	
}
