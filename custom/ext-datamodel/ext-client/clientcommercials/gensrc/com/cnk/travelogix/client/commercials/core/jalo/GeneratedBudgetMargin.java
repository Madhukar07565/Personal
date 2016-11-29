/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.client.commercials.core.jalo.ClientCompanyCommercialDetail;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.commercials.core.jalo.BudgetMargin BudgetMargin}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBudgetMargin extends GenericItem
{
	/** Qualifier of the <code>BudgetMargin.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>BudgetMargin.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>BudgetMargin.percentageOrAmt</code> attribute **/
	public static final String PERCENTAGEORAMT = "percentageOrAmt";
	/** Qualifier of the <code>BudgetMargin.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>BudgetMargin.percentageOramountValue</code> attribute **/
	public static final String PERCENTAGEORAMOUNTVALUE = "percentageOramountValue";
	/** Qualifier of the <code>BudgetMargin.catalogVersion</code> attribute **/
	public static final String CATALOGVERSION = "catalogVersion";
	/** Qualifier of the <code>BudgetMargin.market</code> attribute **/
	public static final String MARKET = "market";
	/** Qualifier of the <code>BudgetMargin.commercials</code> attribute **/
	public static final String COMMERCIALS = "commercials";
	/** Qualifier of the <code>BudgetMargin.client</code> attribute **/
	public static final String CLIENT = "client";
	/**
	* {@link OneToManyHandler} for handling 1:n COMMERCIALS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ClientCompanyCommercialDetail> COMMERCIALSHANDLER = new OneToManyHandler<ClientCompanyCommercialDetail>(
	ClientcommercialsConstants.TC.CLIENTCOMPANYCOMMERCIALDETAIL,
	false,
	"budgetMargin",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBudgetMargin> CLIENTHANDLER = new BidirectionalOneToManyHandler<GeneratedBudgetMargin>(
	ClientcommercialsConstants.TC.BUDGETMARGIN,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(PERCENTAGEORAMT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(PERCENTAGEORAMOUNTVALUE, AttributeMode.INITIAL);
		tmp.put(CATALOGVERSION, AttributeMode.INITIAL);
		tmp.put(MARKET, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.catalogVersion</code> attribute.
	 * @return the catalogVersion
	 */
	public CatalogVersion getCatalogVersion(final SessionContext ctx)
	{
		return (CatalogVersion)getProperty( ctx, CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.catalogVersion</code> attribute.
	 * @return the catalogVersion
	 */
	public CatalogVersion getCatalogVersion()
	{
		return getCatalogVersion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.catalogVersion</code> attribute. 
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final SessionContext ctx, final CatalogVersion value)
	{
		setProperty(ctx, CATALOGVERSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.catalogVersion</code> attribute. 
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final CatalogVersion value)
	{
		setCatalogVersion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final Category value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final Principal value)
	{
		CLIENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final Principal value)
	{
		setClient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.commercials</code> attribute.
	 * @return the commercials
	 */
	public Collection<ClientCompanyCommercialDetail> getCommercials(final SessionContext ctx)
	{
		return COMMERCIALSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.commercials</code> attribute.
	 * @return the commercials
	 */
	public Collection<ClientCompanyCommercialDetail> getCommercials()
	{
		return getCommercials( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.commercials</code> attribute. 
	 * @param value the commercials
	 */
	public void setCommercials(final SessionContext ctx, final Collection<ClientCompanyCommercialDetail> value)
	{
		COMMERCIALSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.commercials</code> attribute. 
	 * @param value the commercials
	 */
	public void setCommercials(final Collection<ClientCompanyCommercialDetail> value)
	{
		setCommercials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commercials. 
	 * @param value the item to add to commercials
	 */
	public void addToCommercials(final SessionContext ctx, final ClientCompanyCommercialDetail value)
	{
		COMMERCIALSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commercials. 
	 * @param value the item to add to commercials
	 */
	public void addToCommercials(final ClientCompanyCommercialDetail value)
	{
		addToCommercials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commercials. 
	 * @param value the item to remove from commercials
	 */
	public void removeFromCommercials(final SessionContext ctx, final ClientCompanyCommercialDetail value)
	{
		COMMERCIALSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commercials. 
	 * @param value the item to remove from commercials
	 */
	public void removeFromCommercials(final ClientCompanyCommercialDetail value)
	{
		removeFromCommercials( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CLIENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.market</code> attribute.
	 * @return the market - Market
	 */
	public Market getMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, MARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.market</code> attribute.
	 * @return the market - Market
	 */
	public Market getMarket()
	{
		return getMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.market</code> attribute. 
	 * @param value the market - Market
	 */
	public void setMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, MARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.market</code> attribute. 
	 * @param value the market - Market
	 */
	public void setMarket(final Market value)
	{
		setMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.percentageOramountValue</code> attribute.
	 * @return the percentageOramountValue
	 */
	public BigDecimal getPercentageOramountValue(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, PERCENTAGEORAMOUNTVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.percentageOramountValue</code> attribute.
	 * @return the percentageOramountValue
	 */
	public BigDecimal getPercentageOramountValue()
	{
		return getPercentageOramountValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.percentageOramountValue</code> attribute. 
	 * @param value the percentageOramountValue
	 */
	public void setPercentageOramountValue(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, PERCENTAGEORAMOUNTVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.percentageOramountValue</code> attribute. 
	 * @param value the percentageOramountValue
	 */
	public void setPercentageOramountValue(final BigDecimal value)
	{
		setPercentageOramountValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.percentageOrAmt</code> attribute.
	 * @return the percentageOrAmt
	 */
	public Boolean isPercentageOrAmt(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERCENTAGEORAMT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.percentageOrAmt</code> attribute.
	 * @return the percentageOrAmt
	 */
	public Boolean isPercentageOrAmt()
	{
		return isPercentageOrAmt( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.percentageOrAmt</code> attribute. 
	 * @return the percentageOrAmt
	 */
	public boolean isPercentageOrAmtAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPercentageOrAmt( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.percentageOrAmt</code> attribute. 
	 * @return the percentageOrAmt
	 */
	public boolean isPercentageOrAmtAsPrimitive()
	{
		return isPercentageOrAmtAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.percentageOrAmt</code> attribute. 
	 * @param value the percentageOrAmt
	 */
	public void setPercentageOrAmt(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERCENTAGEORAMT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.percentageOrAmt</code> attribute. 
	 * @param value the percentageOrAmt
	 */
	public void setPercentageOrAmt(final Boolean value)
	{
		setPercentageOrAmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.percentageOrAmt</code> attribute. 
	 * @param value the percentageOrAmt
	 */
	public void setPercentageOrAmt(final SessionContext ctx, final boolean value)
	{
		setPercentageOrAmt( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.percentageOrAmt</code> attribute. 
	 * @param value the percentageOrAmt
	 */
	public void setPercentageOrAmt(final boolean value)
	{
		setPercentageOrAmt( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BudgetMargin.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BudgetMargin.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
}
