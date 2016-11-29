/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.contact.jalo.EContactInfo;
import com.cnk.travelogix.masterdata.core.contacts.jalo.AbstractContactDetails;
import com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.AbstractDayWiseItinerary;
import com.cnk.travelogix.product.common.core.jalo.AbstractVisaDetails;
import com.cnk.travelogix.product.common.core.jalo.Accommodation;
import com.cnk.travelogix.product.common.core.jalo.AccommodationBrand;
import com.cnk.travelogix.product.common.core.jalo.AccommodationChain;
import com.cnk.travelogix.product.common.core.jalo.ActualPrices;
import com.cnk.travelogix.product.common.core.jalo.Affiliation;
import com.cnk.travelogix.product.common.core.jalo.Ancillary;
import com.cnk.travelogix.product.common.core.jalo.AttachedProduct;
import com.cnk.travelogix.product.common.core.jalo.Brochure;
import com.cnk.travelogix.product.common.core.jalo.CombinationProduct;
import com.cnk.travelogix.product.common.core.jalo.Combo;
import com.cnk.travelogix.product.common.core.jalo.DeactivationConfig;
import com.cnk.travelogix.product.common.core.jalo.DescriptionDetails;
import com.cnk.travelogix.product.common.core.jalo.Facility;
import com.cnk.travelogix.product.common.core.jalo.FileName;
import com.cnk.travelogix.product.common.core.jalo.HealthAndSafety;
import com.cnk.travelogix.product.common.core.jalo.Individual;
import com.cnk.travelogix.product.common.core.jalo.Interest;
import com.cnk.travelogix.product.common.core.jalo.NameOfPlace;
import com.cnk.travelogix.product.common.core.jalo.PlaceDescription;
import com.cnk.travelogix.product.common.core.jalo.PointOfSale;
import com.cnk.travelogix.product.common.core.jalo.PriceRetention;
import com.cnk.travelogix.product.common.core.jalo.ProductDefinition;
import com.cnk.travelogix.product.common.core.jalo.ProductUpdate;
import com.cnk.travelogix.product.common.core.jalo.Route;
import com.cnk.travelogix.product.common.core.jalo.RuleInfo;
import com.cnk.travelogix.product.common.core.jalo.TravelogixRuleType;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.media.AbstractMedia;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>CommonproductcoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommonproductcoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n MARKETDEACTIVATIONCONFIG's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DeactivationConfig> PRODUCTTOMARKETDEACTIVATIONCONFIGMARKETDEACTIVATIONCONFIGHANDLER = new OneToManyHandler<DeactivationConfig>(
	CommonproductcoreConstants.TC.DEACTIVATIONCONFIG,
	true,
	"product",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SHORTDESCRIPTIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DescriptionDetails> PRODUCTTOSHORTDESCRIPTIONSSHORTDESCRIPTIONSHANDLER = new OneToManyHandler<DescriptionDetails>(
	CommonproductcoreConstants.TC.DESCRIPTIONDETAILS,
	true,
	"productShortDescription",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n LONGDESCRIPTIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DescriptionDetails> PRODUCTTOLONGDESCRIPTIONSLONGDESCRIPTIONSHANDLER = new OneToManyHandler<DescriptionDetails>(
	CommonproductcoreConstants.TC.DESCRIPTIONDETAILS,
	true,
	"productLongDescription",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTUPDATES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ProductUpdate> PRODUCTTOPRODUCTUPDATEPRODUCTUPDATESHANDLER = new OneToManyHandler<ProductUpdate>(
	CommonproductcoreConstants.TC.PRODUCTUPDATE,
	true,
	"product",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ECONTACTINFOS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EContactInfo> STAFFINFORMATIONTOECONTACTINFOSECONTACTINFOSHANDLER = new OneToManyHandler<EContactInfo>(
	MasterdatacoreConstants.TC.ECONTACTINFO,
	true,
	"staffInformation",
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
		tmp.put("commonProductID", AttributeMode.INITIAL);
		tmp.put("financeControlId", AttributeMode.INITIAL);
		tmp.put("reason", AttributeMode.INITIAL);
		tmp.put("active", AttributeMode.INITIAL);
		tmp.put("lockedBy", AttributeMode.INITIAL);
		tmp.put("copiedFrom", AttributeMode.INITIAL);
		tmp.put("displayName", AttributeMode.INITIAL);
		tmp.put("interest", AttributeMode.INITIAL);
		tmp.put("usp", AttributeMode.INITIAL);
		tmp.put("highlights", AttributeMode.INITIAL);
		tmp.put("sellingTips", AttributeMode.INITIAL);
		tmp.put("workFlowStatus", AttributeMode.INITIAL);
		tmp.put("isProductSharable", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("roomCategory", AttributeMode.INITIAL);
		tmp.put("validFromTO", AttributeMode.INITIAL);
		tmp.put("name", AttributeMode.INITIAL);
		tmp.put("fileName", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.media.Media", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("staffInformation", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.contact.jalo.EContactInfo", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>Product.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Product.ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final Product item)
	{
		return isActive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isActive( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final Product item)
	{
		return isActiveAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Product.ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Product item, final Boolean value)
	{
		setActive( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Product item, final boolean value)
	{
		setActive( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Product item, final boolean value)
	{
		setActive( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.commonProductID</code> attribute.
	 * @return the commonProductID - Product Id which is not company specific. It has
	 * 							same value for all companies.
	 */
	public String getCommonProductID(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Product.COMMONPRODUCTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.commonProductID</code> attribute.
	 * @return the commonProductID - Product Id which is not company specific. It has
	 * 							same value for all companies.
	 */
	public String getCommonProductID(final Product item)
	{
		return getCommonProductID( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.commonProductID</code> attribute. 
	 * @param value the commonProductID - Product Id which is not company specific. It has
	 * 							same value for all companies.
	 */
	protected void setCommonProductID(final SessionContext ctx, final Product item, final String value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+CommonproductcoreConstants.Attributes.Product.COMMONPRODUCTID+"' is not changeable", 0 );
		}
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Product.COMMONPRODUCTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.commonProductID</code> attribute. 
	 * @param value the commonProductID - Product Id which is not company specific. It has
	 * 							same value for all companies.
	 */
	protected void setCommonProductID(final Product item, final String value)
	{
		setCommonProductID( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.copiedFrom</code> attribute.
	 * @return the copiedFrom - Copied From
	 */
	public String getCopiedFrom(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Product.COPIEDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.copiedFrom</code> attribute.
	 * @return the copiedFrom - Copied From
	 */
	public String getCopiedFrom(final Product item)
	{
		return getCopiedFrom( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Copied From
	 */
	public void setCopiedFrom(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Product.COPIEDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Copied From
	 */
	public void setCopiedFrom(final Product item, final String value)
	{
		setCopiedFrom( getSession().getSessionContext(), item, value );
	}
	
	public AbstractDayWiseItinerary createAbstractDayWiseItinerary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.ABSTRACTDAYWISEITINERARY );
			return (AbstractDayWiseItinerary)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AbstractDayWiseItinerary : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractDayWiseItinerary createAbstractDayWiseItinerary(final Map attributeValues)
	{
		return createAbstractDayWiseItinerary( getSession().getSessionContext(), attributeValues );
	}
	
	public AbstractVisaDetails createAbstractVisaDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.ABSTRACTVISADETAILS );
			return (AbstractVisaDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AbstractVisaDetails : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractVisaDetails createAbstractVisaDetails(final Map attributeValues)
	{
		return createAbstractVisaDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public Accommodation createAccommodation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.ACCOMMODATION );
			return (Accommodation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Accommodation : "+e.getMessage(), 0 );
		}
	}
	
	public Accommodation createAccommodation(final Map attributeValues)
	{
		return createAccommodation( getSession().getSessionContext(), attributeValues );
	}
	
	public AccommodationBrand createAccommodationBrand(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.ACCOMMODATIONBRAND );
			return (AccommodationBrand)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccommodationBrand : "+e.getMessage(), 0 );
		}
	}
	
	public AccommodationBrand createAccommodationBrand(final Map attributeValues)
	{
		return createAccommodationBrand( getSession().getSessionContext(), attributeValues );
	}
	
	public AccommodationChain createAccommodationChain(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.ACCOMMODATIONCHAIN );
			return (AccommodationChain)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccommodationChain : "+e.getMessage(), 0 );
		}
	}
	
	public AccommodationChain createAccommodationChain(final Map attributeValues)
	{
		return createAccommodationChain( getSession().getSessionContext(), attributeValues );
	}
	
	public ActualPrices createActualPrices(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.ACTUALPRICES );
			return (ActualPrices)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActualPrices : "+e.getMessage(), 0 );
		}
	}
	
	public ActualPrices createActualPrices(final Map attributeValues)
	{
		return createActualPrices( getSession().getSessionContext(), attributeValues );
	}
	
	public Affiliation createAffiliation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.AFFILIATION );
			return (Affiliation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Affiliation : "+e.getMessage(), 0 );
		}
	}
	
	public Affiliation createAffiliation(final Map attributeValues)
	{
		return createAffiliation( getSession().getSessionContext(), attributeValues );
	}
	
	public Ancillary createAncillary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.ANCILLARY );
			return (Ancillary)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Ancillary : "+e.getMessage(), 0 );
		}
	}
	
	public Ancillary createAncillary(final Map attributeValues)
	{
		return createAncillary( getSession().getSessionContext(), attributeValues );
	}
	
	public AttachedProduct createAttachedProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.ATTACHEDPRODUCT );
			return (AttachedProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AttachedProduct : "+e.getMessage(), 0 );
		}
	}
	
	public AttachedProduct createAttachedProduct(final Map attributeValues)
	{
		return createAttachedProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Brochure createBrochure(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.BROCHURE );
			return (Brochure)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Brochure : "+e.getMessage(), 0 );
		}
	}
	
	public Brochure createBrochure(final Map attributeValues)
	{
		return createBrochure( getSession().getSessionContext(), attributeValues );
	}
	
	public CombinationProduct createCombinationProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.COMBINATIONPRODUCT );
			return (CombinationProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CombinationProduct : "+e.getMessage(), 0 );
		}
	}
	
	public CombinationProduct createCombinationProduct(final Map attributeValues)
	{
		return createCombinationProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Combo createCombo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.COMBO );
			return (Combo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Combo : "+e.getMessage(), 0 );
		}
	}
	
	public Combo createCombo(final Map attributeValues)
	{
		return createCombo( getSession().getSessionContext(), attributeValues );
	}
	
	public DeactivationConfig createDeactivationConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.DEACTIVATIONCONFIG );
			return (DeactivationConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DeactivationConfig : "+e.getMessage(), 0 );
		}
	}
	
	public DeactivationConfig createDeactivationConfig(final Map attributeValues)
	{
		return createDeactivationConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public DescriptionDetails createDescriptionDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.DESCRIPTIONDETAILS );
			return (DescriptionDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DescriptionDetails : "+e.getMessage(), 0 );
		}
	}
	
	public DescriptionDetails createDescriptionDetails(final Map attributeValues)
	{
		return createDescriptionDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public Facility createFacility(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.FACILITY );
			return (Facility)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Facility : "+e.getMessage(), 0 );
		}
	}
	
	public Facility createFacility(final Map attributeValues)
	{
		return createFacility( getSession().getSessionContext(), attributeValues );
	}
	
	public FileName createFileName(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.FILENAME );
			return (FileName)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FileName : "+e.getMessage(), 0 );
		}
	}
	
	public FileName createFileName(final Map attributeValues)
	{
		return createFileName( getSession().getSessionContext(), attributeValues );
	}
	
	public HealthAndSafety createHealthAndSafety(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.HEALTHANDSAFETY );
			return (HealthAndSafety)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HealthAndSafety : "+e.getMessage(), 0 );
		}
	}
	
	public HealthAndSafety createHealthAndSafety(final Map attributeValues)
	{
		return createHealthAndSafety( getSession().getSessionContext(), attributeValues );
	}
	
	public Individual createIndividual(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.INDIVIDUAL );
			return (Individual)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Individual : "+e.getMessage(), 0 );
		}
	}
	
	public Individual createIndividual(final Map attributeValues)
	{
		return createIndividual( getSession().getSessionContext(), attributeValues );
	}
	
	public Interest createInterest(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.INTEREST );
			return (Interest)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Interest : "+e.getMessage(), 0 );
		}
	}
	
	public Interest createInterest(final Map attributeValues)
	{
		return createInterest( getSession().getSessionContext(), attributeValues );
	}
	
	public NameOfPlace createNameOfPlace(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.NAMEOFPLACE );
			return (NameOfPlace)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating NameOfPlace : "+e.getMessage(), 0 );
		}
	}
	
	public NameOfPlace createNameOfPlace(final Map attributeValues)
	{
		return createNameOfPlace( getSession().getSessionContext(), attributeValues );
	}
	
	public PlaceDescription createPlaceDescription(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.PLACEDESCRIPTION );
			return (PlaceDescription)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PlaceDescription : "+e.getMessage(), 0 );
		}
	}
	
	public PlaceDescription createPlaceDescription(final Map attributeValues)
	{
		return createPlaceDescription( getSession().getSessionContext(), attributeValues );
	}
	
	public PointOfSale createPointOfSale(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.POINTOFSALE );
			return (PointOfSale)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PointOfSale : "+e.getMessage(), 0 );
		}
	}
	
	public PointOfSale createPointOfSale(final Map attributeValues)
	{
		return createPointOfSale( getSession().getSessionContext(), attributeValues );
	}
	
	public PriceRetention createPriceRetention(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.PRICERETENTION );
			return (PriceRetention)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PriceRetention : "+e.getMessage(), 0 );
		}
	}
	
	public PriceRetention createPriceRetention(final Map attributeValues)
	{
		return createPriceRetention( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductDefinition createProductDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.PRODUCTDEFINITION );
			return (ProductDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ProductDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public ProductDefinition createProductDefinition(final Map attributeValues)
	{
		return createProductDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductUpdate createProductUpdate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.PRODUCTUPDATE );
			return (ProductUpdate)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ProductUpdate : "+e.getMessage(), 0 );
		}
	}
	
	public ProductUpdate createProductUpdate(final Map attributeValues)
	{
		return createProductUpdate( getSession().getSessionContext(), attributeValues );
	}
	
	public Route createRoute(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.ROUTE );
			return (Route)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Route : "+e.getMessage(), 0 );
		}
	}
	
	public Route createRoute(final Map attributeValues)
	{
		return createRoute( getSession().getSessionContext(), attributeValues );
	}
	
	public RuleInfo createRuleInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.RULEINFO );
			return (RuleInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RuleInfo : "+e.getMessage(), 0 );
		}
	}
	
	public RuleInfo createRuleInfo(final Map attributeValues)
	{
		return createRuleInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public TravelogixRuleType createTravelogixRuleType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CommonproductcoreConstants.TC.TRAVELOGIXRULETYPE );
			return (TravelogixRuleType)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TravelogixRuleType : "+e.getMessage(), 0 );
		}
	}
	
	public TravelogixRuleType createTravelogixRuleType(final Map attributeValues)
	{
		return createTravelogixRuleType( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.displayName</code> attribute.
	 * @return the displayName - Display Name
	 */
	public String getDisplayName(final SessionContext ctx, final Product item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.getDisplayName requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, CommonproductcoreConstants.Attributes.Product.DISPLAYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.displayName</code> attribute.
	 * @return the displayName - Display Name
	 */
	public String getDisplayName(final Product item)
	{
		return getDisplayName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.displayName</code> attribute. 
	 * @return the localized displayName - Display Name
	 */
	public Map<Language,String> getAllDisplayName(final SessionContext ctx, final Product item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,CommonproductcoreConstants.Attributes.Product.DISPLAYNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.displayName</code> attribute. 
	 * @return the localized displayName - Display Name
	 */
	public Map<Language,String> getAllDisplayName(final Product item)
	{
		return getAllDisplayName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.displayName</code> attribute. 
	 * @param value the displayName - Display Name
	 */
	public void setDisplayName(final SessionContext ctx, final Product item, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.setDisplayName requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, CommonproductcoreConstants.Attributes.Product.DISPLAYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.displayName</code> attribute. 
	 * @param value the displayName - Display Name
	 */
	public void setDisplayName(final Product item, final String value)
	{
		setDisplayName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.displayName</code> attribute. 
	 * @param value the displayName - Display Name
	 */
	public void setAllDisplayName(final SessionContext ctx, final Product item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,CommonproductcoreConstants.Attributes.Product.DISPLAYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.displayName</code> attribute. 
	 * @param value the displayName - Display Name
	 */
	public void setAllDisplayName(final Product item, final Map<Language,String> value)
	{
		setAllDisplayName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.eContactInfos</code> attribute.
	 * @return the eContactInfos
	 */
	public Collection<EContactInfo> getEContactInfos(final SessionContext ctx, final StaffInformation item)
	{
		return STAFFINFORMATIONTOECONTACTINFOSECONTACTINFOSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.eContactInfos</code> attribute.
	 * @return the eContactInfos
	 */
	public Collection<EContactInfo> getEContactInfos(final StaffInformation item)
	{
		return getEContactInfos( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.eContactInfos</code> attribute. 
	 * @param value the eContactInfos
	 */
	public void setEContactInfos(final SessionContext ctx, final StaffInformation item, final Collection<EContactInfo> value)
	{
		STAFFINFORMATIONTOECONTACTINFOSECONTACTINFOSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.eContactInfos</code> attribute. 
	 * @param value the eContactInfos
	 */
	public void setEContactInfos(final StaffInformation item, final Collection<EContactInfo> value)
	{
		setEContactInfos( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to eContactInfos. 
	 * @param value the item to add to eContactInfos
	 */
	public void addToEContactInfos(final SessionContext ctx, final StaffInformation item, final EContactInfo value)
	{
		STAFFINFORMATIONTOECONTACTINFOSECONTACTINFOSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to eContactInfos. 
	 * @param value the item to add to eContactInfos
	 */
	public void addToEContactInfos(final StaffInformation item, final EContactInfo value)
	{
		addToEContactInfos( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from eContactInfos. 
	 * @param value the item to remove from eContactInfos
	 */
	public void removeFromEContactInfos(final SessionContext ctx, final StaffInformation item, final EContactInfo value)
	{
		STAFFINFORMATIONTOECONTACTINFOSECONTACTINFOSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from eContactInfos. 
	 * @param value the item to remove from eContactInfos
	 */
	public void removeFromEContactInfos(final StaffInformation item, final EContactInfo value)
	{
		removeFromEContactInfos( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.fileName</code> attribute.
	 * @return the fileName - Name of the media
	 */
	public FileName getFileName(final SessionContext ctx, final Media item)
	{
		return (FileName)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Media.FILENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.fileName</code> attribute.
	 * @return the fileName - Name of the media
	 */
	public FileName getFileName(final Media item)
	{
		return getFileName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.fileName</code> attribute. 
	 * @param value the fileName - Name of the media
	 */
	public void setFileName(final SessionContext ctx, final Media item, final FileName value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Media.FILENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.fileName</code> attribute. 
	 * @param value the fileName - Name of the media
	 */
	public void setFileName(final Media item, final FileName value)
	{
		setFileName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.financeControlId</code> attribute.
	 * @return the financeControlId - finance control Id has same
	 * 							value for all companies.
	 */
	public String getFinanceControlId(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Product.FINANCECONTROLID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.financeControlId</code> attribute.
	 * @return the financeControlId - finance control Id has same
	 * 							value for all companies.
	 */
	public String getFinanceControlId(final Product item)
	{
		return getFinanceControlId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.financeControlId</code> attribute. 
	 * @param value the financeControlId - finance control Id has same
	 * 							value for all companies.
	 */
	public void setFinanceControlId(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Product.FINANCECONTROLID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.financeControlId</code> attribute. 
	 * @param value the financeControlId - finance control Id has same
	 * 							value for all companies.
	 */
	public void setFinanceControlId(final Product item, final String value)
	{
		setFinanceControlId( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return CommonproductcoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.highlights</code> attribute.
	 * @return the highlights - highlights
	 */
	public String getHighlights(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Product.HIGHLIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.highlights</code> attribute.
	 * @return the highlights - highlights
	 */
	public String getHighlights(final Product item)
	{
		return getHighlights( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.highlights</code> attribute. 
	 * @param value the highlights - highlights
	 */
	public void setHighlights(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Product.HIGHLIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.highlights</code> attribute. 
	 * @param value the highlights - highlights
	 */
	public void setHighlights(final Product item, final String value)
	{
		setHighlights( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.interest</code> attribute.
	 * @return the interest - Interest
	 */
	public Interest getInterest(final SessionContext ctx, final Product item)
	{
		return (Interest)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Product.INTEREST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.interest</code> attribute.
	 * @return the interest - Interest
	 */
	public Interest getInterest(final Product item)
	{
		return getInterest( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.interest</code> attribute. 
	 * @param value the interest - Interest
	 */
	public void setInterest(final SessionContext ctx, final Product item, final Interest value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Product.INTEREST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.interest</code> attribute. 
	 * @param value the interest - Interest
	 */
	public void setInterest(final Product item, final Interest value)
	{
		setInterest( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isProductSharable</code> attribute.
	 * @return the isProductSharable - First Booking Check
	 */
	public Boolean isIsProductSharable(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Product.ISPRODUCTSHARABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isProductSharable</code> attribute.
	 * @return the isProductSharable - First Booking Check
	 */
	public Boolean isIsProductSharable(final Product item)
	{
		return isIsProductSharable( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isProductSharable</code> attribute. 
	 * @return the isProductSharable - First Booking Check
	 */
	public boolean isIsProductSharableAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isIsProductSharable( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isProductSharable</code> attribute. 
	 * @return the isProductSharable - First Booking Check
	 */
	public boolean isIsProductSharableAsPrimitive(final Product item)
	{
		return isIsProductSharableAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isProductSharable</code> attribute. 
	 * @param value the isProductSharable - First Booking Check
	 */
	public void setIsProductSharable(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Product.ISPRODUCTSHARABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isProductSharable</code> attribute. 
	 * @param value the isProductSharable - First Booking Check
	 */
	public void setIsProductSharable(final Product item, final Boolean value)
	{
		setIsProductSharable( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isProductSharable</code> attribute. 
	 * @param value the isProductSharable - First Booking Check
	 */
	public void setIsProductSharable(final SessionContext ctx, final Product item, final boolean value)
	{
		setIsProductSharable( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isProductSharable</code> attribute. 
	 * @param value the isProductSharable - First Booking Check
	 */
	public void setIsProductSharable(final Product item, final boolean value)
	{
		setIsProductSharable( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.lockedBy</code> attribute.
	 * @return the lockedBy - The User Who Changed the status.
	 */
	public Employee getLockedBy(final SessionContext ctx, final Product item)
	{
		return (Employee)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Product.LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.lockedBy</code> attribute.
	 * @return the lockedBy - The User Who Changed the status.
	 */
	public Employee getLockedBy(final Product item)
	{
		return getLockedBy( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.lockedBy</code> attribute. 
	 * @param value the lockedBy - The User Who Changed the status.
	 */
	public void setLockedBy(final SessionContext ctx, final Product item, final Employee value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Product.LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.lockedBy</code> attribute. 
	 * @param value the lockedBy - The User Who Changed the status.
	 */
	public void setLockedBy(final Product item, final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.longDescriptions</code> attribute.
	 * @return the longDescriptions
	 */
	public Collection<DescriptionDetails> getLongDescriptions(final SessionContext ctx, final Product item)
	{
		return PRODUCTTOLONGDESCRIPTIONSLONGDESCRIPTIONSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.longDescriptions</code> attribute.
	 * @return the longDescriptions
	 */
	public Collection<DescriptionDetails> getLongDescriptions(final Product item)
	{
		return getLongDescriptions( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.longDescriptions</code> attribute. 
	 * @param value the longDescriptions
	 */
	public void setLongDescriptions(final SessionContext ctx, final Product item, final Collection<DescriptionDetails> value)
	{
		PRODUCTTOLONGDESCRIPTIONSLONGDESCRIPTIONSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.longDescriptions</code> attribute. 
	 * @param value the longDescriptions
	 */
	public void setLongDescriptions(final Product item, final Collection<DescriptionDetails> value)
	{
		setLongDescriptions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to longDescriptions. 
	 * @param value the item to add to longDescriptions
	 */
	public void addToLongDescriptions(final SessionContext ctx, final Product item, final DescriptionDetails value)
	{
		PRODUCTTOLONGDESCRIPTIONSLONGDESCRIPTIONSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to longDescriptions. 
	 * @param value the item to add to longDescriptions
	 */
	public void addToLongDescriptions(final Product item, final DescriptionDetails value)
	{
		addToLongDescriptions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from longDescriptions. 
	 * @param value the item to remove from longDescriptions
	 */
	public void removeFromLongDescriptions(final SessionContext ctx, final Product item, final DescriptionDetails value)
	{
		PRODUCTTOLONGDESCRIPTIONSLONGDESCRIPTIONSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from longDescriptions. 
	 * @param value the item to remove from longDescriptions
	 */
	public void removeFromLongDescriptions(final Product item, final DescriptionDetails value)
	{
		removeFromLongDescriptions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.marketDeactivationConfig</code> attribute.
	 * @return the marketDeactivationConfig
	 */
	public Collection<DeactivationConfig> getMarketDeactivationConfig(final SessionContext ctx, final Product item)
	{
		return PRODUCTTOMARKETDEACTIVATIONCONFIGMARKETDEACTIVATIONCONFIGHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.marketDeactivationConfig</code> attribute.
	 * @return the marketDeactivationConfig
	 */
	public Collection<DeactivationConfig> getMarketDeactivationConfig(final Product item)
	{
		return getMarketDeactivationConfig( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.marketDeactivationConfig</code> attribute. 
	 * @param value the marketDeactivationConfig
	 */
	public void setMarketDeactivationConfig(final SessionContext ctx, final Product item, final Collection<DeactivationConfig> value)
	{
		PRODUCTTOMARKETDEACTIVATIONCONFIGMARKETDEACTIVATIONCONFIGHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.marketDeactivationConfig</code> attribute. 
	 * @param value the marketDeactivationConfig
	 */
	public void setMarketDeactivationConfig(final Product item, final Collection<DeactivationConfig> value)
	{
		setMarketDeactivationConfig( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to marketDeactivationConfig. 
	 * @param value the item to add to marketDeactivationConfig
	 */
	public void addToMarketDeactivationConfig(final SessionContext ctx, final Product item, final DeactivationConfig value)
	{
		PRODUCTTOMARKETDEACTIVATIONCONFIGMARKETDEACTIVATIONCONFIGHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to marketDeactivationConfig. 
	 * @param value the item to add to marketDeactivationConfig
	 */
	public void addToMarketDeactivationConfig(final Product item, final DeactivationConfig value)
	{
		addToMarketDeactivationConfig( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from marketDeactivationConfig. 
	 * @param value the item to remove from marketDeactivationConfig
	 */
	public void removeFromMarketDeactivationConfig(final SessionContext ctx, final Product item, final DeactivationConfig value)
	{
		PRODUCTTOMARKETDEACTIVATIONCONFIGMARKETDEACTIVATIONCONFIGHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from marketDeactivationConfig. 
	 * @param value the item to remove from marketDeactivationConfig
	 */
	public void removeFromMarketDeactivationConfig(final Product item, final DeactivationConfig value)
	{
		removeFromMarketDeactivationConfig( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.name</code> attribute.
	 * @return the name - Name of Park Map
	 */
	public String getName(final SessionContext ctx, final Media item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMedia.getName requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, CommonproductcoreConstants.Attributes.Media.NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.name</code> attribute.
	 * @return the name - Name of Park Map
	 */
	public String getName(final Media item)
	{
		return getName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.name</code> attribute. 
	 * @return the localized name - Name of Park Map
	 */
	public Map<Language,String> getAllName(final SessionContext ctx, final Media item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,CommonproductcoreConstants.Attributes.Media.NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.name</code> attribute. 
	 * @return the localized name - Name of Park Map
	 */
	public Map<Language,String> getAllName(final Media item)
	{
		return getAllName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.name</code> attribute. 
	 * @param value the name - Name of Park Map
	 */
	public void setName(final SessionContext ctx, final Media item, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMedia.setName requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, CommonproductcoreConstants.Attributes.Media.NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.name</code> attribute. 
	 * @param value the name - Name of Park Map
	 */
	public void setName(final Media item, final String value)
	{
		setName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.name</code> attribute. 
	 * @param value the name - Name of Park Map
	 */
	public void setAllName(final SessionContext ctx, final Media item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,CommonproductcoreConstants.Attributes.Media.NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.name</code> attribute. 
	 * @param value the name - Name of Park Map
	 */
	public void setAllName(final Media item, final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productUpdates</code> attribute.
	 * @return the productUpdates
	 */
	public Collection<ProductUpdate> getProductUpdates(final SessionContext ctx, final Product item)
	{
		return PRODUCTTOPRODUCTUPDATEPRODUCTUPDATESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productUpdates</code> attribute.
	 * @return the productUpdates
	 */
	public Collection<ProductUpdate> getProductUpdates(final Product item)
	{
		return getProductUpdates( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productUpdates</code> attribute. 
	 * @param value the productUpdates
	 */
	public void setProductUpdates(final SessionContext ctx, final Product item, final Collection<ProductUpdate> value)
	{
		PRODUCTTOPRODUCTUPDATEPRODUCTUPDATESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productUpdates</code> attribute. 
	 * @param value the productUpdates
	 */
	public void setProductUpdates(final Product item, final Collection<ProductUpdate> value)
	{
		setProductUpdates( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productUpdates. 
	 * @param value the item to add to productUpdates
	 */
	public void addToProductUpdates(final SessionContext ctx, final Product item, final ProductUpdate value)
	{
		PRODUCTTOPRODUCTUPDATEPRODUCTUPDATESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productUpdates. 
	 * @param value the item to add to productUpdates
	 */
	public void addToProductUpdates(final Product item, final ProductUpdate value)
	{
		addToProductUpdates( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productUpdates. 
	 * @param value the item to remove from productUpdates
	 */
	public void removeFromProductUpdates(final SessionContext ctx, final Product item, final ProductUpdate value)
	{
		PRODUCTTOPRODUCTUPDATEPRODUCTUPDATESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productUpdates. 
	 * @param value the item to remove from productUpdates
	 */
	public void removeFromProductUpdates(final Product item, final ProductUpdate value)
	{
		removeFromProductUpdates( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Product.REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason(final Product item)
	{
		return getReason( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Product.REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final Product item, final String value)
	{
		setReason( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.roomCategory</code> attribute.
	 * @return the roomCategory - Room Category
	 */
	public EnumerationValue getRoomCategory(final SessionContext ctx, final Media item)
	{
		return (EnumerationValue)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Media.ROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.roomCategory</code> attribute.
	 * @return the roomCategory - Room Category
	 */
	public EnumerationValue getRoomCategory(final Media item)
	{
		return getRoomCategory( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.roomCategory</code> attribute. 
	 * @param value the roomCategory - Room Category
	 */
	public void setRoomCategory(final SessionContext ctx, final Media item, final EnumerationValue value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Media.ROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.roomCategory</code> attribute. 
	 * @param value the roomCategory - Room Category
	 */
	public void setRoomCategory(final Media item, final EnumerationValue value)
	{
		setRoomCategory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sellingTips</code> attribute.
	 * @return the sellingTips - selling Tips
	 */
	public String getSellingTips(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Product.SELLINGTIPS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sellingTips</code> attribute.
	 * @return the sellingTips - selling Tips
	 */
	public String getSellingTips(final Product item)
	{
		return getSellingTips( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sellingTips</code> attribute. 
	 * @param value the sellingTips - selling Tips
	 */
	public void setSellingTips(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Product.SELLINGTIPS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sellingTips</code> attribute. 
	 * @param value the sellingTips - selling Tips
	 */
	public void setSellingTips(final Product item, final String value)
	{
		setSellingTips( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.shortDescriptions</code> attribute.
	 * @return the shortDescriptions
	 */
	public Collection<DescriptionDetails> getShortDescriptions(final SessionContext ctx, final Product item)
	{
		return PRODUCTTOSHORTDESCRIPTIONSSHORTDESCRIPTIONSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.shortDescriptions</code> attribute.
	 * @return the shortDescriptions
	 */
	public Collection<DescriptionDetails> getShortDescriptions(final Product item)
	{
		return getShortDescriptions( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.shortDescriptions</code> attribute. 
	 * @param value the shortDescriptions
	 */
	public void setShortDescriptions(final SessionContext ctx, final Product item, final Collection<DescriptionDetails> value)
	{
		PRODUCTTOSHORTDESCRIPTIONSSHORTDESCRIPTIONSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.shortDescriptions</code> attribute. 
	 * @param value the shortDescriptions
	 */
	public void setShortDescriptions(final Product item, final Collection<DescriptionDetails> value)
	{
		setShortDescriptions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shortDescriptions. 
	 * @param value the item to add to shortDescriptions
	 */
	public void addToShortDescriptions(final SessionContext ctx, final Product item, final DescriptionDetails value)
	{
		PRODUCTTOSHORTDESCRIPTIONSSHORTDESCRIPTIONSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shortDescriptions. 
	 * @param value the item to add to shortDescriptions
	 */
	public void addToShortDescriptions(final Product item, final DescriptionDetails value)
	{
		addToShortDescriptions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shortDescriptions. 
	 * @param value the item to remove from shortDescriptions
	 */
	public void removeFromShortDescriptions(final SessionContext ctx, final Product item, final DescriptionDetails value)
	{
		PRODUCTTOSHORTDESCRIPTIONSSHORTDESCRIPTIONSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shortDescriptions. 
	 * @param value the item to remove from shortDescriptions
	 */
	public void removeFromShortDescriptions(final Product item, final DescriptionDetails value)
	{
		removeFromShortDescriptions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EContactInfo.staffInformation</code> attribute.
	 * @return the staffInformation
	 */
	public StaffInformation getStaffInformation(final SessionContext ctx, final EContactInfo item)
	{
		return (StaffInformation)item.getProperty( ctx, CommonproductcoreConstants.Attributes.EContactInfo.STAFFINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EContactInfo.staffInformation</code> attribute.
	 * @return the staffInformation
	 */
	public StaffInformation getStaffInformation(final EContactInfo item)
	{
		return getStaffInformation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EContactInfo.staffInformation</code> attribute. 
	 * @param value the staffInformation
	 */
	public void setStaffInformation(final SessionContext ctx, final EContactInfo item, final StaffInformation value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.EContactInfo.STAFFINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EContactInfo.staffInformation</code> attribute. 
	 * @param value the staffInformation
	 */
	public void setStaffInformation(final EContactInfo item, final StaffInformation value)
	{
		setStaffInformation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.usp</code> attribute.
	 * @return the usp - USP
	 */
	public String getUsp(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Product.USP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.usp</code> attribute.
	 * @return the usp - USP
	 */
	public String getUsp(final Product item)
	{
		return getUsp( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.usp</code> attribute. 
	 * @param value the usp - USP
	 */
	public void setUsp(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Product.USP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.usp</code> attribute. 
	 * @param value the usp - USP
	 */
	public void setUsp(final Product item, final String value)
	{
		setUsp( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.validFromTO</code> attribute.
	 * @return the validFromTO - Valid From
	 */
	public StandardDateRange getValidFromTO(final SessionContext ctx, final Media item)
	{
		return (StandardDateRange)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Media.VALIDFROMTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.validFromTO</code> attribute.
	 * @return the validFromTO - Valid From
	 */
	public StandardDateRange getValidFromTO(final Media item)
	{
		return getValidFromTO( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.validFromTO</code> attribute. 
	 * @param value the validFromTO - Valid From
	 */
	public void setValidFromTO(final SessionContext ctx, final Media item, final StandardDateRange value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Media.VALIDFROMTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.validFromTO</code> attribute. 
	 * @param value the validFromTO - Valid From
	 */
	public void setValidFromTO(final Media item, final StandardDateRange value)
	{
		setValidFromTO( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx, final Product item)
	{
		return (EnumerationValue)item.getProperty( ctx, CommonproductcoreConstants.Attributes.Product.WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final Product item)
	{
		return getWorkFlowStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final Product item, final EnumerationValue value)
	{
		item.setProperty(ctx, CommonproductcoreConstants.Attributes.Product.WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final Product item, final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), item, value );
	}
	
}
