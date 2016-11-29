/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.DateRange DateRange}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDateRange extends GenericItem
{
	/** Qualifier of the <code>DateRange.fromDate</code> attribute **/
	public static final String FROMDATE = "fromDate";
	/** Qualifier of the <code>DateRange.toDate</code> attribute **/
	public static final String TODATE = "toDate";
	/** Qualifier of the <code>DateRange.days</code> attribute **/
	public static final String DAYS = "days";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FROMDATE, AttributeMode.INITIAL);
		tmp.put(TODATE, AttributeMode.INITIAL);
		tmp.put(DAYS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRange.days</code> attribute.
	 * @return the days
	 */
	public EnumerationValue getDays(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRange.days</code> attribute.
	 * @return the days
	 */
	public EnumerationValue getDays()
	{
		return getDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRange.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRange.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final EnumerationValue value)
	{
		setDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRange.fromDate</code> attribute.
	 * @return the fromDate
	 */
	public Date getFromDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, FROMDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRange.fromDate</code> attribute.
	 * @return the fromDate
	 */
	public Date getFromDate()
	{
		return getFromDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRange.fromDate</code> attribute. 
	 * @param value the fromDate
	 */
	public void setFromDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, FROMDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRange.fromDate</code> attribute. 
	 * @param value the fromDate
	 */
	public void setFromDate(final Date value)
	{
		setFromDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRange.toDate</code> attribute.
	 * @return the toDate
	 */
	public Date getToDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TODATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRange.toDate</code> attribute.
	 * @return the toDate
	 */
	public Date getToDate()
	{
		return getToDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRange.toDate</code> attribute. 
	 * @param value the toDate
	 */
	public void setToDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TODATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRange.toDate</code> attribute. 
	 * @param value the toDate
	 */
	public void setToDate(final Date value)
	{
		setToDate( getSession().getSessionContext(), value );
	}
	
}
