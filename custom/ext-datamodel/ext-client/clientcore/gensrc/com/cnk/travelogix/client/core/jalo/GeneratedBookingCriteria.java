/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.supplier.masterdata.core.bookingconfig.BookingConfiguration;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BookingCriteria}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBookingCriteria extends GenericItem
{
	/** Qualifier of the <code>BookingCriteria.bookingAttribute</code> attribute **/
	public static final String BOOKINGATTRIBUTE = "bookingAttribute";
	/** Qualifier of the <code>BookingCriteria.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>BookingCriteria.basedOn</code> attribute **/
	public static final String BASEDON = "basedOn";
	/** Qualifier of the <code>BookingCriteria.cutOffDayHours</code> attribute **/
	public static final String CUTOFFDAYHOURS = "cutOffDayHours";
	/** Qualifier of the <code>BookingCriteria.cutOff</code> attribute **/
	public static final String CUTOFF = "cutOff";
	/** Qualifier of the <code>BookingCriteria.criteria</code> attribute **/
	public static final String CRITERIA = "criteria";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRITERIA's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBookingCriteria> CRITERIAHANDLER = new BidirectionalOneToManyHandler<GeneratedBookingCriteria>(
	ClientcoreConstants.TC.BOOKINGCRITERIA,
	false,
	"criteria",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BOOKINGATTRIBUTE, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(BASEDON, AttributeMode.INITIAL);
		tmp.put(CUTOFFDAYHOURS, AttributeMode.INITIAL);
		tmp.put(CUTOFF, AttributeMode.INITIAL);
		tmp.put(CRITERIA, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingCriteria.basedOn</code> attribute.
	 * @return the basedOn - Booking Based on
	 */
	public EnumerationValue getBasedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, BASEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingCriteria.basedOn</code> attribute.
	 * @return the basedOn - Booking Based on
	 */
	public EnumerationValue getBasedOn()
	{
		return getBasedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingCriteria.basedOn</code> attribute. 
	 * @param value the basedOn - Booking Based on
	 */
	public void setBasedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, BASEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingCriteria.basedOn</code> attribute. 
	 * @param value the basedOn - Booking Based on
	 */
	public void setBasedOn(final EnumerationValue value)
	{
		setBasedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingCriteria.bookingAttribute</code> attribute.
	 * @return the bookingAttribute - Booking Attribute
	 */
	public EnumerationValue getBookingAttribute(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, BOOKINGATTRIBUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingCriteria.bookingAttribute</code> attribute.
	 * @return the bookingAttribute - Booking Attribute
	 */
	public EnumerationValue getBookingAttribute()
	{
		return getBookingAttribute( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingCriteria.bookingAttribute</code> attribute. 
	 * @param value the bookingAttribute - Booking Attribute
	 */
	public void setBookingAttribute(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, BOOKINGATTRIBUTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingCriteria.bookingAttribute</code> attribute. 
	 * @param value the bookingAttribute - Booking Attribute
	 */
	public void setBookingAttribute(final EnumerationValue value)
	{
		setBookingAttribute( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CRITERIAHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingCriteria.criteria</code> attribute.
	 * @return the criteria
	 */
	public BookingConfiguration getCriteria(final SessionContext ctx)
	{
		return (BookingConfiguration)getProperty( ctx, CRITERIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingCriteria.criteria</code> attribute.
	 * @return the criteria
	 */
	public BookingConfiguration getCriteria()
	{
		return getCriteria( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingCriteria.criteria</code> attribute. 
	 * @param value the criteria
	 */
	public void setCriteria(final SessionContext ctx, final BookingConfiguration value)
	{
		CRITERIAHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingCriteria.criteria</code> attribute. 
	 * @param value the criteria
	 */
	public void setCriteria(final BookingConfiguration value)
	{
		setCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingCriteria.cutOff</code> attribute.
	 * @return the cutOff - CutOff
	 */
	public Integer getCutOff(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CUTOFF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingCriteria.cutOff</code> attribute.
	 * @return the cutOff - CutOff
	 */
	public Integer getCutOff()
	{
		return getCutOff( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingCriteria.cutOff</code> attribute. 
	 * @return the cutOff - CutOff
	 */
	public int getCutOffAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCutOff( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingCriteria.cutOff</code> attribute. 
	 * @return the cutOff - CutOff
	 */
	public int getCutOffAsPrimitive()
	{
		return getCutOffAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingCriteria.cutOff</code> attribute. 
	 * @param value the cutOff - CutOff
	 */
	public void setCutOff(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CUTOFF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingCriteria.cutOff</code> attribute. 
	 * @param value the cutOff - CutOff
	 */
	public void setCutOff(final Integer value)
	{
		setCutOff( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingCriteria.cutOff</code> attribute. 
	 * @param value the cutOff - CutOff
	 */
	public void setCutOff(final SessionContext ctx, final int value)
	{
		setCutOff( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingCriteria.cutOff</code> attribute. 
	 * @param value the cutOff - CutOff
	 */
	public void setCutOff(final int value)
	{
		setCutOff( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingCriteria.cutOffDayHours</code> attribute.
	 * @return the cutOffDayHours - CutOff Day and Hours
	 */
	public EnumerationValue getCutOffDayHours(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CUTOFFDAYHOURS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingCriteria.cutOffDayHours</code> attribute.
	 * @return the cutOffDayHours - CutOff Day and Hours
	 */
	public EnumerationValue getCutOffDayHours()
	{
		return getCutOffDayHours( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingCriteria.cutOffDayHours</code> attribute. 
	 * @param value the cutOffDayHours - CutOff Day and Hours
	 */
	public void setCutOffDayHours(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CUTOFFDAYHOURS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingCriteria.cutOffDayHours</code> attribute. 
	 * @param value the cutOffDayHours - CutOff Day and Hours
	 */
	public void setCutOffDayHours(final EnumerationValue value)
	{
		setCutOffDayHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingCriteria.status</code> attribute.
	 * @return the status - Booking Status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingCriteria.status</code> attribute.
	 * @return the status - Booking Status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingCriteria.status</code> attribute. 
	 * @param value the status - Booking Status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingCriteria.status</code> attribute. 
	 * @param value the status - Booking Status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
}
