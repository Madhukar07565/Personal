/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.AmountAllocation;
import com.cnk.travelogix.common.core.jalo.PaymentPlan;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem PaymentPlanEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaymentPlanEntry extends GenericItem
{
	/** Qualifier of the <code>PaymentPlanEntry.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>PaymentPlanEntry.dueDate</code> attribute **/
	public static final String DUEDATE = "dueDate";
	/** Qualifier of the <code>PaymentPlanEntry.payAmount</code> attribute **/
	public static final String PAYAMOUNT = "payAmount";
	/** Qualifier of the <code>PaymentPlanEntry.payDate</code> attribute **/
	public static final String PAYDATE = "payDate";
	/** Qualifier of the <code>PaymentPlanEntry.paymentPlan</code> attribute **/
	public static final String PAYMENTPLAN = "paymentPlan";
	/** Qualifier of the <code>PaymentPlanEntry.amountAllocationList</code> attribute **/
	public static final String AMOUNTALLOCATIONLIST = "amountAllocationList";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PAYMENTPLAN's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPaymentPlanEntry> PAYMENTPLANHANDLER = new BidirectionalOneToManyHandler<GeneratedPaymentPlanEntry>(
	CommonCoreConstants.TC.PAYMENTPLANENTRY,
	false,
	"paymentPlan",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n AMOUNTALLOCATIONLIST's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AmountAllocation> AMOUNTALLOCATIONLISTHANDLER = new OneToManyHandler<AmountAllocation>(
	CommonCoreConstants.TC.AMOUNTALLOCATION,
	false,
	"paymentPlanEntry",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(DUEDATE, AttributeMode.INITIAL);
		tmp.put(PAYAMOUNT, AttributeMode.INITIAL);
		tmp.put(PAYDATE, AttributeMode.INITIAL);
		tmp.put(PAYMENTPLAN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive()
	{
		return getAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final double value)
	{
		setAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.amountAllocationList</code> attribute.
	 * @return the amountAllocationList
	 */
	public List<AmountAllocation> getAmountAllocationList(final SessionContext ctx)
	{
		return (List<AmountAllocation>)AMOUNTALLOCATIONLISTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.amountAllocationList</code> attribute.
	 * @return the amountAllocationList
	 */
	public List<AmountAllocation> getAmountAllocationList()
	{
		return getAmountAllocationList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.amountAllocationList</code> attribute. 
	 * @param value the amountAllocationList
	 */
	public void setAmountAllocationList(final SessionContext ctx, final List<AmountAllocation> value)
	{
		AMOUNTALLOCATIONLISTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.amountAllocationList</code> attribute. 
	 * @param value the amountAllocationList
	 */
	public void setAmountAllocationList(final List<AmountAllocation> value)
	{
		setAmountAllocationList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to amountAllocationList. 
	 * @param value the item to add to amountAllocationList
	 */
	public void addToAmountAllocationList(final SessionContext ctx, final AmountAllocation value)
	{
		AMOUNTALLOCATIONLISTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to amountAllocationList. 
	 * @param value the item to add to amountAllocationList
	 */
	public void addToAmountAllocationList(final AmountAllocation value)
	{
		addToAmountAllocationList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from amountAllocationList. 
	 * @param value the item to remove from amountAllocationList
	 */
	public void removeFromAmountAllocationList(final SessionContext ctx, final AmountAllocation value)
	{
		AMOUNTALLOCATIONLISTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from amountAllocationList. 
	 * @param value the item to remove from amountAllocationList
	 */
	public void removeFromAmountAllocationList(final AmountAllocation value)
	{
		removeFromAmountAllocationList( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PAYMENTPLANHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.dueDate</code> attribute.
	 * @return the dueDate
	 */
	public Date getDueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.dueDate</code> attribute.
	 * @return the dueDate
	 */
	public Date getDueDate()
	{
		return getDueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.dueDate</code> attribute. 
	 * @param value the dueDate
	 */
	public void setDueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.dueDate</code> attribute. 
	 * @param value the dueDate
	 */
	public void setDueDate(final Date value)
	{
		setDueDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.payAmount</code> attribute.
	 * @return the payAmount
	 */
	public Double getPayAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PAYAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.payAmount</code> attribute.
	 * @return the payAmount
	 */
	public Double getPayAmount()
	{
		return getPayAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.payAmount</code> attribute. 
	 * @return the payAmount
	 */
	public double getPayAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getPayAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.payAmount</code> attribute. 
	 * @return the payAmount
	 */
	public double getPayAmountAsPrimitive()
	{
		return getPayAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.payAmount</code> attribute. 
	 * @param value the payAmount
	 */
	public void setPayAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PAYAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.payAmount</code> attribute. 
	 * @param value the payAmount
	 */
	public void setPayAmount(final Double value)
	{
		setPayAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.payAmount</code> attribute. 
	 * @param value the payAmount
	 */
	public void setPayAmount(final SessionContext ctx, final double value)
	{
		setPayAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.payAmount</code> attribute. 
	 * @param value the payAmount
	 */
	public void setPayAmount(final double value)
	{
		setPayAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.payDate</code> attribute.
	 * @return the payDate
	 */
	public Date getPayDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PAYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.payDate</code> attribute.
	 * @return the payDate
	 */
	public Date getPayDate()
	{
		return getPayDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.payDate</code> attribute. 
	 * @param value the payDate
	 */
	public void setPayDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PAYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.payDate</code> attribute. 
	 * @param value the payDate
	 */
	public void setPayDate(final Date value)
	{
		setPayDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.paymentPlan</code> attribute.
	 * @return the paymentPlan
	 */
	public PaymentPlan getPaymentPlan(final SessionContext ctx)
	{
		return (PaymentPlan)getProperty( ctx, PAYMENTPLAN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentPlanEntry.paymentPlan</code> attribute.
	 * @return the paymentPlan
	 */
	public PaymentPlan getPaymentPlan()
	{
		return getPaymentPlan( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.paymentPlan</code> attribute. 
	 * @param value the paymentPlan
	 */
	public void setPaymentPlan(final SessionContext ctx, final PaymentPlan value)
	{
		PAYMENTPLANHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentPlanEntry.paymentPlan</code> attribute. 
	 * @param value the paymentPlan
	 */
	public void setPaymentPlan(final PaymentPlan value)
	{
		setPaymentPlan( getSession().getSessionContext(), value );
	}
	
}
