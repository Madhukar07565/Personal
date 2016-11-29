/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.core.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.core.jalo.Barter Barter}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBarter extends GenericItem
{
	/** Qualifier of the <code>Barter.barterAmount</code> attribute **/
	public static final String BARTERAMOUNT = "barterAmount";
	/** Qualifier of the <code>Barter.minimumProductValue</code> attribute **/
	public static final String MINIMUMPRODUCTVALUE = "minimumProductValue";
	/** Qualifier of the <code>Barter.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>Barter.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>Barter.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BARTERAMOUNT, AttributeMode.INITIAL);
		tmp.put(MINIMUMPRODUCTVALUE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Barter.barterAmount</code> attribute.
	 * @return the barterAmount - BarterAmount
	 */
	public BigDecimal getBarterAmount(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, BARTERAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Barter.barterAmount</code> attribute.
	 * @return the barterAmount - BarterAmount
	 */
	public BigDecimal getBarterAmount()
	{
		return getBarterAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Barter.barterAmount</code> attribute. 
	 * @param value the barterAmount - BarterAmount
	 */
	public void setBarterAmount(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, BARTERAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Barter.barterAmount</code> attribute. 
	 * @param value the barterAmount - BarterAmount
	 */
	public void setBarterAmount(final BigDecimal value)
	{
		setBarterAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Barter.currency</code> attribute.
	 * @return the currency - Minimum ProductValue
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Barter.currency</code> attribute.
	 * @return the currency - Minimum ProductValue
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Barter.currency</code> attribute. 
	 * @param value the currency - Minimum ProductValue
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Barter.currency</code> attribute. 
	 * @param value the currency - Minimum ProductValue
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Barter.minimumProductValue</code> attribute.
	 * @return the minimumProductValue - Minimum ProductValue
	 */
	public BigDecimal getMinimumProductValue(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, MINIMUMPRODUCTVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Barter.minimumProductValue</code> attribute.
	 * @return the minimumProductValue - Minimum ProductValue
	 */
	public BigDecimal getMinimumProductValue()
	{
		return getMinimumProductValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Barter.minimumProductValue</code> attribute. 
	 * @param value the minimumProductValue - Minimum ProductValue
	 */
	public void setMinimumProductValue(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, MINIMUMPRODUCTVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Barter.minimumProductValue</code> attribute. 
	 * @param value the minimumProductValue - Minimum ProductValue
	 */
	public void setMinimumProductValue(final BigDecimal value)
	{
		setMinimumProductValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Barter.validFrom</code> attribute.
	 * @return the validFrom - Minimum ProductValue
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Barter.validFrom</code> attribute.
	 * @return the validFrom - Minimum ProductValue
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Barter.validFrom</code> attribute. 
	 * @param value the validFrom - Minimum ProductValue
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Barter.validFrom</code> attribute. 
	 * @param value the validFrom - Minimum ProductValue
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Barter.validTo</code> attribute.
	 * @return the validTo - Minimum ProductValue
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Barter.validTo</code> attribute.
	 * @return the validTo - Minimum ProductValue
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Barter.validTo</code> attribute. 
	 * @param value the validTo - Minimum ProductValue
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Barter.validTo</code> attribute. 
	 * @param value the validTo - Minimum ProductValue
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
