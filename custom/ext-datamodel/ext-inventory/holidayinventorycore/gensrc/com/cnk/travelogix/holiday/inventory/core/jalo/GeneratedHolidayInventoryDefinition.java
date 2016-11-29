/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.holiday.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.jalo.AbstractInventoryDefinition;
import com.cnk.travelogix.holiday.inventory.core.constants.HolidayinventorycoreConstants;
import com.cnk.travelogix.holiday.inventory.core.jalo.HolidayCompanySpecificInventory;
import com.cnk.travelogix.holiday.inventory.core.jalo.HolidayInvSupplierAdvanceDefinition;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayFlavor;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayProduct;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.holiday.inventory.core.jalo.HolidayInventoryDefinition HolidayInventoryDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayInventoryDefinition extends AbstractInventoryDefinition
{
	/** Qualifier of the <code>HolidayInventoryDefinition.overBookingLimit</code> attribute **/
	public static final String OVERBOOKINGLIMIT = "overBookingLimit";
	/** Qualifier of the <code>HolidayInventoryDefinition.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>HolidayInventoryDefinition.flavor</code> attribute **/
	public static final String FLAVOR = "flavor";
	/** Qualifier of the <code>HolidayInventoryDefinition.packageCategory</code> attribute **/
	public static final String PACKAGECATEGORY = "packageCategory";
	/** Qualifier of the <code>HolidayInventoryDefinition.market</code> attribute **/
	public static final String MARKET = "market";
	/** Qualifier of the <code>HolidayInventoryDefinition.requestedBy</code> attribute **/
	public static final String REQUESTEDBY = "requestedBy";
	/** Qualifier of the <code>HolidayInventoryDefinition.advanceDefinition</code> attribute **/
	public static final String ADVANCEDEFINITION = "advanceDefinition";
	/** Qualifier of the <code>HolidayInventoryDefinition.distributedInventories</code> attribute **/
	public static final String DISTRIBUTEDINVENTORIES = "distributedInventories";
	/**
	* {@link OneToManyHandler} for handling 1:n DISTRIBUTEDINVENTORIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<HolidayCompanySpecificInventory> DISTRIBUTEDINVENTORIESHANDLER = new OneToManyHandler<HolidayCompanySpecificInventory>(
	HolidayinventorycoreConstants.TC.HOLIDAYCOMPANYSPECIFICINVENTORY,
	false,
	"holidayInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractInventoryDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(OVERBOOKINGLIMIT, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(FLAVOR, AttributeMode.INITIAL);
		tmp.put(PACKAGECATEGORY, AttributeMode.INITIAL);
		tmp.put(MARKET, AttributeMode.INITIAL);
		tmp.put(REQUESTEDBY, AttributeMode.INITIAL);
		tmp.put(ADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.advanceDefinition</code> attribute.
	 * @return the advanceDefinition - Holiday supplier advance definition
	 */
	public HolidayInvSupplierAdvanceDefinition getAdvanceDefinition(final SessionContext ctx)
	{
		return (HolidayInvSupplierAdvanceDefinition)getProperty( ctx, ADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.advanceDefinition</code> attribute.
	 * @return the advanceDefinition - Holiday supplier advance definition
	 */
	public HolidayInvSupplierAdvanceDefinition getAdvanceDefinition()
	{
		return getAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition - Holiday supplier advance definition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final HolidayInvSupplierAdvanceDefinition value)
	{
		setProperty(ctx, ADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition - Holiday supplier advance definition
	 */
	public void setAdvanceDefinition(final HolidayInvSupplierAdvanceDefinition value)
	{
		setAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.distributedInventories</code> attribute.
	 * @return the distributedInventories
	 */
	public Collection<HolidayCompanySpecificInventory> getDistributedInventories(final SessionContext ctx)
	{
		return DISTRIBUTEDINVENTORIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.distributedInventories</code> attribute.
	 * @return the distributedInventories
	 */
	public Collection<HolidayCompanySpecificInventory> getDistributedInventories()
	{
		return getDistributedInventories( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.distributedInventories</code> attribute. 
	 * @param value the distributedInventories
	 */
	public void setDistributedInventories(final SessionContext ctx, final Collection<HolidayCompanySpecificInventory> value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.distributedInventories</code> attribute. 
	 * @param value the distributedInventories
	 */
	public void setDistributedInventories(final Collection<HolidayCompanySpecificInventory> value)
	{
		setDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to distributedInventories. 
	 * @param value the item to add to distributedInventories
	 */
	public void addToDistributedInventories(final SessionContext ctx, final HolidayCompanySpecificInventory value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to distributedInventories. 
	 * @param value the item to add to distributedInventories
	 */
	public void addToDistributedInventories(final HolidayCompanySpecificInventory value)
	{
		addToDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from distributedInventories. 
	 * @param value the item to remove from distributedInventories
	 */
	public void removeFromDistributedInventories(final SessionContext ctx, final HolidayCompanySpecificInventory value)
	{
		DISTRIBUTEDINVENTORIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from distributedInventories. 
	 * @param value the item to remove from distributedInventories
	 */
	public void removeFromDistributedInventories(final HolidayCompanySpecificInventory value)
	{
		removeFromDistributedInventories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.flavor</code> attribute.
	 * @return the flavor - Holiday flavor
	 */
	public HolidayFlavor getFlavor(final SessionContext ctx)
	{
		return (HolidayFlavor)getProperty( ctx, FLAVOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.flavor</code> attribute.
	 * @return the flavor - Holiday flavor
	 */
	public HolidayFlavor getFlavor()
	{
		return getFlavor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.flavor</code> attribute. 
	 * @param value the flavor - Holiday flavor
	 */
	public void setFlavor(final SessionContext ctx, final HolidayFlavor value)
	{
		setProperty(ctx, FLAVOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.flavor</code> attribute. 
	 * @param value the flavor - Holiday flavor
	 */
	public void setFlavor(final HolidayFlavor value)
	{
		setFlavor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.market</code> attribute.
	 * @return the market - Market
	 */
	public Market getMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, MARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.market</code> attribute.
	 * @return the market - Market
	 */
	public Market getMarket()
	{
		return getMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.market</code> attribute. 
	 * @param value the market - Market
	 */
	public void setMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, MARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.market</code> attribute. 
	 * @param value the market - Market
	 */
	public void setMarket(final Market value)
	{
		setMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.overBookingLimit</code> attribute.
	 * @return the overBookingLimit - Over booking limit
	 */
	public Long getOverBookingLimit(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, OVERBOOKINGLIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.overBookingLimit</code> attribute.
	 * @return the overBookingLimit - Over booking limit
	 */
	public Long getOverBookingLimit()
	{
		return getOverBookingLimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.overBookingLimit</code> attribute. 
	 * @return the overBookingLimit - Over booking limit
	 */
	public long getOverBookingLimitAsPrimitive(final SessionContext ctx)
	{
		Long value = getOverBookingLimit( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.overBookingLimit</code> attribute. 
	 * @return the overBookingLimit - Over booking limit
	 */
	public long getOverBookingLimitAsPrimitive()
	{
		return getOverBookingLimitAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.overBookingLimit</code> attribute. 
	 * @param value the overBookingLimit - Over booking limit
	 */
	public void setOverBookingLimit(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, OVERBOOKINGLIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.overBookingLimit</code> attribute. 
	 * @param value the overBookingLimit - Over booking limit
	 */
	public void setOverBookingLimit(final Long value)
	{
		setOverBookingLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.overBookingLimit</code> attribute. 
	 * @param value the overBookingLimit - Over booking limit
	 */
	public void setOverBookingLimit(final SessionContext ctx, final long value)
	{
		setOverBookingLimit( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.overBookingLimit</code> attribute. 
	 * @param value the overBookingLimit - Over booking limit
	 */
	public void setOverBookingLimit(final long value)
	{
		setOverBookingLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.packageCategory</code> attribute.
	 * @return the packageCategory - Package category
	 */
	public EnumerationValue getPackageCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PACKAGECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.packageCategory</code> attribute.
	 * @return the packageCategory - Package category
	 */
	public EnumerationValue getPackageCategory()
	{
		return getPackageCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.packageCategory</code> attribute. 
	 * @param value the packageCategory - Package category
	 */
	public void setPackageCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PACKAGECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.packageCategory</code> attribute. 
	 * @param value the packageCategory - Package category
	 */
	public void setPackageCategory(final EnumerationValue value)
	{
		setPackageCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.product</code> attribute.
	 * @return the product - Holiday product
	 */
	public HolidayProduct getProduct(final SessionContext ctx)
	{
		return (HolidayProduct)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.product</code> attribute.
	 * @return the product - Holiday product
	 */
	public HolidayProduct getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.product</code> attribute. 
	 * @param value the product - Holiday product
	 */
	public void setProduct(final SessionContext ctx, final HolidayProduct value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.product</code> attribute. 
	 * @param value the product - Holiday product
	 */
	public void setProduct(final HolidayProduct value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.requestedBy</code> attribute.
	 * @return the requestedBy - Inventory 
	 * 						requested by
	 */
	public EnumerationValue getRequestedBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, REQUESTEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryDefinition.requestedBy</code> attribute.
	 * @return the requestedBy - Inventory 
	 * 						requested by
	 */
	public EnumerationValue getRequestedBy()
	{
		return getRequestedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.requestedBy</code> attribute. 
	 * @param value the requestedBy - Inventory 
	 * 						requested by
	 */
	public void setRequestedBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, REQUESTEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryDefinition.requestedBy</code> attribute. 
	 * @param value the requestedBy - Inventory 
	 * 						requested by
	 */
	public void setRequestedBy(final EnumerationValue value)
	{
		setRequestedBy( getSession().getSessionContext(), value );
	}
	
}
