/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AbstractProductDocument;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.TransportationExceptFlightAndCruiseProductDocument TransportationExceptFlightAndCruiseProductDocument}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransportationExceptFlightAndCruiseProductDocument extends AbstractProductDocument
{
	/** Qualifier of the <code>TransportationExceptFlightAndCruiseProductDocument.transferType</code> attribute **/
	public static final String TRANSFERTYPE = "transferType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractProductDocument.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TRANSFERTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationExceptFlightAndCruiseProductDocument.transferType</code> attribute.
	 * @return the transferType - Transportation Except Flight And Cruise Product Transfer Type
	 */
	public EnumerationValue getTransferType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TRANSFERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationExceptFlightAndCruiseProductDocument.transferType</code> attribute.
	 * @return the transferType - Transportation Except Flight And Cruise Product Transfer Type
	 */
	public EnumerationValue getTransferType()
	{
		return getTransferType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationExceptFlightAndCruiseProductDocument.transferType</code> attribute. 
	 * @param value the transferType - Transportation Except Flight And Cruise Product Transfer Type
	 */
	public void setTransferType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TRANSFERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationExceptFlightAndCruiseProductDocument.transferType</code> attribute. 
	 * @param value the transferType - Transportation Except Flight And Cruise Product Transfer Type
	 */
	public void setTransferType(final EnumerationValue value)
	{
		setTransferType( getSession().getSessionContext(), value );
	}
	
}
