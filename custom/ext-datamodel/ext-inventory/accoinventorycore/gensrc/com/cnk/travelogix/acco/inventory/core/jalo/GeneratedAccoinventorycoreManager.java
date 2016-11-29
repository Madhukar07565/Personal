/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.acco.inventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import com.cnk.travelogix.acco.inventory.core.jalo.AccoInventoryGrid;
import com.cnk.travelogix.accoinventory.core.jalo.AbstractAccoCompanySpecificInventory;
import com.cnk.travelogix.accoinventory.core.jalo.AbstractAccoInventoryDetail;
import com.cnk.travelogix.accoinventory.core.jalo.AccoClientInventoryDistribution;
import com.cnk.travelogix.accoinventory.core.jalo.AccoCompanyAdvanceDefinition;
import com.cnk.travelogix.accoinventory.core.jalo.AccoCompanyPenaltyCharges;
import com.cnk.travelogix.accoinventory.core.jalo.AccoCutoffAndCharges;
import com.cnk.travelogix.accoinventory.core.jalo.AccoInventoryDefinition;
import com.cnk.travelogix.accoinventory.core.jalo.AccoInventoryDetail;
import com.cnk.travelogix.accoinventory.core.jalo.AccoOtherCompanyInventoryDistribution;
import com.cnk.travelogix.accoinventory.core.jalo.AccoPenaltyChargesForAmendments;
import com.cnk.travelogix.accoinventory.core.jalo.AccoPenaltyChargesRelease;
import com.cnk.travelogix.accoinventory.core.jalo.AccoWithinCompanyInventoryDistribution;
import com.cnk.travelogix.accoinventory.core.jalo.AccommodationInventoryRequest;
import com.cnk.travelogix.accoinventory.core.jalo.InventoryRoomInfo;
import com.cnk.travelogix.accoinventory.core.jalo.RoomingListCutOffs;
import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.AccoAssociateInventory;
import com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory;
import com.cnk.travelogix.common.inventory.core.jalo.CutOffForFreeSale;
import com.cnk.travelogix.common.inventory.jalo.OverBookingLimit;
import com.cnk.travelogix.product.common.core.jalo.Accommodation;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.SupplierCommercialAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.AccoSupplierAdvanceDefinition;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>AccoinventorycoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoinventorycoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n PENALTYCHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AccoPenaltyChargesRelease> ACCOSUPPLIERADVANCEDEFINITIONTOACCOPENALTYCHARGESRELEASEPENALTYCHARGESHANDLER = new OneToManyHandler<AccoPenaltyChargesRelease>(
	AccoinventorycoreConstants.TC.ACCOPENALTYCHARGESRELEASE,
	false,
	"accoSupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n OVERBOOKINGLIMITS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<OverBookingLimit> ACCOSUPPLIERADVANCEDEFINITIONTOOVERBOOKINGLIMITSOVERBOOKINGLIMITSHANDLER = new OneToManyHandler<OverBookingLimit>(
	CommoninventorycoreConstants.TC.OVERBOOKINGLIMIT,
	false,
	"accoSupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ACCOPENALTYCHARGESFORAMENDMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AccoPenaltyChargesForAmendments> ACCOSUPPLIERADVANCEDEFINITIONTOACCOPENALTYCHARGESFORAMENDMENTSACCOPENALTYCHARGESFORAMENDMENTSHANDLER = new OneToManyHandler<AccoPenaltyChargesForAmendments>(
	AccoinventorycoreConstants.TC.ACCOPENALTYCHARGESFORAMENDMENTS,
	false,
	"accoSupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ROOMINGLISTCUTOFFS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RoomingListCutOffs> ACCOSUPPLIERADVANCEDEFINITIONTOROOMINGLISTCUTOFFSROOMINGLISTCUTOFFSHANDLER = new OneToManyHandler<RoomingListCutOffs>(
	AccoinventorycoreConstants.TC.ROOMINGLISTCUTOFFS,
	false,
	"accoSupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/** Relation ordering override parameter constants for AbstractAccoInventoryDetailToAccommodation from ((accoinventorycore))*/
	protected static String ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION_SRC_ORDERED = "relation.AbstractAccoInventoryDetailToAccommodation.source.ordered";
	protected static String ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION_TGT_ORDERED = "relation.AbstractAccoInventoryDetailToAccommodation.target.ordered";
	/** Relation disable markmodifed parameter constants for AbstractAccoInventoryDetailToAccommodation from ((accoinventorycore))*/
	protected static String ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION_MARKMODIFIED = "relation.AbstractAccoInventoryDetailToAccommodation.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("blockoutDates", AttributeMode.INITIAL);
		tmp.put("minNoOfNights", AttributeMode.INITIAL);
		tmp.put("maxNoOfNights", AttributeMode.INITIAL);
		tmp.put("cutOfForFreeSale", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.AccoSupplierAdvanceDefinition", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("abstractAccoCompanySpecificInventory", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("accoSupplierAdvanceDefinition", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.common.inventory.jalo.OverBookingLimit", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.abstractAccoCompanySpecificInventory</code> attribute.
	 * @return the abstractAccoCompanySpecificInventory
	 */
	public AbstractAccoCompanySpecificInventory getAbstractAccoCompanySpecificInventory(final SessionContext ctx, final AssociateInventory item)
	{
		return (AbstractAccoCompanySpecificInventory)item.getProperty( ctx, AccoinventorycoreConstants.Attributes.AssociateInventory.ABSTRACTACCOCOMPANYSPECIFICINVENTORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.abstractAccoCompanySpecificInventory</code> attribute.
	 * @return the abstractAccoCompanySpecificInventory
	 */
	public AbstractAccoCompanySpecificInventory getAbstractAccoCompanySpecificInventory(final AssociateInventory item)
	{
		return getAbstractAccoCompanySpecificInventory( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.abstractAccoCompanySpecificInventory</code> attribute. 
	 * @param value the abstractAccoCompanySpecificInventory
	 */
	public void setAbstractAccoCompanySpecificInventory(final SessionContext ctx, final AssociateInventory item, final AbstractAccoCompanySpecificInventory value)
	{
		item.setProperty(ctx, AccoinventorycoreConstants.Attributes.AssociateInventory.ABSTRACTACCOCOMPANYSPECIFICINVENTORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.abstractAccoCompanySpecificInventory</code> attribute. 
	 * @param value the abstractAccoCompanySpecificInventory
	 */
	public void setAbstractAccoCompanySpecificInventory(final AssociateInventory item, final AbstractAccoCompanySpecificInventory value)
	{
		setAbstractAccoCompanySpecificInventory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.abstractAccoInventoryDetail</code> attribute.
	 * @return the abstractAccoInventoryDetail
	 */
	public Collection<AbstractAccoInventoryDetail> getAbstractAccoInventoryDetail(final SessionContext ctx, final Accommodation item)
	{
		final List<AbstractAccoInventoryDetail> items = item.getLinkedItems( 
			ctx,
			false,
			AccoinventorycoreConstants.Relations.ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION,
			"AbstractAccoInventoryDetail",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.abstractAccoInventoryDetail</code> attribute.
	 * @return the abstractAccoInventoryDetail
	 */
	public Collection<AbstractAccoInventoryDetail> getAbstractAccoInventoryDetail(final Accommodation item)
	{
		return getAbstractAccoInventoryDetail( getSession().getSessionContext(), item );
	}
	
	public long getAbstractAccoInventoryDetailCount(final SessionContext ctx, final Accommodation item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			AccoinventorycoreConstants.Relations.ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION,
			"AbstractAccoInventoryDetail",
			null
		);
	}
	
	public long getAbstractAccoInventoryDetailCount(final Accommodation item)
	{
		return getAbstractAccoInventoryDetailCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.abstractAccoInventoryDetail</code> attribute. 
	 * @param value the abstractAccoInventoryDetail
	 */
	public void setAbstractAccoInventoryDetail(final SessionContext ctx, final Accommodation item, final Collection<AbstractAccoInventoryDetail> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			AccoinventorycoreConstants.Relations.ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.abstractAccoInventoryDetail</code> attribute. 
	 * @param value the abstractAccoInventoryDetail
	 */
	public void setAbstractAccoInventoryDetail(final Accommodation item, final Collection<AbstractAccoInventoryDetail> value)
	{
		setAbstractAccoInventoryDetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to abstractAccoInventoryDetail. 
	 * @param value the item to add to abstractAccoInventoryDetail
	 */
	public void addToAbstractAccoInventoryDetail(final SessionContext ctx, final Accommodation item, final AbstractAccoInventoryDetail value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			AccoinventorycoreConstants.Relations.ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to abstractAccoInventoryDetail. 
	 * @param value the item to add to abstractAccoInventoryDetail
	 */
	public void addToAbstractAccoInventoryDetail(final Accommodation item, final AbstractAccoInventoryDetail value)
	{
		addToAbstractAccoInventoryDetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from abstractAccoInventoryDetail. 
	 * @param value the item to remove from abstractAccoInventoryDetail
	 */
	public void removeFromAbstractAccoInventoryDetail(final SessionContext ctx, final Accommodation item, final AbstractAccoInventoryDetail value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			AccoinventorycoreConstants.Relations.ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTACCOINVENTORYDETAILTOACCOMMODATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from abstractAccoInventoryDetail. 
	 * @param value the item to remove from abstractAccoInventoryDetail
	 */
	public void removeFromAbstractAccoInventoryDetail(final Accommodation item, final AbstractAccoInventoryDetail value)
	{
		removeFromAbstractAccoInventoryDetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.accoPenaltyChargesForAmendments</code> attribute.
	 * @return the accoPenaltyChargesForAmendments
	 */
	public Collection<AccoPenaltyChargesForAmendments> getAccoPenaltyChargesForAmendments(final SessionContext ctx, final AccoSupplierAdvanceDefinition item)
	{
		return ACCOSUPPLIERADVANCEDEFINITIONTOACCOPENALTYCHARGESFORAMENDMENTSACCOPENALTYCHARGESFORAMENDMENTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.accoPenaltyChargesForAmendments</code> attribute.
	 * @return the accoPenaltyChargesForAmendments
	 */
	public Collection<AccoPenaltyChargesForAmendments> getAccoPenaltyChargesForAmendments(final AccoSupplierAdvanceDefinition item)
	{
		return getAccoPenaltyChargesForAmendments( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.accoPenaltyChargesForAmendments</code> attribute. 
	 * @param value the accoPenaltyChargesForAmendments
	 */
	public void setAccoPenaltyChargesForAmendments(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final Collection<AccoPenaltyChargesForAmendments> value)
	{
		ACCOSUPPLIERADVANCEDEFINITIONTOACCOPENALTYCHARGESFORAMENDMENTSACCOPENALTYCHARGESFORAMENDMENTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.accoPenaltyChargesForAmendments</code> attribute. 
	 * @param value the accoPenaltyChargesForAmendments
	 */
	public void setAccoPenaltyChargesForAmendments(final AccoSupplierAdvanceDefinition item, final Collection<AccoPenaltyChargesForAmendments> value)
	{
		setAccoPenaltyChargesForAmendments( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accoPenaltyChargesForAmendments. 
	 * @param value the item to add to accoPenaltyChargesForAmendments
	 */
	public void addToAccoPenaltyChargesForAmendments(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final AccoPenaltyChargesForAmendments value)
	{
		ACCOSUPPLIERADVANCEDEFINITIONTOACCOPENALTYCHARGESFORAMENDMENTSACCOPENALTYCHARGESFORAMENDMENTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accoPenaltyChargesForAmendments. 
	 * @param value the item to add to accoPenaltyChargesForAmendments
	 */
	public void addToAccoPenaltyChargesForAmendments(final AccoSupplierAdvanceDefinition item, final AccoPenaltyChargesForAmendments value)
	{
		addToAccoPenaltyChargesForAmendments( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accoPenaltyChargesForAmendments. 
	 * @param value the item to remove from accoPenaltyChargesForAmendments
	 */
	public void removeFromAccoPenaltyChargesForAmendments(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final AccoPenaltyChargesForAmendments value)
	{
		ACCOSUPPLIERADVANCEDEFINITIONTOACCOPENALTYCHARGESFORAMENDMENTSACCOPENALTYCHARGESFORAMENDMENTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accoPenaltyChargesForAmendments. 
	 * @param value the item to remove from accoPenaltyChargesForAmendments
	 */
	public void removeFromAccoPenaltyChargesForAmendments(final AccoSupplierAdvanceDefinition item, final AccoPenaltyChargesForAmendments value)
	{
		removeFromAccoPenaltyChargesForAmendments( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OverBookingLimit.accoSupplierAdvanceDefinition</code> attribute.
	 * @return the accoSupplierAdvanceDefinition
	 */
	public AccoSupplierAdvanceDefinition getAccoSupplierAdvanceDefinition(final SessionContext ctx, final OverBookingLimit item)
	{
		return (AccoSupplierAdvanceDefinition)item.getProperty( ctx, AccoinventorycoreConstants.Attributes.OverBookingLimit.ACCOSUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OverBookingLimit.accoSupplierAdvanceDefinition</code> attribute.
	 * @return the accoSupplierAdvanceDefinition
	 */
	public AccoSupplierAdvanceDefinition getAccoSupplierAdvanceDefinition(final OverBookingLimit item)
	{
		return getAccoSupplierAdvanceDefinition( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OverBookingLimit.accoSupplierAdvanceDefinition</code> attribute. 
	 * @param value the accoSupplierAdvanceDefinition
	 */
	public void setAccoSupplierAdvanceDefinition(final SessionContext ctx, final OverBookingLimit item, final AccoSupplierAdvanceDefinition value)
	{
		item.setProperty(ctx, AccoinventorycoreConstants.Attributes.OverBookingLimit.ACCOSUPPLIERADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OverBookingLimit.accoSupplierAdvanceDefinition</code> attribute. 
	 * @param value the accoSupplierAdvanceDefinition
	 */
	public void setAccoSupplierAdvanceDefinition(final OverBookingLimit item, final AccoSupplierAdvanceDefinition value)
	{
		setAccoSupplierAdvanceDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.blockoutDates</code> attribute.
	 * @return the blockoutDates - Block out Dates
	 */
	public Set<StandardDateRange> getBlockoutDates(final SessionContext ctx, final AccoSupplierAdvanceDefinition item)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)item.getProperty( ctx, AccoinventorycoreConstants.Attributes.AccoSupplierAdvanceDefinition.BLOCKOUTDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.blockoutDates</code> attribute.
	 * @return the blockoutDates - Block out Dates
	 */
	public Set<StandardDateRange> getBlockoutDates(final AccoSupplierAdvanceDefinition item)
	{
		return getBlockoutDates( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.blockoutDates</code> attribute. 
	 * @param value the blockoutDates - Block out Dates
	 */
	public void setBlockoutDates(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final Set<StandardDateRange> value)
	{
		item.setProperty(ctx, AccoinventorycoreConstants.Attributes.AccoSupplierAdvanceDefinition.BLOCKOUTDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.blockoutDates</code> attribute. 
	 * @param value the blockoutDates - Block out Dates
	 */
	public void setBlockoutDates(final AccoSupplierAdvanceDefinition item, final Set<StandardDateRange> value)
	{
		setBlockoutDates( getSession().getSessionContext(), item, value );
	}
	
	public AccoAssociateInventory createAccoAssociateInventory(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.ACCOASSOCIATEINVENTORY );
			return (AccoAssociateInventory)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoAssociateInventory : "+e.getMessage(), 0 );
		}
	}
	
	public AccoAssociateInventory createAccoAssociateInventory(final Map attributeValues)
	{
		return createAccoAssociateInventory( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoClientInventoryDistribution createAccoClientInventoryDistribution(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.ACCOCLIENTINVENTORYDISTRIBUTION );
			return (AccoClientInventoryDistribution)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoClientInventoryDistribution : "+e.getMessage(), 0 );
		}
	}
	
	public AccoClientInventoryDistribution createAccoClientInventoryDistribution(final Map attributeValues)
	{
		return createAccoClientInventoryDistribution( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoCompanyAdvanceDefinition createAccoCompanyAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.ACCOCOMPANYADVANCEDEFINITION );
			return (AccoCompanyAdvanceDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoCompanyAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public AccoCompanyAdvanceDefinition createAccoCompanyAdvanceDefinition(final Map attributeValues)
	{
		return createAccoCompanyAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoCompanyPenaltyCharges createAccoCompanyPenaltyCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.ACCOCOMPANYPENALTYCHARGES );
			return (AccoCompanyPenaltyCharges)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoCompanyPenaltyCharges : "+e.getMessage(), 0 );
		}
	}
	
	public AccoCompanyPenaltyCharges createAccoCompanyPenaltyCharges(final Map attributeValues)
	{
		return createAccoCompanyPenaltyCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoCutoffAndCharges createAccoCutoffAndCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.ACCOCUTOFFANDCHARGES );
			return (AccoCutoffAndCharges)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoCutoffAndCharges : "+e.getMessage(), 0 );
		}
	}
	
	public AccoCutoffAndCharges createAccoCutoffAndCharges(final Map attributeValues)
	{
		return createAccoCutoffAndCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoInventoryDefinition createAccoInventoryDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.ACCOINVENTORYDEFINITION );
			return (AccoInventoryDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoInventoryDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public AccoInventoryDefinition createAccoInventoryDefinition(final Map attributeValues)
	{
		return createAccoInventoryDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoInventoryDetail createAccoInventoryDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.ACCOINVENTORYDETAIL );
			return (AccoInventoryDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoInventoryDetail : "+e.getMessage(), 0 );
		}
	}
	
	public AccoInventoryDetail createAccoInventoryDetail(final Map attributeValues)
	{
		return createAccoInventoryDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoInventoryGrid createAccoInventoryGrid(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.ACCOINVENTORYGRID );
			return (AccoInventoryGrid)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoInventoryGrid : "+e.getMessage(), 0 );
		}
	}
	
	public AccoInventoryGrid createAccoInventoryGrid(final Map attributeValues)
	{
		return createAccoInventoryGrid( getSession().getSessionContext(), attributeValues );
	}
	
	public AccommodationInventoryRequest createAccommodationInventoryRequest(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.ACCOMMODATIONINVENTORYREQUEST );
			return (AccommodationInventoryRequest)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccommodationInventoryRequest : "+e.getMessage(), 0 );
		}
	}
	
	public AccommodationInventoryRequest createAccommodationInventoryRequest(final Map attributeValues)
	{
		return createAccommodationInventoryRequest( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoOtherCompanyInventoryDistribution createAccoOtherCompanyInventoryDistribution(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.ACCOOTHERCOMPANYINVENTORYDISTRIBUTION );
			return (AccoOtherCompanyInventoryDistribution)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoOtherCompanyInventoryDistribution : "+e.getMessage(), 0 );
		}
	}
	
	public AccoOtherCompanyInventoryDistribution createAccoOtherCompanyInventoryDistribution(final Map attributeValues)
	{
		return createAccoOtherCompanyInventoryDistribution( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoPenaltyChargesForAmendments createAccoPenaltyChargesForAmendments(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.ACCOPENALTYCHARGESFORAMENDMENTS );
			return (AccoPenaltyChargesForAmendments)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoPenaltyChargesForAmendments : "+e.getMessage(), 0 );
		}
	}
	
	public AccoPenaltyChargesForAmendments createAccoPenaltyChargesForAmendments(final Map attributeValues)
	{
		return createAccoPenaltyChargesForAmendments( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoPenaltyChargesRelease createAccoPenaltyChargesRelease(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.ACCOPENALTYCHARGESRELEASE );
			return (AccoPenaltyChargesRelease)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoPenaltyChargesRelease : "+e.getMessage(), 0 );
		}
	}
	
	public AccoPenaltyChargesRelease createAccoPenaltyChargesRelease(final Map attributeValues)
	{
		return createAccoPenaltyChargesRelease( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoWithinCompanyInventoryDistribution createAccoWithinCompanyInventoryDistribution(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.ACCOWITHINCOMPANYINVENTORYDISTRIBUTION );
			return (AccoWithinCompanyInventoryDistribution)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoWithinCompanyInventoryDistribution : "+e.getMessage(), 0 );
		}
	}
	
	public AccoWithinCompanyInventoryDistribution createAccoWithinCompanyInventoryDistribution(final Map attributeValues)
	{
		return createAccoWithinCompanyInventoryDistribution( getSession().getSessionContext(), attributeValues );
	}
	
	public InventoryRoomInfo createInventoryRoomInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.INVENTORYROOMINFO );
			return (InventoryRoomInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating InventoryRoomInfo : "+e.getMessage(), 0 );
		}
	}
	
	public InventoryRoomInfo createInventoryRoomInfo(final Map attributeValues)
	{
		return createInventoryRoomInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public RoomingListCutOffs createRoomingListCutOffs(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AccoinventorycoreConstants.TC.ROOMINGLISTCUTOFFS );
			return (RoomingListCutOffs)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RoomingListCutOffs : "+e.getMessage(), 0 );
		}
	}
	
	public RoomingListCutOffs createRoomingListCutOffs(final Map attributeValues)
	{
		return createRoomingListCutOffs( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.cutOfForFreeSale</code> attribute.
	 * @return the cutOfForFreeSale - Cut Off For Free Sale
	 */
	public CutOffForFreeSale getCutOfForFreeSale(final SessionContext ctx, final AccoSupplierAdvanceDefinition item)
	{
		return (CutOffForFreeSale)item.getProperty( ctx, AccoinventorycoreConstants.Attributes.AccoSupplierAdvanceDefinition.CUTOFFORFREESALE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.cutOfForFreeSale</code> attribute.
	 * @return the cutOfForFreeSale - Cut Off For Free Sale
	 */
	public CutOffForFreeSale getCutOfForFreeSale(final AccoSupplierAdvanceDefinition item)
	{
		return getCutOfForFreeSale( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.cutOfForFreeSale</code> attribute. 
	 * @param value the cutOfForFreeSale - Cut Off For Free Sale
	 */
	public void setCutOfForFreeSale(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final CutOffForFreeSale value)
	{
		item.setProperty(ctx, AccoinventorycoreConstants.Attributes.AccoSupplierAdvanceDefinition.CUTOFFORFREESALE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.cutOfForFreeSale</code> attribute. 
	 * @param value the cutOfForFreeSale - Cut Off For Free Sale
	 */
	public void setCutOfForFreeSale(final AccoSupplierAdvanceDefinition item, final CutOffForFreeSale value)
	{
		setCutOfForFreeSale( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return AccoinventorycoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.maxNoOfNights</code> attribute.
	 * @return the maxNoOfNights - Max No Of Nights
	 */
	public Integer getMaxNoOfNights(final SessionContext ctx, final AccoSupplierAdvanceDefinition item)
	{
		return (Integer)item.getProperty( ctx, AccoinventorycoreConstants.Attributes.AccoSupplierAdvanceDefinition.MAXNOOFNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.maxNoOfNights</code> attribute.
	 * @return the maxNoOfNights - Max No Of Nights
	 */
	public Integer getMaxNoOfNights(final AccoSupplierAdvanceDefinition item)
	{
		return getMaxNoOfNights( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.maxNoOfNights</code> attribute. 
	 * @return the maxNoOfNights - Max No Of Nights
	 */
	public int getMaxNoOfNightsAsPrimitive(final SessionContext ctx, final AccoSupplierAdvanceDefinition item)
	{
		Integer value = getMaxNoOfNights( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.maxNoOfNights</code> attribute. 
	 * @return the maxNoOfNights - Max No Of Nights
	 */
	public int getMaxNoOfNightsAsPrimitive(final AccoSupplierAdvanceDefinition item)
	{
		return getMaxNoOfNightsAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.maxNoOfNights</code> attribute. 
	 * @param value the maxNoOfNights - Max No Of Nights
	 */
	public void setMaxNoOfNights(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final Integer value)
	{
		item.setProperty(ctx, AccoinventorycoreConstants.Attributes.AccoSupplierAdvanceDefinition.MAXNOOFNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.maxNoOfNights</code> attribute. 
	 * @param value the maxNoOfNights - Max No Of Nights
	 */
	public void setMaxNoOfNights(final AccoSupplierAdvanceDefinition item, final Integer value)
	{
		setMaxNoOfNights( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.maxNoOfNights</code> attribute. 
	 * @param value the maxNoOfNights - Max No Of Nights
	 */
	public void setMaxNoOfNights(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final int value)
	{
		setMaxNoOfNights( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.maxNoOfNights</code> attribute. 
	 * @param value the maxNoOfNights - Max No Of Nights
	 */
	public void setMaxNoOfNights(final AccoSupplierAdvanceDefinition item, final int value)
	{
		setMaxNoOfNights( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.minNoOfNights</code> attribute.
	 * @return the minNoOfNights - Min No Of Nights
	 */
	public Integer getMinNoOfNights(final SessionContext ctx, final AccoSupplierAdvanceDefinition item)
	{
		return (Integer)item.getProperty( ctx, AccoinventorycoreConstants.Attributes.AccoSupplierAdvanceDefinition.MINNOOFNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.minNoOfNights</code> attribute.
	 * @return the minNoOfNights - Min No Of Nights
	 */
	public Integer getMinNoOfNights(final AccoSupplierAdvanceDefinition item)
	{
		return getMinNoOfNights( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.minNoOfNights</code> attribute. 
	 * @return the minNoOfNights - Min No Of Nights
	 */
	public int getMinNoOfNightsAsPrimitive(final SessionContext ctx, final AccoSupplierAdvanceDefinition item)
	{
		Integer value = getMinNoOfNights( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.minNoOfNights</code> attribute. 
	 * @return the minNoOfNights - Min No Of Nights
	 */
	public int getMinNoOfNightsAsPrimitive(final AccoSupplierAdvanceDefinition item)
	{
		return getMinNoOfNightsAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.minNoOfNights</code> attribute. 
	 * @param value the minNoOfNights - Min No Of Nights
	 */
	public void setMinNoOfNights(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final Integer value)
	{
		item.setProperty(ctx, AccoinventorycoreConstants.Attributes.AccoSupplierAdvanceDefinition.MINNOOFNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.minNoOfNights</code> attribute. 
	 * @param value the minNoOfNights - Min No Of Nights
	 */
	public void setMinNoOfNights(final AccoSupplierAdvanceDefinition item, final Integer value)
	{
		setMinNoOfNights( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.minNoOfNights</code> attribute. 
	 * @param value the minNoOfNights - Min No Of Nights
	 */
	public void setMinNoOfNights(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final int value)
	{
		setMinNoOfNights( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.minNoOfNights</code> attribute. 
	 * @param value the minNoOfNights - Min No Of Nights
	 */
	public void setMinNoOfNights(final AccoSupplierAdvanceDefinition item, final int value)
	{
		setMinNoOfNights( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.overbookinglimits</code> attribute.
	 * @return the overbookinglimits
	 */
	public Collection<OverBookingLimit> getOverbookinglimits(final SessionContext ctx, final AccoSupplierAdvanceDefinition item)
	{
		return ACCOSUPPLIERADVANCEDEFINITIONTOOVERBOOKINGLIMITSOVERBOOKINGLIMITSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.overbookinglimits</code> attribute.
	 * @return the overbookinglimits
	 */
	public Collection<OverBookingLimit> getOverbookinglimits(final AccoSupplierAdvanceDefinition item)
	{
		return getOverbookinglimits( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.overbookinglimits</code> attribute. 
	 * @param value the overbookinglimits
	 */
	public void setOverbookinglimits(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final Collection<OverBookingLimit> value)
	{
		ACCOSUPPLIERADVANCEDEFINITIONTOOVERBOOKINGLIMITSOVERBOOKINGLIMITSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.overbookinglimits</code> attribute. 
	 * @param value the overbookinglimits
	 */
	public void setOverbookinglimits(final AccoSupplierAdvanceDefinition item, final Collection<OverBookingLimit> value)
	{
		setOverbookinglimits( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to overbookinglimits. 
	 * @param value the item to add to overbookinglimits
	 */
	public void addToOverbookinglimits(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final OverBookingLimit value)
	{
		ACCOSUPPLIERADVANCEDEFINITIONTOOVERBOOKINGLIMITSOVERBOOKINGLIMITSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to overbookinglimits. 
	 * @param value the item to add to overbookinglimits
	 */
	public void addToOverbookinglimits(final AccoSupplierAdvanceDefinition item, final OverBookingLimit value)
	{
		addToOverbookinglimits( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from overbookinglimits. 
	 * @param value the item to remove from overbookinglimits
	 */
	public void removeFromOverbookinglimits(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final OverBookingLimit value)
	{
		ACCOSUPPLIERADVANCEDEFINITIONTOOVERBOOKINGLIMITSOVERBOOKINGLIMITSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from overbookinglimits. 
	 * @param value the item to remove from overbookinglimits
	 */
	public void removeFromOverbookinglimits(final AccoSupplierAdvanceDefinition item, final OverBookingLimit value)
	{
		removeFromOverbookinglimits( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<AccoPenaltyChargesRelease> getPenaltyCharges(final SessionContext ctx, final AccoSupplierAdvanceDefinition item)
	{
		return ACCOSUPPLIERADVANCEDEFINITIONTOACCOPENALTYCHARGESRELEASEPENALTYCHARGESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<AccoPenaltyChargesRelease> getPenaltyCharges(final AccoSupplierAdvanceDefinition item)
	{
		return getPenaltyCharges( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final Collection<AccoPenaltyChargesRelease> value)
	{
		ACCOSUPPLIERADVANCEDEFINITIONTOACCOPENALTYCHARGESRELEASEPENALTYCHARGESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final AccoSupplierAdvanceDefinition item, final Collection<AccoPenaltyChargesRelease> value)
	{
		setPenaltyCharges( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final AccoPenaltyChargesRelease value)
	{
		ACCOSUPPLIERADVANCEDEFINITIONTOACCOPENALTYCHARGESRELEASEPENALTYCHARGESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final AccoSupplierAdvanceDefinition item, final AccoPenaltyChargesRelease value)
	{
		addToPenaltyCharges( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final AccoPenaltyChargesRelease value)
	{
		ACCOSUPPLIERADVANCEDEFINITIONTOACCOPENALTYCHARGESRELEASEPENALTYCHARGESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final AccoSupplierAdvanceDefinition item, final AccoPenaltyChargesRelease value)
	{
		removeFromPenaltyCharges( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.roominglistCutoffs</code> attribute.
	 * @return the roominglistCutoffs
	 */
	public Collection<RoomingListCutOffs> getRoominglistCutoffs(final SessionContext ctx, final AccoSupplierAdvanceDefinition item)
	{
		return ACCOSUPPLIERADVANCEDEFINITIONTOROOMINGLISTCUTOFFSROOMINGLISTCUTOFFSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.roominglistCutoffs</code> attribute.
	 * @return the roominglistCutoffs
	 */
	public Collection<RoomingListCutOffs> getRoominglistCutoffs(final AccoSupplierAdvanceDefinition item)
	{
		return getRoominglistCutoffs( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.roominglistCutoffs</code> attribute. 
	 * @param value the roominglistCutoffs
	 */
	public void setRoominglistCutoffs(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final Collection<RoomingListCutOffs> value)
	{
		ACCOSUPPLIERADVANCEDEFINITIONTOROOMINGLISTCUTOFFSROOMINGLISTCUTOFFSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.roominglistCutoffs</code> attribute. 
	 * @param value the roominglistCutoffs
	 */
	public void setRoominglistCutoffs(final AccoSupplierAdvanceDefinition item, final Collection<RoomingListCutOffs> value)
	{
		setRoominglistCutoffs( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roominglistCutoffs. 
	 * @param value the item to add to roominglistCutoffs
	 */
	public void addToRoominglistCutoffs(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final RoomingListCutOffs value)
	{
		ACCOSUPPLIERADVANCEDEFINITIONTOROOMINGLISTCUTOFFSROOMINGLISTCUTOFFSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roominglistCutoffs. 
	 * @param value the item to add to roominglistCutoffs
	 */
	public void addToRoominglistCutoffs(final AccoSupplierAdvanceDefinition item, final RoomingListCutOffs value)
	{
		addToRoominglistCutoffs( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roominglistCutoffs. 
	 * @param value the item to remove from roominglistCutoffs
	 */
	public void removeFromRoominglistCutoffs(final SessionContext ctx, final AccoSupplierAdvanceDefinition item, final RoomingListCutOffs value)
	{
		ACCOSUPPLIERADVANCEDEFINITIONTOROOMINGLISTCUTOFFSROOMINGLISTCUTOFFSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roominglistCutoffs. 
	 * @param value the item to remove from roominglistCutoffs
	 */
	public void removeFromRoominglistCutoffs(final AccoSupplierAdvanceDefinition item, final RoomingListCutOffs value)
	{
		removeFromRoominglistCutoffs( getSession().getSessionContext(), item, value );
	}
	
}
