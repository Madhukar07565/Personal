/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.core.supplier.jalo;

import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.supplier.core.constants.SuppliercoreConstants;
import com.cnk.travelogix.supplier.core.supplier.jalo.ROE;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.catalog.jalo.Company;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.core.supplier.jalo.TravelogixROE TravelogixROE}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelogixROE extends AbstractTravelogixItem
{
	/** Qualifier of the <code>TravelogixROE.supplierName</code> attribute **/
	public static final String SUPPLIERNAME = "supplierName";
	/** Qualifier of the <code>TravelogixROE.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	/** Qualifier of the <code>TravelogixROE.roeSource</code> attribute **/
	public static final String ROESOURCE = "roeSource";
	/** Qualifier of the <code>TravelogixROE.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>TravelogixROE.productName</code> attribute **/
	public static final String PRODUCTNAME = "productName";
	/** Qualifier of the <code>TravelogixROE.effectiveFromDate</code> attribute **/
	public static final String EFFECTIVEFROMDATE = "effectiveFromDate";
	/** Qualifier of the <code>TravelogixROE.effectiveToDate</code> attribute **/
	public static final String EFFECTIVETODATE = "effectiveToDate";
	/** Qualifier of the <code>TravelogixROE.roeType</code> attribute **/
	public static final String ROETYPE = "roeType";
	/** Qualifier of the <code>TravelogixROE.companyMarket</code> attribute **/
	public static final String COMPANYMARKET = "companyMarket";
	/** Qualifier of the <code>TravelogixROE.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>TravelogixROE.roeTypeId</code> attribute **/
	public static final String ROETYPEID = "roeTypeId";
	/** Qualifier of the <code>TravelogixROE.roeies</code> attribute **/
	public static final String ROEIES = "roeies";
	/**
	* {@link OneToManyHandler} for handling 1:n ROEIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ROE> ROEIESHANDLER = new OneToManyHandler<ROE>(
	SuppliercoreConstants.TC.ROE,
	false,
	"travelogixroe",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SUPPLIERNAME, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORY, AttributeMode.INITIAL);
		tmp.put(ROESOURCE, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAME, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROMDATE, AttributeMode.INITIAL);
		tmp.put(EFFECTIVETODATE, AttributeMode.INITIAL);
		tmp.put(ROETYPE, AttributeMode.INITIAL);
		tmp.put(COMPANYMARKET, AttributeMode.INITIAL);
		tmp.put(COMPANY, AttributeMode.INITIAL);
		tmp.put(ROETYPEID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final Company value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.companyMarket</code> attribute.
	 * @return the companyMarket
	 */
	public Market getCompanyMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, COMPANYMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.companyMarket</code> attribute.
	 * @return the companyMarket
	 */
	public Market getCompanyMarket()
	{
		return getCompanyMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.companyMarket</code> attribute. 
	 * @param value the companyMarket
	 */
	public void setCompanyMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, COMPANYMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.companyMarket</code> attribute. 
	 * @param value the companyMarket
	 */
	public void setCompanyMarket(final Market value)
	{
		setCompanyMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.effectiveFromDate</code> attribute.
	 * @return the effectiveFromDate
	 */
	public Date getEffectiveFromDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROMDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.effectiveFromDate</code> attribute.
	 * @return the effectiveFromDate
	 */
	public Date getEffectiveFromDate()
	{
		return getEffectiveFromDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.effectiveFromDate</code> attribute. 
	 * @param value the effectiveFromDate
	 */
	public void setEffectiveFromDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROMDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.effectiveFromDate</code> attribute. 
	 * @param value the effectiveFromDate
	 */
	public void setEffectiveFromDate(final Date value)
	{
		setEffectiveFromDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.effectiveToDate</code> attribute.
	 * @return the effectiveToDate
	 */
	public Date getEffectiveToDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVETODATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.effectiveToDate</code> attribute.
	 * @return the effectiveToDate
	 */
	public Date getEffectiveToDate()
	{
		return getEffectiveToDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.effectiveToDate</code> attribute. 
	 * @param value the effectiveToDate
	 */
	public void setEffectiveToDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVETODATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.effectiveToDate</code> attribute. 
	 * @param value the effectiveToDate
	 */
	public void setEffectiveToDate(final Date value)
	{
		setEffectiveToDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Category getProductCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, PRODUCTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Category getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final Category value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public Category getProductCategorySubType(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public Category getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final Category value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.productName</code> attribute.
	 * @return the productName
	 */
	public Product getProductName(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.productName</code> attribute.
	 * @return the productName
	 */
	public Product getProductName()
	{
		return getProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setProductName(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.productName</code> attribute. 
	 * @param value the productName
	 */
	public void setProductName(final Product value)
	{
		setProductName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.roeies</code> attribute.
	 * @return the roeies
	 */
	public Collection<ROE> getRoeies(final SessionContext ctx)
	{
		return ROEIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.roeies</code> attribute.
	 * @return the roeies
	 */
	public Collection<ROE> getRoeies()
	{
		return getRoeies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.roeies</code> attribute. 
	 * @param value the roeies
	 */
	public void setRoeies(final SessionContext ctx, final Collection<ROE> value)
	{
		ROEIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.roeies</code> attribute. 
	 * @param value the roeies
	 */
	public void setRoeies(final Collection<ROE> value)
	{
		setRoeies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roeies. 
	 * @param value the item to add to roeies
	 */
	public void addToRoeies(final SessionContext ctx, final ROE value)
	{
		ROEIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roeies. 
	 * @param value the item to add to roeies
	 */
	public void addToRoeies(final ROE value)
	{
		addToRoeies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roeies. 
	 * @param value the item to remove from roeies
	 */
	public void removeFromRoeies(final SessionContext ctx, final ROE value)
	{
		ROEIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roeies. 
	 * @param value the item to remove from roeies
	 */
	public void removeFromRoeies(final ROE value)
	{
		removeFromRoeies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.roeSource</code> attribute.
	 * @return the roeSource
	 */
	public String getRoeSource(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROESOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.roeSource</code> attribute.
	 * @return the roeSource
	 */
	public String getRoeSource()
	{
		return getRoeSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.roeSource</code> attribute. 
	 * @param value the roeSource
	 */
	public void setRoeSource(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROESOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.roeSource</code> attribute. 
	 * @param value the roeSource
	 */
	public void setRoeSource(final String value)
	{
		setRoeSource( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.roeType</code> attribute.
	 * @return the roeType
	 */
	public EnumerationValue getRoeType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.roeType</code> attribute.
	 * @return the roeType
	 */
	public EnumerationValue getRoeType()
	{
		return getRoeType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.roeType</code> attribute. 
	 * @param value the roeType
	 */
	public void setRoeType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.roeType</code> attribute. 
	 * @param value the roeType
	 */
	public void setRoeType(final EnumerationValue value)
	{
		setRoeType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.roeTypeId</code> attribute.
	 * @return the roeTypeId
	 */
	public String getRoeTypeId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROETYPEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.roeTypeId</code> attribute.
	 * @return the roeTypeId
	 */
	public String getRoeTypeId()
	{
		return getRoeTypeId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.roeTypeId</code> attribute. 
	 * @param value the roeTypeId
	 */
	public void setRoeTypeId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROETYPEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.roeTypeId</code> attribute. 
	 * @param value the roeTypeId
	 */
	public void setRoeTypeId(final String value)
	{
		setRoeTypeId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.supplierName</code> attribute.
	 * @return the supplierName
	 */
	public Supplier getSupplierName(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixROE.supplierName</code> attribute.
	 * @return the supplierName
	 */
	public Supplier getSupplierName()
	{
		return getSupplierName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.supplierName</code> attribute. 
	 * @param value the supplierName
	 */
	public void setSupplierName(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixROE.supplierName</code> attribute. 
	 * @param value the supplierName
	 */
	public void setSupplierName(final Supplier value)
	{
		setSupplierName( getSession().getSessionContext(), value );
	}
	
}
