/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.jalo.PassiveBookingDetail PassiveBookingDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPassiveBookingDetail extends GenericItem
{
	/** Qualifier of the <code>PassiveBookingDetail.passiveBookingEnabled</code> attribute **/
	public static final String PASSIVEBOOKINGENABLED = "passiveBookingEnabled";
	/** Qualifier of the <code>PassiveBookingDetail.gdsQueueNumber</code> attribute **/
	public static final String GDSQUEUENUMBER = "gdsQueueNumber";
	/** Qualifier of the <code>PassiveBookingDetail.retentionLine</code> attribute **/
	public static final String RETENTIONLINE = "retentionLine";
	/** Qualifier of the <code>PassiveBookingDetail.client</code> attribute **/
	public static final String CLIENT = "client";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPassiveBookingDetail> CLIENTHANDLER = new BidirectionalOneToManyHandler<GeneratedPassiveBookingDetail>(
	ClientcoreConstants.TC.PASSIVEBOOKINGDETAIL,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PASSIVEBOOKINGENABLED, AttributeMode.INITIAL);
		tmp.put(GDSQUEUENUMBER, AttributeMode.INITIAL);
		tmp.put(RETENTIONLINE, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassiveBookingDetail.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassiveBookingDetail.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassiveBookingDetail.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final Principal value)
	{
		CLIENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassiveBookingDetail.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final Principal value)
	{
		setClient( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CLIENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassiveBookingDetail.gdsQueueNumber</code> attribute.
	 * @return the gdsQueueNumber
	 */
	public String getGdsQueueNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GDSQUEUENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassiveBookingDetail.gdsQueueNumber</code> attribute.
	 * @return the gdsQueueNumber
	 */
	public String getGdsQueueNumber()
	{
		return getGdsQueueNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassiveBookingDetail.gdsQueueNumber</code> attribute. 
	 * @param value the gdsQueueNumber
	 */
	public void setGdsQueueNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GDSQUEUENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassiveBookingDetail.gdsQueueNumber</code> attribute. 
	 * @param value the gdsQueueNumber
	 */
	public void setGdsQueueNumber(final String value)
	{
		setGdsQueueNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassiveBookingDetail.passiveBookingEnabled</code> attribute.
	 * @return the passiveBookingEnabled
	 */
	public Boolean isPassiveBookingEnabled(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PASSIVEBOOKINGENABLED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassiveBookingDetail.passiveBookingEnabled</code> attribute.
	 * @return the passiveBookingEnabled
	 */
	public Boolean isPassiveBookingEnabled()
	{
		return isPassiveBookingEnabled( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassiveBookingDetail.passiveBookingEnabled</code> attribute. 
	 * @return the passiveBookingEnabled
	 */
	public boolean isPassiveBookingEnabledAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPassiveBookingEnabled( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassiveBookingDetail.passiveBookingEnabled</code> attribute. 
	 * @return the passiveBookingEnabled
	 */
	public boolean isPassiveBookingEnabledAsPrimitive()
	{
		return isPassiveBookingEnabledAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassiveBookingDetail.passiveBookingEnabled</code> attribute. 
	 * @param value the passiveBookingEnabled
	 */
	public void setPassiveBookingEnabled(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PASSIVEBOOKINGENABLED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassiveBookingDetail.passiveBookingEnabled</code> attribute. 
	 * @param value the passiveBookingEnabled
	 */
	public void setPassiveBookingEnabled(final Boolean value)
	{
		setPassiveBookingEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassiveBookingDetail.passiveBookingEnabled</code> attribute. 
	 * @param value the passiveBookingEnabled
	 */
	public void setPassiveBookingEnabled(final SessionContext ctx, final boolean value)
	{
		setPassiveBookingEnabled( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassiveBookingDetail.passiveBookingEnabled</code> attribute. 
	 * @param value the passiveBookingEnabled
	 */
	public void setPassiveBookingEnabled(final boolean value)
	{
		setPassiveBookingEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassiveBookingDetail.retentionLine</code> attribute.
	 * @return the retentionLine
	 */
	public Date getRetentionLine(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RETENTIONLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassiveBookingDetail.retentionLine</code> attribute.
	 * @return the retentionLine
	 */
	public Date getRetentionLine()
	{
		return getRetentionLine( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassiveBookingDetail.retentionLine</code> attribute. 
	 * @param value the retentionLine
	 */
	public void setRetentionLine(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RETENTIONLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassiveBookingDetail.retentionLine</code> attribute. 
	 * @param value the retentionLine
	 */
	public void setRetentionLine(final Date value)
	{
		setRetentionLine( getSession().getSessionContext(), value );
	}
	
}
