/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AirInvSupplierAdvanceDefinition;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.price.Tax;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.UpgradeCharges UpgradeCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedUpgradeCharges extends GenericItem
{
	/** Qualifier of the <code>UpgradeCharges.systemFare</code> attribute **/
	public static final String SYSTEMFARE = "systemFare";
	/** Qualifier of the <code>UpgradeCharges.fareBasis</code> attribute **/
	public static final String FAREBASIS = "fareBasis";
	/** Qualifier of the <code>UpgradeCharges.netFareperPax</code> attribute **/
	public static final String NETFAREPERPAX = "netFareperPax";
	/** Qualifier of the <code>UpgradeCharges.fareChargesAppliedToInventoryUtilization</code> attribute **/
	public static final String FARECHARGESAPPLIEDTOINVENTORYUTILIZATION = "fareChargesAppliedToInventoryUtilization";
	/** Qualifier of the <code>UpgradeCharges.airInventorySupplierAdvanceDefinition</code> attribute **/
	public static final String AIRINVENTORYSUPPLIERADVANCEDEFINITION = "airInventorySupplierAdvanceDefinition";
	/** Qualifier of the <code>UpgradeCharges.taxDetails</code> attribute **/
	public static final String TAXDETAILS = "taxDetails";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRINVENTORYSUPPLIERADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedUpgradeCharges> AIRINVENTORYSUPPLIERADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedUpgradeCharges>(
	TransportinventorycoreConstants.TC.UPGRADECHARGES,
	false,
	"airInventorySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TAXDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Tax> TAXDETAILSHANDLER = new OneToManyHandler<Tax>(
	CoreConstants.TC.TAX,
	true,
	"upgradeCharges",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SYSTEMFARE, AttributeMode.INITIAL);
		tmp.put(FAREBASIS, AttributeMode.INITIAL);
		tmp.put(NETFAREPERPAX, AttributeMode.INITIAL);
		tmp.put(FARECHARGESAPPLIEDTOINVENTORYUTILIZATION, AttributeMode.INITIAL);
		tmp.put(AIRINVENTORYSUPPLIERADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public AirInvSupplierAdvanceDefinition getAirInventorySupplierAdvanceDefinition(final SessionContext ctx)
	{
		return (AirInvSupplierAdvanceDefinition)getProperty( ctx, AIRINVENTORYSUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public AirInvSupplierAdvanceDefinition getAirInventorySupplierAdvanceDefinition()
	{
		return getAirInventorySupplierAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final SessionContext ctx, final AirInvSupplierAdvanceDefinition value)
	{
		AIRINVENTORYSUPPLIERADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final AirInvSupplierAdvanceDefinition value)
	{
		setAirInventorySupplierAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		AIRINVENTORYSUPPLIERADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.fareBasis</code> attribute.
	 * @return the fareBasis - Fare basis
	 */
	public String getFareBasis(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAREBASIS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.fareBasis</code> attribute.
	 * @return the fareBasis - Fare basis
	 */
	public String getFareBasis()
	{
		return getFareBasis( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.fareBasis</code> attribute. 
	 * @param value the fareBasis - Fare basis
	 */
	public void setFareBasis(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAREBASIS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.fareBasis</code> attribute. 
	 * @param value the fareBasis - Fare basis
	 */
	public void setFareBasis(final String value)
	{
		setFareBasis( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.fareChargesAppliedToInventoryUtilization</code> attribute.
	 * @return the fareChargesAppliedToInventoryUtilization - fareChargesAppliedToInventoryUtilization
	 */
	public Boolean isFareChargesAppliedToInventoryUtilization(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FARECHARGESAPPLIEDTOINVENTORYUTILIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.fareChargesAppliedToInventoryUtilization</code> attribute.
	 * @return the fareChargesAppliedToInventoryUtilization - fareChargesAppliedToInventoryUtilization
	 */
	public Boolean isFareChargesAppliedToInventoryUtilization()
	{
		return isFareChargesAppliedToInventoryUtilization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @return the fareChargesAppliedToInventoryUtilization - fareChargesAppliedToInventoryUtilization
	 */
	public boolean isFareChargesAppliedToInventoryUtilizationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFareChargesAppliedToInventoryUtilization( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @return the fareChargesAppliedToInventoryUtilization - fareChargesAppliedToInventoryUtilization
	 */
	public boolean isFareChargesAppliedToInventoryUtilizationAsPrimitive()
	{
		return isFareChargesAppliedToInventoryUtilizationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @param value the fareChargesAppliedToInventoryUtilization - fareChargesAppliedToInventoryUtilization
	 */
	public void setFareChargesAppliedToInventoryUtilization(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FARECHARGESAPPLIEDTOINVENTORYUTILIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @param value the fareChargesAppliedToInventoryUtilization - fareChargesAppliedToInventoryUtilization
	 */
	public void setFareChargesAppliedToInventoryUtilization(final Boolean value)
	{
		setFareChargesAppliedToInventoryUtilization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @param value the fareChargesAppliedToInventoryUtilization - fareChargesAppliedToInventoryUtilization
	 */
	public void setFareChargesAppliedToInventoryUtilization(final SessionContext ctx, final boolean value)
	{
		setFareChargesAppliedToInventoryUtilization( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @param value the fareChargesAppliedToInventoryUtilization - fareChargesAppliedToInventoryUtilization
	 */
	public void setFareChargesAppliedToInventoryUtilization(final boolean value)
	{
		setFareChargesAppliedToInventoryUtilization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.netFareperPax</code> attribute.
	 * @return the netFareperPax - Net fare per Pax
	 */
	public Double getNetFareperPax(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, NETFAREPERPAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.netFareperPax</code> attribute.
	 * @return the netFareperPax - Net fare per Pax
	 */
	public Double getNetFareperPax()
	{
		return getNetFareperPax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.netFareperPax</code> attribute. 
	 * @return the netFareperPax - Net fare per Pax
	 */
	public double getNetFareperPaxAsPrimitive(final SessionContext ctx)
	{
		Double value = getNetFareperPax( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.netFareperPax</code> attribute. 
	 * @return the netFareperPax - Net fare per Pax
	 */
	public double getNetFareperPaxAsPrimitive()
	{
		return getNetFareperPaxAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.netFareperPax</code> attribute. 
	 * @param value the netFareperPax - Net fare per Pax
	 */
	public void setNetFareperPax(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, NETFAREPERPAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.netFareperPax</code> attribute. 
	 * @param value the netFareperPax - Net fare per Pax
	 */
	public void setNetFareperPax(final Double value)
	{
		setNetFareperPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.netFareperPax</code> attribute. 
	 * @param value the netFareperPax - Net fare per Pax
	 */
	public void setNetFareperPax(final SessionContext ctx, final double value)
	{
		setNetFareperPax( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.netFareperPax</code> attribute. 
	 * @param value the netFareperPax - Net fare per Pax
	 */
	public void setNetFareperPax(final double value)
	{
		setNetFareperPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.systemFare</code> attribute.
	 * @return the systemFare - System fare
	 */
	public Boolean isSystemFare(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SYSTEMFARE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.systemFare</code> attribute.
	 * @return the systemFare - System fare
	 */
	public Boolean isSystemFare()
	{
		return isSystemFare( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.systemFare</code> attribute. 
	 * @return the systemFare - System fare
	 */
	public boolean isSystemFareAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSystemFare( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.systemFare</code> attribute. 
	 * @return the systemFare - System fare
	 */
	public boolean isSystemFareAsPrimitive()
	{
		return isSystemFareAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.systemFare</code> attribute. 
	 * @param value the systemFare - System fare
	 */
	public void setSystemFare(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SYSTEMFARE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.systemFare</code> attribute. 
	 * @param value the systemFare - System fare
	 */
	public void setSystemFare(final Boolean value)
	{
		setSystemFare( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.systemFare</code> attribute. 
	 * @param value the systemFare - System fare
	 */
	public void setSystemFare(final SessionContext ctx, final boolean value)
	{
		setSystemFare( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.systemFare</code> attribute. 
	 * @param value the systemFare - System fare
	 */
	public void setSystemFare(final boolean value)
	{
		setSystemFare( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.taxDetails</code> attribute.
	 * @return the taxDetails
	 */
	public Collection<Tax> getTaxDetails(final SessionContext ctx)
	{
		return TAXDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeCharges.taxDetails</code> attribute.
	 * @return the taxDetails
	 */
	public Collection<Tax> getTaxDetails()
	{
		return getTaxDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.taxDetails</code> attribute. 
	 * @param value the taxDetails
	 */
	public void setTaxDetails(final SessionContext ctx, final Collection<Tax> value)
	{
		TAXDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeCharges.taxDetails</code> attribute. 
	 * @param value the taxDetails
	 */
	public void setTaxDetails(final Collection<Tax> value)
	{
		setTaxDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxDetails. 
	 * @param value the item to add to taxDetails
	 */
	public void addToTaxDetails(final SessionContext ctx, final Tax value)
	{
		TAXDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxDetails. 
	 * @param value the item to add to taxDetails
	 */
	public void addToTaxDetails(final Tax value)
	{
		addToTaxDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxDetails. 
	 * @param value the item to remove from taxDetails
	 */
	public void removeFromTaxDetails(final SessionContext ctx, final Tax value)
	{
		TAXDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxDetails. 
	 * @param value the item to remove from taxDetails
	 */
	public void removeFromTaxDetails(final Tax value)
	{
		removeFromTaxDetails( getSession().getSessionContext(), value );
	}
	
}
