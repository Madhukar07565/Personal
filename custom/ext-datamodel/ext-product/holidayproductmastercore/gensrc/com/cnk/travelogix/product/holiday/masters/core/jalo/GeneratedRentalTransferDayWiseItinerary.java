/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.TransferProductDayWiseItinerary;
import com.cnk.travelogix.product.transport.masters.core.jalo.Vehicle;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.RentalTransferDayWiseItinerary RentalTransferDayWiseItinerary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRentalTransferDayWiseItinerary extends TransferProductDayWiseItinerary
{
	/** Qualifier of the <code>RentalTransferDayWiseItinerary.vehicleCategory</code> attribute **/
	public static final String VEHICLECATEGORY = "vehicleCategory";
	/** Qualifier of the <code>RentalTransferDayWiseItinerary.vehicleName</code> attribute **/
	public static final String VEHICLENAME = "vehicleName";
	/** Qualifier of the <code>RentalTransferDayWiseItinerary.airCondition</code> attribute **/
	public static final String AIRCONDITION = "airCondition";
	/** Qualifier of the <code>RentalTransferDayWiseItinerary.withChuffer</code> attribute **/
	public static final String WITHCHUFFER = "withChuffer";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(TransferProductDayWiseItinerary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VEHICLECATEGORY, AttributeMode.INITIAL);
		tmp.put(VEHICLENAME, AttributeMode.INITIAL);
		tmp.put(AIRCONDITION, AttributeMode.INITIAL);
		tmp.put(WITHCHUFFER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RentalTransferDayWiseItinerary.airCondition</code> attribute.
	 * @return the airCondition - Air condition
	 */
	public Boolean isAirCondition(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AIRCONDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RentalTransferDayWiseItinerary.airCondition</code> attribute.
	 * @return the airCondition - Air condition
	 */
	public Boolean isAirCondition()
	{
		return isAirCondition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RentalTransferDayWiseItinerary.airCondition</code> attribute. 
	 * @return the airCondition - Air condition
	 */
	public boolean isAirConditionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAirCondition( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RentalTransferDayWiseItinerary.airCondition</code> attribute. 
	 * @return the airCondition - Air condition
	 */
	public boolean isAirConditionAsPrimitive()
	{
		return isAirConditionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RentalTransferDayWiseItinerary.airCondition</code> attribute. 
	 * @param value the airCondition - Air condition
	 */
	public void setAirCondition(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AIRCONDITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RentalTransferDayWiseItinerary.airCondition</code> attribute. 
	 * @param value the airCondition - Air condition
	 */
	public void setAirCondition(final Boolean value)
	{
		setAirCondition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RentalTransferDayWiseItinerary.airCondition</code> attribute. 
	 * @param value the airCondition - Air condition
	 */
	public void setAirCondition(final SessionContext ctx, final boolean value)
	{
		setAirCondition( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RentalTransferDayWiseItinerary.airCondition</code> attribute. 
	 * @param value the airCondition - Air condition
	 */
	public void setAirCondition(final boolean value)
	{
		setAirCondition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RentalTransferDayWiseItinerary.vehicleCategory</code> attribute.
	 * @return the vehicleCategory - Vehicle category
	 */
	public Category getVehicleCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, VEHICLECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RentalTransferDayWiseItinerary.vehicleCategory</code> attribute.
	 * @return the vehicleCategory - Vehicle category
	 */
	public Category getVehicleCategory()
	{
		return getVehicleCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RentalTransferDayWiseItinerary.vehicleCategory</code> attribute. 
	 * @param value the vehicleCategory - Vehicle category
	 */
	public void setVehicleCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, VEHICLECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RentalTransferDayWiseItinerary.vehicleCategory</code> attribute. 
	 * @param value the vehicleCategory - Vehicle category
	 */
	public void setVehicleCategory(final Category value)
	{
		setVehicleCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RentalTransferDayWiseItinerary.vehicleName</code> attribute.
	 * @return the vehicleName - Vehicle name
	 */
	public Vehicle getVehicleName(final SessionContext ctx)
	{
		return (Vehicle)getProperty( ctx, VEHICLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RentalTransferDayWiseItinerary.vehicleName</code> attribute.
	 * @return the vehicleName - Vehicle name
	 */
	public Vehicle getVehicleName()
	{
		return getVehicleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RentalTransferDayWiseItinerary.vehicleName</code> attribute. 
	 * @param value the vehicleName - Vehicle name
	 */
	public void setVehicleName(final SessionContext ctx, final Vehicle value)
	{
		setProperty(ctx, VEHICLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RentalTransferDayWiseItinerary.vehicleName</code> attribute. 
	 * @param value the vehicleName - Vehicle name
	 */
	public void setVehicleName(final Vehicle value)
	{
		setVehicleName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RentalTransferDayWiseItinerary.withChuffer</code> attribute.
	 * @return the withChuffer - With chuffer
	 */
	public Boolean isWithChuffer(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, WITHCHUFFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RentalTransferDayWiseItinerary.withChuffer</code> attribute.
	 * @return the withChuffer - With chuffer
	 */
	public Boolean isWithChuffer()
	{
		return isWithChuffer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RentalTransferDayWiseItinerary.withChuffer</code> attribute. 
	 * @return the withChuffer - With chuffer
	 */
	public boolean isWithChufferAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isWithChuffer( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RentalTransferDayWiseItinerary.withChuffer</code> attribute. 
	 * @return the withChuffer - With chuffer
	 */
	public boolean isWithChufferAsPrimitive()
	{
		return isWithChufferAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RentalTransferDayWiseItinerary.withChuffer</code> attribute. 
	 * @param value the withChuffer - With chuffer
	 */
	public void setWithChuffer(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, WITHCHUFFER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RentalTransferDayWiseItinerary.withChuffer</code> attribute. 
	 * @param value the withChuffer - With chuffer
	 */
	public void setWithChuffer(final Boolean value)
	{
		setWithChuffer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RentalTransferDayWiseItinerary.withChuffer</code> attribute. 
	 * @param value the withChuffer - With chuffer
	 */
	public void setWithChuffer(final SessionContext ctx, final boolean value)
	{
		setWithChuffer( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RentalTransferDayWiseItinerary.withChuffer</code> attribute. 
	 * @param value the withChuffer - With chuffer
	 */
	public void setWithChuffer(final boolean value)
	{
		setWithChuffer( getSession().getSessionContext(), value );
	}
	
}
