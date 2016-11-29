/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.AbstractDayWiseItinerary;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.RailTransferDayWiseItinerary RailTransferDayWiseItinerary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRailTransferDayWiseItinerary extends AbstractDayWiseItinerary
{
	/** Qualifier of the <code>RailTransferDayWiseItinerary.journeyType</code> attribute **/
	public static final String JOURNEYTYPE = "journeyType";
	/** Qualifier of the <code>RailTransferDayWiseItinerary.journeyByPass</code> attribute **/
	public static final String JOURNEYBYPASS = "journeyByPass";
	/** Qualifier of the <code>RailTransferDayWiseItinerary.availDays</code> attribute **/
	public static final String AVAILDAYS = "availDays";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractDayWiseItinerary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(JOURNEYTYPE, AttributeMode.INITIAL);
		tmp.put(JOURNEYBYPASS, AttributeMode.INITIAL);
		tmp.put(AVAILDAYS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTransferDayWiseItinerary.availDays</code> attribute.
	 * @return the availDays - Available days
	 */
	public Integer getAvailDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AVAILDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTransferDayWiseItinerary.availDays</code> attribute.
	 * @return the availDays - Available days
	 */
	public Integer getAvailDays()
	{
		return getAvailDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTransferDayWiseItinerary.availDays</code> attribute. 
	 * @return the availDays - Available days
	 */
	public int getAvailDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAvailDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTransferDayWiseItinerary.availDays</code> attribute. 
	 * @return the availDays - Available days
	 */
	public int getAvailDaysAsPrimitive()
	{
		return getAvailDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTransferDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AVAILDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTransferDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final Integer value)
	{
		setAvailDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTransferDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final SessionContext ctx, final int value)
	{
		setAvailDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTransferDayWiseItinerary.availDays</code> attribute. 
	 * @param value the availDays - Available days
	 */
	public void setAvailDays(final int value)
	{
		setAvailDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTransferDayWiseItinerary.journeyByPass</code> attribute.
	 * @return the journeyByPass - Journey by pass
	 */
	public Boolean isJourneyByPass(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, JOURNEYBYPASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTransferDayWiseItinerary.journeyByPass</code> attribute.
	 * @return the journeyByPass - Journey by pass
	 */
	public Boolean isJourneyByPass()
	{
		return isJourneyByPass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTransferDayWiseItinerary.journeyByPass</code> attribute. 
	 * @return the journeyByPass - Journey by pass
	 */
	public boolean isJourneyByPassAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isJourneyByPass( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTransferDayWiseItinerary.journeyByPass</code> attribute. 
	 * @return the journeyByPass - Journey by pass
	 */
	public boolean isJourneyByPassAsPrimitive()
	{
		return isJourneyByPassAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTransferDayWiseItinerary.journeyByPass</code> attribute. 
	 * @param value the journeyByPass - Journey by pass
	 */
	public void setJourneyByPass(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, JOURNEYBYPASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTransferDayWiseItinerary.journeyByPass</code> attribute. 
	 * @param value the journeyByPass - Journey by pass
	 */
	public void setJourneyByPass(final Boolean value)
	{
		setJourneyByPass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTransferDayWiseItinerary.journeyByPass</code> attribute. 
	 * @param value the journeyByPass - Journey by pass
	 */
	public void setJourneyByPass(final SessionContext ctx, final boolean value)
	{
		setJourneyByPass( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTransferDayWiseItinerary.journeyByPass</code> attribute. 
	 * @param value the journeyByPass - Journey by pass
	 */
	public void setJourneyByPass(final boolean value)
	{
		setJourneyByPass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTransferDayWiseItinerary.journeyType</code> attribute.
	 * @return the journeyType - Journey type
	 */
	public EnumerationValue getJourneyType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, JOURNEYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailTransferDayWiseItinerary.journeyType</code> attribute.
	 * @return the journeyType - Journey type
	 */
	public EnumerationValue getJourneyType()
	{
		return getJourneyType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTransferDayWiseItinerary.journeyType</code> attribute. 
	 * @param value the journeyType - Journey type
	 */
	public void setJourneyType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, JOURNEYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailTransferDayWiseItinerary.journeyType</code> attribute. 
	 * @param value the journeyType - Journey type
	 */
	public void setJourneyType(final EnumerationValue value)
	{
		setJourneyType( getSession().getSessionContext(), value );
	}
	
}
