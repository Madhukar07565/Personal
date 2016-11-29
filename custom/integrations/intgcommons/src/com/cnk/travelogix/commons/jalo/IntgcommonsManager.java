package com.cnk.travelogix.commons.jalo;

import com.cnk.travelogix.commons.constants.IntgcommonsConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class IntgcommonsManager extends GeneratedIntgcommonsManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( IntgcommonsManager.class.getName() );
	
	public static final IntgcommonsManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (IntgcommonsManager) em.getExtension(IntgcommonsConstants.EXTENSIONNAME);
	}
	
}
