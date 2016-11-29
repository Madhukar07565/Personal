/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.EventsAndTourInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.PickupAndDropOff;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivityRates;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivitySupplierRateDefinition;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivityRateDetailDefinition ActivityRateDetailDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityRateDetailDefinition extends GenericItem
{
	/** Qualifier of the <code>ActivityRateDetailDefinition.minPaxCount</code> attribute **/
	public static final String MINPAXCOUNT = "minPaxCount";
	/** Qualifier of the <code>ActivityRateDetailDefinition.maxPaxCount</code> attribute **/
	public static final String MAXPAXCOUNT = "maxPaxCount";
	/** Qualifier of the <code>ActivityRateDetailDefinition.activitySuppRateDef</code> attribute **/
	public static final String ACTIVITYSUPPRATEDEF = "activitySuppRateDef";
	/** Qualifier of the <code>ActivityRateDetailDefinition.pickupAndDropOffs</code> attribute **/
	public static final String PICKUPANDDROPOFFS = "pickupAndDropOffs";
	/** Qualifier of the <code>ActivityRateDetailDefinition.activityRates</code> attribute **/
	public static final String ACTIVITYRATES = "activityRates";
	/** Qualifier of the <code>ActivityRateDetailDefinition.eventsAndTourInfos</code> attribute **/
	public static final String EVENTSANDTOURINFOS = "eventsAndTourInfos";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYSUPPRATEDEF's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedActivityRateDetailDefinition> ACTIVITYSUPPRATEDEFHANDLER = new BidirectionalOneToManyHandler<GeneratedActivityRateDetailDefinition>(
	SupplierratedefinitionsactivitiesConstants.TC.ACTIVITYRATEDETAILDEFINITION,
	false,
	"activitySuppRateDef",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PICKUPANDDROPOFFS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PickupAndDropOff> PICKUPANDDROPOFFSHANDLER = new OneToManyHandler<PickupAndDropOff>(
	ActivityproductmasterscoreConstants.TC.PICKUPANDDROPOFF,
	false,
	"supplierRateDef",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ACTIVITYRATES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ActivityRates> ACTIVITYRATESHANDLER = new OneToManyHandler<ActivityRates>(
	SupplierratedefinitionsactivitiesConstants.TC.ACTIVITYRATES,
	true,
	"supplierRateDef",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n EVENTSANDTOURINFOS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EventsAndTourInfo> EVENTSANDTOURINFOSHANDLER = new OneToManyHandler<EventsAndTourInfo>(
	ActivityproductmasterscoreConstants.TC.EVENTSANDTOURINFO,
	false,
	"rateDetailDef",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MINPAXCOUNT, AttributeMode.INITIAL);
		tmp.put(MAXPAXCOUNT, AttributeMode.INITIAL);
		tmp.put(ACTIVITYSUPPRATEDEF, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.activityRates</code> attribute.
	 * @return the activityRates
	 */
	public Collection<ActivityRates> getActivityRates(final SessionContext ctx)
	{
		return ACTIVITYRATESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.activityRates</code> attribute.
	 * @return the activityRates
	 */
	public Collection<ActivityRates> getActivityRates()
	{
		return getActivityRates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.activityRates</code> attribute. 
	 * @param value the activityRates
	 */
	public void setActivityRates(final SessionContext ctx, final Collection<ActivityRates> value)
	{
		ACTIVITYRATESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.activityRates</code> attribute. 
	 * @param value the activityRates
	 */
	public void setActivityRates(final Collection<ActivityRates> value)
	{
		setActivityRates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to activityRates. 
	 * @param value the item to add to activityRates
	 */
	public void addToActivityRates(final SessionContext ctx, final ActivityRates value)
	{
		ACTIVITYRATESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to activityRates. 
	 * @param value the item to add to activityRates
	 */
	public void addToActivityRates(final ActivityRates value)
	{
		addToActivityRates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from activityRates. 
	 * @param value the item to remove from activityRates
	 */
	public void removeFromActivityRates(final SessionContext ctx, final ActivityRates value)
	{
		ACTIVITYRATESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from activityRates. 
	 * @param value the item to remove from activityRates
	 */
	public void removeFromActivityRates(final ActivityRates value)
	{
		removeFromActivityRates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.activitySuppRateDef</code> attribute.
	 * @return the activitySuppRateDef
	 */
	public ActivitySupplierRateDefinition getActivitySuppRateDef(final SessionContext ctx)
	{
		return (ActivitySupplierRateDefinition)getProperty( ctx, ACTIVITYSUPPRATEDEF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.activitySuppRateDef</code> attribute.
	 * @return the activitySuppRateDef
	 */
	public ActivitySupplierRateDefinition getActivitySuppRateDef()
	{
		return getActivitySuppRateDef( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.activitySuppRateDef</code> attribute. 
	 * @param value the activitySuppRateDef
	 */
	public void setActivitySuppRateDef(final SessionContext ctx, final ActivitySupplierRateDefinition value)
	{
		ACTIVITYSUPPRATEDEFHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.activitySuppRateDef</code> attribute. 
	 * @param value the activitySuppRateDef
	 */
	public void setActivitySuppRateDef(final ActivitySupplierRateDefinition value)
	{
		setActivitySuppRateDef( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYSUPPRATEDEFHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.eventsAndTourInfos</code> attribute.
	 * @return the eventsAndTourInfos
	 */
	public Collection<EventsAndTourInfo> getEventsAndTourInfos(final SessionContext ctx)
	{
		return EVENTSANDTOURINFOSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.eventsAndTourInfos</code> attribute.
	 * @return the eventsAndTourInfos
	 */
	public Collection<EventsAndTourInfo> getEventsAndTourInfos()
	{
		return getEventsAndTourInfos( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.eventsAndTourInfos</code> attribute. 
	 * @param value the eventsAndTourInfos
	 */
	public void setEventsAndTourInfos(final SessionContext ctx, final Collection<EventsAndTourInfo> value)
	{
		EVENTSANDTOURINFOSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.eventsAndTourInfos</code> attribute. 
	 * @param value the eventsAndTourInfos
	 */
	public void setEventsAndTourInfos(final Collection<EventsAndTourInfo> value)
	{
		setEventsAndTourInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to eventsAndTourInfos. 
	 * @param value the item to add to eventsAndTourInfos
	 */
	public void addToEventsAndTourInfos(final SessionContext ctx, final EventsAndTourInfo value)
	{
		EVENTSANDTOURINFOSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to eventsAndTourInfos. 
	 * @param value the item to add to eventsAndTourInfos
	 */
	public void addToEventsAndTourInfos(final EventsAndTourInfo value)
	{
		addToEventsAndTourInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from eventsAndTourInfos. 
	 * @param value the item to remove from eventsAndTourInfos
	 */
	public void removeFromEventsAndTourInfos(final SessionContext ctx, final EventsAndTourInfo value)
	{
		EVENTSANDTOURINFOSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from eventsAndTourInfos. 
	 * @param value the item to remove from eventsAndTourInfos
	 */
	public void removeFromEventsAndTourInfos(final EventsAndTourInfo value)
	{
		removeFromEventsAndTourInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.maxPaxCount</code> attribute.
	 * @return the maxPaxCount
	 */
	public Integer getMaxPaxCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXPAXCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.maxPaxCount</code> attribute.
	 * @return the maxPaxCount
	 */
	public Integer getMaxPaxCount()
	{
		return getMaxPaxCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.maxPaxCount</code> attribute. 
	 * @return the maxPaxCount
	 */
	public int getMaxPaxCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxPaxCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.maxPaxCount</code> attribute. 
	 * @return the maxPaxCount
	 */
	public int getMaxPaxCountAsPrimitive()
	{
		return getMaxPaxCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.maxPaxCount</code> attribute. 
	 * @param value the maxPaxCount
	 */
	public void setMaxPaxCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXPAXCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.maxPaxCount</code> attribute. 
	 * @param value the maxPaxCount
	 */
	public void setMaxPaxCount(final Integer value)
	{
		setMaxPaxCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.maxPaxCount</code> attribute. 
	 * @param value the maxPaxCount
	 */
	public void setMaxPaxCount(final SessionContext ctx, final int value)
	{
		setMaxPaxCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.maxPaxCount</code> attribute. 
	 * @param value the maxPaxCount
	 */
	public void setMaxPaxCount(final int value)
	{
		setMaxPaxCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.minPaxCount</code> attribute.
	 * @return the minPaxCount
	 */
	public Integer getMinPaxCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINPAXCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.minPaxCount</code> attribute.
	 * @return the minPaxCount
	 */
	public Integer getMinPaxCount()
	{
		return getMinPaxCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.minPaxCount</code> attribute. 
	 * @return the minPaxCount
	 */
	public int getMinPaxCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinPaxCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.minPaxCount</code> attribute. 
	 * @return the minPaxCount
	 */
	public int getMinPaxCountAsPrimitive()
	{
		return getMinPaxCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.minPaxCount</code> attribute. 
	 * @param value the minPaxCount
	 */
	public void setMinPaxCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINPAXCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.minPaxCount</code> attribute. 
	 * @param value the minPaxCount
	 */
	public void setMinPaxCount(final Integer value)
	{
		setMinPaxCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.minPaxCount</code> attribute. 
	 * @param value the minPaxCount
	 */
	public void setMinPaxCount(final SessionContext ctx, final int value)
	{
		setMinPaxCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.minPaxCount</code> attribute. 
	 * @param value the minPaxCount
	 */
	public void setMinPaxCount(final int value)
	{
		setMinPaxCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.pickupAndDropOffs</code> attribute.
	 * @return the pickupAndDropOffs
	 */
	public Collection<PickupAndDropOff> getPickupAndDropOffs(final SessionContext ctx)
	{
		return PICKUPANDDROPOFFSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateDetailDefinition.pickupAndDropOffs</code> attribute.
	 * @return the pickupAndDropOffs
	 */
	public Collection<PickupAndDropOff> getPickupAndDropOffs()
	{
		return getPickupAndDropOffs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.pickupAndDropOffs</code> attribute. 
	 * @param value the pickupAndDropOffs
	 */
	public void setPickupAndDropOffs(final SessionContext ctx, final Collection<PickupAndDropOff> value)
	{
		PICKUPANDDROPOFFSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateDetailDefinition.pickupAndDropOffs</code> attribute. 
	 * @param value the pickupAndDropOffs
	 */
	public void setPickupAndDropOffs(final Collection<PickupAndDropOff> value)
	{
		setPickupAndDropOffs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pickupAndDropOffs. 
	 * @param value the item to add to pickupAndDropOffs
	 */
	public void addToPickupAndDropOffs(final SessionContext ctx, final PickupAndDropOff value)
	{
		PICKUPANDDROPOFFSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pickupAndDropOffs. 
	 * @param value the item to add to pickupAndDropOffs
	 */
	public void addToPickupAndDropOffs(final PickupAndDropOff value)
	{
		addToPickupAndDropOffs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pickupAndDropOffs. 
	 * @param value the item to remove from pickupAndDropOffs
	 */
	public void removeFromPickupAndDropOffs(final SessionContext ctx, final PickupAndDropOff value)
	{
		PICKUPANDDROPOFFSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pickupAndDropOffs. 
	 * @param value the item to remove from pickupAndDropOffs
	 */
	public void removeFromPickupAndDropOffs(final PickupAndDropOff value)
	{
		removeFromPickupAndDropOffs( getSession().getSessionContext(), value );
	}
	
}
