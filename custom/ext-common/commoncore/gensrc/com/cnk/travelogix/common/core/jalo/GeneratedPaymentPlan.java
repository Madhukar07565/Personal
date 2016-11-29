/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.PaymentPlanEntry;
import com.cnk.travelogix.common.core.jalo.PriceInfo;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem PaymentPlan}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaymentPlan extends GenericItem
{
	/** Qualifier of the <code>PaymentPlan.shared</code> attribute **/
	public static final String SHARED = "shared";
	/** Qualifier of the <code>PaymentPlan.price</code> attribute **/
	public static final String PRICE = "price";
	/** Qualifier of the <code>PaymentPlan.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>PaymentPlan.paymentStatus</code> attribute **/
	public static final String PAYMENTSTATUS = "paymentStatus";
	/** Qualifier of the <code>PaymentPlan.paymentPlanEntryList</code> attribute **/
	public static final String PAYMENTPLANENTRYLIST = "paymentPlanEntryList";
	/**
	* {@link OneToManyHandler} for handling 1:n PAYMENTPLANENTRYLIST's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PaymentPlanEntry> PAYMENTPLANENTRYLISTHANDLER = new OneToManyHandler<PaymentPlanEntry>(
	CommonCoreConstants.TC.PAYMENTPLANENTRY,
	false,
	"paymentPlan",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SHARED, AttributeMode.INITIAL);
		tmp.put(PRICE, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(PAYMENTSTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlan.paymentPlanEntryList</code> attribute.
	 * @return the paymentPlanEntryList
	 */
	public List<PaymentPlanEntry> getPaymentPlanEntryList(final SessionContext ctx)
	{
		return (List<PaymentPlanEntry>)PAYMENTPLANENTRYLISTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlan.paymentPlanEntryList</code> attribute.
	 * @return the paymentPlanEntryList
	 */
	public List<PaymentPlanEntry> getPaymentPlanEntryList()
	{
		return getPaymentPlanEntryList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlan.paymentPlanEntryList</code> attribute. 
	 * @param value the paymentPlanEntryList
	 */
	public void setPaymentPlanEntryList(final SessionContext ctx, final List<PaymentPlanEntry> value)
	{
		PAYMENTPLANENTRYLISTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlan.paymentPlanEntryList</code> attribute. 
	 * @param value the paymentPlanEntryList
	 */
	public void setPaymentPlanEntryList(final List<PaymentPlanEntry> value)
	{
		setPaymentPlanEntryList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentPlanEntryList. 
	 * @param value the item to add to paymentPlanEntryList
	 */
	public void addToPaymentPlanEntryList(final SessionContext ctx, final PaymentPlanEntry value)
	{
		PAYMENTPLANENTRYLISTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentPlanEntryList. 
	 * @param value the item to add to paymentPlanEntryList
	 */
	public void addToPaymentPlanEntryList(final PaymentPlanEntry value)
	{
		addToPaymentPlanEntryList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentPlanEntryList. 
	 * @param value the item to remove from paymentPlanEntryList
	 */
	public void removeFromPaymentPlanEntryList(final SessionContext ctx, final PaymentPlanEntry value)
	{
		PAYMENTPLANENTRYLISTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentPlanEntryList. 
	 * @param value the item to remove from paymentPlanEntryList
	 */
	public void removeFromPaymentPlanEntryList(final PaymentPlanEntry value)
	{
		removeFromPaymentPlanEntryList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlan.paymentStatus</code> attribute.
	 * @return the paymentStatus
	 */
	public EnumerationValue getPaymentStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlan.paymentStatus</code> attribute.
	 * @return the paymentStatus
	 */
	public EnumerationValue getPaymentStatus()
	{
		return getPaymentStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlan.paymentStatus</code> attribute. 
	 * @param value the paymentStatus
	 */
	public void setPaymentStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlan.paymentStatus</code> attribute. 
	 * @param value the paymentStatus
	 */
	public void setPaymentStatus(final EnumerationValue value)
	{
		setPaymentStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlan.price</code> attribute.
	 * @return the price
	 */
	public PriceInfo getPrice(final SessionContext ctx)
	{
		return (PriceInfo)getProperty( ctx, PRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlan.price</code> attribute.
	 * @return the price
	 */
	public PriceInfo getPrice()
	{
		return getPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlan.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final SessionContext ctx, final PriceInfo value)
	{
		setProperty(ctx, PRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlan.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final PriceInfo value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlan.shared</code> attribute.
	 * @return the shared
	 */
	public Boolean isShared(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SHARED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlan.shared</code> attribute.
	 * @return the shared
	 */
	public Boolean isShared()
	{
		return isShared( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlan.shared</code> attribute. 
	 * @return the shared
	 */
	public boolean isSharedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isShared( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlan.shared</code> attribute. 
	 * @return the shared
	 */
	public boolean isSharedAsPrimitive()
	{
		return isSharedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlan.shared</code> attribute. 
	 * @param value the shared
	 */
	public void setShared(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SHARED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlan.shared</code> attribute. 
	 * @param value the shared
	 */
	public void setShared(final Boolean value)
	{
		setShared( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlan.shared</code> attribute. 
	 * @param value the shared
	 */
	public void setShared(final SessionContext ctx, final boolean value)
	{
		setShared( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlan.shared</code> attribute. 
	 * @param value the shared
	 */
	public void setShared(final boolean value)
	{
		setShared( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlan.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlan.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlan.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlan.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final EnumerationValue value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
}
