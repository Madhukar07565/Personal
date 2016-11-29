/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.ShipEngineDetails ShipEngineDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedShipEngineDetails extends GenericItem
{
	/** Qualifier of the <code>ShipEngineDetails.quantity</code> attribute **/
	public static final String QUANTITY = "quantity";
	/** Qualifier of the <code>ShipEngineDetails.fuelType</code> attribute **/
	public static final String FUELTYPE = "fuelType";
	/** Qualifier of the <code>ShipEngineDetails.manufacturer</code> attribute **/
	public static final String MANUFACTURER = "manufacturer";
	/** Qualifier of the <code>ShipEngineDetails.model</code> attribute **/
	public static final String MODEL = "model";
	/** Qualifier of the <code>ShipEngineDetails.power</code> attribute **/
	public static final String POWER = "power";
	/** Qualifier of the <code>ShipEngineDetails.totalPower</code> attribute **/
	public static final String TOTALPOWER = "totalPower";
	/** Qualifier of the <code>ShipEngineDetails.propulsion</code> attribute **/
	public static final String PROPULSION = "propulsion";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(QUANTITY, AttributeMode.INITIAL);
		tmp.put(FUELTYPE, AttributeMode.INITIAL);
		tmp.put(MANUFACTURER, AttributeMode.INITIAL);
		tmp.put(MODEL, AttributeMode.INITIAL);
		tmp.put(POWER, AttributeMode.INITIAL);
		tmp.put(TOTALPOWER, AttributeMode.INITIAL);
		tmp.put(PROPULSION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEngineDetails.fuelType</code> attribute.
	 * @return the fuelType - Fuel Type
	 */
	public String getFuelType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FUELTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEngineDetails.fuelType</code> attribute.
	 * @return the fuelType - Fuel Type
	 */
	public String getFuelType()
	{
		return getFuelType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEngineDetails.fuelType</code> attribute. 
	 * @param value the fuelType - Fuel Type
	 */
	public void setFuelType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FUELTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEngineDetails.fuelType</code> attribute. 
	 * @param value the fuelType - Fuel Type
	 */
	public void setFuelType(final String value)
	{
		setFuelType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEngineDetails.manufacturer</code> attribute.
	 * @return the manufacturer - manufacturer
	 */
	public String getManufacturer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MANUFACTURER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEngineDetails.manufacturer</code> attribute.
	 * @return the manufacturer - manufacturer
	 */
	public String getManufacturer()
	{
		return getManufacturer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEngineDetails.manufacturer</code> attribute. 
	 * @param value the manufacturer - manufacturer
	 */
	public void setManufacturer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MANUFACTURER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEngineDetails.manufacturer</code> attribute. 
	 * @param value the manufacturer - manufacturer
	 */
	public void setManufacturer(final String value)
	{
		setManufacturer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEngineDetails.model</code> attribute.
	 * @return the model - model
	 */
	public String getModel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MODEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEngineDetails.model</code> attribute.
	 * @return the model - model
	 */
	public String getModel()
	{
		return getModel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEngineDetails.model</code> attribute. 
	 * @param value the model - model
	 */
	public void setModel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MODEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEngineDetails.model</code> attribute. 
	 * @param value the model - model
	 */
	public void setModel(final String value)
	{
		setModel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEngineDetails.power</code> attribute.
	 * @return the power - Power
	 */
	public String getPower(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POWER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEngineDetails.power</code> attribute.
	 * @return the power - Power
	 */
	public String getPower()
	{
		return getPower( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEngineDetails.power</code> attribute. 
	 * @param value the power - Power
	 */
	public void setPower(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POWER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEngineDetails.power</code> attribute. 
	 * @param value the power - Power
	 */
	public void setPower(final String value)
	{
		setPower( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEngineDetails.propulsion</code> attribute.
	 * @return the propulsion - Propulsion
	 */
	public String getPropulsion(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PROPULSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEngineDetails.propulsion</code> attribute.
	 * @return the propulsion - Propulsion
	 */
	public String getPropulsion()
	{
		return getPropulsion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEngineDetails.propulsion</code> attribute. 
	 * @param value the propulsion - Propulsion
	 */
	public void setPropulsion(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PROPULSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEngineDetails.propulsion</code> attribute. 
	 * @param value the propulsion - Propulsion
	 */
	public void setPropulsion(final String value)
	{
		setPropulsion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEngineDetails.quantity</code> attribute.
	 * @return the quantity - Quantity
	 */
	public String getQuantity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, QUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEngineDetails.quantity</code> attribute.
	 * @return the quantity - Quantity
	 */
	public String getQuantity()
	{
		return getQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEngineDetails.quantity</code> attribute. 
	 * @param value the quantity - Quantity
	 */
	public void setQuantity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, QUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEngineDetails.quantity</code> attribute. 
	 * @param value the quantity - Quantity
	 */
	public void setQuantity(final String value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEngineDetails.totalPower</code> attribute.
	 * @return the totalPower - TotalPower
	 */
	public String getTotalPower(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOTALPOWER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEngineDetails.totalPower</code> attribute.
	 * @return the totalPower - TotalPower
	 */
	public String getTotalPower()
	{
		return getTotalPower( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEngineDetails.totalPower</code> attribute. 
	 * @param value the totalPower - TotalPower
	 */
	public void setTotalPower(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOTALPOWER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEngineDetails.totalPower</code> attribute. 
	 * @param value the totalPower - TotalPower
	 */
	public void setTotalPower(final String value)
	{
		setTotalPower( getSession().getSessionContext(), value );
	}
	
}
