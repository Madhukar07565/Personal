/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.core.supplier.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.supplier.core.constants.SuppliercoreConstants;
import com.cnk.travelogix.supplier.core.contact.jalo.SupplierEmergencyContact;
import com.cnk.travelogix.supplier.core.market.jalo.SupplierMarket;
import com.cnk.travelogix.supplier.core.supplier.jalo.ProductCategoryInfo;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.core.supplier.jalo.SupplierBrand;
import com.cnk.travelogix.supplier.masters.core.constants.SuppliermasterscoreConstants;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.cronjob.jalo.Trigger;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.core.supplier.jalo.Supplier Supplier}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplier extends AbstractTravelogixItem
{
	/** Qualifier of the <code>Supplier.commonUid</code> attribute **/
	public static final String COMMONUID = "commonUid";
	/** Qualifier of the <code>Supplier.companySupplierId</code> attribute **/
	public static final String COMPANYSUPPLIERID = "companySupplierId";
	/** Qualifier of the <code>Supplier.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Supplier.shortName</code> attribute **/
	public static final String SHORTNAME = "shortName";
	/** Qualifier of the <code>Supplier.financeControlId</code> attribute **/
	public static final String FINANCECONTROLID = "financeControlId";
	/** Qualifier of the <code>Supplier.supplierType</code> attribute **/
	public static final String SUPPLIERTYPE = "supplierType";
	/** Qualifier of the <code>Supplier.parentCompany</code> attribute **/
	public static final String PARENTCOMPANY = "parentCompany";
	/** Qualifier of the <code>Supplier.brands</code> attribute **/
	public static final String BRANDS = "brands";
	/** Qualifier of the <code>Supplier.copiedFrom</code> attribute **/
	public static final String COPIEDFROM = "copiedFrom";
	/** Qualifier of the <code>Supplier.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>Supplier.typeOfOrganization</code> attribute **/
	public static final String TYPEOFORGANIZATION = "typeOfOrganization";
	/** Qualifier of the <code>Supplier.lstNo</code> attribute **/
	public static final String LSTNO = "lstNo";
	/** Qualifier of the <code>Supplier.cstNo</code> attribute **/
	public static final String CSTNO = "cstNo";
	/** Qualifier of the <code>Supplier.exciseRegNo</code> attribute **/
	public static final String EXCISEREGNO = "exciseRegNo";
	/** Qualifier of the <code>Supplier.vatOrTinNo</code> attribute **/
	public static final String VATORTINNO = "vatOrTinNo";
	/** Qualifier of the <code>Supplier.panNo</code> attribute **/
	public static final String PANNO = "panNo";
	/** Qualifier of the <code>Supplier.stRegNo</code> attribute **/
	public static final String STREGNO = "stRegNo";
	/** Qualifier of the <code>Supplier.tanNo</code> attribute **/
	public static final String TANNO = "tanNo";
	/** Qualifier of the <code>Supplier.declarationReceived</code> attribute **/
	public static final String DECLARATIONRECEIVED = "declarationReceived";
	/** Qualifier of the <code>Supplier.supplierUpdatesTrigger</code> attribute **/
	public static final String SUPPLIERUPDATESTRIGGER = "supplierUpdatesTrigger";
	/** Qualifier of the <code>Supplier.apiSupplier</code> attribute **/
	public static final String APISUPPLIER = "apiSupplier";
	/** Qualifier of the <code>Supplier.extranetAccess</code> attribute **/
	public static final String EXTRANETACCESS = "extranetAccess";
	/** Qualifier of the <code>Supplier.onlineFrom</code> attribute **/
	public static final String ONLINEFROM = "onlineFrom";
	/** Qualifier of the <code>Supplier.onlineTo</code> attribute **/
	public static final String ONLINETO = "onlineTo";
	/** Qualifier of the <code>Supplier.transactionalReportingTrigger</code> attribute **/
	public static final String TRANSACTIONALREPORTINGTRIGGER = "transactionalReportingTrigger";
	/** Qualifier of the <code>Supplier.workFlowStatus</code> attribute **/
	public static final String WORKFLOWSTATUS = "workFlowStatus";
	/** Qualifier of the <code>Supplier.isDefaultSupplier</code> attribute **/
	public static final String ISDEFAULTSUPPLIER = "isDefaultSupplier";
	/** Qualifier of the <code>Supplier.isTransactionRequired</code> attribute **/
	public static final String ISTRANSACTIONREQUIRED = "isTransactionRequired";
	/** Qualifier of the <code>Supplier.frequencies</code> attribute **/
	public static final String FREQUENCIES = "frequencies";
	/** Qualifier of the <code>Supplier.isNew</code> attribute **/
	public static final String ISNEW = "isNew";
	/** Qualifier of the <code>Supplier.subscriberAccountRef</code> attribute **/
	public static final String SUBSCRIBERACCOUNTREF = "subscriberAccountRef";
	/** Qualifier of the <code>Supplier.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	/** Qualifier of the <code>Supplier.supplierMarkets</code> attribute **/
	public static final String SUPPLIERMARKETS = "supplierMarkets";
	/** Relation ordering override parameter constants for Supplier2SupplierMarketRelation from ((suppliercore))*/
	protected static String SUPPLIER2SUPPLIERMARKETRELATION_SRC_ORDERED = "relation.Supplier2SupplierMarketRelation.source.ordered";
	protected static String SUPPLIER2SUPPLIERMARKETRELATION_TGT_ORDERED = "relation.Supplier2SupplierMarketRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Supplier2SupplierMarketRelation from ((suppliercore))*/
	protected static String SUPPLIER2SUPPLIERMARKETRELATION_MARKMODIFIED = "relation.Supplier2SupplierMarketRelation.markmodified";
	/** Qualifier of the <code>Supplier.emergencyContacts</code> attribute **/
	public static final String EMERGENCYCONTACTS = "emergencyContacts";
	/** Qualifier of the <code>Supplier.defaultSupplierFor</code> attribute **/
	public static final String DEFAULTSUPPLIERFOR = "defaultSupplierFor";
	/** Relation ordering override parameter constants for Supplier2ProductCategorySubType from ((suppliercore))*/
	protected static String SUPPLIER2PRODUCTCATEGORYSUBTYPE_SRC_ORDERED = "relation.Supplier2ProductCategorySubType.source.ordered";
	protected static String SUPPLIER2PRODUCTCATEGORYSUBTYPE_TGT_ORDERED = "relation.Supplier2ProductCategorySubType.target.ordered";
	/** Relation disable markmodifed parameter constants for Supplier2ProductCategorySubType from ((suppliercore))*/
	protected static String SUPPLIER2PRODUCTCATEGORYSUBTYPE_MARKMODIFIED = "relation.Supplier2ProductCategorySubType.markmodified";
	/** Qualifier of the <code>Supplier.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/** Qualifier of the <code>Supplier.enablerCategories</code> attribute **/
	public static final String ENABLERCATEGORIES = "enablerCategories";
	/** Relation ordering override parameter constants for Supplier2SupplierEnablerCategory from ((suppliercore))*/
	protected static String SUPPLIER2SUPPLIERENABLERCATEGORY_SRC_ORDERED = "relation.Supplier2SupplierEnablerCategory.source.ordered";
	protected static String SUPPLIER2SUPPLIERENABLERCATEGORY_TGT_ORDERED = "relation.Supplier2SupplierEnablerCategory.target.ordered";
	/** Relation disable markmodifed parameter constants for Supplier2SupplierEnablerCategory from ((suppliercore))*/
	protected static String SUPPLIER2SUPPLIERENABLERCATEGORY_MARKMODIFIED = "relation.Supplier2SupplierEnablerCategory.markmodified";
	/** Qualifier of the <code>Supplier.lobs</code> attribute **/
	public static final String LOBS = "lobs";
	/** Relation ordering override parameter constants for Supplier2SupliersLOB from ((suppliercore))*/
	protected static String SUPPLIER2SUPLIERSLOB_SRC_ORDERED = "relation.Supplier2SupliersLOB.source.ordered";
	protected static String SUPPLIER2SUPLIERSLOB_TGT_ORDERED = "relation.Supplier2SupliersLOB.target.ordered";
	/** Relation disable markmodifed parameter constants for Supplier2SupliersLOB from ((suppliercore))*/
	protected static String SUPPLIER2SUPLIERSLOB_MARKMODIFIED = "relation.Supplier2SupliersLOB.markmodified";
	/** Qualifier of the <code>Supplier.supplierBrands</code> attribute **/
	public static final String SUPPLIERBRANDS = "supplierBrands";
	/** Relation ordering override parameter constants for SupplierToSuppplierBrands from ((suppliercore))*/
	protected static String SUPPLIERTOSUPPPLIERBRANDS_SRC_ORDERED = "relation.SupplierToSuppplierBrands.source.ordered";
	protected static String SUPPLIERTOSUPPPLIERBRANDS_TGT_ORDERED = "relation.SupplierToSuppplierBrands.target.ordered";
	/** Relation disable markmodifed parameter constants for SupplierToSuppplierBrands from ((suppliercore))*/
	protected static String SUPPLIERTOSUPPPLIERBRANDS_MARKMODIFIED = "relation.SupplierToSuppplierBrands.markmodified";
	/** Qualifier of the <code>Supplier.productCategoryInfo</code> attribute **/
	public static final String PRODUCTCATEGORYINFO = "productCategoryInfo";
	/** Relation ordering override parameter constants for Supplier2ProductCategoryInfo from ((suppliercore))*/
	protected static String SUPPLIER2PRODUCTCATEGORYINFO_SRC_ORDERED = "relation.Supplier2ProductCategoryInfo.source.ordered";
	protected static String SUPPLIER2PRODUCTCATEGORYINFO_TGT_ORDERED = "relation.Supplier2ProductCategoryInfo.target.ordered";
	/** Relation disable markmodifed parameter constants for Supplier2ProductCategoryInfo from ((suppliercore))*/
	protected static String SUPPLIER2PRODUCTCATEGORYINFO_MARKMODIFIED = "relation.Supplier2ProductCategoryInfo.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n EMERGENCYCONTACTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierEmergencyContact> EMERGENCYCONTACTSHANDLER = new OneToManyHandler<SupplierEmergencyContact>(
	SuppliermasterscoreConstants.TC.SUPPLIEREMERGENCYCONTACT,
	true,
	"supplier",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MEDIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> MEDIASHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	true,
	"supplier",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMMONUID, AttributeMode.INITIAL);
		tmp.put(COMPANYSUPPLIERID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SHORTNAME, AttributeMode.INITIAL);
		tmp.put(FINANCECONTROLID, AttributeMode.INITIAL);
		tmp.put(SUPPLIERTYPE, AttributeMode.INITIAL);
		tmp.put(PARENTCOMPANY, AttributeMode.INITIAL);
		tmp.put(BRANDS, AttributeMode.INITIAL);
		tmp.put(COPIEDFROM, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(TYPEOFORGANIZATION, AttributeMode.INITIAL);
		tmp.put(LSTNO, AttributeMode.INITIAL);
		tmp.put(CSTNO, AttributeMode.INITIAL);
		tmp.put(EXCISEREGNO, AttributeMode.INITIAL);
		tmp.put(VATORTINNO, AttributeMode.INITIAL);
		tmp.put(PANNO, AttributeMode.INITIAL);
		tmp.put(STREGNO, AttributeMode.INITIAL);
		tmp.put(TANNO, AttributeMode.INITIAL);
		tmp.put(DECLARATIONRECEIVED, AttributeMode.INITIAL);
		tmp.put(SUPPLIERUPDATESTRIGGER, AttributeMode.INITIAL);
		tmp.put(APISUPPLIER, AttributeMode.INITIAL);
		tmp.put(EXTRANETACCESS, AttributeMode.INITIAL);
		tmp.put(ONLINEFROM, AttributeMode.INITIAL);
		tmp.put(ONLINETO, AttributeMode.INITIAL);
		tmp.put(TRANSACTIONALREPORTINGTRIGGER, AttributeMode.INITIAL);
		tmp.put(WORKFLOWSTATUS, AttributeMode.INITIAL);
		tmp.put(ISDEFAULTSUPPLIER, AttributeMode.INITIAL);
		tmp.put(ISTRANSACTIONREQUIRED, AttributeMode.INITIAL);
		tmp.put(FREQUENCIES, AttributeMode.INITIAL);
		tmp.put(ISNEW, AttributeMode.INITIAL);
		tmp.put(SUBSCRIBERACCOUNTREF, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		new PartOfHandler<Address>()
		{
			@Override
			protected Address doGetValue(final SessionContext ctx)
			{
				return getAddress( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Address _value)
			{
				final Address value = _value;
				setProperty(ctx, ADDRESS,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.apiSupplier</code> attribute.
	 * @return the apiSupplier
	 */
	public Boolean isApiSupplier(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, APISUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.apiSupplier</code> attribute.
	 * @return the apiSupplier
	 */
	public Boolean isApiSupplier()
	{
		return isApiSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.apiSupplier</code> attribute. 
	 * @return the apiSupplier
	 */
	public boolean isApiSupplierAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isApiSupplier( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.apiSupplier</code> attribute. 
	 * @return the apiSupplier
	 */
	public boolean isApiSupplierAsPrimitive()
	{
		return isApiSupplierAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.apiSupplier</code> attribute. 
	 * @param value the apiSupplier
	 */
	public void setApiSupplier(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, APISUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.apiSupplier</code> attribute. 
	 * @param value the apiSupplier
	 */
	public void setApiSupplier(final Boolean value)
	{
		setApiSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.apiSupplier</code> attribute. 
	 * @param value the apiSupplier
	 */
	public void setApiSupplier(final SessionContext ctx, final boolean value)
	{
		setApiSupplier( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.apiSupplier</code> attribute. 
	 * @param value the apiSupplier
	 */
	public void setApiSupplier(final boolean value)
	{
		setApiSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.brands</code> attribute.
	 * @return the brands
	 */
	public SupplierBrand getBrands(final SessionContext ctx)
	{
		return (SupplierBrand)getProperty( ctx, BRANDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.brands</code> attribute.
	 * @return the brands
	 */
	public SupplierBrand getBrands()
	{
		return getBrands( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.brands</code> attribute. 
	 * @param value the brands
	 */
	public void setBrands(final SessionContext ctx, final SupplierBrand value)
	{
		setProperty(ctx, BRANDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.brands</code> attribute. 
	 * @param value the brands
	 */
	public void setBrands(final SupplierBrand value)
	{
		setBrands( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.commonUid</code> attribute.
	 * @return the commonUid
	 */
	public String getCommonUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMMONUID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.commonUid</code> attribute.
	 * @return the commonUid
	 */
	public String getCommonUid()
	{
		return getCommonUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.commonUid</code> attribute. 
	 * @param value the commonUid
	 */
	public void setCommonUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMMONUID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.commonUid</code> attribute. 
	 * @param value the commonUid
	 */
	public void setCommonUid(final String value)
	{
		setCommonUid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.companySupplierId</code> attribute.
	 * @return the companySupplierId
	 */
	public String getCompanySupplierId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANYSUPPLIERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.companySupplierId</code> attribute.
	 * @return the companySupplierId
	 */
	public String getCompanySupplierId()
	{
		return getCompanySupplierId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.companySupplierId</code> attribute. 
	 * @param value the companySupplierId
	 */
	public void setCompanySupplierId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANYSUPPLIERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.companySupplierId</code> attribute. 
	 * @param value the companySupplierId
	 */
	public void setCompanySupplierId(final String value)
	{
		setCompanySupplierId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.copiedFrom</code> attribute.
	 * @return the copiedFrom
	 */
	public String getCopiedFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPIEDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.copiedFrom</code> attribute.
	 * @return the copiedFrom
	 */
	public String getCopiedFrom()
	{
		return getCopiedFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.copiedFrom</code> attribute. 
	 * @param value the copiedFrom
	 */
	public void setCopiedFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPIEDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.copiedFrom</code> attribute. 
	 * @param value the copiedFrom
	 */
	public void setCopiedFrom(final String value)
	{
		setCopiedFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.cstNo</code> attribute.
	 * @return the cstNo
	 */
	public String getCstNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CSTNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.cstNo</code> attribute.
	 * @return the cstNo
	 */
	public String getCstNo()
	{
		return getCstNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.cstNo</code> attribute. 
	 * @param value the cstNo
	 */
	public void setCstNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CSTNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.cstNo</code> attribute. 
	 * @param value the cstNo
	 */
	public void setCstNo(final String value)
	{
		setCstNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.declarationReceived</code> attribute.
	 * @return the declarationReceived
	 */
	public Boolean isDeclarationReceived(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DECLARATIONRECEIVED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.declarationReceived</code> attribute.
	 * @return the declarationReceived
	 */
	public Boolean isDeclarationReceived()
	{
		return isDeclarationReceived( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.declarationReceived</code> attribute. 
	 * @return the declarationReceived
	 */
	public boolean isDeclarationReceivedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDeclarationReceived( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.declarationReceived</code> attribute. 
	 * @return the declarationReceived
	 */
	public boolean isDeclarationReceivedAsPrimitive()
	{
		return isDeclarationReceivedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.declarationReceived</code> attribute. 
	 * @param value the declarationReceived
	 */
	public void setDeclarationReceived(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DECLARATIONRECEIVED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.declarationReceived</code> attribute. 
	 * @param value the declarationReceived
	 */
	public void setDeclarationReceived(final Boolean value)
	{
		setDeclarationReceived( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.declarationReceived</code> attribute. 
	 * @param value the declarationReceived
	 */
	public void setDeclarationReceived(final SessionContext ctx, final boolean value)
	{
		setDeclarationReceived( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.declarationReceived</code> attribute. 
	 * @param value the declarationReceived
	 */
	public void setDeclarationReceived(final boolean value)
	{
		setDeclarationReceived( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.defaultSupplierFor</code> attribute.
	 * @return the defaultSupplierFor
	 */
	public Set<ProductCategorySubType> getDefaultSupplierFor(final SessionContext ctx)
	{
		final List<ProductCategorySubType> items = getLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYSUBTYPE,
			"ProductCategorySubType",
			null,
			false,
			false
		);
		return new LinkedHashSet<ProductCategorySubType>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.defaultSupplierFor</code> attribute.
	 * @return the defaultSupplierFor
	 */
	public Set<ProductCategorySubType> getDefaultSupplierFor()
	{
		return getDefaultSupplierFor( getSession().getSessionContext() );
	}
	
	public long getDefaultSupplierForCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYSUBTYPE,
			"ProductCategorySubType",
			null
		);
	}
	
	public long getDefaultSupplierForCount()
	{
		return getDefaultSupplierForCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.defaultSupplierFor</code> attribute. 
	 * @param value the defaultSupplierFor
	 */
	public void setDefaultSupplierFor(final SessionContext ctx, final Set<ProductCategorySubType> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYSUBTYPE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2PRODUCTCATEGORYSUBTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.defaultSupplierFor</code> attribute. 
	 * @param value the defaultSupplierFor
	 */
	public void setDefaultSupplierFor(final Set<ProductCategorySubType> value)
	{
		setDefaultSupplierFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to defaultSupplierFor. 
	 * @param value the item to add to defaultSupplierFor
	 */
	public void addToDefaultSupplierFor(final SessionContext ctx, final ProductCategorySubType value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYSUBTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2PRODUCTCATEGORYSUBTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to defaultSupplierFor. 
	 * @param value the item to add to defaultSupplierFor
	 */
	public void addToDefaultSupplierFor(final ProductCategorySubType value)
	{
		addToDefaultSupplierFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from defaultSupplierFor. 
	 * @param value the item to remove from defaultSupplierFor
	 */
	public void removeFromDefaultSupplierFor(final SessionContext ctx, final ProductCategorySubType value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYSUBTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2PRODUCTCATEGORYSUBTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from defaultSupplierFor. 
	 * @param value the item to remove from defaultSupplierFor
	 */
	public void removeFromDefaultSupplierFor(final ProductCategorySubType value)
	{
		removeFromDefaultSupplierFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.emergencyContacts</code> attribute.
	 * @return the emergencyContacts
	 */
	public Set<SupplierEmergencyContact> getEmergencyContacts(final SessionContext ctx)
	{
		return (Set<SupplierEmergencyContact>)EMERGENCYCONTACTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.emergencyContacts</code> attribute.
	 * @return the emergencyContacts
	 */
	public Set<SupplierEmergencyContact> getEmergencyContacts()
	{
		return getEmergencyContacts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.emergencyContacts</code> attribute. 
	 * @param value the emergencyContacts
	 */
	public void setEmergencyContacts(final SessionContext ctx, final Set<SupplierEmergencyContact> value)
	{
		EMERGENCYCONTACTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.emergencyContacts</code> attribute. 
	 * @param value the emergencyContacts
	 */
	public void setEmergencyContacts(final Set<SupplierEmergencyContact> value)
	{
		setEmergencyContacts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to emergencyContacts. 
	 * @param value the item to add to emergencyContacts
	 */
	public void addToEmergencyContacts(final SessionContext ctx, final SupplierEmergencyContact value)
	{
		EMERGENCYCONTACTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to emergencyContacts. 
	 * @param value the item to add to emergencyContacts
	 */
	public void addToEmergencyContacts(final SupplierEmergencyContact value)
	{
		addToEmergencyContacts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from emergencyContacts. 
	 * @param value the item to remove from emergencyContacts
	 */
	public void removeFromEmergencyContacts(final SessionContext ctx, final SupplierEmergencyContact value)
	{
		EMERGENCYCONTACTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from emergencyContacts. 
	 * @param value the item to remove from emergencyContacts
	 */
	public void removeFromEmergencyContacts(final SupplierEmergencyContact value)
	{
		removeFromEmergencyContacts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.enablerCategories</code> attribute.
	 * @return the enablerCategories
	 */
	public Set<EnumerationValue> getEnablerCategories(final SessionContext ctx)
	{
		final List<EnumerationValue> items = getLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERENABLERCATEGORY,
			"SupplierEnablerCategory",
			null,
			false,
			false
		);
		return new LinkedHashSet<EnumerationValue>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.enablerCategories</code> attribute.
	 * @return the enablerCategories
	 */
	public Set<EnumerationValue> getEnablerCategories()
	{
		return getEnablerCategories( getSession().getSessionContext() );
	}
	
	public long getEnablerCategoriesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERENABLERCATEGORY,
			"SupplierEnablerCategory",
			null
		);
	}
	
	public long getEnablerCategoriesCount()
	{
		return getEnablerCategoriesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.enablerCategories</code> attribute. 
	 * @param value the enablerCategories
	 */
	public void setEnablerCategories(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERENABLERCATEGORY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPPLIERENABLERCATEGORY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.enablerCategories</code> attribute. 
	 * @param value the enablerCategories
	 */
	public void setEnablerCategories(final Set<EnumerationValue> value)
	{
		setEnablerCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to enablerCategories. 
	 * @param value the item to add to enablerCategories
	 */
	public void addToEnablerCategories(final SessionContext ctx, final EnumerationValue value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERENABLERCATEGORY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPPLIERENABLERCATEGORY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to enablerCategories. 
	 * @param value the item to add to enablerCategories
	 */
	public void addToEnablerCategories(final EnumerationValue value)
	{
		addToEnablerCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from enablerCategories. 
	 * @param value the item to remove from enablerCategories
	 */
	public void removeFromEnablerCategories(final SessionContext ctx, final EnumerationValue value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERENABLERCATEGORY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPPLIERENABLERCATEGORY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from enablerCategories. 
	 * @param value the item to remove from enablerCategories
	 */
	public void removeFromEnablerCategories(final EnumerationValue value)
	{
		removeFromEnablerCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.exciseRegNo</code> attribute.
	 * @return the exciseRegNo
	 */
	public String getExciseRegNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXCISEREGNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.exciseRegNo</code> attribute.
	 * @return the exciseRegNo
	 */
	public String getExciseRegNo()
	{
		return getExciseRegNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.exciseRegNo</code> attribute. 
	 * @param value the exciseRegNo
	 */
	public void setExciseRegNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXCISEREGNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.exciseRegNo</code> attribute. 
	 * @param value the exciseRegNo
	 */
	public void setExciseRegNo(final String value)
	{
		setExciseRegNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.extranetAccess</code> attribute.
	 * @return the extranetAccess
	 */
	public Boolean isExtranetAccess(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, EXTRANETACCESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.extranetAccess</code> attribute.
	 * @return the extranetAccess
	 */
	public Boolean isExtranetAccess()
	{
		return isExtranetAccess( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.extranetAccess</code> attribute. 
	 * @return the extranetAccess
	 */
	public boolean isExtranetAccessAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isExtranetAccess( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.extranetAccess</code> attribute. 
	 * @return the extranetAccess
	 */
	public boolean isExtranetAccessAsPrimitive()
	{
		return isExtranetAccessAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.extranetAccess</code> attribute. 
	 * @param value the extranetAccess
	 */
	public void setExtranetAccess(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, EXTRANETACCESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.extranetAccess</code> attribute. 
	 * @param value the extranetAccess
	 */
	public void setExtranetAccess(final Boolean value)
	{
		setExtranetAccess( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.extranetAccess</code> attribute. 
	 * @param value the extranetAccess
	 */
	public void setExtranetAccess(final SessionContext ctx, final boolean value)
	{
		setExtranetAccess( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.extranetAccess</code> attribute. 
	 * @param value the extranetAccess
	 */
	public void setExtranetAccess(final boolean value)
	{
		setExtranetAccess( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.financeControlId</code> attribute.
	 * @return the financeControlId
	 */
	public String getFinanceControlId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FINANCECONTROLID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.financeControlId</code> attribute.
	 * @return the financeControlId
	 */
	public String getFinanceControlId()
	{
		return getFinanceControlId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.financeControlId</code> attribute. 
	 * @param value the financeControlId
	 */
	public void setFinanceControlId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FINANCECONTROLID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.financeControlId</code> attribute. 
	 * @param value the financeControlId
	 */
	public void setFinanceControlId(final String value)
	{
		setFinanceControlId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.frequencies</code> attribute.
	 * @return the frequencies - Frequencies
	 */
	public Trigger getFrequencies(final SessionContext ctx)
	{
		return (Trigger)getProperty( ctx, FREQUENCIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.frequencies</code> attribute.
	 * @return the frequencies - Frequencies
	 */
	public Trigger getFrequencies()
	{
		return getFrequencies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.frequencies</code> attribute. 
	 * @param value the frequencies - Frequencies
	 */
	public void setFrequencies(final SessionContext ctx, final Trigger value)
	{
		new PartOfHandler<Trigger>()
		{
			@Override
			protected Trigger doGetValue(final SessionContext ctx)
			{
				return getFrequencies( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Trigger _value)
			{
				final Trigger value = _value;
				setProperty(ctx, FREQUENCIES,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.frequencies</code> attribute. 
	 * @param value the frequencies - Frequencies
	 */
	public void setFrequencies(final Trigger value)
	{
		setFrequencies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.isDefaultSupplier</code> attribute.
	 * @return the isDefaultSupplier - Is Default Supplier
	 */
	public Supplier getIsDefaultSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, ISDEFAULTSUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.isDefaultSupplier</code> attribute.
	 * @return the isDefaultSupplier - Is Default Supplier
	 */
	public Supplier getIsDefaultSupplier()
	{
		return getIsDefaultSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.isDefaultSupplier</code> attribute. 
	 * @param value the isDefaultSupplier - Is Default Supplier
	 */
	public void setIsDefaultSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, ISDEFAULTSUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.isDefaultSupplier</code> attribute. 
	 * @param value the isDefaultSupplier - Is Default Supplier
	 */
	public void setIsDefaultSupplier(final Supplier value)
	{
		setIsDefaultSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.isNew</code> attribute.
	 * @return the isNew
	 */
	public Boolean isIsNew(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISNEW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.isNew</code> attribute.
	 * @return the isNew
	 */
	public Boolean isIsNew()
	{
		return isIsNew( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.isNew</code> attribute. 
	 * @return the isNew
	 */
	public boolean isIsNewAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsNew( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.isNew</code> attribute. 
	 * @return the isNew
	 */
	public boolean isIsNewAsPrimitive()
	{
		return isIsNewAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISNEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final Boolean value)
	{
		setIsNew( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final SessionContext ctx, final boolean value)
	{
		setIsNew( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final boolean value)
	{
		setIsNew( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.isTransactionRequired</code> attribute.
	 * @return the isTransactionRequired - Is Transaction Required
	 */
	public Boolean isIsTransactionRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISTRANSACTIONREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.isTransactionRequired</code> attribute.
	 * @return the isTransactionRequired - Is Transaction Required
	 */
	public Boolean isIsTransactionRequired()
	{
		return isIsTransactionRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.isTransactionRequired</code> attribute. 
	 * @return the isTransactionRequired - Is Transaction Required
	 */
	public boolean isIsTransactionRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsTransactionRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.isTransactionRequired</code> attribute. 
	 * @return the isTransactionRequired - Is Transaction Required
	 */
	public boolean isIsTransactionRequiredAsPrimitive()
	{
		return isIsTransactionRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.isTransactionRequired</code> attribute. 
	 * @param value the isTransactionRequired - Is Transaction Required
	 */
	public void setIsTransactionRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISTRANSACTIONREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.isTransactionRequired</code> attribute. 
	 * @param value the isTransactionRequired - Is Transaction Required
	 */
	public void setIsTransactionRequired(final Boolean value)
	{
		setIsTransactionRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.isTransactionRequired</code> attribute. 
	 * @param value the isTransactionRequired - Is Transaction Required
	 */
	public void setIsTransactionRequired(final SessionContext ctx, final boolean value)
	{
		setIsTransactionRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.isTransactionRequired</code> attribute. 
	 * @param value the isTransactionRequired - Is Transaction Required
	 */
	public void setIsTransactionRequired(final boolean value)
	{
		setIsTransactionRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.lobs</code> attribute.
	 * @return the lobs
	 */
	public Set<EnumerationValue> getLobs(final SessionContext ctx)
	{
		final List<EnumerationValue> items = getLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPLIERSLOB,
			"SuppliersLOB",
			null,
			false,
			false
		);
		return new LinkedHashSet<EnumerationValue>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.lobs</code> attribute.
	 * @return the lobs
	 */
	public Set<EnumerationValue> getLobs()
	{
		return getLobs( getSession().getSessionContext() );
	}
	
	public long getLobsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPLIERSLOB,
			"SuppliersLOB",
			null
		);
	}
	
	public long getLobsCount()
	{
		return getLobsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.lobs</code> attribute. 
	 * @param value the lobs
	 */
	public void setLobs(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPLIERSLOB,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPLIERSLOB_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.lobs</code> attribute. 
	 * @param value the lobs
	 */
	public void setLobs(final Set<EnumerationValue> value)
	{
		setLobs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to lobs. 
	 * @param value the item to add to lobs
	 */
	public void addToLobs(final SessionContext ctx, final EnumerationValue value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPLIERSLOB,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPLIERSLOB_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to lobs. 
	 * @param value the item to add to lobs
	 */
	public void addToLobs(final EnumerationValue value)
	{
		addToLobs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from lobs. 
	 * @param value the item to remove from lobs
	 */
	public void removeFromLobs(final SessionContext ctx, final EnumerationValue value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPLIERSLOB,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPLIERSLOB_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from lobs. 
	 * @param value the item to remove from lobs
	 */
	public void removeFromLobs(final EnumerationValue value)
	{
		removeFromLobs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.lstNo</code> attribute.
	 * @return the lstNo
	 */
	public String getLstNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LSTNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.lstNo</code> attribute.
	 * @return the lstNo
	 */
	public String getLstNo()
	{
		return getLstNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.lstNo</code> attribute. 
	 * @param value the lstNo
	 */
	public void setLstNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LSTNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.lstNo</code> attribute. 
	 * @param value the lstNo
	 */
	public void setLstNo(final String value)
	{
		setLstNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.medias</code> attribute.
	 * @return the medias
	 */
	public Set<Media> getMedias(final SessionContext ctx)
	{
		return (Set<Media>)MEDIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.medias</code> attribute.
	 * @return the medias
	 */
	public Set<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final SessionContext ctx, final Set<Media> value)
	{
		MEDIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final Set<Media> value)
	{
		setMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medias. 
	 * @param value the item to add to medias
	 */
	public void addToMedias(final SessionContext ctx, final Media value)
	{
		MEDIASHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medias. 
	 * @param value the item to add to medias
	 */
	public void addToMedias(final Media value)
	{
		addToMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medias. 
	 * @param value the item to remove from medias
	 */
	public void removeFromMedias(final SessionContext ctx, final Media value)
	{
		MEDIASHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medias. 
	 * @param value the item to remove from medias
	 */
	public void removeFromMedias(final Media value)
	{
		removeFromMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.onlineFrom</code> attribute.
	 * @return the onlineFrom
	 */
	public Date getOnlineFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ONLINEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.onlineFrom</code> attribute.
	 * @return the onlineFrom
	 */
	public Date getOnlineFrom()
	{
		return getOnlineFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.onlineFrom</code> attribute. 
	 * @param value the onlineFrom
	 */
	public void setOnlineFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ONLINEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.onlineFrom</code> attribute. 
	 * @param value the onlineFrom
	 */
	public void setOnlineFrom(final Date value)
	{
		setOnlineFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.onlineTo</code> attribute.
	 * @return the onlineTo
	 */
	public Date getOnlineTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ONLINETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.onlineTo</code> attribute.
	 * @return the onlineTo
	 */
	public Date getOnlineTo()
	{
		return getOnlineTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.onlineTo</code> attribute. 
	 * @param value the onlineTo
	 */
	public void setOnlineTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ONLINETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.onlineTo</code> attribute. 
	 * @param value the onlineTo
	 */
	public void setOnlineTo(final Date value)
	{
		setOnlineTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.panNo</code> attribute.
	 * @return the panNo
	 */
	public String getPanNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PANNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.panNo</code> attribute.
	 * @return the panNo
	 */
	public String getPanNo()
	{
		return getPanNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.panNo</code> attribute. 
	 * @param value the panNo
	 */
	public void setPanNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PANNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.panNo</code> attribute. 
	 * @param value the panNo
	 */
	public void setPanNo(final String value)
	{
		setPanNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.parentCompany</code> attribute.
	 * @return the parentCompany
	 */
	public String getParentCompany(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSupplier.getParentCompany requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, PARENTCOMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.parentCompany</code> attribute.
	 * @return the parentCompany
	 */
	public String getParentCompany()
	{
		return getParentCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.parentCompany</code> attribute. 
	 * @return the localized parentCompany
	 */
	public Map<Language,String> getAllParentCompany(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,PARENTCOMPANY,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.parentCompany</code> attribute. 
	 * @return the localized parentCompany
	 */
	public Map<Language,String> getAllParentCompany()
	{
		return getAllParentCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.parentCompany</code> attribute. 
	 * @param value the parentCompany
	 */
	public void setParentCompany(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSupplier.setParentCompany requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PARENTCOMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.parentCompany</code> attribute. 
	 * @param value the parentCompany
	 */
	public void setParentCompany(final String value)
	{
		setParentCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.parentCompany</code> attribute. 
	 * @param value the parentCompany
	 */
	public void setAllParentCompany(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,PARENTCOMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.parentCompany</code> attribute. 
	 * @param value the parentCompany
	 */
	public void setAllParentCompany(final Map<Language,String> value)
	{
		setAllParentCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Collection<Category> getProductCategory(final SessionContext ctx)
	{
		Collection<Category> coll = (Collection<Category>)getProperty( ctx, PRODUCTCATEGORY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Collection<Category> getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final SessionContext ctx, final Collection<Category> value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final Collection<Category> value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.productCategoryInfo</code> attribute.
	 * @return the productCategoryInfo
	 */
	public Collection<ProductCategoryInfo> getProductCategoryInfo(final SessionContext ctx)
	{
		final List<ProductCategoryInfo> items = getLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYINFO,
			"ProductCategoryInfo",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.productCategoryInfo</code> attribute.
	 * @return the productCategoryInfo
	 */
	public Collection<ProductCategoryInfo> getProductCategoryInfo()
	{
		return getProductCategoryInfo( getSession().getSessionContext() );
	}
	
	public long getProductCategoryInfoCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYINFO,
			"ProductCategoryInfo",
			null
		);
	}
	
	public long getProductCategoryInfoCount()
	{
		return getProductCategoryInfoCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.productCategoryInfo</code> attribute. 
	 * @param value the productCategoryInfo
	 */
	public void setProductCategoryInfo(final SessionContext ctx, final Collection<ProductCategoryInfo> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYINFO,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2PRODUCTCATEGORYINFO_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.productCategoryInfo</code> attribute. 
	 * @param value the productCategoryInfo
	 */
	public void setProductCategoryInfo(final Collection<ProductCategoryInfo> value)
	{
		setProductCategoryInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productCategoryInfo. 
	 * @param value the item to add to productCategoryInfo
	 */
	public void addToProductCategoryInfo(final SessionContext ctx, final ProductCategoryInfo value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYINFO,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2PRODUCTCATEGORYINFO_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productCategoryInfo. 
	 * @param value the item to add to productCategoryInfo
	 */
	public void addToProductCategoryInfo(final ProductCategoryInfo value)
	{
		addToProductCategoryInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productCategoryInfo. 
	 * @param value the item to remove from productCategoryInfo
	 */
	public void removeFromProductCategoryInfo(final SessionContext ctx, final ProductCategoryInfo value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2PRODUCTCATEGORYINFO,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2PRODUCTCATEGORYINFO_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productCategoryInfo. 
	 * @param value the item to remove from productCategoryInfo
	 */
	public void removeFromProductCategoryInfo(final ProductCategoryInfo value)
	{
		removeFromProductCategoryInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.shortName</code> attribute.
	 * @return the shortName
	 */
	public String getShortName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSupplier.getShortName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SHORTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.shortName</code> attribute.
	 * @return the shortName
	 */
	public String getShortName()
	{
		return getShortName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.shortName</code> attribute. 
	 * @return the localized shortName
	 */
	public Map<Language,String> getAllShortName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SHORTNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.shortName</code> attribute. 
	 * @return the localized shortName
	 */
	public Map<Language,String> getAllShortName()
	{
		return getAllShortName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.shortName</code> attribute. 
	 * @param value the shortName
	 */
	public void setShortName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSupplier.setShortName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SHORTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.shortName</code> attribute. 
	 * @param value the shortName
	 */
	public void setShortName(final String value)
	{
		setShortName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.shortName</code> attribute. 
	 * @param value the shortName
	 */
	public void setAllShortName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SHORTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.shortName</code> attribute. 
	 * @param value the shortName
	 */
	public void setAllShortName(final Map<Language,String> value)
	{
		setAllShortName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.stRegNo</code> attribute.
	 * @return the stRegNo
	 */
	public String getStRegNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STREGNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.stRegNo</code> attribute.
	 * @return the stRegNo
	 */
	public String getStRegNo()
	{
		return getStRegNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.stRegNo</code> attribute. 
	 * @param value the stRegNo
	 */
	public void setStRegNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STREGNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.stRegNo</code> attribute. 
	 * @param value the stRegNo
	 */
	public void setStRegNo(final String value)
	{
		setStRegNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.subscriberAccountRef</code> attribute.
	 * @return the subscriberAccountRef
	 */
	public String getSubscriberAccountRef(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBSCRIBERACCOUNTREF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.subscriberAccountRef</code> attribute.
	 * @return the subscriberAccountRef
	 */
	public String getSubscriberAccountRef()
	{
		return getSubscriberAccountRef( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.subscriberAccountRef</code> attribute. 
	 * @param value the subscriberAccountRef
	 */
	public void setSubscriberAccountRef(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBSCRIBERACCOUNTREF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.subscriberAccountRef</code> attribute. 
	 * @param value the subscriberAccountRef
	 */
	public void setSubscriberAccountRef(final String value)
	{
		setSubscriberAccountRef( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.supplierBrands</code> attribute.
	 * @return the supplierBrands
	 */
	public Collection<SupplierBrand> getSupplierBrands(final SessionContext ctx)
	{
		final List<SupplierBrand> items = getLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIERTOSUPPPLIERBRANDS,
			"SupplierBrand",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.supplierBrands</code> attribute.
	 * @return the supplierBrands
	 */
	public Collection<SupplierBrand> getSupplierBrands()
	{
		return getSupplierBrands( getSession().getSessionContext() );
	}
	
	public long getSupplierBrandsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIERTOSUPPPLIERBRANDS,
			"SupplierBrand",
			null
		);
	}
	
	public long getSupplierBrandsCount()
	{
		return getSupplierBrandsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.supplierBrands</code> attribute. 
	 * @param value the supplierBrands
	 */
	public void setSupplierBrands(final SessionContext ctx, final Collection<SupplierBrand> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIERTOSUPPPLIERBRANDS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERTOSUPPPLIERBRANDS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.supplierBrands</code> attribute. 
	 * @param value the supplierBrands
	 */
	public void setSupplierBrands(final Collection<SupplierBrand> value)
	{
		setSupplierBrands( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierBrands. 
	 * @param value the item to add to supplierBrands
	 */
	public void addToSupplierBrands(final SessionContext ctx, final SupplierBrand value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIERTOSUPPPLIERBRANDS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERTOSUPPPLIERBRANDS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierBrands. 
	 * @param value the item to add to supplierBrands
	 */
	public void addToSupplierBrands(final SupplierBrand value)
	{
		addToSupplierBrands( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierBrands. 
	 * @param value the item to remove from supplierBrands
	 */
	public void removeFromSupplierBrands(final SessionContext ctx, final SupplierBrand value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIERTOSUPPPLIERBRANDS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERTOSUPPPLIERBRANDS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierBrands. 
	 * @param value the item to remove from supplierBrands
	 */
	public void removeFromSupplierBrands(final SupplierBrand value)
	{
		removeFromSupplierBrands( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.supplierMarkets</code> attribute.
	 * @return the supplierMarkets
	 */
	public Set<SupplierMarket> getSupplierMarkets(final SessionContext ctx)
	{
		final List<SupplierMarket> items = getLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERMARKETRELATION,
			"SupplierMarket",
			null,
			false,
			false
		);
		return new LinkedHashSet<SupplierMarket>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.supplierMarkets</code> attribute.
	 * @return the supplierMarkets
	 */
	public Set<SupplierMarket> getSupplierMarkets()
	{
		return getSupplierMarkets( getSession().getSessionContext() );
	}
	
	public long getSupplierMarketsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERMARKETRELATION,
			"SupplierMarket",
			null
		);
	}
	
	public long getSupplierMarketsCount()
	{
		return getSupplierMarketsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.supplierMarkets</code> attribute. 
	 * @param value the supplierMarkets
	 */
	public void setSupplierMarkets(final SessionContext ctx, final Set<SupplierMarket> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERMARKETRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPPLIERMARKETRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.supplierMarkets</code> attribute. 
	 * @param value the supplierMarkets
	 */
	public void setSupplierMarkets(final Set<SupplierMarket> value)
	{
		setSupplierMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierMarkets. 
	 * @param value the item to add to supplierMarkets
	 */
	public void addToSupplierMarkets(final SessionContext ctx, final SupplierMarket value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERMARKETRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPPLIERMARKETRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierMarkets. 
	 * @param value the item to add to supplierMarkets
	 */
	public void addToSupplierMarkets(final SupplierMarket value)
	{
		addToSupplierMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierMarkets. 
	 * @param value the item to remove from supplierMarkets
	 */
	public void removeFromSupplierMarkets(final SessionContext ctx, final SupplierMarket value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercoreConstants.Relations.SUPPLIER2SUPPLIERMARKETRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIER2SUPPLIERMARKETRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierMarkets. 
	 * @param value the item to remove from supplierMarkets
	 */
	public void removeFromSupplierMarkets(final SupplierMarket value)
	{
		removeFromSupplierMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.supplierType</code> attribute.
	 * @return the supplierType
	 */
	public EnumerationValue getSupplierType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SUPPLIERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.supplierType</code> attribute.
	 * @return the supplierType
	 */
	public EnumerationValue getSupplierType()
	{
		return getSupplierType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.supplierType</code> attribute. 
	 * @param value the supplierType
	 */
	public void setSupplierType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SUPPLIERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.supplierType</code> attribute. 
	 * @param value the supplierType
	 */
	public void setSupplierType(final EnumerationValue value)
	{
		setSupplierType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.supplierUpdatesTrigger</code> attribute.
	 * @return the supplierUpdatesTrigger
	 */
	public Trigger getSupplierUpdatesTrigger(final SessionContext ctx)
	{
		return (Trigger)getProperty( ctx, SUPPLIERUPDATESTRIGGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.supplierUpdatesTrigger</code> attribute.
	 * @return the supplierUpdatesTrigger
	 */
	public Trigger getSupplierUpdatesTrigger()
	{
		return getSupplierUpdatesTrigger( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.supplierUpdatesTrigger</code> attribute. 
	 * @param value the supplierUpdatesTrigger
	 */
	public void setSupplierUpdatesTrigger(final SessionContext ctx, final Trigger value)
	{
		new PartOfHandler<Trigger>()
		{
			@Override
			protected Trigger doGetValue(final SessionContext ctx)
			{
				return getSupplierUpdatesTrigger( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Trigger _value)
			{
				final Trigger value = _value;
				setProperty(ctx, SUPPLIERUPDATESTRIGGER,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.supplierUpdatesTrigger</code> attribute. 
	 * @param value the supplierUpdatesTrigger
	 */
	public void setSupplierUpdatesTrigger(final Trigger value)
	{
		setSupplierUpdatesTrigger( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.tanNo</code> attribute.
	 * @return the tanNo
	 */
	public String getTanNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TANNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.tanNo</code> attribute.
	 * @return the tanNo
	 */
	public String getTanNo()
	{
		return getTanNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.tanNo</code> attribute. 
	 * @param value the tanNo
	 */
	public void setTanNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TANNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.tanNo</code> attribute. 
	 * @param value the tanNo
	 */
	public void setTanNo(final String value)
	{
		setTanNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.transactionalReportingTrigger</code> attribute.
	 * @return the transactionalReportingTrigger
	 */
	public Trigger getTransactionalReportingTrigger(final SessionContext ctx)
	{
		return (Trigger)getProperty( ctx, TRANSACTIONALREPORTINGTRIGGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.transactionalReportingTrigger</code> attribute.
	 * @return the transactionalReportingTrigger
	 */
	public Trigger getTransactionalReportingTrigger()
	{
		return getTransactionalReportingTrigger( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.transactionalReportingTrigger</code> attribute. 
	 * @param value the transactionalReportingTrigger
	 */
	public void setTransactionalReportingTrigger(final SessionContext ctx, final Trigger value)
	{
		new PartOfHandler<Trigger>()
		{
			@Override
			protected Trigger doGetValue(final SessionContext ctx)
			{
				return getTransactionalReportingTrigger( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Trigger _value)
			{
				final Trigger value = _value;
				setProperty(ctx, TRANSACTIONALREPORTINGTRIGGER,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.transactionalReportingTrigger</code> attribute. 
	 * @param value the transactionalReportingTrigger
	 */
	public void setTransactionalReportingTrigger(final Trigger value)
	{
		setTransactionalReportingTrigger( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.typeOfOrganization</code> attribute.
	 * @return the typeOfOrganization
	 */
	public EnumerationValue getTypeOfOrganization(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFORGANIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.typeOfOrganization</code> attribute.
	 * @return the typeOfOrganization
	 */
	public EnumerationValue getTypeOfOrganization()
	{
		return getTypeOfOrganization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.typeOfOrganization</code> attribute. 
	 * @param value the typeOfOrganization
	 */
	public void setTypeOfOrganization(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFORGANIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.typeOfOrganization</code> attribute. 
	 * @param value the typeOfOrganization
	 */
	public void setTypeOfOrganization(final EnumerationValue value)
	{
		setTypeOfOrganization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.vatOrTinNo</code> attribute.
	 * @return the vatOrTinNo
	 */
	public String getVatOrTinNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VATORTINNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.vatOrTinNo</code> attribute.
	 * @return the vatOrTinNo
	 */
	public String getVatOrTinNo()
	{
		return getVatOrTinNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.vatOrTinNo</code> attribute. 
	 * @param value the vatOrTinNo
	 */
	public void setVatOrTinNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VATORTINNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.vatOrTinNo</code> attribute. 
	 * @param value the vatOrTinNo
	 */
	public void setVatOrTinNo(final String value)
	{
		setVatOrTinNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus()
	{
		return getWorkFlowStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), value );
	}
	
}
