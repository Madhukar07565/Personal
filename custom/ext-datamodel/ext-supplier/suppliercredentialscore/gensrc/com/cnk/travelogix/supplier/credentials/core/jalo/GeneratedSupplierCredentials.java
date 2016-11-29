/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.credentials.core.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.supplier.core.constants.SuppliercoreConstants;
import com.cnk.travelogix.supplier.core.market.jalo.SupplierMarket;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.credentials.core.constants.SuppliercredentialscoreConstants;
import com.cnk.travelogix.supplier.credentials.core.indents.jalo.CreditDepositIndent;
import com.cnk.travelogix.supplier.credentials.core.jalo.CredentialDetail;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials SupplierCredentials}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierCredentials extends AbstractTravelogixItem
{
	/** Qualifier of the <code>SupplierCredentials.supplierType</code> attribute **/
	public static final String SUPPLIERTYPE = "supplierType";
	/** Qualifier of the <code>SupplierCredentials.enablerCategory</code> attribute **/
	public static final String ENABLERCATEGORY = "enablerCategory";
	/** Qualifier of the <code>SupplierCredentials.companySupplierID</code> attribute **/
	public static final String COMPANYSUPPLIERID = "companySupplierID";
	/** Qualifier of the <code>SupplierCredentials.supplierName</code> attribute **/
	public static final String SUPPLIERNAME = "supplierName";
	/** Qualifier of the <code>SupplierCredentials.credentialID</code> attribute **/
	public static final String CREDENTIALID = "credentialID";
	/** Qualifier of the <code>SupplierCredentials.credentialName</code> attribute **/
	public static final String CREDENTIALNAME = "credentialName";
	/** Qualifier of the <code>SupplierCredentials.credentialType</code> attribute **/
	public static final String CREDENTIALTYPE = "credentialType";
	/** Qualifier of the <code>SupplierCredentials.clientType</code> attribute **/
	public static final String CLIENTTYPE = "clientType";
	/** Qualifier of the <code>SupplierCredentials.publishedFareCredential</code> attribute **/
	public static final String PUBLISHEDFARECREDENTIAL = "publishedFareCredential";
	/** Qualifier of the <code>SupplierCredentials.ownedBy</code> attribute **/
	public static final String OWNEDBY = "ownedBy";
	/** Qualifier of the <code>SupplierCredentials.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>SupplierCredentials.client</code> attribute **/
	public static final String CLIENT = "client";
	/** Qualifier of the <code>SupplierCredentials.activeFrom</code> attribute **/
	public static final String ACTIVEFROM = "activeFrom";
	/** Qualifier of the <code>SupplierCredentials.activeTo</code> attribute **/
	public static final String ACTIVETO = "activeTo";
	/** Qualifier of the <code>SupplierCredentials.credentialDetail</code> attribute **/
	public static final String CREDENTIALDETAIL = "credentialDetail";
	/** Qualifier of the <code>SupplierCredentials.markets</code> attribute **/
	public static final String MARKETS = "markets";
	/** Qualifier of the <code>SupplierCredentials.productCategorySubTypes</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPES = "productCategorySubTypes";
	/** Qualifier of the <code>SupplierCredentials.indents</code> attribute **/
	public static final String INDENTS = "indents";
	/** Relation ordering override parameter constants for CreditDepositIndent2CredentialsRel from ((suppliercredentialscore))*/
	protected static String CREDITDEPOSITINDENT2CREDENTIALSREL_SRC_ORDERED = "relation.CreditDepositIndent2CredentialsRel.source.ordered";
	protected static String CREDITDEPOSITINDENT2CREDENTIALSREL_TGT_ORDERED = "relation.CreditDepositIndent2CredentialsRel.target.ordered";
	/** Relation disable markmodifed parameter constants for CreditDepositIndent2CredentialsRel from ((suppliercredentialscore))*/
	protected static String CREDITDEPOSITINDENT2CREDENTIALSREL_MARKMODIFIED = "relation.CreditDepositIndent2CredentialsRel.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SUPPLIER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierCredentials> SUPPLIERHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierCredentials>(
	SuppliercredentialscoreConstants.TC.SUPPLIERCREDENTIALS,
	false,
	"supplier",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MARKETS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierMarket> MARKETSHANDLER = new OneToManyHandler<SupplierMarket>(
	SuppliercoreConstants.TC.SUPPLIERMARKET,
	false,
	"credentials",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTCATEGORYSUBTYPES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ProductCategorySubType> PRODUCTCATEGORYSUBTYPESHANDLER = new OneToManyHandler<ProductCategorySubType>(
	MasterdatacoreConstants.TC.PRODUCTCATEGORYSUBTYPE,
	false,
	"credentials",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SUPPLIERTYPE, AttributeMode.INITIAL);
		tmp.put(ENABLERCATEGORY, AttributeMode.INITIAL);
		tmp.put(COMPANYSUPPLIERID, AttributeMode.INITIAL);
		tmp.put(SUPPLIERNAME, AttributeMode.INITIAL);
		tmp.put(CREDENTIALID, AttributeMode.INITIAL);
		tmp.put(CREDENTIALNAME, AttributeMode.INITIAL);
		tmp.put(CREDENTIALTYPE, AttributeMode.INITIAL);
		tmp.put(CLIENTTYPE, AttributeMode.INITIAL);
		tmp.put(PUBLISHEDFARECREDENTIAL, AttributeMode.INITIAL);
		tmp.put(OWNEDBY, AttributeMode.INITIAL);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		tmp.put(ACTIVEFROM, AttributeMode.INITIAL);
		tmp.put(ACTIVETO, AttributeMode.INITIAL);
		tmp.put(CREDENTIALDETAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.activeFrom</code> attribute.
	 * @return the activeFrom
	 */
	public Date getActiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ACTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.activeFrom</code> attribute.
	 * @return the activeFrom
	 */
	public Date getActiveFrom()
	{
		return getActiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.activeFrom</code> attribute. 
	 * @param value the activeFrom
	 */
	public void setActiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ACTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.activeFrom</code> attribute. 
	 * @param value the activeFrom
	 */
	public void setActiveFrom(final Date value)
	{
		setActiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.activeTo</code> attribute.
	 * @return the activeTo
	 */
	public Date getActiveTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ACTIVETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.activeTo</code> attribute.
	 * @return the activeTo
	 */
	public Date getActiveTo()
	{
		return getActiveTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.activeTo</code> attribute. 
	 * @param value the activeTo
	 */
	public void setActiveTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ACTIVETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.activeTo</code> attribute. 
	 * @param value the activeTo
	 */
	public void setActiveTo(final Date value)
	{
		setActiveTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final Principal value)
	{
		setProperty(ctx, CLIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final Principal value)
	{
		setClient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.clientType</code> attribute.
	 * @return the clientType
	 */
	public EnumerationValue getClientType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.clientType</code> attribute.
	 * @return the clientType
	 */
	public EnumerationValue getClientType()
	{
		return getClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.clientType</code> attribute. 
	 * @param value the clientType
	 */
	public void setClientType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.clientType</code> attribute. 
	 * @param value the clientType
	 */
	public void setClientType(final EnumerationValue value)
	{
		setClientType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.companySupplierID</code> attribute.
	 * @return the companySupplierID
	 */
	public String getCompanySupplierID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANYSUPPLIERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.companySupplierID</code> attribute.
	 * @return the companySupplierID
	 */
	public String getCompanySupplierID()
	{
		return getCompanySupplierID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.companySupplierID</code> attribute. 
	 * @param value the companySupplierID
	 */
	public void setCompanySupplierID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANYSUPPLIERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.companySupplierID</code> attribute. 
	 * @param value the companySupplierID
	 */
	public void setCompanySupplierID(final String value)
	{
		setCompanySupplierID( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SUPPLIERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.credentialDetail</code> attribute.
	 * @return the credentialDetail
	 */
	public CredentialDetail getCredentialDetail(final SessionContext ctx)
	{
		return (CredentialDetail)getProperty( ctx, CREDENTIALDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.credentialDetail</code> attribute.
	 * @return the credentialDetail
	 */
	public CredentialDetail getCredentialDetail()
	{
		return getCredentialDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.credentialDetail</code> attribute. 
	 * @param value the credentialDetail
	 */
	public void setCredentialDetail(final SessionContext ctx, final CredentialDetail value)
	{
		setProperty(ctx, CREDENTIALDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.credentialDetail</code> attribute. 
	 * @param value the credentialDetail
	 */
	public void setCredentialDetail(final CredentialDetail value)
	{
		setCredentialDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.credentialID</code> attribute.
	 * @return the credentialID
	 */
	public String getCredentialID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDENTIALID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.credentialID</code> attribute.
	 * @return the credentialID
	 */
	public String getCredentialID()
	{
		return getCredentialID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.credentialID</code> attribute. 
	 * @param value the credentialID
	 */
	public void setCredentialID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDENTIALID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.credentialID</code> attribute. 
	 * @param value the credentialID
	 */
	public void setCredentialID(final String value)
	{
		setCredentialID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.credentialName</code> attribute.
	 * @return the credentialName
	 */
	public String getCredentialName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDENTIALNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.credentialName</code> attribute.
	 * @return the credentialName
	 */
	public String getCredentialName()
	{
		return getCredentialName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.credentialName</code> attribute. 
	 * @param value the credentialName
	 */
	public void setCredentialName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDENTIALNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.credentialName</code> attribute. 
	 * @param value the credentialName
	 */
	public void setCredentialName(final String value)
	{
		setCredentialName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.credentialType</code> attribute.
	 * @return the credentialType
	 */
	public EnumerationValue getCredentialType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CREDENTIALTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.credentialType</code> attribute.
	 * @return the credentialType
	 */
	public EnumerationValue getCredentialType()
	{
		return getCredentialType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.credentialType</code> attribute. 
	 * @param value the credentialType
	 */
	public void setCredentialType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CREDENTIALTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.credentialType</code> attribute. 
	 * @param value the credentialType
	 */
	public void setCredentialType(final EnumerationValue value)
	{
		setCredentialType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.enablerCategory</code> attribute.
	 * @return the enablerCategory
	 */
	public EnumerationValue getEnablerCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ENABLERCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.enablerCategory</code> attribute.
	 * @return the enablerCategory
	 */
	public EnumerationValue getEnablerCategory()
	{
		return getEnablerCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.enablerCategory</code> attribute. 
	 * @param value the enablerCategory
	 */
	public void setEnablerCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ENABLERCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.enablerCategory</code> attribute. 
	 * @param value the enablerCategory
	 */
	public void setEnablerCategory(final EnumerationValue value)
	{
		setEnablerCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.indents</code> attribute.
	 * @return the indents
	 */
	public Collection<CreditDepositIndent> getIndents(final SessionContext ctx)
	{
		final List<CreditDepositIndent> items = getLinkedItems( 
			ctx,
			false,
			SuppliercredentialscoreConstants.Relations.CREDITDEPOSITINDENT2CREDENTIALSREL,
			"CreditDepositIndent",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.indents</code> attribute.
	 * @return the indents
	 */
	public Collection<CreditDepositIndent> getIndents()
	{
		return getIndents( getSession().getSessionContext() );
	}
	
	public long getIndentsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			SuppliercredentialscoreConstants.Relations.CREDITDEPOSITINDENT2CREDENTIALSREL,
			"CreditDepositIndent",
			null
		);
	}
	
	public long getIndentsCount()
	{
		return getIndentsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.indents</code> attribute. 
	 * @param value the indents
	 */
	public void setIndents(final SessionContext ctx, final Collection<CreditDepositIndent> value)
	{
		setLinkedItems( 
			ctx,
			false,
			SuppliercredentialscoreConstants.Relations.CREDITDEPOSITINDENT2CREDENTIALSREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CREDITDEPOSITINDENT2CREDENTIALSREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.indents</code> attribute. 
	 * @param value the indents
	 */
	public void setIndents(final Collection<CreditDepositIndent> value)
	{
		setIndents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to indents. 
	 * @param value the item to add to indents
	 */
	public void addToIndents(final SessionContext ctx, final CreditDepositIndent value)
	{
		addLinkedItems( 
			ctx,
			false,
			SuppliercredentialscoreConstants.Relations.CREDITDEPOSITINDENT2CREDENTIALSREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CREDITDEPOSITINDENT2CREDENTIALSREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to indents. 
	 * @param value the item to add to indents
	 */
	public void addToIndents(final CreditDepositIndent value)
	{
		addToIndents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from indents. 
	 * @param value the item to remove from indents
	 */
	public void removeFromIndents(final SessionContext ctx, final CreditDepositIndent value)
	{
		removeLinkedItems( 
			ctx,
			false,
			SuppliercredentialscoreConstants.Relations.CREDITDEPOSITINDENT2CREDENTIALSREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CREDITDEPOSITINDENT2CREDENTIALSREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from indents. 
	 * @param value the item to remove from indents
	 */
	public void removeFromIndents(final CreditDepositIndent value)
	{
		removeFromIndents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.markets</code> attribute.
	 * @return the markets
	 */
	public Collection<SupplierMarket> getMarkets(final SessionContext ctx)
	{
		return MARKETSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.markets</code> attribute.
	 * @return the markets
	 */
	public Collection<SupplierMarket> getMarkets()
	{
		return getMarkets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.markets</code> attribute. 
	 * @param value the markets
	 */
	public void setMarkets(final SessionContext ctx, final Collection<SupplierMarket> value)
	{
		MARKETSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.markets</code> attribute. 
	 * @param value the markets
	 */
	public void setMarkets(final Collection<SupplierMarket> value)
	{
		setMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to markets. 
	 * @param value the item to add to markets
	 */
	public void addToMarkets(final SessionContext ctx, final SupplierMarket value)
	{
		MARKETSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to markets. 
	 * @param value the item to add to markets
	 */
	public void addToMarkets(final SupplierMarket value)
	{
		addToMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from markets. 
	 * @param value the item to remove from markets
	 */
	public void removeFromMarkets(final SessionContext ctx, final SupplierMarket value)
	{
		MARKETSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from markets. 
	 * @param value the item to remove from markets
	 */
	public void removeFromMarkets(final SupplierMarket value)
	{
		removeFromMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.ownedBy</code> attribute.
	 * @return the ownedBy
	 */
	public EnumerationValue getOwnedBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OWNEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.ownedBy</code> attribute.
	 * @return the ownedBy
	 */
	public EnumerationValue getOwnedBy()
	{
		return getOwnedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.ownedBy</code> attribute. 
	 * @param value the ownedBy
	 */
	public void setOwnedBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OWNEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.ownedBy</code> attribute. 
	 * @param value the ownedBy
	 */
	public void setOwnedBy(final EnumerationValue value)
	{
		setOwnedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.productCategorySubTypes</code> attribute.
	 * @return the productCategorySubTypes
	 */
	public Collection<ProductCategorySubType> getProductCategorySubTypes(final SessionContext ctx)
	{
		return PRODUCTCATEGORYSUBTYPESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.productCategorySubTypes</code> attribute.
	 * @return the productCategorySubTypes
	 */
	public Collection<ProductCategorySubType> getProductCategorySubTypes()
	{
		return getProductCategorySubTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.productCategorySubTypes</code> attribute. 
	 * @param value the productCategorySubTypes
	 */
	public void setProductCategorySubTypes(final SessionContext ctx, final Collection<ProductCategorySubType> value)
	{
		PRODUCTCATEGORYSUBTYPESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.productCategorySubTypes</code> attribute. 
	 * @param value the productCategorySubTypes
	 */
	public void setProductCategorySubTypes(final Collection<ProductCategorySubType> value)
	{
		setProductCategorySubTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productCategorySubTypes. 
	 * @param value the item to add to productCategorySubTypes
	 */
	public void addToProductCategorySubTypes(final SessionContext ctx, final ProductCategorySubType value)
	{
		PRODUCTCATEGORYSUBTYPESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productCategorySubTypes. 
	 * @param value the item to add to productCategorySubTypes
	 */
	public void addToProductCategorySubTypes(final ProductCategorySubType value)
	{
		addToProductCategorySubTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productCategorySubTypes. 
	 * @param value the item to remove from productCategorySubTypes
	 */
	public void removeFromProductCategorySubTypes(final SessionContext ctx, final ProductCategorySubType value)
	{
		PRODUCTCATEGORYSUBTYPESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productCategorySubTypes. 
	 * @param value the item to remove from productCategorySubTypes
	 */
	public void removeFromProductCategorySubTypes(final ProductCategorySubType value)
	{
		removeFromProductCategorySubTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.publishedFareCredential</code> attribute.
	 * @return the publishedFareCredential
	 */
	public Boolean isPublishedFareCredential(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PUBLISHEDFARECREDENTIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.publishedFareCredential</code> attribute.
	 * @return the publishedFareCredential
	 */
	public Boolean isPublishedFareCredential()
	{
		return isPublishedFareCredential( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.publishedFareCredential</code> attribute. 
	 * @return the publishedFareCredential
	 */
	public boolean isPublishedFareCredentialAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPublishedFareCredential( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.publishedFareCredential</code> attribute. 
	 * @return the publishedFareCredential
	 */
	public boolean isPublishedFareCredentialAsPrimitive()
	{
		return isPublishedFareCredentialAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.publishedFareCredential</code> attribute. 
	 * @param value the publishedFareCredential
	 */
	public void setPublishedFareCredential(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PUBLISHEDFARECREDENTIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.publishedFareCredential</code> attribute. 
	 * @param value the publishedFareCredential
	 */
	public void setPublishedFareCredential(final Boolean value)
	{
		setPublishedFareCredential( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.publishedFareCredential</code> attribute. 
	 * @param value the publishedFareCredential
	 */
	public void setPublishedFareCredential(final SessionContext ctx, final boolean value)
	{
		setPublishedFareCredential( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.publishedFareCredential</code> attribute. 
	 * @param value the publishedFareCredential
	 */
	public void setPublishedFareCredential(final boolean value)
	{
		setPublishedFareCredential( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		SUPPLIERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.supplierName</code> attribute.
	 * @return the supplierName
	 */
	public Supplier getSupplierName(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.supplierName</code> attribute.
	 * @return the supplierName
	 */
	public Supplier getSupplierName()
	{
		return getSupplierName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.supplierName</code> attribute. 
	 * @param value the supplierName
	 */
	public void setSupplierName(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.supplierName</code> attribute. 
	 * @param value the supplierName
	 */
	public void setSupplierName(final Supplier value)
	{
		setSupplierName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.supplierType</code> attribute.
	 * @return the supplierType
	 */
	public EnumerationValue getSupplierType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SUPPLIERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.supplierType</code> attribute.
	 * @return the supplierType
	 */
	public EnumerationValue getSupplierType()
	{
		return getSupplierType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.supplierType</code> attribute. 
	 * @param value the supplierType
	 */
	public void setSupplierType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SUPPLIERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.supplierType</code> attribute. 
	 * @param value the supplierType
	 */
	public void setSupplierType(final EnumerationValue value)
	{
		setSupplierType( getSession().getSessionContext(), value );
	}
	
}
