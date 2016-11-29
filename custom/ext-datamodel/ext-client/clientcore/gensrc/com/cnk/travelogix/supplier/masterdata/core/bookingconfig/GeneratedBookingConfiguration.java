/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.masterdata.core.bookingconfig;

import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyOffers;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.jalo.BookingClientDetail;
import com.cnk.travelogix.client.core.jalo.BookingCriteria;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.supplier.core.constants.SuppliercoreConstants;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.masterdata.core.bookingconfig.BookingConfiguration BookingConfiguration}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBookingConfiguration extends AbstractTravelogixItem
{
	/** Qualifier of the <code>BookingConfiguration.priority</code> attribute **/
	public static final String PRIORITY = "priority";
	/** Qualifier of the <code>BookingConfiguration.companyMarket</code> attribute **/
	public static final String COMPANYMARKET = "companyMarket";
	/** Qualifier of the <code>BookingConfiguration.productSubCategory</code> attribute **/
	public static final String PRODUCTSUBCATEGORY = "productSubCategory";
	/** Qualifier of the <code>BookingConfiguration.colourCode</code> attribute **/
	public static final String COLOURCODE = "colourCode";
	/** Qualifier of the <code>BookingConfiguration.clientdetails</code> attribute **/
	public static final String CLIENTDETAILS = "clientdetails";
	/** Qualifier of the <code>BookingConfiguration.bookingcriterias</code> attribute **/
	public static final String BOOKINGCRITERIAS = "bookingcriterias";
	/** Qualifier of the <code>BookingConfiguration.suppliers</code> attribute **/
	public static final String SUPPLIERS = "suppliers";
	/** Qualifier of the <code>BookingConfiguration.inclusionProduct</code> attribute **/
	public static final String INCLUSIONPRODUCT = "inclusionProduct";
	/** Qualifier of the <code>BookingConfiguration.exclusionProduct</code> attribute **/
	public static final String EXCLUSIONPRODUCT = "exclusionProduct";
	/** Qualifier of the <code>BookingConfiguration.bookingcompanyoffer</code> attribute **/
	public static final String BOOKINGCOMPANYOFFER = "bookingcompanyoffer";
	/**
	* {@link OneToManyHandler} for handling 1:n CLIENTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BookingClientDetail> CLIENTDETAILSHANDLER = new OneToManyHandler<BookingClientDetail>(
	ClientcoreConstants.TC.BOOKINGCLIENTDETAIL,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BOOKINGCRITERIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BookingCriteria> BOOKINGCRITERIASHANDLER = new OneToManyHandler<BookingCriteria>(
	ClientcoreConstants.TC.BOOKINGCRITERIA,
	false,
	"criteria",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SUPPLIERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Supplier> SUPPLIERSHANDLER = new OneToManyHandler<Supplier>(
	SuppliercoreConstants.TC.SUPPLIER,
	false,
	"bookingsupplier",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INCLUSIONPRODUCT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Product> INCLUSIONPRODUCTHANDLER = new OneToManyHandler<Product>(
	CoreConstants.TC.PRODUCT,
	false,
	"inclusion",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n EXCLUSIONPRODUCT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Product> EXCLUSIONPRODUCTHANDLER = new OneToManyHandler<Product>(
	CoreConstants.TC.PRODUCT,
	false,
	"exclusion",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BOOKINGCOMPANYOFFER's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CompanyOffers> BOOKINGCOMPANYOFFERHANDLER = new OneToManyHandler<CompanyOffers>(
	ClientcoreConstants.TC.COMPANYOFFERS,
	false,
	"bookingconfigoffer",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRIORITY, AttributeMode.INITIAL);
		tmp.put(COMPANYMARKET, AttributeMode.INITIAL);
		tmp.put(PRODUCTSUBCATEGORY, AttributeMode.INITIAL);
		tmp.put(COLOURCODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.bookingcompanyoffer</code> attribute.
	 * @return the bookingcompanyoffer
	 */
	public Set<CompanyOffers> getBookingcompanyoffer(final SessionContext ctx)
	{
		return (Set<CompanyOffers>)BOOKINGCOMPANYOFFERHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.bookingcompanyoffer</code> attribute.
	 * @return the bookingcompanyoffer
	 */
	public Set<CompanyOffers> getBookingcompanyoffer()
	{
		return getBookingcompanyoffer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.bookingcompanyoffer</code> attribute. 
	 * @param value the bookingcompanyoffer
	 */
	public void setBookingcompanyoffer(final SessionContext ctx, final Set<CompanyOffers> value)
	{
		BOOKINGCOMPANYOFFERHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.bookingcompanyoffer</code> attribute. 
	 * @param value the bookingcompanyoffer
	 */
	public void setBookingcompanyoffer(final Set<CompanyOffers> value)
	{
		setBookingcompanyoffer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bookingcompanyoffer. 
	 * @param value the item to add to bookingcompanyoffer
	 */
	public void addToBookingcompanyoffer(final SessionContext ctx, final CompanyOffers value)
	{
		BOOKINGCOMPANYOFFERHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bookingcompanyoffer. 
	 * @param value the item to add to bookingcompanyoffer
	 */
	public void addToBookingcompanyoffer(final CompanyOffers value)
	{
		addToBookingcompanyoffer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bookingcompanyoffer. 
	 * @param value the item to remove from bookingcompanyoffer
	 */
	public void removeFromBookingcompanyoffer(final SessionContext ctx, final CompanyOffers value)
	{
		BOOKINGCOMPANYOFFERHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bookingcompanyoffer. 
	 * @param value the item to remove from bookingcompanyoffer
	 */
	public void removeFromBookingcompanyoffer(final CompanyOffers value)
	{
		removeFromBookingcompanyoffer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.bookingcriterias</code> attribute.
	 * @return the bookingcriterias
	 */
	public Set<BookingCriteria> getBookingcriterias(final SessionContext ctx)
	{
		return (Set<BookingCriteria>)BOOKINGCRITERIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.bookingcriterias</code> attribute.
	 * @return the bookingcriterias
	 */
	public Set<BookingCriteria> getBookingcriterias()
	{
		return getBookingcriterias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.bookingcriterias</code> attribute. 
	 * @param value the bookingcriterias
	 */
	public void setBookingcriterias(final SessionContext ctx, final Set<BookingCriteria> value)
	{
		BOOKINGCRITERIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.bookingcriterias</code> attribute. 
	 * @param value the bookingcriterias
	 */
	public void setBookingcriterias(final Set<BookingCriteria> value)
	{
		setBookingcriterias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bookingcriterias. 
	 * @param value the item to add to bookingcriterias
	 */
	public void addToBookingcriterias(final SessionContext ctx, final BookingCriteria value)
	{
		BOOKINGCRITERIASHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bookingcriterias. 
	 * @param value the item to add to bookingcriterias
	 */
	public void addToBookingcriterias(final BookingCriteria value)
	{
		addToBookingcriterias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bookingcriterias. 
	 * @param value the item to remove from bookingcriterias
	 */
	public void removeFromBookingcriterias(final SessionContext ctx, final BookingCriteria value)
	{
		BOOKINGCRITERIASHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bookingcriterias. 
	 * @param value the item to remove from bookingcriterias
	 */
	public void removeFromBookingcriterias(final BookingCriteria value)
	{
		removeFromBookingcriterias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.clientdetails</code> attribute.
	 * @return the clientdetails
	 */
	public Set<BookingClientDetail> getClientdetails(final SessionContext ctx)
	{
		return (Set<BookingClientDetail>)CLIENTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.clientdetails</code> attribute.
	 * @return the clientdetails
	 */
	public Set<BookingClientDetail> getClientdetails()
	{
		return getClientdetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.clientdetails</code> attribute. 
	 * @param value the clientdetails
	 */
	public void setClientdetails(final SessionContext ctx, final Set<BookingClientDetail> value)
	{
		CLIENTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.clientdetails</code> attribute. 
	 * @param value the clientdetails
	 */
	public void setClientdetails(final Set<BookingClientDetail> value)
	{
		setClientdetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientdetails. 
	 * @param value the item to add to clientdetails
	 */
	public void addToClientdetails(final SessionContext ctx, final BookingClientDetail value)
	{
		CLIENTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientdetails. 
	 * @param value the item to add to clientdetails
	 */
	public void addToClientdetails(final BookingClientDetail value)
	{
		addToClientdetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientdetails. 
	 * @param value the item to remove from clientdetails
	 */
	public void removeFromClientdetails(final SessionContext ctx, final BookingClientDetail value)
	{
		CLIENTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientdetails. 
	 * @param value the item to remove from clientdetails
	 */
	public void removeFromClientdetails(final BookingClientDetail value)
	{
		removeFromClientdetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.colourCode</code> attribute.
	 * @return the colourCode - Colour
	 */
	public String getColourCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COLOURCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.colourCode</code> attribute.
	 * @return the colourCode - Colour
	 */
	public String getColourCode()
	{
		return getColourCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.colourCode</code> attribute. 
	 * @param value the colourCode - Colour
	 */
	public void setColourCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COLOURCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.colourCode</code> attribute. 
	 * @param value the colourCode - Colour
	 */
	public void setColourCode(final String value)
	{
		setColourCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.companyMarket</code> attribute.
	 * @return the companyMarket - Company Market
	 */
	public Market getCompanyMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, COMPANYMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.companyMarket</code> attribute.
	 * @return the companyMarket - Company Market
	 */
	public Market getCompanyMarket()
	{
		return getCompanyMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.companyMarket</code> attribute. 
	 * @param value the companyMarket - Company Market
	 */
	public void setCompanyMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, COMPANYMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.companyMarket</code> attribute. 
	 * @param value the companyMarket - Company Market
	 */
	public void setCompanyMarket(final Market value)
	{
		setCompanyMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.exclusionProduct</code> attribute.
	 * @return the exclusionProduct
	 */
	public Set<Product> getExclusionProduct(final SessionContext ctx)
	{
		return (Set<Product>)EXCLUSIONPRODUCTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.exclusionProduct</code> attribute.
	 * @return the exclusionProduct
	 */
	public Set<Product> getExclusionProduct()
	{
		return getExclusionProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.exclusionProduct</code> attribute. 
	 * @param value the exclusionProduct
	 */
	public void setExclusionProduct(final SessionContext ctx, final Set<Product> value)
	{
		EXCLUSIONPRODUCTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.exclusionProduct</code> attribute. 
	 * @param value the exclusionProduct
	 */
	public void setExclusionProduct(final Set<Product> value)
	{
		setExclusionProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to exclusionProduct. 
	 * @param value the item to add to exclusionProduct
	 */
	public void addToExclusionProduct(final SessionContext ctx, final Product value)
	{
		EXCLUSIONPRODUCTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to exclusionProduct. 
	 * @param value the item to add to exclusionProduct
	 */
	public void addToExclusionProduct(final Product value)
	{
		addToExclusionProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from exclusionProduct. 
	 * @param value the item to remove from exclusionProduct
	 */
	public void removeFromExclusionProduct(final SessionContext ctx, final Product value)
	{
		EXCLUSIONPRODUCTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from exclusionProduct. 
	 * @param value the item to remove from exclusionProduct
	 */
	public void removeFromExclusionProduct(final Product value)
	{
		removeFromExclusionProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.inclusionProduct</code> attribute.
	 * @return the inclusionProduct
	 */
	public Set<Product> getInclusionProduct(final SessionContext ctx)
	{
		return (Set<Product>)INCLUSIONPRODUCTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.inclusionProduct</code> attribute.
	 * @return the inclusionProduct
	 */
	public Set<Product> getInclusionProduct()
	{
		return getInclusionProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.inclusionProduct</code> attribute. 
	 * @param value the inclusionProduct
	 */
	public void setInclusionProduct(final SessionContext ctx, final Set<Product> value)
	{
		INCLUSIONPRODUCTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.inclusionProduct</code> attribute. 
	 * @param value the inclusionProduct
	 */
	public void setInclusionProduct(final Set<Product> value)
	{
		setInclusionProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inclusionProduct. 
	 * @param value the item to add to inclusionProduct
	 */
	public void addToInclusionProduct(final SessionContext ctx, final Product value)
	{
		INCLUSIONPRODUCTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inclusionProduct. 
	 * @param value the item to add to inclusionProduct
	 */
	public void addToInclusionProduct(final Product value)
	{
		addToInclusionProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inclusionProduct. 
	 * @param value the item to remove from inclusionProduct
	 */
	public void removeFromInclusionProduct(final SessionContext ctx, final Product value)
	{
		INCLUSIONPRODUCTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inclusionProduct. 
	 * @param value the item to remove from inclusionProduct
	 */
	public void removeFromInclusionProduct(final Product value)
	{
		removeFromInclusionProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.priority</code> attribute.
	 * @return the priority - Booking Priority
	 */
	public EnumerationValue getPriority(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRIORITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.priority</code> attribute.
	 * @return the priority - Booking Priority
	 */
	public EnumerationValue getPriority()
	{
		return getPriority( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.priority</code> attribute. 
	 * @param value the priority - Booking Priority
	 */
	public void setPriority(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRIORITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.priority</code> attribute. 
	 * @param value the priority - Booking Priority
	 */
	public void setPriority(final EnumerationValue value)
	{
		setPriority( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.productSubCategory</code> attribute.
	 * @return the productSubCategory - Product SubCategory
	 */
	public ProductCategorySubType getProductSubCategory(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTSUBCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.productSubCategory</code> attribute.
	 * @return the productSubCategory - Product SubCategory
	 */
	public ProductCategorySubType getProductSubCategory()
	{
		return getProductSubCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.productSubCategory</code> attribute. 
	 * @param value the productSubCategory - Product SubCategory
	 */
	public void setProductSubCategory(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTSUBCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.productSubCategory</code> attribute. 
	 * @param value the productSubCategory - Product SubCategory
	 */
	public void setProductSubCategory(final ProductCategorySubType value)
	{
		setProductSubCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public Set<Supplier> getSuppliers(final SessionContext ctx)
	{
		return (Set<Supplier>)SUPPLIERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingConfiguration.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public Set<Supplier> getSuppliers()
	{
		return getSuppliers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final SessionContext ctx, final Set<Supplier> value)
	{
		SUPPLIERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingConfiguration.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final Set<Supplier> value)
	{
		setSuppliers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliers. 
	 * @param value the item to add to suppliers
	 */
	public void addToSuppliers(final SessionContext ctx, final Supplier value)
	{
		SUPPLIERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliers. 
	 * @param value the item to add to suppliers
	 */
	public void addToSuppliers(final Supplier value)
	{
		addToSuppliers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliers. 
	 * @param value the item to remove from suppliers
	 */
	public void removeFromSuppliers(final SessionContext ctx, final Supplier value)
	{
		SUPPLIERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliers. 
	 * @param value the item to remove from suppliers
	 */
	public void removeFromSuppliers(final Supplier value)
	{
		removeFromSuppliers( getSession().getSessionContext(), value );
	}
	
}
