/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.activity.inventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import com.cnk.travelogix.activity.inventory.core.jalo.AbstractActivityCompanySpecificInventory;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityCompanyAdvanceDefinition;
import com.cnk.travelogix.common.inventory.core.AbstractProductInventoryDefinition;
import com.cnk.travelogix.datamodel.activityinventory.core.jalo.ActivityInventoryDetail;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateType;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.activity.ActivitySupplierAdvanceDefinition;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.activity.inventory.core.jalo.ActivityInventoryDefinition ActivityInventoryDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityInventoryDefinition extends AbstractProductInventoryDefinition
{
	/** Qualifier of the <code>ActivityInventoryDefinition.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>ActivityInventoryDefinition.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>ActivityInventoryDefinition.rateType</code> attribute **/
	public static final String RATETYPE = "rateType";
	/** Qualifier of the <code>ActivityInventoryDefinition.effectiveFrom</code> attribute **/
	public static final String EFFECTIVEFROM = "effectiveFrom";
	/** Qualifier of the <code>ActivityInventoryDefinition.confirmedInventory</code> attribute **/
	public static final String CONFIRMEDINVENTORY = "confirmedInventory";
	/** Qualifier of the <code>ActivityInventoryDefinition.advanceDefinition</code> attribute **/
	public static final String ADVANCEDEFINITION = "advanceDefinition";
	/** Qualifier of the <code>ActivityInventoryDefinition.companyAdvanceDefinition</code> attribute **/
	public static final String COMPANYADVANCEDEFINITION = "companyAdvanceDefinition";
	/** Qualifier of the <code>ActivityInventoryDefinition.distributedInventories</code> attribute **/
	public static final String DISTRIBUTEDINVENTORIES = "distributedInventories";
	/** Qualifier of the <code>ActivityInventoryDefinition.inventoryDetails</code> attribute **/
	public static final String INVENTORYDETAILS = "inventoryDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n DISTRIBUTEDINVENTORIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractActivityCompanySpecificInventory> DISTRIBUTEDINVENTORIESHANDLER = new OneToManyHandler<AbstractActivityCompanySpecificInventory>(
	ActivityinventorycoreConstants.TC.ABSTRACTACTIVITYCOMPANYSPECIFICINVENTORY,
	false,
	"activityInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INVENTORYDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ActivityInventoryDetail> INVENTORYDETAILSHANDLER = new OneToManyHandler<ActivityInventoryDetail>(
	ActivityinventorycoreConstants.TC.ACTIVITYINVENTORYDETAIL,
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractProductInventoryDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(RATETYPE, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROM, AttributeMode.INITIAL);
		tmp.put(CONFIRMEDINVENTORY, AttributeMode.INITIAL);
		tmp.put(ADVANCEDEFINITION, AttributeMode.INITIAL);
		tmp.put(COMPANYADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.advanceDefinition</code> attribute.
	 * @return the advanceDefinition - Activity Advance Definition
	 */
	public ActivitySupplierAdvanceDefinition getAdvanceDefinition(final SessionContext ctx)
	{
		return (ActivitySupplierAdvanceDefinition)getProperty( ctx, ADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.advanceDefinition</code> attribute.
	 * @return the advanceDefinition - Activity Advance Definition
	 */
	public ActivitySupplierAdvanceDefinition getAdvanceDefinition()
	{
		return getAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition - Activity Advance Definition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final ActivitySupplierAdvanceDefinition value)
	{
		setProperty(ctx, ADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition - Activity Advance Definition
	 */
	public void setAdvanceDefinition(final ActivitySupplierAdvanceDefinition value)
	{
		setAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.companyAdvanceDefinition</code> attribute.
	 * @return the companyAdvanceDefinition - Company Advance Definition
	 */
	public ActivityCompanyAdvanceDefinition getCompanyAdvanceDefinition(final SessionContext ctx)
	{
		return (ActivityCompanyAdvanceDefinition)getProperty( ctx, COMPANYADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.companyAdvanceDefinition</code> attribute.
	 * @return the companyAdvanceDefinition - Company Advance Definition
	 */
	public ActivityCompanyAdvanceDefinition getCompanyAdvanceDefinition()
	{
		return getCompanyAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.companyAdvanceDefinition</code> attribute. 
	 * @param value the companyAdvanceDefinition - Company Advance Definition
	 */
	public void setCompanyAdvanceDefinition(final SessionContext ctx, final ActivityCompanyAdvanceDefinition value)
	{
		setProperty(ctx, COMPANYADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.companyAdvanceDefinition</code> attribute. 
	 * @param value the companyAdvanceDefinition - Company Advance Definition
	 */
	public void setCompanyAdvanceDefinition(final ActivityCompanyAdvanceDefinition value)
	{
		setCompanyAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.confirmedInventory</code> attribute.
	 * @return the confirmedInventory - Confirmed Inventory
	 */
	public Long getConfirmedInventory(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, CONFIRMEDINVENTORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.confirmedInventory</code> attribute.
	 * @return the confirmedInventory - Confirmed Inventory
	 */
	public Long getConfirmedInventory()
	{
		return getConfirmedInventory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.confirmedInventory</code> attribute. 
	 * @return the confirmedInventory - Confirmed Inventory
	 */
	public long getConfirmedInventoryAsPrimitive(final SessionContext ctx)
	{
		Long value = getConfirmedInventory( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.confirmedInventory</code> attribute. 
	 * @return the confirmedInventory - Confirmed Inventory
	 */
	public long getConfirmedInventoryAsPrimitive()
	{
		return getConfirmedInventoryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.confirmedInventory</code> attribute. 
	 * @param value the confirmedInventory - Confirmed Inventory
	 */
	public void setConfirmedInventory(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, CONFIRMEDINVENTORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.confirmedInventory</code> attribute. 
	 * @param value the confirmedInventory - Confirmed Inventory
	 */
	public void setConfirmedInventory(final Long value)
	{
		setConfirmedInventory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.confirmedInventory</code> attribute. 
	 * @param value the confirmedInventory - Confirmed Inventory
	 */
	public void setConfirmedInventory(final SessionContext ctx, final long value)
	{
		setConfirmedInventory( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.confirmedInventory</code> attribute. 
	 * @param value the confirmedInventory - Confirmed Inventory
	 */
	public void setConfirmedInventory(final long value)
	{
		setConfirmedInventory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.country</code> attribute.
	 * @return the country - Country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.country</code> attribute.
	 * @return the country - Country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.distributedInventories</code> attribute.
	 * @return the distributedInventories
	 */
	public Collection<AbstractActivityCompanySpecificInventory> getDistributedInventories(final SessionContext ctx)
	{
		return DISTRIBUTEDINVENTORIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.distributedInventories</code> attribute.
	 * @return the distributedInventories
	 */
	public Collection<AbstractActivityCompanySpecificInventory> getDistributedInventories()
	{
		return getDistributedInventories( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.distributedInventories</code> attribute. 
	 * @param value the distributedInventories
	 */
	public void setDistributedInventories(final SessionContext ctx, final Collection<AbstractActivityCompanySpecificInventory> value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.distributedInventories</code> attribute. 
	 * @param value the distributedInventories
	 */
	public void setDistributedInventories(final Collection<AbstractActivityCompanySpecificInventory> value)
	{
		setDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to distributedInventories. 
	 * @param value the item to add to distributedInventories
	 */
	public void addToDistributedInventories(final SessionContext ctx, final AbstractActivityCompanySpecificInventory value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to distributedInventories. 
	 * @param value the item to add to distributedInventories
	 */
	public void addToDistributedInventories(final AbstractActivityCompanySpecificInventory value)
	{
		addToDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from distributedInventories. 
	 * @param value the item to remove from distributedInventories
	 */
	public void removeFromDistributedInventories(final SessionContext ctx, final AbstractActivityCompanySpecificInventory value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from distributedInventories. 
	 * @param value the item to remove from distributedInventories
	 */
	public void removeFromDistributedInventories(final AbstractActivityCompanySpecificInventory value)
	{
		removeFromDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Effective From Date
	 */
	public Date getEffectiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Effective From Date
	 */
	public Date getEffectiveFrom()
	{
		return getEffectiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Effective From Date
	 */
	public void setEffectiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Effective From Date
	 */
	public void setEffectiveFrom(final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.inventoryDetails</code> attribute.
	 * @return the inventoryDetails
	 */
	public Collection<ActivityInventoryDetail> getInventoryDetails(final SessionContext ctx)
	{
		return INVENTORYDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.inventoryDetails</code> attribute.
	 * @return the inventoryDetails
	 */
	public Collection<ActivityInventoryDetail> getInventoryDetails()
	{
		return getInventoryDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.inventoryDetails</code> attribute. 
	 * @param value the inventoryDetails
	 */
	public void setInventoryDetails(final SessionContext ctx, final Collection<ActivityInventoryDetail> value)
	{
		INVENTORYDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.inventoryDetails</code> attribute. 
	 * @param value the inventoryDetails
	 */
	public void setInventoryDetails(final Collection<ActivityInventoryDetail> value)
	{
		setInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryDetails. 
	 * @param value the item to add to inventoryDetails
	 */
	public void addToInventoryDetails(final SessionContext ctx, final ActivityInventoryDetail value)
	{
		INVENTORYDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryDetails. 
	 * @param value the item to add to inventoryDetails
	 */
	public void addToInventoryDetails(final ActivityInventoryDetail value)
	{
		addToInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryDetails. 
	 * @param value the item to remove from inventoryDetails
	 */
	public void removeFromInventoryDetails(final SessionContext ctx, final ActivityInventoryDetail value)
	{
		INVENTORYDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryDetails. 
	 * @param value the item to remove from inventoryDetails
	 */
	public void removeFromInventoryDetails(final ActivityInventoryDetail value)
	{
		removeFromInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.rateType</code> attribute.
	 * @return the rateType - Rate Type
	 */
	public RateType getRateType(final SessionContext ctx)
	{
		return (RateType)getProperty( ctx, RATETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDefinition.rateType</code> attribute.
	 * @return the rateType - Rate Type
	 */
	public RateType getRateType()
	{
		return getRateType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.rateType</code> attribute. 
	 * @param value the rateType - Rate Type
	 */
	public void setRateType(final SessionContext ctx, final RateType value)
	{
		setProperty(ctx, RATETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDefinition.rateType</code> attribute. 
	 * @param value the rateType - Rate Type
	 */
	public void setRateType(final RateType value)
	{
		setRateType( getSession().getSessionContext(), value );
	}
	
}
