/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.activity.inventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import com.cnk.travelogix.activity.inventory.core.jalo.AbstractActivityCompanySpecificInventory;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityClientInventoryDistribution;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityCompanyAdvanceDefinition;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityCompanyPenaltyCharges;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityCutoffAndCharges;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityFreeOfCostSeatsOrTickets;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityInventoryDefinition;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityOtherCompanyInventoryDistribution;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityPenaltyCharges;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityWithinCompanyInventoryDistribution;
import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory;
import com.cnk.travelogix.common.inventory.core.jalo.ChangeRequestPenaltyCharges;
import com.cnk.travelogix.datamodel.activityinventory.core.jalo.ActivitiesDate;
import com.cnk.travelogix.datamodel.activityinventory.core.jalo.ActivityInventoryDetail;
import com.cnk.travelogix.datamodel.activityinventory.core.jalo.ActivityInventoryRequest;
import com.cnk.travelogix.datamodel.activityinventory.core.jalo.ActivityPaxOrSeatDetail;
import com.cnk.travelogix.datamodel.activityinventory.core.jalo.ActivityTicketDetail;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.SupplierCommercialAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.activity.ActivitySupplierAdvanceDefinition;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>ActivityinventorycoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityinventorycoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n CHANGEREQUESTPENALTYCHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ChangeRequestPenaltyCharges> ACTIVITYSUPPLIERADVANCEDEFINITIONTOCHANGEREQUESTPENALTYCHARGESCHANGEREQUESTPENALTYCHARGESHANDLER = new OneToManyHandler<ChangeRequestPenaltyCharges>(
	CommoninventorycoreConstants.TC.CHANGEREQUESTPENALTYCHARGES,
	false,
	"activitySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PENALTYCHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ActivityPenaltyCharges> ACTIVITYSUPPLIERADVANCEDEFINITIONTOPENALTYCHARGESPENALTYCHARGESHANDLER = new OneToManyHandler<ActivityPenaltyCharges>(
	ActivityinventorycoreConstants.TC.ACTIVITYPENALTYCHARGES,
	false,
	"activitySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("blockOutDates", AttributeMode.INITIAL);
		tmp.put("activityFreeOfCostSeatsOrTickets", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.activity.ActivitySupplierAdvanceDefinition", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("activitySupplierAdvanceDefinition", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.common.inventory.core.jalo.ChangeRequestPenaltyCharges", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("abstractActivityCompanySpecificInventory", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.abstractActivityCompanySpecificInventory</code> attribute.
	 * @return the abstractActivityCompanySpecificInventory
	 */
	public AbstractActivityCompanySpecificInventory getAbstractActivityCompanySpecificInventory(final SessionContext ctx, final AssociateInventory item)
	{
		return (AbstractActivityCompanySpecificInventory)item.getProperty( ctx, ActivityinventorycoreConstants.Attributes.AssociateInventory.ABSTRACTACTIVITYCOMPANYSPECIFICINVENTORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.abstractActivityCompanySpecificInventory</code> attribute.
	 * @return the abstractActivityCompanySpecificInventory
	 */
	public AbstractActivityCompanySpecificInventory getAbstractActivityCompanySpecificInventory(final AssociateInventory item)
	{
		return getAbstractActivityCompanySpecificInventory( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.abstractActivityCompanySpecificInventory</code> attribute. 
	 * @param value the abstractActivityCompanySpecificInventory
	 */
	public void setAbstractActivityCompanySpecificInventory(final SessionContext ctx, final AssociateInventory item, final AbstractActivityCompanySpecificInventory value)
	{
		item.setProperty(ctx, ActivityinventorycoreConstants.Attributes.AssociateInventory.ABSTRACTACTIVITYCOMPANYSPECIFICINVENTORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.abstractActivityCompanySpecificInventory</code> attribute. 
	 * @param value the abstractActivityCompanySpecificInventory
	 */
	public void setAbstractActivityCompanySpecificInventory(final AssociateInventory item, final AbstractActivityCompanySpecificInventory value)
	{
		setAbstractActivityCompanySpecificInventory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierAdvanceDefinition.activityFreeOfCostSeatsOrTickets</code> attribute.
	 * @return the activityFreeOfCostSeatsOrTickets - Activity Free Of Cost Seats Or Tickets
	 */
	public ActivityFreeOfCostSeatsOrTickets getActivityFreeOfCostSeatsOrTickets(final SessionContext ctx, final ActivitySupplierAdvanceDefinition item)
	{
		return (ActivityFreeOfCostSeatsOrTickets)item.getProperty( ctx, ActivityinventorycoreConstants.Attributes.ActivitySupplierAdvanceDefinition.ACTIVITYFREEOFCOSTSEATSORTICKETS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierAdvanceDefinition.activityFreeOfCostSeatsOrTickets</code> attribute.
	 * @return the activityFreeOfCostSeatsOrTickets - Activity Free Of Cost Seats Or Tickets
	 */
	public ActivityFreeOfCostSeatsOrTickets getActivityFreeOfCostSeatsOrTickets(final ActivitySupplierAdvanceDefinition item)
	{
		return getActivityFreeOfCostSeatsOrTickets( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierAdvanceDefinition.activityFreeOfCostSeatsOrTickets</code> attribute. 
	 * @param value the activityFreeOfCostSeatsOrTickets - Activity Free Of Cost Seats Or Tickets
	 */
	public void setActivityFreeOfCostSeatsOrTickets(final SessionContext ctx, final ActivitySupplierAdvanceDefinition item, final ActivityFreeOfCostSeatsOrTickets value)
	{
		item.setProperty(ctx, ActivityinventorycoreConstants.Attributes.ActivitySupplierAdvanceDefinition.ACTIVITYFREEOFCOSTSEATSORTICKETS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierAdvanceDefinition.activityFreeOfCostSeatsOrTickets</code> attribute. 
	 * @param value the activityFreeOfCostSeatsOrTickets - Activity Free Of Cost Seats Or Tickets
	 */
	public void setActivityFreeOfCostSeatsOrTickets(final ActivitySupplierAdvanceDefinition item, final ActivityFreeOfCostSeatsOrTickets value)
	{
		setActivityFreeOfCostSeatsOrTickets( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChangeRequestPenaltyCharges.activitySupplierAdvanceDefinition</code> attribute.
	 * @return the activitySupplierAdvanceDefinition
	 */
	public ActivitySupplierAdvanceDefinition getActivitySupplierAdvanceDefinition(final SessionContext ctx, final ChangeRequestPenaltyCharges item)
	{
		return (ActivitySupplierAdvanceDefinition)item.getProperty( ctx, ActivityinventorycoreConstants.Attributes.ChangeRequestPenaltyCharges.ACTIVITYSUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChangeRequestPenaltyCharges.activitySupplierAdvanceDefinition</code> attribute.
	 * @return the activitySupplierAdvanceDefinition
	 */
	public ActivitySupplierAdvanceDefinition getActivitySupplierAdvanceDefinition(final ChangeRequestPenaltyCharges item)
	{
		return getActivitySupplierAdvanceDefinition( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChangeRequestPenaltyCharges.activitySupplierAdvanceDefinition</code> attribute. 
	 * @param value the activitySupplierAdvanceDefinition
	 */
	public void setActivitySupplierAdvanceDefinition(final SessionContext ctx, final ChangeRequestPenaltyCharges item, final ActivitySupplierAdvanceDefinition value)
	{
		item.setProperty(ctx, ActivityinventorycoreConstants.Attributes.ChangeRequestPenaltyCharges.ACTIVITYSUPPLIERADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChangeRequestPenaltyCharges.activitySupplierAdvanceDefinition</code> attribute. 
	 * @param value the activitySupplierAdvanceDefinition
	 */
	public void setActivitySupplierAdvanceDefinition(final ChangeRequestPenaltyCharges item, final ActivitySupplierAdvanceDefinition value)
	{
		setActivitySupplierAdvanceDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierAdvanceDefinition.blockOutDates</code> attribute.
	 * @return the blockOutDates - Block out Dates
	 */
	public StandardDateRange getBlockOutDates(final SessionContext ctx, final ActivitySupplierAdvanceDefinition item)
	{
		return (StandardDateRange)item.getProperty( ctx, ActivityinventorycoreConstants.Attributes.ActivitySupplierAdvanceDefinition.BLOCKOUTDATES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierAdvanceDefinition.blockOutDates</code> attribute.
	 * @return the blockOutDates - Block out Dates
	 */
	public StandardDateRange getBlockOutDates(final ActivitySupplierAdvanceDefinition item)
	{
		return getBlockOutDates( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierAdvanceDefinition.blockOutDates</code> attribute. 
	 * @param value the blockOutDates - Block out Dates
	 */
	public void setBlockOutDates(final SessionContext ctx, final ActivitySupplierAdvanceDefinition item, final StandardDateRange value)
	{
		item.setProperty(ctx, ActivityinventorycoreConstants.Attributes.ActivitySupplierAdvanceDefinition.BLOCKOUTDATES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierAdvanceDefinition.blockOutDates</code> attribute. 
	 * @param value the blockOutDates - Block out Dates
	 */
	public void setBlockOutDates(final ActivitySupplierAdvanceDefinition item, final StandardDateRange value)
	{
		setBlockOutDates( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierAdvanceDefinition.changeRequestPenaltyCharges</code> attribute.
	 * @return the changeRequestPenaltyCharges
	 */
	public Collection<ChangeRequestPenaltyCharges> getChangeRequestPenaltyCharges(final SessionContext ctx, final ActivitySupplierAdvanceDefinition item)
	{
		return ACTIVITYSUPPLIERADVANCEDEFINITIONTOCHANGEREQUESTPENALTYCHARGESCHANGEREQUESTPENALTYCHARGESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierAdvanceDefinition.changeRequestPenaltyCharges</code> attribute.
	 * @return the changeRequestPenaltyCharges
	 */
	public Collection<ChangeRequestPenaltyCharges> getChangeRequestPenaltyCharges(final ActivitySupplierAdvanceDefinition item)
	{
		return getChangeRequestPenaltyCharges( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierAdvanceDefinition.changeRequestPenaltyCharges</code> attribute. 
	 * @param value the changeRequestPenaltyCharges
	 */
	public void setChangeRequestPenaltyCharges(final SessionContext ctx, final ActivitySupplierAdvanceDefinition item, final Collection<ChangeRequestPenaltyCharges> value)
	{
		ACTIVITYSUPPLIERADVANCEDEFINITIONTOCHANGEREQUESTPENALTYCHARGESCHANGEREQUESTPENALTYCHARGESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierAdvanceDefinition.changeRequestPenaltyCharges</code> attribute. 
	 * @param value the changeRequestPenaltyCharges
	 */
	public void setChangeRequestPenaltyCharges(final ActivitySupplierAdvanceDefinition item, final Collection<ChangeRequestPenaltyCharges> value)
	{
		setChangeRequestPenaltyCharges( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to changeRequestPenaltyCharges. 
	 * @param value the item to add to changeRequestPenaltyCharges
	 */
	public void addToChangeRequestPenaltyCharges(final SessionContext ctx, final ActivitySupplierAdvanceDefinition item, final ChangeRequestPenaltyCharges value)
	{
		ACTIVITYSUPPLIERADVANCEDEFINITIONTOCHANGEREQUESTPENALTYCHARGESCHANGEREQUESTPENALTYCHARGESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to changeRequestPenaltyCharges. 
	 * @param value the item to add to changeRequestPenaltyCharges
	 */
	public void addToChangeRequestPenaltyCharges(final ActivitySupplierAdvanceDefinition item, final ChangeRequestPenaltyCharges value)
	{
		addToChangeRequestPenaltyCharges( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from changeRequestPenaltyCharges. 
	 * @param value the item to remove from changeRequestPenaltyCharges
	 */
	public void removeFromChangeRequestPenaltyCharges(final SessionContext ctx, final ActivitySupplierAdvanceDefinition item, final ChangeRequestPenaltyCharges value)
	{
		ACTIVITYSUPPLIERADVANCEDEFINITIONTOCHANGEREQUESTPENALTYCHARGESCHANGEREQUESTPENALTYCHARGESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from changeRequestPenaltyCharges. 
	 * @param value the item to remove from changeRequestPenaltyCharges
	 */
	public void removeFromChangeRequestPenaltyCharges(final ActivitySupplierAdvanceDefinition item, final ChangeRequestPenaltyCharges value)
	{
		removeFromChangeRequestPenaltyCharges( getSession().getSessionContext(), item, value );
	}
	
	public ActivitiesDate createActivitiesDate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityinventorycoreConstants.TC.ACTIVITIESDATE );
			return (ActivitiesDate)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivitiesDate : "+e.getMessage(), 0 );
		}
	}
	
	public ActivitiesDate createActivitiesDate(final Map attributeValues)
	{
		return createActivitiesDate( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityClientInventoryDistribution createActivityClientInventoryDistribution(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityinventorycoreConstants.TC.ACTIVITYCLIENTINVENTORYDISTRIBUTION );
			return (ActivityClientInventoryDistribution)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivityClientInventoryDistribution : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityClientInventoryDistribution createActivityClientInventoryDistribution(final Map attributeValues)
	{
		return createActivityClientInventoryDistribution( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityCompanyAdvanceDefinition createActivityCompanyAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityinventorycoreConstants.TC.ACTIVITYCOMPANYADVANCEDEFINITION );
			return (ActivityCompanyAdvanceDefinition)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivityCompanyAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityCompanyAdvanceDefinition createActivityCompanyAdvanceDefinition(final Map attributeValues)
	{
		return createActivityCompanyAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityCompanyPenaltyCharges createActivityCompanyPenaltyCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityinventorycoreConstants.TC.ACTIVITYCOMPANYPENALTYCHARGES );
			return (ActivityCompanyPenaltyCharges)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivityCompanyPenaltyCharges : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityCompanyPenaltyCharges createActivityCompanyPenaltyCharges(final Map attributeValues)
	{
		return createActivityCompanyPenaltyCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityCutoffAndCharges createActivityCutoffAndCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityinventorycoreConstants.TC.ACTIVITYCUTOFFANDCHARGES );
			return (ActivityCutoffAndCharges)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivityCutoffAndCharges : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityCutoffAndCharges createActivityCutoffAndCharges(final Map attributeValues)
	{
		return createActivityCutoffAndCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityFreeOfCostSeatsOrTickets createActivityFreeOfCostSeatsOrTickets(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityinventorycoreConstants.TC.ACTIVITYFREEOFCOSTSEATSORTICKETS );
			return (ActivityFreeOfCostSeatsOrTickets)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivityFreeOfCostSeatsOrTickets : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityFreeOfCostSeatsOrTickets createActivityFreeOfCostSeatsOrTickets(final Map attributeValues)
	{
		return createActivityFreeOfCostSeatsOrTickets( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityInventoryDefinition createActivityInventoryDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityinventorycoreConstants.TC.ACTIVITYINVENTORYDEFINITION );
			return (ActivityInventoryDefinition)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivityInventoryDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityInventoryDefinition createActivityInventoryDefinition(final Map attributeValues)
	{
		return createActivityInventoryDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityInventoryDetail createActivityInventoryDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityinventorycoreConstants.TC.ACTIVITYINVENTORYDETAIL );
			return (ActivityInventoryDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivityInventoryDetail : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityInventoryDetail createActivityInventoryDetail(final Map attributeValues)
	{
		return createActivityInventoryDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityInventoryRequest createActivityInventoryRequest(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityinventorycoreConstants.TC.ACTIVITYINVENTORYREQUEST );
			return (ActivityInventoryRequest)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivityInventoryRequest : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityInventoryRequest createActivityInventoryRequest(final Map attributeValues)
	{
		return createActivityInventoryRequest( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityOtherCompanyInventoryDistribution createActivityOtherCompanyInventoryDistribution(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityinventorycoreConstants.TC.ACTIVITYOTHERCOMPANYINVENTORYDISTRIBUTION );
			return (ActivityOtherCompanyInventoryDistribution)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivityOtherCompanyInventoryDistribution : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityOtherCompanyInventoryDistribution createActivityOtherCompanyInventoryDistribution(final Map attributeValues)
	{
		return createActivityOtherCompanyInventoryDistribution( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityPaxOrSeatDetail createActivityPaxOrSeatDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityinventorycoreConstants.TC.ACTIVITYPAXORSEATDETAIL );
			return (ActivityPaxOrSeatDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivityPaxOrSeatDetail : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityPaxOrSeatDetail createActivityPaxOrSeatDetail(final Map attributeValues)
	{
		return createActivityPaxOrSeatDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityPenaltyCharges createActivityPenaltyCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityinventorycoreConstants.TC.ACTIVITYPENALTYCHARGES );
			return (ActivityPenaltyCharges)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivityPenaltyCharges : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityPenaltyCharges createActivityPenaltyCharges(final Map attributeValues)
	{
		return createActivityPenaltyCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityTicketDetail createActivityTicketDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityinventorycoreConstants.TC.ACTIVITYTICKETDETAIL );
			return (ActivityTicketDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivityTicketDetail : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityTicketDetail createActivityTicketDetail(final Map attributeValues)
	{
		return createActivityTicketDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityWithinCompanyInventoryDistribution createActivityWithinCompanyInventoryDistribution(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ActivityinventorycoreConstants.TC.ACTIVITYWITHINCOMPANYINVENTORYDISTRIBUTION );
			return (ActivityWithinCompanyInventoryDistribution)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ActivityWithinCompanyInventoryDistribution : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityWithinCompanyInventoryDistribution createActivityWithinCompanyInventoryDistribution(final Map attributeValues)
	{
		return createActivityWithinCompanyInventoryDistribution( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return ActivityinventorycoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<ActivityPenaltyCharges> getPenaltyCharges(final SessionContext ctx, final ActivitySupplierAdvanceDefinition item)
	{
		return ACTIVITYSUPPLIERADVANCEDEFINITIONTOPENALTYCHARGESPENALTYCHARGESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<ActivityPenaltyCharges> getPenaltyCharges(final ActivitySupplierAdvanceDefinition item)
	{
		return getPenaltyCharges( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final SessionContext ctx, final ActivitySupplierAdvanceDefinition item, final Collection<ActivityPenaltyCharges> value)
	{
		ACTIVITYSUPPLIERADVANCEDEFINITIONTOPENALTYCHARGESPENALTYCHARGESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final ActivitySupplierAdvanceDefinition item, final Collection<ActivityPenaltyCharges> value)
	{
		setPenaltyCharges( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final SessionContext ctx, final ActivitySupplierAdvanceDefinition item, final ActivityPenaltyCharges value)
	{
		ACTIVITYSUPPLIERADVANCEDEFINITIONTOPENALTYCHARGESPENALTYCHARGESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final ActivitySupplierAdvanceDefinition item, final ActivityPenaltyCharges value)
	{
		addToPenaltyCharges( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final SessionContext ctx, final ActivitySupplierAdvanceDefinition item, final ActivityPenaltyCharges value)
	{
		ACTIVITYSUPPLIERADVANCEDEFINITIONTOPENALTYCHARGESPENALTYCHARGESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final ActivitySupplierAdvanceDefinition item, final ActivityPenaltyCharges value)
	{
		removeFromPenaltyCharges( getSession().getSessionContext(), item, value );
	}
	
}
