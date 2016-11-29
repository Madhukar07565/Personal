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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.Retention Retention}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRetention extends AbstractOfferValue
{
	/** Qualifier of the <code>Retention.retensionValue</code> attribute **/
	public static final String RETENSIONVALUE = "retensionValue";
	/** Qualifier of the <code>Retention.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractOfferValue.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(RETENSIONVALUE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Retention.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Retention.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Retention.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Retention.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Retention.retensionValue</code> attribute.
	 * @return the retensionValue
	 */
	public Double getRetensionValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, RETENSIONVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Retention.retensionValue</code> attribute.
	 * @return the retensionValue
	 */
	public Double getRetensionValue()
	{
		return getRetensionValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Retention.retensionValue</code> attribute. 
	 * @return the retensionValue
	 */
	public double getRetensionValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getRetensionValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Retention.retensionValue</code> attribute. 
	 * @return the retensionValue
	 */
	public double getRetensionValueAsPrimitive()
	{
		return getRetensionValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Retention.retensionValue</code> attribute. 
	 * @param value the retensionValue
	 */
	public void setRetensionValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, RETENSIONVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Retention.retensionValue</code> attribute. 
	 * @param value the retensionValue
	 */
	public void setRetensionValue(final Double value)
	{
		setRetensionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Retention.retensionValue</code> attribute. 
	 * @param value the retensionValue
	 */
	public void setRetensionValue(final SessionContext ctx, final double value)
	{
		setRetensionValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Retention.retensionValue</code> attribute. 
	 * @param value the retensionValue
	 */
	public void setRetensionValue(final double value)
	{
		setRetensionValue( getSession().getSessionContext(), value );
	}
	
}
