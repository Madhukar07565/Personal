/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.product.transport.masters.core.jalo.Vehicle;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.UpgradeVehicleOffer UpgradeVehicleOffer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedUpgradeVehicleOffer extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>UpgradeVehicleOffer.transferType</code> attribute **/
	public static final String TRANSFERTYPE = "transferType";
	/** Qualifier of the <code>UpgradeVehicleOffer.vehicleType</code> attribute **/
	public static final String VEHICLETYPE = "vehicleType";
	/** Qualifier of the <code>UpgradeVehicleOffer.vehicle</code> attribute **/
	public static final String VEHICLE = "vehicle";
	/** Qualifier of the <code>UpgradeVehicleOffer.airConditionedVehicle</code> attribute **/
	public static final String AIRCONDITIONEDVEHICLE = "airConditionedVehicle";
	/** Qualifier of the <code>UpgradeVehicleOffer.upgradeType</code> attribute **/
	public static final String UPGRADETYPE = "upgradeType";
	/** Qualifier of the <code>UpgradeVehicleOffer.upgradedVehicleCategory</code> attribute **/
	public static final String UPGRADEDVEHICLECATEGORY = "upgradedVehicleCategory";
	/** Qualifier of the <code>UpgradeVehicleOffer.upgradedVehicleName</code> attribute **/
	public static final String UPGRADEDVEHICLENAME = "upgradedVehicleName";
	/** Qualifier of the <code>UpgradeVehicleOffer.airConditionAfterUpgrade</code> attribute **/
	public static final String AIRCONDITIONAFTERUPGRADE = "airConditionAfterUpgrade";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TRANSFERTYPE, AttributeMode.INITIAL);
		tmp.put(VEHICLETYPE, AttributeMode.INITIAL);
		tmp.put(VEHICLE, AttributeMode.INITIAL);
		tmp.put(AIRCONDITIONEDVEHICLE, AttributeMode.INITIAL);
		tmp.put(UPGRADETYPE, AttributeMode.INITIAL);
		tmp.put(UPGRADEDVEHICLECATEGORY, AttributeMode.INITIAL);
		tmp.put(UPGRADEDVEHICLENAME, AttributeMode.INITIAL);
		tmp.put(AIRCONDITIONAFTERUPGRADE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.airConditionAfterUpgrade</code> attribute.
	 * @return the airConditionAfterUpgrade
	 */
	public Boolean isAirConditionAfterUpgrade(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AIRCONDITIONAFTERUPGRADE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.airConditionAfterUpgrade</code> attribute.
	 * @return the airConditionAfterUpgrade
	 */
	public Boolean isAirConditionAfterUpgrade()
	{
		return isAirConditionAfterUpgrade( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.airConditionAfterUpgrade</code> attribute. 
	 * @return the airConditionAfterUpgrade
	 */
	public boolean isAirConditionAfterUpgradeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAirConditionAfterUpgrade( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.airConditionAfterUpgrade</code> attribute. 
	 * @return the airConditionAfterUpgrade
	 */
	public boolean isAirConditionAfterUpgradeAsPrimitive()
	{
		return isAirConditionAfterUpgradeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.airConditionAfterUpgrade</code> attribute. 
	 * @param value the airConditionAfterUpgrade
	 */
	public void setAirConditionAfterUpgrade(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AIRCONDITIONAFTERUPGRADE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.airConditionAfterUpgrade</code> attribute. 
	 * @param value the airConditionAfterUpgrade
	 */
	public void setAirConditionAfterUpgrade(final Boolean value)
	{
		setAirConditionAfterUpgrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.airConditionAfterUpgrade</code> attribute. 
	 * @param value the airConditionAfterUpgrade
	 */
	public void setAirConditionAfterUpgrade(final SessionContext ctx, final boolean value)
	{
		setAirConditionAfterUpgrade( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.airConditionAfterUpgrade</code> attribute. 
	 * @param value the airConditionAfterUpgrade
	 */
	public void setAirConditionAfterUpgrade(final boolean value)
	{
		setAirConditionAfterUpgrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.airConditionedVehicle</code> attribute.
	 * @return the airConditionedVehicle
	 */
	public Boolean isAirConditionedVehicle(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AIRCONDITIONEDVEHICLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.airConditionedVehicle</code> attribute.
	 * @return the airConditionedVehicle
	 */
	public Boolean isAirConditionedVehicle()
	{
		return isAirConditionedVehicle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.airConditionedVehicle</code> attribute. 
	 * @return the airConditionedVehicle
	 */
	public boolean isAirConditionedVehicleAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAirConditionedVehicle( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.airConditionedVehicle</code> attribute. 
	 * @return the airConditionedVehicle
	 */
	public boolean isAirConditionedVehicleAsPrimitive()
	{
		return isAirConditionedVehicleAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.airConditionedVehicle</code> attribute. 
	 * @param value the airConditionedVehicle
	 */
	public void setAirConditionedVehicle(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AIRCONDITIONEDVEHICLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.airConditionedVehicle</code> attribute. 
	 * @param value the airConditionedVehicle
	 */
	public void setAirConditionedVehicle(final Boolean value)
	{
		setAirConditionedVehicle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.airConditionedVehicle</code> attribute. 
	 * @param value the airConditionedVehicle
	 */
	public void setAirConditionedVehicle(final SessionContext ctx, final boolean value)
	{
		setAirConditionedVehicle( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.airConditionedVehicle</code> attribute. 
	 * @param value the airConditionedVehicle
	 */
	public void setAirConditionedVehicle(final boolean value)
	{
		setAirConditionedVehicle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.transferType</code> attribute.
	 * @return the transferType
	 */
	public EnumerationValue getTransferType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TRANSFERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.transferType</code> attribute.
	 * @return the transferType
	 */
	public EnumerationValue getTransferType()
	{
		return getTransferType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.transferType</code> attribute. 
	 * @param value the transferType
	 */
	public void setTransferType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TRANSFERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.transferType</code> attribute. 
	 * @param value the transferType
	 */
	public void setTransferType(final EnumerationValue value)
	{
		setTransferType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.upgradedVehicleCategory</code> attribute.
	 * @return the upgradedVehicleCategory
	 */
	public EnumerationValue getUpgradedVehicleCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UPGRADEDVEHICLECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.upgradedVehicleCategory</code> attribute.
	 * @return the upgradedVehicleCategory
	 */
	public EnumerationValue getUpgradedVehicleCategory()
	{
		return getUpgradedVehicleCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.upgradedVehicleCategory</code> attribute. 
	 * @param value the upgradedVehicleCategory
	 */
	public void setUpgradedVehicleCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UPGRADEDVEHICLECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.upgradedVehicleCategory</code> attribute. 
	 * @param value the upgradedVehicleCategory
	 */
	public void setUpgradedVehicleCategory(final EnumerationValue value)
	{
		setUpgradedVehicleCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.upgradedVehicleName</code> attribute.
	 * @return the upgradedVehicleName
	 */
	public Vehicle getUpgradedVehicleName(final SessionContext ctx)
	{
		return (Vehicle)getProperty( ctx, UPGRADEDVEHICLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.upgradedVehicleName</code> attribute.
	 * @return the upgradedVehicleName
	 */
	public Vehicle getUpgradedVehicleName()
	{
		return getUpgradedVehicleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.upgradedVehicleName</code> attribute. 
	 * @param value the upgradedVehicleName
	 */
	public void setUpgradedVehicleName(final SessionContext ctx, final Vehicle value)
	{
		setProperty(ctx, UPGRADEDVEHICLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.upgradedVehicleName</code> attribute. 
	 * @param value the upgradedVehicleName
	 */
	public void setUpgradedVehicleName(final Vehicle value)
	{
		setUpgradedVehicleName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.upgradeType</code> attribute.
	 * @return the upgradeType
	 */
	public EnumerationValue getUpgradeType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UPGRADETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.upgradeType</code> attribute.
	 * @return the upgradeType
	 */
	public EnumerationValue getUpgradeType()
	{
		return getUpgradeType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.upgradeType</code> attribute. 
	 * @param value the upgradeType
	 */
	public void setUpgradeType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UPGRADETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.upgradeType</code> attribute. 
	 * @param value the upgradeType
	 */
	public void setUpgradeType(final EnumerationValue value)
	{
		setUpgradeType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.vehicle</code> attribute.
	 * @return the vehicle
	 */
	public Vehicle getVehicle(final SessionContext ctx)
	{
		return (Vehicle)getProperty( ctx, VEHICLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.vehicle</code> attribute.
	 * @return the vehicle
	 */
	public Vehicle getVehicle()
	{
		return getVehicle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.vehicle</code> attribute. 
	 * @param value the vehicle
	 */
	public void setVehicle(final SessionContext ctx, final Vehicle value)
	{
		setProperty(ctx, VEHICLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.vehicle</code> attribute. 
	 * @param value the vehicle
	 */
	public void setVehicle(final Vehicle value)
	{
		setVehicle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.vehicleType</code> attribute.
	 * @return the vehicleType
	 */
	public EnumerationValue getVehicleType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VEHICLETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeVehicleOffer.vehicleType</code> attribute.
	 * @return the vehicleType
	 */
	public EnumerationValue getVehicleType()
	{
		return getVehicleType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.vehicleType</code> attribute. 
	 * @param value the vehicleType
	 */
	public void setVehicleType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VEHICLETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeVehicleOffer.vehicleType</code> attribute. 
	 * @param value the vehicleType
	 */
	public void setVehicleType(final EnumerationValue value)
	{
		setVehicleType( getSession().getSessionContext(), value );
	}
	
}
