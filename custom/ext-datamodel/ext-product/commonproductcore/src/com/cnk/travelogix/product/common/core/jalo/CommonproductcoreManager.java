package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class CommonproductcoreManager extends GeneratedCommonproductcoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( CommonproductcoreManager.class.getName() );
	
	public static final CommonproductcoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CommonproductcoreManager) em.getExtension(CommonproductcoreConstants.EXTENSIONNAME);
	}
	
}
