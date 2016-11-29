/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.discountonfreenight.jalo;

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
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.discountonfreenight.jalo.DiscountOnFreeNight DiscountOnFreeNight}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDiscountOnFreeNight extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>DiscountOnFreeNight.noOfFreeNight</code> attribute **/
	public static final String NOOFFREENIGHT = "noOfFreeNight";
	/** Qualifier of the <code>DiscountOnFreeNight.freeNightCalculatedOn</code> attribute **/
	public static final String FREENIGHTCALCULATEDON = "freeNightCalculatedOn";
	/** Qualifier of the <code>DiscountOnFreeNight.mealPlansForFreeNight</code> attribute **/
	public static final String MEALPLANSFORFREENIGHT = "mealPlansForFreeNight";
	/** Qualifier of the <code>DiscountOnFreeNight.noOfNights</code> attribute **/
	public static final String NOOFNIGHTS = "noOfNights";
	/** Qualifier of the <code>DiscountOnFreeNight.arrivalDaysOfWeek</code> attribute **/
	public static final String ARRIVALDAYSOFWEEK = "arrivalDaysOfWeek";
	/** Qualifier of the <code>DiscountOnFreeNight.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	/** Qualifier of the <code>DiscountOnFreeNight.appliedOnAll</code> attribute **/
	public static final String APPLIEDONALL = "appliedOnAll";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NOOFFREENIGHT, AttributeMode.INITIAL);
		tmp.put(FREENIGHTCALCULATEDON, AttributeMode.INITIAL);
		tmp.put(MEALPLANSFORFREENIGHT, AttributeMode.INITIAL);
		tmp.put(NOOFNIGHTS, AttributeMode.INITIAL);
		tmp.put(ARRIVALDAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(DAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(APPLIEDONALL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.appliedOnAll</code> attribute.
	 * @return the appliedOnAll
	 */
	public Boolean isAppliedOnAll(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, APPLIEDONALL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.appliedOnAll</code> attribute.
	 * @return the appliedOnAll
	 */
	public Boolean isAppliedOnAll()
	{
		return isAppliedOnAll( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.appliedOnAll</code> attribute. 
	 * @return the appliedOnAll
	 */
	public boolean isAppliedOnAllAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAppliedOnAll( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.appliedOnAll</code> attribute. 
	 * @return the appliedOnAll
	 */
	public boolean isAppliedOnAllAsPrimitive()
	{
		return isAppliedOnAllAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, APPLIEDONALL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final Boolean value)
	{
		setAppliedOnAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final SessionContext ctx, final boolean value)
	{
		setAppliedOnAll( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final boolean value)
	{
		setAppliedOnAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.arrivalDaysOfWeek</code> attribute.
	 * @return the arrivalDaysOfWeek
	 */
	public EnumerationValue getArrivalDaysOfWeek(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ARRIVALDAYSOFWEEK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.arrivalDaysOfWeek</code> attribute.
	 * @return the arrivalDaysOfWeek
	 */
	public EnumerationValue getArrivalDaysOfWeek()
	{
		return getArrivalDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.arrivalDaysOfWeek</code> attribute. 
	 * @param value the arrivalDaysOfWeek
	 */
	public void setArrivalDaysOfWeek(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ARRIVALDAYSOFWEEK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.arrivalDaysOfWeek</code> attribute. 
	 * @param value the arrivalDaysOfWeek
	 */
	public void setArrivalDaysOfWeek(final EnumerationValue value)
	{
		setArrivalDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.freeNightCalculatedOn</code> attribute.
	 * @return the freeNightCalculatedOn
	 */
	public EnumerationValue getFreeNightCalculatedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FREENIGHTCALCULATEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.freeNightCalculatedOn</code> attribute.
	 * @return the freeNightCalculatedOn
	 */
	public EnumerationValue getFreeNightCalculatedOn()
	{
		return getFreeNightCalculatedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.freeNightCalculatedOn</code> attribute. 
	 * @param value the freeNightCalculatedOn
	 */
	public void setFreeNightCalculatedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FREENIGHTCALCULATEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.freeNightCalculatedOn</code> attribute. 
	 * @param value the freeNightCalculatedOn
	 */
	public void setFreeNightCalculatedOn(final EnumerationValue value)
	{
		setFreeNightCalculatedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.mealPlansForFreeNight</code> attribute.
	 * @return the mealPlansForFreeNight
	 */
	public EnumerationValue getMealPlansForFreeNight(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MEALPLANSFORFREENIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.mealPlansForFreeNight</code> attribute.
	 * @return the mealPlansForFreeNight
	 */
	public EnumerationValue getMealPlansForFreeNight()
	{
		return getMealPlansForFreeNight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.mealPlansForFreeNight</code> attribute. 
	 * @param value the mealPlansForFreeNight
	 */
	public void setMealPlansForFreeNight(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MEALPLANSFORFREENIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.mealPlansForFreeNight</code> attribute. 
	 * @param value the mealPlansForFreeNight
	 */
	public void setMealPlansForFreeNight(final EnumerationValue value)
	{
		setMealPlansForFreeNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.noOfFreeNight</code> attribute.
	 * @return the noOfFreeNight
	 */
	public Integer getNoOfFreeNight(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFFREENIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.noOfFreeNight</code> attribute.
	 * @return the noOfFreeNight
	 */
	public Integer getNoOfFreeNight()
	{
		return getNoOfFreeNight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.noOfFreeNight</code> attribute. 
	 * @return the noOfFreeNight
	 */
	public int getNoOfFreeNightAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfFreeNight( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.noOfFreeNight</code> attribute. 
	 * @return the noOfFreeNight
	 */
	public int getNoOfFreeNightAsPrimitive()
	{
		return getNoOfFreeNightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.noOfFreeNight</code> attribute. 
	 * @param value the noOfFreeNight
	 */
	public void setNoOfFreeNight(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFFREENIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.noOfFreeNight</code> attribute. 
	 * @param value the noOfFreeNight
	 */
	public void setNoOfFreeNight(final Integer value)
	{
		setNoOfFreeNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.noOfFreeNight</code> attribute. 
	 * @param value the noOfFreeNight
	 */
	public void setNoOfFreeNight(final SessionContext ctx, final int value)
	{
		setNoOfFreeNight( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.noOfFreeNight</code> attribute. 
	 * @param value the noOfFreeNight
	 */
	public void setNoOfFreeNight(final int value)
	{
		setNoOfFreeNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.noOfNights</code> attribute.
	 * @return the noOfNights
	 */
	public Integer getNoOfNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.noOfNights</code> attribute.
	 * @return the noOfNights
	 */
	public Integer getNoOfNights()
	{
		return getNoOfNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.noOfNights</code> attribute. 
	 * @return the noOfNights
	 */
	public int getNoOfNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnFreeNight.noOfNights</code> attribute. 
	 * @return the noOfNights
	 */
	public int getNoOfNightsAsPrimitive()
	{
		return getNoOfNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.noOfNights</code> attribute. 
	 * @param value the noOfNights
	 */
	public void setNoOfNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.noOfNights</code> attribute. 
	 * @param value the noOfNights
	 */
	public void setNoOfNights(final Integer value)
	{
		setNoOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.noOfNights</code> attribute. 
	 * @param value the noOfNights
	 */
	public void setNoOfNights(final SessionContext ctx, final int value)
	{
		setNoOfNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnFreeNight.noOfNights</code> attribute. 
	 * @param value the noOfNights
	 */
	public void setNoOfNights(final int value)
	{
		setNoOfNights( getSession().getSessionContext(), value );
	}
	
}
