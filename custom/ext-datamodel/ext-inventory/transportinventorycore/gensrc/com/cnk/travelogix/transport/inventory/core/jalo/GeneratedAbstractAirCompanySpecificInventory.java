/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.jalo.AirAssociateInventory;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AirInventoryDefinition;
import com.cnk.travelogix.transportinventory.core.jalo.AbstractAirInventoryDetail;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.AbstractAirCompanySpecificInventory AbstractAirCompanySpecificInventory}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractAirCompanySpecificInventory extends AbstractAirInventoryDetail
{
	/** Qualifier of the <code>AbstractAirCompanySpecificInventory.stopSales</code> attribute **/
	public static final String STOPSALES = "stopSales";
	/** Qualifier of the <code>AbstractAirCompanySpecificInventory.liabilityOnUtilization</code> attribute **/
	public static final String LIABILITYONUTILIZATION = "liabilityOnUtilization";
	/** Qualifier of the <code>AbstractAirCompanySpecificInventory.distributedBy</code> attribute **/
	public static final String DISTRIBUTEDBY = "distributedBy";
	/** Qualifier of the <code>AbstractAirCompanySpecificInventory.timelimit</code> attribute **/
	public static final String TIMELIMIT = "timelimit";
	/** Qualifier of the <code>AbstractAirCompanySpecificInventory.AirInventoryDefinition</code> attribute **/
	public static final String AIRINVENTORYDEFINITION = "AirInventoryDefinition";
	/** Qualifier of the <code>AbstractAirCompanySpecificInventory.inventoryAssociations</code> attribute **/
	public static final String INVENTORYASSOCIATIONS = "inventoryAssociations";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRINVENTORYDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAbstractAirCompanySpecificInventory> AIRINVENTORYDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAbstractAirCompanySpecificInventory>(
	TransportinventorycoreConstants.TC.ABSTRACTAIRCOMPANYSPECIFICINVENTORY,
	false,
	"AirInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INVENTORYASSOCIATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AirAssociateInventory> INVENTORYASSOCIATIONSHANDLER = new OneToManyHandler<AirAssociateInventory>(
	TransportinventorycoreConstants.TC.AIRASSOCIATEINVENTORY,
	false,
	"abstractAirCompanySpecificInventory",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAirInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STOPSALES, AttributeMode.INITIAL);
		tmp.put(LIABILITYONUTILIZATION, AttributeMode.INITIAL);
		tmp.put(DISTRIBUTEDBY, AttributeMode.INITIAL);
		tmp.put(TIMELIMIT, AttributeMode.INITIAL);
		tmp.put(AIRINVENTORYDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.AirInventoryDefinition</code> attribute.
	 * @return the AirInventoryDefinition
	 */
	public AirInventoryDefinition getAirInventoryDefinition(final SessionContext ctx)
	{
		return (AirInventoryDefinition)getProperty( ctx, AIRINVENTORYDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.AirInventoryDefinition</code> attribute.
	 * @return the AirInventoryDefinition
	 */
	public AirInventoryDefinition getAirInventoryDefinition()
	{
		return getAirInventoryDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.AirInventoryDefinition</code> attribute. 
	 * @param value the AirInventoryDefinition
	 */
	public void setAirInventoryDefinition(final SessionContext ctx, final AirInventoryDefinition value)
	{
		AIRINVENTORYDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.AirInventoryDefinition</code> attribute. 
	 * @param value the AirInventoryDefinition
	 */
	public void setAirInventoryDefinition(final AirInventoryDefinition value)
	{
		setAirInventoryDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		AIRINVENTORYDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.distributedBy</code> attribute.
	 * @return the distributedBy - DistributeBy
	 */
	public EnumerationValue getDistributedBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DISTRIBUTEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.distributedBy</code> attribute.
	 * @return the distributedBy - DistributeBy
	 */
	public EnumerationValue getDistributedBy()
	{
		return getDistributedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.distributedBy</code> attribute. 
	 * @param value the distributedBy - DistributeBy
	 */
	public void setDistributedBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DISTRIBUTEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.distributedBy</code> attribute. 
	 * @param value the distributedBy - DistributeBy
	 */
	public void setDistributedBy(final EnumerationValue value)
	{
		setDistributedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.inventoryAssociations</code> attribute.
	 * @return the inventoryAssociations
	 */
	public Collection<AirAssociateInventory> getInventoryAssociations(final SessionContext ctx)
	{
		return INVENTORYASSOCIATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.inventoryAssociations</code> attribute.
	 * @return the inventoryAssociations
	 */
	public Collection<AirAssociateInventory> getInventoryAssociations()
	{
		return getInventoryAssociations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.inventoryAssociations</code> attribute. 
	 * @param value the inventoryAssociations
	 */
	public void setInventoryAssociations(final SessionContext ctx, final Collection<AirAssociateInventory> value)
	{
		INVENTORYASSOCIATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.inventoryAssociations</code> attribute. 
	 * @param value the inventoryAssociations
	 */
	public void setInventoryAssociations(final Collection<AirAssociateInventory> value)
	{
		setInventoryAssociations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryAssociations. 
	 * @param value the item to add to inventoryAssociations
	 */
	public void addToInventoryAssociations(final SessionContext ctx, final AirAssociateInventory value)
	{
		INVENTORYASSOCIATIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryAssociations. 
	 * @param value the item to add to inventoryAssociations
	 */
	public void addToInventoryAssociations(final AirAssociateInventory value)
	{
		addToInventoryAssociations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryAssociations. 
	 * @param value the item to remove from inventoryAssociations
	 */
	public void removeFromInventoryAssociations(final SessionContext ctx, final AirAssociateInventory value)
	{
		INVENTORYASSOCIATIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryAssociations. 
	 * @param value the item to remove from inventoryAssociations
	 */
	public void removeFromInventoryAssociations(final AirAssociateInventory value)
	{
		removeFromInventoryAssociations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.liabilityOnUtilization</code> attribute.
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public Double getLiabilityOnUtilization(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, LIABILITYONUTILIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.liabilityOnUtilization</code> attribute.
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public Double getLiabilityOnUtilization()
	{
		return getLiabilityOnUtilization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public double getLiabilityOnUtilizationAsPrimitive(final SessionContext ctx)
	{
		Double value = getLiabilityOnUtilization( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @return the liabilityOnUtilization - Liability On Utilization
	 */
	public double getLiabilityOnUtilizationAsPrimitive()
	{
		return getLiabilityOnUtilizationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, LIABILITYONUTILIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final Double value)
	{
		setLiabilityOnUtilization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final SessionContext ctx, final double value)
	{
		setLiabilityOnUtilization( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.liabilityOnUtilization</code> attribute. 
	 * @param value the liabilityOnUtilization - Liability On Utilization
	 */
	public void setLiabilityOnUtilization(final double value)
	{
		setLiabilityOnUtilization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.stopSales</code> attribute.
	 * @return the stopSales - Stop Sales
	 */
	public Boolean isStopSales(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, STOPSALES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.stopSales</code> attribute.
	 * @return the stopSales - Stop Sales
	 */
	public Boolean isStopSales()
	{
		return isStopSales( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.stopSales</code> attribute. 
	 * @return the stopSales - Stop Sales
	 */
	public boolean isStopSalesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isStopSales( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.stopSales</code> attribute. 
	 * @return the stopSales - Stop Sales
	 */
	public boolean isStopSalesAsPrimitive()
	{
		return isStopSalesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, STOPSALES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final Boolean value)
	{
		setStopSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final SessionContext ctx, final boolean value)
	{
		setStopSales( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.stopSales</code> attribute. 
	 * @param value the stopSales - Stop Sales
	 */
	public void setStopSales(final boolean value)
	{
		setStopSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.timelimit</code> attribute.
	 * @return the timelimit - time limit
	 */
	public String getTimelimit(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMELIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirCompanySpecificInventory.timelimit</code> attribute.
	 * @return the timelimit - time limit
	 */
	public String getTimelimit()
	{
		return getTimelimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.timelimit</code> attribute. 
	 * @param value the timelimit - time limit
	 */
	public void setTimelimit(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMELIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirCompanySpecificInventory.timelimit</code> attribute. 
	 * @param value the timelimit - time limit
	 */
	public void setTimelimit(final String value)
	{
		setTimelimit( getSession().getSessionContext(), value );
	}
	
}
