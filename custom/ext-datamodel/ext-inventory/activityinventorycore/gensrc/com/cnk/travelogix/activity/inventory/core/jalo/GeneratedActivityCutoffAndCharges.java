/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.activity.inventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityPenaltyCharges;
import com.cnk.travelogix.common.inventory.core.jalo.CutOffsAndCharges;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.activity.inventory.core.jalo.ActivityCutoffAndCharges ActivityCutoffAndCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityCutoffAndCharges extends CutOffsAndCharges
{
	/** Qualifier of the <code>ActivityCutoffAndCharges.activityPenaltyCharges</code> attribute **/
	public static final String ACTIVITYPENALTYCHARGES = "activityPenaltyCharges";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPENALTYCHARGES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedActivityCutoffAndCharges> ACTIVITYPENALTYCHARGESHANDLER = new BidirectionalOneToManyHandler<GeneratedActivityCutoffAndCharges>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CutOffsAndCharges.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ACTIVITYPENALTYCHARGES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityCutoffAndCharges.activityPenaltyCharges</code> attribute.
	 * @return the activityPenaltyCharges
	 */
	public ActivityPenaltyCharges getActivityPenaltyCharges(final SessionContext ctx)
	{
		return (ActivityPenaltyCharges)getProperty( ctx, ACTIVITYPENALTYCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityCutoffAndCharges.activityPenaltyCharges</code> attribute.
	 * @return the activityPenaltyCharges
	 */
	public ActivityPenaltyCharges getActivityPenaltyCharges()
	{
		return getActivityPenaltyCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityCutoffAndCharges.activityPenaltyCharges</code> attribute. 
	 * @param value the activityPenaltyCharges
	 */
	public void setActivityPenaltyCharges(final SessionContext ctx, final ActivityPenaltyCharges value)
	{
		ACTIVITYPENALTYCHARGESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityCutoffAndCharges.activityPenaltyCharges</code> attribute. 
	 * @param value the activityPenaltyCharges
	 */
	public void setActivityPenaltyCharges(final ActivityPenaltyCharges value)
	{
		setActivityPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYPENALTYCHARGESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
}
