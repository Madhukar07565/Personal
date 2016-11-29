package com.cnk.travelogix.masterdata.core.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class MasterdatacoreManager extends GeneratedMasterdatacoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( MasterdatacoreManager.class.getName() );
	
	public static final MasterdatacoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MasterdatacoreManager) em.getExtension(MasterdatacoreConstants.EXTENSIONNAME);
	}
	
}
