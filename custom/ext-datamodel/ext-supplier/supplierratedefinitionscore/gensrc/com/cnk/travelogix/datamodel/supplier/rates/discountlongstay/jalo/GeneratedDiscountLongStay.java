/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.discountlongstay.jalo;

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
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.discountlongstay.jalo.DiscountLongStay DiscountLongStay}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDiscountLongStay extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>DiscountLongStay.stayDuration</code> attribute **/
	public static final String STAYDURATION = "stayDuration";
	/** Qualifier of the <code>DiscountLongStay.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>DiscountLongStay.discountCalculatedOn</code> attribute **/
	public static final String DISCOUNTCALCULATEDON = "discountCalculatedOn";
	/** Qualifier of the <code>DiscountLongStay.arrivalDaysOfWeek</code> attribute **/
	public static final String ARRIVALDAYSOFWEEK = "arrivalDaysOfWeek";
	/** Qualifier of the <code>DiscountLongStay.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STAYDURATION, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(DISCOUNTCALCULATEDON, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>DiscountLongStay.arrivalDaysOfWeek</code> attribute.
	 * @return the arrivalDaysOfWeek
	 */
	public EnumerationValue getArrivalDaysOfWeek(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ARRIVALDAYSOFWEEK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountLongStay.arrivalDaysOfWeek</code> attribute.
	 * @return the arrivalDaysOfWeek
	 */
	public EnumerationValue getArrivalDaysOfWeek()
	{
		return getArrivalDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountLongStay.arrivalDaysOfWeek</code> attribute. 
	 * @param value the arrivalDaysOfWeek
	 */
	public void setArrivalDaysOfWeek(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ARRIVALDAYSOFWEEK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountLongStay.arrivalDaysOfWeek</code> attribute. 
	 * @param value the arrivalDaysOfWeek
	 */
	public void setArrivalDaysOfWeek(final EnumerationValue value)
	{
		setArrivalDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountLongStay.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountLongStay.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountLongStay.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountLongStay.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountLongStay.discountCalculatedOn</code> attribute.
	 * @return the discountCalculatedOn
	 */
	public EnumerationValue getDiscountCalculatedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DISCOUNTCALCULATEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountLongStay.discountCalculatedOn</code> attribute.
	 * @return the discountCalculatedOn
	 */
	public EnumerationValue getDiscountCalculatedOn()
	{
		return getDiscountCalculatedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountLongStay.discountCalculatedOn</code> attribute. 
	 * @param value the discountCalculatedOn
	 */
	public void setDiscountCalculatedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DISCOUNTCALCULATEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountLongStay.discountCalculatedOn</code> attribute. 
	 * @param value the discountCalculatedOn
	 */
	public void setDiscountCalculatedOn(final EnumerationValue value)
	{
		setDiscountCalculatedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountLongStay.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountLongStay.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountLongStay.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountLongStay.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountLongStay.stayDuration</code> attribute.
	 * @return the stayDuration
	 */
	public Integer getStayDuration(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, STAYDURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountLongStay.stayDuration</code> attribute.
	 * @return the stayDuration
	 */
	public Integer getStayDuration()
	{
		return getStayDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountLongStay.stayDuration</code> attribute. 
	 * @return the stayDuration
	 */
	public int getStayDurationAsPrimitive(final SessionContext ctx)
	{
		Integer value = getStayDuration( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountLongStay.stayDuration</code> attribute. 
	 * @return the stayDuration
	 */
	public int getStayDurationAsPrimitive()
	{
		return getStayDurationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountLongStay.stayDuration</code> attribute. 
	 * @param value the stayDuration
	 */
	public void setStayDuration(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, STAYDURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountLongStay.stayDuration</code> attribute. 
	 * @param value the stayDuration
	 */
	public void setStayDuration(final Integer value)
	{
		setStayDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountLongStay.stayDuration</code> attribute. 
	 * @param value the stayDuration
	 */
	public void setStayDuration(final SessionContext ctx, final int value)
	{
		setStayDuration( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountLongStay.stayDuration</code> attribute. 
	 * @param value the stayDuration
	 */
	public void setStayDuration(final int value)
	{
		setStayDuration( getSession().getSessionContext(), value );
	}
	
}
