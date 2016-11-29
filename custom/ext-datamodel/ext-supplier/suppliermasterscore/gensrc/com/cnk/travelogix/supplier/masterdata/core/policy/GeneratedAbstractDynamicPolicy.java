/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.masterdata.core.policy;

import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.supplier.masters.core.constants.SuppliermasterscoreConstants;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.masterdata.core.policy.AbstractDynamicPolicy AbstractDynamicPolicy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractDynamicPolicy extends GenericItem
{
	/** Qualifier of the <code>AbstractDynamicPolicy.definedBy</code> attribute **/
	public static final String DEFINEDBY = "definedBy";
	/** Qualifier of the <code>AbstractDynamicPolicy.fromDaysHour</code> attribute **/
	public static final String FROMDAYSHOUR = "fromDaysHour";
	/** Qualifier of the <code>AbstractDynamicPolicy.toDaysHour</code> attribute **/
	public static final String TODAYSHOUR = "toDaysHour";
	/** Qualifier of the <code>AbstractDynamicPolicy.chargesInPercentage</code> attribute **/
	public static final String CHARGESINPERCENTAGE = "chargesInPercentage";
	/** Qualifier of the <code>AbstractDynamicPolicy.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>AbstractDynamicPolicy.chargesAmount</code> attribute **/
	public static final String CHARGESAMOUNT = "chargesAmount";
	/** Qualifier of the <code>AbstractDynamicPolicy.policy</code> attribute **/
	public static final String POLICY = "policy";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n POLICY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAbstractDynamicPolicy> POLICYHANDLER = new BidirectionalOneToManyHandler<GeneratedAbstractDynamicPolicy>(
	SuppliermasterscoreConstants.TC.ABSTRACTDYNAMICPOLICY,
	false,
	"policy",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DEFINEDBY, AttributeMode.INITIAL);
		tmp.put(FROMDAYSHOUR, AttributeMode.INITIAL);
		tmp.put(TODAYSHOUR, AttributeMode.INITIAL);
		tmp.put(CHARGESINPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(CHARGESAMOUNT, AttributeMode.INITIAL);
		tmp.put(POLICY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.chargesAmount</code> attribute.
	 * @return the chargesAmount
	 */
	public Double getChargesAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CHARGESAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.chargesAmount</code> attribute.
	 * @return the chargesAmount
	 */
	public Double getChargesAmount()
	{
		return getChargesAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.chargesAmount</code> attribute. 
	 * @return the chargesAmount
	 */
	public double getChargesAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getChargesAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.chargesAmount</code> attribute. 
	 * @return the chargesAmount
	 */
	public double getChargesAmountAsPrimitive()
	{
		return getChargesAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.chargesAmount</code> attribute. 
	 * @param value the chargesAmount
	 */
	public void setChargesAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CHARGESAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.chargesAmount</code> attribute. 
	 * @param value the chargesAmount
	 */
	public void setChargesAmount(final Double value)
	{
		setChargesAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.chargesAmount</code> attribute. 
	 * @param value the chargesAmount
	 */
	public void setChargesAmount(final SessionContext ctx, final double value)
	{
		setChargesAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.chargesAmount</code> attribute. 
	 * @param value the chargesAmount
	 */
	public void setChargesAmount(final double value)
	{
		setChargesAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.chargesInPercentage</code> attribute.
	 * @return the chargesInPercentage
	 */
	public Double getChargesInPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CHARGESINPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.chargesInPercentage</code> attribute.
	 * @return the chargesInPercentage
	 */
	public Double getChargesInPercentage()
	{
		return getChargesInPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.chargesInPercentage</code> attribute. 
	 * @return the chargesInPercentage
	 */
	public double getChargesInPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getChargesInPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.chargesInPercentage</code> attribute. 
	 * @return the chargesInPercentage
	 */
	public double getChargesInPercentageAsPrimitive()
	{
		return getChargesInPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.chargesInPercentage</code> attribute. 
	 * @param value the chargesInPercentage
	 */
	public void setChargesInPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CHARGESINPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.chargesInPercentage</code> attribute. 
	 * @param value the chargesInPercentage
	 */
	public void setChargesInPercentage(final Double value)
	{
		setChargesInPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.chargesInPercentage</code> attribute. 
	 * @param value the chargesInPercentage
	 */
	public void setChargesInPercentage(final SessionContext ctx, final double value)
	{
		setChargesInPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.chargesInPercentage</code> attribute. 
	 * @param value the chargesInPercentage
	 */
	public void setChargesInPercentage(final double value)
	{
		setChargesInPercentage( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		POLICYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.definedBy</code> attribute.
	 * @return the definedBy
	 */
	public EnumerationValue getDefinedBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DEFINEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.definedBy</code> attribute.
	 * @return the definedBy
	 */
	public EnumerationValue getDefinedBy()
	{
		return getDefinedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.definedBy</code> attribute. 
	 * @param value the definedBy
	 */
	public void setDefinedBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DEFINEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.definedBy</code> attribute. 
	 * @param value the definedBy
	 */
	public void setDefinedBy(final EnumerationValue value)
	{
		setDefinedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.fromDaysHour</code> attribute.
	 * @return the fromDaysHour
	 */
	public Integer getFromDaysHour(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FROMDAYSHOUR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.fromDaysHour</code> attribute.
	 * @return the fromDaysHour
	 */
	public Integer getFromDaysHour()
	{
		return getFromDaysHour( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.fromDaysHour</code> attribute. 
	 * @return the fromDaysHour
	 */
	public int getFromDaysHourAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFromDaysHour( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.fromDaysHour</code> attribute. 
	 * @return the fromDaysHour
	 */
	public int getFromDaysHourAsPrimitive()
	{
		return getFromDaysHourAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.fromDaysHour</code> attribute. 
	 * @param value the fromDaysHour
	 */
	public void setFromDaysHour(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FROMDAYSHOUR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.fromDaysHour</code> attribute. 
	 * @param value the fromDaysHour
	 */
	public void setFromDaysHour(final Integer value)
	{
		setFromDaysHour( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.fromDaysHour</code> attribute. 
	 * @param value the fromDaysHour
	 */
	public void setFromDaysHour(final SessionContext ctx, final int value)
	{
		setFromDaysHour( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.fromDaysHour</code> attribute. 
	 * @param value the fromDaysHour
	 */
	public void setFromDaysHour(final int value)
	{
		setFromDaysHour( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.policy</code> attribute.
	 * @return the policy
	 */
	public TravelogixPolicy getPolicy(final SessionContext ctx)
	{
		return (TravelogixPolicy)getProperty( ctx, POLICY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.policy</code> attribute.
	 * @return the policy
	 */
	public TravelogixPolicy getPolicy()
	{
		return getPolicy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.policy</code> attribute. 
	 * @param value the policy
	 */
	public void setPolicy(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.policy</code> attribute. 
	 * @param value the policy
	 */
	public void setPolicy(final TravelogixPolicy value)
	{
		setPolicy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.toDaysHour</code> attribute.
	 * @return the toDaysHour
	 */
	public Integer getToDaysHour(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TODAYSHOUR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.toDaysHour</code> attribute.
	 * @return the toDaysHour
	 */
	public Integer getToDaysHour()
	{
		return getToDaysHour( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.toDaysHour</code> attribute. 
	 * @return the toDaysHour
	 */
	public int getToDaysHourAsPrimitive(final SessionContext ctx)
	{
		Integer value = getToDaysHour( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDynamicPolicy.toDaysHour</code> attribute. 
	 * @return the toDaysHour
	 */
	public int getToDaysHourAsPrimitive()
	{
		return getToDaysHourAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.toDaysHour</code> attribute. 
	 * @param value the toDaysHour
	 */
	public void setToDaysHour(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TODAYSHOUR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.toDaysHour</code> attribute. 
	 * @param value the toDaysHour
	 */
	public void setToDaysHour(final Integer value)
	{
		setToDaysHour( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.toDaysHour</code> attribute. 
	 * @param value the toDaysHour
	 */
	public void setToDaysHour(final SessionContext ctx, final int value)
	{
		setToDaysHour( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDynamicPolicy.toDaysHour</code> attribute. 
	 * @param value the toDaysHour
	 */
	public void setToDaysHour(final int value)
	{
		setToDaysHour( getSession().getSessionContext(), value );
	}
	
}
