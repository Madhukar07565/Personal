/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.settlementterms.jalo;

import com.cnk.travelogix.supplier.settlementterms.core.constants.SuppliersettlementtermscoreConstants;
import com.cnk.travelogix.supplier.settlementterms.jalo.CreditCommSettlement;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.settlementterms.jalo.CountryCreditLimit CountryCreditLimit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCountryCreditLimit extends GenericItem
{
	/** Qualifier of the <code>CountryCreditLimit.isCreditLimitByCountry</code> attribute **/
	public static final String ISCREDITLIMITBYCOUNTRY = "isCreditLimitByCountry";
	/** Qualifier of the <code>CountryCreditLimit.creditLimitType</code> attribute **/
	public static final String CREDITLIMITTYPE = "creditLimitType";
	/** Qualifier of the <code>CountryCreditLimit.creditLimitAmount</code> attribute **/
	public static final String CREDITLIMITAMOUNT = "creditLimitAmount";
	/** Qualifier of the <code>CountryCreditLimit.thresholdType</code> attribute **/
	public static final String THRESHOLDTYPE = "thresholdType";
	/** Qualifier of the <code>CountryCreditLimit.thresholdValue</code> attribute **/
	public static final String THRESHOLDVALUE = "thresholdValue";
	/** Qualifier of the <code>CountryCreditLimit.countryList</code> attribute **/
	public static final String COUNTRYLIST = "countryList";
	/** Qualifier of the <code>CountryCreditLimit.creditCommSettlement</code> attribute **/
	public static final String CREDITCOMMSETTLEMENT = "creditCommSettlement";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CREDITCOMMSETTLEMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCountryCreditLimit> CREDITCOMMSETTLEMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedCountryCreditLimit>(
	SuppliersettlementtermscoreConstants.TC.COUNTRYCREDITLIMIT,
	false,
	"creditCommSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ISCREDITLIMITBYCOUNTRY, AttributeMode.INITIAL);
		tmp.put(CREDITLIMITTYPE, AttributeMode.INITIAL);
		tmp.put(CREDITLIMITAMOUNT, AttributeMode.INITIAL);
		tmp.put(THRESHOLDTYPE, AttributeMode.INITIAL);
		tmp.put(THRESHOLDVALUE, AttributeMode.INITIAL);
		tmp.put(COUNTRYLIST, AttributeMode.INITIAL);
		tmp.put(CREDITCOMMSETTLEMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.countryList</code> attribute.
	 * @return the countryList
	 */
	public Collection<Country> getCountryList(final SessionContext ctx)
	{
		Collection<Country> coll = (Collection<Country>)getProperty( ctx, COUNTRYLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.countryList</code> attribute.
	 * @return the countryList
	 */
	public Collection<Country> getCountryList()
	{
		return getCountryList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.countryList</code> attribute. 
	 * @param value the countryList
	 */
	public void setCountryList(final SessionContext ctx, final Collection<Country> value)
	{
		setProperty(ctx, COUNTRYLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.countryList</code> attribute. 
	 * @param value the countryList
	 */
	public void setCountryList(final Collection<Country> value)
	{
		setCountryList( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CREDITCOMMSETTLEMENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.creditCommSettlement</code> attribute.
	 * @return the creditCommSettlement
	 */
	public CreditCommSettlement getCreditCommSettlement(final SessionContext ctx)
	{
		return (CreditCommSettlement)getProperty( ctx, CREDITCOMMSETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.creditCommSettlement</code> attribute.
	 * @return the creditCommSettlement
	 */
	public CreditCommSettlement getCreditCommSettlement()
	{
		return getCreditCommSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.creditCommSettlement</code> attribute. 
	 * @param value the creditCommSettlement
	 */
	public void setCreditCommSettlement(final SessionContext ctx, final CreditCommSettlement value)
	{
		CREDITCOMMSETTLEMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.creditCommSettlement</code> attribute. 
	 * @param value the creditCommSettlement
	 */
	public void setCreditCommSettlement(final CreditCommSettlement value)
	{
		setCreditCommSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.creditLimitAmount</code> attribute.
	 * @return the creditLimitAmount
	 */
	public Double getCreditLimitAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CREDITLIMITAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.creditLimitAmount</code> attribute.
	 * @return the creditLimitAmount
	 */
	public Double getCreditLimitAmount()
	{
		return getCreditLimitAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.creditLimitAmount</code> attribute. 
	 * @return the creditLimitAmount
	 */
	public double getCreditLimitAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getCreditLimitAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.creditLimitAmount</code> attribute. 
	 * @return the creditLimitAmount
	 */
	public double getCreditLimitAmountAsPrimitive()
	{
		return getCreditLimitAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.creditLimitAmount</code> attribute. 
	 * @param value the creditLimitAmount
	 */
	public void setCreditLimitAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CREDITLIMITAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.creditLimitAmount</code> attribute. 
	 * @param value the creditLimitAmount
	 */
	public void setCreditLimitAmount(final Double value)
	{
		setCreditLimitAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.creditLimitAmount</code> attribute. 
	 * @param value the creditLimitAmount
	 */
	public void setCreditLimitAmount(final SessionContext ctx, final double value)
	{
		setCreditLimitAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.creditLimitAmount</code> attribute. 
	 * @param value the creditLimitAmount
	 */
	public void setCreditLimitAmount(final double value)
	{
		setCreditLimitAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.creditLimitType</code> attribute.
	 * @return the creditLimitType
	 */
	public EnumerationValue getCreditLimitType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CREDITLIMITTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.creditLimitType</code> attribute.
	 * @return the creditLimitType
	 */
	public EnumerationValue getCreditLimitType()
	{
		return getCreditLimitType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.creditLimitType</code> attribute. 
	 * @param value the creditLimitType
	 */
	public void setCreditLimitType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CREDITLIMITTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.creditLimitType</code> attribute. 
	 * @param value the creditLimitType
	 */
	public void setCreditLimitType(final EnumerationValue value)
	{
		setCreditLimitType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.isCreditLimitByCountry</code> attribute.
	 * @return the isCreditLimitByCountry
	 */
	public Boolean isIsCreditLimitByCountry(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISCREDITLIMITBYCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.isCreditLimitByCountry</code> attribute.
	 * @return the isCreditLimitByCountry
	 */
	public Boolean isIsCreditLimitByCountry()
	{
		return isIsCreditLimitByCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.isCreditLimitByCountry</code> attribute. 
	 * @return the isCreditLimitByCountry
	 */
	public boolean isIsCreditLimitByCountryAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsCreditLimitByCountry( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.isCreditLimitByCountry</code> attribute. 
	 * @return the isCreditLimitByCountry
	 */
	public boolean isIsCreditLimitByCountryAsPrimitive()
	{
		return isIsCreditLimitByCountryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.isCreditLimitByCountry</code> attribute. 
	 * @param value the isCreditLimitByCountry
	 */
	public void setIsCreditLimitByCountry(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISCREDITLIMITBYCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.isCreditLimitByCountry</code> attribute. 
	 * @param value the isCreditLimitByCountry
	 */
	public void setIsCreditLimitByCountry(final Boolean value)
	{
		setIsCreditLimitByCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.isCreditLimitByCountry</code> attribute. 
	 * @param value the isCreditLimitByCountry
	 */
	public void setIsCreditLimitByCountry(final SessionContext ctx, final boolean value)
	{
		setIsCreditLimitByCountry( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.isCreditLimitByCountry</code> attribute. 
	 * @param value the isCreditLimitByCountry
	 */
	public void setIsCreditLimitByCountry(final boolean value)
	{
		setIsCreditLimitByCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.thresholdType</code> attribute.
	 * @return the thresholdType
	 */
	public EnumerationValue getThresholdType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, THRESHOLDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.thresholdType</code> attribute.
	 * @return the thresholdType
	 */
	public EnumerationValue getThresholdType()
	{
		return getThresholdType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.thresholdType</code> attribute. 
	 * @param value the thresholdType
	 */
	public void setThresholdType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, THRESHOLDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.thresholdType</code> attribute. 
	 * @param value the thresholdType
	 */
	public void setThresholdType(final EnumerationValue value)
	{
		setThresholdType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.thresholdValue</code> attribute.
	 * @return the thresholdValue
	 */
	public Double getThresholdValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, THRESHOLDVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.thresholdValue</code> attribute.
	 * @return the thresholdValue
	 */
	public Double getThresholdValue()
	{
		return getThresholdValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.thresholdValue</code> attribute. 
	 * @return the thresholdValue
	 */
	public double getThresholdValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getThresholdValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CountryCreditLimit.thresholdValue</code> attribute. 
	 * @return the thresholdValue
	 */
	public double getThresholdValueAsPrimitive()
	{
		return getThresholdValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, THRESHOLDVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final Double value)
	{
		setThresholdValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final SessionContext ctx, final double value)
	{
		setThresholdValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CountryCreditLimit.thresholdValue</code> attribute. 
	 * @param value the thresholdValue
	 */
	public void setThresholdValue(final double value)
	{
		setThresholdValue( getSession().getSessionContext(), value );
	}
	
}
