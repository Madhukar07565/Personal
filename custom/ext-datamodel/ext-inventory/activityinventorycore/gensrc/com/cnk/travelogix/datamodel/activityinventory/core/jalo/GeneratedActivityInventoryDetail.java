/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.activityinventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityInventoryDefinition;
import com.cnk.travelogix.datamodel.activityinventory.core.jalo.AbstractActivityInventoryDetail;
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
 * Generated class for type {@link com.cnk.travelogix.datamodel.activityinventory.core.jalo.ActivityInventoryDetail ActivityInventoryDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityInventoryDetail extends AbstractActivityInventoryDetail
{
	/** Qualifier of the <code>ActivityInventoryDetail.activityInventoryDefinition</code> attribute **/
	public static final String ACTIVITYINVENTORYDEFINITION = "activityInventoryDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYINVENTORYDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedActivityInventoryDetail> ACTIVITYINVENTORYDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedActivityInventoryDetail>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractActivityInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ACTIVITYINVENTORYDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDetail.activityInventoryDefinition</code> attribute.
	 * @return the activityInventoryDefinition
	 */
	public ActivityInventoryDefinition getActivityInventoryDefinition(final SessionContext ctx)
	{
		return (ActivityInventoryDefinition)getProperty( ctx, ACTIVITYINVENTORYDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryDetail.activityInventoryDefinition</code> attribute.
	 * @return the activityInventoryDefinition
	 */
	public ActivityInventoryDefinition getActivityInventoryDefinition()
	{
		return getActivityInventoryDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDetail.activityInventoryDefinition</code> attribute. 
	 * @param value the activityInventoryDefinition
	 */
	public void setActivityInventoryDefinition(final SessionContext ctx, final ActivityInventoryDefinition value)
	{
		ACTIVITYINVENTORYDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryDetail.activityInventoryDefinition</code> attribute. 
	 * @param value the activityInventoryDefinition
	 */
	public void setActivityInventoryDefinition(final ActivityInventoryDefinition value)
	{
		setActivityInventoryDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYINVENTORYDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
}
