/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.payment.PaymentInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.core.jalo.CashPaymentInfo CashPaymentInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCashPaymentInfo extends PaymentInfo
{
	/** Qualifier of the <code>CashPaymentInfo.denomination</code> attribute **/
	public static final String DENOMINATION = "denomination";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(PaymentInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DENOMINATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CashPaymentInfo.denomination</code> attribute.
	 * @return the denomination
	 */
	public Integer getDenomination(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DENOMINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CashPaymentInfo.denomination</code> attribute.
	 * @return the denomination
	 */
	public Integer getDenomination()
	{
		return getDenomination( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CashPaymentInfo.denomination</code> attribute. 
	 * @return the denomination
	 */
	public int getDenominationAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDenomination( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CashPaymentInfo.denomination</code> attribute. 
	 * @return the denomination
	 */
	public int getDenominationAsPrimitive()
	{
		return getDenominationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CashPaymentInfo.denomination</code> attribute. 
	 * @param value the denomination
	 */
	public void setDenomination(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DENOMINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CashPaymentInfo.denomination</code> attribute. 
	 * @param value the denomination
	 */
	public void setDenomination(final Integer value)
	{
		setDenomination( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CashPaymentInfo.denomination</code> attribute. 
	 * @param value the denomination
	 */
	public void setDenomination(final SessionContext ctx, final int value)
	{
		setDenomination( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CashPaymentInfo.denomination</code> attribute. 
	 * @param value the denomination
	 */
	public void setDenomination(final int value)
	{
		setDenomination( getSession().getSessionContext(), value );
	}
	
}
