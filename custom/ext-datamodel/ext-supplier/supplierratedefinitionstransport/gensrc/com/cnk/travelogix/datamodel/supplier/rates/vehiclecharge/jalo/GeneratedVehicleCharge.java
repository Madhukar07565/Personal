/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.vehiclecharge.jalo;

import com.cnk.travelogix.product.transport.masters.core.jalo.Vehicle;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.vehiclecharge.jalo.VehicleCharge VehicleCharge}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVehicleCharge extends GenericItem
{
	/** Qualifier of the <code>VehicleCharge.vehicle</code> attribute **/
	public static final String VEHICLE = "vehicle";
	/** Qualifier of the <code>VehicleCharge.driveAgeFrom</code> attribute **/
	public static final String DRIVEAGEFROM = "driveAgeFrom";
	/** Qualifier of the <code>VehicleCharge.driveAgeTo</code> attribute **/
	public static final String DRIVEAGETO = "driveAgeTo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(VEHICLE, AttributeMode.INITIAL);
		tmp.put(DRIVEAGEFROM, AttributeMode.INITIAL);
		tmp.put(DRIVEAGETO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleCharge.driveAgeFrom</code> attribute.
	 * @return the driveAgeFrom
	 */
	public Integer getDriveAgeFrom(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DRIVEAGEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleCharge.driveAgeFrom</code> attribute.
	 * @return the driveAgeFrom
	 */
	public Integer getDriveAgeFrom()
	{
		return getDriveAgeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleCharge.driveAgeFrom</code> attribute. 
	 * @return the driveAgeFrom
	 */
	public int getDriveAgeFromAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDriveAgeFrom( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleCharge.driveAgeFrom</code> attribute. 
	 * @return the driveAgeFrom
	 */
	public int getDriveAgeFromAsPrimitive()
	{
		return getDriveAgeFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleCharge.driveAgeFrom</code> attribute. 
	 * @param value the driveAgeFrom
	 */
	public void setDriveAgeFrom(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DRIVEAGEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleCharge.driveAgeFrom</code> attribute. 
	 * @param value the driveAgeFrom
	 */
	public void setDriveAgeFrom(final Integer value)
	{
		setDriveAgeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleCharge.driveAgeFrom</code> attribute. 
	 * @param value the driveAgeFrom
	 */
	public void setDriveAgeFrom(final SessionContext ctx, final int value)
	{
		setDriveAgeFrom( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleCharge.driveAgeFrom</code> attribute. 
	 * @param value the driveAgeFrom
	 */
	public void setDriveAgeFrom(final int value)
	{
		setDriveAgeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleCharge.driveAgeTo</code> attribute.
	 * @return the driveAgeTo
	 */
	public Integer getDriveAgeTo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DRIVEAGETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleCharge.driveAgeTo</code> attribute.
	 * @return the driveAgeTo
	 */
	public Integer getDriveAgeTo()
	{
		return getDriveAgeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleCharge.driveAgeTo</code> attribute. 
	 * @return the driveAgeTo
	 */
	public int getDriveAgeToAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDriveAgeTo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleCharge.driveAgeTo</code> attribute. 
	 * @return the driveAgeTo
	 */
	public int getDriveAgeToAsPrimitive()
	{
		return getDriveAgeToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleCharge.driveAgeTo</code> attribute. 
	 * @param value the driveAgeTo
	 */
	public void setDriveAgeTo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DRIVEAGETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleCharge.driveAgeTo</code> attribute. 
	 * @param value the driveAgeTo
	 */
	public void setDriveAgeTo(final Integer value)
	{
		setDriveAgeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleCharge.driveAgeTo</code> attribute. 
	 * @param value the driveAgeTo
	 */
	public void setDriveAgeTo(final SessionContext ctx, final int value)
	{
		setDriveAgeTo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleCharge.driveAgeTo</code> attribute. 
	 * @param value the driveAgeTo
	 */
	public void setDriveAgeTo(final int value)
	{
		setDriveAgeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleCharge.vehicle</code> attribute.
	 * @return the vehicle
	 */
	public Vehicle getVehicle(final SessionContext ctx)
	{
		return (Vehicle)getProperty( ctx, VEHICLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleCharge.vehicle</code> attribute.
	 * @return the vehicle
	 */
	public Vehicle getVehicle()
	{
		return getVehicle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleCharge.vehicle</code> attribute. 
	 * @param value the vehicle
	 */
	public void setVehicle(final SessionContext ctx, final Vehicle value)
	{
		setProperty(ctx, VEHICLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleCharge.vehicle</code> attribute. 
	 * @param value the vehicle
	 */
	public void setVehicle(final Vehicle value)
	{
		setVehicle( getSession().getSessionContext(), value );
	}
	
}
