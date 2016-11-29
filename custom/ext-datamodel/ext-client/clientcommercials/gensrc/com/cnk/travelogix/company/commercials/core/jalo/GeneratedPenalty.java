/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.client.commercials.core.jalo.PenaltyKickBackFeeCompanyCommercial;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.Penalty Penalty}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPenalty extends GenericItem
{
	/** Qualifier of the <code>Penalty.transactionWise</code> attribute **/
	public static final String TRANSACTIONWISE = "transactionWise";
	/** Qualifier of the <code>Penalty.periodwise</code> attribute **/
	public static final String PERIODWISE = "periodwise";
	/** Qualifier of the <code>Penalty.percentage</code> attribute **/
	public static final String PERCENTAGE = "percentage";
	/** Qualifier of the <code>Penalty.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>Penalty.slabType</code> attribute **/
	public static final String SLABTYPE = "slabType";
	/** Qualifier of the <code>Penalty.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>Penalty.valueFrom</code> attribute **/
	public static final String VALUEFROM = "valueFrom";
	/** Qualifier of the <code>Penalty.valueTo</code> attribute **/
	public static final String VALUETO = "valueTo";
	/** Qualifier of the <code>Penalty.penaltyKickBackFee</code> attribute **/
	public static final String PENALTYKICKBACKFEE = "penaltyKickBackFee";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PENALTYKICKBACKFEE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPenalty> PENALTYKICKBACKFEEHANDLER = new BidirectionalOneToManyHandler<GeneratedPenalty>(
	ClientcommercialsConstants.TC.PENALTY,
	false,
	"penaltyKickBackFee",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TRANSACTIONWISE, AttributeMode.INITIAL);
		tmp.put(PERIODWISE, AttributeMode.INITIAL);
		tmp.put(PERCENTAGE, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(SLABTYPE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(VALUEFROM, AttributeMode.INITIAL);
		tmp.put(VALUETO, AttributeMode.INITIAL);
		tmp.put(PENALTYKICKBACKFEE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.amount</code> attribute.
	 * @return the amount
	 */
	public Boolean isAmount(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.amount</code> attribute.
	 * @return the amount
	 */
	public Boolean isAmount()
	{
		return isAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.amount</code> attribute. 
	 * @return the amount
	 */
	public boolean isAmountAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAmount( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.amount</code> attribute. 
	 * @return the amount
	 */
	public boolean isAmountAsPrimitive()
	{
		return isAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Boolean value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final boolean value)
	{
		setAmount( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final boolean value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PENALTYKICKBACKFEEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.penaltyKickBackFee</code> attribute.
	 * @return the penaltyKickBackFee
	 */
	public PenaltyKickBackFeeCompanyCommercial getPenaltyKickBackFee(final SessionContext ctx)
	{
		return (PenaltyKickBackFeeCompanyCommercial)getProperty( ctx, PENALTYKICKBACKFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.penaltyKickBackFee</code> attribute.
	 * @return the penaltyKickBackFee
	 */
	public PenaltyKickBackFeeCompanyCommercial getPenaltyKickBackFee()
	{
		return getPenaltyKickBackFee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.penaltyKickBackFee</code> attribute. 
	 * @param value the penaltyKickBackFee
	 */
	public void setPenaltyKickBackFee(final SessionContext ctx, final PenaltyKickBackFeeCompanyCommercial value)
	{
		PENALTYKICKBACKFEEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.penaltyKickBackFee</code> attribute. 
	 * @param value the penaltyKickBackFee
	 */
	public void setPenaltyKickBackFee(final PenaltyKickBackFeeCompanyCommercial value)
	{
		setPenaltyKickBackFee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.percentage</code> attribute.
	 * @return the percentage
	 */
	public Boolean isPercentage(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.percentage</code> attribute.
	 * @return the percentage
	 */
	public Boolean isPercentage()
	{
		return isPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.percentage</code> attribute. 
	 * @return the percentage
	 */
	public boolean isPercentageAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPercentage( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.percentage</code> attribute. 
	 * @return the percentage
	 */
	public boolean isPercentageAsPrimitive()
	{
		return isPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final Boolean value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final boolean value)
	{
		setPercentage( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final boolean value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.periodwise</code> attribute.
	 * @return the periodwise
	 */
	public Boolean isPeriodwise(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERIODWISE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.periodwise</code> attribute.
	 * @return the periodwise
	 */
	public Boolean isPeriodwise()
	{
		return isPeriodwise( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.periodwise</code> attribute. 
	 * @return the periodwise
	 */
	public boolean isPeriodwiseAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPeriodwise( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.periodwise</code> attribute. 
	 * @return the periodwise
	 */
	public boolean isPeriodwiseAsPrimitive()
	{
		return isPeriodwiseAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.periodwise</code> attribute. 
	 * @param value the periodwise
	 */
	public void setPeriodwise(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERIODWISE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.periodwise</code> attribute. 
	 * @param value the periodwise
	 */
	public void setPeriodwise(final Boolean value)
	{
		setPeriodwise( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.periodwise</code> attribute. 
	 * @param value the periodwise
	 */
	public void setPeriodwise(final SessionContext ctx, final boolean value)
	{
		setPeriodwise( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.periodwise</code> attribute. 
	 * @param value the periodwise
	 */
	public void setPeriodwise(final boolean value)
	{
		setPeriodwise( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.slabType</code> attribute.
	 * @return the slabType
	 */
	public EnumerationValue getSlabType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SLABTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.slabType</code> attribute.
	 * @return the slabType
	 */
	public EnumerationValue getSlabType()
	{
		return getSlabType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.slabType</code> attribute. 
	 * @param value the slabType
	 */
	public void setSlabType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SLABTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.slabType</code> attribute. 
	 * @param value the slabType
	 */
	public void setSlabType(final EnumerationValue value)
	{
		setSlabType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.transactionWise</code> attribute.
	 * @return the transactionWise
	 */
	public Boolean isTransactionWise(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TRANSACTIONWISE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.transactionWise</code> attribute.
	 * @return the transactionWise
	 */
	public Boolean isTransactionWise()
	{
		return isTransactionWise( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.transactionWise</code> attribute. 
	 * @return the transactionWise
	 */
	public boolean isTransactionWiseAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTransactionWise( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.transactionWise</code> attribute. 
	 * @return the transactionWise
	 */
	public boolean isTransactionWiseAsPrimitive()
	{
		return isTransactionWiseAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.transactionWise</code> attribute. 
	 * @param value the transactionWise
	 */
	public void setTransactionWise(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TRANSACTIONWISE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.transactionWise</code> attribute. 
	 * @param value the transactionWise
	 */
	public void setTransactionWise(final Boolean value)
	{
		setTransactionWise( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.transactionWise</code> attribute. 
	 * @param value the transactionWise
	 */
	public void setTransactionWise(final SessionContext ctx, final boolean value)
	{
		setTransactionWise( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.transactionWise</code> attribute. 
	 * @param value the transactionWise
	 */
	public void setTransactionWise(final boolean value)
	{
		setTransactionWise( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.valueFrom</code> attribute.
	 * @return the valueFrom
	 */
	public BigDecimal getValueFrom(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, VALUEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.valueFrom</code> attribute.
	 * @return the valueFrom
	 */
	public BigDecimal getValueFrom()
	{
		return getValueFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.valueFrom</code> attribute. 
	 * @param value the valueFrom
	 */
	public void setValueFrom(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, VALUEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.valueFrom</code> attribute. 
	 * @param value the valueFrom
	 */
	public void setValueFrom(final BigDecimal value)
	{
		setValueFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.valueTo</code> attribute.
	 * @return the valueTo
	 */
	public BigDecimal getValueTo(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, VALUETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Penalty.valueTo</code> attribute.
	 * @return the valueTo
	 */
	public BigDecimal getValueTo()
	{
		return getValueTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.valueTo</code> attribute. 
	 * @param value the valueTo
	 */
	public void setValueTo(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, VALUETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Penalty.valueTo</code> attribute. 
	 * @param value the valueTo
	 */
	public void setValueTo(final BigDecimal value)
	{
		setValueTo( getSession().getSessionContext(), value );
	}
	
}
