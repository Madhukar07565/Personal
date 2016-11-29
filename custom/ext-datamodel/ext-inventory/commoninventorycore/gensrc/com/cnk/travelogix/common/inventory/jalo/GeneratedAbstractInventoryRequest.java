/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.AbstractInventoryDefinition;
import com.cnk.travelogix.common.inventory.jalo.CompanyInventoryRestriction;
import com.cnk.travelogix.common.inventory.jalo.InitialInvReqSupplierDetail;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.version.jalo.VersionDetail;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.jalo.AbstractInventoryRequest AbstractInventoryRequest}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractInventoryRequest extends AbstractTravelogixItem
{
	/** Qualifier of the <code>AbstractInventoryRequest.visibleToSupplier</code> attribute **/
	public static final String VISIBLETOSUPPLIER = "visibleToSupplier";
	/** Qualifier of the <code>AbstractInventoryRequest.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>AbstractInventoryRequest.createdBy</code> attribute **/
	public static final String CREATEDBY = "createdBy";
	/** Qualifier of the <code>AbstractInventoryRequest.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>AbstractInventoryRequest.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>AbstractInventoryRequest.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/** Qualifier of the <code>AbstractInventoryRequest.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>AbstractInventoryRequest.supplierDetails</code> attribute **/
	public static final String SUPPLIERDETAILS = "supplierDetails";
	/** Qualifier of the <code>AbstractInventoryRequest.versionDetails</code> attribute **/
	public static final String VERSIONDETAILS = "versionDetails";
	/** Qualifier of the <code>AbstractInventoryRequest.companies</code> attribute **/
	public static final String COMPANIES = "companies";
	/** Qualifier of the <code>AbstractInventoryRequest.definitions</code> attribute **/
	public static final String DEFINITIONS = "definitions";
	/**
	* {@link OneToManyHandler} for handling 1:n VERSIONDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<VersionDetail> VERSIONDETAILSHANDLER = new OneToManyHandler<VersionDetail>(
	MasterdatacoreConstants.TC.VERSIONDETAIL,
	false,
	"inventoryRequest",
	"inventoryRequestPOS",
	true,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n COMPANIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CompanyInventoryRestriction> COMPANIESHANDLER = new OneToManyHandler<CompanyInventoryRestriction>(
	CommoninventorycoreConstants.TC.COMPANYINVENTORYRESTRICTION,
	false,
	"companiesInventoryRequest",
	"companiesInventoryRequestPOS",
	true,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DEFINITIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractInventoryDefinition> DEFINITIONSHANDLER = new OneToManyHandler<AbstractInventoryDefinition>(
	CommoninventorycoreConstants.TC.ABSTRACTINVENTORYDEFINITION,
	false,
	"inventoryRequest",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VISIBLETOSUPPLIER, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(CREATEDBY, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(MEDIAS, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(SUPPLIERDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.companies</code> attribute.
	 * @return the companies
	 */
	public Collection<CompanyInventoryRestriction> getCompanies(final SessionContext ctx)
	{
		return COMPANIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.companies</code> attribute.
	 * @return the companies
	 */
	public Collection<CompanyInventoryRestriction> getCompanies()
	{
		return getCompanies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.companies</code> attribute. 
	 * @param value the companies
	 */
	public void setCompanies(final SessionContext ctx, final Collection<CompanyInventoryRestriction> value)
	{
		COMPANIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.companies</code> attribute. 
	 * @param value the companies
	 */
	public void setCompanies(final Collection<CompanyInventoryRestriction> value)
	{
		setCompanies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companies. 
	 * @param value the item to add to companies
	 */
	public void addToCompanies(final SessionContext ctx, final CompanyInventoryRestriction value)
	{
		COMPANIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companies. 
	 * @param value the item to add to companies
	 */
	public void addToCompanies(final CompanyInventoryRestriction value)
	{
		addToCompanies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companies. 
	 * @param value the item to remove from companies
	 */
	public void removeFromCompanies(final SessionContext ctx, final CompanyInventoryRestriction value)
	{
		COMPANIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companies. 
	 * @param value the item to remove from companies
	 */
	public void removeFromCompanies(final CompanyInventoryRestriction value)
	{
		removeFromCompanies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.country</code> attribute.
	 * @return the country - Country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.country</code> attribute.
	 * @return the country - Country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.createdBy</code> attribute.
	 * @return the createdBy - Created By
	 */
	public Employee getCreatedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, CREATEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.createdBy</code> attribute.
	 * @return the createdBy - Created By
	 */
	public Employee getCreatedBy()
	{
		return getCreatedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.createdBy</code> attribute. 
	 * @param value the createdBy - Created By
	 */
	public void setCreatedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, CREATEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.createdBy</code> attribute. 
	 * @param value the createdBy - Created By
	 */
	public void setCreatedBy(final Employee value)
	{
		setCreatedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.definitions</code> attribute.
	 * @return the definitions
	 */
	public Collection<AbstractInventoryDefinition> getDefinitions(final SessionContext ctx)
	{
		return DEFINITIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.definitions</code> attribute.
	 * @return the definitions
	 */
	public Collection<AbstractInventoryDefinition> getDefinitions()
	{
		return getDefinitions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.definitions</code> attribute. 
	 * @param value the definitions
	 */
	public void setDefinitions(final SessionContext ctx, final Collection<AbstractInventoryDefinition> value)
	{
		DEFINITIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.definitions</code> attribute. 
	 * @param value the definitions
	 */
	public void setDefinitions(final Collection<AbstractInventoryDefinition> value)
	{
		setDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to definitions. 
	 * @param value the item to add to definitions
	 */
	public void addToDefinitions(final SessionContext ctx, final AbstractInventoryDefinition value)
	{
		DEFINITIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to definitions. 
	 * @param value the item to add to definitions
	 */
	public void addToDefinitions(final AbstractInventoryDefinition value)
	{
		addToDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from definitions. 
	 * @param value the item to remove from definitions
	 */
	public void removeFromDefinitions(final SessionContext ctx, final AbstractInventoryDefinition value)
	{
		DEFINITIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from definitions. 
	 * @param value the item to remove from definitions
	 */
	public void removeFromDefinitions(final AbstractInventoryDefinition value)
	{
		removeFromDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.medias</code> attribute.
	 * @return the medias - Medias
	 */
	public Collection<Media> getMedias(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, MEDIAS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.medias</code> attribute.
	 * @return the medias - Medias
	 */
	public Collection<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.medias</code> attribute. 
	 * @param value the medias - Medias
	 */
	public void setMedias(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, MEDIAS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.medias</code> attribute. 
	 * @param value the medias - Medias
	 */
	public void setMedias(final Collection<Media> value)
	{
		setMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.productCategorySubType</code> attribute.
	 * @return the productCategorySubType - Product Category Sub Type
	 */
	public Category getProductCategorySubType(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.productCategorySubType</code> attribute.
	 * @return the productCategorySubType - Product Category Sub Type
	 */
	public Category getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType - Product Category Sub Type
	 */
	public void setProductCategorySubType(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType - Product Category Sub Type
	 */
	public void setProductCategorySubType(final Category value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.status</code> attribute.
	 * @return the status - Status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.status</code> attribute.
	 * @return the status - Status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.status</code> attribute. 
	 * @param value the status - Status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.status</code> attribute. 
	 * @param value the status - Status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.supplierDetails</code> attribute.
	 * @return the supplierDetails - Supplier Detail
	 */
	public InitialInvReqSupplierDetail getSupplierDetails(final SessionContext ctx)
	{
		return (InitialInvReqSupplierDetail)getProperty( ctx, SUPPLIERDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.supplierDetails</code> attribute.
	 * @return the supplierDetails - Supplier Detail
	 */
	public InitialInvReqSupplierDetail getSupplierDetails()
	{
		return getSupplierDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.supplierDetails</code> attribute. 
	 * @param value the supplierDetails - Supplier Detail
	 */
	public void setSupplierDetails(final SessionContext ctx, final InitialInvReqSupplierDetail value)
	{
		setProperty(ctx, SUPPLIERDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.supplierDetails</code> attribute. 
	 * @param value the supplierDetails - Supplier Detail
	 */
	public void setSupplierDetails(final InitialInvReqSupplierDetail value)
	{
		setSupplierDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.versionDetails</code> attribute.
	 * @return the versionDetails
	 */
	public Collection<VersionDetail> getVersionDetails(final SessionContext ctx)
	{
		return VERSIONDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.versionDetails</code> attribute.
	 * @return the versionDetails
	 */
	public Collection<VersionDetail> getVersionDetails()
	{
		return getVersionDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.versionDetails</code> attribute. 
	 * @param value the versionDetails
	 */
	public void setVersionDetails(final SessionContext ctx, final Collection<VersionDetail> value)
	{
		VERSIONDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.versionDetails</code> attribute. 
	 * @param value the versionDetails
	 */
	public void setVersionDetails(final Collection<VersionDetail> value)
	{
		setVersionDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to versionDetails. 
	 * @param value the item to add to versionDetails
	 */
	public void addToVersionDetails(final SessionContext ctx, final VersionDetail value)
	{
		VERSIONDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to versionDetails. 
	 * @param value the item to add to versionDetails
	 */
	public void addToVersionDetails(final VersionDetail value)
	{
		addToVersionDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from versionDetails. 
	 * @param value the item to remove from versionDetails
	 */
	public void removeFromVersionDetails(final SessionContext ctx, final VersionDetail value)
	{
		VERSIONDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from versionDetails. 
	 * @param value the item to remove from versionDetails
	 */
	public void removeFromVersionDetails(final VersionDetail value)
	{
		removeFromVersionDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.visibleToSupplier</code> attribute.
	 * @return the visibleToSupplier - Visible To Supplier
	 */
	public Boolean isVisibleToSupplier(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, VISIBLETOSUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.visibleToSupplier</code> attribute.
	 * @return the visibleToSupplier - Visible To Supplier
	 */
	public Boolean isVisibleToSupplier()
	{
		return isVisibleToSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.visibleToSupplier</code> attribute. 
	 * @return the visibleToSupplier - Visible To Supplier
	 */
	public boolean isVisibleToSupplierAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isVisibleToSupplier( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractInventoryRequest.visibleToSupplier</code> attribute. 
	 * @return the visibleToSupplier - Visible To Supplier
	 */
	public boolean isVisibleToSupplierAsPrimitive()
	{
		return isVisibleToSupplierAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.visibleToSupplier</code> attribute. 
	 * @param value the visibleToSupplier - Visible To Supplier
	 */
	public void setVisibleToSupplier(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, VISIBLETOSUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.visibleToSupplier</code> attribute. 
	 * @param value the visibleToSupplier - Visible To Supplier
	 */
	public void setVisibleToSupplier(final Boolean value)
	{
		setVisibleToSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.visibleToSupplier</code> attribute. 
	 * @param value the visibleToSupplier - Visible To Supplier
	 */
	public void setVisibleToSupplier(final SessionContext ctx, final boolean value)
	{
		setVisibleToSupplier( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractInventoryRequest.visibleToSupplier</code> attribute. 
	 * @param value the visibleToSupplier - Visible To Supplier
	 */
	public void setVisibleToSupplier(final boolean value)
	{
		setVisibleToSupplier( getSession().getSessionContext(), value );
	}
	
}
