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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.CreditCardLastThreeDigitType CreditCardLastThreeDigitType}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCreditCardLastThreeDigitType extends AbstractOfferValue
{
	/** Qualifier of the <code>CreditCardLastThreeDigitType.lastThreeDigit</code> attribute **/
	public static final String LASTTHREEDIGIT = "lastThreeDigit";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractOfferValue.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LASTTHREEDIGIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardLastThreeDigitType.lastThreeDigit</code> attribute.
	 * @return the lastThreeDigit
	 */
	public Double getLastThreeDigit(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, LASTTHREEDIGIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardLastThreeDigitType.lastThreeDigit</code> attribute.
	 * @return the lastThreeDigit
	 */
	public Double getLastThreeDigit()
	{
		return getLastThreeDigit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardLastThreeDigitType.lastThreeDigit</code> attribute. 
	 * @return the lastThreeDigit
	 */
	public double getLastThreeDigitAsPrimitive(final SessionContext ctx)
	{
		Double value = getLastThreeDigit( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardLastThreeDigitType.lastThreeDigit</code> attribute. 
	 * @return the lastThreeDigit
	 */
	public double getLastThreeDigitAsPrimitive()
	{
		return getLastThreeDigitAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardLastThreeDigitType.lastThreeDigit</code> attribute. 
	 * @param value the lastThreeDigit
	 */
	public void setLastThreeDigit(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, LASTTHREEDIGIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardLastThreeDigitType.lastThreeDigit</code> attribute. 
	 * @param value the lastThreeDigit
	 */
	public void setLastThreeDigit(final Double value)
	{
		setLastThreeDigit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardLastThreeDigitType.lastThreeDigit</code> attribute. 
	 * @param value the lastThreeDigit
	 */
	public void setLastThreeDigit(final SessionContext ctx, final double value)
	{
		setLastThreeDigit( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardLastThreeDigitType.lastThreeDigit</code> attribute. 
	 * @param value the lastThreeDigit
	 */
	public void setLastThreeDigit(final double value)
	{
		setLastThreeDigit( getSession().getSessionContext(), value );
	}
	
}
