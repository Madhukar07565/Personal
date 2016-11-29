/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.discountonpax.jalo;

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
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.discountonpax.jalo.DiscountOnPax DiscountOnPax}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDiscountOnPax extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>DiscountOnPax.minPaxOrNight</code> attribute **/
	public static final String MINPAXORNIGHT = "minPaxOrNight";
	/** Qualifier of the <code>DiscountOnPax.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>DiscountOnPax.paxBookedCount</code> attribute **/
	public static final String PAXBOOKEDCOUNT = "paxBookedCount";
	/** Qualifier of the <code>DiscountOnPax.discountedPaxCount</code> attribute **/
	public static final String DISCOUNTEDPAXCOUNT = "discountedPaxCount";
	/** Qualifier of the <code>DiscountOnPax.appliedOnAll</code> attribute **/
	public static final String APPLIEDONALL = "appliedOnAll";
	/** Qualifier of the <code>DiscountOnPax.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	/** Qualifier of the <code>DiscountOnPax.arrivalDaysOfWeek</code> attribute **/
	public static final String ARRIVALDAYSOFWEEK = "arrivalDaysOfWeek";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MINPAXORNIGHT, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(PAXBOOKEDCOUNT, AttributeMode.INITIAL);
		tmp.put(DISCOUNTEDPAXCOUNT, AttributeMode.INITIAL);
		tmp.put(APPLIEDONALL, AttributeMode.INITIAL);
		tmp.put(DAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(ARRIVALDAYSOFWEEK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.appliedOnAll</code> attribute.
	 * @return the appliedOnAll
	 */
	public Boolean isAppliedOnAll(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, APPLIEDONALL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.appliedOnAll</code> attribute.
	 * @return the appliedOnAll
	 */
	public Boolean isAppliedOnAll()
	{
		return isAppliedOnAll( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.appliedOnAll</code> attribute. 
	 * @return the appliedOnAll
	 */
	public boolean isAppliedOnAllAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAppliedOnAll( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.appliedOnAll</code> attribute. 
	 * @return the appliedOnAll
	 */
	public boolean isAppliedOnAllAsPrimitive()
	{
		return isAppliedOnAllAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, APPLIEDONALL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final Boolean value)
	{
		setAppliedOnAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final SessionContext ctx, final boolean value)
	{
		setAppliedOnAll( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final boolean value)
	{
		setAppliedOnAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.arrivalDaysOfWeek</code> attribute.
	 * @return the arrivalDaysOfWeek
	 */
	public EnumerationValue getArrivalDaysOfWeek(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ARRIVALDAYSOFWEEK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.arrivalDaysOfWeek</code> attribute.
	 * @return the arrivalDaysOfWeek
	 */
	public EnumerationValue getArrivalDaysOfWeek()
	{
		return getArrivalDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.arrivalDaysOfWeek</code> attribute. 
	 * @param value the arrivalDaysOfWeek
	 */
	public void setArrivalDaysOfWeek(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ARRIVALDAYSOFWEEK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.arrivalDaysOfWeek</code> attribute. 
	 * @param value the arrivalDaysOfWeek
	 */
	public void setArrivalDaysOfWeek(final EnumerationValue value)
	{
		setArrivalDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.discountedPaxCount</code> attribute.
	 * @return the discountedPaxCount
	 */
	public Integer getDiscountedPaxCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DISCOUNTEDPAXCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.discountedPaxCount</code> attribute.
	 * @return the discountedPaxCount
	 */
	public Integer getDiscountedPaxCount()
	{
		return getDiscountedPaxCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.discountedPaxCount</code> attribute. 
	 * @return the discountedPaxCount
	 */
	public int getDiscountedPaxCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDiscountedPaxCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.discountedPaxCount</code> attribute. 
	 * @return the discountedPaxCount
	 */
	public int getDiscountedPaxCountAsPrimitive()
	{
		return getDiscountedPaxCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.discountedPaxCount</code> attribute. 
	 * @param value the discountedPaxCount
	 */
	public void setDiscountedPaxCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DISCOUNTEDPAXCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.discountedPaxCount</code> attribute. 
	 * @param value the discountedPaxCount
	 */
	public void setDiscountedPaxCount(final Integer value)
	{
		setDiscountedPaxCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.discountedPaxCount</code> attribute. 
	 * @param value the discountedPaxCount
	 */
	public void setDiscountedPaxCount(final SessionContext ctx, final int value)
	{
		setDiscountedPaxCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.discountedPaxCount</code> attribute. 
	 * @param value the discountedPaxCount
	 */
	public void setDiscountedPaxCount(final int value)
	{
		setDiscountedPaxCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.minPaxOrNight</code> attribute.
	 * @return the minPaxOrNight
	 */
	public Integer getMinPaxOrNight(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINPAXORNIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.minPaxOrNight</code> attribute.
	 * @return the minPaxOrNight
	 */
	public Integer getMinPaxOrNight()
	{
		return getMinPaxOrNight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.minPaxOrNight</code> attribute. 
	 * @return the minPaxOrNight
	 */
	public int getMinPaxOrNightAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinPaxOrNight( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.minPaxOrNight</code> attribute. 
	 * @return the minPaxOrNight
	 */
	public int getMinPaxOrNightAsPrimitive()
	{
		return getMinPaxOrNightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINPAXORNIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final Integer value)
	{
		setMinPaxOrNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final SessionContext ctx, final int value)
	{
		setMinPaxOrNight( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final int value)
	{
		setMinPaxOrNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.paxBookedCount</code> attribute.
	 * @return the paxBookedCount
	 */
	public Integer getPaxBookedCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PAXBOOKEDCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.paxBookedCount</code> attribute.
	 * @return the paxBookedCount
	 */
	public Integer getPaxBookedCount()
	{
		return getPaxBookedCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.paxBookedCount</code> attribute. 
	 * @return the paxBookedCount
	 */
	public int getPaxBookedCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPaxBookedCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnPax.paxBookedCount</code> attribute. 
	 * @return the paxBookedCount
	 */
	public int getPaxBookedCountAsPrimitive()
	{
		return getPaxBookedCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.paxBookedCount</code> attribute. 
	 * @param value the paxBookedCount
	 */
	public void setPaxBookedCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PAXBOOKEDCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.paxBookedCount</code> attribute. 
	 * @param value the paxBookedCount
	 */
	public void setPaxBookedCount(final Integer value)
	{
		setPaxBookedCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.paxBookedCount</code> attribute. 
	 * @param value the paxBookedCount
	 */
	public void setPaxBookedCount(final SessionContext ctx, final int value)
	{
		setPaxBookedCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnPax.paxBookedCount</code> attribute. 
	 * @param value the paxBookedCount
	 */
	public void setPaxBookedCount(final int value)
	{
		setPaxBookedCount( getSession().getSessionContext(), value );
	}
	
}
