/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.CutOffsAndCharges CutOffsAndCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCutOffsAndCharges extends GenericItem
{
	/** Qualifier of the <code>CutOffsAndCharges.cutOffFromDay</code> attribute **/
	public static final String CUTOFFFROMDAY = "cutOffFromDay";
	/** Qualifier of the <code>CutOffsAndCharges.cutOffToDay</code> attribute **/
	public static final String CUTOFFTODAY = "cutOffToDay";
	/** Qualifier of the <code>CutOffsAndCharges.actualAmount</code> attribute **/
	public static final String ACTUALAMOUNT = "actualAmount";
	/** Qualifier of the <code>CutOffsAndCharges.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>CutOffsAndCharges.percentageAmount</code> attribute **/
	public static final String PERCENTAGEAMOUNT = "percentageAmount";
	/** Qualifier of the <code>CutOffsAndCharges.range</code> attribute **/
	public static final String RANGE = "range";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CUTOFFFROMDAY, AttributeMode.INITIAL);
		tmp.put(CUTOFFTODAY, AttributeMode.INITIAL);
		tmp.put(ACTUALAMOUNT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(PERCENTAGEAMOUNT, AttributeMode.INITIAL);
		tmp.put(RANGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.actualAmount</code> attribute.
	 * @return the actualAmount - Amount.
	 */
	public Double getActualAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, ACTUALAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.actualAmount</code> attribute.
	 * @return the actualAmount - Amount.
	 */
	public Double getActualAmount()
	{
		return getActualAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.actualAmount</code> attribute. 
	 * @return the actualAmount - Amount.
	 */
	public double getActualAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getActualAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.actualAmount</code> attribute. 
	 * @return the actualAmount - Amount.
	 */
	public double getActualAmountAsPrimitive()
	{
		return getActualAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.actualAmount</code> attribute. 
	 * @param value the actualAmount - Amount.
	 */
	public void setActualAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, ACTUALAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.actualAmount</code> attribute. 
	 * @param value the actualAmount - Amount.
	 */
	public void setActualAmount(final Double value)
	{
		setActualAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.actualAmount</code> attribute. 
	 * @param value the actualAmount - Amount.
	 */
	public void setActualAmount(final SessionContext ctx, final double value)
	{
		setActualAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.actualAmount</code> attribute. 
	 * @param value the actualAmount - Amount.
	 */
	public void setActualAmount(final double value)
	{
		setActualAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.currency</code> attribute.
	 * @return the currency - Currency.
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.currency</code> attribute.
	 * @return the currency - Currency.
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.currency</code> attribute. 
	 * @param value the currency - Currency.
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.currency</code> attribute. 
	 * @param value the currency - Currency.
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.cutOffFromDay</code> attribute.
	 * @return the cutOffFromDay - Cut Off From Day
	 */
	public Long getCutOffFromDay(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, CUTOFFFROMDAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.cutOffFromDay</code> attribute.
	 * @return the cutOffFromDay - Cut Off From Day
	 */
	public Long getCutOffFromDay()
	{
		return getCutOffFromDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.cutOffFromDay</code> attribute. 
	 * @return the cutOffFromDay - Cut Off From Day
	 */
	public long getCutOffFromDayAsPrimitive(final SessionContext ctx)
	{
		Long value = getCutOffFromDay( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.cutOffFromDay</code> attribute. 
	 * @return the cutOffFromDay - Cut Off From Day
	 */
	public long getCutOffFromDayAsPrimitive()
	{
		return getCutOffFromDayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.cutOffFromDay</code> attribute. 
	 * @param value the cutOffFromDay - Cut Off From Day
	 */
	public void setCutOffFromDay(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, CUTOFFFROMDAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.cutOffFromDay</code> attribute. 
	 * @param value the cutOffFromDay - Cut Off From Day
	 */
	public void setCutOffFromDay(final Long value)
	{
		setCutOffFromDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.cutOffFromDay</code> attribute. 
	 * @param value the cutOffFromDay - Cut Off From Day
	 */
	public void setCutOffFromDay(final SessionContext ctx, final long value)
	{
		setCutOffFromDay( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.cutOffFromDay</code> attribute. 
	 * @param value the cutOffFromDay - Cut Off From Day
	 */
	public void setCutOffFromDay(final long value)
	{
		setCutOffFromDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.cutOffToDay</code> attribute.
	 * @return the cutOffToDay - Cut Off To Day
	 */
	public Long getCutOffToDay(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, CUTOFFTODAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.cutOffToDay</code> attribute.
	 * @return the cutOffToDay - Cut Off To Day
	 */
	public Long getCutOffToDay()
	{
		return getCutOffToDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.cutOffToDay</code> attribute. 
	 * @return the cutOffToDay - Cut Off To Day
	 */
	public long getCutOffToDayAsPrimitive(final SessionContext ctx)
	{
		Long value = getCutOffToDay( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.cutOffToDay</code> attribute. 
	 * @return the cutOffToDay - Cut Off To Day
	 */
	public long getCutOffToDayAsPrimitive()
	{
		return getCutOffToDayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.cutOffToDay</code> attribute. 
	 * @param value the cutOffToDay - Cut Off To Day
	 */
	public void setCutOffToDay(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, CUTOFFTODAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.cutOffToDay</code> attribute. 
	 * @param value the cutOffToDay - Cut Off To Day
	 */
	public void setCutOffToDay(final Long value)
	{
		setCutOffToDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.cutOffToDay</code> attribute. 
	 * @param value the cutOffToDay - Cut Off To Day
	 */
	public void setCutOffToDay(final SessionContext ctx, final long value)
	{
		setCutOffToDay( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.cutOffToDay</code> attribute. 
	 * @param value the cutOffToDay - Cut Off To Day
	 */
	public void setCutOffToDay(final long value)
	{
		setCutOffToDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.percentageAmount</code> attribute.
	 * @return the percentageAmount - Amount Type.
	 */
	public Double getPercentageAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PERCENTAGEAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.percentageAmount</code> attribute.
	 * @return the percentageAmount - Amount Type.
	 */
	public Double getPercentageAmount()
	{
		return getPercentageAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.percentageAmount</code> attribute. 
	 * @return the percentageAmount - Amount Type.
	 */
	public double getPercentageAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getPercentageAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.percentageAmount</code> attribute. 
	 * @return the percentageAmount - Amount Type.
	 */
	public double getPercentageAmountAsPrimitive()
	{
		return getPercentageAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.percentageAmount</code> attribute. 
	 * @param value the percentageAmount - Amount Type.
	 */
	public void setPercentageAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PERCENTAGEAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.percentageAmount</code> attribute. 
	 * @param value the percentageAmount - Amount Type.
	 */
	public void setPercentageAmount(final Double value)
	{
		setPercentageAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.percentageAmount</code> attribute. 
	 * @param value the percentageAmount - Amount Type.
	 */
	public void setPercentageAmount(final SessionContext ctx, final double value)
	{
		setPercentageAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.percentageAmount</code> attribute. 
	 * @param value the percentageAmount - Amount Type.
	 */
	public void setPercentageAmount(final double value)
	{
		setPercentageAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.range</code> attribute.
	 * @return the range - Range.
	 */
	public EnumerationValue getRange(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffsAndCharges.range</code> attribute.
	 * @return the range - Range.
	 */
	public EnumerationValue getRange()
	{
		return getRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.range</code> attribute. 
	 * @param value the range - Range.
	 */
	public void setRange(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffsAndCharges.range</code> attribute. 
	 * @param value the range - Range.
	 */
	public void setRange(final EnumerationValue value)
	{
		setRange( getSession().getSessionContext(), value );
	}
	
}
