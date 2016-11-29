package com.cnk.travelogix.product.holiday.master.core.jalo;

import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class HolidayproductmastercoreManager extends GeneratedHolidayproductmastercoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( HolidayproductmastercoreManager.class.getName() );
	
	public static final HolidayproductmastercoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (HolidayproductmastercoreManager) em.getExtension(HolidayproductmastercoreConstants.EXTENSIONNAME);
	}
	
}
