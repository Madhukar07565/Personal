/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.communication.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.communication.jalo.cms2.pages.CommunicationTemplate;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.communication.jalo.CommunicationProcess CommunicationProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommunicationProcess extends BusinessProcess
{
	/** Qualifier of the <code>CommunicationProcess.communication</code> attribute **/
	public static final String COMMUNICATION = "communication";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BusinessProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMMUNICATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationProcess.communication</code> attribute.
	 * @return the communication
	 */
	public CommunicationTemplate getCommunication(final SessionContext ctx)
	{
		return (CommunicationTemplate)getProperty( ctx, COMMUNICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationProcess.communication</code> attribute.
	 * @return the communication
	 */
	public CommunicationTemplate getCommunication()
	{
		return getCommunication( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationProcess.communication</code> attribute. 
	 * @param value the communication
	 */
	public void setCommunication(final SessionContext ctx, final CommunicationTemplate value)
	{
		setProperty(ctx, COMMUNICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationProcess.communication</code> attribute. 
	 * @param value the communication
	 */
	public void setCommunication(final CommunicationTemplate value)
	{
		setCommunication( getSession().getSessionContext(), value );
	}
	
}
