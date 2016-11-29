/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.Vehicle;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.VehicleDetails VehicleDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVehicleDetails extends GenericItem
{
	/** Qualifier of the <code>VehicleDetails.vehicleType</code> attribute **/
	public static final String VEHICLETYPE = "vehicleType";
	/** Qualifier of the <code>VehicleDetails.vehicleCategory</code> attribute **/
	public static final String VEHICLECATEGORY = "vehicleCategory";
	/** Qualifier of the <code>VehicleDetails.vehicleName</code> attribute **/
	public static final String VEHICLENAME = "vehicleName";
	/** Qualifier of the <code>VehicleDetails.airCondition</code> attribute **/
	public static final String AIRCONDITION = "airCondition";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(VEHICLETYPE, AttributeMode.INITIAL);
		tmp.put(VEHICLECATEGORY, AttributeMode.INITIAL);
		tmp.put(VEHICLENAME, AttributeMode.INITIAL);
		tmp.put(AIRCONDITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDetails.airCondition</code> attribute.
	 * @return the airCondition - Air Condition
	 */
	public Boolean isAirCondition(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AIRCONDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDetails.airCondition</code> attribute.
	 * @return the airCondition - Air Condition
	 */
	public Boolean isAirCondition()
	{
		return isAirCondition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDetails.airCondition</code> attribute. 
	 * @return the airCondition - Air Condition
	 */
	public boolean isAirConditionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAirCondition( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDetails.airCondition</code> attribute. 
	 * @return the airCondition - Air Condition
	 */
	public boolean isAirConditionAsPrimitive()
	{
		return isAirConditionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDetails.airCondition</code> attribute. 
	 * @param value the airCondition - Air Condition
	 */
	public void setAirCondition(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AIRCONDITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDetails.airCondition</code> attribute. 
	 * @param value the airCondition - Air Condition
	 */
	public void setAirCondition(final Boolean value)
	{
		setAirCondition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDetails.airCondition</code> attribute. 
	 * @param value the airCondition - Air Condition
	 */
	public void setAirCondition(final SessionContext ctx, final boolean value)
	{
		setAirCondition( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDetails.airCondition</code> attribute. 
	 * @param value the airCondition - Air Condition
	 */
	public void setAirCondition(final boolean value)
	{
		setAirCondition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDetails.vehicleCategory</code> attribute.
	 * @return the vehicleCategory - Vehicle Category
	 */
	public EnumerationValue getVehicleCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VEHICLECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDetails.vehicleCategory</code> attribute.
	 * @return the vehicleCategory - Vehicle Category
	 */
	public EnumerationValue getVehicleCategory()
	{
		return getVehicleCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDetails.vehicleCategory</code> attribute. 
	 * @param value the vehicleCategory - Vehicle Category
	 */
	public void setVehicleCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VEHICLECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDetails.vehicleCategory</code> attribute. 
	 * @param value the vehicleCategory - Vehicle Category
	 */
	public void setVehicleCategory(final EnumerationValue value)
	{
		setVehicleCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDetails.vehicleName</code> attribute.
	 * @return the vehicleName - Vehicle Name
	 */
	public Vehicle getVehicleName(final SessionContext ctx)
	{
		return (Vehicle)getProperty( ctx, VEHICLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDetails.vehicleName</code> attribute.
	 * @return the vehicleName - Vehicle Name
	 */
	public Vehicle getVehicleName()
	{
		return getVehicleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDetails.vehicleName</code> attribute. 
	 * @param value the vehicleName - Vehicle Name
	 */
	public void setVehicleName(final SessionContext ctx, final Vehicle value)
	{
		setProperty(ctx, VEHICLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDetails.vehicleName</code> attribute. 
	 * @param value the vehicleName - Vehicle Name
	 */
	public void setVehicleName(final Vehicle value)
	{
		setVehicleName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDetails.vehicleType</code> attribute.
	 * @return the vehicleType - Vehicle Type
	 */
	public ProductCategorySubType getVehicleType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, VEHICLETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleDetails.vehicleType</code> attribute.
	 * @return the vehicleType - Vehicle Type
	 */
	public ProductCategorySubType getVehicleType()
	{
		return getVehicleType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDetails.vehicleType</code> attribute. 
	 * @param value the vehicleType - Vehicle Type
	 */
	public void setVehicleType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, VEHICLETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleDetails.vehicleType</code> attribute. 
	 * @param value the vehicleType - Vehicle Type
	 */
	public void setVehicleType(final ProductCategorySubType value)
	{
		setVehicleType( getSession().getSessionContext(), value );
	}
	
}
