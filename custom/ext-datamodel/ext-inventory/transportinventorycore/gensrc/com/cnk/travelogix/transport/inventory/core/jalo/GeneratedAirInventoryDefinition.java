/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.AbstractProductInventoryDefinition;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AbstractAirCompanySpecificInventory;
import com.cnk.travelogix.transport.inventory.core.jalo.AirCompanyAdvanceDefinition;
import com.cnk.travelogix.transport.inventory.core.jalo.AirInvSupplierAdvanceDefinition;
import com.cnk.travelogix.transport.inventory.core.jalo.AirInventoryGrid;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.price.Tax;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.AirInventoryDefinition AirInventoryDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirInventoryDefinition extends AbstractProductInventoryDefinition
{
	/** Qualifier of the <code>AirInventoryDefinition.supplierAdvanceDefinition</code> attribute **/
	public static final String SUPPLIERADVANCEDEFINITION = "supplierAdvanceDefinition";
	/** Qualifier of the <code>AirInventoryDefinition.companyAdvanceDefinition</code> attribute **/
	public static final String COMPANYADVANCEDEFINITION = "companyAdvanceDefinition";
	/** Qualifier of the <code>AirInventoryDefinition.distributedInventories</code> attribute **/
	public static final String DISTRIBUTEDINVENTORIES = "distributedInventories";
	/** Qualifier of the <code>AirInventoryDefinition.taxDetails</code> attribute **/
	public static final String TAXDETAILS = "taxDetails";
	/** Qualifier of the <code>AirInventoryDefinition.inventoryDetails</code> attribute **/
	public static final String INVENTORYDETAILS = "inventoryDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n DISTRIBUTEDINVENTORIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractAirCompanySpecificInventory> DISTRIBUTEDINVENTORIESHANDLER = new OneToManyHandler<AbstractAirCompanySpecificInventory>(
	TransportinventorycoreConstants.TC.ABSTRACTAIRCOMPANYSPECIFICINVENTORY,
	false,
	"AirInventoryDefinition",
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
	"airInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INVENTORYDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AirInventoryGrid> INVENTORYDETAILSHANDLER = new OneToManyHandler<AirInventoryGrid>(
	TransportinventorycoreConstants.TC.AIRINVENTORYGRID,
	false,
	"airInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractProductInventoryDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SUPPLIERADVANCEDEFINITION, AttributeMode.INITIAL);
		tmp.put(COMPANYADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryDefinition.companyAdvanceDefinition</code> attribute.
	 * @return the companyAdvanceDefinition - Air company advance definition
	 */
	public AirCompanyAdvanceDefinition getCompanyAdvanceDefinition(final SessionContext ctx)
	{
		return (AirCompanyAdvanceDefinition)getProperty( ctx, COMPANYADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryDefinition.companyAdvanceDefinition</code> attribute.
	 * @return the companyAdvanceDefinition - Air company advance definition
	 */
	public AirCompanyAdvanceDefinition getCompanyAdvanceDefinition()
	{
		return getCompanyAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryDefinition.companyAdvanceDefinition</code> attribute. 
	 * @param value the companyAdvanceDefinition - Air company advance definition
	 */
	public void setCompanyAdvanceDefinition(final SessionContext ctx, final AirCompanyAdvanceDefinition value)
	{
		setProperty(ctx, COMPANYADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryDefinition.companyAdvanceDefinition</code> attribute. 
	 * @param value the companyAdvanceDefinition - Air company advance definition
	 */
	public void setCompanyAdvanceDefinition(final AirCompanyAdvanceDefinition value)
	{
		setCompanyAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryDefinition.distributedInventories</code> attribute.
	 * @return the distributedInventories
	 */
	public Collection<AbstractAirCompanySpecificInventory> getDistributedInventories(final SessionContext ctx)
	{
		return DISTRIBUTEDINVENTORIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryDefinition.distributedInventories</code> attribute.
	 * @return the distributedInventories
	 */
	public Collection<AbstractAirCompanySpecificInventory> getDistributedInventories()
	{
		return getDistributedInventories( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryDefinition.distributedInventories</code> attribute. 
	 * @param value the distributedInventories
	 */
	public void setDistributedInventories(final SessionContext ctx, final Collection<AbstractAirCompanySpecificInventory> value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryDefinition.distributedInventories</code> attribute. 
	 * @param value the distributedInventories
	 */
	public void setDistributedInventories(final Collection<AbstractAirCompanySpecificInventory> value)
	{
		setDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to distributedInventories. 
	 * @param value the item to add to distributedInventories
	 */
	public void addToDistributedInventories(final SessionContext ctx, final AbstractAirCompanySpecificInventory value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to distributedInventories. 
	 * @param value the item to add to distributedInventories
	 */
	public void addToDistributedInventories(final AbstractAirCompanySpecificInventory value)
	{
		addToDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from distributedInventories. 
	 * @param value the item to remove from distributedInventories
	 */
	public void removeFromDistributedInventories(final SessionContext ctx, final AbstractAirCompanySpecificInventory value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from distributedInventories. 
	 * @param value the item to remove from distributedInventories
	 */
	public void removeFromDistributedInventories(final AbstractAirCompanySpecificInventory value)
	{
		removeFromDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryDefinition.inventoryDetails</code> attribute.
	 * @return the inventoryDetails
	 */
	public Collection<AirInventoryGrid> getInventoryDetails(final SessionContext ctx)
	{
		return INVENTORYDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryDefinition.inventoryDetails</code> attribute.
	 * @return the inventoryDetails
	 */
	public Collection<AirInventoryGrid> getInventoryDetails()
	{
		return getInventoryDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryDefinition.inventoryDetails</code> attribute. 
	 * @param value the inventoryDetails
	 */
	public void setInventoryDetails(final SessionContext ctx, final Collection<AirInventoryGrid> value)
	{
		INVENTORYDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryDefinition.inventoryDetails</code> attribute. 
	 * @param value the inventoryDetails
	 */
	public void setInventoryDetails(final Collection<AirInventoryGrid> value)
	{
		setInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryDetails. 
	 * @param value the item to add to inventoryDetails
	 */
	public void addToInventoryDetails(final SessionContext ctx, final AirInventoryGrid value)
	{
		INVENTORYDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryDetails. 
	 * @param value the item to add to inventoryDetails
	 */
	public void addToInventoryDetails(final AirInventoryGrid value)
	{
		addToInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryDetails. 
	 * @param value the item to remove from inventoryDetails
	 */
	public void removeFromInventoryDetails(final SessionContext ctx, final AirInventoryGrid value)
	{
		INVENTORYDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryDetails. 
	 * @param value the item to remove from inventoryDetails
	 */
	public void removeFromInventoryDetails(final AirInventoryGrid value)
	{
		removeFromInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryDefinition.supplierAdvanceDefinition</code> attribute.
	 * @return the supplierAdvanceDefinition - Air supplier advance definition
	 */
	public AirInvSupplierAdvanceDefinition getSupplierAdvanceDefinition(final SessionContext ctx)
	{
		return (AirInvSupplierAdvanceDefinition)getProperty( ctx, SUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryDefinition.supplierAdvanceDefinition</code> attribute.
	 * @return the supplierAdvanceDefinition - Air supplier advance definition
	 */
	public AirInvSupplierAdvanceDefinition getSupplierAdvanceDefinition()
	{
		return getSupplierAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryDefinition.supplierAdvanceDefinition</code> attribute. 
	 * @param value the supplierAdvanceDefinition - Air supplier advance definition
	 */
	public void setSupplierAdvanceDefinition(final SessionContext ctx, final AirInvSupplierAdvanceDefinition value)
	{
		setProperty(ctx, SUPPLIERADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryDefinition.supplierAdvanceDefinition</code> attribute. 
	 * @param value the supplierAdvanceDefinition - Air supplier advance definition
	 */
	public void setSupplierAdvanceDefinition(final AirInvSupplierAdvanceDefinition value)
	{
		setSupplierAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryDefinition.taxDetails</code> attribute.
	 * @return the taxDetails
	 */
	public Collection<Tax> getTaxDetails(final SessionContext ctx)
	{
		return TAXDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryDefinition.taxDetails</code> attribute.
	 * @return the taxDetails
	 */
	public Collection<Tax> getTaxDetails()
	{
		return getTaxDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryDefinition.taxDetails</code> attribute. 
	 * @param value the taxDetails
	 */
	public void setTaxDetails(final SessionContext ctx, final Collection<Tax> value)
	{
		TAXDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryDefinition.taxDetails</code> attribute. 
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
