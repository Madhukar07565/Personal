/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.client.credit.jalo.ClientCreditDepositLimit;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.jalo.SecuredCreditDepositLimit SecuredCreditDepositLimit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSecuredCreditDepositLimit extends ClientCreditDepositLimit
{
	/** Qualifier of the <code>SecuredCreditDepositLimit.modeOfSecurity</code> attribute **/
	public static final String MODEOFSECURITY = "modeOfSecurity";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ClientCreditDepositLimit.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MODEOFSECURITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredCreditDepositLimit.modeOfSecurity</code> attribute.
	 * @return the modeOfSecurity
	 */
	public EnumerationValue getModeOfSecurity(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFSECURITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SecuredCreditDepositLimit.modeOfSecurity</code> attribute.
	 * @return the modeOfSecurity
	 */
	public EnumerationValue getModeOfSecurity()
	{
		return getModeOfSecurity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredCreditDepositLimit.modeOfSecurity</code> attribute. 
	 * @param value the modeOfSecurity
	 */
	public void setModeOfSecurity(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFSECURITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SecuredCreditDepositLimit.modeOfSecurity</code> attribute. 
	 * @param value the modeOfSecurity
	 */
	public void setModeOfSecurity(final EnumerationValue value)
	{
		setModeOfSecurity( getSession().getSessionContext(), value );
	}
	
}
