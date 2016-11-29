/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.dealcode.jalo.CorporateDealCodes;
import com.cnk.travelogix.client.config.core.document.jalo.DocumentManagement;
import com.cnk.travelogix.client.config.core.jalo.AbstractCriteria;
import com.cnk.travelogix.client.config.core.jalo.AbstractProductDocument;
import com.cnk.travelogix.client.config.core.jalo.AccommodationProductDocument;
import com.cnk.travelogix.client.config.core.jalo.ActivitiesProductDocument;
import com.cnk.travelogix.client.config.core.jalo.AncillaryDetails;
import com.cnk.travelogix.client.config.core.jalo.AssociatedCategories;
import com.cnk.travelogix.client.config.core.jalo.AssociatedCredentials;
import com.cnk.travelogix.client.config.core.jalo.AssociatedProduct;
import com.cnk.travelogix.client.config.core.jalo.AssociatedProductAndCategorySubtype;
import com.cnk.travelogix.client.config.core.jalo.AssociatedSupplier;
import com.cnk.travelogix.client.config.core.jalo.BookingStatusCriteria;
import com.cnk.travelogix.client.config.core.jalo.BookingTravelValidity;
import com.cnk.travelogix.client.config.core.jalo.CommonPolicyCharges;
import com.cnk.travelogix.client.config.core.jalo.CompanyOffers;
import com.cnk.travelogix.client.config.core.jalo.CompanyPolicyAdvanceDefinition;
import com.cnk.travelogix.client.config.core.jalo.CompanyPolicyCabinClass;
import com.cnk.travelogix.client.config.core.jalo.CompanyPolicyDefCharges;
import com.cnk.travelogix.client.config.core.jalo.CompanyPolicyDefinition;
import com.cnk.travelogix.client.config.core.jalo.CompanyPolicyDetails;
import com.cnk.travelogix.client.config.core.jalo.CompanySpecificPolicy;
import com.cnk.travelogix.client.config.core.jalo.DocumentHandlingConfigMaster;
import com.cnk.travelogix.client.config.core.jalo.DocumentSetting;
import com.cnk.travelogix.client.config.core.jalo.EnquiryCriteria;
import com.cnk.travelogix.client.config.core.jalo.FlightBasis;
import com.cnk.travelogix.client.config.core.jalo.FlightTimings;
import com.cnk.travelogix.client.config.core.jalo.ForexProductDocument;
import com.cnk.travelogix.client.config.core.jalo.FormAndAttachment;
import com.cnk.travelogix.client.config.core.jalo.HolidaysProductDocument;
import com.cnk.travelogix.client.config.core.jalo.InsuranceProductDocument;
import com.cnk.travelogix.client.config.core.jalo.KPIDefinition;
import com.cnk.travelogix.client.config.core.jalo.KPIInfo;
import com.cnk.travelogix.client.config.core.jalo.MLMDistribution;
import com.cnk.travelogix.client.config.core.jalo.NumberOfNightsCriteria;
import com.cnk.travelogix.client.config.core.jalo.PaymentCriteria;
import com.cnk.travelogix.client.config.core.jalo.PolicyFixedCharges;
import com.cnk.travelogix.client.config.core.jalo.PolicyRailPassProduct;
import com.cnk.travelogix.client.config.core.jalo.PolicyRailTicketsProduct;
import com.cnk.travelogix.client.config.core.jalo.PolicyServiceProduct;
import com.cnk.travelogix.client.config.core.jalo.QuotationCriteria;
import com.cnk.travelogix.client.config.core.jalo.RetainCompanyCommercials;
import com.cnk.travelogix.client.config.core.jalo.RoomDetailsforAcco;
import com.cnk.travelogix.client.config.core.jalo.RoomDetailsforCruise;
import com.cnk.travelogix.client.config.core.jalo.RoomDetailsforExeCruise;
import com.cnk.travelogix.client.config.core.jalo.RoomLevel;
import com.cnk.travelogix.client.config.core.jalo.SupplierDetails;
import com.cnk.travelogix.client.config.core.jalo.TransportationCruiseProductDocument;
import com.cnk.travelogix.client.config.core.jalo.TransportationExceptFlightAndCruiseProductDocument;
import com.cnk.travelogix.client.config.core.jalo.TransportationFlightProductDocument;
import com.cnk.travelogix.client.config.core.jalo.TriggerEvent;
import com.cnk.travelogix.client.config.core.jalo.VisaProductDocument;
import com.cnk.travelogix.client.config.core.login.jalo.LoginConfig;
import com.cnk.travelogix.client.config.core.login.jalo.PasswordConfig;
import com.cnk.travelogix.client.config.core.partpayment.jalo.PartPaymentMasterConfig;
import com.cnk.travelogix.client.config.core.partpayment.jalo.PartPaymentSchedule;
import com.cnk.travelogix.client.config.core.partpayment.jalo.ProductInformation;
import com.cnk.travelogix.client.config.core.registration.jalo.B2BRegistrationConfig;
import com.cnk.travelogix.client.config.core.registration.jalo.B2CRegistrationConfig;
import com.cnk.travelogix.client.config.core.supplier.jalo.SupplierInformation;
import com.cnk.travelogix.client.config.core.timelimit.jalo.TimeLimitExpiryDetails;
import com.cnk.travelogix.client.config.core.timelimit.jalo.TimeLimitMasterConfig;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.version.jalo.VersionDetail;
import com.cnk.travelogix.orgstructure.core.jalo.AbstractOrganization;
import com.cnk.travelogix.orgstructure.core.sales.jalo.DistributionChannel;
import com.cnk.travelogix.product.common.core.jalo.PointOfSale;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.security.Principal;
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

/**
 * Generated class for type <code>ClientconfigManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientconfigManager extends Extension
{
	/** Relation ordering override parameter constants for LoginConfig2ChildClientTypes from ((clientconfig))*/
	protected static String LOGINCONFIG2CHILDCLIENTTYPES_SRC_ORDERED = "relation.LoginConfig2ChildClientTypes.source.ordered";
	protected static String LOGINCONFIG2CHILDCLIENTTYPES_TGT_ORDERED = "relation.LoginConfig2ChildClientTypes.target.ordered";
	/** Relation disable markmodifed parameter constants for LoginConfig2ChildClientTypes from ((clientconfig))*/
	protected static String LOGINCONFIG2CHILDCLIENTTYPES_MARKMODIFIED = "relation.LoginConfig2ChildClientTypes.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n CATEGORIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AssociatedCategories> PRINCIPAL2ASSOCIATEDCATEGORIESCATEGORIESHANDLER = new OneToManyHandler<AssociatedCategories>(
	ClientconfigConstants.TC.ASSOCIATEDCATEGORIES,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/** Relation ordering override parameter constants for CorporateDealCodes2Products from ((clientconfig))*/
	protected static String CORPORATEDEALCODES2PRODUCTS_SRC_ORDERED = "relation.CorporateDealCodes2Products.source.ordered";
	protected static String CORPORATEDEALCODES2PRODUCTS_TGT_ORDERED = "relation.CorporateDealCodes2Products.target.ordered";
	/** Relation disable markmodifed parameter constants for CorporateDealCodes2Products from ((clientconfig))*/
	protected static String CORPORATEDEALCODES2PRODUCTS_MARKMODIFIED = "relation.CorporateDealCodes2Products.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("loginConfigration", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.enumeration.EnumerationValue", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("productInformation", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("documentManagement", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.version.jalo.VersionDetail", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("loginConfigForForgetUserId", AttributeMode.INITIAL);
		tmp.put("passwordConfig", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.enumeration.EnumerationValue", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("loginConfigForThirdParties", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.enumeration.EnumerationValue", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("passwordConfigCustFields", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.enumeration.EnumerationValue", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("partPaymentMasterConfig", AttributeMode.INITIAL);
		tmp.put("documentHandlingConfigMaster", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.PointOfSale", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("timeLimitMasterConfig", AttributeMode.INITIAL);
		tmp.put("documentHandlingConfigMaster", AttributeMode.INITIAL);
		tmp.put("abstractProductDocument", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.supplier.core.supplier.jalo.Supplier", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("timeLimitMasterConfig", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.orgstructure.core.sales.jalo.DistributionChannel", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>Supplier.abstractProductDocument</code> attribute.
	 * @return the abstractProductDocument
	 */
	public AbstractProductDocument getAbstractProductDocument(final SessionContext ctx, final Supplier item)
	{
		return (AbstractProductDocument)item.getProperty( ctx, ClientconfigConstants.Attributes.Supplier.ABSTRACTPRODUCTDOCUMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.abstractProductDocument</code> attribute.
	 * @return the abstractProductDocument
	 */
	public AbstractProductDocument getAbstractProductDocument(final Supplier item)
	{
		return getAbstractProductDocument( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.abstractProductDocument</code> attribute. 
	 * @param value the abstractProductDocument
	 */
	public void setAbstractProductDocument(final SessionContext ctx, final Supplier item, final AbstractProductDocument value)
	{
		item.setProperty(ctx, ClientconfigConstants.Attributes.Supplier.ABSTRACTPRODUCTDOCUMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.abstractProductDocument</code> attribute. 
	 * @param value the abstractProductDocument
	 */
	public void setAbstractProductDocument(final Supplier item, final AbstractProductDocument value)
	{
		setAbstractProductDocument( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.categories</code> attribute.
	 * @return the categories
	 */
	public Collection<AssociatedCategories> getCategories(final SessionContext ctx, final Principal item)
	{
		return PRINCIPAL2ASSOCIATEDCATEGORIESCATEGORIESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.categories</code> attribute.
	 * @return the categories
	 */
	public Collection<AssociatedCategories> getCategories(final Principal item)
	{
		return getCategories( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.categories</code> attribute. 
	 * @param value the categories
	 */
	public void setCategories(final SessionContext ctx, final Principal item, final Collection<AssociatedCategories> value)
	{
		PRINCIPAL2ASSOCIATEDCATEGORIESCATEGORIESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.categories</code> attribute. 
	 * @param value the categories
	 */
	public void setCategories(final Principal item, final Collection<AssociatedCategories> value)
	{
		setCategories( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to categories. 
	 * @param value the item to add to categories
	 */
	public void addToCategories(final SessionContext ctx, final Principal item, final AssociatedCategories value)
	{
		PRINCIPAL2ASSOCIATEDCATEGORIESCATEGORIESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to categories. 
	 * @param value the item to add to categories
	 */
	public void addToCategories(final Principal item, final AssociatedCategories value)
	{
		addToCategories( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from categories. 
	 * @param value the item to remove from categories
	 */
	public void removeFromCategories(final SessionContext ctx, final Principal item, final AssociatedCategories value)
	{
		PRINCIPAL2ASSOCIATEDCATEGORIESCATEGORIESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from categories. 
	 * @param value the item to remove from categories
	 */
	public void removeFromCategories(final Principal item, final AssociatedCategories value)
	{
		removeFromCategories( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.corporateDealCodes</code> attribute.
	 * @return the corporateDealCodes
	 */
	public Collection<CorporateDealCodes> getCorporateDealCodes(final SessionContext ctx, final Product item)
	{
		final List<CorporateDealCodes> items = item.getLinkedItems( 
			ctx,
			false,
			ClientconfigConstants.Relations.CORPORATEDEALCODES2PRODUCTS,
			"CorporateDealCodes",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.corporateDealCodes</code> attribute.
	 * @return the corporateDealCodes
	 */
	public Collection<CorporateDealCodes> getCorporateDealCodes(final Product item)
	{
		return getCorporateDealCodes( getSession().getSessionContext(), item );
	}
	
	public long getCorporateDealCodesCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			ClientconfigConstants.Relations.CORPORATEDEALCODES2PRODUCTS,
			"CorporateDealCodes",
			null
		);
	}
	
	public long getCorporateDealCodesCount(final Product item)
	{
		return getCorporateDealCodesCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.corporateDealCodes</code> attribute. 
	 * @param value the corporateDealCodes
	 */
	public void setCorporateDealCodes(final SessionContext ctx, final Product item, final Collection<CorporateDealCodes> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			ClientconfigConstants.Relations.CORPORATEDEALCODES2PRODUCTS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CORPORATEDEALCODES2PRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.corporateDealCodes</code> attribute. 
	 * @param value the corporateDealCodes
	 */
	public void setCorporateDealCodes(final Product item, final Collection<CorporateDealCodes> value)
	{
		setCorporateDealCodes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to corporateDealCodes. 
	 * @param value the item to add to corporateDealCodes
	 */
	public void addToCorporateDealCodes(final SessionContext ctx, final Product item, final CorporateDealCodes value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			ClientconfigConstants.Relations.CORPORATEDEALCODES2PRODUCTS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CORPORATEDEALCODES2PRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to corporateDealCodes. 
	 * @param value the item to add to corporateDealCodes
	 */
	public void addToCorporateDealCodes(final Product item, final CorporateDealCodes value)
	{
		addToCorporateDealCodes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from corporateDealCodes. 
	 * @param value the item to remove from corporateDealCodes
	 */
	public void removeFromCorporateDealCodes(final SessionContext ctx, final Product item, final CorporateDealCodes value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			ClientconfigConstants.Relations.CORPORATEDEALCODES2PRODUCTS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CORPORATEDEALCODES2PRODUCTS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from corporateDealCodes. 
	 * @param value the item to remove from corporateDealCodes
	 */
	public void removeFromCorporateDealCodes(final Product item, final CorporateDealCodes value)
	{
		removeFromCorporateDealCodes( getSession().getSessionContext(), item, value );
	}
	
	public AbstractCriteria createAbstractCriteria(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ABSTRACTCRITERIA );
			return (AbstractCriteria)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AbstractCriteria : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractCriteria createAbstractCriteria(final Map attributeValues)
	{
		return createAbstractCriteria( getSession().getSessionContext(), attributeValues );
	}
	
	public AbstractProductDocument createAbstractProductDocument(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ABSTRACTPRODUCTDOCUMENT );
			return (AbstractProductDocument)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AbstractProductDocument : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractProductDocument createAbstractProductDocument(final Map attributeValues)
	{
		return createAbstractProductDocument( getSession().getSessionContext(), attributeValues );
	}
	
	public AccommodationProductDocument createAccommodationProductDocument(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ACCOMMODATIONPRODUCTDOCUMENT );
			return (AccommodationProductDocument)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccommodationProductDocument : "+e.getMessage(), 0 );
		}
	}
	
	public AccommodationProductDocument createAccommodationProductDocument(final Map attributeValues)
	{
		return createAccommodationProductDocument( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivitiesProductDocument createActivitiesProductDocument(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ACTIVITIESPRODUCTDOCUMENT );
			return (ActivitiesProductDocument)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivitiesProductDocument : "+e.getMessage(), 0 );
		}
	}
	
	public ActivitiesProductDocument createActivitiesProductDocument(final Map attributeValues)
	{
		return createActivitiesProductDocument( getSession().getSessionContext(), attributeValues );
	}
	
	public AncillaryDetails createAncillaryDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ANCILLARYDETAILS );
			return (AncillaryDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AncillaryDetails : "+e.getMessage(), 0 );
		}
	}
	
	public AncillaryDetails createAncillaryDetails(final Map attributeValues)
	{
		return createAncillaryDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public AssociatedCategories createAssociatedCategories(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ASSOCIATEDCATEGORIES );
			return (AssociatedCategories)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AssociatedCategories : "+e.getMessage(), 0 );
		}
	}
	
	public AssociatedCategories createAssociatedCategories(final Map attributeValues)
	{
		return createAssociatedCategories( getSession().getSessionContext(), attributeValues );
	}
	
	public AssociatedCredentials createAssociatedCredentials(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ASSOCIATEDCREDENTIALS );
			return (AssociatedCredentials)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AssociatedCredentials : "+e.getMessage(), 0 );
		}
	}
	
	public AssociatedCredentials createAssociatedCredentials(final Map attributeValues)
	{
		return createAssociatedCredentials( getSession().getSessionContext(), attributeValues );
	}
	
	public AssociatedProduct createAssociatedProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ASSOCIATEDPRODUCT );
			return (AssociatedProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AssociatedProduct : "+e.getMessage(), 0 );
		}
	}
	
	public AssociatedProduct createAssociatedProduct(final Map attributeValues)
	{
		return createAssociatedProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public AssociatedProductAndCategorySubtype createAssociatedProductAndCategorySubtype(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ASSOCIATEDPRODUCTANDCATEGORYSUBTYPE );
			return (AssociatedProductAndCategorySubtype)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AssociatedProductAndCategorySubtype : "+e.getMessage(), 0 );
		}
	}
	
	public AssociatedProductAndCategorySubtype createAssociatedProductAndCategorySubtype(final Map attributeValues)
	{
		return createAssociatedProductAndCategorySubtype( getSession().getSessionContext(), attributeValues );
	}
	
	public AssociatedSupplier createAssociatedSupplier(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ASSOCIATEDSUPPLIER );
			return (AssociatedSupplier)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AssociatedSupplier : "+e.getMessage(), 0 );
		}
	}
	
	public AssociatedSupplier createAssociatedSupplier(final Map attributeValues)
	{
		return createAssociatedSupplier( getSession().getSessionContext(), attributeValues );
	}
	
	public B2BRegistrationConfig createB2BRegistrationConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.B2BREGISTRATIONCONFIG );
			return (B2BRegistrationConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating B2BRegistrationConfig : "+e.getMessage(), 0 );
		}
	}
	
	public B2BRegistrationConfig createB2BRegistrationConfig(final Map attributeValues)
	{
		return createB2BRegistrationConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public B2CRegistrationConfig createB2CRegistrationConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.B2CREGISTRATIONCONFIG );
			return (B2CRegistrationConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating B2CRegistrationConfig : "+e.getMessage(), 0 );
		}
	}
	
	public B2CRegistrationConfig createB2CRegistrationConfig(final Map attributeValues)
	{
		return createB2CRegistrationConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public BookingStatusCriteria createBookingStatusCriteria(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.BOOKINGSTATUSCRITERIA );
			return (BookingStatusCriteria)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BookingStatusCriteria : "+e.getMessage(), 0 );
		}
	}
	
	public BookingStatusCriteria createBookingStatusCriteria(final Map attributeValues)
	{
		return createBookingStatusCriteria( getSession().getSessionContext(), attributeValues );
	}
	
	public BookingTravelValidity createBookingTravelValidity(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.BOOKINGTRAVELVALIDITY );
			return (BookingTravelValidity)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BookingTravelValidity : "+e.getMessage(), 0 );
		}
	}
	
	public BookingTravelValidity createBookingTravelValidity(final Map attributeValues)
	{
		return createBookingTravelValidity( getSession().getSessionContext(), attributeValues );
	}
	
	public CommonPolicyCharges createCommonPolicyCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.COMMONPOLICYCHARGES );
			return (CommonPolicyCharges)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CommonPolicyCharges : "+e.getMessage(), 0 );
		}
	}
	
	public CommonPolicyCharges createCommonPolicyCharges(final Map attributeValues)
	{
		return createCommonPolicyCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyPolicyAdvanceDefinition createCompanyPolicyAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.COMPANYPOLICYADVANCEDEFINITION );
			return (CompanyPolicyAdvanceDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CompanyPolicyAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyPolicyAdvanceDefinition createCompanyPolicyAdvanceDefinition(final Map attributeValues)
	{
		return createCompanyPolicyAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyPolicyCabinClass createCompanyPolicyCabinClass(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.COMPANYPOLICYCABINCLASS );
			return (CompanyPolicyCabinClass)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CompanyPolicyCabinClass : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyPolicyCabinClass createCompanyPolicyCabinClass(final Map attributeValues)
	{
		return createCompanyPolicyCabinClass( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyPolicyDefCharges createCompanyPolicyDefCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.COMPANYPOLICYDEFCHARGES );
			return (CompanyPolicyDefCharges)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CompanyPolicyDefCharges : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyPolicyDefCharges createCompanyPolicyDefCharges(final Map attributeValues)
	{
		return createCompanyPolicyDefCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyPolicyDefinition createCompanyPolicyDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.COMPANYPOLICYDEFINITION );
			return (CompanyPolicyDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CompanyPolicyDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyPolicyDefinition createCompanyPolicyDefinition(final Map attributeValues)
	{
		return createCompanyPolicyDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyPolicyDetails createCompanyPolicyDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.COMPANYPOLICYDETAILS );
			return (CompanyPolicyDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CompanyPolicyDetails : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyPolicyDetails createCompanyPolicyDetails(final Map attributeValues)
	{
		return createCompanyPolicyDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanySpecificPolicy createCompanySpecificPolicy(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.COMPANYSPECIFICPOLICY );
			return (CompanySpecificPolicy)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CompanySpecificPolicy : "+e.getMessage(), 0 );
		}
	}
	
	public CompanySpecificPolicy createCompanySpecificPolicy(final Map attributeValues)
	{
		return createCompanySpecificPolicy( getSession().getSessionContext(), attributeValues );
	}
	
	public CorporateDealCodes createCorporateDealCodes(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.CORPORATEDEALCODES );
			return (CorporateDealCodes)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CorporateDealCodes : "+e.getMessage(), 0 );
		}
	}
	
	public CorporateDealCodes createCorporateDealCodes(final Map attributeValues)
	{
		return createCorporateDealCodes( getSession().getSessionContext(), attributeValues );
	}
	
	public DocumentHandlingConfigMaster createDocumentHandlingConfigMaster(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.DOCUMENTHANDLINGCONFIGMASTER );
			return (DocumentHandlingConfigMaster)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DocumentHandlingConfigMaster : "+e.getMessage(), 0 );
		}
	}
	
	public DocumentHandlingConfigMaster createDocumentHandlingConfigMaster(final Map attributeValues)
	{
		return createDocumentHandlingConfigMaster( getSession().getSessionContext(), attributeValues );
	}
	
	public DocumentManagement createDocumentManagement(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.DOCUMENTMANAGEMENT );
			return (DocumentManagement)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DocumentManagement : "+e.getMessage(), 0 );
		}
	}
	
	public DocumentManagement createDocumentManagement(final Map attributeValues)
	{
		return createDocumentManagement( getSession().getSessionContext(), attributeValues );
	}
	
	public DocumentSetting createDocumentSetting(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.DOCUMENTSETTING );
			return (DocumentSetting)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DocumentSetting : "+e.getMessage(), 0 );
		}
	}
	
	public DocumentSetting createDocumentSetting(final Map attributeValues)
	{
		return createDocumentSetting( getSession().getSessionContext(), attributeValues );
	}
	
	public EnquiryCriteria createEnquiryCriteria(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ENQUIRYCRITERIA );
			return (EnquiryCriteria)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating EnquiryCriteria : "+e.getMessage(), 0 );
		}
	}
	
	public EnquiryCriteria createEnquiryCriteria(final Map attributeValues)
	{
		return createEnquiryCriteria( getSession().getSessionContext(), attributeValues );
	}
	
	public FlightBasis createFlightBasis(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.FLIGHTBASIS );
			return (FlightBasis)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FlightBasis : "+e.getMessage(), 0 );
		}
	}
	
	public FlightBasis createFlightBasis(final Map attributeValues)
	{
		return createFlightBasis( getSession().getSessionContext(), attributeValues );
	}
	
	public FlightTimings createFlightTimings(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.FLIGHTTIMINGS );
			return (FlightTimings)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FlightTimings : "+e.getMessage(), 0 );
		}
	}
	
	public FlightTimings createFlightTimings(final Map attributeValues)
	{
		return createFlightTimings( getSession().getSessionContext(), attributeValues );
	}
	
	public ForexProductDocument createForexProductDocument(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.FOREXPRODUCTDOCUMENT );
			return (ForexProductDocument)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ForexProductDocument : "+e.getMessage(), 0 );
		}
	}
	
	public ForexProductDocument createForexProductDocument(final Map attributeValues)
	{
		return createForexProductDocument( getSession().getSessionContext(), attributeValues );
	}
	
	public FormAndAttachment createFormAndAttachment(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.FORMANDATTACHMENT );
			return (FormAndAttachment)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FormAndAttachment : "+e.getMessage(), 0 );
		}
	}
	
	public FormAndAttachment createFormAndAttachment(final Map attributeValues)
	{
		return createFormAndAttachment( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidaysProductDocument createHolidaysProductDocument(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.HOLIDAYSPRODUCTDOCUMENT );
			return (HolidaysProductDocument)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidaysProductDocument : "+e.getMessage(), 0 );
		}
	}
	
	public HolidaysProductDocument createHolidaysProductDocument(final Map attributeValues)
	{
		return createHolidaysProductDocument( getSession().getSessionContext(), attributeValues );
	}
	
	public InsuranceProductDocument createInsuranceProductDocument(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.INSURANCEPRODUCTDOCUMENT );
			return (InsuranceProductDocument)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating InsuranceProductDocument : "+e.getMessage(), 0 );
		}
	}
	
	public InsuranceProductDocument createInsuranceProductDocument(final Map attributeValues)
	{
		return createInsuranceProductDocument( getSession().getSessionContext(), attributeValues );
	}
	
	public KPIDefinition createKPIDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.KPIDEFINITION );
			return (KPIDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating KPIDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public KPIDefinition createKPIDefinition(final Map attributeValues)
	{
		return createKPIDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public KPIInfo createKPIInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.KPIINFO );
			return (KPIInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating KPIInfo : "+e.getMessage(), 0 );
		}
	}
	
	public KPIInfo createKPIInfo(final Map attributeValues)
	{
		return createKPIInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public LoginConfig createLoginConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.LOGINCONFIG );
			return (LoginConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating LoginConfig : "+e.getMessage(), 0 );
		}
	}
	
	public LoginConfig createLoginConfig(final Map attributeValues)
	{
		return createLoginConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public MLMDistribution createMLMDistribution(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.MLMDISTRIBUTION );
			return (MLMDistribution)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating MLMDistribution : "+e.getMessage(), 0 );
		}
	}
	
	public MLMDistribution createMLMDistribution(final Map attributeValues)
	{
		return createMLMDistribution( getSession().getSessionContext(), attributeValues );
	}
	
	public NumberOfNightsCriteria createNumberOfNightsCriteria(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.NUMBEROFNIGHTSCRITERIA );
			return (NumberOfNightsCriteria)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating NumberOfNightsCriteria : "+e.getMessage(), 0 );
		}
	}
	
	public NumberOfNightsCriteria createNumberOfNightsCriteria(final Map attributeValues)
	{
		return createNumberOfNightsCriteria( getSession().getSessionContext(), attributeValues );
	}
	
	public PartPaymentMasterConfig createPartPaymentMasterConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.PARTPAYMENTMASTERCONFIG );
			return (PartPaymentMasterConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PartPaymentMasterConfig : "+e.getMessage(), 0 );
		}
	}
	
	public PartPaymentMasterConfig createPartPaymentMasterConfig(final Map attributeValues)
	{
		return createPartPaymentMasterConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public PartPaymentSchedule createPartPaymentSchedule(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.PARTPAYMENTSCHEDULE );
			return (PartPaymentSchedule)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PartPaymentSchedule : "+e.getMessage(), 0 );
		}
	}
	
	public PartPaymentSchedule createPartPaymentSchedule(final Map attributeValues)
	{
		return createPartPaymentSchedule( getSession().getSessionContext(), attributeValues );
	}
	
	public PasswordConfig createPasswordConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.PASSWORDCONFIG );
			return (PasswordConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PasswordConfig : "+e.getMessage(), 0 );
		}
	}
	
	public PasswordConfig createPasswordConfig(final Map attributeValues)
	{
		return createPasswordConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public PaymentCriteria createPaymentCriteria(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.PAYMENTCRITERIA );
			return (PaymentCriteria)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PaymentCriteria : "+e.getMessage(), 0 );
		}
	}
	
	public PaymentCriteria createPaymentCriteria(final Map attributeValues)
	{
		return createPaymentCriteria( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyOffers createPolicyCompanyOffers(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.POLICYCOMPANYOFFERS );
			return (CompanyOffers)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PolicyCompanyOffers : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyOffers createPolicyCompanyOffers(final Map attributeValues)
	{
		return createPolicyCompanyOffers( getSession().getSessionContext(), attributeValues );
	}
	
	public PolicyFixedCharges createPolicyFixedCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.POLICYFIXEDCHARGES );
			return (PolicyFixedCharges)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PolicyFixedCharges : "+e.getMessage(), 0 );
		}
	}
	
	public PolicyFixedCharges createPolicyFixedCharges(final Map attributeValues)
	{
		return createPolicyFixedCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public PolicyRailPassProduct createPolicyRailPassProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.POLICYRAILPASSPRODUCT );
			return (PolicyRailPassProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PolicyRailPassProduct : "+e.getMessage(), 0 );
		}
	}
	
	public PolicyRailPassProduct createPolicyRailPassProduct(final Map attributeValues)
	{
		return createPolicyRailPassProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public PolicyRailTicketsProduct createPolicyRailTicketsProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.POLICYRAILTICKETSPRODUCT );
			return (PolicyRailTicketsProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PolicyRailTicketsProduct : "+e.getMessage(), 0 );
		}
	}
	
	public PolicyRailTicketsProduct createPolicyRailTicketsProduct(final Map attributeValues)
	{
		return createPolicyRailTicketsProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public PolicyServiceProduct createPolicyServiceProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.POLICYSERVICEPRODUCT );
			return (PolicyServiceProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PolicyServiceProduct : "+e.getMessage(), 0 );
		}
	}
	
	public PolicyServiceProduct createPolicyServiceProduct(final Map attributeValues)
	{
		return createPolicyServiceProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductInformation createProductInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.PRODUCTINFORMATION );
			return (ProductInformation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ProductInformation : "+e.getMessage(), 0 );
		}
	}
	
	public ProductInformation createProductInformation(final Map attributeValues)
	{
		return createProductInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public QuotationCriteria createQuotationCriteria(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.QUOTATIONCRITERIA );
			return (QuotationCriteria)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating QuotationCriteria : "+e.getMessage(), 0 );
		}
	}
	
	public QuotationCriteria createQuotationCriteria(final Map attributeValues)
	{
		return createQuotationCriteria( getSession().getSessionContext(), attributeValues );
	}
	
	public RetainCompanyCommercials createRetainCompanyCommercials(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.RETAINCOMPANYCOMMERCIALS );
			return (RetainCompanyCommercials)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RetainCompanyCommercials : "+e.getMessage(), 0 );
		}
	}
	
	public RetainCompanyCommercials createRetainCompanyCommercials(final Map attributeValues)
	{
		return createRetainCompanyCommercials( getSession().getSessionContext(), attributeValues );
	}
	
	public RoomDetailsforAcco createRoomDetailsforAcco(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ROOMDETAILSFORACCO );
			return (RoomDetailsforAcco)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RoomDetailsforAcco : "+e.getMessage(), 0 );
		}
	}
	
	public RoomDetailsforAcco createRoomDetailsforAcco(final Map attributeValues)
	{
		return createRoomDetailsforAcco( getSession().getSessionContext(), attributeValues );
	}
	
	public RoomDetailsforCruise createRoomDetailsforCruise(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ROOMDETAILSFORCRUISE );
			return (RoomDetailsforCruise)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RoomDetailsforCruise : "+e.getMessage(), 0 );
		}
	}
	
	public RoomDetailsforCruise createRoomDetailsforCruise(final Map attributeValues)
	{
		return createRoomDetailsforCruise( getSession().getSessionContext(), attributeValues );
	}
	
	public RoomDetailsforExeCruise createRoomDetailsforExeCruise(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ROOMDETAILSFOREXECRUISE );
			return (RoomDetailsforExeCruise)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RoomDetailsforExeCruise : "+e.getMessage(), 0 );
		}
	}
	
	public RoomDetailsforExeCruise createRoomDetailsforExeCruise(final Map attributeValues)
	{
		return createRoomDetailsforExeCruise( getSession().getSessionContext(), attributeValues );
	}
	
	public RoomLevel createRoomLevel(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.ROOMLEVEL );
			return (RoomLevel)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RoomLevel : "+e.getMessage(), 0 );
		}
	}
	
	public RoomLevel createRoomLevel(final Map attributeValues)
	{
		return createRoomLevel( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierDetails createSupplierDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.SUPPLIERDETAILS );
			return (SupplierDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierDetails : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierDetails createSupplierDetails(final Map attributeValues)
	{
		return createSupplierDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierInformation createSupplierInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.SUPPLIERINFORMATION );
			return (SupplierInformation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierInformation : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierInformation createSupplierInformation(final Map attributeValues)
	{
		return createSupplierInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public TimeLimitExpiryDetails createTimeLimitExpiryDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.TIMELIMITEXPIRYDETAILS );
			return (TimeLimitExpiryDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TimeLimitExpiryDetails : "+e.getMessage(), 0 );
		}
	}
	
	public TimeLimitExpiryDetails createTimeLimitExpiryDetails(final Map attributeValues)
	{
		return createTimeLimitExpiryDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public TimeLimitMasterConfig createTimeLimitMasterConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.TIMELIMITMASTERCONFIG );
			return (TimeLimitMasterConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TimeLimitMasterConfig : "+e.getMessage(), 0 );
		}
	}
	
	public TimeLimitMasterConfig createTimeLimitMasterConfig(final Map attributeValues)
	{
		return createTimeLimitMasterConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public TransportationCruiseProductDocument createTransportationCruiseProductDocument(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.TRANSPORTATIONCRUISEPRODUCTDOCUMENT );
			return (TransportationCruiseProductDocument)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransportationCruiseProductDocument : "+e.getMessage(), 0 );
		}
	}
	
	public TransportationCruiseProductDocument createTransportationCruiseProductDocument(final Map attributeValues)
	{
		return createTransportationCruiseProductDocument( getSession().getSessionContext(), attributeValues );
	}
	
	public TransportationExceptFlightAndCruiseProductDocument createTransportationExceptFlightAndCruiseProductDocument(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.TRANSPORTATIONEXCEPTFLIGHTANDCRUISEPRODUCTDOCUMENT );
			return (TransportationExceptFlightAndCruiseProductDocument)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransportationExceptFlightAndCruiseProductDocument : "+e.getMessage(), 0 );
		}
	}
	
	public TransportationExceptFlightAndCruiseProductDocument createTransportationExceptFlightAndCruiseProductDocument(final Map attributeValues)
	{
		return createTransportationExceptFlightAndCruiseProductDocument( getSession().getSessionContext(), attributeValues );
	}
	
	public TransportationFlightProductDocument createTransportationFlightProductDocument(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.TRANSPORTATIONFLIGHTPRODUCTDOCUMENT );
			return (TransportationFlightProductDocument)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransportationFlightProductDocument : "+e.getMessage(), 0 );
		}
	}
	
	public TransportationFlightProductDocument createTransportationFlightProductDocument(final Map attributeValues)
	{
		return createTransportationFlightProductDocument( getSession().getSessionContext(), attributeValues );
	}
	
	public TriggerEvent createTriggerEvent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.TRIGGEREVENT );
			return (TriggerEvent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TriggerEvent : "+e.getMessage(), 0 );
		}
	}
	
	public TriggerEvent createTriggerEvent(final Map attributeValues)
	{
		return createTriggerEvent( getSession().getSessionContext(), attributeValues );
	}
	
	public VisaProductDocument createVisaProductDocument(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientconfigConstants.TC.VISAPRODUCTDOCUMENT );
			return (VisaProductDocument)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating VisaProductDocument : "+e.getMessage(), 0 );
		}
	}
	
	public VisaProductDocument createVisaProductDocument(final Map attributeValues)
	{
		return createVisaProductDocument( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfSale.documentHandlingConfigMaster</code> attribute.
	 * @return the documentHandlingConfigMaster
	 */
	public DocumentHandlingConfigMaster getDocumentHandlingConfigMaster(final SessionContext ctx, final PointOfSale item)
	{
		return (DocumentHandlingConfigMaster)item.getProperty( ctx, ClientconfigConstants.Attributes.PointOfSale.DOCUMENTHANDLINGCONFIGMASTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfSale.documentHandlingConfigMaster</code> attribute.
	 * @return the documentHandlingConfigMaster
	 */
	public DocumentHandlingConfigMaster getDocumentHandlingConfigMaster(final PointOfSale item)
	{
		return getDocumentHandlingConfigMaster( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PointOfSale.documentHandlingConfigMaster</code> attribute. 
	 * @param value the documentHandlingConfigMaster
	 */
	public void setDocumentHandlingConfigMaster(final SessionContext ctx, final PointOfSale item, final DocumentHandlingConfigMaster value)
	{
		item.setProperty(ctx, ClientconfigConstants.Attributes.PointOfSale.DOCUMENTHANDLINGCONFIGMASTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PointOfSale.documentHandlingConfigMaster</code> attribute. 
	 * @param value the documentHandlingConfigMaster
	 */
	public void setDocumentHandlingConfigMaster(final PointOfSale item, final DocumentHandlingConfigMaster value)
	{
		setDocumentHandlingConfigMaster( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.documentHandlingConfigMaster</code> attribute.
	 * @return the documentHandlingConfigMaster
	 */
	public DocumentHandlingConfigMaster getDocumentHandlingConfigMaster(final SessionContext ctx, final Supplier item)
	{
		return (DocumentHandlingConfigMaster)item.getProperty( ctx, ClientconfigConstants.Attributes.Supplier.DOCUMENTHANDLINGCONFIGMASTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.documentHandlingConfigMaster</code> attribute.
	 * @return the documentHandlingConfigMaster
	 */
	public DocumentHandlingConfigMaster getDocumentHandlingConfigMaster(final Supplier item)
	{
		return getDocumentHandlingConfigMaster( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.documentHandlingConfigMaster</code> attribute. 
	 * @param value the documentHandlingConfigMaster
	 */
	public void setDocumentHandlingConfigMaster(final SessionContext ctx, final Supplier item, final DocumentHandlingConfigMaster value)
	{
		item.setProperty(ctx, ClientconfigConstants.Attributes.Supplier.DOCUMENTHANDLINGCONFIGMASTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.documentHandlingConfigMaster</code> attribute. 
	 * @param value the documentHandlingConfigMaster
	 */
	public void setDocumentHandlingConfigMaster(final Supplier item, final DocumentHandlingConfigMaster value)
	{
		setDocumentHandlingConfigMaster( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.documentManagement</code> attribute.
	 * @return the documentManagement
	 */
	public DocumentManagement getDocumentManagement(final SessionContext ctx, final VersionDetail item)
	{
		return (DocumentManagement)item.getProperty( ctx, ClientconfigConstants.Attributes.VersionDetail.DOCUMENTMANAGEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.documentManagement</code> attribute.
	 * @return the documentManagement
	 */
	public DocumentManagement getDocumentManagement(final VersionDetail item)
	{
		return getDocumentManagement( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.documentManagement</code> attribute. 
	 * @param value the documentManagement
	 */
	public void setDocumentManagement(final SessionContext ctx, final VersionDetail item, final DocumentManagement value)
	{
		item.setProperty(ctx, ClientconfigConstants.Attributes.VersionDetail.DOCUMENTMANAGEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.documentManagement</code> attribute. 
	 * @param value the documentManagement
	 */
	public void setDocumentManagement(final VersionDetail item, final DocumentManagement value)
	{
		setDocumentManagement( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return ClientconfigConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationMode.loginConfigForForgetUserId</code> attribute.
	 * @return the loginConfigForForgetUserId
	 */
	public LoginConfig getLoginConfigForForgetUserId(final SessionContext ctx, final EnumerationValue item)
	{
		return (LoginConfig)item.getProperty( ctx, ClientconfigConstants.Attributes.CommunicationMode.LOGINCONFIGFORFORGETUSERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationMode.loginConfigForForgetUserId</code> attribute.
	 * @return the loginConfigForForgetUserId
	 */
	public LoginConfig getLoginConfigForForgetUserId(final EnumerationValue item)
	{
		return getLoginConfigForForgetUserId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationMode.loginConfigForForgetUserId</code> attribute. 
	 * @param value the loginConfigForForgetUserId
	 */
	public void setLoginConfigForForgetUserId(final SessionContext ctx, final EnumerationValue item, final LoginConfig value)
	{
		item.setProperty(ctx, ClientconfigConstants.Attributes.CommunicationMode.LOGINCONFIGFORFORGETUSERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationMode.loginConfigForForgetUserId</code> attribute. 
	 * @param value the loginConfigForForgetUserId
	 */
	public void setLoginConfigForForgetUserId(final EnumerationValue item, final LoginConfig value)
	{
		setLoginConfigForForgetUserId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllowedThirdParties.loginConfigForThirdParties</code> attribute.
	 * @return the loginConfigForThirdParties
	 */
	public LoginConfig getLoginConfigForThirdParties(final SessionContext ctx, final EnumerationValue item)
	{
		return (LoginConfig)item.getProperty( ctx, ClientconfigConstants.Attributes.AllowedThirdParties.LOGINCONFIGFORTHIRDPARTIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllowedThirdParties.loginConfigForThirdParties</code> attribute.
	 * @return the loginConfigForThirdParties
	 */
	public LoginConfig getLoginConfigForThirdParties(final EnumerationValue item)
	{
		return getLoginConfigForThirdParties( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllowedThirdParties.loginConfigForThirdParties</code> attribute. 
	 * @param value the loginConfigForThirdParties
	 */
	public void setLoginConfigForThirdParties(final SessionContext ctx, final EnumerationValue item, final LoginConfig value)
	{
		item.setProperty(ctx, ClientconfigConstants.Attributes.AllowedThirdParties.LOGINCONFIGFORTHIRDPARTIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllowedThirdParties.loginConfigForThirdParties</code> attribute. 
	 * @param value the loginConfigForThirdParties
	 */
	public void setLoginConfigForThirdParties(final EnumerationValue item, final LoginConfig value)
	{
		setLoginConfigForThirdParties( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginParameters.loginConfigration</code> attribute.
	 * @return the loginConfigration
	 */
	public LoginConfig getLoginConfigration(final SessionContext ctx, final EnumerationValue item)
	{
		return (LoginConfig)item.getProperty( ctx, ClientconfigConstants.Attributes.LoginParameters.LOGINCONFIGRATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginParameters.loginConfigration</code> attribute.
	 * @return the loginConfigration
	 */
	public LoginConfig getLoginConfigration(final EnumerationValue item)
	{
		return getLoginConfigration( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginParameters.loginConfigration</code> attribute. 
	 * @param value the loginConfigration
	 */
	public void setLoginConfigration(final SessionContext ctx, final EnumerationValue item, final LoginConfig value)
	{
		item.setProperty(ctx, ClientconfigConstants.Attributes.LoginParameters.LOGINCONFIGRATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginParameters.loginConfigration</code> attribute. 
	 * @param value the loginConfigration
	 */
	public void setLoginConfigration(final EnumerationValue item, final LoginConfig value)
	{
		setLoginConfigration( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.loginConfigration</code> attribute.
	 * @return the loginConfigration
	 */
	public Collection<LoginConfig> getLoginConfigration(final SessionContext ctx, final Principal item)
	{
		final List<LoginConfig> items = item.getLinkedItems( 
			ctx,
			false,
			ClientconfigConstants.Relations.LOGINCONFIG2CHILDCLIENTTYPES,
			"LoginConfig",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.loginConfigration</code> attribute.
	 * @return the loginConfigration
	 */
	public Collection<LoginConfig> getLoginConfigration(final Principal item)
	{
		return getLoginConfigration( getSession().getSessionContext(), item );
	}
	
	public long getLoginConfigrationCount(final SessionContext ctx, final Principal item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			ClientconfigConstants.Relations.LOGINCONFIG2CHILDCLIENTTYPES,
			"LoginConfig",
			null
		);
	}
	
	public long getLoginConfigrationCount(final Principal item)
	{
		return getLoginConfigrationCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.loginConfigration</code> attribute. 
	 * @param value the loginConfigration
	 */
	public void setLoginConfigration(final SessionContext ctx, final Principal item, final Collection<LoginConfig> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			ClientconfigConstants.Relations.LOGINCONFIG2CHILDCLIENTTYPES,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(LOGINCONFIG2CHILDCLIENTTYPES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.loginConfigration</code> attribute. 
	 * @param value the loginConfigration
	 */
	public void setLoginConfigration(final Principal item, final Collection<LoginConfig> value)
	{
		setLoginConfigration( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to loginConfigration. 
	 * @param value the item to add to loginConfigration
	 */
	public void addToLoginConfigration(final SessionContext ctx, final Principal item, final LoginConfig value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			ClientconfigConstants.Relations.LOGINCONFIG2CHILDCLIENTTYPES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(LOGINCONFIG2CHILDCLIENTTYPES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to loginConfigration. 
	 * @param value the item to add to loginConfigration
	 */
	public void addToLoginConfigration(final Principal item, final LoginConfig value)
	{
		addToLoginConfigration( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from loginConfigration. 
	 * @param value the item to remove from loginConfigration
	 */
	public void removeFromLoginConfigration(final SessionContext ctx, final Principal item, final LoginConfig value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			ClientconfigConstants.Relations.LOGINCONFIG2CHILDCLIENTTYPES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(LOGINCONFIG2CHILDCLIENTTYPES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from loginConfigration. 
	 * @param value the item to remove from loginConfigration
	 */
	public void removeFromLoginConfigration(final Principal item, final LoginConfig value)
	{
		removeFromLoginConfigration( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfSale.partPaymentMasterConfig</code> attribute.
	 * @return the partPaymentMasterConfig
	 */
	public PartPaymentMasterConfig getPartPaymentMasterConfig(final SessionContext ctx, final PointOfSale item)
	{
		return (PartPaymentMasterConfig)item.getProperty( ctx, ClientconfigConstants.Attributes.PointOfSale.PARTPAYMENTMASTERCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PointOfSale.partPaymentMasterConfig</code> attribute.
	 * @return the partPaymentMasterConfig
	 */
	public PartPaymentMasterConfig getPartPaymentMasterConfig(final PointOfSale item)
	{
		return getPartPaymentMasterConfig( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PointOfSale.partPaymentMasterConfig</code> attribute. 
	 * @param value the partPaymentMasterConfig
	 */
	public void setPartPaymentMasterConfig(final SessionContext ctx, final PointOfSale item, final PartPaymentMasterConfig value)
	{
		item.setProperty(ctx, ClientconfigConstants.Attributes.PointOfSale.PARTPAYMENTMASTERCONFIG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PointOfSale.partPaymentMasterConfig</code> attribute. 
	 * @param value the partPaymentMasterConfig
	 */
	public void setPartPaymentMasterConfig(final PointOfSale item, final PartPaymentMasterConfig value)
	{
		setPartPaymentMasterConfig( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationMode.passwordConfig</code> attribute.
	 * @return the passwordConfig
	 */
	public PasswordConfig getPasswordConfig(final SessionContext ctx, final EnumerationValue item)
	{
		return (PasswordConfig)item.getProperty( ctx, ClientconfigConstants.Attributes.CommunicationMode.PASSWORDCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationMode.passwordConfig</code> attribute.
	 * @return the passwordConfig
	 */
	public PasswordConfig getPasswordConfig(final EnumerationValue item)
	{
		return getPasswordConfig( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationMode.passwordConfig</code> attribute. 
	 * @param value the passwordConfig
	 */
	public void setPasswordConfig(final SessionContext ctx, final EnumerationValue item, final PasswordConfig value)
	{
		item.setProperty(ctx, ClientconfigConstants.Attributes.CommunicationMode.PASSWORDCONFIG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationMode.passwordConfig</code> attribute. 
	 * @param value the passwordConfig
	 */
	public void setPasswordConfig(final EnumerationValue item, final PasswordConfig value)
	{
		setPasswordConfig( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomFields.passwordConfigCustFields</code> attribute.
	 * @return the passwordConfigCustFields
	 */
	public PasswordConfig getPasswordConfigCustFields(final SessionContext ctx, final EnumerationValue item)
	{
		return (PasswordConfig)item.getProperty( ctx, ClientconfigConstants.Attributes.CustomFields.PASSWORDCONFIGCUSTFIELDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomFields.passwordConfigCustFields</code> attribute.
	 * @return the passwordConfigCustFields
	 */
	public PasswordConfig getPasswordConfigCustFields(final EnumerationValue item)
	{
		return getPasswordConfigCustFields( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomFields.passwordConfigCustFields</code> attribute. 
	 * @param value the passwordConfigCustFields
	 */
	public void setPasswordConfigCustFields(final SessionContext ctx, final EnumerationValue item, final PasswordConfig value)
	{
		item.setProperty(ctx, ClientconfigConstants.Attributes.CustomFields.PASSWORDCONFIGCUSTFIELDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomFields.passwordConfigCustFields</code> attribute. 
	 * @param value the passwordConfigCustFields
	 */
	public void setPasswordConfigCustFields(final EnumerationValue item, final PasswordConfig value)
	{
		setPasswordConfigCustFields( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productInformation</code> attribute.
	 * @return the productInformation
	 */
	public ProductInformation getProductInformation(final SessionContext ctx, final Product item)
	{
		return (ProductInformation)item.getProperty( ctx, ClientconfigConstants.Attributes.Product.PRODUCTINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productInformation</code> attribute.
	 * @return the productInformation
	 */
	public ProductInformation getProductInformation(final Product item)
	{
		return getProductInformation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productInformation</code> attribute. 
	 * @param value the productInformation
	 */
	public void setProductInformation(final SessionContext ctx, final Product item, final ProductInformation value)
	{
		item.setProperty(ctx, ClientconfigConstants.Attributes.Product.PRODUCTINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productInformation</code> attribute. 
	 * @param value the productInformation
	 */
	public void setProductInformation(final Product item, final ProductInformation value)
	{
		setProductInformation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig(final SessionContext ctx, final Supplier item)
	{
		return (TimeLimitMasterConfig)item.getProperty( ctx, ClientconfigConstants.Attributes.Supplier.TIMELIMITMASTERCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig(final Supplier item)
	{
		return getTimeLimitMasterConfig( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig
	 */
	public void setTimeLimitMasterConfig(final SessionContext ctx, final Supplier item, final TimeLimitMasterConfig value)
	{
		item.setProperty(ctx, ClientconfigConstants.Attributes.Supplier.TIMELIMITMASTERCONFIG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig
	 */
	public void setTimeLimitMasterConfig(final Supplier item, final TimeLimitMasterConfig value)
	{
		setTimeLimitMasterConfig( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DistributionChannel.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig(final SessionContext ctx, final DistributionChannel item)
	{
		return (TimeLimitMasterConfig)item.getProperty( ctx, ClientconfigConstants.Attributes.DistributionChannel.TIMELIMITMASTERCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DistributionChannel.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig(final DistributionChannel item)
	{
		return getTimeLimitMasterConfig( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DistributionChannel.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig
	 */
	public void setTimeLimitMasterConfig(final SessionContext ctx, final DistributionChannel item, final TimeLimitMasterConfig value)
	{
		item.setProperty(ctx, ClientconfigConstants.Attributes.DistributionChannel.TIMELIMITMASTERCONFIG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DistributionChannel.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig
	 */
	public void setTimeLimitMasterConfig(final DistributionChannel item, final TimeLimitMasterConfig value)
	{
		setTimeLimitMasterConfig( getSession().getSessionContext(), item, value );
	}
	
}
