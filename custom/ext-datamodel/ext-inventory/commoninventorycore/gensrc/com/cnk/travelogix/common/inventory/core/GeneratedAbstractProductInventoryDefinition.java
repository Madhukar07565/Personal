/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.AbstractInventoryDefinition;
import com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.AbstractProductInventoryDefinition AbstractProductInventoryDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractProductInventoryDefinition extends AbstractInventoryDefinition
{
	/** Qualifier of the <code>AbstractProductInventoryDefinition.distressSaleMinimumThreshold</code> attribute **/
	public static final String DISTRESSSALEMINIMUMTHRESHOLD = "distressSaleMinimumThreshold";
	/** Qualifier of the <code>AbstractProductInventoryDefinition.distressSaleThresholdCutoffDays</code> attribute **/
	public static final String DISTRESSSALETHRESHOLDCUTOFFDAYS = "distressSaleThresholdCutoffDays";
	/** Qualifier of the <code>AbstractProductInventoryDefinition.blockedQuantity</code> attribute **/
	public static final String BLOCKEDQUANTITY = "blockedQuantity";
	/** Qualifier of the <code>AbstractProductInventoryDefinition.cutOffDaysForBlockedQuantity</code> attribute **/
	public static final String CUTOFFDAYSFORBLOCKEDQUANTITY = "cutOffDaysForBlockedQuantity";
	/** Qualifier of the <code>AbstractProductInventoryDefinition.settleWithCompany</code> attribute **/
	public static final String SETTLEWITHCOMPANY = "settleWithCompany";
	/** Qualifier of the <code>AbstractProductInventoryDefinition.associations</code> attribute **/
	public static final String ASSOCIATIONS = "associations";
	/**
	* {@link OneToManyHandler} for handling 1:n ASSOCIATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AssociateInventory> ASSOCIATIONSHANDLER = new OneToManyHandler<AssociateInventory>(
	CommoninventorycoreConstants.TC.ASSOCIATEINVENTORY,
	false,
	"abstractProductInventoryDefinition",
	"abstractProductInventoryDefinitionPOS",
	true,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractInventoryDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DISTRESSSALEMINIMUMTHRESHOLD, AttributeMode.INITIAL);
		tmp.put(DISTRESSSALETHRESHOLDCUTOFFDAYS, AttributeMode.INITIAL);
		tmp.put(BLOCKEDQUANTITY, AttributeMode.INITIAL);
		tmp.put(CUTOFFDAYSFORBLOCKEDQUANTITY, AttributeMode.INITIAL);
		tmp.put(SETTLEWITHCOMPANY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.associations</code> attribute.
	 * @return the associations
	 */
	public Collection<AssociateInventory> getAssociations(final SessionContext ctx)
	{
		return ASSOCIATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.associations</code> attribute.
	 * @return the associations
	 */
	public Collection<AssociateInventory> getAssociations()
	{
		return getAssociations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.associations</code> attribute. 
	 * @param value the associations
	 */
	public void setAssociations(final SessionContext ctx, final Collection<AssociateInventory> value)
	{
		ASSOCIATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.associations</code> attribute. 
	 * @param value the associations
	 */
	public void setAssociations(final Collection<AssociateInventory> value)
	{
		setAssociations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to associations. 
	 * @param value the item to add to associations
	 */
	public void addToAssociations(final SessionContext ctx, final AssociateInventory value)
	{
		ASSOCIATIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to associations. 
	 * @param value the item to add to associations
	 */
	public void addToAssociations(final AssociateInventory value)
	{
		addToAssociations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from associations. 
	 * @param value the item to remove from associations
	 */
	public void removeFromAssociations(final SessionContext ctx, final AssociateInventory value)
	{
		ASSOCIATIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from associations. 
	 * @param value the item to remove from associations
	 */
	public void removeFromAssociations(final AssociateInventory value)
	{
		removeFromAssociations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.blockedQuantity</code> attribute.
	 * @return the blockedQuantity - Blocked Quantity
	 */
	public Integer getBlockedQuantity(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BLOCKEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.blockedQuantity</code> attribute.
	 * @return the blockedQuantity - Blocked Quantity
	 */
	public Integer getBlockedQuantity()
	{
		return getBlockedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.blockedQuantity</code> attribute. 
	 * @return the blockedQuantity - Blocked Quantity
	 */
	public int getBlockedQuantityAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBlockedQuantity( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.blockedQuantity</code> attribute. 
	 * @return the blockedQuantity - Blocked Quantity
	 */
	public int getBlockedQuantityAsPrimitive()
	{
		return getBlockedQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.blockedQuantity</code> attribute. 
	 * @param value the blockedQuantity - Blocked Quantity
	 */
	public void setBlockedQuantity(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BLOCKEDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.blockedQuantity</code> attribute. 
	 * @param value the blockedQuantity - Blocked Quantity
	 */
	public void setBlockedQuantity(final Integer value)
	{
		setBlockedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.blockedQuantity</code> attribute. 
	 * @param value the blockedQuantity - Blocked Quantity
	 */
	public void setBlockedQuantity(final SessionContext ctx, final int value)
	{
		setBlockedQuantity( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.blockedQuantity</code> attribute. 
	 * @param value the blockedQuantity - Blocked Quantity
	 */
	public void setBlockedQuantity(final int value)
	{
		setBlockedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.cutOffDaysForBlockedQuantity</code> attribute.
	 * @return the cutOffDaysForBlockedQuantity - Cut Off Days For Blocked Quantity
	 */
	public Integer getCutOffDaysForBlockedQuantity(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CUTOFFDAYSFORBLOCKEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.cutOffDaysForBlockedQuantity</code> attribute.
	 * @return the cutOffDaysForBlockedQuantity - Cut Off Days For Blocked Quantity
	 */
	public Integer getCutOffDaysForBlockedQuantity()
	{
		return getCutOffDaysForBlockedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.cutOffDaysForBlockedQuantity</code> attribute. 
	 * @return the cutOffDaysForBlockedQuantity - Cut Off Days For Blocked Quantity
	 */
	public int getCutOffDaysForBlockedQuantityAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCutOffDaysForBlockedQuantity( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.cutOffDaysForBlockedQuantity</code> attribute. 
	 * @return the cutOffDaysForBlockedQuantity - Cut Off Days For Blocked Quantity
	 */
	public int getCutOffDaysForBlockedQuantityAsPrimitive()
	{
		return getCutOffDaysForBlockedQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.cutOffDaysForBlockedQuantity</code> attribute. 
	 * @param value the cutOffDaysForBlockedQuantity - Cut Off Days For Blocked Quantity
	 */
	public void setCutOffDaysForBlockedQuantity(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CUTOFFDAYSFORBLOCKEDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.cutOffDaysForBlockedQuantity</code> attribute. 
	 * @param value the cutOffDaysForBlockedQuantity - Cut Off Days For Blocked Quantity
	 */
	public void setCutOffDaysForBlockedQuantity(final Integer value)
	{
		setCutOffDaysForBlockedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.cutOffDaysForBlockedQuantity</code> attribute. 
	 * @param value the cutOffDaysForBlockedQuantity - Cut Off Days For Blocked Quantity
	 */
	public void setCutOffDaysForBlockedQuantity(final SessionContext ctx, final int value)
	{
		setCutOffDaysForBlockedQuantity( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.cutOffDaysForBlockedQuantity</code> attribute. 
	 * @param value the cutOffDaysForBlockedQuantity - Cut Off Days For Blocked Quantity
	 */
	public void setCutOffDaysForBlockedQuantity(final int value)
	{
		setCutOffDaysForBlockedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.distressSaleMinimumThreshold</code> attribute.
	 * @return the distressSaleMinimumThreshold - Minimum Threshold
	 */
	public Integer getDistressSaleMinimumThreshold(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DISTRESSSALEMINIMUMTHRESHOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.distressSaleMinimumThreshold</code> attribute.
	 * @return the distressSaleMinimumThreshold - Minimum Threshold
	 */
	public Integer getDistressSaleMinimumThreshold()
	{
		return getDistressSaleMinimumThreshold( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.distressSaleMinimumThreshold</code> attribute. 
	 * @return the distressSaleMinimumThreshold - Minimum Threshold
	 */
	public int getDistressSaleMinimumThresholdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDistressSaleMinimumThreshold( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.distressSaleMinimumThreshold</code> attribute. 
	 * @return the distressSaleMinimumThreshold - Minimum Threshold
	 */
	public int getDistressSaleMinimumThresholdAsPrimitive()
	{
		return getDistressSaleMinimumThresholdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.distressSaleMinimumThreshold</code> attribute. 
	 * @param value the distressSaleMinimumThreshold - Minimum Threshold
	 */
	public void setDistressSaleMinimumThreshold(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DISTRESSSALEMINIMUMTHRESHOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.distressSaleMinimumThreshold</code> attribute. 
	 * @param value the distressSaleMinimumThreshold - Minimum Threshold
	 */
	public void setDistressSaleMinimumThreshold(final Integer value)
	{
		setDistressSaleMinimumThreshold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.distressSaleMinimumThreshold</code> attribute. 
	 * @param value the distressSaleMinimumThreshold - Minimum Threshold
	 */
	public void setDistressSaleMinimumThreshold(final SessionContext ctx, final int value)
	{
		setDistressSaleMinimumThreshold( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.distressSaleMinimumThreshold</code> attribute. 
	 * @param value the distressSaleMinimumThreshold - Minimum Threshold
	 */
	public void setDistressSaleMinimumThreshold(final int value)
	{
		setDistressSaleMinimumThreshold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.distressSaleThresholdCutoffDays</code> attribute.
	 * @return the distressSaleThresholdCutoffDays - Threshold Cut off Days
	 */
	public Integer getDistressSaleThresholdCutoffDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DISTRESSSALETHRESHOLDCUTOFFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.distressSaleThresholdCutoffDays</code> attribute.
	 * @return the distressSaleThresholdCutoffDays - Threshold Cut off Days
	 */
	public Integer getDistressSaleThresholdCutoffDays()
	{
		return getDistressSaleThresholdCutoffDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.distressSaleThresholdCutoffDays</code> attribute. 
	 * @return the distressSaleThresholdCutoffDays - Threshold Cut off Days
	 */
	public int getDistressSaleThresholdCutoffDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDistressSaleThresholdCutoffDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.distressSaleThresholdCutoffDays</code> attribute. 
	 * @return the distressSaleThresholdCutoffDays - Threshold Cut off Days
	 */
	public int getDistressSaleThresholdCutoffDaysAsPrimitive()
	{
		return getDistressSaleThresholdCutoffDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.distressSaleThresholdCutoffDays</code> attribute. 
	 * @param value the distressSaleThresholdCutoffDays - Threshold Cut off Days
	 */
	public void setDistressSaleThresholdCutoffDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DISTRESSSALETHRESHOLDCUTOFFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.distressSaleThresholdCutoffDays</code> attribute. 
	 * @param value the distressSaleThresholdCutoffDays - Threshold Cut off Days
	 */
	public void setDistressSaleThresholdCutoffDays(final Integer value)
	{
		setDistressSaleThresholdCutoffDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.distressSaleThresholdCutoffDays</code> attribute. 
	 * @param value the distressSaleThresholdCutoffDays - Threshold Cut off Days
	 */
	public void setDistressSaleThresholdCutoffDays(final SessionContext ctx, final int value)
	{
		setDistressSaleThresholdCutoffDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.distressSaleThresholdCutoffDays</code> attribute. 
	 * @param value the distressSaleThresholdCutoffDays - Threshold Cut off Days
	 */
	public void setDistressSaleThresholdCutoffDays(final int value)
	{
		setDistressSaleThresholdCutoffDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.settleWithCompany</code> attribute.
	 * @return the settleWithCompany - Settle With Company
	 */
	public Boolean isSettleWithCompany(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SETTLEWITHCOMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.settleWithCompany</code> attribute.
	 * @return the settleWithCompany - Settle With Company
	 */
	public Boolean isSettleWithCompany()
	{
		return isSettleWithCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.settleWithCompany</code> attribute. 
	 * @return the settleWithCompany - Settle With Company
	 */
	public boolean isSettleWithCompanyAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSettleWithCompany( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractProductInventoryDefinition.settleWithCompany</code> attribute. 
	 * @return the settleWithCompany - Settle With Company
	 */
	public boolean isSettleWithCompanyAsPrimitive()
	{
		return isSettleWithCompanyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.settleWithCompany</code> attribute. 
	 * @param value the settleWithCompany - Settle With Company
	 */
	public void setSettleWithCompany(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SETTLEWITHCOMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.settleWithCompany</code> attribute. 
	 * @param value the settleWithCompany - Settle With Company
	 */
	public void setSettleWithCompany(final Boolean value)
	{
		setSettleWithCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.settleWithCompany</code> attribute. 
	 * @param value the settleWithCompany - Settle With Company
	 */
	public void setSettleWithCompany(final SessionContext ctx, final boolean value)
	{
		setSettleWithCompany( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractProductInventoryDefinition.settleWithCompany</code> attribute. 
	 * @param value the settleWithCompany - Settle With Company
	 */
	public void setSettleWithCompany(final boolean value)
	{
		setSettleWithCompany( getSession().getSessionContext(), value );
	}
	
}
