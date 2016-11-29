/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.supplier.masterdata.core.policy.AbstractDynamicPolicy;
import com.cnk.travelogix.supplier.masterdata.core.policy.AccoDynamicPolicy;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsaccommodationConstants;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.accommodation.AccommodationRateDefinition;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.accommodation.AccommodationSupplierRate;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation.AccoRateDetailDefinition;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation.AccoSurchargeSuppDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation.CommonRateAdvDefinition;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.ancillary.CommonAncillaryRateDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.ChildAgeRateDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.RoomTypeRate;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.SupplierRoomOffer;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateAdvDefinition;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>SupplierratedefinitionsaccommodationManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierratedefinitionsaccommodationManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n SUPPLIERROOMOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierRoomOffer> COMMONRATEADVDEFINITION2SUPPLIERROOMOFFERRELSUPPLIERROOMOFFERSHANDLER = new OneToManyHandler<SupplierRoomOffer>(
	SupplierratedefinitionsaccommodationConstants.TC.SUPPLIERROOMOFFER,
	false,
	"commonRateAdvDef",
	null,
	false,
	true,
	CollectionType.SET
	);
	/** Relation ordering override parameter constants for AccoRateDef2AccoDynamicPolicyRel from ((supplierratedefinitionsaccommodation))*/
	protected static String ACCORATEDEF2ACCODYNAMICPOLICYREL_SRC_ORDERED = "relation.AccoRateDef2AccoDynamicPolicyRel.source.ordered";
	protected static String ACCORATEDEF2ACCODYNAMICPOLICYREL_TGT_ORDERED = "relation.AccoRateDef2AccoDynamicPolicyRel.target.ordered";
	/** Relation disable markmodifed parameter constants for AccoRateDef2AccoDynamicPolicyRel from ((supplierratedefinitionsaccommodation))*/
	protected static String ACCORATEDEF2ACCODYNAMICPOLICYREL_MARKMODIFIED = "relation.AccoRateDef2AccoDynamicPolicyRel.markmodified";
	/** Relation ordering override parameter constants for AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel from ((supplierratedefinitionsaccommodation))*/
	protected static String ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL_SRC_ORDERED = "relation.AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel.source.ordered";
	protected static String ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL_TGT_ORDERED = "relation.AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel.target.ordered";
	/** Relation disable markmodifed parameter constants for AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel from ((supplierratedefinitionsaccommodation))*/
	protected static String ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL_MARKMODIFIED = "relation.AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("accoRateDetailDefinition", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.ChildAgeRateDetail", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.accoRateDetailDefinition</code> attribute.
	 * @return the accoRateDetailDefinition
	 */
	public Collection<AccoRateDetailDefinition> getAccoRateDetailDefinition(final SessionContext ctx, final AbstractTravelogixSupplierOffer item)
	{
		final List<AccoRateDetailDefinition> items = item.getLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL,
			"AccoRateDetailDefinition",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.accoRateDetailDefinition</code> attribute.
	 * @return the accoRateDetailDefinition
	 */
	public Collection<AccoRateDetailDefinition> getAccoRateDetailDefinition(final AbstractTravelogixSupplierOffer item)
	{
		return getAccoRateDetailDefinition( getSession().getSessionContext(), item );
	}
	
	public long getAccoRateDetailDefinitionCount(final SessionContext ctx, final AbstractTravelogixSupplierOffer item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL,
			"AccoRateDetailDefinition",
			null
		);
	}
	
	public long getAccoRateDetailDefinitionCount(final AbstractTravelogixSupplierOffer item)
	{
		return getAccoRateDetailDefinitionCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.accoRateDetailDefinition</code> attribute. 
	 * @param value the accoRateDetailDefinition
	 */
	public void setAccoRateDetailDefinition(final SessionContext ctx, final AbstractTravelogixSupplierOffer item, final Collection<AccoRateDetailDefinition> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.accoRateDetailDefinition</code> attribute. 
	 * @param value the accoRateDetailDefinition
	 */
	public void setAccoRateDetailDefinition(final AbstractTravelogixSupplierOffer item, final Collection<AccoRateDetailDefinition> value)
	{
		setAccoRateDetailDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accoRateDetailDefinition. 
	 * @param value the item to add to accoRateDetailDefinition
	 */
	public void addToAccoRateDetailDefinition(final SessionContext ctx, final AbstractTravelogixSupplierOffer item, final AccoRateDetailDefinition value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accoRateDetailDefinition. 
	 * @param value the item to add to accoRateDetailDefinition
	 */
	public void addToAccoRateDetailDefinition(final AbstractTravelogixSupplierOffer item, final AccoRateDetailDefinition value)
	{
		addToAccoRateDetailDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accoRateDetailDefinition. 
	 * @param value the item to remove from accoRateDetailDefinition
	 */
	public void removeFromAccoRateDetailDefinition(final SessionContext ctx, final AbstractTravelogixSupplierOffer item, final AccoRateDetailDefinition value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accoRateDetailDefinition. 
	 * @param value the item to remove from accoRateDetailDefinition
	 */
	public void removeFromAccoRateDetailDefinition(final AbstractTravelogixSupplierOffer item, final AccoRateDetailDefinition value)
	{
		removeFromAccoRateDetailDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChildAgeRateDetail.accoRateDetailDefinition</code> attribute.
	 * @return the accoRateDetailDefinition
	 */
	public AccoRateDetailDefinition getAccoRateDetailDefinition(final SessionContext ctx, final ChildAgeRateDetail item)
	{
		return (AccoRateDetailDefinition)item.getProperty( ctx, SupplierratedefinitionsaccommodationConstants.Attributes.ChildAgeRateDetail.ACCORATEDETAILDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChildAgeRateDetail.accoRateDetailDefinition</code> attribute.
	 * @return the accoRateDetailDefinition
	 */
	public AccoRateDetailDefinition getAccoRateDetailDefinition(final ChildAgeRateDetail item)
	{
		return getAccoRateDetailDefinition( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChildAgeRateDetail.accoRateDetailDefinition</code> attribute. 
	 * @param value the accoRateDetailDefinition
	 */
	public void setAccoRateDetailDefinition(final SessionContext ctx, final ChildAgeRateDetail item, final AccoRateDetailDefinition value)
	{
		item.setProperty(ctx, SupplierratedefinitionsaccommodationConstants.Attributes.ChildAgeRateDetail.ACCORATEDETAILDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChildAgeRateDetail.accoRateDetailDefinition</code> attribute. 
	 * @param value the accoRateDetailDefinition
	 */
	public void setAccoRateDetailDefinition(final ChildAgeRateDetail item, final AccoRateDetailDefinition value)
	{
		setAccoRateDetailDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDynamicPolicy.accRateDef</code> attribute.
	 * @return the accRateDef
	 */
	public Collection<AccommodationRateDefinition> getAccRateDef(final SessionContext ctx, final AccoDynamicPolicy item)
	{
		final List<AccommodationRateDefinition> items = item.getLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDEF2ACCODYNAMICPOLICYREL,
			"AccommodationRateDefinition",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDynamicPolicy.accRateDef</code> attribute.
	 * @return the accRateDef
	 */
	public Collection<AccommodationRateDefinition> getAccRateDef(final AccoDynamicPolicy item)
	{
		return getAccRateDef( getSession().getSessionContext(), item );
	}
	
	public long getAccRateDefCount(final SessionContext ctx, final AccoDynamicPolicy item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDEF2ACCODYNAMICPOLICYREL,
			"AccommodationRateDefinition",
			null
		);
	}
	
	public long getAccRateDefCount(final AccoDynamicPolicy item)
	{
		return getAccRateDefCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDynamicPolicy.accRateDef</code> attribute. 
	 * @param value the accRateDef
	 */
	public void setAccRateDef(final SessionContext ctx, final AccoDynamicPolicy item, final Collection<AccommodationRateDefinition> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDEF2ACCODYNAMICPOLICYREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCORATEDEF2ACCODYNAMICPOLICYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDynamicPolicy.accRateDef</code> attribute. 
	 * @param value the accRateDef
	 */
	public void setAccRateDef(final AccoDynamicPolicy item, final Collection<AccommodationRateDefinition> value)
	{
		setAccRateDef( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accRateDef. 
	 * @param value the item to add to accRateDef
	 */
	public void addToAccRateDef(final SessionContext ctx, final AccoDynamicPolicy item, final AccommodationRateDefinition value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDEF2ACCODYNAMICPOLICYREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCORATEDEF2ACCODYNAMICPOLICYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accRateDef. 
	 * @param value the item to add to accRateDef
	 */
	public void addToAccRateDef(final AccoDynamicPolicy item, final AccommodationRateDefinition value)
	{
		addToAccRateDef( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accRateDef. 
	 * @param value the item to remove from accRateDef
	 */
	public void removeFromAccRateDef(final SessionContext ctx, final AccoDynamicPolicy item, final AccommodationRateDefinition value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDEF2ACCODYNAMICPOLICYREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCORATEDEF2ACCODYNAMICPOLICYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accRateDef. 
	 * @param value the item to remove from accRateDef
	 */
	public void removeFromAccRateDef(final AccoDynamicPolicy item, final AccommodationRateDefinition value)
	{
		removeFromAccRateDef( getSession().getSessionContext(), item, value );
	}
	
	public AccommodationRateDefinition createAccommodationRateDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsaccommodationConstants.TC.ACCOMMODATIONRATEDEFINITION );
			return (AccommodationRateDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccommodationRateDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public AccommodationRateDefinition createAccommodationRateDefinition(final Map attributeValues)
	{
		return createAccommodationRateDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public AccommodationSupplierRate createAccommodationSupplierRate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsaccommodationConstants.TC.ACCOMMODATIONSUPPLIERRATE );
			return (AccommodationSupplierRate)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccommodationSupplierRate : "+e.getMessage(), 0 );
		}
	}
	
	public AccommodationSupplierRate createAccommodationSupplierRate(final Map attributeValues)
	{
		return createAccommodationSupplierRate( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoRateDetailDefinition createAccoRateDetailDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsaccommodationConstants.TC.ACCORATEDETAILDEFINITION );
			return (AccoRateDetailDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoRateDetailDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public AccoRateDetailDefinition createAccoRateDetailDefinition(final Map attributeValues)
	{
		return createAccoRateDetailDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoSurchargeSuppDetail createAccoSurchargeSuppDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsaccommodationConstants.TC.ACCOSURCHARGESUPPDETAIL );
			return (AccoSurchargeSuppDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoSurchargeSuppDetail : "+e.getMessage(), 0 );
		}
	}
	
	public AccoSurchargeSuppDetail createAccoSurchargeSuppDetail(final Map attributeValues)
	{
		return createAccoSurchargeSuppDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public CommonAncillaryRateDetail createCommonAncillaryRateDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsaccommodationConstants.TC.COMMONANCILLARYRATEDETAIL );
			return (CommonAncillaryRateDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CommonAncillaryRateDetail : "+e.getMessage(), 0 );
		}
	}
	
	public CommonAncillaryRateDetail createCommonAncillaryRateDetail(final Map attributeValues)
	{
		return createCommonAncillaryRateDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public RoomTypeRate createRoomTypeRate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsaccommodationConstants.TC.ROOMTYPERATE );
			return (RoomTypeRate)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RoomTypeRate : "+e.getMessage(), 0 );
		}
	}
	
	public RoomTypeRate createRoomTypeRate(final Map attributeValues)
	{
		return createRoomTypeRate( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierRoomOffer createSupplierRoomOffer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionsaccommodationConstants.TC.SUPPLIERROOMOFFER );
			return (SupplierRoomOffer)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierRoomOffer : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierRoomOffer createSupplierRoomOffer(final Map attributeValues)
	{
		return createSupplierRoomOffer( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SupplierratedefinitionsaccommodationConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonRateAdvDefinition.supplierRoomOffers</code> attribute.
	 * @return the supplierRoomOffers
	 */
	public Set<SupplierRoomOffer> getSupplierRoomOffers(final SessionContext ctx, final CommonRateAdvDefinition item)
	{
		return (Set<SupplierRoomOffer>)COMMONRATEADVDEFINITION2SUPPLIERROOMOFFERRELSUPPLIERROOMOFFERSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonRateAdvDefinition.supplierRoomOffers</code> attribute.
	 * @return the supplierRoomOffers
	 */
	public Set<SupplierRoomOffer> getSupplierRoomOffers(final CommonRateAdvDefinition item)
	{
		return getSupplierRoomOffers( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonRateAdvDefinition.supplierRoomOffers</code> attribute. 
	 * @param value the supplierRoomOffers
	 */
	public void setSupplierRoomOffers(final SessionContext ctx, final CommonRateAdvDefinition item, final Set<SupplierRoomOffer> value)
	{
		COMMONRATEADVDEFINITION2SUPPLIERROOMOFFERRELSUPPLIERROOMOFFERSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonRateAdvDefinition.supplierRoomOffers</code> attribute. 
	 * @param value the supplierRoomOffers
	 */
	public void setSupplierRoomOffers(final CommonRateAdvDefinition item, final Set<SupplierRoomOffer> value)
	{
		setSupplierRoomOffers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierRoomOffers. 
	 * @param value the item to add to supplierRoomOffers
	 */
	public void addToSupplierRoomOffers(final SessionContext ctx, final CommonRateAdvDefinition item, final SupplierRoomOffer value)
	{
		COMMONRATEADVDEFINITION2SUPPLIERROOMOFFERRELSUPPLIERROOMOFFERSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierRoomOffers. 
	 * @param value the item to add to supplierRoomOffers
	 */
	public void addToSupplierRoomOffers(final CommonRateAdvDefinition item, final SupplierRoomOffer value)
	{
		addToSupplierRoomOffers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierRoomOffers. 
	 * @param value the item to remove from supplierRoomOffers
	 */
	public void removeFromSupplierRoomOffers(final SessionContext ctx, final CommonRateAdvDefinition item, final SupplierRoomOffer value)
	{
		COMMONRATEADVDEFINITION2SUPPLIERROOMOFFERRELSUPPLIERROOMOFFERSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierRoomOffers. 
	 * @param value the item to remove from supplierRoomOffers
	 */
	public void removeFromSupplierRoomOffers(final CommonRateAdvDefinition item, final SupplierRoomOffer value)
	{
		removeFromSupplierRoomOffers( getSession().getSessionContext(), item, value );
	}
	
}
