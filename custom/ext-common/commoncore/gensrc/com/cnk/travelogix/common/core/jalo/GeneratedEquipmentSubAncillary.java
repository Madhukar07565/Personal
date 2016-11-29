/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.RoomAncillary;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem EquipmentSubAncillary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEquipmentSubAncillary extends RoomAncillary
{
	/** Qualifier of the <code>EquipmentSubAncillary.equipmentName</code> attribute **/
	public static final String EQUIPMENTNAME = "equipmentName";
	/** Qualifier of the <code>EquipmentSubAncillary.vehicleType</code> attribute **/
	public static final String VEHICLETYPE = "vehicleType";
	/** Qualifier of the <code>EquipmentSubAncillary.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>EquipmentSubAncillary.startDate</code> attribute **/
	public static final String STARTDATE = "startDate";
	/** Qualifier of the <code>EquipmentSubAncillary.endDate</code> attribute **/
	public static final String ENDDATE = "endDate";
	/** Qualifier of the <code>EquipmentSubAncillary.quantity</code> attribute **/
	public static final String QUANTITY = "quantity";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(RoomAncillary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EQUIPMENTNAME, AttributeMode.INITIAL);
		tmp.put(VEHICLETYPE, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(STARTDATE, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		tmp.put(QUANTITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EquipmentSubAncillary.duration</code> attribute.
	 * @return the duration
	 */
	public String getDuration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EquipmentSubAncillary.duration</code> attribute.
	 * @return the duration
	 */
	public String getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EquipmentSubAncillary.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EquipmentSubAncillary.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final String value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EquipmentSubAncillary.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EquipmentSubAncillary.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate()
	{
		return getEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EquipmentSubAncillary.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EquipmentSubAncillary.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final Date value)
	{
		setEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EquipmentSubAncillary.equipmentName</code> attribute.
	 * @return the equipmentName
	 */
	public String getEquipmentName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EQUIPMENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EquipmentSubAncillary.equipmentName</code> attribute.
	 * @return the equipmentName
	 */
	public String getEquipmentName()
	{
		return getEquipmentName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EquipmentSubAncillary.equipmentName</code> attribute. 
	 * @param value the equipmentName
	 */
	public void setEquipmentName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EQUIPMENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EquipmentSubAncillary.equipmentName</code> attribute. 
	 * @param value the equipmentName
	 */
	public void setEquipmentName(final String value)
	{
		setEquipmentName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EquipmentSubAncillary.quantity</code> attribute.
	 * @return the quantity
	 */
	public Integer getQuantity(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, QUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EquipmentSubAncillary.quantity</code> attribute.
	 * @return the quantity
	 */
	public Integer getQuantity()
	{
		return getQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EquipmentSubAncillary.quantity</code> attribute. 
	 * @return the quantity
	 */
	public int getQuantityAsPrimitive(final SessionContext ctx)
	{
		Integer value = getQuantity( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EquipmentSubAncillary.quantity</code> attribute. 
	 * @return the quantity
	 */
	public int getQuantityAsPrimitive()
	{
		return getQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EquipmentSubAncillary.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, QUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EquipmentSubAncillary.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final Integer value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EquipmentSubAncillary.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final SessionContext ctx, final int value)
	{
		setQuantity( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EquipmentSubAncillary.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final int value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EquipmentSubAncillary.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EquipmentSubAncillary.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate()
	{
		return getStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EquipmentSubAncillary.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EquipmentSubAncillary.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final Date value)
	{
		setStartDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EquipmentSubAncillary.vehicleType</code> attribute.
	 * @return the vehicleType
	 */
	public EnumerationValue getVehicleType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VEHICLETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EquipmentSubAncillary.vehicleType</code> attribute.
	 * @return the vehicleType
	 */
	public EnumerationValue getVehicleType()
	{
		return getVehicleType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EquipmentSubAncillary.vehicleType</code> attribute. 
	 * @param value the vehicleType
	 */
	public void setVehicleType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VEHICLETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EquipmentSubAncillary.vehicleType</code> attribute. 
	 * @param value the vehicleType
	 */
	public void setVehicleType(final EnumerationValue value)
	{
		setVehicleType( getSession().getSessionContext(), value );
	}
	
}
