/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.jalo.AcquirerInfo;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.jalo.ClientPaymentOption ClientPaymentOption}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientPaymentOption extends GenericItem
{
	/** Qualifier of the <code>ClientPaymentOption.paymentId</code> attribute **/
	public static final String PAYMENTID = "paymentId";
	/** Qualifier of the <code>ClientPaymentOption.paymentMode</code> attribute **/
	public static final String PAYMENTMODE = "paymentMode";
	/** Qualifier of the <code>ClientPaymentOption.client</code> attribute **/
	public static final String CLIENT = "client";
	/** Qualifier of the <code>ClientPaymentOption.acquirers</code> attribute **/
	public static final String ACQUIRERS = "acquirers";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedClientPaymentOption> CLIENTHANDLER = new BidirectionalOneToManyHandler<GeneratedClientPaymentOption>(
	ClientcoreConstants.TC.CLIENTPAYMENTOPTION,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ACQUIRERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AcquirerInfo> ACQUIRERSHANDLER = new OneToManyHandler<AcquirerInfo>(
	ClientcoreConstants.TC.ACQUIRERINFO,
	false,
	"paymentOptions",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PAYMENTID, AttributeMode.INITIAL);
		tmp.put(PAYMENTMODE, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaymentOption.acquirers</code> attribute.
	 * @return the acquirers
	 */
	public Collection<AcquirerInfo> getAcquirers(final SessionContext ctx)
	{
		return ACQUIRERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaymentOption.acquirers</code> attribute.
	 * @return the acquirers
	 */
	public Collection<AcquirerInfo> getAcquirers()
	{
		return getAcquirers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaymentOption.acquirers</code> attribute. 
	 * @param value the acquirers
	 */
	public void setAcquirers(final SessionContext ctx, final Collection<AcquirerInfo> value)
	{
		ACQUIRERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaymentOption.acquirers</code> attribute. 
	 * @param value the acquirers
	 */
	public void setAcquirers(final Collection<AcquirerInfo> value)
	{
		setAcquirers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to acquirers. 
	 * @param value the item to add to acquirers
	 */
	public void addToAcquirers(final SessionContext ctx, final AcquirerInfo value)
	{
		ACQUIRERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to acquirers. 
	 * @param value the item to add to acquirers
	 */
	public void addToAcquirers(final AcquirerInfo value)
	{
		addToAcquirers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from acquirers. 
	 * @param value the item to remove from acquirers
	 */
	public void removeFromAcquirers(final SessionContext ctx, final AcquirerInfo value)
	{
		ACQUIRERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from acquirers. 
	 * @param value the item to remove from acquirers
	 */
	public void removeFromAcquirers(final AcquirerInfo value)
	{
		removeFromAcquirers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaymentOption.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaymentOption.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaymentOption.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final Principal value)
	{
		CLIENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaymentOption.client</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>ClientPaymentOption.paymentId</code> attribute.
	 * @return the paymentId - Payment Option ID
	 */
	public String getPaymentId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaymentOption.paymentId</code> attribute.
	 * @return the paymentId - Payment Option ID
	 */
	public String getPaymentId()
	{
		return getPaymentId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaymentOption.paymentId</code> attribute. 
	 * @param value the paymentId - Payment Option ID
	 */
	public void setPaymentId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaymentOption.paymentId</code> attribute. 
	 * @param value the paymentId - Payment Option ID
	 */
	public void setPaymentId(final String value)
	{
		setPaymentId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaymentOption.paymentMode</code> attribute.
	 * @return the paymentMode - Payment Mode
	 */
	public EnumerationValue getPaymentMode(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaymentOption.paymentMode</code> attribute.
	 * @return the paymentMode - Payment Mode
	 */
	public EnumerationValue getPaymentMode()
	{
		return getPaymentMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaymentOption.paymentMode</code> attribute. 
	 * @param value the paymentMode - Payment Mode
	 */
	public void setPaymentMode(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaymentOption.paymentMode</code> attribute. 
	 * @param value the paymentMode - Payment Mode
	 */
	public void setPaymentMode(final EnumerationValue value)
	{
		setPaymentMode( getSession().getSessionContext(), value );
	}
	
}
