/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.Vehicle;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.RoomDetailsforExeCruise RoomDetailsforExeCruise}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRoomDetailsforExeCruise extends GenericItem
{
	/** Qualifier of the <code>RoomDetailsforExeCruise.vehicleCategory</code> attribute **/
	public static final String VEHICLECATEGORY = "vehicleCategory";
	/** Qualifier of the <code>RoomDetailsforExeCruise.vehicleName</code> attribute **/
	public static final String VEHICLENAME = "vehicleName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(VEHICLECATEGORY, AttributeMode.INITIAL);
		tmp.put(VEHICLENAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforExeCruise.vehicleCategory</code> attribute.
	 * @return the vehicleCategory - Company Policy Vehicle Category
	 */
	public EnumerationValue getVehicleCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VEHICLECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforExeCruise.vehicleCategory</code> attribute.
	 * @return the vehicleCategory - Company Policy Vehicle Category
	 */
	public EnumerationValue getVehicleCategory()
	{
		return getVehicleCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforExeCruise.vehicleCategory</code> attribute. 
	 * @param value the vehicleCategory - Company Policy Vehicle Category
	 */
	public void setVehicleCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VEHICLECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforExeCruise.vehicleCategory</code> attribute. 
	 * @param value the vehicleCategory - Company Policy Vehicle Category
	 */
	public void setVehicleCategory(final EnumerationValue value)
	{
		setVehicleCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforExeCruise.vehicleName</code> attribute.
	 * @return the vehicleName - Company Policy Vehicle Name
	 */
	public Vehicle getVehicleName(final SessionContext ctx)
	{
		return (Vehicle)getProperty( ctx, VEHICLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomDetailsforExeCruise.vehicleName</code> attribute.
	 * @return the vehicleName - Company Policy Vehicle Name
	 */
	public Vehicle getVehicleName()
	{
		return getVehicleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforExeCruise.vehicleName</code> attribute. 
	 * @param value the vehicleName - Company Policy Vehicle Name
	 */
	public void setVehicleName(final SessionContext ctx, final Vehicle value)
	{
		setProperty(ctx, VEHICLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomDetailsforExeCruise.vehicleName</code> attribute. 
	 * @param value the vehicleName - Company Policy Vehicle Name
	 */
	public void setVehicleName(final Vehicle value)
	{
		setVehicleName( getSession().getSessionContext(), value );
	}
	
}
