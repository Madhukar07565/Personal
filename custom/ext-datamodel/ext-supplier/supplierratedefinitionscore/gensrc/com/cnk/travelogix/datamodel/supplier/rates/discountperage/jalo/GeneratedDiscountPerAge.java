/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.discountperage.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AgeDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.discountperage.jalo.DiscountPerAge DiscountPerAge}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDiscountPerAge extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>DiscountPerAge.minPaxOrNight</code> attribute **/
	public static final String MINPAXORNIGHT = "minPaxOrNight";
	/** Qualifier of the <code>DiscountPerAge.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>DiscountPerAge.ageDetails</code> attribute **/
	public static final String AGEDETAILS = "ageDetails";
	/** Qualifier of the <code>DiscountPerAge.arrivalDaysOfWeek</code> attribute **/
	public static final String ARRIVALDAYSOFWEEK = "arrivalDaysOfWeek";
	/** Qualifier of the <code>DiscountPerAge.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MINPAXORNIGHT, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(AGEDETAILS, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>DiscountPerAge.ageDetails</code> attribute.
	 * @return the ageDetails
	 */
	public AgeDetail getAgeDetails(final SessionContext ctx)
	{
		return (AgeDetail)getProperty( ctx, AGEDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountPerAge.ageDetails</code> attribute.
	 * @return the ageDetails
	 */
	public AgeDetail getAgeDetails()
	{
		return getAgeDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountPerAge.ageDetails</code> attribute. 
	 * @param value the ageDetails
	 */
	public void setAgeDetails(final SessionContext ctx, final AgeDetail value)
	{
		setProperty(ctx, AGEDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountPerAge.ageDetails</code> attribute. 
	 * @param value the ageDetails
	 */
	public void setAgeDetails(final AgeDetail value)
	{
		setAgeDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountPerAge.arrivalDaysOfWeek</code> attribute.
	 * @return the arrivalDaysOfWeek
	 */
	public EnumerationValue getArrivalDaysOfWeek(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ARRIVALDAYSOFWEEK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountPerAge.arrivalDaysOfWeek</code> attribute.
	 * @return the arrivalDaysOfWeek
	 */
	public EnumerationValue getArrivalDaysOfWeek()
	{
		return getArrivalDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountPerAge.arrivalDaysOfWeek</code> attribute. 
	 * @param value the arrivalDaysOfWeek
	 */
	public void setArrivalDaysOfWeek(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ARRIVALDAYSOFWEEK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountPerAge.arrivalDaysOfWeek</code> attribute. 
	 * @param value the arrivalDaysOfWeek
	 */
	public void setArrivalDaysOfWeek(final EnumerationValue value)
	{
		setArrivalDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountPerAge.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountPerAge.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountPerAge.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountPerAge.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountPerAge.minPaxOrNight</code> attribute.
	 * @return the minPaxOrNight
	 */
	public Integer getMinPaxOrNight(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINPAXORNIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountPerAge.minPaxOrNight</code> attribute.
	 * @return the minPaxOrNight
	 */
	public Integer getMinPaxOrNight()
	{
		return getMinPaxOrNight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountPerAge.minPaxOrNight</code> attribute. 
	 * @return the minPaxOrNight
	 */
	public int getMinPaxOrNightAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinPaxOrNight( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountPerAge.minPaxOrNight</code> attribute. 
	 * @return the minPaxOrNight
	 */
	public int getMinPaxOrNightAsPrimitive()
	{
		return getMinPaxOrNightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountPerAge.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINPAXORNIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountPerAge.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final Integer value)
	{
		setMinPaxOrNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountPerAge.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final SessionContext ctx, final int value)
	{
		setMinPaxOrNight( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountPerAge.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final int value)
	{
		setMinPaxOrNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountPerAge.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountPerAge.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountPerAge.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountPerAge.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
}
