/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.transport;

import com.cnk.travelogix.product.transport.masters.core.jalo.Vehicle;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.config.jalo.AbstractAdvDefConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.transport.TransportSupplierAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.transport.VehicleConfig VehicleConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVehicleConfig extends AbstractAdvDefConfig
{
	/** Qualifier of the <code>VehicleConfig.sippCode</code> attribute **/
	public static final String SIPPCODE = "sippCode";
	/** Qualifier of the <code>VehicleConfig.vehicleCategory</code> attribute **/
	public static final String VEHICLECATEGORY = "vehicleCategory";
	/** Qualifier of the <code>VehicleConfig.vehicleName</code> attribute **/
	public static final String VEHICLENAME = "vehicleName";
	/** Qualifier of the <code>VehicleConfig.advanceDefinition</code> attribute **/
	public static final String ADVANCEDEFINITION = "advanceDefinition";
	/**
	* {@link OneToManyHandler} for handling 1:n ADVANCEDEFINITION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TransportSupplierAdvanceDefinition> ADVANCEDEFINITIONHANDLER = new OneToManyHandler<TransportSupplierAdvanceDefinition>(
	SuppliercommercialscoreConstants.TC.TRANSPORTSUPPLIERADVANCEDEFINITION,
	false,
	"vehicles",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAdvDefConfig.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SIPPCODE, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>VehicleConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public Collection<TransportSupplierAdvanceDefinition> getAdvanceDefinition(final SessionContext ctx)
	{
		return ADVANCEDEFINITIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public Collection<TransportSupplierAdvanceDefinition> getAdvanceDefinition()
	{
		return getAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final Collection<TransportSupplierAdvanceDefinition> value)
	{
		ADVANCEDEFINITIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final Collection<TransportSupplierAdvanceDefinition> value)
	{
		setAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advanceDefinition. 
	 * @param value the item to add to advanceDefinition
	 */
	public void addToAdvanceDefinition(final SessionContext ctx, final TransportSupplierAdvanceDefinition value)
	{
		ADVANCEDEFINITIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advanceDefinition. 
	 * @param value the item to add to advanceDefinition
	 */
	public void addToAdvanceDefinition(final TransportSupplierAdvanceDefinition value)
	{
		addToAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advanceDefinition. 
	 * @param value the item to remove from advanceDefinition
	 */
	public void removeFromAdvanceDefinition(final SessionContext ctx, final TransportSupplierAdvanceDefinition value)
	{
		ADVANCEDEFINITIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advanceDefinition. 
	 * @param value the item to remove from advanceDefinition
	 */
	public void removeFromAdvanceDefinition(final TransportSupplierAdvanceDefinition value)
	{
		removeFromAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleConfig.sippCode</code> attribute.
	 * @return the sippCode - Defines the SIPPCode
	 */
	public EnumerationValue getSippCode(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SIPPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleConfig.sippCode</code> attribute.
	 * @return the sippCode - Defines the SIPPCode
	 */
	public EnumerationValue getSippCode()
	{
		return getSippCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleConfig.sippCode</code> attribute. 
	 * @param value the sippCode - Defines the SIPPCode
	 */
	public void setSippCode(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SIPPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleConfig.sippCode</code> attribute. 
	 * @param value the sippCode - Defines the SIPPCode
	 */
	public void setSippCode(final EnumerationValue value)
	{
		setSippCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleConfig.vehicleCategory</code> attribute.
	 * @return the vehicleCategory
	 */
	public EnumerationValue getVehicleCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VEHICLECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleConfig.vehicleCategory</code> attribute.
	 * @return the vehicleCategory
	 */
	public EnumerationValue getVehicleCategory()
	{
		return getVehicleCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleConfig.vehicleCategory</code> attribute. 
	 * @param value the vehicleCategory
	 */
	public void setVehicleCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VEHICLECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleConfig.vehicleCategory</code> attribute. 
	 * @param value the vehicleCategory
	 */
	public void setVehicleCategory(final EnumerationValue value)
	{
		setVehicleCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleConfig.vehicleName</code> attribute.
	 * @return the vehicleName
	 */
	public Vehicle getVehicleName(final SessionContext ctx)
	{
		return (Vehicle)getProperty( ctx, VEHICLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleConfig.vehicleName</code> attribute.
	 * @return the vehicleName
	 */
	public Vehicle getVehicleName()
	{
		return getVehicleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleConfig.vehicleName</code> attribute. 
	 * @param value the vehicleName
	 */
	public void setVehicleName(final SessionContext ctx, final Vehicle value)
	{
		setProperty(ctx, VEHICLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleConfig.vehicleName</code> attribute. 
	 * @param value the vehicleName
	 */
	public void setVehicleName(final Vehicle value)
	{
		setVehicleName( getSession().getSessionContext(), value );
	}
	
}
