/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.client.credit.jalo.SecuredCreditCardLimit;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.financials.jalo.Bank;
import de.hybris.platform.b2b.jalo.B2BCustomer;
import de.hybris.platform.b2b.jalo.B2BUnit;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.jalo.CreditCardDetail CreditCardDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCreditCardDetail extends GenericItem
{
	/** Qualifier of the <code>CreditCardDetail.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	/** Qualifier of the <code>CreditCardDetail.productCategorySubtype</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubtype";
	/** Qualifier of the <code>CreditCardDetail.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>CreditCardDetail.productNameSubtype</code> attribute **/
	public static final String PRODUCTNAMESUBTYPE = "productNameSubtype";
	/** Qualifier of the <code>CreditCardDetail.airlineType</code> attribute **/
	public static final String AIRLINETYPE = "airlineType";
	/** Qualifier of the <code>CreditCardDetail.continent</code> attribute **/
	public static final String CONTINENT = "continent";
	/** Qualifier of the <code>CreditCardDetail.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>CreditCardDetail.clientBranch</code> attribute **/
	public static final String CLIENTBRANCH = "clientBranch";
	/** Qualifier of the <code>CreditCardDetail.employee</code> attribute **/
	public static final String EMPLOYEE = "employee";
	/** Qualifier of the <code>CreditCardDetail.bank</code> attribute **/
	public static final String BANK = "bank";
	/** Qualifier of the <code>CreditCardDetail.cardNumber</code> attribute **/
	public static final String CARDNUMBER = "cardNumber";
	/** Qualifier of the <code>CreditCardDetail.cardHolderName</code> attribute **/
	public static final String CARDHOLDERNAME = "cardHolderName";
	/** Qualifier of the <code>CreditCardDetail.expiryDate</code> attribute **/
	public static final String EXPIRYDATE = "expiryDate";
	/** Qualifier of the <code>CreditCardDetail.thresholdIn</code> attribute **/
	public static final String THRESHOLDIN = "thresholdIn";
	/** Qualifier of the <code>CreditCardDetail.thresholdValue</code> attribute **/
	public static final String THRESHOLDVALUE = "thresholdValue";
	/** Qualifier of the <code>CreditCardDetail.creditLimit</code> attribute **/
	public static final String CREDITLIMIT = "creditLimit";
	/** Qualifier of the <code>CreditCardDetail.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>CreditCardDetail.securedCreditCardLimit</code> attribute **/
	public static final String SECUREDCREDITCARDLIMIT = "securedCreditCardLimit";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SECUREDCREDITCARDLIMIT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCreditCardDetail> SECUREDCREDITCARDLIMITHANDLER = new BidirectionalOneToManyHandler<GeneratedCreditCardDetail>(
	ClientcreditConstants.TC.CREDITCARDDETAIL,
	false,
	"securedCreditCardLimit",
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
		tmp.put(PRODUCTNAMESUBTYPE, AttributeMode.INITIAL);
		tmp.put(AIRLINETYPE, AttributeMode.INITIAL);
		tmp.put(CONTINENT, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CLIENTBRANCH, AttributeMode.INITIAL);
		tmp.put(EMPLOYEE, AttributeMode.INITIAL);
		tmp.put(BANK, AttributeMode.INITIAL);
		tmp.put(CARDNUMBER, AttributeMode.INITIAL);
		tmp.put(CARDHOLDERNAME, AttributeMode.INITIAL);
		tmp.put(EXPIRYDATE, AttributeMode.INITIAL);
		tmp.put(THRESHOLDIN, AttributeMode.INITIAL);
		tmp.put(THRESHOLDVALUE, AttributeMode.INITIAL);
		tmp.put(CREDITLIMIT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(SECUREDCREDITCARDLIMIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.airlineType</code> attribute.
	 * @return the airlineType
	 */
	public EnumerationValue getAirlineType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, AIRLINETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.airlineType</code> attribute.
	 * @return the airlineType
	 */
	public EnumerationValue getAirlineType()
	{
		return getAirlineType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.airlineType</code> attribute. 
	 * @param value the airlineType
	 */
	public void setAirlineType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, AIRLINETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.airlineType</code> attribute. 
	 * @param value the airlineType
	 */
	public void setAirlineType(final EnumerationValue value)
	{
		setAirlineType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.bank</code> attribute.
	 * @return the bank
	 */
	public Bank getBank(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, BANK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.bank</code> attribute.
	 * @return the bank
	 */
	public Bank getBank()
	{
		return getBank( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.bank</code> attribute. 
	 * @param value the bank
	 */
	public void setBank(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, BANK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.bank</code> attribute. 
	 * @param value the bank
	 */
	public void setBank(final Bank value)
	{
		setBank( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.cardHolderName</code> attribute.
	 * @return the cardHolderName
	 */
	public String getCardHolderName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDHOLDERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.cardHolderName</code> attribute.
	 * @return the cardHolderName
	 */
	public String getCardHolderName()
	{
		return getCardHolderName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.cardHolderName</code> attribute. 
	 * @param value the cardHolderName
	 */
	public void setCardHolderName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDHOLDERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.cardHolderName</code> attribute. 
	 * @param value the cardHolderName
	 */
	public void setCardHolderName(final String value)
	{
		setCardHolderName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.cardNumber</code> attribute.
	 * @return the cardNumber
	 */
	public String getCardNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.cardNumber</code> attribute.
	 * @return the cardNumber
	 */
	public String getCardNumber()
	{
		return getCardNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.cardNumber</code> attribute. 
	 * @param value the cardNumber
	 */
	public void setCardNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.cardNumber</code> attribute. 
	 * @param value the cardNumber
	 */
	public void setCardNumber(final String value)
	{
		setCardNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.clientBranch</code> attribute.
	 * @return the clientBranch
	 */
	public B2BUnit getClientBranch(final SessionContext ctx)
	{
		return (B2BUnit)getProperty( ctx, CLIENTBRANCH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.clientBranch</code> attribute.
	 * @return the clientBranch
	 */
	public B2BUnit getClientBranch()
	{
		return getClientBranch( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.clientBranch</code> attribute. 
	 * @param value the clientBranch
	 */
	public void setClientBranch(final SessionContext ctx, final B2BUnit value)
	{
		setProperty(ctx, CLIENTBRANCH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.clientBranch</code> attribute. 
	 * @param value the clientBranch
	 */
	public void setClientBranch(final B2BUnit value)
	{
		setClientBranch( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.continent</code> attribute.
	 * @return the continent
	 */
	public Continent getContinent(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, CONTINENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.continent</code> attribute.
	 * @return the continent
	 */
	public Continent getContinent()
	{
		return getContinent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.continent</code> attribute. 
	 * @param value the continent
	 */
	public void setContinent(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, CONTINENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.continent</code> attribute. 
	 * @param value the continent
	 */
	public void setContinent(final Continent value)
	{
		setContinent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SECUREDCREDITCARDLIMITHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.creditLimit</code> attribute.
	 * @return the creditLimit
	 */
	public Double getCreditLimit(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CREDITLIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.creditLimit</code> attribute.
	 * @return the creditLimit
	 */
	public Double getCreditLimit()
	{
		return getCreditLimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.creditLimit</code> attribute. 
	 * @return the creditLimit
	 */
	public double getCreditLimitAsPrimitive(final SessionContext ctx)
	{
		Double value = getCreditLimit( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.creditLimit</code> attribute. 
	 * @return the creditLimit
	 */
	public double getCreditLimitAsPrimitive()
	{
		return getCreditLimitAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CREDITLIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final Double value)
	{
		setCreditLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final SessionContext ctx, final double value)
	{
		setCreditLimit( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.creditLimit</code> attribute. 
	 * @param value the creditLimit
	 */
	public void setCreditLimit(final double value)
	{
		setCreditLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.employee</code> attribute.
	 * @return the employee
	 */
	public B2BCustomer getEmployee(final SessionContext ctx)
	{
		return (B2BCustomer)getProperty( ctx, EMPLOYEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.employee</code> attribute.
	 * @return the employee
	 */
	public B2BCustomer getEmployee()
	{
		return getEmployee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.employee</code> attribute. 
	 * @param value the employee
	 */
	public void setEmployee(final SessionContext ctx, final B2BCustomer value)
	{
		setProperty(ctx, EMPLOYEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.employee</code> attribute. 
	 * @param value the employee
	 */
	public void setEmployee(final B2BCustomer value)
	{
		setEmployee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.expiryDate</code> attribute.
	 * @return the expiryDate
	 */
	public Date getExpiryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EXPIRYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.expiryDate</code> attribute.
	 * @return the expiryDate
	 */
	public Date getExpiryDate()
	{
		return getExpiryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.expiryDate</code> attribute. 
	 * @param value the expiryDate
	 */
	public void setExpiryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EXPIRYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.expiryDate</code> attribute. 
	 * @param value the expiryDate
	 */
	public void setExpiryDate(final Date value)
	{
		setExpiryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Category getProductCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, PRODUCTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Category getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final Category value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.productCategorySubtype</code> attribute.
	 * @return the productCategorySubtype
	 */
	public ProductCategorySubType getProductCategorySubtype(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.productCategorySubtype</code> attribute.
	 * @return the productCategorySubtype
	 */
	public ProductCategorySubType getProductCategorySubtype()
	{
		return getProductCategorySubtype( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.productCategorySubtype</code> attribute. 
	 * @param value the productCategorySubtype
	 */
	public void setProductCategorySubtype(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.productCategorySubtype</code> attribute. 
	 * @param value the productCategorySubtype
	 */
	public void setProductCategorySubtype(final ProductCategorySubType value)
	{
		setProductCategorySubtype( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.productNameSubtype</code> attribute.
	 * @return the productNameSubtype
	 */
	public VariantProduct getProductNameSubtype(final SessionContext ctx)
	{
		return (VariantProduct)getProperty( ctx, PRODUCTNAMESUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.productNameSubtype</code> attribute.
	 * @return the productNameSubtype
	 */
	public VariantProduct getProductNameSubtype()
	{
		return getProductNameSubtype( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.productNameSubtype</code> attribute. 
	 * @param value the productNameSubtype
	 */
	public void setProductNameSubtype(final SessionContext ctx, final VariantProduct value)
	{
		setProperty(ctx, PRODUCTNAMESUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.productNameSubtype</code> attribute. 
	 * @param value the productNameSubtype
	 */
	public void setProductNameSubtype(final VariantProduct value)
	{
		setProductNameSubtype( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.securedCreditCardLimit</code> attribute.
	 * @return the securedCreditCardLimit
	 */
	public SecuredCreditCardLimit getSecuredCreditCardLimit(final SessionContext ctx)
	{
		return (SecuredCreditCardLimit)getProperty( ctx, SECUREDCREDITCARDLIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.securedCreditCardLimit</code> attribute.
	 * @return the securedCreditCardLimit
	 */
	public SecuredCreditCardLimit getSecuredCreditCardLimit()
	{
		return getSecuredCreditCardLimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.securedCreditCardLimit</code> attribute. 
	 * @param value the securedCreditCardLimit
	 */
	public void setSecuredCreditCardLimit(final SessionContext ctx, final SecuredCreditCardLimit value)
	{
		SECUREDCREDITCARDLIMITHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.securedCreditCardLimit</code> attribute. 
	 * @param value the securedCreditCardLimit
	 */
	public void setSecuredCreditCardLimit(final SecuredCreditCardLimit value)
	{
		setSecuredCreditCardLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.thresholdIn</code> attribute.
	 * @return the thresholdIn
	 */
	public EnumerationValue getThresholdIn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, THRESHOLDIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.thresholdIn</code> attribute.
	 * @return the thresholdIn
	 */
	public EnumerationValue getThresholdIn()
	{
		return getThresholdIn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.thresholdIn</code> attribute. 
	 * @param value the thresholdIn
	 */
	public void setThresholdIn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, THRESHOLDIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.thresholdIn</code> attribute. 
	 * @param value the thresholdIn
	 */
	public void setThresholdIn(final EnumerationValue value)
	{
		setThresholdIn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.thresholdValue</code> attribute.
	 * @return the thresholdValue
	 */
	public Double getThresholdValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, THRESHOLDVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.thresholdValue</code> attribute.
	 * @return the thresholdValue
	 */
	public Double getThresholdValue()
	{
		return getThresholdValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.thresholdValue</code> attribute. 
	 * @return the thresholdValue
	 */
	public double getThresholdValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getThresholdValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardDetail.thresholdValue</code> attribute. 
	 * @return the thresholdValue
	 */
	public double getThresholdValueAsPrimitive()
	{
		return getThresholdValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, THRESHOLDVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final Double value)
	{
		setThresholdValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final SessionContext ctx, final double value)
	{
		setThresholdValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardDetail.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final double value)
	{
		setThresholdValue( getSession().getSessionContext(), value );
	}
	
}
