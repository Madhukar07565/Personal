/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.activity.inventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityCutoffAndCharges;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.activity.ActivitySupplierAdvanceDefinition;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.activity.inventory.core.jalo.ActivityPenaltyCharges ActivityPenaltyCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityPenaltyCharges extends GenericItem
{
	/** Qualifier of the <code>ActivityPenaltyCharges.definedBy</code> attribute **/
	public static final String DEFINEDBY = "definedBy";
	/** Qualifier of the <code>ActivityPenaltyCharges.appliedOn</code> attribute **/
	public static final String APPLIEDON = "appliedOn";
	/** Qualifier of the <code>ActivityPenaltyCharges.releaseTime</code> attribute **/
	public static final String RELEASETIME = "releaseTime";
	/** Qualifier of the <code>ActivityPenaltyCharges.utilizationThreshold</code> attribute **/
	public static final String UTILIZATIONTHRESHOLD = "utilizationThreshold";
	/** Qualifier of the <code>ActivityPenaltyCharges.utilizationThresholdOf</code> attribute **/
	public static final String UTILIZATIONTHRESHOLDOF = "utilizationThresholdOf";
	/** Qualifier of the <code>ActivityPenaltyCharges.specificDates</code> attribute **/
	public static final String SPECIFICDATES = "specificDates";
	/** Qualifier of the <code>ActivityPenaltyCharges.dateRange</code> attribute **/
	public static final String DATERANGE = "dateRange";
	/** Qualifier of the <code>ActivityPenaltyCharges.activitySupplierAdvanceDefinition</code> attribute **/
	public static final String ACTIVITYSUPPLIERADVANCEDEFINITION = "activitySupplierAdvanceDefinition";
	/** Qualifier of the <code>ActivityPenaltyCharges.charges</code> attribute **/
	public static final String CHARGES = "charges";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYSUPPLIERADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedActivityPenaltyCharges> ACTIVITYSUPPLIERADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedActivityPenaltyCharges>(
	ActivityinventorycoreConstants.TC.ACTIVITYPENALTYCHARGES,
	false,
	"activitySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ActivityCutoffAndCharges> CHARGESHANDLER = new OneToManyHandler<ActivityCutoffAndCharges>(
	ActivityinventorycoreConstants.TC.ACTIVITYCUTOFFANDCHARGES,
	false,
	"activityPenaltyCharges",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DEFINEDBY, AttributeMode.INITIAL);
		tmp.put(APPLIEDON, AttributeMode.INITIAL);
		tmp.put(RELEASETIME, AttributeMode.INITIAL);
		tmp.put(UTILIZATIONTHRESHOLD, AttributeMode.INITIAL);
		tmp.put(UTILIZATIONTHRESHOLDOF, AttributeMode.INITIAL);
		tmp.put(SPECIFICDATES, AttributeMode.INITIAL);
		tmp.put(DATERANGE, AttributeMode.INITIAL);
		tmp.put(ACTIVITYSUPPLIERADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.activitySupplierAdvanceDefinition</code> attribute.
	 * @return the activitySupplierAdvanceDefinition
	 */
	public ActivitySupplierAdvanceDefinition getActivitySupplierAdvanceDefinition(final SessionContext ctx)
	{
		return (ActivitySupplierAdvanceDefinition)getProperty( ctx, ACTIVITYSUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.activitySupplierAdvanceDefinition</code> attribute.
	 * @return the activitySupplierAdvanceDefinition
	 */
	public ActivitySupplierAdvanceDefinition getActivitySupplierAdvanceDefinition()
	{
		return getActivitySupplierAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.activitySupplierAdvanceDefinition</code> attribute. 
	 * @param value the activitySupplierAdvanceDefinition
	 */
	public void setActivitySupplierAdvanceDefinition(final SessionContext ctx, final ActivitySupplierAdvanceDefinition value)
	{
		ACTIVITYSUPPLIERADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.activitySupplierAdvanceDefinition</code> attribute. 
	 * @param value the activitySupplierAdvanceDefinition
	 */
	public void setActivitySupplierAdvanceDefinition(final ActivitySupplierAdvanceDefinition value)
	{
		setActivitySupplierAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.appliedOn</code> attribute.
	 * @return the appliedOn - Applied 
	 * 						On
	 */
	public EnumerationValue getAppliedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPLIEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.appliedOn</code> attribute.
	 * @return the appliedOn - Applied 
	 * 						On
	 */
	public EnumerationValue getAppliedOn()
	{
		return getAppliedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.appliedOn</code> attribute. 
	 * @param value the appliedOn - Applied 
	 * 						On
	 */
	public void setAppliedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPLIEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.appliedOn</code> attribute. 
	 * @param value the appliedOn - Applied 
	 * 						On
	 */
	public void setAppliedOn(final EnumerationValue value)
	{
		setAppliedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.charges</code> attribute.
	 * @return the charges
	 */
	public Collection<ActivityCutoffAndCharges> getCharges(final SessionContext ctx)
	{
		return CHARGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.charges</code> attribute.
	 * @return the charges
	 */
	public Collection<ActivityCutoffAndCharges> getCharges()
	{
		return getCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.charges</code> attribute. 
	 * @param value the charges
	 */
	public void setCharges(final SessionContext ctx, final Collection<ActivityCutoffAndCharges> value)
	{
		CHARGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.charges</code> attribute. 
	 * @param value the charges
	 */
	public void setCharges(final Collection<ActivityCutoffAndCharges> value)
	{
		setCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to charges. 
	 * @param value the item to add to charges
	 */
	public void addToCharges(final SessionContext ctx, final ActivityCutoffAndCharges value)
	{
		CHARGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to charges. 
	 * @param value the item to add to charges
	 */
	public void addToCharges(final ActivityCutoffAndCharges value)
	{
		addToCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from charges. 
	 * @param value the item to remove from charges
	 */
	public void removeFromCharges(final SessionContext ctx, final ActivityCutoffAndCharges value)
	{
		CHARGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from charges. 
	 * @param value the item to remove from charges
	 */
	public void removeFromCharges(final ActivityCutoffAndCharges value)
	{
		removeFromCharges( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYSUPPLIERADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.dateRange</code> attribute.
	 * @return the dateRange - Date Range
	 */
	public StandardDateRange getDateRange(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, DATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.dateRange</code> attribute.
	 * @return the dateRange - Date Range
	 */
	public StandardDateRange getDateRange()
	{
		return getDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.dateRange</code> attribute. 
	 * @param value the dateRange - Date Range
	 */
	public void setDateRange(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, DATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.dateRange</code> attribute. 
	 * @param value the dateRange - Date Range
	 */
	public void setDateRange(final StandardDateRange value)
	{
		setDateRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.definedBy</code> attribute.
	 * @return the definedBy - Policy 
	 * 						Defined By Type
	 */
	public EnumerationValue getDefinedBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DEFINEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.definedBy</code> attribute.
	 * @return the definedBy - Policy 
	 * 						Defined By Type
	 */
	public EnumerationValue getDefinedBy()
	{
		return getDefinedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.definedBy</code> attribute. 
	 * @param value the definedBy - Policy 
	 * 						Defined By Type
	 */
	public void setDefinedBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DEFINEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.definedBy</code> attribute. 
	 * @param value the definedBy - Policy 
	 * 						Defined By Type
	 */
	public void setDefinedBy(final EnumerationValue value)
	{
		setDefinedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.releaseTime</code> attribute.
	 * @return the releaseTime - Release Time
	 */
	public String getReleaseTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RELEASETIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.releaseTime</code> attribute.
	 * @return the releaseTime - Release Time
	 */
	public String getReleaseTime()
	{
		return getReleaseTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.releaseTime</code> attribute. 
	 * @param value the releaseTime - Release Time
	 */
	public void setReleaseTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RELEASETIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.releaseTime</code> attribute. 
	 * @param value the releaseTime - Release Time
	 */
	public void setReleaseTime(final String value)
	{
		setReleaseTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.specificDates</code> attribute.
	 * @return the specificDates - Specific Dates
	 */
	public Collection<Date> getSpecificDates(final SessionContext ctx)
	{
		Collection<Date> coll = (Collection<Date>)getProperty( ctx, SPECIFICDATES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.specificDates</code> attribute.
	 * @return the specificDates - Specific Dates
	 */
	public Collection<Date> getSpecificDates()
	{
		return getSpecificDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.specificDates</code> attribute. 
	 * @param value the specificDates - Specific Dates
	 */
	public void setSpecificDates(final SessionContext ctx, final Collection<Date> value)
	{
		setProperty(ctx, SPECIFICDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.specificDates</code> attribute. 
	 * @param value the specificDates - Specific Dates
	 */
	public void setSpecificDates(final Collection<Date> value)
	{
		setSpecificDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.utilizationThreshold</code> attribute.
	 * @return the utilizationThreshold - Utilization Threshold
	 */
	public Long getUtilizationThreshold(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, UTILIZATIONTHRESHOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.utilizationThreshold</code> attribute.
	 * @return the utilizationThreshold - Utilization Threshold
	 */
	public Long getUtilizationThreshold()
	{
		return getUtilizationThreshold( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.utilizationThreshold</code> attribute. 
	 * @return the utilizationThreshold - Utilization Threshold
	 */
	public long getUtilizationThresholdAsPrimitive(final SessionContext ctx)
	{
		Long value = getUtilizationThreshold( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.utilizationThreshold</code> attribute. 
	 * @return the utilizationThreshold - Utilization Threshold
	 */
	public long getUtilizationThresholdAsPrimitive()
	{
		return getUtilizationThresholdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.utilizationThreshold</code> attribute. 
	 * @param value the utilizationThreshold - Utilization Threshold
	 */
	public void setUtilizationThreshold(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, UTILIZATIONTHRESHOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.utilizationThreshold</code> attribute. 
	 * @param value the utilizationThreshold - Utilization Threshold
	 */
	public void setUtilizationThreshold(final Long value)
	{
		setUtilizationThreshold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.utilizationThreshold</code> attribute. 
	 * @param value the utilizationThreshold - Utilization Threshold
	 */
	public void setUtilizationThreshold(final SessionContext ctx, final long value)
	{
		setUtilizationThreshold( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.utilizationThreshold</code> attribute. 
	 * @param value the utilizationThreshold - Utilization Threshold
	 */
	public void setUtilizationThreshold(final long value)
	{
		setUtilizationThreshold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.utilizationThresholdOf</code> attribute.
	 * @return the utilizationThresholdOf - Utilization Threshold Of
	 */
	public EnumerationValue getUtilizationThresholdOf(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UTILIZATIONTHRESHOLDOF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityPenaltyCharges.utilizationThresholdOf</code> attribute.
	 * @return the utilizationThresholdOf - Utilization Threshold Of
	 */
	public EnumerationValue getUtilizationThresholdOf()
	{
		return getUtilizationThresholdOf( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.utilizationThresholdOf</code> attribute. 
	 * @param value the utilizationThresholdOf - Utilization Threshold Of
	 */
	public void setUtilizationThresholdOf(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UTILIZATIONTHRESHOLDOF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityPenaltyCharges.utilizationThresholdOf</code> attribute. 
	 * @param value the utilizationThresholdOf - Utilization Threshold Of
	 */
	public void setUtilizationThresholdOf(final EnumerationValue value)
	{
		setUtilizationThresholdOf( getSession().getSessionContext(), value );
	}
	
}
