/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.BaseEnquiryProductSpecific;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem EnquiryProductFlight}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEnquiryProductFlight extends BaseEnquiryProductSpecific
{
	/** Qualifier of the <code>EnquiryProductFlight.from</code> attribute **/
	public static final String FROM = "from";
	/** Qualifier of the <code>EnquiryProductFlight.to</code> attribute **/
	public static final String TO = "to";
	/** Qualifier of the <code>EnquiryProductFlight.departureDate</code> attribute **/
	public static final String DEPARTUREDATE = "departureDate";
	/** Qualifier of the <code>EnquiryProductFlight.returnDate</code> attribute **/
	public static final String RETURNDATE = "returnDate";
	/** Qualifier of the <code>EnquiryProductFlight.numberOfinfants</code> attribute **/
	public static final String NUMBEROFINFANTS = "numberOfinfants";
	/** Qualifier of the <code>EnquiryProductFlight.preferredAirline</code> attribute **/
	public static final String PREFERREDAIRLINE = "preferredAirline";
	/** Qualifier of the <code>EnquiryProductFlight.serviceClass</code> attribute **/
	public static final String SERVICECLASS = "serviceClass";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BaseEnquiryProductSpecific.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FROM, AttributeMode.INITIAL);
		tmp.put(TO, AttributeMode.INITIAL);
		tmp.put(DEPARTUREDATE, AttributeMode.INITIAL);
		tmp.put(RETURNDATE, AttributeMode.INITIAL);
		tmp.put(NUMBEROFINFANTS, AttributeMode.INITIAL);
		tmp.put(PREFERREDAIRLINE, AttributeMode.INITIAL);
		tmp.put(SERVICECLASS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.departureDate</code> attribute.
	 * @return the departureDate
	 */
	public Date getDepartureDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DEPARTUREDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.departureDate</code> attribute.
	 * @return the departureDate
	 */
	public Date getDepartureDate()
	{
		return getDepartureDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.departureDate</code> attribute. 
	 * @param value the departureDate
	 */
	public void setDepartureDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DEPARTUREDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.departureDate</code> attribute. 
	 * @param value the departureDate
	 */
	public void setDepartureDate(final Date value)
	{
		setDepartureDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.from</code> attribute.
	 * @return the from
	 */
	public String getFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.from</code> attribute.
	 * @return the from
	 */
	public String getFrom()
	{
		return getFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.from</code> attribute. 
	 * @param value the from
	 */
	public void setFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.from</code> attribute. 
	 * @param value the from
	 */
	public void setFrom(final String value)
	{
		setFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.numberOfinfants</code> attribute.
	 * @return the numberOfinfants
	 */
	public Integer getNumberOfinfants(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFINFANTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.numberOfinfants</code> attribute.
	 * @return the numberOfinfants
	 */
	public Integer getNumberOfinfants()
	{
		return getNumberOfinfants( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.numberOfinfants</code> attribute. 
	 * @return the numberOfinfants
	 */
	public int getNumberOfinfantsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfinfants( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.numberOfinfants</code> attribute. 
	 * @return the numberOfinfants
	 */
	public int getNumberOfinfantsAsPrimitive()
	{
		return getNumberOfinfantsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.numberOfinfants</code> attribute. 
	 * @param value the numberOfinfants
	 */
	public void setNumberOfinfants(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFINFANTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.numberOfinfants</code> attribute. 
	 * @param value the numberOfinfants
	 */
	public void setNumberOfinfants(final Integer value)
	{
		setNumberOfinfants( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.numberOfinfants</code> attribute. 
	 * @param value the numberOfinfants
	 */
	public void setNumberOfinfants(final SessionContext ctx, final int value)
	{
		setNumberOfinfants( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.numberOfinfants</code> attribute. 
	 * @param value the numberOfinfants
	 */
	public void setNumberOfinfants(final int value)
	{
		setNumberOfinfants( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.preferredAirline</code> attribute.
	 * @return the preferredAirline
	 */
	public String getPreferredAirline(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PREFERREDAIRLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.preferredAirline</code> attribute.
	 * @return the preferredAirline
	 */
	public String getPreferredAirline()
	{
		return getPreferredAirline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.preferredAirline</code> attribute. 
	 * @param value the preferredAirline
	 */
	public void setPreferredAirline(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PREFERREDAIRLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.preferredAirline</code> attribute. 
	 * @param value the preferredAirline
	 */
	public void setPreferredAirline(final String value)
	{
		setPreferredAirline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.returnDate</code> attribute.
	 * @return the returnDate
	 */
	public Date getReturnDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RETURNDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.returnDate</code> attribute.
	 * @return the returnDate
	 */
	public Date getReturnDate()
	{
		return getReturnDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.returnDate</code> attribute. 
	 * @param value the returnDate
	 */
	public void setReturnDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RETURNDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.returnDate</code> attribute. 
	 * @param value the returnDate
	 */
	public void setReturnDate(final Date value)
	{
		setReturnDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.serviceClass</code> attribute.
	 * @return the serviceClass
	 */
	public String getServiceClass(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SERVICECLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.serviceClass</code> attribute.
	 * @return the serviceClass
	 */
	public String getServiceClass()
	{
		return getServiceClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.serviceClass</code> attribute. 
	 * @param value the serviceClass
	 */
	public void setServiceClass(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SERVICECLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.serviceClass</code> attribute. 
	 * @param value the serviceClass
	 */
	public void setServiceClass(final String value)
	{
		setServiceClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.to</code> attribute.
	 * @return the to
	 */
	public String getTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductFlight.to</code> attribute.
	 * @return the to
	 */
	public String getTo()
	{
		return getTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.to</code> attribute. 
	 * @param value the to
	 */
	public void setTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductFlight.to</code> attribute. 
	 * @param value the to
	 */
	public void setTo(final String value)
	{
		setTo( getSession().getSessionContext(), value );
	}
	
}
