/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.PaymentPlanEntry;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.payment.jalo.PaymentTransaction;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem AmountAllocation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAmountAllocation extends GenericItem
{
	/** Qualifier of the <code>AmountAllocation.paymentPlanEntry</code> attribute **/
	public static final String PAYMENTPLANENTRY = "paymentPlanEntry";
	/** Qualifier of the <code>AmountAllocation.paymentTransaction</code> attribute **/
	public static final String PAYMENTTRANSACTION = "paymentTransaction";
	/** Qualifier of the <code>AmountAllocation.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PAYMENTPLANENTRY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAmountAllocation> PAYMENTPLANENTRYHANDLER = new BidirectionalOneToManyHandler<GeneratedAmountAllocation>(
	CommonCoreConstants.TC.AMOUNTALLOCATION,
	false,
	"paymentPlanEntry",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PAYMENTTRANSACTION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAmountAllocation> PAYMENTTRANSACTIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAmountAllocation>(
	CommonCoreConstants.TC.AMOUNTALLOCATION,
	false,
	"paymentTransaction",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PAYMENTPLANENTRY, AttributeMode.INITIAL);
		tmp.put(PAYMENTTRANSACTION, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AmountAllocation.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AmountAllocation.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AmountAllocation.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AmountAllocation.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive()
	{
		return getAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AmountAllocation.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AmountAllocation.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AmountAllocation.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final double value)
	{
		setAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AmountAllocation.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PAYMENTPLANENTRYHANDLER.newInstance(ctx, allAttributes);
		PAYMENTTRANSACTIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AmountAllocation.paymentPlanEntry</code> attribute.
	 * @return the paymentPlanEntry
	 */
	public PaymentPlanEntry getPaymentPlanEntry(final SessionContext ctx)
	{
		return (PaymentPlanEntry)getProperty( ctx, PAYMENTPLANENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AmountAllocation.paymentPlanEntry</code> attribute.
	 * @return the paymentPlanEntry
	 */
	public PaymentPlanEntry getPaymentPlanEntry()
	{
		return getPaymentPlanEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AmountAllocation.paymentPlanEntry</code> attribute. 
	 * @param value the paymentPlanEntry
	 */
	public void setPaymentPlanEntry(final SessionContext ctx, final PaymentPlanEntry value)
	{
		PAYMENTPLANENTRYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AmountAllocation.paymentPlanEntry</code> attribute. 
	 * @param value the paymentPlanEntry
	 */
	public void setPaymentPlanEntry(final PaymentPlanEntry value)
	{
		setPaymentPlanEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AmountAllocation.paymentTransaction</code> attribute.
	 * @return the paymentTransaction
	 */
	public PaymentTransaction getPaymentTransaction(final SessionContext ctx)
	{
		return (PaymentTransaction)getProperty( ctx, PAYMENTTRANSACTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AmountAllocation.paymentTransaction</code> attribute.
	 * @return the paymentTransaction
	 */
	public PaymentTransaction getPaymentTransaction()
	{
		return getPaymentTransaction( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AmountAllocation.paymentTransaction</code> attribute. 
	 * @param value the paymentTransaction
	 */
	public void setPaymentTransaction(final SessionContext ctx, final PaymentTransaction value)
	{
		PAYMENTTRANSACTIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AmountAllocation.paymentTransaction</code> attribute. 
	 * @param value the paymentTransaction
	 */
	public void setPaymentTransaction(final PaymentTransaction value)
	{
		setPaymentTransaction( getSession().getSessionContext(), value );
	}
	
}
