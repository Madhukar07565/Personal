/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.Competitor;
import com.cnk.travelogix.presales.jalo.Partner;
import com.cnk.travelogix.supplier.commercials.core.jalo.FixedCommercialValue;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.CommercialTerms CommercialTerms}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommercialTerms extends GenericItem
{
	/** Qualifier of the <code>CommercialTerms.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	/** Qualifier of the <code>CommercialTerms.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>CommercialTerms.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>CommercialTerms.commercialHead</code> attribute **/
	public static final String COMMERCIALHEAD = "commercialHead";
	/** Qualifier of the <code>CommercialTerms.commercialType</code> attribute **/
	public static final String COMMERCIALTYPE = "commercialType";
	/** Qualifier of the <code>CommercialTerms.commercialValue</code> attribute **/
	public static final String COMMERCIALVALUE = "commercialValue";
	/** Qualifier of the <code>CommercialTerms.competitor</code> attribute **/
	public static final String COMPETITOR = "competitor";
	/** Qualifier of the <code>CommercialTerms.partner</code> attribute **/
	public static final String PARTNER = "partner";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMPETITOR's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCommercialTerms> COMPETITORHANDLER = new BidirectionalOneToManyHandler<GeneratedCommercialTerms>(
	PresalescoreConstants.TC.COMMERCIALTERMS,
	false,
	"competitor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PARTNER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCommercialTerms> PARTNERHANDLER = new BidirectionalOneToManyHandler<GeneratedCommercialTerms>(
	PresalescoreConstants.TC.COMMERCIALTERMS,
	false,
	"partner",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCTCATEGORY, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(COMMERCIALHEAD, AttributeMode.INITIAL);
		tmp.put(COMMERCIALTYPE, AttributeMode.INITIAL);
		tmp.put(COMMERCIALVALUE, AttributeMode.INITIAL);
		tmp.put(COMPETITOR, AttributeMode.INITIAL);
		tmp.put(PARTNER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.commercialHead</code> attribute.
	 * @return the commercialHead - CommercialHead of Commercial Terms
	 */
	public EnumerationValue getCommercialHead(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMERCIALHEAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.commercialHead</code> attribute.
	 * @return the commercialHead - CommercialHead of Commercial Terms
	 */
	public EnumerationValue getCommercialHead()
	{
		return getCommercialHead( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.commercialHead</code> attribute. 
	 * @param value the commercialHead - CommercialHead of Commercial Terms
	 */
	public void setCommercialHead(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMERCIALHEAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.commercialHead</code> attribute. 
	 * @param value the commercialHead - CommercialHead of Commercial Terms
	 */
	public void setCommercialHead(final EnumerationValue value)
	{
		setCommercialHead( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.commercialType</code> attribute.
	 * @return the commercialType - CommercialType for CommercialTerms
	 */
	public EnumerationValue getCommercialType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMERCIALTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.commercialType</code> attribute.
	 * @return the commercialType - CommercialType for CommercialTerms
	 */
	public EnumerationValue getCommercialType()
	{
		return getCommercialType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.commercialType</code> attribute. 
	 * @param value the commercialType - CommercialType for CommercialTerms
	 */
	public void setCommercialType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMERCIALTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.commercialType</code> attribute. 
	 * @param value the commercialType - CommercialType for CommercialTerms
	 */
	public void setCommercialType(final EnumerationValue value)
	{
		setCommercialType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.commercialValue</code> attribute.
	 * @return the commercialValue - Commercial Value details
	 */
	public FixedCommercialValue getCommercialValue(final SessionContext ctx)
	{
		return (FixedCommercialValue)getProperty( ctx, COMMERCIALVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.commercialValue</code> attribute.
	 * @return the commercialValue - Commercial Value details
	 */
	public FixedCommercialValue getCommercialValue()
	{
		return getCommercialValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.commercialValue</code> attribute. 
	 * @param value the commercialValue - Commercial Value details
	 */
	public void setCommercialValue(final SessionContext ctx, final FixedCommercialValue value)
	{
		setProperty(ctx, COMMERCIALVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.commercialValue</code> attribute. 
	 * @param value the commercialValue - Commercial Value details
	 */
	public void setCommercialValue(final FixedCommercialValue value)
	{
		setCommercialValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.competitor</code> attribute.
	 * @return the competitor
	 */
	public Competitor getCompetitor(final SessionContext ctx)
	{
		return (Competitor)getProperty( ctx, COMPETITOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.competitor</code> attribute.
	 * @return the competitor
	 */
	public Competitor getCompetitor()
	{
		return getCompetitor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.competitor</code> attribute. 
	 * @param value the competitor
	 */
	public void setCompetitor(final SessionContext ctx, final Competitor value)
	{
		COMPETITORHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.competitor</code> attribute. 
	 * @param value the competitor
	 */
	public void setCompetitor(final Competitor value)
	{
		setCompetitor( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMPETITORHANDLER.newInstance(ctx, allAttributes);
		PARTNERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.partner</code> attribute.
	 * @return the partner
	 */
	public Partner getPartner(final SessionContext ctx)
	{
		return (Partner)getProperty( ctx, PARTNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.partner</code> attribute.
	 * @return the partner
	 */
	public Partner getPartner()
	{
		return getPartner( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.partner</code> attribute. 
	 * @param value the partner
	 */
	public void setPartner(final SessionContext ctx, final Partner value)
	{
		PARTNERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.partner</code> attribute. 
	 * @param value the partner
	 */
	public void setPartner(final Partner value)
	{
		setPartner( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.product</code> attribute.
	 * @return the product - Product or service
	 */
	public EnumerationValue getProduct(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.product</code> attribute.
	 * @return the product - Product or service
	 */
	public EnumerationValue getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.product</code> attribute. 
	 * @param value the product - Product or service
	 */
	public void setProduct(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.product</code> attribute. 
	 * @param value the product - Product or service
	 */
	public void setProduct(final EnumerationValue value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.productCategory</code> attribute.
	 * @return the productCategory - Product Category
	 */
	public Category getProductCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, PRODUCTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.productCategory</code> attribute.
	 * @return the productCategory - Product Category
	 */
	public Category getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.productCategory</code> attribute. 
	 * @param value the productCategory - Product Category
	 */
	public void setProductCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.productCategory</code> attribute. 
	 * @param value the productCategory - Product Category
	 */
	public void setProductCategory(final Category value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.productCategorySubType</code> attribute.
	 * @return the productCategorySubType - Product Category SubType
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialTerms.productCategorySubType</code> attribute.
	 * @return the productCategorySubType - Product Category SubType
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType - Product Category SubType
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialTerms.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType - Product Category SubType
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
}
