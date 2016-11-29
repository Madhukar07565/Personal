/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AbstractAirCompanySpecificInventory;
import de.hybris.platform.b2b.jalo.B2BUserGroup;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.security.Principal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.AirClientInventoryDistribution AirClientInventoryDistribution}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirClientInventoryDistribution extends AbstractAirCompanySpecificInventory
{
	/** Qualifier of the <code>AirClientInventoryDistribution.clientType</code> attribute **/
	public static final String CLIENTTYPE = "clientType";
	/** Qualifier of the <code>AirClientInventoryDistribution.clientName</code> attribute **/
	public static final String CLIENTNAME = "clientName";
	/** Qualifier of the <code>AirClientInventoryDistribution.clientGroup</code> attribute **/
	public static final String CLIENTGROUP = "clientGroup";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAirCompanySpecificInventory.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CLIENTTYPE, AttributeMode.INITIAL);
		tmp.put(CLIENTNAME, AttributeMode.INITIAL);
		tmp.put(CLIENTGROUP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirClientInventoryDistribution.clientGroup</code> attribute.
	 * @return the clientGroup - Client group
	 */
	public B2BUserGroup getClientGroup(final SessionContext ctx)
	{
		return (B2BUserGroup)getProperty( ctx, CLIENTGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirClientInventoryDistribution.clientGroup</code> attribute.
	 * @return the clientGroup - Client group
	 */
	public B2BUserGroup getClientGroup()
	{
		return getClientGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirClientInventoryDistribution.clientGroup</code> attribute. 
	 * @param value the clientGroup - Client group
	 */
	public void setClientGroup(final SessionContext ctx, final B2BUserGroup value)
	{
		setProperty(ctx, CLIENTGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirClientInventoryDistribution.clientGroup</code> attribute. 
	 * @param value the clientGroup - Client group
	 */
	public void setClientGroup(final B2BUserGroup value)
	{
		setClientGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirClientInventoryDistribution.clientName</code> attribute.
	 * @return the clientName - Client name
	 */
	public Principal getClientName(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, CLIENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirClientInventoryDistribution.clientName</code> attribute.
	 * @return the clientName - Client name
	 */
	public Principal getClientName()
	{
		return getClientName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirClientInventoryDistribution.clientName</code> attribute. 
	 * @param value the clientName - Client name
	 */
	public void setClientName(final SessionContext ctx, final Principal value)
	{
		setProperty(ctx, CLIENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirClientInventoryDistribution.clientName</code> attribute. 
	 * @param value the clientName - Client name
	 */
	public void setClientName(final Principal value)
	{
		setClientName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirClientInventoryDistribution.clientType</code> attribute.
	 * @return the clientType - Client type
	 */
	public EnumerationValue getClientType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirClientInventoryDistribution.clientType</code> attribute.
	 * @return the clientType - Client type
	 */
	public EnumerationValue getClientType()
	{
		return getClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirClientInventoryDistribution.clientType</code> attribute. 
	 * @param value the clientType - Client type
	 */
	public void setClientType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirClientInventoryDistribution.clientType</code> attribute. 
	 * @param value the clientType - Client type
	 */
	public void setClientType(final EnumerationValue value)
	{
		setClientType( getSession().getSessionContext(), value );
	}
	
}
