/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseInventoryDefinition;
import com.cnk.travelogix.transportinventory.core.jalo.AbstractCruiseInventoryDetail;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.AbstractCruiseCompanySpecificInventory AbstractCruiseCompanySpecificInventory}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractCruiseCompanySpecificInventory extends AbstractCruiseInventoryDetail
{
	/** Qualifier of the <code>AbstractCruiseCompanySpecificInventory.stopSales</code> attribute **/
	public static final String STOPSALES = "stopSales";
	/** Qualifier of the <code>AbstractCruiseCompanySpecificInventory.liabilityOnUtilization</code> attribute **/
	public static final String LIABILITYONUTILIZATION = "liabilityOnUtilization";
	/** Qualifier of the <code>AbstractCruiseCompanySpecificInventory.cruiseInventoryDef</code> attribute **/
	public static final String CRUISEINVENTORYDEF = "cruiseInventoryDef";
	/** Qualifier of the <code>AbstractCruiseCompanySpecificInventory.inventoryAssociations</code> attribute **/
	public static final String INVENTORYASSOCIATIONS = "inventoryAssociations";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRUISEINVENTORYDEF's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAbstractCruiseCompanySpecificInventory> CRUISEINVENTORYDEFHANDLER = new BidirectionalOneToManyHandler<GeneratedAbstractCruiseCompanySpecificInventory>(
	TransportinventorycoreConstants.TC.ABSTRACTCRUISECOMPANYSPECIFICINVENTORY,
	false,
	"cruiseInventoryDef",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INVENTORYASSOCIATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AssociateInventory> INVENTORYASSOCIATIONSHANDLER = new OneToManyHandler<AssociateInventory>(
	CommoninventorycoreConstants.TC.ASSOCIATEINVENTORY,
	false,
	"abstractCruiseCompanySpecificInventory",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCruiseInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STOPSALES, AttributeMode.INITIAL);
		tmp.put(LIABILITYONUTILIZATION, AttributeMode.INITIAL);
		tmp.put(CRUISEINVENTORYDEF, AttributeMode.INITIAL);
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
		CRUISEINVENTORYDEFHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseCompanySpecificInventory.cruiseInventoryDef</code> attribute.
	 * @return the cruiseInventoryDef
	 */
	public CruiseInventoryDefinition getCruiseInventoryDef(final SessionContext ctx)
	{
		return (CruiseInventoryDefinition)getProperty( ctx, CRUISEINVENTORYDEF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseCompanySpecificInventory.cruiseInventoryDef</code> attribute.
	 * @return the cruiseInventoryDef
	 */
	public CruiseInventoryDefinition getCruiseInventoryDef()
	{
		return getCruiseInventoryDef( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseCompanySpecificInventory.cruiseInventoryDef</code> attribute. 
	 * @param value the cruiseInventoryDef
	 */
	public void setCruiseInventoryDef(final SessionContext ctx, final CruiseInventoryDefinition value)
	{
		CRUISEINVENTORYDEFHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseCompanySpecificInventory.cruiseInventoryDef</code> attribute. 
	 * @param value the cruiseInventoryDef
	 */
	public void setCruiseInventoryDef(final CruiseInventoryDefinition value)
	{
		setCruiseInventoryDef( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseCompanySpecificInventory.inventoryAssociations</code> attribute.
	 * @return the inventoryAssociations
	 */
	public Collection<AssociateInventory> getInventoryAssociations(final SessionContext ctx)
	{
		return INVENTORYASSOCIATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseCompanySpecificInventory.inventoryAssociations</code> attribute.
	 * @return the inventoryAssociations
	 */
	public Collection<AssociateInventory> getInventoryAssociations()
	{
		return getInventoryAssociations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseCompanySpecificInventory.inventoryAssociations</code> attribute. 
	 * @param value the inventoryAssociations
	 */
	public void setInventoryAssociations(final SessionContext ctx, final Collection<AssociateInventory> value)
	{
		INVENTORYASSOCIATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseCompanySpecificInventory.inventoryAssociations</code> attribute. 
	 * @param value the inventoryAssociations
	 */
	public void setInventoryAssociations(final Collection<AssociateInventory> value)
	{
		setInventoryAssociations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryAssociations. 
	 * @param value the item to add to inventoryAssociations
	 */
	public void addToInventoryAssociations(final SessionContext ctx, final AssociateInventory value)
	{
		INVENTORYASSOCIATIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryAssociations. 
	 * @param value the item to add to inventoryAssociations
	 */
	public void addToInventoryAssociations(final AssociateInventory value)
	{
		addToInventoryAssociations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryAssociations. 
	 * @param value the item to remove from inventoryAssociations
	 */
	public void removeFromInventoryAssociations(final SessionContext ctx, final AssociateInventory value)
	{
		INVENTORYASSOCIATIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryAssociations. 
	 * @param value the item to remove from inventoryAssociations
	 */
	public void removeFromInventoryAssociations(final AssociateInventory value)
	{
		removeFromInventoryAssociations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseCompanySpecificInventory.liabilityOnUtilization</code> attribute.
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public Double getLiabilityOnUtilization(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, LIABILITYONUTILIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseCompanySpecificInventory.liabilityOnUtilization</code> attribute.
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public Double getLiabilityOnUtilization()
	{
		return getLiabilityOnUtilization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public double getLiabilityOnUtilizationAsPrimitive(final SessionContext ctx)
	{
		Double value = getLiabilityOnUtilization( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public double getLiabilityOnUtilizationAsPrimitive()
	{
		return getLiabilityOnUtilizationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, LIABILITYONUTILIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final Double value)
	{
		setLiabilityOnUtilization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final SessionContext ctx, final double value)
	{
		setLiabilityOnUtilization( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final double value)
	{
		setLiabilityOnUtilization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseCompanySpecificInventory.stopSales</code> attribute.
	 * @return the stopSales - Stop Sales
	 */
	public Boolean isStopSales(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, STOPSALES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseCompanySpecificInventory.stopSales</code> attribute.
	 * @return the stopSales - Stop Sales
	 */
	public Boolean isStopSales()
	{
		return isStopSales( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseCompanySpecificInventory.stopSales</code> attribute. 
	 * @return the stopSales - Stop Sales
	 */
	public boolean isStopSalesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isStopSales( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseCompanySpecificInventory.stopSales</code> attribute. 
	 * @return the stopSales - Stop Sales
	 */
	public boolean isStopSalesAsPrimitive()
	{
		return isStopSalesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, STOPSALES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final Boolean value)
	{
		setStopSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final SessionContext ctx, final boolean value)
	{
		setStopSales( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final boolean value)
	{
		setStopSales( getSession().getSessionContext(), value );
	}
	
}
