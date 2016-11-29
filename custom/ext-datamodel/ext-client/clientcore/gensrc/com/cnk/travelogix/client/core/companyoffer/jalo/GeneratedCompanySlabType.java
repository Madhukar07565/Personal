/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.companyoffer.jalo.AbstractOfferValue;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.CompanySlabType CompanySlabType}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanySlabType extends AbstractOfferValue
{
	/** Qualifier of the <code>CompanySlabType.slabType</code> attribute **/
	public static final String SLABTYPE = "slabType";
	/** Qualifier of the <code>CompanySlabType.fromValueInWords</code> attribute **/
	public static final String FROMVALUEINWORDS = "fromValueInWords";
	/** Qualifier of the <code>CompanySlabType.toValuesInWords</code> attribute **/
	public static final String TOVALUESINWORDS = "toValuesInWords";
	/** Qualifier of the <code>CompanySlabType.fromValue</code> attribute **/
	public static final String FROMVALUE = "fromValue";
	/** Qualifier of the <code>CompanySlabType.toValues</code> attribute **/
	public static final String TOVALUES = "toValues";
	/** Qualifier of the <code>CompanySlabType.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractOfferValue.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SLABTYPE, AttributeMode.INITIAL);
		tmp.put(FROMVALUEINWORDS, AttributeMode.INITIAL);
		tmp.put(TOVALUESINWORDS, AttributeMode.INITIAL);
		tmp.put(FROMVALUE, AttributeMode.INITIAL);
		tmp.put(TOVALUES, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.fromValue</code> attribute.
	 * @return the fromValue
	 */
	public Integer getFromValue(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FROMVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.fromValue</code> attribute.
	 * @return the fromValue
	 */
	public Integer getFromValue()
	{
		return getFromValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.fromValue</code> attribute. 
	 * @return the fromValue
	 */
	public int getFromValueAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFromValue( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.fromValue</code> attribute. 
	 * @return the fromValue
	 */
	public int getFromValueAsPrimitive()
	{
		return getFromValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.fromValue</code> attribute. 
	 * @param value the fromValue
	 */
	public void setFromValue(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FROMVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.fromValue</code> attribute. 
	 * @param value the fromValue
	 */
	public void setFromValue(final Integer value)
	{
		setFromValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.fromValue</code> attribute. 
	 * @param value the fromValue
	 */
	public void setFromValue(final SessionContext ctx, final int value)
	{
		setFromValue( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.fromValue</code> attribute. 
	 * @param value the fromValue
	 */
	public void setFromValue(final int value)
	{
		setFromValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.fromValueInWords</code> attribute.
	 * @return the fromValueInWords
	 */
	public String getFromValueInWords(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FROMVALUEINWORDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.fromValueInWords</code> attribute.
	 * @return the fromValueInWords
	 */
	public String getFromValueInWords()
	{
		return getFromValueInWords( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.fromValueInWords</code> attribute. 
	 * @param value the fromValueInWords
	 */
	public void setFromValueInWords(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FROMVALUEINWORDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.fromValueInWords</code> attribute. 
	 * @param value the fromValueInWords
	 */
	public void setFromValueInWords(final String value)
	{
		setFromValueInWords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.slabType</code> attribute.
	 * @return the slabType
	 */
	public EnumerationValue getSlabType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SLABTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.slabType</code> attribute.
	 * @return the slabType
	 */
	public EnumerationValue getSlabType()
	{
		return getSlabType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.slabType</code> attribute. 
	 * @param value the slabType
	 */
	public void setSlabType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SLABTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.slabType</code> attribute. 
	 * @param value the slabType
	 */
	public void setSlabType(final EnumerationValue value)
	{
		setSlabType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.toValues</code> attribute.
	 * @return the toValues
	 */
	public Integer getToValues(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOVALUES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.toValues</code> attribute.
	 * @return the toValues
	 */
	public Integer getToValues()
	{
		return getToValues( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.toValues</code> attribute. 
	 * @return the toValues
	 */
	public int getToValuesAsPrimitive(final SessionContext ctx)
	{
		Integer value = getToValues( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.toValues</code> attribute. 
	 * @return the toValues
	 */
	public int getToValuesAsPrimitive()
	{
		return getToValuesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.toValues</code> attribute. 
	 * @param value the toValues
	 */
	public void setToValues(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOVALUES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.toValues</code> attribute. 
	 * @param value the toValues
	 */
	public void setToValues(final Integer value)
	{
		setToValues( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.toValues</code> attribute. 
	 * @param value the toValues
	 */
	public void setToValues(final SessionContext ctx, final int value)
	{
		setToValues( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.toValues</code> attribute. 
	 * @param value the toValues
	 */
	public void setToValues(final int value)
	{
		setToValues( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.toValuesInWords</code> attribute.
	 * @return the toValuesInWords
	 */
	public String getToValuesInWords(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOVALUESINWORDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySlabType.toValuesInWords</code> attribute.
	 * @return the toValuesInWords
	 */
	public String getToValuesInWords()
	{
		return getToValuesInWords( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.toValuesInWords</code> attribute. 
	 * @param value the toValuesInWords
	 */
	public void setToValuesInWords(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOVALUESINWORDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySlabType.toValuesInWords</code> attribute. 
	 * @param value the toValuesInWords
	 */
	public void setToValuesInWords(final String value)
	{
		setToValuesInWords( getSession().getSessionContext(), value );
	}
	
}
