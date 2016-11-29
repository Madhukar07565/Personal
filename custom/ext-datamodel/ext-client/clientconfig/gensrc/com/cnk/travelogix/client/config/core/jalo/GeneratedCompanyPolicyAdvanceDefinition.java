/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AbstractProductDocument;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.CompanyPolicyAdvanceDefinition CompanyPolicyAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanyPolicyAdvanceDefinition extends AbstractProductDocument
{
	/** Qualifier of the <code>CompanyPolicyAdvanceDefinition.booking</code> attribute **/
	public static final String BOOKING = "booking";
	/** Qualifier of the <code>CompanyPolicyAdvanceDefinition.travel</code> attribute **/
	public static final String TRAVEL = "travel";
	/** Qualifier of the <code>CompanyPolicyAdvanceDefinition.bookingwithTravel</code> attribute **/
	public static final String BOOKINGWITHTRAVEL = "bookingwithTravel";
	/** Qualifier of the <code>CompanyPolicyAdvanceDefinition.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractProductDocument.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BOOKING, AttributeMode.INITIAL);
		tmp.put(TRAVEL, AttributeMode.INITIAL);
		tmp.put(BOOKINGWITHTRAVEL, AttributeMode.INITIAL);
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyAdvanceDefinition.booking</code> attribute.
	 * @return the booking - Company Policy Advance Booking
	 */
	public Boolean isBooking(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BOOKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyAdvanceDefinition.booking</code> attribute.
	 * @return the booking - Company Policy Advance Booking
	 */
	public Boolean isBooking()
	{
		return isBooking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyAdvanceDefinition.booking</code> attribute. 
	 * @return the booking - Company Policy Advance Booking
	 */
	public boolean isBookingAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBooking( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyAdvanceDefinition.booking</code> attribute. 
	 * @return the booking - Company Policy Advance Booking
	 */
	public boolean isBookingAsPrimitive()
	{
		return isBookingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyAdvanceDefinition.booking</code> attribute. 
	 * @param value the booking - Company Policy Advance Booking
	 */
	public void setBooking(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BOOKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyAdvanceDefinition.booking</code> attribute. 
	 * @param value the booking - Company Policy Advance Booking
	 */
	public void setBooking(final Boolean value)
	{
		setBooking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyAdvanceDefinition.booking</code> attribute. 
	 * @param value the booking - Company Policy Advance Booking
	 */
	public void setBooking(final SessionContext ctx, final boolean value)
	{
		setBooking( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyAdvanceDefinition.booking</code> attribute. 
	 * @param value the booking - Company Policy Advance Booking
	 */
	public void setBooking(final boolean value)
	{
		setBooking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyAdvanceDefinition.bookingwithTravel</code> attribute.
	 * @return the bookingwithTravel - Company Policy Advance Booking with Travel
	 */
	public Boolean isBookingwithTravel(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BOOKINGWITHTRAVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyAdvanceDefinition.bookingwithTravel</code> attribute.
	 * @return the bookingwithTravel - Company Policy Advance Booking with Travel
	 */
	public Boolean isBookingwithTravel()
	{
		return isBookingwithTravel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyAdvanceDefinition.bookingwithTravel</code> attribute. 
	 * @return the bookingwithTravel - Company Policy Advance Booking with Travel
	 */
	public boolean isBookingwithTravelAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBookingwithTravel( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyAdvanceDefinition.bookingwithTravel</code> attribute. 
	 * @return the bookingwithTravel - Company Policy Advance Booking with Travel
	 */
	public boolean isBookingwithTravelAsPrimitive()
	{
		return isBookingwithTravelAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyAdvanceDefinition.bookingwithTravel</code> attribute. 
	 * @param value the bookingwithTravel - Company Policy Advance Booking with Travel
	 */
	public void setBookingwithTravel(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BOOKINGWITHTRAVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyAdvanceDefinition.bookingwithTravel</code> attribute. 
	 * @param value the bookingwithTravel - Company Policy Advance Booking with Travel
	 */
	public void setBookingwithTravel(final Boolean value)
	{
		setBookingwithTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyAdvanceDefinition.bookingwithTravel</code> attribute. 
	 * @param value the bookingwithTravel - Company Policy Advance Booking with Travel
	 */
	public void setBookingwithTravel(final SessionContext ctx, final boolean value)
	{
		setBookingwithTravel( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyAdvanceDefinition.bookingwithTravel</code> attribute. 
	 * @param value the bookingwithTravel - Company Policy Advance Booking with Travel
	 */
	public void setBookingwithTravel(final boolean value)
	{
		setBookingwithTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyAdvanceDefinition.nationality</code> attribute.
	 * @return the nationality - Company Policy Advance nationality
	 */
	public Country getNationality(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, NATIONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyAdvanceDefinition.nationality</code> attribute.
	 * @return the nationality - Company Policy Advance nationality
	 */
	public Country getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyAdvanceDefinition.nationality</code> attribute. 
	 * @param value the nationality - Company Policy Advance nationality
	 */
	public void setNationality(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, NATIONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyAdvanceDefinition.nationality</code> attribute. 
	 * @param value the nationality - Company Policy Advance nationality
	 */
	public void setNationality(final Country value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyAdvanceDefinition.travel</code> attribute.
	 * @return the travel - Company Policy Advance Travel
	 */
	public Boolean isTravel(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TRAVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyAdvanceDefinition.travel</code> attribute.
	 * @return the travel - Company Policy Advance Travel
	 */
	public Boolean isTravel()
	{
		return isTravel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyAdvanceDefinition.travel</code> attribute. 
	 * @return the travel - Company Policy Advance Travel
	 */
	public boolean isTravelAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTravel( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyAdvanceDefinition.travel</code> attribute. 
	 * @return the travel - Company Policy Advance Travel
	 */
	public boolean isTravelAsPrimitive()
	{
		return isTravelAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyAdvanceDefinition.travel</code> attribute. 
	 * @param value the travel - Company Policy Advance Travel
	 */
	public void setTravel(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TRAVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyAdvanceDefinition.travel</code> attribute. 
	 * @param value the travel - Company Policy Advance Travel
	 */
	public void setTravel(final Boolean value)
	{
		setTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyAdvanceDefinition.travel</code> attribute. 
	 * @param value the travel - Company Policy Advance Travel
	 */
	public void setTravel(final SessionContext ctx, final boolean value)
	{
		setTravel( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyAdvanceDefinition.travel</code> attribute. 
	 * @param value the travel - Company Policy Advance Travel
	 */
	public void setTravel(final boolean value)
	{
		setTravel( getSession().getSessionContext(), value );
	}
	
}
