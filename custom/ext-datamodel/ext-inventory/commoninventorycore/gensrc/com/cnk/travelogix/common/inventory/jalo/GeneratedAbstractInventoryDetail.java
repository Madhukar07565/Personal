/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.jalo.AbstractInventoryDetail AbstractInventoryDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractInventoryDetail extends AbstractTravelogixItem
{
	/** Qualifier of the <code>AbstractInventoryDetail.departureDate</code> attribute **/
	public static final String DEPARTUREDATE = "departureDate";
	/** Qualifier of the <code>AbstractInventoryDetail.arrivalDate</code> attribute **/
	public static final String ARRIVALDATE = "arrivalDate";
	/** Qualifier of the <code>AbstractInventoryDetail.inventoryType</code> attribute **/
	public static final String INVENTORYTYPE = "inventoryType";
	/** Qualifier of the <code>AbstractInventoryDetail.reservedCutOffDays</code> attribute **/
	public static final String RESERVEDCUTOFFDAYS = "reservedCutOffDays";
	/** Qualifier of the <code>AbstractInventoryDetail.releasedDate</code> attribute **/
	public static final String RELEASEDDATE = "releasedDate";
	/** Qualifier of the <code>AbstractInventoryDetail.createdDate</code> attribute **/
	public static final String CREATEDDATE = "createdDate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DEPARTUREDATE, AttributeMode.INITIAL);
		tmp.put(ARRIVALDATE, AttributeMode.INITIAL);
		tmp.put(INVENTORYTYPE, AttributeMode.INITIAL);
		tmp.put(RESERVEDCUTOFFDAYS, AttributeMode.INITIAL);
		tmp.put(RELEASEDDATE, AttributeMode.INITIAL);
		tmp.put(CREATEDDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDetail.arrivalDate</code> attribute.
	 * @return the arrivalDate - Arrival Dates
	 */
	public Date getArrivalDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ARRIVALDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDetail.arrivalDate</code> attribute.
	 * @return the arrivalDate - Arrival Dates
	 */
	public Date getArrivalDate()
	{
		return getArrivalDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDetail.arrivalDate</code> attribute. 
	 * @param value the arrivalDate - Arrival Dates
	 */
	public void setArrivalDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ARRIVALDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDetail.arrivalDate</code> attribute. 
	 * @param value the arrivalDate - Arrival Dates
	 */
	public void setArrivalDate(final Date value)
	{
		setArrivalDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDetail.createdDate</code> attribute.
	 * @return the createdDate - Inventory Created Date
	 */
	public Date getCreatedDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CREATEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDetail.createdDate</code> attribute.
	 * @return the createdDate - Inventory Created Date
	 */
	public Date getCreatedDate()
	{
		return getCreatedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDetail.createdDate</code> attribute. 
	 * @param value the createdDate - Inventory Created Date
	 */
	public void setCreatedDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CREATEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDetail.createdDate</code> attribute. 
	 * @param value the createdDate - Inventory Created Date
	 */
	public void setCreatedDate(final Date value)
	{
		setCreatedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDetail.departureDate</code> attribute.
	 * @return the departureDate - Departure Date
	 */
	public Date getDepartureDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DEPARTUREDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDetail.departureDate</code> attribute.
	 * @return the departureDate - Departure Date
	 */
	public Date getDepartureDate()
	{
		return getDepartureDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDetail.departureDate</code> attribute. 
	 * @param value the departureDate - Departure Date
	 */
	public void setDepartureDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DEPARTUREDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDetail.departureDate</code> attribute. 
	 * @param value the departureDate - Departure Date
	 */
	public void setDepartureDate(final Date value)
	{
		setDepartureDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDetail.inventoryType</code> attribute.
	 * @return the inventoryType - Inventory Type
	 */
	public EnumerationValue getInventoryType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, INVENTORYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDetail.inventoryType</code> attribute.
	 * @return the inventoryType - Inventory Type
	 */
	public EnumerationValue getInventoryType()
	{
		return getInventoryType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDetail.inventoryType</code> attribute. 
	 * @param value the inventoryType - Inventory Type
	 */
	public void setInventoryType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, INVENTORYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDetail.inventoryType</code> attribute. 
	 * @param value the inventoryType - Inventory Type
	 */
	public void setInventoryType(final EnumerationValue value)
	{
		setInventoryType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDetail.releasedDate</code> attribute.
	 * @return the releasedDate - Inventory Released Date
	 */
	public Date getReleasedDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RELEASEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDetail.releasedDate</code> attribute.
	 * @return the releasedDate - Inventory Released Date
	 */
	public Date getReleasedDate()
	{
		return getReleasedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDetail.releasedDate</code> attribute. 
	 * @param value the releasedDate - Inventory Released Date
	 */
	public void setReleasedDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RELEASEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDetail.releasedDate</code> attribute. 
	 * @param value the releasedDate - Inventory Released Date
	 */
	public void setReleasedDate(final Date value)
	{
		setReleasedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDetail.reservedCutOffDays</code> attribute.
	 * @return the reservedCutOffDays - Reserved CutOff Days
	 */
	public Long getReservedCutOffDays(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, RESERVEDCUTOFFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDetail.reservedCutOffDays</code> attribute.
	 * @return the reservedCutOffDays - Reserved CutOff Days
	 */
	public Long getReservedCutOffDays()
	{
		return getReservedCutOffDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDetail.reservedCutOffDays</code> attribute. 
	 * @return the reservedCutOffDays - Reserved CutOff Days
	 */
	public long getReservedCutOffDaysAsPrimitive(final SessionContext ctx)
	{
		Long value = getReservedCutOffDays( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryDetail.reservedCutOffDays</code> attribute. 
	 * @return the reservedCutOffDays - Reserved CutOff Days
	 */
	public long getReservedCutOffDaysAsPrimitive()
	{
		return getReservedCutOffDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDetail.reservedCutOffDays</code> attribute. 
	 * @param value the reservedCutOffDays - Reserved CutOff Days
	 */
	public void setReservedCutOffDays(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, RESERVEDCUTOFFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDetail.reservedCutOffDays</code> attribute. 
	 * @param value the reservedCutOffDays - Reserved CutOff Days
	 */
	public void setReservedCutOffDays(final Long value)
	{
		setReservedCutOffDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDetail.reservedCutOffDays</code> attribute. 
	 * @param value the reservedCutOffDays - Reserved CutOff Days
	 */
	public void setReservedCutOffDays(final SessionContext ctx, final long value)
	{
		setReservedCutOffDays( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryDetail.reservedCutOffDays</code> attribute. 
	 * @param value the reservedCutOffDays - Reserved CutOff Days
	 */
	public void setReservedCutOffDays(final long value)
	{
		setReservedCutOffDays( getSession().getSessionContext(), value );
	}
	
}
