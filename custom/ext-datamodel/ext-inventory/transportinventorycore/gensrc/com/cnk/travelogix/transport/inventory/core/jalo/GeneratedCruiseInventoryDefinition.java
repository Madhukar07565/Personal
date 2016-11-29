/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.AbstractProductInventoryDefinition;
import com.cnk.travelogix.product.common.core.jalo.CruiseBrand;
import com.cnk.travelogix.product.common.core.jalo.CruiseCompany;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AbstractCruiseCompanySpecificInventory;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseCompanyAdvanceDefinition;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseSupplierAdvanceDefinition;
import com.cnk.travelogix.transportinventory.core.jalo.CruiseInventoryDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.CruiseInventoryDefinition CruiseInventoryDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseInventoryDefinition extends AbstractProductInventoryDefinition
{
	/** Qualifier of the <code>CruiseInventoryDefinition.cruiseCompany</code> attribute **/
	public static final String CRUISECOMPANY = "cruiseCompany";
	/** Qualifier of the <code>CruiseInventoryDefinition.cruiseBrand</code> attribute **/
	public static final String CRUISEBRAND = "cruiseBrand";
	/** Qualifier of the <code>CruiseInventoryDefinition.effectiveFrom</code> attribute **/
	public static final String EFFECTIVEFROM = "effectiveFrom";
	/** Qualifier of the <code>CruiseInventoryDefinition.supplierAdvanceDefinition</code> attribute **/
	public static final String SUPPLIERADVANCEDEFINITION = "supplierAdvanceDefinition";
	/** Qualifier of the <code>CruiseInventoryDefinition.companyAdvanceDefinition</code> attribute **/
	public static final String COMPANYADVANCEDEFINITION = "companyAdvanceDefinition";
	/** Qualifier of the <code>CruiseInventoryDefinition.inventoryDetails</code> attribute **/
	public static final String INVENTORYDETAILS = "inventoryDetails";
	/** Qualifier of the <code>CruiseInventoryDefinition.distributedInventories</code> attribute **/
	public static final String DISTRIBUTEDINVENTORIES = "distributedInventories";
	/**
	* {@link OneToManyHandler} for handling 1:n INVENTORYDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CruiseInventoryDetail> INVENTORYDETAILSHANDLER = new OneToManyHandler<CruiseInventoryDetail>(
	TransportinventorycoreConstants.TC.CRUISEINVENTORYDETAIL,
	false,
	"cruiseInventory",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DISTRIBUTEDINVENTORIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractCruiseCompanySpecificInventory> DISTRIBUTEDINVENTORIESHANDLER = new OneToManyHandler<AbstractCruiseCompanySpecificInventory>(
	TransportinventorycoreConstants.TC.ABSTRACTCRUISECOMPANYSPECIFICINVENTORY,
	false,
	"cruiseInventoryDef",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractProductInventoryDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CRUISECOMPANY, AttributeMode.INITIAL);
		tmp.put(CRUISEBRAND, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROM, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDefinition.companyAdvanceDefinition</code> attribute.
	 * @return the companyAdvanceDefinition - Cruise company advance definition
	 */
	public CruiseCompanyAdvanceDefinition getCompanyAdvanceDefinition(final SessionContext ctx)
	{
		return (CruiseCompanyAdvanceDefinition)getProperty( ctx, COMPANYADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDefinition.companyAdvanceDefinition</code> attribute.
	 * @return the companyAdvanceDefinition - Cruise company advance definition
	 */
	public CruiseCompanyAdvanceDefinition getCompanyAdvanceDefinition()
	{
		return getCompanyAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDefinition.companyAdvanceDefinition</code> attribute. 
	 * @param value the companyAdvanceDefinition - Cruise company advance definition
	 */
	public void setCompanyAdvanceDefinition(final SessionContext ctx, final CruiseCompanyAdvanceDefinition value)
	{
		setProperty(ctx, COMPANYADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDefinition.companyAdvanceDefinition</code> attribute. 
	 * @param value the companyAdvanceDefinition - Cruise company advance definition
	 */
	public void setCompanyAdvanceDefinition(final CruiseCompanyAdvanceDefinition value)
	{
		setCompanyAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDefinition.cruiseBrand</code> attribute.
	 * @return the cruiseBrand - Cruise brand
	 */
	public CruiseBrand getCruiseBrand(final SessionContext ctx)
	{
		return (CruiseBrand)getProperty( ctx, CRUISEBRAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDefinition.cruiseBrand</code> attribute.
	 * @return the cruiseBrand - Cruise brand
	 */
	public CruiseBrand getCruiseBrand()
	{
		return getCruiseBrand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDefinition.cruiseBrand</code> attribute. 
	 * @param value the cruiseBrand - Cruise brand
	 */
	public void setCruiseBrand(final SessionContext ctx, final CruiseBrand value)
	{
		setProperty(ctx, CRUISEBRAND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDefinition.cruiseBrand</code> attribute. 
	 * @param value the cruiseBrand - Cruise brand
	 */
	public void setCruiseBrand(final CruiseBrand value)
	{
		setCruiseBrand( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDefinition.cruiseCompany</code> attribute.
	 * @return the cruiseCompany - Cruise company
	 */
	public CruiseCompany getCruiseCompany(final SessionContext ctx)
	{
		return (CruiseCompany)getProperty( ctx, CRUISECOMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDefinition.cruiseCompany</code> attribute.
	 * @return the cruiseCompany - Cruise company
	 */
	public CruiseCompany getCruiseCompany()
	{
		return getCruiseCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDefinition.cruiseCompany</code> attribute. 
	 * @param value the cruiseCompany - Cruise company
	 */
	public void setCruiseCompany(final SessionContext ctx, final CruiseCompany value)
	{
		setProperty(ctx, CRUISECOMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDefinition.cruiseCompany</code> attribute. 
	 * @param value the cruiseCompany - Cruise company
	 */
	public void setCruiseCompany(final CruiseCompany value)
	{
		setCruiseCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDefinition.distributedInventories</code> attribute.
	 * @return the distributedInventories
	 */
	public Collection<AbstractCruiseCompanySpecificInventory> getDistributedInventories(final SessionContext ctx)
	{
		return DISTRIBUTEDINVENTORIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDefinition.distributedInventories</code> attribute.
	 * @return the distributedInventories
	 */
	public Collection<AbstractCruiseCompanySpecificInventory> getDistributedInventories()
	{
		return getDistributedInventories( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDefinition.distributedInventories</code> attribute. 
	 * @param value the distributedInventories
	 */
	public void setDistributedInventories(final SessionContext ctx, final Collection<AbstractCruiseCompanySpecificInventory> value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDefinition.distributedInventories</code> attribute. 
	 * @param value the distributedInventories
	 */
	public void setDistributedInventories(final Collection<AbstractCruiseCompanySpecificInventory> value)
	{
		setDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to distributedInventories. 
	 * @param value the item to add to distributedInventories
	 */
	public void addToDistributedInventories(final SessionContext ctx, final AbstractCruiseCompanySpecificInventory value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to distributedInventories. 
	 * @param value the item to add to distributedInventories
	 */
	public void addToDistributedInventories(final AbstractCruiseCompanySpecificInventory value)
	{
		addToDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from distributedInventories. 
	 * @param value the item to remove from distributedInventories
	 */
	public void removeFromDistributedInventories(final SessionContext ctx, final AbstractCruiseCompanySpecificInventory value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from distributedInventories. 
	 * @param value the item to remove from distributedInventories
	 */
	public void removeFromDistributedInventories(final AbstractCruiseCompanySpecificInventory value)
	{
		removeFromDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDefinition.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Start date of cruise inventory
	 */
	public Date getEffectiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDefinition.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Start date of cruise inventory
	 */
	public Date getEffectiveFrom()
	{
		return getEffectiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDefinition.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Start date of cruise inventory
	 */
	public void setEffectiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDefinition.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Start date of cruise inventory
	 */
	public void setEffectiveFrom(final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDefinition.inventoryDetails</code> attribute.
	 * @return the inventoryDetails
	 */
	public Collection<CruiseInventoryDetail> getInventoryDetails(final SessionContext ctx)
	{
		return INVENTORYDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDefinition.inventoryDetails</code> attribute.
	 * @return the inventoryDetails
	 */
	public Collection<CruiseInventoryDetail> getInventoryDetails()
	{
		return getInventoryDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDefinition.inventoryDetails</code> attribute. 
	 * @param value the inventoryDetails
	 */
	public void setInventoryDetails(final SessionContext ctx, final Collection<CruiseInventoryDetail> value)
	{
		INVENTORYDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDefinition.inventoryDetails</code> attribute. 
	 * @param value the inventoryDetails
	 */
	public void setInventoryDetails(final Collection<CruiseInventoryDetail> value)
	{
		setInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryDetails. 
	 * @param value the item to add to inventoryDetails
	 */
	public void addToInventoryDetails(final SessionContext ctx, final CruiseInventoryDetail value)
	{
		INVENTORYDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryDetails. 
	 * @param value the item to add to inventoryDetails
	 */
	public void addToInventoryDetails(final CruiseInventoryDetail value)
	{
		addToInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryDetails. 
	 * @param value the item to remove from inventoryDetails
	 */
	public void removeFromInventoryDetails(final SessionContext ctx, final CruiseInventoryDetail value)
	{
		INVENTORYDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryDetails. 
	 * @param value the item to remove from inventoryDetails
	 */
	public void removeFromInventoryDetails(final CruiseInventoryDetail value)
	{
		removeFromInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDefinition.supplierAdvanceDefinition</code> attribute.
	 * @return the supplierAdvanceDefinition - Cruise supplier advance definition
	 */
	public CruiseSupplierAdvanceDefinition getSupplierAdvanceDefinition(final SessionContext ctx)
	{
		return (CruiseSupplierAdvanceDefinition)getProperty( ctx, SUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDefinition.supplierAdvanceDefinition</code> attribute.
	 * @return the supplierAdvanceDefinition - Cruise supplier advance definition
	 */
	public CruiseSupplierAdvanceDefinition getSupplierAdvanceDefinition()
	{
		return getSupplierAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDefinition.supplierAdvanceDefinition</code> attribute. 
	 * @param value the supplierAdvanceDefinition - Cruise supplier advance definition
	 */
	public void setSupplierAdvanceDefinition(final SessionContext ctx, final CruiseSupplierAdvanceDefinition value)
	{
		setProperty(ctx, SUPPLIERADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDefinition.supplierAdvanceDefinition</code> attribute. 
	 * @param value the supplierAdvanceDefinition - Cruise supplier advance definition
	 */
	public void setSupplierAdvanceDefinition(final CruiseSupplierAdvanceDefinition value)
	{
		setSupplierAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
}
