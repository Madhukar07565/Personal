/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.jalo.PaidProductRanking;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.product.common.core.jalo.AccommodationBrand;
import com.cnk.travelogix.product.common.core.jalo.AccommodationChain;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.jalo.ClientPaidProductDetail ClientPaidProductDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientPaidProductDetail extends GenericItem
{
	/** Qualifier of the <code>ClientPaidProductDetail.productDetailsId</code> attribute **/
	public static final String PRODUCTDETAILSID = "productDetailsId";
	/** Qualifier of the <code>ClientPaidProductDetail.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>ClientPaidProductDetail.productCategorySubtype</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubtype";
	/** Qualifier of the <code>ClientPaidProductDetail.continent</code> attribute **/
	public static final String CONTINENT = "continent";
	/** Qualifier of the <code>ClientPaidProductDetail.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>ClientPaidProductDetail.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>ClientPaidProductDetail.chain</code> attribute **/
	public static final String CHAIN = "chain";
	/** Qualifier of the <code>ClientPaidProductDetail.brand</code> attribute **/
	public static final String BRAND = "brand";
	/** Qualifier of the <code>ClientPaidProductDetail.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>ClientPaidProductDetail.variantProduct</code> attribute **/
	public static final String VARIANTPRODUCT = "variantProduct";
	/** Qualifier of the <code>ClientPaidProductDetail.rankingOrder</code> attribute **/
	public static final String RANKINGORDER = "rankingOrder";
	/** Qualifier of the <code>ClientPaidProductDetail.paidProductRanking</code> attribute **/
	public static final String PAIDPRODUCTRANKING = "paidProductRanking";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PAIDPRODUCTRANKING's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedClientPaidProductDetail> PAIDPRODUCTRANKINGHANDLER = new BidirectionalOneToManyHandler<GeneratedClientPaidProductDetail>(
	ClientcoreConstants.TC.CLIENTPAIDPRODUCTDETAIL,
	false,
	"paidProductRanking",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCTDETAILSID, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(CONTINENT, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(CHAIN, AttributeMode.INITIAL);
		tmp.put(BRAND, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(VARIANTPRODUCT, AttributeMode.INITIAL);
		tmp.put(RANKINGORDER, AttributeMode.INITIAL);
		tmp.put(PAIDPRODUCTRANKING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.brand</code> attribute.
	 * @return the brand
	 */
	public AccommodationBrand getBrand(final SessionContext ctx)
	{
		return (AccommodationBrand)getProperty( ctx, BRAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.brand</code> attribute.
	 * @return the brand
	 */
	public AccommodationBrand getBrand()
	{
		return getBrand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.brand</code> attribute. 
	 * @param value the brand
	 */
	public void setBrand(final SessionContext ctx, final AccommodationBrand value)
	{
		setProperty(ctx, BRAND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.brand</code> attribute. 
	 * @param value the brand
	 */
	public void setBrand(final AccommodationBrand value)
	{
		setBrand( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final Category value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.chain</code> attribute.
	 * @return the chain
	 */
	public AccommodationChain getChain(final SessionContext ctx)
	{
		return (AccommodationChain)getProperty( ctx, CHAIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.chain</code> attribute.
	 * @return the chain
	 */
	public AccommodationChain getChain()
	{
		return getChain( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.chain</code> attribute. 
	 * @param value the chain
	 */
	public void setChain(final SessionContext ctx, final AccommodationChain value)
	{
		setProperty(ctx, CHAIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.chain</code> attribute. 
	 * @param value the chain
	 */
	public void setChain(final AccommodationChain value)
	{
		setChain( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.city</code> attribute.
	 * @return the city
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.city</code> attribute.
	 * @return the city
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.continent</code> attribute.
	 * @return the continent
	 */
	public Continent getContinent(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, CONTINENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.continent</code> attribute.
	 * @return the continent
	 */
	public Continent getContinent()
	{
		return getContinent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.continent</code> attribute. 
	 * @param value the continent
	 */
	public void setContinent(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, CONTINENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.continent</code> attribute. 
	 * @param value the continent
	 */
	public void setContinent(final Continent value)
	{
		setContinent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PAIDPRODUCTRANKINGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.paidProductRanking</code> attribute.
	 * @return the paidProductRanking
	 */
	public PaidProductRanking getPaidProductRanking(final SessionContext ctx)
	{
		return (PaidProductRanking)getProperty( ctx, PAIDPRODUCTRANKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.paidProductRanking</code> attribute.
	 * @return the paidProductRanking
	 */
	public PaidProductRanking getPaidProductRanking()
	{
		return getPaidProductRanking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.paidProductRanking</code> attribute. 
	 * @param value the paidProductRanking
	 */
	public void setPaidProductRanking(final SessionContext ctx, final PaidProductRanking value)
	{
		PAIDPRODUCTRANKINGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.paidProductRanking</code> attribute. 
	 * @param value the paidProductRanking
	 */
	public void setPaidProductRanking(final PaidProductRanking value)
	{
		setPaidProductRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.productCategorySubtype</code> attribute.
	 * @return the productCategorySubtype
	 */
	public ProductCategorySubType getProductCategorySubtype(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.productCategorySubtype</code> attribute.
	 * @return the productCategorySubtype
	 */
	public ProductCategorySubType getProductCategorySubtype()
	{
		return getProductCategorySubtype( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.productCategorySubtype</code> attribute. 
	 * @param value the productCategorySubtype
	 */
	public void setProductCategorySubtype(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.productCategorySubtype</code> attribute. 
	 * @param value the productCategorySubtype
	 */
	public void setProductCategorySubtype(final ProductCategorySubType value)
	{
		setProductCategorySubtype( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.productDetailsId</code> attribute.
	 * @return the productDetailsId
	 */
	public String getProductDetailsId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTDETAILSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.productDetailsId</code> attribute.
	 * @return the productDetailsId
	 */
	public String getProductDetailsId()
	{
		return getProductDetailsId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.productDetailsId</code> attribute. 
	 * @param value the productDetailsId
	 */
	public void setProductDetailsId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTDETAILSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.productDetailsId</code> attribute. 
	 * @param value the productDetailsId
	 */
	public void setProductDetailsId(final String value)
	{
		setProductDetailsId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.rankingOrder</code> attribute.
	 * @return the rankingOrder
	 */
	public Integer getRankingOrder(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RANKINGORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.rankingOrder</code> attribute.
	 * @return the rankingOrder
	 */
	public Integer getRankingOrder()
	{
		return getRankingOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.rankingOrder</code> attribute. 
	 * @return the rankingOrder
	 */
	public int getRankingOrderAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRankingOrder( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.rankingOrder</code> attribute. 
	 * @return the rankingOrder
	 */
	public int getRankingOrderAsPrimitive()
	{
		return getRankingOrderAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.rankingOrder</code> attribute. 
	 * @param value the rankingOrder
	 */
	public void setRankingOrder(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RANKINGORDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.rankingOrder</code> attribute. 
	 * @param value the rankingOrder
	 */
	public void setRankingOrder(final Integer value)
	{
		setRankingOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.rankingOrder</code> attribute. 
	 * @param value the rankingOrder
	 */
	public void setRankingOrder(final SessionContext ctx, final int value)
	{
		setRankingOrder( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.rankingOrder</code> attribute. 
	 * @param value the rankingOrder
	 */
	public void setRankingOrder(final int value)
	{
		setRankingOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.variantProduct</code> attribute.
	 * @return the variantProduct
	 */
	public VariantProduct getVariantProduct(final SessionContext ctx)
	{
		return (VariantProduct)getProperty( ctx, VARIANTPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidProductDetail.variantProduct</code> attribute.
	 * @return the variantProduct
	 */
	public VariantProduct getVariantProduct()
	{
		return getVariantProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.variantProduct</code> attribute. 
	 * @param value the variantProduct
	 */
	public void setVariantProduct(final SessionContext ctx, final VariantProduct value)
	{
		setProperty(ctx, VARIANTPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidProductDetail.variantProduct</code> attribute. 
	 * @param value the variantProduct
	 */
	public void setVariantProduct(final VariantProduct value)
	{
		setVariantProduct( getSession().getSessionContext(), value );
	}
	
}
