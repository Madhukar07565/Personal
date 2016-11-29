/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.company.commercials.core.jalo.AbstractLookToBookCompanyCommercial;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.LookToBookRateCompanyCommercial LookToBookRateCompanyCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedLookToBookRateCompanyCommercial extends AbstractLookToBookCompanyCommercial
{
	/** Qualifier of the <code>LookToBookRateCompanyCommercial.lookCurrency</code> attribute **/
	public static final String LOOKCURRENCY = "lookCurrency";
	/** Qualifier of the <code>LookToBookRateCompanyCommercial.lookAmount</code> attribute **/
	public static final String LOOKAMOUNT = "lookAmount";
	/** Qualifier of the <code>LookToBookRateCompanyCommercial.bookCurrency</code> attribute **/
	public static final String BOOKCURRENCY = "bookCurrency";
	/** Qualifier of the <code>LookToBookRateCompanyCommercial.bookAmount</code> attribute **/
	public static final String BOOKAMOUNT = "bookAmount";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractLookToBookCompanyCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LOOKCURRENCY, AttributeMode.INITIAL);
		tmp.put(LOOKAMOUNT, AttributeMode.INITIAL);
		tmp.put(BOOKCURRENCY, AttributeMode.INITIAL);
		tmp.put(BOOKAMOUNT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRateCompanyCommercial.bookAmount</code> attribute.
	 * @return the bookAmount
	 */
	public BigDecimal getBookAmount(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, BOOKAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRateCompanyCommercial.bookAmount</code> attribute.
	 * @return the bookAmount
	 */
	public BigDecimal getBookAmount()
	{
		return getBookAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRateCompanyCommercial.bookAmount</code> attribute. 
	 * @param value the bookAmount
	 */
	public void setBookAmount(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, BOOKAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRateCompanyCommercial.bookAmount</code> attribute. 
	 * @param value the bookAmount
	 */
	public void setBookAmount(final BigDecimal value)
	{
		setBookAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRateCompanyCommercial.bookCurrency</code> attribute.
	 * @return the bookCurrency
	 */
	public Currency getBookCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, BOOKCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRateCompanyCommercial.bookCurrency</code> attribute.
	 * @return the bookCurrency
	 */
	public Currency getBookCurrency()
	{
		return getBookCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRateCompanyCommercial.bookCurrency</code> attribute. 
	 * @param value the bookCurrency
	 */
	public void setBookCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, BOOKCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRateCompanyCommercial.bookCurrency</code> attribute. 
	 * @param value the bookCurrency
	 */
	public void setBookCurrency(final Currency value)
	{
		setBookCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRateCompanyCommercial.lookAmount</code> attribute.
	 * @return the lookAmount
	 */
	public BigDecimal getLookAmount(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, LOOKAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRateCompanyCommercial.lookAmount</code> attribute.
	 * @return the lookAmount
	 */
	public BigDecimal getLookAmount()
	{
		return getLookAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRateCompanyCommercial.lookAmount</code> attribute. 
	 * @param value the lookAmount
	 */
	public void setLookAmount(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, LOOKAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRateCompanyCommercial.lookAmount</code> attribute. 
	 * @param value the lookAmount
	 */
	public void setLookAmount(final BigDecimal value)
	{
		setLookAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRateCompanyCommercial.lookCurrency</code> attribute.
	 * @return the lookCurrency
	 */
	public Currency getLookCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, LOOKCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRateCompanyCommercial.lookCurrency</code> attribute.
	 * @return the lookCurrency
	 */
	public Currency getLookCurrency()
	{
		return getLookCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRateCompanyCommercial.lookCurrency</code> attribute. 
	 * @param value the lookCurrency
	 */
	public void setLookCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, LOOKCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRateCompanyCommercial.lookCurrency</code> attribute. 
	 * @param value the lookCurrency
	 */
	public void setLookCurrency(final Currency value)
	{
		setLookCurrency( getSession().getSessionContext(), value );
	}
	
}
