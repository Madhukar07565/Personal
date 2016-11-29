/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.discountonroomorcabin.jalo;

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
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.discountonroomorcabin.jalo.DiscountOnRoomOrCabin DiscountOnRoomOrCabin}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDiscountOnRoomOrCabin extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>DiscountOnRoomOrCabin.noOfNights</code> attribute **/
	public static final String NOOFNIGHTS = "noOfNights";
	/** Qualifier of the <code>DiscountOnRoomOrCabin.bookedRoomsCount</code> attribute **/
	public static final String BOOKEDROOMSCOUNT = "bookedRoomsCount";
	/** Qualifier of the <code>DiscountOnRoomOrCabin.discountedRoomsCount</code> attribute **/
	public static final String DISCOUNTEDROOMSCOUNT = "discountedRoomsCount";
	/** Qualifier of the <code>DiscountOnRoomOrCabin.appliedOnAll</code> attribute **/
	public static final String APPLIEDONALL = "appliedOnAll";
	/** Qualifier of the <code>DiscountOnRoomOrCabin.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	/** Qualifier of the <code>DiscountOnRoomOrCabin.arrivalDaysOfWeek</code> attribute **/
	public static final String ARRIVALDAYSOFWEEK = "arrivalDaysOfWeek";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NOOFNIGHTS, AttributeMode.INITIAL);
		tmp.put(BOOKEDROOMSCOUNT, AttributeMode.INITIAL);
		tmp.put(DISCOUNTEDROOMSCOUNT, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.appliedOnAll</code> attribute.
	 * @return the appliedOnAll
	 */
	public Boolean isAppliedOnAll(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, APPLIEDONALL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.appliedOnAll</code> attribute.
	 * @return the appliedOnAll
	 */
	public Boolean isAppliedOnAll()
	{
		return isAppliedOnAll( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.appliedOnAll</code> attribute. 
	 * @return the appliedOnAll
	 */
	public boolean isAppliedOnAllAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAppliedOnAll( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.appliedOnAll</code> attribute. 
	 * @return the appliedOnAll
	 */
	public boolean isAppliedOnAllAsPrimitive()
	{
		return isAppliedOnAllAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, APPLIEDONALL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final Boolean value)
	{
		setAppliedOnAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final SessionContext ctx, final boolean value)
	{
		setAppliedOnAll( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.appliedOnAll</code> attribute. 
	 * @param value the appliedOnAll
	 */
	public void setAppliedOnAll(final boolean value)
	{
		setAppliedOnAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.arrivalDaysOfWeek</code> attribute.
	 * @return the arrivalDaysOfWeek
	 */
	public EnumerationValue getArrivalDaysOfWeek(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ARRIVALDAYSOFWEEK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.arrivalDaysOfWeek</code> attribute.
	 * @return the arrivalDaysOfWeek
	 */
	public EnumerationValue getArrivalDaysOfWeek()
	{
		return getArrivalDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.arrivalDaysOfWeek</code> attribute. 
	 * @param value the arrivalDaysOfWeek
	 */
	public void setArrivalDaysOfWeek(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ARRIVALDAYSOFWEEK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.arrivalDaysOfWeek</code> attribute. 
	 * @param value the arrivalDaysOfWeek
	 */
	public void setArrivalDaysOfWeek(final EnumerationValue value)
	{
		setArrivalDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.bookedRoomsCount</code> attribute.
	 * @return the bookedRoomsCount
	 */
	public Integer getBookedRoomsCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BOOKEDROOMSCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.bookedRoomsCount</code> attribute.
	 * @return the bookedRoomsCount
	 */
	public Integer getBookedRoomsCount()
	{
		return getBookedRoomsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.bookedRoomsCount</code> attribute. 
	 * @return the bookedRoomsCount
	 */
	public int getBookedRoomsCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBookedRoomsCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.bookedRoomsCount</code> attribute. 
	 * @return the bookedRoomsCount
	 */
	public int getBookedRoomsCountAsPrimitive()
	{
		return getBookedRoomsCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.bookedRoomsCount</code> attribute. 
	 * @param value the bookedRoomsCount
	 */
	public void setBookedRoomsCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BOOKEDROOMSCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.bookedRoomsCount</code> attribute. 
	 * @param value the bookedRoomsCount
	 */
	public void setBookedRoomsCount(final Integer value)
	{
		setBookedRoomsCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.bookedRoomsCount</code> attribute. 
	 * @param value the bookedRoomsCount
	 */
	public void setBookedRoomsCount(final SessionContext ctx, final int value)
	{
		setBookedRoomsCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.bookedRoomsCount</code> attribute. 
	 * @param value the bookedRoomsCount
	 */
	public void setBookedRoomsCount(final int value)
	{
		setBookedRoomsCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.discountedRoomsCount</code> attribute.
	 * @return the discountedRoomsCount
	 */
	public Integer getDiscountedRoomsCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DISCOUNTEDROOMSCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.discountedRoomsCount</code> attribute.
	 * @return the discountedRoomsCount
	 */
	public Integer getDiscountedRoomsCount()
	{
		return getDiscountedRoomsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.discountedRoomsCount</code> attribute. 
	 * @return the discountedRoomsCount
	 */
	public int getDiscountedRoomsCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDiscountedRoomsCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.discountedRoomsCount</code> attribute. 
	 * @return the discountedRoomsCount
	 */
	public int getDiscountedRoomsCountAsPrimitive()
	{
		return getDiscountedRoomsCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.discountedRoomsCount</code> attribute. 
	 * @param value the discountedRoomsCount
	 */
	public void setDiscountedRoomsCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DISCOUNTEDROOMSCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.discountedRoomsCount</code> attribute. 
	 * @param value the discountedRoomsCount
	 */
	public void setDiscountedRoomsCount(final Integer value)
	{
		setDiscountedRoomsCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.discountedRoomsCount</code> attribute. 
	 * @param value the discountedRoomsCount
	 */
	public void setDiscountedRoomsCount(final SessionContext ctx, final int value)
	{
		setDiscountedRoomsCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.discountedRoomsCount</code> attribute. 
	 * @param value the discountedRoomsCount
	 */
	public void setDiscountedRoomsCount(final int value)
	{
		setDiscountedRoomsCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.noOfNights</code> attribute.
	 * @return the noOfNights
	 */
	public Integer getNoOfNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.noOfNights</code> attribute.
	 * @return the noOfNights
	 */
	public Integer getNoOfNights()
	{
		return getNoOfNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.noOfNights</code> attribute. 
	 * @return the noOfNights
	 */
	public int getNoOfNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountOnRoomOrCabin.noOfNights</code> attribute. 
	 * @return the noOfNights
	 */
	public int getNoOfNightsAsPrimitive()
	{
		return getNoOfNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.noOfNights</code> attribute. 
	 * @param value the noOfNights
	 */
	public void setNoOfNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.noOfNights</code> attribute. 
	 * @param value the noOfNights
	 */
	public void setNoOfNights(final Integer value)
	{
		setNoOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.noOfNights</code> attribute. 
	 * @param value the noOfNights
	 */
	public void setNoOfNights(final SessionContext ctx, final int value)
	{
		setNoOfNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountOnRoomOrCabin.noOfNights</code> attribute. 
	 * @param value the noOfNights
	 */
	public void setNoOfNights(final int value)
	{
		setNoOfNights( getSession().getSessionContext(), value );
	}
	
}
