package com.cnk.travelogix.presales.core.jalo;

import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class PresalescoreManager extends GeneratedPresalescoreManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( PresalescoreManager.class.getName() );
	
	public static final PresalescoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (PresalescoreManager) em.getExtension(PresalescoreConstants.EXTENSIONNAME);
	}
	
}
