/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.carGroupupgrade.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.transportationoffers.jalo.TransportationOffers;
import com.cnk.travelogix.masterdata.core.products.jalo.CarGroup;
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
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.carGroupupgrade.jalo.CarGroupUpgrade CarGroupUpgrade}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCarGroupUpgrade extends GenericItem
{
	/** Qualifier of the <code>CarGroupUpgrade.upgradeFrom</code> attribute **/
	public static final String UPGRADEFROM = "upgradeFrom";
	/** Qualifier of the <code>CarGroupUpgrade.upgradeTo</code> attribute **/
	public static final String UPGRADETO = "upgradeTo";
	/** Qualifier of the <code>CarGroupUpgrade.transportationOffers</code> attribute **/
	public static final String TRANSPORTATIONOFFERS = "transportationOffers";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRANSPORTATIONOFFERS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCarGroupUpgrade> TRANSPORTATIONOFFERSHANDLER = new BidirectionalOneToManyHandler<GeneratedCarGroupUpgrade>(
	SupplierratedefinitionstransportConstants.TC.CARGROUPUPGRADE,
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
	 * <i>Generated method</i> - Getter of the <code>CarGroupUpgrade.transportationOffers</code> attribute.
	 * @return the transportationOffers
	 */
	public TransportationOffers getTransportationOffers(final SessionContext ctx)
	{
		return (TransportationOffers)getProperty( ctx, TRANSPORTATIONOFFERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarGroupUpgrade.transportationOffers</code> attribute.
	 * @return the transportationOffers
	 */
	public TransportationOffers getTransportationOffers()
	{
		return getTransportationOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarGroupUpgrade.transportationOffers</code> attribute. 
	 * @param value the transportationOffers
	 */
	public void setTransportationOffers(final SessionContext ctx, final TransportationOffers value)
	{
		TRANSPORTATIONOFFERSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarGroupUpgrade.transportationOffers</code> attribute. 
	 * @param value the transportationOffers
	 */
	public void setTransportationOffers(final TransportationOffers value)
	{
		setTransportationOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarGroupUpgrade.upgradeFrom</code> attribute.
	 * @return the upgradeFrom
	 */
	public CarGroup getUpgradeFrom(final SessionContext ctx)
	{
		return (CarGroup)getProperty( ctx, UPGRADEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarGroupUpgrade.upgradeFrom</code> attribute.
	 * @return the upgradeFrom
	 */
	public CarGroup getUpgradeFrom()
	{
		return getUpgradeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarGroupUpgrade.upgradeFrom</code> attribute. 
	 * @param value the upgradeFrom
	 */
	public void setUpgradeFrom(final SessionContext ctx, final CarGroup value)
	{
		setProperty(ctx, UPGRADEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarGroupUpgrade.upgradeFrom</code> attribute. 
	 * @param value the upgradeFrom
	 */
	public void setUpgradeFrom(final CarGroup value)
	{
		setUpgradeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarGroupUpgrade.upgradeTo</code> attribute.
	 * @return the upgradeTo
	 */
	public CarGroup getUpgradeTo(final SessionContext ctx)
	{
		return (CarGroup)getProperty( ctx, UPGRADETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarGroupUpgrade.upgradeTo</code> attribute.
	 * @return the upgradeTo
	 */
	public CarGroup getUpgradeTo()
	{
		return getUpgradeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarGroupUpgrade.upgradeTo</code> attribute. 
	 * @param value the upgradeTo
	 */
	public void setUpgradeTo(final SessionContext ctx, final CarGroup value)
	{
		setProperty(ctx, UPGRADETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarGroupUpgrade.upgradeTo</code> attribute. 
	 * @param value the upgradeTo
	 */
	public void setUpgradeTo(final CarGroup value)
	{
		setUpgradeTo( getSession().getSessionContext(), value );
	}
	
}
