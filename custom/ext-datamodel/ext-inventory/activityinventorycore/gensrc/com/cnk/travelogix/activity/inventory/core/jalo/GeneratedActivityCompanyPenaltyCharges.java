/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.activity.inventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityCompanyAdvanceDefinition;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityPenaltyCharges;
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
 * Generated class for type {@link com.cnk.travelogix.activity.inventory.core.jalo.ActivityCompanyPenaltyCharges ActivityCompanyPenaltyCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityCompanyPenaltyCharges extends ActivityPenaltyCharges
{
	/** Qualifier of the <code>ActivityCompanyPenaltyCharges.activityCompanyAdvanceDefinition</code> attribute **/
	public static final String ACTIVITYCOMPANYADVANCEDEFINITION = "activityCompanyAdvanceDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYCOMPANYADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedActivityCompanyPenaltyCharges> ACTIVITYCOMPANYADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedActivityCompanyPenaltyCharges>(
	ActivityinventorycoreConstants.TC.ACTIVITYCOMPANYPENALTYCHARGES,
	false,
	"activityCompanyAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ActivityPenaltyCharges.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ACTIVITYCOMPANYADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityCompanyPenaltyCharges.activityCompanyAdvanceDefinition</code> attribute.
	 * @return the activityCompanyAdvanceDefinition
	 */
	public ActivityCompanyAdvanceDefinition getActivityCompanyAdvanceDefinition(final SessionContext ctx)
	{
		return (ActivityCompanyAdvanceDefinition)getProperty( ctx, ACTIVITYCOMPANYADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityCompanyPenaltyCharges.activityCompanyAdvanceDefinition</code> attribute.
	 * @return the activityCompanyAdvanceDefinition
	 */
	public ActivityCompanyAdvanceDefinition getActivityCompanyAdvanceDefinition()
	{
		return getActivityCompanyAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityCompanyPenaltyCharges.activityCompanyAdvanceDefinition</code> attribute. 
	 * @param value the activityCompanyAdvanceDefinition
	 */
	public void setActivityCompanyAdvanceDefinition(final SessionContext ctx, final ActivityCompanyAdvanceDefinition value)
	{
		ACTIVITYCOMPANYADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityCompanyPenaltyCharges.activityCompanyAdvanceDefinition</code> attribute. 
	 * @param value the activityCompanyAdvanceDefinition
	 */
	public void setActivityCompanyAdvanceDefinition(final ActivityCompanyAdvanceDefinition value)
	{
		setActivityCompanyAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYCOMPANYADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
}
