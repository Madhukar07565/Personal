/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.products.jalo.CarGroup;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.Vehicle;
import com.cnk.travelogix.supplier.masters.core.constants.SuppliermasterscoreConstants;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo.VehicleTransporationRateRestriction VehicleTransporationRateRestriction}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVehicleTransporationRateRestriction extends GenericItem
{
	/** Qualifier of the <code>VehicleTransporationRateRestriction.vehicles</code> attribute **/
	public static final String VEHICLES = "vehicles";
	/** Qualifier of the <code>VehicleTransporationRateRestriction.sippCodes</code> attribute **/
	public static final String SIPPCODES = "sippCodes";
	/** Qualifier of the <code>VehicleTransporationRateRestriction.carGroup</code> attribute **/
	public static final String CARGROUP = "carGroup";
	/**
	* {@link OneToManyHandler} for handling 1:n VEHICLES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Vehicle> VEHICLESHANDLER = new OneToManyHandler<Vehicle>(
	TransportproductmasterscoreConstants.TC.VEHICLE,
	false,
	"vehicleTransporationRateRestriction",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SIPPCODES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> SIPPCODESHANDLER = new OneToManyHandler<EnumerationValue>(
	SuppliermasterscoreConstants.TC.SIPPCODE,
	false,
	"vehicleTransporationRateRestriction",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CARGROUP's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CarGroup> CARGROUPHANDLER = new OneToManyHandler<CarGroup>(
	MasterdatacoreConstants.TC.CARGROUP,
	false,
	"vehicleTransporationRateRestriction",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleTransporationRateRestriction.carGroup</code> attribute.
	 * @return the carGroup
	 */
	public Set<CarGroup> getCarGroup(final SessionContext ctx)
	{
		return (Set<CarGroup>)CARGROUPHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleTransporationRateRestriction.carGroup</code> attribute.
	 * @return the carGroup
	 */
	public Set<CarGroup> getCarGroup()
	{
		return getCarGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleTransporationRateRestriction.carGroup</code> attribute. 
	 * @param value the carGroup
	 */
	public void setCarGroup(final SessionContext ctx, final Set<CarGroup> value)
	{
		CARGROUPHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleTransporationRateRestriction.carGroup</code> attribute. 
	 * @param value the carGroup
	 */
	public void setCarGroup(final Set<CarGroup> value)
	{
		setCarGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to carGroup. 
	 * @param value the item to add to carGroup
	 */
	public void addToCarGroup(final SessionContext ctx, final CarGroup value)
	{
		CARGROUPHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to carGroup. 
	 * @param value the item to add to carGroup
	 */
	public void addToCarGroup(final CarGroup value)
	{
		addToCarGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from carGroup. 
	 * @param value the item to remove from carGroup
	 */
	public void removeFromCarGroup(final SessionContext ctx, final CarGroup value)
	{
		CARGROUPHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from carGroup. 
	 * @param value the item to remove from carGroup
	 */
	public void removeFromCarGroup(final CarGroup value)
	{
		removeFromCarGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleTransporationRateRestriction.sippCodes</code> attribute.
	 * @return the sippCodes
	 */
	public Set<EnumerationValue> getSippCodes(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)SIPPCODESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleTransporationRateRestriction.sippCodes</code> attribute.
	 * @return the sippCodes
	 */
	public Set<EnumerationValue> getSippCodes()
	{
		return getSippCodes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleTransporationRateRestriction.sippCodes</code> attribute. 
	 * @param value the sippCodes
	 */
	public void setSippCodes(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		SIPPCODESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleTransporationRateRestriction.sippCodes</code> attribute. 
	 * @param value the sippCodes
	 */
	public void setSippCodes(final Set<EnumerationValue> value)
	{
		setSippCodes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sippCodes. 
	 * @param value the item to add to sippCodes
	 */
	public void addToSippCodes(final SessionContext ctx, final EnumerationValue value)
	{
		SIPPCODESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sippCodes. 
	 * @param value the item to add to sippCodes
	 */
	public void addToSippCodes(final EnumerationValue value)
	{
		addToSippCodes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sippCodes. 
	 * @param value the item to remove from sippCodes
	 */
	public void removeFromSippCodes(final SessionContext ctx, final EnumerationValue value)
	{
		SIPPCODESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sippCodes. 
	 * @param value the item to remove from sippCodes
	 */
	public void removeFromSippCodes(final EnumerationValue value)
	{
		removeFromSippCodes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleTransporationRateRestriction.vehicles</code> attribute.
	 * @return the vehicles
	 */
	public Set<Vehicle> getVehicles(final SessionContext ctx)
	{
		return (Set<Vehicle>)VEHICLESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleTransporationRateRestriction.vehicles</code> attribute.
	 * @return the vehicles
	 */
	public Set<Vehicle> getVehicles()
	{
		return getVehicles( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleTransporationRateRestriction.vehicles</code> attribute. 
	 * @param value the vehicles
	 */
	public void setVehicles(final SessionContext ctx, final Set<Vehicle> value)
	{
		VEHICLESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleTransporationRateRestriction.vehicles</code> attribute. 
	 * @param value the vehicles
	 */
	public void setVehicles(final Set<Vehicle> value)
	{
		setVehicles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicles. 
	 * @param value the item to add to vehicles
	 */
	public void addToVehicles(final SessionContext ctx, final Vehicle value)
	{
		VEHICLESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicles. 
	 * @param value the item to add to vehicles
	 */
	public void addToVehicles(final Vehicle value)
	{
		addToVehicles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicles. 
	 * @param value the item to remove from vehicles
	 */
	public void removeFromVehicles(final SessionContext ctx, final Vehicle value)
	{
		VEHICLESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicles. 
	 * @param value the item to remove from vehicles
	 */
	public void removeFromVehicles(final Vehicle value)
	{
		removeFromVehicles( getSession().getSessionContext(), value );
	}
	
}
