/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.activity.inventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityInventoryDefinition;
import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory;
import de.hybris.platform.jalo.GenericItem;
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
 * Generated class for type {@link com.cnk.travelogix.activity.inventory.core.jalo.AbstractActivityCompanySpecificInventory AbstractActivityCompanySpecificInventory}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractActivityCompanySpecificInventory extends GenericItem
{
	/** Qualifier of the <code>AbstractActivityCompanySpecificInventory.stopSales</code> attribute **/
	public static final String STOPSALES = "stopSales";
	/** Qualifier of the <code>AbstractActivityCompanySpecificInventory.liabilityOnUtilization</code> attribute **/
	public static final String LIABILITYONUTILIZATION = "liabilityOnUtilization";
	/** Qualifier of the <code>AbstractActivityCompanySpecificInventory.inventoryAssociations</code> attribute **/
	public static final String INVENTORYASSOCIATIONS = "inventoryAssociations";
	/** Qualifier of the <code>AbstractActivityCompanySpecificInventory.activityInventoryDefinition</code> attribute **/
	public static final String ACTIVITYINVENTORYDEFINITION = "activityInventoryDefinition";
	/**
	* {@link OneToManyHandler} for handling 1:n INVENTORYASSOCIATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AssociateInventory> INVENTORYASSOCIATIONSHANDLER = new OneToManyHandler<AssociateInventory>(
	CommoninventorycoreConstants.TC.ASSOCIATEINVENTORY,
	false,
	"abstractActivityCompanySpecificInventory",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYINVENTORYDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAbstractActivityCompanySpecificInventory> ACTIVITYINVENTORYDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAbstractActivityCompanySpecificInventory>(
	ActivityinventorycoreConstants.TC.ABSTRACTACTIVITYCOMPANYSPECIFICINVENTORY,
	false,
	"activityInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(STOPSALES, AttributeMode.INITIAL);
		tmp.put(LIABILITYONUTILIZATION, AttributeMode.INITIAL);
		tmp.put(ACTIVITYINVENTORYDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityCompanySpecificInventory.activityInventoryDefinition</code> attribute.
	 * @return the activityInventoryDefinition
	 */
	public ActivityInventoryDefinition getActivityInventoryDefinition(final SessionContext ctx)
	{
		return (ActivityInventoryDefinition)getProperty( ctx, ACTIVITYINVENTORYDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityCompanySpecificInventory.activityInventoryDefinition</code> attribute.
	 * @return the activityInventoryDefinition
	 */
	public ActivityInventoryDefinition getActivityInventoryDefinition()
	{
		return getActivityInventoryDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityCompanySpecificInventory.activityInventoryDefinition</code> attribute. 
	 * @param value the activityInventoryDefinition
	 */
	public void setActivityInventoryDefinition(final SessionContext ctx, final ActivityInventoryDefinition value)
	{
		ACTIVITYINVENTORYDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityCompanySpecificInventory.activityInventoryDefinition</code> attribute. 
	 * @param value the activityInventoryDefinition
	 */
	public void setActivityInventoryDefinition(final ActivityInventoryDefinition value)
	{
		setActivityInventoryDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYINVENTORYDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityCompanySpecificInventory.inventoryAssociations</code> attribute.
	 * @return the inventoryAssociations
	 */
	public Collection<AssociateInventory> getInventoryAssociations(final SessionContext ctx)
	{
		return INVENTORYASSOCIATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityCompanySpecificInventory.inventoryAssociations</code> attribute.
	 * @return the inventoryAssociations
	 */
	public Collection<AssociateInventory> getInventoryAssociations()
	{
		return getInventoryAssociations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityCompanySpecificInventory.inventoryAssociations</code> attribute. 
	 * @param value the inventoryAssociations
	 */
	public void setInventoryAssociations(final SessionContext ctx, final Collection<AssociateInventory> value)
	{
		INVENTORYASSOCIATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityCompanySpecificInventory.inventoryAssociations</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityCompanySpecificInventory.liabilityOnUtilization</code> attribute.
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public Double getLiabilityOnUtilization(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, LIABILITYONUTILIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityCompanySpecificInventory.liabilityOnUtilization</code> attribute.
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public Double getLiabilityOnUtilization()
	{
		return getLiabilityOnUtilization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public double getLiabilityOnUtilizationAsPrimitive(final SessionContext ctx)
	{
		Double value = getLiabilityOnUtilization( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public double getLiabilityOnUtilizationAsPrimitive()
	{
		return getLiabilityOnUtilizationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, LIABILITYONUTILIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final Double value)
	{
		setLiabilityOnUtilization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final SessionContext ctx, final double value)
	{
		setLiabilityOnUtilization( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final double value)
	{
		setLiabilityOnUtilization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityCompanySpecificInventory.stopSales</code> attribute.
	 * @return the stopSales - Stop Sales
	 */
	public Boolean isStopSales(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, STOPSALES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityCompanySpecificInventory.stopSales</code> attribute.
	 * @return the stopSales - Stop Sales
	 */
	public Boolean isStopSales()
	{
		return isStopSales( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityCompanySpecificInventory.stopSales</code> attribute. 
	 * @return the stopSales - Stop Sales
	 */
	public boolean isStopSalesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isStopSales( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractActivityCompanySpecificInventory.stopSales</code> attribute. 
	 * @return the stopSales - Stop Sales
	 */
	public boolean isStopSalesAsPrimitive()
	{
		return isStopSalesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, STOPSALES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final Boolean value)
	{
		setStopSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final SessionContext ctx, final boolean value)
	{
		setStopSales( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractActivityCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final boolean value)
	{
		setStopSales( getSession().getSessionContext(), value );
	}
	
}
