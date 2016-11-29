/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.discountonnight.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.discountonnight.jalo.DiscountOnNight DiscountOnNight}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDiscountOnNight extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>DiscountOnNight.noOfDiscountedNights</code> attribute **/
	public static final String NOOFDISCOUNTEDNIGHTS = "noOfDiscountedNights";
	/** Qualifier of the <code>DiscountOnNight.mealPlanForDiscountedNights</code> attribute **/
	public static final String MEALPLANFORDISCOUNTEDNIGHTS = "mealPlanForDiscountedNights";
	/** Qualifier of the <code>DiscountOnNight.minimumNights</code> attribute **/
	public static final String MINIMUMNIGHTS = "minimumNights";
	/** Qualifier of the <code>DiscountOnNight.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>DiscountOnNight.discountCalculatedOn</code> attribute **/
	public static final String DISCOUNTCALCULATEDON = "discountCalculatedOn";
	/** Qualifier of the <code>DiscountOnNight.appliedOnAll</code> attribute **/
	public static final String APPLIEDONALL = "appliedOnAll";
	/** Qualifier of the <code>DiscountOnNight.arrivalDaysOfWeek</code> attribute **/
	public static final String ARRIVALDAYSOFWEEK = "arrivalDaysOfWeek";
	/** Qualifier of the <code>DiscountOnNight.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NOOFDISCOUNTEDNIGHTS, AttributeMode.INITIAL);
		tmp.put(MEALPLANFORDISCOUNTEDNIGHTS, AttributeMode.INITIAL);
		tmp.put(MINIMUMNIGHTS, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(DISCOUNTCALCULATEDON, AttributeMode.INITIAL);
		tmp.put(APPLIEDONALL, AttributeMode.INITIAL);
		tmp.put(ARRIVALDAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(DAYSOFWEEK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.appliedOnAll</code> attribute.
	 * @return the appliedOnAll
	 */
	public Boolean isAppliedOnAll(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, APPLIEDONALL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.appliedOnAll</code> attribute.
	 * @return the appliedOnAll
	 */
	public Boolean isAppliedOnAll()
	{
		return isAppliedOnAll( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.appliedOnAll</code> attribute. 
	 * @return the appliedOnAll
	 */
	public boolean isAppliedOnAllAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAppliedOnAll( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.appliedOnAll</code> attribute. 
	 * @return the appliedOnAll
	 */
	public boolean isAppliedOnAllAsPrimitive()
	{
		return isAppliedOnAllAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, APPLIEDONALL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final Boolean value)
	{
		setAppliedOnAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final SessionContext ctx, final boolean value)
	{
		setAppliedOnAll( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final boolean value)
	{
		setAppliedOnAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.arrivalDaysOfWeek</code> attribute.
	 * @return the arrivalDaysOfWeek
	 */
	public EnumerationValue getArrivalDaysOfWeek(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ARRIVALDAYSOFWEEK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.arrivalDaysOfWeek</code> attribute.
	 * @return the arrivalDaysOfWeek
	 */
	public EnumerationValue getArrivalDaysOfWeek()
	{
		return getArrivalDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.arrivalDaysOfWeek</code> attribute. 
	 * @param value the arrivalDaysOfWeek
	 */
	public void setArrivalDaysOfWeek(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ARRIVALDAYSOFWEEK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.arrivalDaysOfWeek</code> attribute. 
	 * @param value the arrivalDaysOfWeek
	 */
	public void setArrivalDaysOfWeek(final EnumerationValue value)
	{
		setArrivalDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.discountCalculatedOn</code> attribute.
	 * @return the discountCalculatedOn
	 */
	public EnumerationValue getDiscountCalculatedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DISCOUNTCALCULATEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.discountCalculatedOn</code> attribute.
	 * @return the discountCalculatedOn
	 */
	public EnumerationValue getDiscountCalculatedOn()
	{
		return getDiscountCalculatedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.discountCalculatedOn</code> attribute. 
	 * @param value the discountCalculatedOn
	 */
	public void setDiscountCalculatedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DISCOUNTCALCULATEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.discountCalculatedOn</code> attribute. 
	 * @param value the discountCalculatedOn
	 */
	public void setDiscountCalculatedOn(final EnumerationValue value)
	{
		setDiscountCalculatedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.mealPlanForDiscountedNights</code> attribute.
	 * @return the mealPlanForDiscountedNights
	 */
	public EnumerationValue getMealPlanForDiscountedNights(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MEALPLANFORDISCOUNTEDNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.mealPlanForDiscountedNights</code> attribute.
	 * @return the mealPlanForDiscountedNights
	 */
	public EnumerationValue getMealPlanForDiscountedNights()
	{
		return getMealPlanForDiscountedNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.mealPlanForDiscountedNights</code> attribute. 
	 * @param value the mealPlanForDiscountedNights
	 */
	public void setMealPlanForDiscountedNights(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MEALPLANFORDISCOUNTEDNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.mealPlanForDiscountedNights</code> attribute. 
	 * @param value the mealPlanForDiscountedNights
	 */
	public void setMealPlanForDiscountedNights(final EnumerationValue value)
	{
		setMealPlanForDiscountedNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.minimumNights</code> attribute.
	 * @return the minimumNights
	 */
	public Integer getMinimumNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINIMUMNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.minimumNights</code> attribute.
	 * @return the minimumNights
	 */
	public Integer getMinimumNights()
	{
		return getMinimumNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.minimumNights</code> attribute. 
	 * @return the minimumNights
	 */
	public int getMinimumNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinimumNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.minimumNights</code> attribute. 
	 * @return the minimumNights
	 */
	public int getMinimumNightsAsPrimitive()
	{
		return getMinimumNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.minimumNights</code> attribute. 
	 * @param value the minimumNights
	 */
	public void setMinimumNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINIMUMNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.minimumNights</code> attribute. 
	 * @param value the minimumNights
	 */
	public void setMinimumNights(final Integer value)
	{
		setMinimumNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.minimumNights</code> attribute. 
	 * @param value the minimumNights
	 */
	public void setMinimumNights(final SessionContext ctx, final int value)
	{
		setMinimumNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.minimumNights</code> attribute. 
	 * @param value the minimumNights
	 */
	public void setMinimumNights(final int value)
	{
		setMinimumNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.noOfDiscountedNights</code> attribute.
	 * @return the noOfDiscountedNights
	 */
	public Integer getNoOfDiscountedNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFDISCOUNTEDNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.noOfDiscountedNights</code> attribute.
	 * @return the noOfDiscountedNights
	 */
	public Integer getNoOfDiscountedNights()
	{
		return getNoOfDiscountedNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.noOfDiscountedNights</code> attribute. 
	 * @return the noOfDiscountedNights
	 */
	public int getNoOfDiscountedNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfDiscountedNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.noOfDiscountedNights</code> attribute. 
	 * @return the noOfDiscountedNights
	 */
	public int getNoOfDiscountedNightsAsPrimitive()
	{
		return getNoOfDiscountedNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.noOfDiscountedNights</code> attribute. 
	 * @param value the noOfDiscountedNights
	 */
	public void setNoOfDiscountedNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFDISCOUNTEDNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.noOfDiscountedNights</code> attribute. 
	 * @param value the noOfDiscountedNights
	 */
	public void setNoOfDiscountedNights(final Integer value)
	{
		setNoOfDiscountedNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.noOfDiscountedNights</code> attribute. 
	 * @param value the noOfDiscountedNights
	 */
	public void setNoOfDiscountedNights(final SessionContext ctx, final int value)
	{
		setNoOfDiscountedNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.noOfDiscountedNights</code> attribute. 
	 * @param value the noOfDiscountedNights
	 */
	public void setNoOfDiscountedNights(final int value)
	{
		setNoOfDiscountedNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnNight.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnNight.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
}
