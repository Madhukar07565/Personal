package com.cnk.travelogix.jalo;

import com.cnk.travelogix.constants.PaymentgatewaysConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class PaymentgatewaysManager extends GeneratedPaymentgatewaysManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( PaymentgatewaysManager.class.getName() );
	
	public static final PaymentgatewaysManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (PaymentgatewaysManager) em.getExtension(PaymentgatewaysConstants.EXTENSIONNAME);
	}
	
}
