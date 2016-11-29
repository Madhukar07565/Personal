/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.operation.clientreconfirmationconfig.jalo;

import com.cnk.travelogix.client.core.b2bunit.jalo.TravelogixB2BUnit;
import com.cnk.travelogix.datamodel.operation.reconfirmationconfig.jalo.ReconfirmationConfig;
import com.cnk.travelogix.datamodel.operation.reconfirmationinterval.jalo.ReconfirmationInterval;
import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.operation.clientreconfirmationconfig.jalo.ClientReconfirmationConfig ClientReconfirmationConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientReconfirmationConfig extends GenericItem
{
	/** Qualifier of the <code>ClientReconfirmationConfig.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>ClientReconfirmationConfig.client</code> attribute **/
	public static final String CLIENT = "client";
	/** Qualifier of the <code>ClientReconfirmationConfig.reconfirmationTo</code> attribute **/
	public static final String RECONFIRMATIONTO = "reconfirmationTo";
	/** Qualifier of the <code>ClientReconfirmationConfig.clientReconfirmationInterval</code> attribute **/
	public static final String CLIENTRECONFIRMATIONINTERVAL = "clientReconfirmationInterval";
	/** Qualifier of the <code>ClientReconfirmationConfig.reconfirmationconfig</code> attribute **/
	public static final String RECONFIRMATIONCONFIG = "reconfirmationconfig";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RECONFIRMATIONCONFIG's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedClientReconfirmationConfig> RECONFIRMATIONCONFIGHANDLER = new BidirectionalOneToManyHandler<GeneratedClientReconfirmationConfig>(
	OperationmastercoreConstants.TC.CLIENTRECONFIRMATIONCONFIG,
	false,
	"reconfirmationconfig",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		tmp.put(RECONFIRMATIONTO, AttributeMode.INITIAL);
		tmp.put(CLIENTRECONFIRMATIONINTERVAL, AttributeMode.INITIAL);
		tmp.put(RECONFIRMATIONCONFIG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientReconfirmationConfig.client</code> attribute.
	 * @return the client
	 */
	public TravelogixB2BUnit getClient(final SessionContext ctx)
	{
		return (TravelogixB2BUnit)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientReconfirmationConfig.client</code> attribute.
	 * @return the client
	 */
	public TravelogixB2BUnit getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientReconfirmationConfig.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final TravelogixB2BUnit value)
	{
		setProperty(ctx, CLIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientReconfirmationConfig.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final TravelogixB2BUnit value)
	{
		setClient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientReconfirmationConfig.clientReconfirmationInterval</code> attribute.
	 * @return the clientReconfirmationInterval
	 */
	public ReconfirmationInterval getClientReconfirmationInterval(final SessionContext ctx)
	{
		return (ReconfirmationInterval)getProperty( ctx, CLIENTRECONFIRMATIONINTERVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientReconfirmationConfig.clientReconfirmationInterval</code> attribute.
	 * @return the clientReconfirmationInterval
	 */
	public ReconfirmationInterval getClientReconfirmationInterval()
	{
		return getClientReconfirmationInterval( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientReconfirmationConfig.clientReconfirmationInterval</code> attribute. 
	 * @param value the clientReconfirmationInterval
	 */
	public void setClientReconfirmationInterval(final SessionContext ctx, final ReconfirmationInterval value)
	{
		setProperty(ctx, CLIENTRECONFIRMATIONINTERVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientReconfirmationConfig.clientReconfirmationInterval</code> attribute. 
	 * @param value the clientReconfirmationInterval
	 */
	public void setClientReconfirmationInterval(final ReconfirmationInterval value)
	{
		setClientReconfirmationInterval( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientReconfirmationConfig.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientReconfirmationConfig.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientReconfirmationConfig.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientReconfirmationConfig.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		RECONFIRMATIONCONFIGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientReconfirmationConfig.reconfirmationconfig</code> attribute.
	 * @return the reconfirmationconfig
	 */
	public ReconfirmationConfig getReconfirmationconfig(final SessionContext ctx)
	{
		return (ReconfirmationConfig)getProperty( ctx, RECONFIRMATIONCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientReconfirmationConfig.reconfirmationconfig</code> attribute.
	 * @return the reconfirmationconfig
	 */
	public ReconfirmationConfig getReconfirmationconfig()
	{
		return getReconfirmationconfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientReconfirmationConfig.reconfirmationconfig</code> attribute. 
	 * @param value the reconfirmationconfig
	 */
	public void setReconfirmationconfig(final SessionContext ctx, final ReconfirmationConfig value)
	{
		RECONFIRMATIONCONFIGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientReconfirmationConfig.reconfirmationconfig</code> attribute. 
	 * @param value the reconfirmationconfig
	 */
	public void setReconfirmationconfig(final ReconfirmationConfig value)
	{
		setReconfirmationconfig( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientReconfirmationConfig.reconfirmationTo</code> attribute.
	 * @return the reconfirmationTo
	 */
	public EnumerationValue getReconfirmationTo(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RECONFIRMATIONTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientReconfirmationConfig.reconfirmationTo</code> attribute.
	 * @return the reconfirmationTo
	 */
	public EnumerationValue getReconfirmationTo()
	{
		return getReconfirmationTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientReconfirmationConfig.reconfirmationTo</code> attribute. 
	 * @param value the reconfirmationTo
	 */
	public void setReconfirmationTo(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RECONFIRMATIONTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientReconfirmationConfig.reconfirmationTo</code> attribute. 
	 * @param value the reconfirmationTo
	 */
	public void setReconfirmationTo(final EnumerationValue value)
	{
		setReconfirmationTo( getSession().getSessionContext(), value );
	}
	
}
