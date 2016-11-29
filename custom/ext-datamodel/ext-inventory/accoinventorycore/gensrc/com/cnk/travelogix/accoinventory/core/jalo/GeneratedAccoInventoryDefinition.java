/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.accoinventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import com.cnk.travelogix.acco.inventory.core.jalo.AccoInventoryGrid;
import com.cnk.travelogix.accoinventory.core.jalo.AbstractAccoCompanySpecificInventory;
import com.cnk.travelogix.accoinventory.core.jalo.AccoCompanyAdvanceDefinition;
import com.cnk.travelogix.common.inventory.core.AbstractProductInventoryDefinition;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.AccoSupplierAdvanceDefinition;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.accoinventory.core.jalo.AccoInventoryDefinition AccoInventoryDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoInventoryDefinition extends AbstractProductInventoryDefinition
{
	/** Qualifier of the <code>AccoInventoryDefinition.supplierAdvanceDefinition</code> attribute **/
	public static final String SUPPLIERADVANCEDEFINITION = "supplierAdvanceDefinition";
	/** Qualifier of the <code>AccoInventoryDefinition.companyAdvanceDefinition</code> attribute **/
	public static final String COMPANYADVANCEDEFINITION = "companyAdvanceDefinition";
	/** Qualifier of the <code>AccoInventoryDefinition.distributedInventories</code> attribute **/
	public static final String DISTRIBUTEDINVENTORIES = "distributedInventories";
	/** Qualifier of the <code>AccoInventoryDefinition.inventoryDetails</code> attribute **/
	public static final String INVENTORYDETAILS = "inventoryDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n DISTRIBUTEDINVENTORIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractAccoCompanySpecificInventory> DISTRIBUTEDINVENTORIESHANDLER = new OneToManyHandler<AbstractAccoCompanySpecificInventory>(
	AccoinventorycoreConstants.TC.ABSTRACTACCOCOMPANYSPECIFICINVENTORY,
	false,
	"accoInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INVENTORYDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AccoInventoryGrid> INVENTORYDETAILSHANDLER = new OneToManyHandler<AccoInventoryGrid>(
	AccoinventorycoreConstants.TC.ACCOINVENTORYGRID,
	false,
	"accoInventoryDefinition",
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
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryDefinition.companyAdvanceDefinition</code> attribute.
	 * @return the companyAdvanceDefinition - Company Advance Definition
	 */
	public AccoCompanyAdvanceDefinition getCompanyAdvanceDefinition(final SessionContext ctx)
	{
		return (AccoCompanyAdvanceDefinition)getProperty( ctx, COMPANYADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryDefinition.companyAdvanceDefinition</code> attribute.
	 * @return the companyAdvanceDefinition - Company Advance Definition
	 */
	public AccoCompanyAdvanceDefinition getCompanyAdvanceDefinition()
	{
		return getCompanyAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryDefinition.companyAdvanceDefinition</code> attribute. 
	 * @param value the companyAdvanceDefinition - Company Advance Definition
	 */
	public void setCompanyAdvanceDefinition(final SessionContext ctx, final AccoCompanyAdvanceDefinition value)
	{
		setProperty(ctx, COMPANYADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryDefinition.companyAdvanceDefinition</code> attribute. 
	 * @param value the companyAdvanceDefinition - Company Advance Definition
	 */
	public void setCompanyAdvanceDefinition(final AccoCompanyAdvanceDefinition value)
	{
		setCompanyAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryDefinition.distributedInventories</code> attribute.
	 * @return the distributedInventories
	 */
	public Collection<AbstractAccoCompanySpecificInventory> getDistributedInventories(final SessionContext ctx)
	{
		return DISTRIBUTEDINVENTORIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryDefinition.distributedInventories</code> attribute.
	 * @return the distributedInventories
	 */
	public Collection<AbstractAccoCompanySpecificInventory> getDistributedInventories()
	{
		return getDistributedInventories( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryDefinition.distributedInventories</code> attribute. 
	 * @param value the distributedInventories
	 */
	public void setDistributedInventories(final SessionContext ctx, final Collection<AbstractAccoCompanySpecificInventory> value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryDefinition.distributedInventories</code> attribute. 
	 * @param value the distributedInventories
	 */
	public void setDistributedInventories(final Collection<AbstractAccoCompanySpecificInventory> value)
	{
		setDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to distributedInventories. 
	 * @param value the item to add to distributedInventories
	 */
	public void addToDistributedInventories(final SessionContext ctx, final AbstractAccoCompanySpecificInventory value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to distributedInventories. 
	 * @param value the item to add to distributedInventories
	 */
	public void addToDistributedInventories(final AbstractAccoCompanySpecificInventory value)
	{
		addToDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from distributedInventories. 
	 * @param value the item to remove from distributedInventories
	 */
	public void removeFromDistributedInventories(final SessionContext ctx, final AbstractAccoCompanySpecificInventory value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from distributedInventories. 
	 * @param value the item to remove from distributedInventories
	 */
	public void removeFromDistributedInventories(final AbstractAccoCompanySpecificInventory value)
	{
		removeFromDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryDefinition.inventoryDetails</code> attribute.
	 * @return the inventoryDetails
	 */
	public Collection<AccoInventoryGrid> getInventoryDetails(final SessionContext ctx)
	{
		return INVENTORYDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryDefinition.inventoryDetails</code> attribute.
	 * @return the inventoryDetails
	 */
	public Collection<AccoInventoryGrid> getInventoryDetails()
	{
		return getInventoryDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryDefinition.inventoryDetails</code> attribute. 
	 * @param value the inventoryDetails
	 */
	public void setInventoryDetails(final SessionContext ctx, final Collection<AccoInventoryGrid> value)
	{
		INVENTORYDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryDefinition.inventoryDetails</code> attribute. 
	 * @param value the inventoryDetails
	 */
	public void setInventoryDetails(final Collection<AccoInventoryGrid> value)
	{
		setInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryDetails. 
	 * @param value the item to add to inventoryDetails
	 */
	public void addToInventoryDetails(final SessionContext ctx, final AccoInventoryGrid value)
	{
		INVENTORYDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryDetails. 
	 * @param value the item to add to inventoryDetails
	 */
	public void addToInventoryDetails(final AccoInventoryGrid value)
	{
		addToInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryDetails. 
	 * @param value the item to remove from inventoryDetails
	 */
	public void removeFromInventoryDetails(final SessionContext ctx, final AccoInventoryGrid value)
	{
		INVENTORYDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryDetails. 
	 * @param value the item to remove from inventoryDetails
	 */
	public void removeFromInventoryDetails(final AccoInventoryGrid value)
	{
		removeFromInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryDefinition.supplierAdvanceDefinition</code> attribute.
	 * @return the supplierAdvanceDefinition - Supplier Advance Definition
	 */
	public AccoSupplierAdvanceDefinition getSupplierAdvanceDefinition(final SessionContext ctx)
	{
		return (AccoSupplierAdvanceDefinition)getProperty( ctx, SUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryDefinition.supplierAdvanceDefinition</code> attribute.
	 * @return the supplierAdvanceDefinition - Supplier Advance Definition
	 */
	public AccoSupplierAdvanceDefinition getSupplierAdvanceDefinition()
	{
		return getSupplierAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryDefinition.supplierAdvanceDefinition</code> attribute. 
	 * @param value the supplierAdvanceDefinition - Supplier Advance Definition
	 */
	public void setSupplierAdvanceDefinition(final SessionContext ctx, final AccoSupplierAdvanceDefinition value)
	{
		setProperty(ctx, SUPPLIERADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryDefinition.supplierAdvanceDefinition</code> attribute. 
	 * @param value the supplierAdvanceDefinition - Supplier Advance Definition
	 */
	public void setSupplierAdvanceDefinition(final AccoSupplierAdvanceDefinition value)
	{
		setSupplierAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
}
