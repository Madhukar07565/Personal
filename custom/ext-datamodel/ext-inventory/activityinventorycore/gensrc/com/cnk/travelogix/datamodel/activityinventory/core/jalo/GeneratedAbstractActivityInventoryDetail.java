/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.activityinventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import com.cnk.travelogix.common.inventory.jalo.AbstractInventoryDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.activityinventory.core.jalo.AbstractActivityInventoryDetail AbstractActivityInventoryDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractActivityInventoryDetail extends AbstractInventoryDetail
{
	/** Qualifier of the <code>AbstractActivityInventoryDetail.timeOfDay</code> attribute **/
	public static final String TIMEOFDAY = "timeOfDay";
	/** Qualifier of the <code>AbstractActivityInventoryDetail.time</code> attribute **/
	public static final String TIME = "time";
	/** Qualifier of the <code>AbstractActivityInventoryDetail.auditoriumName</code> attribute **/
	public static final String AUDITORIUMNAME = "auditoriumName";
	/** Qualifier of the <code>AbstractActivityInventoryDetail.seatingClass</code> attribute **/
	public static final String SEATINGCLASS = "seatingClass";
	/** Qualifier of the <code>AbstractActivityInventoryDetail.remark</code> attribute **/
	public static final String REMARK = "remark";
	/** Qualifier of the <code>AbstractActivityInventoryDetail.ticket</code> attribute **/
	public static final String TICKET = "ticket";
	/** Qualifier of the <code>AbstractActivityInventoryDetail.seats</code> attribute **/
	public static final String SEATS = "seats";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TIMEOFDAY, AttributeMode.INITIAL);
		tmp.put(TIME, AttributeMode.INITIAL);
		tmp.put(AUDITORIUMNAME, AttributeMode.INITIAL);
		tmp.put(SEATINGCLASS, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		tmp.put(TICKET, AttributeMode.INITIAL);
		tmp.put(SEATS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.auditoriumName</code> attribute.
	 * @return the auditoriumName - Auditorium Name
	 */
	public String getAuditoriumName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractActivityInventoryDetail.getAuditoriumName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, AUDITORIUMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.auditoriumName</code> attribute.
	 * @return the auditoriumName - Auditorium Name
	 */
	public String getAuditoriumName()
	{
		return getAuditoriumName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.auditoriumName</code> attribute. 
	 * @return the localized auditoriumName - Auditorium Name
	 */
	public Map<Language,String> getAllAuditoriumName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,AUDITORIUMNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.auditoriumName</code> attribute. 
	 * @return the localized auditoriumName - Auditorium Name
	 */
	public Map<Language,String> getAllAuditoriumName()
	{
		return getAllAuditoriumName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.auditoriumName</code> attribute. 
	 * @param value the auditoriumName - Auditorium Name
	 */
	public void setAuditoriumName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractActivityInventoryDetail.setAuditoriumName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, AUDITORIUMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.auditoriumName</code> attribute. 
	 * @param value the auditoriumName - Auditorium Name
	 */
	public void setAuditoriumName(final String value)
	{
		setAuditoriumName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.auditoriumName</code> attribute. 
	 * @param value the auditoriumName - Auditorium Name
	 */
	public void setAllAuditoriumName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,AUDITORIUMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.auditoriumName</code> attribute. 
	 * @param value the auditoriumName - Auditorium Name
	 */
	public void setAllAuditoriumName(final Map<Language,String> value)
	{
		setAllAuditoriumName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.seatingClass</code> attribute.
	 * @return the seatingClass - Seating Class
	 */
	public EnumerationValue getSeatingClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SEATINGCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.seatingClass</code> attribute.
	 * @return the seatingClass - Seating Class
	 */
	public EnumerationValue getSeatingClass()
	{
		return getSeatingClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.seatingClass</code> attribute. 
	 * @param value the seatingClass - Seating Class
	 */
	public void setSeatingClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SEATINGCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.seatingClass</code> attribute. 
	 * @param value the seatingClass - Seating Class
	 */
	public void setSeatingClass(final EnumerationValue value)
	{
		setSeatingClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.seats</code> attribute.
	 * @return the seats - Seats
	 */
	public Boolean isSeats(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SEATS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.seats</code> attribute.
	 * @return the seats - Seats
	 */
	public Boolean isSeats()
	{
		return isSeats( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.seats</code> attribute. 
	 * @return the seats - Seats
	 */
	public boolean isSeatsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSeats( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.seats</code> attribute. 
	 * @return the seats - Seats
	 */
	public boolean isSeatsAsPrimitive()
	{
		return isSeatsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.seats</code> attribute. 
	 * @param value the seats - Seats
	 */
	public void setSeats(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SEATS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.seats</code> attribute. 
	 * @param value the seats - Seats
	 */
	public void setSeats(final Boolean value)
	{
		setSeats( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.seats</code> attribute. 
	 * @param value the seats - Seats
	 */
	public void setSeats(final SessionContext ctx, final boolean value)
	{
		setSeats( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.seats</code> attribute. 
	 * @param value the seats - Seats
	 */
	public void setSeats(final boolean value)
	{
		setSeats( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.ticket</code> attribute.
	 * @return the ticket - Ticket
	 */
	public Boolean isTicket(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TICKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.ticket</code> attribute.
	 * @return the ticket - Ticket
	 */
	public Boolean isTicket()
	{
		return isTicket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.ticket</code> attribute. 
	 * @return the ticket - Ticket
	 */
	public boolean isTicketAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTicket( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.ticket</code> attribute. 
	 * @return the ticket - Ticket
	 */
	public boolean isTicketAsPrimitive()
	{
		return isTicketAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.ticket</code> attribute. 
	 * @param value the ticket - Ticket
	 */
	public void setTicket(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TICKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.ticket</code> attribute. 
	 * @param value the ticket - Ticket
	 */
	public void setTicket(final Boolean value)
	{
		setTicket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.ticket</code> attribute. 
	 * @param value the ticket - Ticket
	 */
	public void setTicket(final SessionContext ctx, final boolean value)
	{
		setTicket( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.ticket</code> attribute. 
	 * @param value the ticket - Ticket
	 */
	public void setTicket(final boolean value)
	{
		setTicket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.time</code> attribute.
	 * @return the time - Time
	 */
	public String getTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.time</code> attribute.
	 * @return the time - Time
	 */
	public String getTime()
	{
		return getTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.time</code> attribute. 
	 * @param value the time - Time
	 */
	public void setTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.time</code> attribute. 
	 * @param value the time - Time
	 */
	public void setTime(final String value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.timeOfDay</code> attribute.
	 * @return the timeOfDay - Time Of Day
	 */
	public EnumerationValue getTimeOfDay(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TIMEOFDAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityInventoryDetail.timeOfDay</code> attribute.
	 * @return the timeOfDay - Time Of Day
	 */
	public EnumerationValue getTimeOfDay()
	{
		return getTimeOfDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.timeOfDay</code> attribute. 
	 * @param value the timeOfDay - Time Of Day
	 */
	public void setTimeOfDay(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TIMEOFDAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityInventoryDetail.timeOfDay</code> attribute. 
	 * @param value the timeOfDay - Time Of Day
	 */
	public void setTimeOfDay(final EnumerationValue value)
	{
		setTimeOfDay( getSession().getSessionContext(), value );
	}
	
}
