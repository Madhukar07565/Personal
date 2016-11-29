/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.vehicleupgrade.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.transportationoffers.jalo.TransportationOffers;
import com.cnk.travelogix.product.transport.masters.core.jalo.Vehicle;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.vehicleupgrade.jalo.VehicleUpgrade VehicleUpgrade}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVehicleUpgrade extends GenericItem
{
	/** Qualifier of the <code>VehicleUpgrade.upgradeFrom</code> attribute **/
	public static final String UPGRADEFROM = "upgradeFrom";
	/** Qualifier of the <code>VehicleUpgrade.upgradeTo</code> attribute **/
	public static final String UPGRADETO = "upgradeTo";
	/** Qualifier of the <code>VehicleUpgrade.transportationOffers</code> attribute **/
	public static final String TRANSPORTATIONOFFERS = "transportationOffers";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRANSPORTATIONOFFERS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedVehicleUpgrade> TRANSPORTATIONOFFERSHANDLER = new BidirectionalOneToManyHandler<GeneratedVehicleUpgrade>(
	SupplierratedefinitionstransportConstants.TC.VEHICLEUPGRADE,
	false,
	"transportationOffers",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UPGRADEFROM, AttributeMode.INITIAL);
		tmp.put(UPGRADETO, AttributeMode.INITIAL);
		tmp.put(TRANSPORTATIONOFFERS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRANSPORTATIONOFFERSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleUpgrade.transportationOffers</code> attribute.
	 * @return the transportationOffers
	 */
	public TransportationOffers getTransportationOffers(final SessionContext ctx)
	{
		return (TransportationOffers)getProperty( ctx, TRANSPORTATIONOFFERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleUpgrade.transportationOffers</code> attribute.
	 * @return the transportationOffers
	 */
	public TransportationOffers getTransportationOffers()
	{
		return getTransportationOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleUpgrade.transportationOffers</code> attribute. 
	 * @param value the transportationOffers
	 */
	public void setTransportationOffers(final SessionContext ctx, final TransportationOffers value)
	{
		TRANSPORTATIONOFFERSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleUpgrade.transportationOffers</code> attribute. 
	 * @param value the transportationOffers
	 */
	public void setTransportationOffers(final TransportationOffers value)
	{
		setTransportationOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleUpgrade.upgradeFrom</code> attribute.
	 * @return the upgradeFrom
	 */
	public Vehicle getUpgradeFrom(final SessionContext ctx)
	{
		return (Vehicle)getProperty( ctx, UPGRADEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleUpgrade.upgradeFrom</code> attribute.
	 * @return the upgradeFrom
	 */
	public Vehicle getUpgradeFrom()
	{
		return getUpgradeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleUpgrade.upgradeFrom</code> attribute. 
	 * @param value the upgradeFrom
	 */
	public void setUpgradeFrom(final SessionContext ctx, final Vehicle value)
	{
		setProperty(ctx, UPGRADEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleUpgrade.upgradeFrom</code> attribute. 
	 * @param value the upgradeFrom
	 */
	public void setUpgradeFrom(final Vehicle value)
	{
		setUpgradeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleUpgrade.upgradeTo</code> attribute.
	 * @return the upgradeTo
	 */
	public Vehicle getUpgradeTo(final SessionContext ctx)
	{
		return (Vehicle)getProperty( ctx, UPGRADETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleUpgrade.upgradeTo</code> attribute.
	 * @return the upgradeTo
	 */
	public Vehicle getUpgradeTo()
	{
		return getUpgradeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleUpgrade.upgradeTo</code> attribute. 
	 * @param value the upgradeTo
	 */
	public void setUpgradeTo(final SessionContext ctx, final Vehicle value)
	{
		setProperty(ctx, UPGRADETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleUpgrade.upgradeTo</code> attribute. 
	 * @param value the upgradeTo
	 */
	public void setUpgradeTo(final Vehicle value)
	{
		setUpgradeTo( getSession().getSessionContext(), value );
	}
	
}
